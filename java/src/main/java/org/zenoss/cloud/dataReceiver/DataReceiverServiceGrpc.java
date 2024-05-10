package org.zenoss.cloud.dataReceiver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Data Receiver API
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: zenoss/cloud/data_receiver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataReceiverServiceGrpc {

  private DataReceiverServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "zenoss.cloud.DataReceiverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Events,
      org.zenoss.cloud.dataReceiver.EventStatusResult> getPutEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutEvents",
      requestType = org.zenoss.cloud.dataReceiver.Events.class,
      responseType = org.zenoss.cloud.dataReceiver.EventStatusResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Events,
      org.zenoss.cloud.dataReceiver.EventStatusResult> getPutEventsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Events, org.zenoss.cloud.dataReceiver.EventStatusResult> getPutEventsMethod;
    if ((getPutEventsMethod = DataReceiverServiceGrpc.getPutEventsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutEventsMethod = DataReceiverServiceGrpc.getPutEventsMethod) == null) {
          DataReceiverServiceGrpc.getPutEventsMethod = getPutEventsMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.Events, org.zenoss.cloud.dataReceiver.EventStatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.Events.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.EventStatusResult.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutEvents"))
              .build();
        }
      }
    }
    return getPutEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.EventWrapper,
      org.zenoss.cloud.dataReceiver.Void> getPutEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutEvent",
      requestType = org.zenoss.cloud.dataReceiver.EventWrapper.class,
      responseType = org.zenoss.cloud.dataReceiver.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.EventWrapper,
      org.zenoss.cloud.dataReceiver.Void> getPutEventMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.EventWrapper, org.zenoss.cloud.dataReceiver.Void> getPutEventMethod;
    if ((getPutEventMethod = DataReceiverServiceGrpc.getPutEventMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutEventMethod = DataReceiverServiceGrpc.getPutEventMethod) == null) {
          DataReceiverServiceGrpc.getPutEventMethod = getPutEventMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.EventWrapper, org.zenoss.cloud.dataReceiver.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.EventWrapper.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.Void.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutEvent"))
              .build();
        }
      }
    }
    return getPutEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Metrics,
      org.zenoss.cloud.dataReceiver.StatusResult> getPutMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutMetrics",
      requestType = org.zenoss.cloud.dataReceiver.Metrics.class,
      responseType = org.zenoss.cloud.dataReceiver.StatusResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Metrics,
      org.zenoss.cloud.dataReceiver.StatusResult> getPutMetricsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Metrics, org.zenoss.cloud.dataReceiver.StatusResult> getPutMetricsMethod;
    if ((getPutMetricsMethod = DataReceiverServiceGrpc.getPutMetricsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutMetricsMethod = DataReceiverServiceGrpc.getPutMetricsMethod) == null) {
          DataReceiverServiceGrpc.getPutMetricsMethod = getPutMetricsMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.Metrics, org.zenoss.cloud.dataReceiver.StatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.Metrics.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.StatusResult.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutMetrics"))
              .build();
        }
      }
    }
    return getPutMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.MetricWrapper,
      org.zenoss.cloud.dataReceiver.Void> getPutMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutMetric",
      requestType = org.zenoss.cloud.dataReceiver.MetricWrapper.class,
      responseType = org.zenoss.cloud.dataReceiver.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.MetricWrapper,
      org.zenoss.cloud.dataReceiver.Void> getPutMetricMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.MetricWrapper, org.zenoss.cloud.dataReceiver.Void> getPutMetricMethod;
    if ((getPutMetricMethod = DataReceiverServiceGrpc.getPutMetricMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutMetricMethod = DataReceiverServiceGrpc.getPutMetricMethod) == null) {
          DataReceiverServiceGrpc.getPutMetricMethod = getPutMetricMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.MetricWrapper, org.zenoss.cloud.dataReceiver.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.MetricWrapper.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.Void.getDefaultInstance()))
              .setSchemaDescriptor(new DataReceiverServiceMethodDescriptorSupplier("PutMetric"))
              .build();
        }
      }
    }
    return getPutMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Models,
      org.zenoss.cloud.dataReceiver.ModelStatusResult> getPutModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutModels",
      requestType = org.zenoss.cloud.dataReceiver.Models.class,
      responseType = org.zenoss.cloud.dataReceiver.ModelStatusResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Models,
      org.zenoss.cloud.dataReceiver.ModelStatusResult> getPutModelsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Models, org.zenoss.cloud.dataReceiver.ModelStatusResult> getPutModelsMethod;
    if ((getPutModelsMethod = DataReceiverServiceGrpc.getPutModelsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutModelsMethod = DataReceiverServiceGrpc.getPutModelsMethod) == null) {
          DataReceiverServiceGrpc.getPutModelsMethod = getPutModelsMethod =
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.Models, org.zenoss.cloud.dataReceiver.ModelStatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.Models.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zenoss.cloud.dataReceiver.ModelStatusResult.getDefaultInstance()))
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
  public interface AsyncService {

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    default void putEvents(org.zenoss.cloud.dataReceiver.Events request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventStatusResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Events of any type.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventWrapper> putEvent(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    default void putMetrics(org.zenoss.cloud.dataReceiver.Metrics request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.StatusResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Metric of any type
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.MetricWrapper> putMetric(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutMetricMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    default void putModels(org.zenoss.cloud.dataReceiver.Models request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.ModelStatusResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutModelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataReceiverService.
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static abstract class DataReceiverServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataReceiverServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataReceiverService.
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataReceiverServiceStub> {
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
    public void putEvents(org.zenoss.cloud.dataReceiver.Events request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventStatusResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Events of any type.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventWrapper> putEvent(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public void putMetrics(org.zenoss.cloud.dataReceiver.Metrics request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.StatusResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Metric of any type
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.MetricWrapper> putMetric(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutMetricMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public void putModels(org.zenoss.cloud.dataReceiver.Models request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.ModelStatusResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataReceiverService.
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataReceiverServiceBlockingStub> {
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
    public org.zenoss.cloud.dataReceiver.EventStatusResult putEvents(org.zenoss.cloud.dataReceiver.Events request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public org.zenoss.cloud.dataReceiver.StatusResult putMetrics(org.zenoss.cloud.dataReceiver.Metrics request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public org.zenoss.cloud.dataReceiver.ModelStatusResult putModels(org.zenoss.cloud.dataReceiver.Models request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataReceiverService.
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataReceiverServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataReceiver.EventStatusResult> putEvents(
        org.zenoss.cloud.dataReceiver.Events request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataReceiver.StatusResult> putMetrics(
        org.zenoss.cloud.dataReceiver.Metrics request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataReceiver.ModelStatusResult> putModels(
        org.zenoss.cloud.dataReceiver.Models request) {
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
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_EVENTS:
          serviceImpl.putEvents((org.zenoss.cloud.dataReceiver.Events) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventStatusResult>) responseObserver);
          break;
        case METHODID_PUT_METRICS:
          serviceImpl.putMetrics((org.zenoss.cloud.dataReceiver.Metrics) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.StatusResult>) responseObserver);
          break;
        case METHODID_PUT_MODELS:
          serviceImpl.putModels((org.zenoss.cloud.dataReceiver.Models) request,
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.ModelStatusResult>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void>) responseObserver);
        case METHODID_PUT_METRIC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putMetric(
              (io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPutEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zenoss.cloud.dataReceiver.Events,
              org.zenoss.cloud.dataReceiver.EventStatusResult>(
                service, METHODID_PUT_EVENTS)))
        .addMethod(
          getPutEventMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.zenoss.cloud.dataReceiver.EventWrapper,
              org.zenoss.cloud.dataReceiver.Void>(
                service, METHODID_PUT_EVENT)))
        .addMethod(
          getPutMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zenoss.cloud.dataReceiver.Metrics,
              org.zenoss.cloud.dataReceiver.StatusResult>(
                service, METHODID_PUT_METRICS)))
        .addMethod(
          getPutMetricMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.zenoss.cloud.dataReceiver.MetricWrapper,
              org.zenoss.cloud.dataReceiver.Void>(
                service, METHODID_PUT_METRIC)))
        .addMethod(
          getPutModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zenoss.cloud.dataReceiver.Models,
              org.zenoss.cloud.dataReceiver.ModelStatusResult>(
                service, METHODID_PUT_MODELS)))
        .build();
  }

  private static abstract class DataReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataReceiverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.getDescriptor();
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
    private final java.lang.String methodName;

    DataReceiverServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
