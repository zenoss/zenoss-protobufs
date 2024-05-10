# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from zenoss.cloud import data_receiver_pb2 as zenoss_dot_cloud_dot_data__receiver__pb2


class DataReceiverServiceStub(object):
    """Data Receiver API
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.PutEvents = channel.unary_unary(
                '/zenoss.cloud.DataReceiverService/PutEvents',
                request_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.Events.SerializeToString,
                response_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.EventStatusResult.FromString,
                _registered_method=True)
        self.PutEvent = channel.stream_unary(
                '/zenoss.cloud.DataReceiverService/PutEvent',
                request_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.EventWrapper.SerializeToString,
                response_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.Void.FromString,
                _registered_method=True)
        self.PutMetrics = channel.unary_unary(
                '/zenoss.cloud.DataReceiverService/PutMetrics',
                request_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.Metrics.SerializeToString,
                response_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.StatusResult.FromString,
                _registered_method=True)
        self.PutMetric = channel.stream_unary(
                '/zenoss.cloud.DataReceiverService/PutMetric',
                request_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.MetricWrapper.SerializeToString,
                response_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.Void.FromString,
                _registered_method=True)
        self.PutModels = channel.unary_unary(
                '/zenoss.cloud.DataReceiverService/PutModels',
                request_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.Models.SerializeToString,
                response_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.ModelStatusResult.FromString,
                _registered_method=True)


class DataReceiverServiceServicer(object):
    """Data Receiver API
    """

    def PutEvents(self, request, context):
        """Send Events
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PutEvent(self, request_iterator, context):
        """Stream Events of any type.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PutMetrics(self, request, context):
        """Send Metrics
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PutMetric(self, request_iterator, context):
        """Stream Metric of any type
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PutModels(self, request, context):
        """Send batch of models
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_DataReceiverServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'PutEvents': grpc.unary_unary_rpc_method_handler(
                    servicer.PutEvents,
                    request_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.Events.FromString,
                    response_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.EventStatusResult.SerializeToString,
            ),
            'PutEvent': grpc.stream_unary_rpc_method_handler(
                    servicer.PutEvent,
                    request_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.EventWrapper.FromString,
                    response_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.Void.SerializeToString,
            ),
            'PutMetrics': grpc.unary_unary_rpc_method_handler(
                    servicer.PutMetrics,
                    request_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.Metrics.FromString,
                    response_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.StatusResult.SerializeToString,
            ),
            'PutMetric': grpc.stream_unary_rpc_method_handler(
                    servicer.PutMetric,
                    request_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.MetricWrapper.FromString,
                    response_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.Void.SerializeToString,
            ),
            'PutModels': grpc.unary_unary_rpc_method_handler(
                    servicer.PutModels,
                    request_deserializer=zenoss_dot_cloud_dot_data__receiver__pb2.Models.FromString,
                    response_serializer=zenoss_dot_cloud_dot_data__receiver__pb2.ModelStatusResult.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'zenoss.cloud.DataReceiverService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class DataReceiverService(object):
    """Data Receiver API
    """

    @staticmethod
    def PutEvents(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/zenoss.cloud.DataReceiverService/PutEvents',
            zenoss_dot_cloud_dot_data__receiver__pb2.Events.SerializeToString,
            zenoss_dot_cloud_dot_data__receiver__pb2.EventStatusResult.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def PutEvent(request_iterator,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.stream_unary(
            request_iterator,
            target,
            '/zenoss.cloud.DataReceiverService/PutEvent',
            zenoss_dot_cloud_dot_data__receiver__pb2.EventWrapper.SerializeToString,
            zenoss_dot_cloud_dot_data__receiver__pb2.Void.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def PutMetrics(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/zenoss.cloud.DataReceiverService/PutMetrics',
            zenoss_dot_cloud_dot_data__receiver__pb2.Metrics.SerializeToString,
            zenoss_dot_cloud_dot_data__receiver__pb2.StatusResult.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def PutMetric(request_iterator,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.stream_unary(
            request_iterator,
            target,
            '/zenoss.cloud.DataReceiverService/PutMetric',
            zenoss_dot_cloud_dot_data__receiver__pb2.MetricWrapper.SerializeToString,
            zenoss_dot_cloud_dot_data__receiver__pb2.Void.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def PutModels(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/zenoss.cloud.DataReceiverService/PutModels',
            zenoss_dot_cloud_dot_data__receiver__pb2.Models.SerializeToString,
            zenoss_dot_cloud_dot_data__receiver__pb2.ModelStatusResult.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
