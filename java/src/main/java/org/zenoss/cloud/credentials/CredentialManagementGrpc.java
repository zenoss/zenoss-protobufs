package org.zenoss.cloud.credentials;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: zenoss/cloud/credentials.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CredentialManagementGrpc {

  private CredentialManagementGrpc() {}

  public static final String SERVICE_NAME = "zenoss.cloud.credentials.CredentialManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.credentials.GetCredentialRequest,
      org.zenoss.cloud.credentials.GetCredentialResponse> getGetCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCredential",
      requestType = org.zenoss.cloud.credentials.GetCredentialRequest.class,
      responseType = org.zenoss.cloud.credentials.GetCredentialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.credentials.GetCredentialRequest,
      org.zenoss.cloud.credentials.GetCredentialResponse> getGetCredentialMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.credentials.GetCredentialRequest, org.zenoss.cloud.credentials.GetCredentialResponse> getGetCredentialMethod;
    if ((getGetCredentialMethod = CredentialManagementGrpc.getGetCredentialMethod) == null) {
      synchronized (CredentialManagementGrpc.class) {
        if ((getGetCredentialMethod = CredentialManagementGrpc.getGetCredentialMethod) == null) {
          CredentialManagementGrpc.getGetCredentialMethod = getGetCredentialMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.credentials.GetCredentialRequest, org.zenoss.cloud.credentials.GetCredentialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.credentials.GetCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.credentials.GetCredentialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CredentialManagementMethodDescriptorSupplier("GetCredential"))
              .build();
        }
      }
    }
    return getGetCredentialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CredentialManagementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CredentialManagementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CredentialManagementStub>() {
        @java.lang.Override
        public CredentialManagementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CredentialManagementStub(channel, callOptions);
        }
      };
    return CredentialManagementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CredentialManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CredentialManagementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CredentialManagementBlockingStub>() {
        @java.lang.Override
        public CredentialManagementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CredentialManagementBlockingStub(channel, callOptions);
        }
      };
    return CredentialManagementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CredentialManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CredentialManagementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CredentialManagementFutureStub>() {
        @java.lang.Override
        public CredentialManagementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CredentialManagementFutureStub(channel, callOptions);
        }
      };
    return CredentialManagementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CredentialManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCredential(org.zenoss.cloud.credentials.GetCredentialRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.credentials.GetCredentialResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCredentialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCredentialMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.credentials.GetCredentialRequest,
                org.zenoss.cloud.credentials.GetCredentialResponse>(
                  this, METHODID_GET_CREDENTIAL)))
          .build();
    }
  }

  /**
   */
  public static final class CredentialManagementStub extends io.grpc.stub.AbstractAsyncStub<CredentialManagementStub> {
    private CredentialManagementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialManagementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CredentialManagementStub(channel, callOptions);
    }

    /**
     */
    public void getCredential(org.zenoss.cloud.credentials.GetCredentialRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.credentials.GetCredentialResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCredentialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CredentialManagementBlockingStub extends io.grpc.stub.AbstractBlockingStub<CredentialManagementBlockingStub> {
    private CredentialManagementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialManagementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CredentialManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zenoss.cloud.credentials.GetCredentialResponse getCredential(org.zenoss.cloud.credentials.GetCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCredentialMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CredentialManagementFutureStub extends io.grpc.stub.AbstractFutureStub<CredentialManagementFutureStub> {
    private CredentialManagementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialManagementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CredentialManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.credentials.GetCredentialResponse> getCredential(
        org.zenoss.cloud.credentials.GetCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCredentialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CREDENTIAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CredentialManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CredentialManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CREDENTIAL:
          serviceImpl.getCredential((org.zenoss.cloud.credentials.GetCredentialRequest) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.credentials.GetCredentialResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CredentialManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CredentialManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zenoss.cloud.credentials.Credentials.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CredentialManagement");
    }
  }

  private static final class CredentialManagementFileDescriptorSupplier
      extends CredentialManagementBaseDescriptorSupplier {
    CredentialManagementFileDescriptorSupplier() {}
  }

  private static final class CredentialManagementMethodDescriptorSupplier
      extends CredentialManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CredentialManagementMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CredentialManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CredentialManagementFileDescriptorSupplier())
              .addMethod(getGetCredentialMethod())
              .build();
        }
      }
    }
    return result;
  }
}
