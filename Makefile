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

BUF 				 := $(shell command -v buf 2> /dev/null)
GO                   := $(shell command -v go 2> /dev/null)
GOMOCKERY 			 := $(shell which mockery)
GODIR                := go
PROTODIR             := protobufs
DESCRIPTORDIR        := descriptors
PACKAGE              := github.com/zenoss/zenoss-protobufs
JAVADIR              := java
JAVA_SRC_DIR         := $(JAVADIR)/src/main/java
PYTHONDIR            := python
PROTOFILES           := $(shell find protobufs -name "*.proto")
PYTHON_FILES         := $(subst $(PROTODIR), $(PYTHONDIR),$(subst .proto,_pb2.py,$(PROTOFILES)))
LOCAL_USER_ID        := $(shell id -u)
CONTAINER_DIR        := /tmp/working
ZENKIT_BUILD_VERSION := 1.14.3
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
MVN                  = docker run --rm \
                            --network $(DOCKER_NETWORK) \
                            -v $(ROOTDIR)/$(JAVADIR):/usr/src/app:rw \
                            -v $(LOCAL_MAVEN_REPO):/home/user/.m2:rw \
                            -v $(ROOTDIR)/$(PROTODIR):/usr/src/protobufs/:ro \
                            -e LOCAL_USER_ID=$(LOCAL_USER_ID) \
                            -w /usr/src/app \
                            $(DEPLOY_BUILD_IMAGE) \
                            mvn

PROJECTS := $(subst .env,,$(notdir $(wildcard $(PROJECTSDIR)/*.env)))

default: clean all_containerized

.PHONY: all
all: buf mocks tidy vendor java

.PHONY: all_containerized
all_containerized: package
	@mkdir -p $(ROOTDIR)/go
	$(DOCKER_CMD) make buf mocks tidy vendor
	make java

.PHONY: buf
buf: format breaking
	$(BUF) generate $(PROTODIR) --template $(PROTODIR)/buf.gen.yaml

.PHONY: images
images:
	[ -d $(DESCRIPTORDIR) ] || mkdir -p $(DESCRIPTORDIR)
	$(BUF) build $(PROTODIR) -o $(DESCRIPTORDIR)/image.json

.PHONY: breaking
breaking:
	[ -f $(DESCRIPTORDIR)/image.json ] && $(BUF) breaking $(PROTODIR) --against $(DESCRIPTORDIR)/image.json

.PHONY: format
format:
	$(BUF) format $(PROTODIR) -w

$(GODIR):
	[ -d $(GODIR) ] || mkdir -p $(GODIR)

$(JAVA_SRC_DIR):
	[ -d $(JAVA_SRC_DIR) ] || mkdir -p $(JAVA_SRC_DIR)

$(PYTHONDIR):
	[ -d $(PYTHONDIR) ] || mkdir -p $(PYTHONDIR)

.PHONY: vendor
vendor:
	$(GO) mod vendor

.PHONY: tidy
tidy:
	$(GO) mod tidy

.PHONY: mocks
mocks: $(GODIR)
	$(GOMOCKERY) --dir $(GODIR) --all --inpackage --with-expecter

.PHONY: clean
clean:
	rm -rf $(GODIR)/* $(JAVA_SRC_DIR) $(PYTHON_FILES) vendor
	find . -type f -name *grpc.py -exec rm {} \;
	-$(MVN) -e clean

.PHONY: java
package:
	$(MVN) -e clean package

# install will build the jar and install it in the developer's local maven repo (e.g. $HOME/.m2/repository)
.PHONY: install
install:
	$(MVN) -e install

.PHONY: set-relversion
set-relversion: images
	$(MVN) versions:set -DnewVersion=$(NEW_VERSION) -DgenerateBackupPoms=false
	@sed -i 's/version=".*"/version="$(NEW_VERSION)"/g' python/setup.py

.PHONY: test
test:
	go test ./... -test.v

