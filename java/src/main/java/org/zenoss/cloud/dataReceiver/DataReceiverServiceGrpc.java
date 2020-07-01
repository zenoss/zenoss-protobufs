package org.zenoss.cloud.dataReceiver;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Data Receiver API
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: zenoss/cloud/data_receiver.proto")
public final class DataReceiverServiceGrpc {

  private DataReceiverServiceGrpc() {}

  public static final String SERVICE_NAME = "zenoss.cloud.DataReceiverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Events,
      org.zenoss.cloud.dataReceiver.EventStatusResult> getPutEventsMethod;

  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Events,
      org.zenoss.cloud.dataReceiver.EventStatusResult> getPutEventsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Events, org.zenoss.cloud.dataReceiver.EventStatusResult> getPutEventsMethod;
    if ((getPutEventsMethod = DataReceiverServiceGrpc.getPutEventsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutEventsMethod = DataReceiverServiceGrpc.getPutEventsMethod) == null) {
          DataReceiverServiceGrpc.getPutEventsMethod = getPutEventsMethod = 
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.Events, org.zenoss.cloud.dataReceiver.EventStatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zenoss.cloud.DataReceiverService", "PutEvents"))
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

  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.EventWrapper,
      org.zenoss.cloud.dataReceiver.Void> getPutEventMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.EventWrapper, org.zenoss.cloud.dataReceiver.Void> getPutEventMethod;
    if ((getPutEventMethod = DataReceiverServiceGrpc.getPutEventMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutEventMethod = DataReceiverServiceGrpc.getPutEventMethod) == null) {
          DataReceiverServiceGrpc.getPutEventMethod = getPutEventMethod = 
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.EventWrapper, org.zenoss.cloud.dataReceiver.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "zenoss.cloud.DataReceiverService", "PutEvent"))
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

  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Metrics,
      org.zenoss.cloud.dataReceiver.StatusResult> getPutMetricsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Metrics, org.zenoss.cloud.dataReceiver.StatusResult> getPutMetricsMethod;
    if ((getPutMetricsMethod = DataReceiverServiceGrpc.getPutMetricsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutMetricsMethod = DataReceiverServiceGrpc.getPutMetricsMethod) == null) {
          DataReceiverServiceGrpc.getPutMetricsMethod = getPutMetricsMethod = 
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.Metrics, org.zenoss.cloud.dataReceiver.StatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zenoss.cloud.DataReceiverService", "PutMetrics"))
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

  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.MetricWrapper,
      org.zenoss.cloud.dataReceiver.Void> getPutMetricMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.MetricWrapper, org.zenoss.cloud.dataReceiver.Void> getPutMetricMethod;
    if ((getPutMetricMethod = DataReceiverServiceGrpc.getPutMetricMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutMetricMethod = DataReceiverServiceGrpc.getPutMetricMethod) == null) {
          DataReceiverServiceGrpc.getPutMetricMethod = getPutMetricMethod = 
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.MetricWrapper, org.zenoss.cloud.dataReceiver.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "zenoss.cloud.DataReceiverService", "PutMetric"))
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

