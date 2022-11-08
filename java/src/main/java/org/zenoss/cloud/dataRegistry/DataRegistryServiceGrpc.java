package org.zenoss.cloud.dataRegistry;

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
  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.RegisterMetricRequest,
      org.zenoss.cloud.dataRegistry.RegisterMetricResponse> getCreateOrUpdateMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateMetric",
      requestType = org.zenoss.cloud.dataRegistry.RegisterMetricRequest.class,
      responseType = org.zenoss.cloud.dataRegistry.RegisterMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.RegisterMetricRequest,
      org.zenoss.cloud.dataRegistry.RegisterMetricResponse> getCreateOrUpdateMetricMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.RegisterMetricRequest, org.zenoss.cloud.dataRegistry.RegisterMetricResponse> getCreateOrUpdateMetricMethod;
    if ((getCreateOrUpdateMetricMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getCreateOrUpdateMetricMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricMethod) == null) {
          DataRegistryServiceGrpc.getCreateOrUpdateMetricMethod = getCreateOrUpdateMetricMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataRegistry.RegisterMetricRequest, org.zenoss.cloud.dataRegistry.RegisterMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrUpdateMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.RegisterMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("CreateOrUpdateMetric"))
              .build();
        }
      }
    }
    return getCreateOrUpdateMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.RegisterMetricRequest,
      org.zenoss.cloud.dataRegistry.RegisterMetricsResponse> getCreateOrUpdateMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateMetrics",
      requestType = org.zenoss.cloud.dataRegistry.RegisterMetricRequest.class,
      responseType = org.zenoss.cloud.dataRegistry.RegisterMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.RegisterMetricRequest,
      org.zenoss.cloud.dataRegistry.RegisterMetricsResponse> getCreateOrUpdateMetricsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.RegisterMetricRequest, org.zenoss.cloud.dataRegistry.RegisterMetricsResponse> getCreateOrUpdateMetricsMethod;
    if ((getCreateOrUpdateMetricsMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricsMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getCreateOrUpdateMetricsMethod = DataRegistryServiceGrpc.getCreateOrUpdateMetricsMethod) == null) {
          DataRegistryServiceGrpc.getCreateOrUpdateMetricsMethod = getCreateOrUpdateMetricsMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataRegistry.RegisterMetricRequest, org.zenoss.cloud.dataRegistry.RegisterMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrUpdateMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.RegisterMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.RegisterMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("CreateOrUpdateMetrics"))
              .build();
        }
      }
    }
    return getCreateOrUpdateMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.UpdateMetricRequest,
      org.zenoss.cloud.dataRegistry.RegisterMetricResponse> getUpdateMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMetric",
      requestType = org.zenoss.cloud.dataRegistry.UpdateMetricRequest.class,
      responseType = org.zenoss.cloud.dataRegistry.RegisterMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.UpdateMetricRequest,
      org.zenoss.cloud.dataRegistry.RegisterMetricResponse> getUpdateMetricMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.UpdateMetricRequest, org.zenoss.cloud.dataRegistry.RegisterMetricResponse> getUpdateMetricMethod;
    if ((getUpdateMetricMethod = DataRegistryServiceGrpc.getUpdateMetricMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getUpdateMetricMethod = DataRegistryServiceGrpc.getUpdateMetricMethod) == null) {
          DataRegistryServiceGrpc.getUpdateMetricMethod = getUpdateMetricMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataRegistry.UpdateMetricRequest, org.zenoss.cloud.dataRegistry.RegisterMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.UpdateMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("UpdateMetric"))
              .build();
        }
      }
    }
    return getUpdateMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.Definition,
      org.zenoss.cloud.dataRegistry.DefinitionResponse> getRegisterDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterDefinition",
      requestType = org.zenoss.cloud.dataRegistry.Definition.class,
      responseType = org.zenoss.cloud.dataRegistry.DefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.Definition,
      org.zenoss.cloud.dataRegistry.DefinitionResponse> getRegisterDefinitionMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.Definition, org.zenoss.cloud.dataRegistry.DefinitionResponse> getRegisterDefinitionMethod;
    if ((getRegisterDefinitionMethod = DataRegistryServiceGrpc.getRegisterDefinitionMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getRegisterDefinitionMethod = DataRegistryServiceGrpc.getRegisterDefinitionMethod) == null) {
          DataRegistryServiceGrpc.getRegisterDefinitionMethod = getRegisterDefinitionMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataRegistry.Definition, org.zenoss.cloud.dataRegistry.DefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.Definition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.DefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("RegisterDefinition"))
              .build();
        }
      }
    }
    return getRegisterDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.DefinitionUpdate,
      org.zenoss.cloud.dataRegistry.DefinitionResponse> getUpdateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefinition",
      requestType = org.zenoss.cloud.dataRegistry.DefinitionUpdate.class,
      responseType = org.zenoss.cloud.dataRegistry.DefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.DefinitionUpdate,
      org.zenoss.cloud.dataRegistry.DefinitionResponse> getUpdateDefinitionMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.DefinitionUpdate, org.zenoss.cloud.dataRegistry.DefinitionResponse> getUpdateDefinitionMethod;
    if ((getUpdateDefinitionMethod = DataRegistryServiceGrpc.getUpdateDefinitionMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getUpdateDefinitionMethod = DataRegistryServiceGrpc.getUpdateDefinitionMethod) == null) {
          DataRegistryServiceGrpc.getUpdateDefinitionMethod = getUpdateDefinitionMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataRegistry.DefinitionUpdate, org.zenoss.cloud.dataRegistry.DefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.DefinitionUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.DefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataRegistryServiceMethodDescriptorSupplier("UpdateDefinition"))
              .build();
        }
      }
    }
    return getUpdateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.GetMetricRequest,
      org.zenoss.cloud.dataRegistry.GetMetricResponse> getGetMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetric",
      requestType = org.zenoss.cloud.dataRegistry.GetMetricRequest.class,
      responseType = org.zenoss.cloud.dataRegistry.GetMetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.GetMetricRequest,
      org.zenoss.cloud.dataRegistry.GetMetricResponse> getGetMetricMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataRegistry.GetMetricRequest, org.zenoss.cloud.dataRegistry.GetMetricResponse> getGetMetricMethod;
    if ((getGetMetricMethod = DataRegistryServiceGrpc.getGetMetricMethod) == null) {
      synchronized (DataRegistryServiceGrpc.class) {
        if ((getGetMetricMethod = DataRegistryServiceGrpc.getGetMetricMethod) == null) {
          DataRegistryServiceGrpc.getGetMetricMethod = getGetMetricMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataRegistry.GetMetricRequest, org.zenoss.cloud.dataRegistry.GetMetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.GetMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataRegistry.GetMetricResponse.getDefaultInstance()))
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
    public void createOrUpdateMetric(org.zenoss.cloud.dataRegistry.RegisterMetricRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrUpdateMetricMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricRequest> createOrUpdateMetrics(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateOrUpdateMetricsMethod(), responseObserver);
    }

    /**
     */
    public void updateMetric(org.zenoss.cloud.dataRegistry.UpdateMetricRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMetricMethod(), responseObserver);
    }

    /**
     */
    public void registerDefinition(org.zenoss.cloud.dataRegistry.Definition request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.DefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterDefinitionMethod(), responseObserver);
    }

    /**
     */
    public void updateDefinition(org.zenoss.cloud.dataRegistry.DefinitionUpdate request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.DefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefinitionMethod(), responseObserver);
    }

    /**
     */
    public void getMetric(org.zenoss.cloud.dataRegistry.GetMetricRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.GetMetricResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrUpdateMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataRegistry.RegisterMetricRequest,
                org.zenoss.cloud.dataRegistry.RegisterMetricResponse>(
                  this, METHODID_CREATE_OR_UPDATE_METRIC)))
          .addMethod(
            getCreateOrUpdateMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.zenoss.cloud.dataRegistry.RegisterMetricRequest,
                org.zenoss.cloud.dataRegistry.RegisterMetricsResponse>(
                  this, METHODID_CREATE_OR_UPDATE_METRICS)))
          .addMethod(
            getUpdateMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataRegistry.UpdateMetricRequest,
                org.zenoss.cloud.dataRegistry.RegisterMetricResponse>(
                  this, METHODID_UPDATE_METRIC)))
          .addMethod(
            getRegisterDefinitionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataRegistry.Definition,
                org.zenoss.cloud.dataRegistry.DefinitionResponse>(
                  this, METHODID_REGISTER_DEFINITION)))
          .addMethod(
            getUpdateDefinitionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataRegistry.DefinitionUpdate,
                org.zenoss.cloud.dataRegistry.DefinitionResponse>(
                  this, METHODID_UPDATE_DEFINITION)))
          .addMethod(
            getGetMetricMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataRegistry.GetMetricRequest,
                org.zenoss.cloud.dataRegistry.GetMetricResponse>(
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
    public void createOrUpdateMetric(org.zenoss.cloud.dataRegistry.RegisterMetricRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrUpdateMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricRequest> createOrUpdateMetrics(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateOrUpdateMetricsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void updateMetric(org.zenoss.cloud.dataRegistry.UpdateMetricRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerDefinition(org.zenoss.cloud.dataRegistry.Definition request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.DefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDefinition(org.zenoss.cloud.dataRegistry.DefinitionUpdate request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.DefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetric(org.zenoss.cloud.dataRegistry.GetMetricRequest request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.GetMetricResponse> responseObserver) {
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
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponse createOrUpdateMetric(org.zenoss.cloud.dataRegistry.RegisterMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrUpdateMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponse updateMetric(org.zenoss.cloud.dataRegistry.UpdateMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.zenoss.cloud.dataRegistry.DefinitionResponse registerDefinition(org.zenoss.cloud.dataRegistry.Definition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.zenoss.cloud.dataRegistry.DefinitionResponse updateDefinition(org.zenoss.cloud.dataRegistry.DefinitionUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.zenoss.cloud.dataRegistry.GetMetricResponse getMetric(org.zenoss.cloud.dataRegistry.GetMetricRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataRegistry.RegisterMetricResponse> createOrUpdateMetric(
        org.zenoss.cloud.dataRegistry.RegisterMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrUpdateMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataRegistry.RegisterMetricResponse> updateMetric(
        org.zenoss.cloud.dataRegistry.UpdateMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataRegistry.DefinitionResponse> registerDefinition(
        org.zenoss.cloud.dataRegistry.Definition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataRegistry.DefinitionResponse> updateDefinition(
        org.zenoss.cloud.dataRegistry.DefinitionUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataRegistry.GetMetricResponse> getMetric(
        org.zenoss.cloud.dataRegistry.GetMetricRequest request) {
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
          serviceImpl.createOrUpdateMetric((org.zenoss.cloud.dataRegistry.RegisterMetricRequest) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricResponse>) responseObserver);
          break;
        case METHODID_UPDATE_METRIC:
          serviceImpl.updateMetric((org.zenoss.cloud.dataRegistry.UpdateMetricRequest) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricResponse>) responseObserver);
          break;
        case METHODID_REGISTER_DEFINITION:
          serviceImpl.registerDefinition((org.zenoss.cloud.dataRegistry.Definition) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.DefinitionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFINITION:
          serviceImpl.updateDefinition((org.zenoss.cloud.dataRegistry.DefinitionUpdate) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.DefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_METRIC:
          serviceImpl.getMetric((org.zenoss.cloud.dataRegistry.GetMetricRequest) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.GetMetricResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataRegistry.RegisterMetricsResponse>) responseObserver);
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
      return org.zenoss.cloud.dataRegistry.DataRegistry.getDescriptor();
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
