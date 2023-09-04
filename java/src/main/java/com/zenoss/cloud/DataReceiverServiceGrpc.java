package com.zenoss.cloud;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Data Receiver API
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: zenoss/cloud/data_receiver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataReceiverServiceGrpc {

  private DataReceiverServiceGrpc() {}

  public static final String SERVICE_NAME = "zenoss.cloud.DataReceiverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.Events,
      com.zenoss.cloud.EventStatusResult> getPutEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutEvents",
      requestType = com.zenoss.cloud.Events.class,
      responseType = com.zenoss.cloud.EventStatusResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.Events,
      com.zenoss.cloud.EventStatusResult> getPutEventsMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.Events, com.zenoss.cloud.EventStatusResult> getPutEventsMethod;
    if ((getPutEventsMethod = DataReceiverServiceGrpc.getPutEventsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutEventsMethod = DataReceiverServiceGrpc.getPutEventsMethod) == null) {
          DataReceiverServiceGrpc.getPutEventsMethod = getPutEventsMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.Events, com.zenoss.cloud.EventStatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.Events.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.EventStatusResult.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutEvents"))
              .build();
        }
      }
    }
    return getPutEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.EventWrapper,
      com.zenoss.cloud.Void> getPutEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutEvent",
      requestType = com.zenoss.cloud.EventWrapper.class,
      responseType = com.zenoss.cloud.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.EventWrapper,
      com.zenoss.cloud.Void> getPutEventMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.EventWrapper, com.zenoss.cloud.Void> getPutEventMethod;
    if ((getPutEventMethod = DataReceiverServiceGrpc.getPutEventMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutEventMethod = DataReceiverServiceGrpc.getPutEventMethod) == null) {
          DataReceiverServiceGrpc.getPutEventMethod = getPutEventMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.EventWrapper, com.zenoss.cloud.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.EventWrapper.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.Void.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutEvent"))
              .build();
        }
      }
    }
    return getPutEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.Metrics,
      com.zenoss.cloud.StatusResult> getPutMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutMetrics",
      requestType = com.zenoss.cloud.Metrics.class,
      responseType = com.zenoss.cloud.StatusResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.Metrics,
      com.zenoss.cloud.StatusResult> getPutMetricsMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.Metrics, com.zenoss.cloud.StatusResult> getPutMetricsMethod;
    if ((getPutMetricsMethod = DataReceiverServiceGrpc.getPutMetricsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutMetricsMethod = DataReceiverServiceGrpc.getPutMetricsMethod) == null) {
          DataReceiverServiceGrpc.getPutMetricsMethod = getPutMetricsMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.Metrics, com.zenoss.cloud.StatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.Metrics.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.StatusResult.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutMetrics"))
              .build();
        }
      }
    }
    return getPutMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.MetricWrapper,
      com.zenoss.cloud.Void> getPutMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutMetric",
      requestType = com.zenoss.cloud.MetricWrapper.class,
      responseType = com.zenoss.cloud.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.MetricWrapper,
      com.zenoss.cloud.Void> getPutMetricMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.MetricWrapper, com.zenoss.cloud.Void> getPutMetricMethod;
    if ((getPutMetricMethod = DataReceiverServiceGrpc.getPutMetricMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutMetricMethod = DataReceiverServiceGrpc.getPutMetricMethod) == null) {
          DataReceiverServiceGrpc.getPutMetricMethod = getPutMetricMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.MetricWrapper, com.zenoss.cloud.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.MetricWrapper.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.Void.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutMetric"))
              .build();
        }
      }
    }
    return getPutMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zenoss.cloud.Models,
      com.zenoss.cloud.ModelStatusResult> getPutModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutModels",
      requestType = com.zenoss.cloud.Models.class,
      responseType = com.zenoss.cloud.ModelStatusResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zenoss.cloud.Models,
      com.zenoss.cloud.ModelStatusResult> getPutModelsMethod() {
    io.grpc.MethodDescriptor<com.zenoss.cloud.Models, com.zenoss.cloud.ModelStatusResult> getPutModelsMethod;
    if ((getPutModelsMethod = DataReceiverServiceGrpc.getPutModelsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutModelsMethod = DataReceiverServiceGrpc.getPutModelsMethod) == null) {
          DataReceiverServiceGrpc.getPutModelsMethod = getPutModelsMethod =
              io.grpc.MethodDescriptor.<com.zenoss.cloud.Models, com.zenoss.cloud.ModelStatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.Models.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zenoss.cloud.ModelStatusResult.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutModels"))
              .build();
        }
      }
    }
    return getPutModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataReceiverServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataReceiverServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataReceiverServiceStub>() {
        @java.lang.Override
        public DataReceiverServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataReceiverServiceStub(channel, callOptions);
        }
      };
    return DataReceiverServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataReceiverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataReceiverServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataReceiverServiceBlockingStub>() {
        @java.lang.Override
        public DataReceiverServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataReceiverServiceBlockingStub(channel, callOptions);
        }
      };
    return DataReceiverServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataReceiverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataReceiverServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataReceiverServiceFutureStub>() {
        @java.lang.Override
        public DataReceiverServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataReceiverServiceFutureStub(channel, callOptions);
        }
      };
    return DataReceiverServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static abstract class DataReceiverServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public void putEvents(com.zenoss.cloud.Events request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.EventStatusResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Events of any type.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zenoss.cloud.EventWrapper> putEvent(
        io.grpc.stub.StreamObserver<com.zenoss.cloud.Void> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public void putMetrics(com.zenoss.cloud.Metrics request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.StatusResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Metric of any type
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zenoss.cloud.MetricWrapper> putMetric(
        io.grpc.stub.StreamObserver<com.zenoss.cloud.Void> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutMetricMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public void putModels(com.zenoss.cloud.Models request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.ModelStatusResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutModelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.Events,
                com.zenoss.cloud.EventStatusResult>(
                  this, METHODID_PUT_EVENTS)))
          .addMethod(
            getPutEventMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.zenoss.cloud.EventWrapper,
                com.zenoss.cloud.Void>(
                  this, METHODID_PUT_EVENT)))
          .addMethod(
            getPutMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.Metrics,
                com.zenoss.cloud.StatusResult>(
                  this, METHODID_PUT_METRICS)))
          .addMethod(
            getPutMetricMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.zenoss.cloud.MetricWrapper,
                com.zenoss.cloud.Void>(
                  this, METHODID_PUT_METRIC)))
          .addMethod(
            getPutModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zenoss.cloud.Models,
                com.zenoss.cloud.ModelStatusResult>(
                  this, METHODID_PUT_MODELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceStub extends io.grpc.stub.AbstractAsyncStub<DataReceiverServiceStub> {
    private DataReceiverServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReceiverServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataReceiverServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public void putEvents(com.zenoss.cloud.Events request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.EventStatusResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Events of any type.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zenoss.cloud.EventWrapper> putEvent(
        io.grpc.stub.StreamObserver<com.zenoss.cloud.Void> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public void putMetrics(com.zenoss.cloud.Metrics request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.StatusResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Metric of any type
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zenoss.cloud.MetricWrapper> putMetric(
        io.grpc.stub.StreamObserver<com.zenoss.cloud.Void> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutMetricMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public void putModels(com.zenoss.cloud.Models request,
        io.grpc.stub.StreamObserver<com.zenoss.cloud.ModelStatusResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataReceiverServiceBlockingStub> {
    private DataReceiverServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReceiverServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataReceiverServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public com.zenoss.cloud.EventStatusResult putEvents(com.zenoss.cloud.Events request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public com.zenoss.cloud.StatusResult putMetrics(com.zenoss.cloud.Metrics request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public com.zenoss.cloud.ModelStatusResult putModels(com.zenoss.cloud.Models request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataReceiverServiceFutureStub> {
    private DataReceiverServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReceiverServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataReceiverServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.EventStatusResult> putEvents(
        com.zenoss.cloud.Events request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.StatusResult> putMetrics(
        com.zenoss.cloud.Metrics request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zenoss.cloud.ModelStatusResult> putModels(
        com.zenoss.cloud.Models request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutModelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT_EVENTS = 0;
  private static final int METHODID_PUT_METRICS = 1;
  private static final int METHODID_PUT_MODELS = 2;
  private static final int METHODID_PUT_EVENT = 3;
  private static final int METHODID_PUT_METRIC = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataReceiverServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataReceiverServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_EVENTS:
          serviceImpl.putEvents((com.zenoss.cloud.Events) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.EventStatusResult>) responseObserver);
          break;
        case METHODID_PUT_METRICS:
          serviceImpl.putMetrics((com.zenoss.cloud.Metrics) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.StatusResult>) responseObserver);
          break;
        case METHODID_PUT_MODELS:
          serviceImpl.putModels((com.zenoss.cloud.Models) request,
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.ModelStatusResult>) responseObserver);
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
        case METHODID_PUT_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putEvent(
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.Void>) responseObserver);
        case METHODID_PUT_METRIC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putMetric(
              (io.grpc.stub.StreamObserver<com.zenoss.cloud.Void>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataReceiverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zenoss.cloud.DataReceiverProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataReceiverService");
    }
  }

  private static final class DataReceiverServiceFileDescriptorSupplier
      extends DataReceiverServiceBaseDescriptorSupplier {
    DataReceiverServiceFileDescriptorSupplier() {}
  }

  private static final class DataReceiverServiceMethodDescriptorSupplier
      extends DataReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataReceiverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataReceiverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataReceiverServiceFileDescriptorSupplier())
              .addMethod(getPutEventsMethod())
              .addMethod(getPutEventMethod())
              .addMethod(getPutMetricsMethod())
              .addMethod(getPutMetricMethod())
              .addMethod(getPutModelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