  public static io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Models,
      org.zenoss.cloud.dataReceiver.ModelStatusResult> getPutModelsMethod() {
    io.grpc.MethodDescriptor<org.zenoss.cloud.dataReceiver.Models, org.zenoss.cloud.dataReceiver.ModelStatusResult> getPutModelsMethod;
    if ((getPutModelsMethod = DataReceiverServiceGrpc.getPutModelsMethod) == null) {
      synchronized (DataReceiverServiceGrpc.class) {
        if ((getPutModelsMethod = DataReceiverServiceGrpc.getPutModelsMethod) == null) {
          DataReceiverServiceGrpc.getPutModelsMethod = getPutModelsMethod = 
              io.grpc.MethodDescriptor.<org.zenoss.cloud.dataReceiver.Models, org.zenoss.cloud.dataReceiver.ModelStatusResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zenoss.cloud.DataReceiverService", "PutModels"))
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
    return new DataReceiverServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataReceiverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataReceiverServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataReceiverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataReceiverServiceFutureStub(channel);
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
    public void putEvents(org.zenoss.cloud.dataReceiver.Events request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventStatusResult> responseObserver) {
      asyncUnimplementedUnaryCall(getPutEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Events of any type.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventWrapper> putEvent(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return asyncUnimplementedStreamingCall(getPutEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public void putMetrics(org.zenoss.cloud.dataReceiver.Metrics request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.StatusResult> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Metric of any type
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.MetricWrapper> putMetric(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return asyncUnimplementedStreamingCall(getPutMetricMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public void putModels(org.zenoss.cloud.dataReceiver.Models request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.ModelStatusResult> responseObserver) {
      asyncUnimplementedUnaryCall(getPutModelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataReceiver.Events,
                org.zenoss.cloud.dataReceiver.EventStatusResult>(
                  this, METHODID_PUT_EVENTS)))
          .addMethod(
            getPutEventMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.zenoss.cloud.dataReceiver.EventWrapper,
                org.zenoss.cloud.dataReceiver.Void>(
                  this, METHODID_PUT_EVENT)))
          .addMethod(
            getPutMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataReceiver.Metrics,
                org.zenoss.cloud.dataReceiver.StatusResult>(
                  this, METHODID_PUT_METRICS)))
          .addMethod(
            getPutMetricMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.zenoss.cloud.dataReceiver.MetricWrapper,
                org.zenoss.cloud.dataReceiver.Void>(
                  this, METHODID_PUT_METRIC)))
          .addMethod(
            getPutModelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.zenoss.cloud.dataReceiver.Models,
                org.zenoss.cloud.dataReceiver.ModelStatusResult>(
                  this, METHODID_PUT_MODELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceStub extends io.grpc.stub.AbstractStub<DataReceiverServiceStub> {
    private DataReceiverServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataReceiverServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReceiverServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataReceiverServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public void putEvents(org.zenoss.cloud.dataReceiver.Events request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventStatusResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Events of any type.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.EventWrapper> putEvent(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPutEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public void putMetrics(org.zenoss.cloud.dataReceiver.Metrics request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.StatusResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Metric of any type
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.MetricWrapper> putMetric(
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.Void> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPutMetricMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public void putModels(org.zenoss.cloud.dataReceiver.Models request,
        io.grpc.stub.StreamObserver<org.zenoss.cloud.dataReceiver.ModelStatusResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceBlockingStub extends io.grpc.stub.AbstractStub<DataReceiverServiceBlockingStub> {
    private DataReceiverServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataReceiverServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReceiverServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataReceiverServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public org.zenoss.cloud.dataReceiver.EventStatusResult putEvents(org.zenoss.cloud.dataReceiver.Events request) {
      return blockingUnaryCall(
          getChannel(), getPutEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public org.zenoss.cloud.dataReceiver.StatusResult putMetrics(org.zenoss.cloud.dataReceiver.Metrics request) {
      return blockingUnaryCall(
          getChannel(), getPutMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public org.zenoss.cloud.dataReceiver.ModelStatusResult putModels(org.zenoss.cloud.dataReceiver.Models request) {
      return blockingUnaryCall(
          getChannel(), getPutModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Data Receiver API
   * </pre>
   */
  public static final class DataReceiverServiceFutureStub extends io.grpc.stub.AbstractStub<DataReceiverServiceFutureStub> {
    private DataReceiverServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataReceiverServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataReceiverServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataReceiverServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Events
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataReceiver.EventStatusResult> putEvents(
        org.zenoss.cloud.dataReceiver.Events request) {
      return futureUnaryCall(
          getChannel().newCall(getPutEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send Metrics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataReceiver.StatusResult> putMetrics(
        org.zenoss.cloud.dataReceiver.Metrics request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send batch of models
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zenoss.cloud.dataReceiver.ModelStatusResult> putModels(
        org.zenoss.cloud.dataReceiver.Models request) {
      return futureUnaryCall(
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
