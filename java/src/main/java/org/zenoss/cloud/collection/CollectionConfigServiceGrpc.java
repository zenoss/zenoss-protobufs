package org.zenoss.cloud.collection;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CollectionConfigService is the gRPC &amp; HTTP service responsible for managing
 * collection configurations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: zenoss/cloud/collection_cfg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CollectionConfigServiceGrpc {

  private CollectionConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "zenoss.cloud.collection_cfg.CollectionConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.collection.WaitForProbeConfigResponse,
      org.zenoss.cloud.collection.WaitForProbeConfigRequest> getWaitForProbeConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitForProbeConfig",
      requestType = org.zenoss.cloud.collection.WaitForProbeConfigResponse.class,
      responseType = org.zenoss.cloud.collection.WaitForProbeConfigRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.collection.WaitForProbeConfigResponse,
      org.zenoss.cloud.collection.WaitForProbeConfigRequest> getWaitForProbeConfigMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.collection.WaitForProbeConfigResponse, org.zenoss.cloud.collection.WaitForProbeConfigRequest> getWaitForProbeConfigMethod;
    if ((getWaitForProbeConfigMethod = CollectionConfigServiceGrpc.getWaitForProbeConfigMethod) == null) {
      synchronized (CollectionConfigServiceGrpc.class) {
        if ((getWaitForProbeConfigMethod = CollectionConfigServiceGrpc.getWaitForProbeConfigMethod) == null) {
          CollectionConfigServiceGrpc.getWaitForProbeConfigMethod = getWaitForProbeConfigMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.collection.WaitForProbeConfigResponse, org.zenoss.cloud.collection.WaitForProbeConfigRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitForProbeConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.collection.WaitForProbeConfigResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.collection.WaitForProbeConfigRequest.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionConfigServiceMethodDescriptorSupplier("WaitForProbeConfig"))
              .build();
        }
      }
    }
    return getWaitForProbeConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.collection.GetConfigStreamRequest,
      org.zenoss.cloud.collection.GetConfigStreamResponse> getGetConfigStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfigStream",
      requestType = org.zenoss.cloud.collection.GetConfigStreamRequest.class,
      responseType = org.zenoss.cloud.collection.GetConfigStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.collection.GetConfigStreamRequest,
      org.zenoss.cloud.collection.GetConfigStreamResponse> getGetConfigStreamMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.collection.GetConfigStreamRequest, org.zenoss.cloud.collection.GetConfigStreamResponse> getGetConfigStreamMethod;
    if ((getGetConfigStreamMethod = CollectionConfigServiceGrpc.getGetConfigStreamMethod) == null) {
      synchronized (CollectionConfigServiceGrpc.class) {
        if ((getGetConfigStreamMethod = CollectionConfigServiceGrpc.getGetConfigStreamMethod) == null) {
          CollectionConfigServiceGrpc.getGetConfigStreamMethod = getGetConfigStreamMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.collection.GetConfigStreamRequest, org.zenoss.cloud.collection.GetConfigStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConfigStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.collection.GetConfigStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.collection.GetConfigStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CollectionConfigServiceMethodDescriptorSupplier("GetConfigStream"))
              .build();
        }
      }
    }
    return getGetConfigStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CollectionConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectionConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectionConfigServiceStub>() {
        @java.lang.Override
        public CollectionConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectionConfigServiceStub(channel, callOptions);
        }
      };
    return CollectionConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CollectionConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectionConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectionConfigServiceBlockingStub>() {
        @java.lang.Override
        public CollectionConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectionConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return CollectionConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CollectionConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectionConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectionConfigServiceFutureStub>() {
        @java.lang.Override
        public CollectionConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectionConfigServiceFutureStub(channel, callOptions);
        }
      };
    return CollectionConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CollectionConfigService is the gRPC &amp; HTTP service responsible for managing
   * collection configurations.
   * </pre>
   */
  public static abstract class CollectionConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.WaitForProbeConfigResponse> waitForProbeConfig(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.WaitForProbeConfigRequest> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWaitForProbeConfigMethod(), responseObserver);
    }

    /**
     */
    public void getConfigStream(org.zenoss.cloud.collection.GetConfigStreamRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.GetConfigStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConfigStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWaitForProbeConfigMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.zenoss.cloud.collection.WaitForProbeConfigResponse,
                org.zenoss.cloud.collection.WaitForProbeConfigRequest>(
                  this, METHODID_WAIT_FOR_PROBE_CONFIG)))
          .addMethod(
            getGetConfigStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.zenoss.cloud.collection.GetConfigStreamRequest,
                org.zenoss.cloud.collection.GetConfigStreamResponse>(
                  this, METHODID_GET_CONFIG_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * CollectionConfigService is the gRPC &amp; HTTP service responsible for managing
   * collection configurations.
   * </pre>
   */
  public static final class CollectionConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<CollectionConfigServiceStub> {
    private CollectionConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectionConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectionConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.WaitForProbeConfigResponse> waitForProbeConfig(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.WaitForProbeConfigRequest> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getWaitForProbeConfigMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getConfigStream(org.zenoss.cloud.collection.GetConfigStreamRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.GetConfigStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetConfigStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * CollectionConfigService is the gRPC &amp; HTTP service responsible for managing
   * collection configurations.
   * </pre>
   */
  public static final class CollectionConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CollectionConfigServiceBlockingStub> {
    private CollectionConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectionConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectionConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.zenoss.cloud.collection.GetConfigStreamResponse> getConfigStream(
        org.zenoss.cloud.collection.GetConfigStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetConfigStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * CollectionConfigService is the gRPC &amp; HTTP service responsible for managing
   * collection configurations.
   * </pre>
   */
  public static final class CollectionConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CollectionConfigServiceFutureStub> {
    private CollectionConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectionConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectionConfigServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_CONFIG_STREAM = 0;
  private static final int METHODID_WAIT_FOR_PROBE_CONFIG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CollectionConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CollectionConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONFIG_STREAM:
          serviceImpl.getConfigStream((org.zenoss.cloud.collection.GetConfigStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.GetConfigStreamResponse>) responseObserver);
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
        case METHODID_WAIT_FOR_PROBE_CONFIG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.waitForProbeConfig(
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.collection.WaitForProbeConfigRequest>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CollectionConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CollectionConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CollectionConfigService");
    }
  }

  private static final class CollectionConfigServiceFileDescriptorSupplier
      extends CollectionConfigServiceBaseDescriptorSupplier {
    CollectionConfigServiceFileDescriptorSupplier() {}
  }

  private static final class CollectionConfigServiceMethodDescriptorSupplier
      extends CollectionConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CollectionConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CollectionConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CollectionConfigServiceFileDescriptorSupplier())
              .addMethod(getWaitForProbeConfigMethod())
              .addMethod(getGetConfigStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
