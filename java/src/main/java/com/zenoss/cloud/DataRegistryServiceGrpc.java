package com.zenoss.cloud;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: zenoss/cloud/data_registry.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataRegistryServiceGrpc {

  private DataRegistryServiceGrpc() {}

  public static final String SERVICE_NAME = "zenoss.cloud.DataRegistryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.RegisterMetricRequest,
      com.zenoss.cloud.RegisterMetricResponse> getCreateOrUpdateMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateMetric",
      requestType = com.zenoss.cloud.RegisterMetricRequest.class,
      responseType = com.zenoss.cloud.RegisterMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.RegisterMetricRequest,
      com.zenoss.cloud.RegisterMetricResponse> getCreateOrUpdateMetricMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.RegisterMetricRequest, com.zenoss.cloud.RegisterMetricResponse> getCreateOrUpdateMetricMethod;
    if ((getCreateOrUpdateMetricMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getCreateOrUpdateMetricMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricMethod) == null) {
          DataRegistryServiceGrpc.getCreateOrUpdateMetricMethod = getCreateOrUpdateMetricMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.RegisterMetricRequest, com.zenoss.cloud.RegisterMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrUpdateMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.RegisterMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.RegisterMetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("CreateOrUpdateMetric"))
              .build();
        }
      }
    }
    return getCreateOrUpdateMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.RegisterMetricRequest,
      com.zenoss.cloud.RegisterMetricsResponse> getCreateOrUpdateMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateMetrics",
      requestType = com.zenoss.cloud.RegisterMetricRequest.class,
      responseType = com.zenoss.cloud.RegisterMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.RegisterMetricRequest,
      com.zenoss.cloud.RegisterMetricsResponse> getCreateOrUpdateMetricsMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.RegisterMetricRequest, com.zenoss.cloud.RegisterMetricsResponse> getCreateOrUpdateMetricsMethod;
    if ((getCreateOrUpdateMetricsMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricsMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getCreateOrUpdateMetricsMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricsMethod) == null) {
          DataRegistryServiceGrpc.getCreateOrUpdateMetricsMethod = getCreateOrUpdateMetricsMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.RegisterMetricRequest, com.zenoss.cloud.RegisterMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrUpdateMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.RegisterMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.RegisterMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("CreateOrUpdateMetrics"))
              .build();
        }
      }
    }
    return getCreateOrUpdateMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.UpdateMetricRequest,
      com.zenoss.cloud.RegisterMetricResponse> getUpdateMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMetric",
      requestType = com.zenoss.cloud.UpdateMetricRequest.class,
      responseType = com.zenoss.cloud.RegisterMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.UpdateMetricRequest,
      com.zenoss.cloud.RegisterMetricResponse> getUpdateMetricMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.UpdateMetricRequest, com.zenoss.cloud.RegisterMetricResponse> getUpdateMetricMethod;
    if ((getUpdateMetricMethod = DataRegistryServiceGrpc.getUpdateMetricMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getUpdateMetricMethod = DataRegistryServiceGrpc.getUpdateMetricMethod) == null) {
          DataRegistryServiceGrpc.getUpdateMetricMethod = getUpdateMetricMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.UpdateMetricRequest, com.zenoss.cloud.RegisterMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.UpdateMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.RegisterMetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("UpdateMetric"))
              .build();
        }
      }
    }
    return getUpdateMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.Definition,
      com.zenoss.cloud.DefinitionResponse> getRegisterDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterDefinition",
      requestType = com.zenoss.cloud.Definition.class,
      responseType = com.zenoss.cloud.DefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.Definition,
      com.zenoss.cloud.DefinitionResponse> getRegisterDefinitionMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.Definition, com.zenoss.cloud.DefinitionResponse> getRegisterDefinitionMethod;
    if ((getRegisterDefinitionMethod = DataRegistryServiceGrpc.getRegisterDefinitionMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getRegisterDefinitionMethod = DataRegistryServiceGrpc.getRegisterDefinitionMethod) == null) {
          DataRegistryServiceGrpc.getRegisterDefinitionMethod = getRegisterDefinitionMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.Definition, com.zenoss.cloud.DefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.Definition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.DefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("RegisterDefinition"))
              .build();
        }
      }
    }
    return getRegisterDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.DefinitionUpdate,
      com.zenoss.cloud.DefinitionResponse> getUpdateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefinition",
      requestType = com.zenoss.cloud.DefinitionUpdate.class,
      responseType = com.zenoss.cloud.DefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.DefinitionUpdate,
      com.zenoss.cloud.DefinitionResponse> getUpdateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.DefinitionUpdate, com.zenoss.cloud.DefinitionResponse> getUpdateDefinitionMethod;
    if ((getUpdateDefinitionMethod = DataRegistryServiceGrpc.getUpdateDefinitionMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getUpdateDefinitionMethod = DataRegistryServiceGrpc.getUpdateDefinitionMethod) == null) {
          DataRegistryServiceGrpc.getUpdateDefinitionMethod = getUpdateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.DefinitionUpdate, com.zenoss.cloud.DefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.DefinitionUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.DefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("UpdateDefinition"))
              .build();
        }
      }
    }
    return getUpdateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.GetMetricRequest,
      com.zenoss.cloud.GetMetricResponse> getGetMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetric",
      requestType = com.zenoss.cloud.GetMetricRequest.class,
      responseType = com.zenoss.cloud.GetMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.GetMetricRequest,
      com.zenoss.cloud.GetMetricResponse> getGetMetricMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.GetMetricRequest, com.zenoss.cloud.GetMetricResponse> getGetMetricMethod;
    if ((getGetMetricMethod = DataRegistryServiceGrpc.getGetMetricMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getGetMetricMethod = DataRegistryServiceGrpc.getGetMetricMethod) == null) {
          DataRegistryServiceGrpc.getGetMetricMethod = getGetMetricMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.GetMetricRequest, com.zenoss.cloud.GetMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.GetMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.GetMetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("GetMetric"))
              .build();
        }
      }
    }
    return getGetMetricMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataRegistryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataRegistryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataRegistryServiceStub>() {
        @java.lang.Override
        public DataRegistryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataRegistryServiceStub(channel, callOptions);
        }
      };
    return DataRegistryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataRegistryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataRegistryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataRegistryServiceBlockingStub>() {
        @java.lang.Override
        public DataRegistryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataRegistryServiceBlockingStub(channel, callOptions);
        }
      };
    return DataRegistryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataRegistryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataRegistryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataRegistryServiceFutureStub>() {
        @java.lang.Override
        public DataRegistryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataRegistryServiceFutureStub(channel, callOptions);
        }
      };
    return DataRegistryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DataRegistryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrUpdateMetric(com.zenoss.cloud.RegisterMetricRequest request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrUpdateMetricMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricRequest> createOrUpdateMetrics(
        io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateOrUpdateMetricsMethod(), responseObserver);
    }

    /**
     */
    public void updateMetric(com.zenoss.cloud.UpdateMetricRequest request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMetricMethod(), responseObserver);
    }

    /**
     */
    public void registerDefinition(com.zenoss.cloud.Definition request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.DefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterDefinitionMethod(), responseObserver);
    }

    /**
     */
    public void updateDefinition(com.zenoss.cloud.DefinitionUpdate request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.DefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefinitionMethod(), responseObserver);
    }

    /**
     */
    public void getMetric(com.zenoss.cloud.GetMetricRequest request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.GetMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrUpdateMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.RegisterMetricRequest,
                com.zenoss.cloud.RegisterMetricResponse>(
                  this, METHODID_CREATE_OR_UPDATE_METRIC)))
          .addMethod(
            getCreateOrUpdateMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.zenoss.cloud.RegisterMetricRequest,
                com.zenoss.cloud.RegisterMetricsResponse>(
                  this, METHODID_CREATE_OR_UPDATE_METRICS)))
          .addMethod(
            getUpdateMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.UpdateMetricRequest,
                com.zenoss.cloud.RegisterMetricResponse>(
                  this, METHODID_UPDATE_METRIC)))
          .addMethod(
            getRegisterDefinitionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.Definition,
                com.zenoss.cloud.DefinitionResponse>(
                  this, METHODID_REGISTER_DEFINITION)))
          .addMethod(
            getUpdateDefinitionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.DefinitionUpdate,
                com.zenoss.cloud.DefinitionResponse>(
                  this, METHODID_UPDATE_DEFINITION)))
          .addMethod(
            getGetMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.GetMetricRequest,
                com.zenoss.cloud.GetMetricResponse>(
                  this, METHODID_GET_METRIC)))
          .build();
    }
  }

  /**
   */
  public static final class DataRegistryServiceStub extends io.grpc.stub.AbstractAsyncStub<DataRegistryServiceStub> {
    private DataRegistryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataRegistryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataRegistryServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOrUpdateMetric(com.zenoss.cloud.RegisterMetricRequest request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrUpdateMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricRequest> createOrUpdateMetrics(
        io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateOrUpdateMetricsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void updateMetric(com.zenoss.cloud.UpdateMetricRequest request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerDefinition(com.zenoss.cloud.Definition request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.DefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDefinition(com.zenoss.cloud.DefinitionUpdate request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.DefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetric(com.zenoss.cloud.GetMetricRequest request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.GetMetricResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetricMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataRegistryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataRegistryServiceBlockingStub> {
    private DataRegistryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataRegistryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataRegistryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zenoss.cloud.RegisterMetricResponse createOrUpdateMetric(com.zenoss.cloud.RegisterMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrUpdateMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zenoss.cloud.RegisterMetricResponse updateMetric(com.zenoss.cloud.UpdateMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zenoss.cloud.DefinitionResponse registerDefinition(com.zenoss.cloud.Definition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zenoss.cloud.DefinitionResponse updateDefinition(com.zenoss.cloud.DefinitionUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zenoss.cloud.GetMetricResponse getMetric(com.zenoss.cloud.GetMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetricMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataRegistryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataRegistryServiceFutureStub> {
    private DataRegistryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataRegistryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataRegistryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.RegisterMetricResponse> createOrUpdateMetric(
        com.zenoss.cloud.RegisterMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrUpdateMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.RegisterMetricResponse> updateMetric(
        com.zenoss.cloud.UpdateMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.DefinitionResponse> registerDefinition(
        com.zenoss.cloud.Definition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.DefinitionResponse> updateDefinition(
        com.zenoss.cloud.DefinitionUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.GetMetricResponse> getMetric(
        com.zenoss.cloud.GetMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetricMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OR_UPDATE_METRIC = 0;
  private static final int METHODID_UPDATE_METRIC = 1;
  private static final int METHODID_REGISTER_DEFINITION = 2;
  private static final int METHODID_UPDATE_DEFINITION = 3;
  private static final int METHODID_GET_METRIC = 4;
  private static final int METHODID_CREATE_OR_UPDATE_METRICS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataRegistryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataRegistryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OR_UPDATE_METRIC:
          serviceImpl.createOrUpdateMetric((com.zenoss.cloud.RegisterMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricResponse>) responseObserver);
          break;
        case METHODID_UPDATE_METRIC:
          serviceImpl.updateMetric((com.zenoss.cloud.UpdateMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricResponse>) responseObserver);
          break;
        case METHODID_REGISTER_DEFINITION:
          serviceImpl.registerDefinition((com.zenoss.cloud.Definition) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.DefinitionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFINITION:
          serviceImpl.updateDefinition((com.zenoss.cloud.DefinitionUpdate) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.DefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_METRIC:
          serviceImpl.getMetric((com.zenoss.cloud.GetMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.GetMetricResponse>) responseObserver);
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
        case METHODID_CREATE_OR_UPDATE_METRICS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createOrUpdateMetrics(
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.RegisterMetricsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataRegistryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataRegistryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zenoss.cloud.DataRegistryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataRegistryService");
    }
  }

  private static final class DataRegistryServiceFileDescriptorSupplier
      extends DataRegistryServiceBaseDescriptorSupplier {
    DataRegistryServiceFileDescriptorSupplier() {}
  }

  private static final class DataRegistryServiceMethodDescriptorSupplier
      extends DataRegistryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataRegistryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataRegistryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataRegistryServiceFileDescriptorSupplier())
              .addMethod(getCreateOrUpdateMetricMethod())
              .addMethod(getCreateOrUpdateMetricsMethod())
              .addMethod(getUpdateMetricMethod())
              .addMethod(getRegisterDefinitionMethod())
              .addMethod(getUpdateDefinitionMethod())
              .addMethod(getGetMetricMethod())
              .build();
        }
      }
    }
    return result;
  }
}
