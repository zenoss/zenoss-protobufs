# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from zenoss.cloud import collection_cfg_pb2 as zenoss_dot_cloud_dot_collection__cfg__pb2


class CollectionConfigServiceStub(object):
  """CollectionConfigService is the gRPC & HTTP service responsible for managing
  collection configurations.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.WaitForProbeConfig = channel.stream_stream(
        '/zenoss.cloud.collection_cfg.CollectionConfigService/WaitForProbeConfig',
        request_serializer=zenoss_dot_cloud_dot_collection__cfg__pb2.WaitForProbeConfigResponse.SerializeToString,
        response_deserializer=zenoss_dot_cloud_dot_collection__cfg__pb2.WaitForProbeConfigRequest.FromString,
        )
    self.GetConfigStream = channel.unary_stream(
        '/zenoss.cloud.collection_cfg.CollectionConfigService/GetConfigStream',
        request_serializer=zenoss_dot_cloud_dot_collection__cfg__pb2.GetConfigStreamRequest.SerializeToString,
        response_deserializer=zenoss_dot_cloud_dot_collection__cfg__pb2.GetConfigStreamResponse.FromString,
        )


class CollectionConfigServiceServicer(object):
  """CollectionConfigService is the gRPC & HTTP service responsible for managing
  collection configurations.
  """

  def WaitForProbeConfig(self, request_iterator, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetConfigStream(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_CollectionConfigServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'WaitForProbeConfig': grpc.stream_stream_rpc_method_handler(
          servicer.WaitForProbeConfig,
          request_deserializer=zenoss_dot_cloud_dot_collection__cfg__pb2.WaitForProbeConfigResponse.FromString,
          response_serializer=zenoss_dot_cloud_dot_collection__cfg__pb2.WaitForProbeConfigRequest.SerializeToString,
      ),
      'GetConfigStream': grpc.unary_stream_rpc_method_handler(
          servicer.GetConfigStream,
          request_deserializer=zenoss_dot_cloud_dot_collection__cfg__pb2.GetConfigStreamRequest.FromString,
          response_serializer=zenoss_dot_cloud_dot_collection__cfg__pb2.GetConfigStreamResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'zenoss.cloud.collection_cfg.CollectionConfigService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))