SHELL                := /bin/bash
ROOTDIR              ?= $(CURDIR)
#
# When running a deploy build in Jenkin ROOTDIR is set to HOST_WORKSPACE, but
# the code is checked out to a "service" subdirectory, so in that case we need
# to adjust the value of ROOTDIR.
#
BASE_CURDIR          := $(shell basename $(CURDIR))
BASE_ROOTDIR         := $(shell basename $(ROOTDIR))
ifneq ($(BASE_CURDIR),$(BASE_ROOTDIR))
    ROOTDIR          := $(ROOTDIR)/$(BASE_CURDIR)
endif

#
# If we're executing in a Jenkins context, use a workspace-local maven repo,
# otherwise use the developer's home directory
#
ifneq  (,$(findstring /var/lib/docker,$(ROOTDIR)))
LOCAL_MAVEN_REPO     = $(ROOTDIR)/.m2
else
LOCAL_MAVEN_REPO     = $(HOME)/.m2
endif

PROTODIR             := protobufs
GO                   := $(shell command -v go 2> /dev/null)
GODIR                := go
GO_SRC_DIR           ?= $(GOPATH)/src
PACKAGE              := github.com/zenoss/zenoss-protobufs
JAVADIR              := java
JAVA_SRC_DIR         := $(JAVADIR)/src/main/java
PYTHONDIR            := python
PROTOFILES           := $(shell find protobufs -name "*.proto")
GO_FILES             := $(subst $(PROTODIR),$(GODIR),$(subst .proto,.pb.go,$(PROTOFILES)))
GO_GW_FILES          := $(subst $(PROTODIR),$(GODIR),$(subst .proto,.pb.gw.go,$(PROTOFILES)))
PYTHON_FILES         := $(subst $(PROTODIR), $(PYTHONDIR),$(subst .proto,_pb2.py,$(PROTOFILES)))
PROTOC               := /usr/bin/protoc
ifneq ($(PROTOC), $(shell which protoc))
    PROTOC           := $(shell which protoc)
endif
PROTOC_PARAMS        := --proto_path=${GOPATH}/googleapis
LOCAL_USER_ID        := $(shell id -u)
CONTAINER_DIR        := /tmp/working
ZENKIT_BUILD_VERSION := 1.10.0
BUILD_IMG            := zenoss/zenkit-build:$(ZENKIT_BUILD_VERSION)
DOCKER_NETWORK       = host
DOCKER_PARAMS        := --rm -v $(ROOTDIR):$(CONTAINER_DIR):rw \
	                    -v $(ROOTDIR):/go/src/$(PACKAGE):rw \
                        -e LOCAL_USER_ID=$(LOCAL_USER_ID) \
                        --network $(DOCKER_NETWORK) \
                        --security-opt seccomp=unconfined \
                        -w /go/src/$(PACKAGE)

DOCKER_CMD           := docker run -t $(DOCKER_PARAMS) $(BUILD_IMG)

DEPLOY_BUILD_IMAGE   = zenoss/zing-java-build-glibc:1.0
MVN_SETTINGS         ?= /etc/settings.xml
MVN_OPTS             ?= -s $(MVN_SETTINGS)
MVN                  = docker run --rm \
                            --network $(DOCKER_NETWORK) \
                            -v $(ROOTDIR)/$(JAVADIR):/usr/src/app:rw \
                            -v $(LOCAL_MAVEN_REPO):/home/user/.m2:rw \
                            -v $(ROOTDIR)/$(PROTODIR):/usr/src/protobufs/:ro \
                            -e LOCAL_USER_ID=$(LOCAL_USER_ID) \
                            -w /usr/src/app \
                            $(DEPLOY_BUILD_IMAGE) \
                            mvn $(MVN_OPTS)

GOMOCKERY = $(GOPATH)/bin/mockery
GODEP = $(GOPATH)/bin/dep

PROJECTS := $(subst .env,,$(notdir $(wildcard $(PROJECTSDIR)/*.env)))

default: clean all_containerized

.PHONY: all
all: $(GO_FILES) $(GO_GW_FILES) mocks pybuild

.PHONY: all_containerized
all_containerized: package
	@mkdir -p $(ROOTDIR)/go
	$(DOCKER_CMD) make all


$(GODIR):
	echo "BLAM"
	mkdir $(GODIR)

$(JAVA_SRC_DIR):
	@mkdir -p $(JAVA_SRC_DIR)

$(PYTHONDIR):
	@mkdir $(PYTHONDIR)
	touch __init__.py

$(GODIR)/%.pb.go: $(PROTOFILES) $(GODIR)
	$(PROTOC) $(PROTOC_PARAMS) \
		-I $(PROTODIR) \
		$(PROTODIR)/zenoss/cloud/$(*F).proto \
		--go_out=plugins=grpc:$(GO_SRC_DIR)

$(GODIR)/%.pb.gw.go: $(PROTOFILES) $(GODIR)
	$(PROTOC) $(PROTOC_PARAMS) \
		-I $(PROTODIR) \
		$(PROTODIR)/zenoss/cloud/$(*F).proto \
		--grpc-gateway_out=logtostderr=true:$(GO_SRC_DIR)

.PHONY: vendor
vendor: $(GO_FILES) $(GO_GW_FILES)
	GO111MODULE=on $(GO) mod vendor

.PHONY: tidy
tidy: $(GOFILES)
	$(GO) mod tidy

.PHONY: mocks
mocks: $(GO_FILES) $(GO_GW_FILES) $(GODIR) tidy vendor
	@$(GOMOCKERY) -all -inpkg -dir $(GODIR)

.PHONY: $(PYTHONDIR)/%_pb2.py
$(PYTHONDIR)/%_pb2.py: $(PROTOFILES) $(PYTHONDIR)
	python -m grpc_tools.protoc $(PROTOC_PARAMS) \
		-I $(PROTODIR) \
		$(PROTODIR)/$*.proto \
		--python_out=$(PYTHONDIR) \
		--grpc_python_out=$(PYTHONDIR); \

pybuild: $(PYTHON_FILES)
	find python/zenoss -type d -exec touch {}/__init__.py \; \

.PHONY: clean
clean:
	rm -rf $(GODIR)/* $(DESCRIPTORDIR) $(JAVA_SRC_DIR) $(PYTHON_FILES) vendor
	find . -type f -name *grpc.py -exec rm {} \;
	-$(MVN) -e clean

.PHONY: package
package:
	$(MVN) -e clean package

# install will build the jar and install it in the developer's local maven repo (e.g. $HOME/.m2/repository)
.PHONY: install
install:
	$(MVN) -e install

.PHONY: set-relversion
set-relversion:
	$(MVN) versions:set -DnewVersion=$(NEW_VERSION) -DgenerateBackupPoms=false
	@sed -i 's/version=".*"/version="$(NEW_VERSION)"/g' python/setup.py

.PHONY: test
test:
	go test ./... -test.v

