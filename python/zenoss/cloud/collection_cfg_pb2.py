# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: zenoss/cloud/collection_cfg.proto
# Protobuf Python Version: 5.26.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!zenoss/cloud/collection_cfg.proto\x12\x1bzenoss.cloud.collection_cfg\"\x9c\x01\n\x06\x43onfig\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x16\n\x06tenant\x18\x03 \x01(\tR\x06tenant\x12P\n\rconfiguration\x18\x05 \x01(\x0b\x32*.zenoss.cloud.collection_cfg.ConfigurationR\rconfigurationJ\x04\x08\x04\x10\x05\"7\n\rConfiguration\x12\x12\n\x04type\x18\x01 \x01(\tR\x04type\x12\x12\n\x04\x64\x61ta\x18\x02 \x01(\tR\x04\x64\x61ta\"\x0e\n\x0cProbeSuccess\"\x94\x01\n\nProbeError\x12\x18\n\x07message\x18\x03 \x01(\tR\x07message\x12 \n\x0b\x64\x65scription\x18\x01 \x01(\tR\x0b\x64\x65scription\x12J\n\x0c\x66ield_errors\x18\x02 \x03(\x0b\x32\'.zenoss.cloud.collection_cfg.FieldErrorR\x0b\x66ieldErrors\"D\n\nFieldError\x12\x14\n\x05\x66ield\x18\x01 \x01(\tR\x05\x66ield\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\"\x9f\x01\n\x0bProbeResult\x12\x45\n\x07success\x18\x01 \x01(\x0b\x32).zenoss.cloud.collection_cfg.ProbeSuccessH\x00R\x07success\x12?\n\x05\x65rror\x18\x02 \x01(\x0b\x32\'.zenoss.cloud.collection_cfg.ProbeErrorH\x00R\x05\x65rrorB\x08\n\x06result\"\x82\x01\n\x19WaitForProbeConfigRequest\x12I\n\rconfiguration\x18\x01 \x01(\x0b\x32#.zenoss.cloud.collection_cfg.ConfigR\rconfiguration\x12\x1a\n\x08\x64\x65\x61\x64line\x18\x02 \x01(\x03R\x08\x64\x65\x61\x64line\"{\n\x1aWaitForProbeConfigResponse\x12\x1b\n\tconfig_id\x18\x01 \x01(\tR\x08\x63onfigId\x12@\n\x06result\x18\x02 \x01(\x0b\x32(.zenoss.cloud.collection_cfg.ProbeResultR\x06result\"\x18\n\x16GetConfigStreamRequest\"d\n\x17GetConfigStreamResponse\x12I\n\rconfiguration\x18\x01 \x03(\x0b\x32#.zenoss.cloud.collection_cfg.ConfigR\rconfiguration2\xaa\x02\n\x17\x43ollectionConfigService\x12\x8b\x01\n\x12WaitForProbeConfig\x12\x37.zenoss.cloud.collection_cfg.WaitForProbeConfigResponse\x1a\x36.zenoss.cloud.collection_cfg.WaitForProbeConfigRequest\"\x00(\x01\x30\x01\x12\x80\x01\n\x0fGetConfigStream\x12\x33.zenoss.cloud.collection_cfg.GetConfigStreamRequest\x1a\x34.zenoss.cloud.collection_cfg.GetConfigStreamResponse\"\x00\x30\x01\x42W\n\x1borg.zenoss.cloud.collectionP\x01Z6github.com/zenoss/zenoss-protobufs/go/cloud/collectionb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'zenoss.cloud.collection_cfg_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033org.zenoss.cloud.collectionP\001Z6github.com/zenoss/zenoss-protobufs/go/cloud/collection'
  _globals['_CONFIG']._serialized_start=67
  _globals['_CONFIG']._serialized_end=223
  _globals['_CONFIGURATION']._serialized_start=225
  _globals['_CONFIGURATION']._serialized_end=280
  _globals['_PROBESUCCESS']._serialized_start=282
  _globals['_PROBESUCCESS']._serialized_end=296
  _globals['_PROBEERROR']._serialized_start=299
  _globals['_PROBEERROR']._serialized_end=447
  _globals['_FIELDERROR']._serialized_start=449
  _globals['_FIELDERROR']._serialized_end=517
  _globals['_PROBERESULT']._serialized_start=520
  _globals['_PROBERESULT']._serialized_end=679
  _globals['_WAITFORPROBECONFIGREQUEST']._serialized_start=682
  _globals['_WAITFORPROBECONFIGREQUEST']._serialized_end=812
  _globals['_WAITFORPROBECONFIGRESPONSE']._serialized_start=814
  _globals['_WAITFORPROBECONFIGRESPONSE']._serialized_end=937
  _globals['_GETCONFIGSTREAMREQUEST']._serialized_start=939
  _globals['_GETCONFIGSTREAMREQUEST']._serialized_end=963
  _globals['_GETCONFIGSTREAMRESPONSE']._serialized_start=965
  _globals['_GETCONFIGSTREAMRESPONSE']._serialized_end=1065
  _globals['_COLLECTIONCONFIGSERVICE']._serialized_start=1068
  _globals['_COLLECTIONCONFIGSERVICE']._serialized_end=1366
# @@protoc_insertion_point(module_scope)
