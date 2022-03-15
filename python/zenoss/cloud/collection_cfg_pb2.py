# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: zenoss/cloud/collection_cfg.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='zenoss/cloud/collection_cfg.proto',
  package='zenoss.cloud.collection_cfg',
  syntax='proto3',
  serialized_options=_b('\n\033org.zenoss.cloud.collectionP\001Z6github.com/zenoss/zenoss-protobufs/go/cloud/collection'),
  serialized_pb=_b('\n!zenoss/cloud/collection_cfg.proto\x12\x1bzenoss.cloud.collection_cfg\x1a\x1cgoogle/api/annotations.proto\"y\n\x06\x43onfig\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x0e\n\x06tenant\x18\x03 \x01(\t\x12\x45\n\rconfiguration\x18\x04 \x01(\x0b\x32..zenoss.cloud.collection_cfg.ConfigurationType\"c\n\x11\x43onfigurationType\x12\x38\n\x08ms_teams\x18\x01 \x01(\x0b\x32$.zenoss.cloud.collection_cfg.MSTeamsH\x00\x42\x14\n\x12\x63onfiguration_type\"\x80\x01\n\x07MSTeams\x12\x11\n\tclient_id\x18\x01 \x01(\t\x12\x15\n\rclient_secret\x18\x02 \x01(\t\x12\x11\n\ttenant_id\x18\x03 \x01(\t\x12\x11\n\tobject_id\x18\x04 \x01(\t\x12\x10\n\x08\x65ndpoint\x18\x05 \x01(\t\x12\x13\n\x0btenant_name\x18\x06 \x01(\t\"\x14\n\x12ListConfigsRequest\"R\n\x13ListConfigsResponse\x12;\n\x0e\x63onfigurations\x18\x01 \x03(\x0b\x32#.zenoss.cloud.collection_cfg.Config\" \n\x10GetConfigRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"O\n\x11GetConfigResponse\x12:\n\rconfiguration\x18\x01 \x01(\x0b\x32#.zenoss.cloud.collection_cfg.Config\"Q\n\x13\x43reateConfigRequest\x12:\n\rconfiguration\x18\x01 \x01(\x0b\x32#.zenoss.cloud.collection_cfg.Config\"Q\n\x13UpdateConfigRequest\x12:\n\rconfiguration\x18\x01 \x01(\x0b\x32#.zenoss.cloud.collection_cfg.Config\"#\n\x13\x44\x65leteConfigRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"$\n\x14\x44\x65leteConfigResponse\x12\x0c\n\x04name\x18\x01 \x01(\t\"\x0e\n\x0cProbeSuccess\"!\n\nProbeError\x12\x13\n\x0b\x64\x65scription\x18\x01 \x01(\t\"\x8f\x01\n\x0bProbeResult\x12<\n\x07success\x18\x01 \x01(\x0b\x32).zenoss.cloud.collection_cfg.ProbeSuccessH\x00\x12\x38\n\x05\x65rror\x18\x02 \x01(\x0b\x32\'.zenoss.cloud.collection_cfg.ProbeErrorH\x00\x42\x08\n\x06result\"i\n\x19WaitForProbeConfigRequest\x12:\n\rconfiguration\x18\x01 \x01(\x0b\x32#.zenoss.cloud.collection_cfg.Config\x12\x10\n\x08\x64\x65\x61\x64line\x18\x02 \x01(\x03\"i\n\x1aWaitForProbeConfigResponse\x12\x11\n\tconfig_id\x18\x01 \x01(\t\x12\x38\n\x06result\x18\x02 \x01(\x0b\x32(.zenoss.cloud.collection_cfg.ProbeResult\"P\n\x12ProbeConfigRequest\x12:\n\rconfiguration\x18\x01 \x01(\x0b\x32#.zenoss.cloud.collection_cfg.Config\"O\n\x13ProbeConfigResponse\x12\x38\n\x06result\x18\x01 \x01(\x0b\x32(.zenoss.cloud.collection_cfg.ProbeResult\"\x18\n\x16GetConfigStreamRequest\"U\n\x17GetConfigStreamResponse\x12:\n\rconfiguration\x18\x01 \x03(\x0b\x32#.zenoss.cloud.collection_cfg.Config2\xaa\x02\n\x17\x43ollectionConfigService\x12\x8b\x01\n\x12WaitForProbeConfig\x12\x37.zenoss.cloud.collection_cfg.WaitForProbeConfigResponse\x1a\x36.zenoss.cloud.collection_cfg.WaitForProbeConfigRequest\"\x00(\x01\x30\x01\x12\x80\x01\n\x0fGetConfigStream\x12\x33.zenoss.cloud.collection_cfg.GetConfigStreamRequest\x1a\x34.zenoss.cloud.collection_cfg.GetConfigStreamResponse\"\x00\x30\x01\x42W\n\x1borg.zenoss.cloud.collectionP\x01Z6github.com/zenoss/zenoss-protobufs/go/cloud/collectionb\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CONFIG = _descriptor.Descriptor(
  name='Config',
  full_name='zenoss.cloud.collection_cfg.Config',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='zenoss.cloud.collection_cfg.Config.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='zenoss.cloud.collection_cfg.Config.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tenant', full_name='zenoss.cloud.collection_cfg.Config.tenant', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.Config.configuration', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=96,
  serialized_end=217,
)


_CONFIGURATIONTYPE = _descriptor.Descriptor(
  name='ConfigurationType',
  full_name='zenoss.cloud.collection_cfg.ConfigurationType',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='ms_teams', full_name='zenoss.cloud.collection_cfg.ConfigurationType.ms_teams', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='configuration_type', full_name='zenoss.cloud.collection_cfg.ConfigurationType.configuration_type',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=219,
  serialized_end=318,
)


_MSTEAMS = _descriptor.Descriptor(
  name='MSTeams',
  full_name='zenoss.cloud.collection_cfg.MSTeams',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='client_id', full_name='zenoss.cloud.collection_cfg.MSTeams.client_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='client_secret', full_name='zenoss.cloud.collection_cfg.MSTeams.client_secret', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tenant_id', full_name='zenoss.cloud.collection_cfg.MSTeams.tenant_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='object_id', full_name='zenoss.cloud.collection_cfg.MSTeams.object_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='endpoint', full_name='zenoss.cloud.collection_cfg.MSTeams.endpoint', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tenant_name', full_name='zenoss.cloud.collection_cfg.MSTeams.tenant_name', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=321,
  serialized_end=449,
)


_LISTCONFIGSREQUEST = _descriptor.Descriptor(
  name='ListConfigsRequest',
  full_name='zenoss.cloud.collection_cfg.ListConfigsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=451,
  serialized_end=471,
)


_LISTCONFIGSRESPONSE = _descriptor.Descriptor(
  name='ListConfigsResponse',
  full_name='zenoss.cloud.collection_cfg.ListConfigsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configurations', full_name='zenoss.cloud.collection_cfg.ListConfigsResponse.configurations', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=473,
  serialized_end=555,
)


_GETCONFIGREQUEST = _descriptor.Descriptor(
  name='GetConfigRequest',
  full_name='zenoss.cloud.collection_cfg.GetConfigRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='zenoss.cloud.collection_cfg.GetConfigRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=557,
  serialized_end=589,
)


_GETCONFIGRESPONSE = _descriptor.Descriptor(
  name='GetConfigResponse',
  full_name='zenoss.cloud.collection_cfg.GetConfigResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.GetConfigResponse.configuration', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=591,
  serialized_end=670,
)


_CREATECONFIGREQUEST = _descriptor.Descriptor(
  name='CreateConfigRequest',
  full_name='zenoss.cloud.collection_cfg.CreateConfigRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.CreateConfigRequest.configuration', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=672,
  serialized_end=753,
)


_UPDATECONFIGREQUEST = _descriptor.Descriptor(
  name='UpdateConfigRequest',
  full_name='zenoss.cloud.collection_cfg.UpdateConfigRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.UpdateConfigRequest.configuration', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=755,
  serialized_end=836,
)


_DELETECONFIGREQUEST = _descriptor.Descriptor(
  name='DeleteConfigRequest',
  full_name='zenoss.cloud.collection_cfg.DeleteConfigRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='zenoss.cloud.collection_cfg.DeleteConfigRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=838,
  serialized_end=873,
)


_DELETECONFIGRESPONSE = _descriptor.Descriptor(
  name='DeleteConfigResponse',
  full_name='zenoss.cloud.collection_cfg.DeleteConfigResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='zenoss.cloud.collection_cfg.DeleteConfigResponse.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=875,
  serialized_end=911,
)


_PROBESUCCESS = _descriptor.Descriptor(
  name='ProbeSuccess',
  full_name='zenoss.cloud.collection_cfg.ProbeSuccess',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=913,
  serialized_end=927,
)


_PROBEERROR = _descriptor.Descriptor(
  name='ProbeError',
  full_name='zenoss.cloud.collection_cfg.ProbeError',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='description', full_name='zenoss.cloud.collection_cfg.ProbeError.description', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=929,
  serialized_end=962,
)


_PROBERESULT = _descriptor.Descriptor(
  name='ProbeResult',
  full_name='zenoss.cloud.collection_cfg.ProbeResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='success', full_name='zenoss.cloud.collection_cfg.ProbeResult.success', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='error', full_name='zenoss.cloud.collection_cfg.ProbeResult.error', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='result', full_name='zenoss.cloud.collection_cfg.ProbeResult.result',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=965,
  serialized_end=1108,
)


_WAITFORPROBECONFIGREQUEST = _descriptor.Descriptor(
  name='WaitForProbeConfigRequest',
  full_name='zenoss.cloud.collection_cfg.WaitForProbeConfigRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.WaitForProbeConfigRequest.configuration', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='deadline', full_name='zenoss.cloud.collection_cfg.WaitForProbeConfigRequest.deadline', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1110,
  serialized_end=1215,
)


_WAITFORPROBECONFIGRESPONSE = _descriptor.Descriptor(
  name='WaitForProbeConfigResponse',
  full_name='zenoss.cloud.collection_cfg.WaitForProbeConfigResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='config_id', full_name='zenoss.cloud.collection_cfg.WaitForProbeConfigResponse.config_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='result', full_name='zenoss.cloud.collection_cfg.WaitForProbeConfigResponse.result', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1217,
  serialized_end=1322,
)


_PROBECONFIGREQUEST = _descriptor.Descriptor(
  name='ProbeConfigRequest',
  full_name='zenoss.cloud.collection_cfg.ProbeConfigRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.ProbeConfigRequest.configuration', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1324,
  serialized_end=1404,
)


_PROBECONFIGRESPONSE = _descriptor.Descriptor(
  name='ProbeConfigResponse',
  full_name='zenoss.cloud.collection_cfg.ProbeConfigResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='zenoss.cloud.collection_cfg.ProbeConfigResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1406,
  serialized_end=1485,
)


_GETCONFIGSTREAMREQUEST = _descriptor.Descriptor(
  name='GetConfigStreamRequest',
  full_name='zenoss.cloud.collection_cfg.GetConfigStreamRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1487,
  serialized_end=1511,
)


_GETCONFIGSTREAMRESPONSE = _descriptor.Descriptor(
  name='GetConfigStreamResponse',
  full_name='zenoss.cloud.collection_cfg.GetConfigStreamResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='configuration', full_name='zenoss.cloud.collection_cfg.GetConfigStreamResponse.configuration', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1513,
  serialized_end=1598,
)

_CONFIG.fields_by_name['configuration'].message_type = _CONFIGURATIONTYPE
_CONFIGURATIONTYPE.fields_by_name['ms_teams'].message_type = _MSTEAMS
_CONFIGURATIONTYPE.oneofs_by_name['configuration_type'].fields.append(
  _CONFIGURATIONTYPE.fields_by_name['ms_teams'])
_CONFIGURATIONTYPE.fields_by_name['ms_teams'].containing_oneof = _CONFIGURATIONTYPE.oneofs_by_name['configuration_type']
_LISTCONFIGSRESPONSE.fields_by_name['configurations'].message_type = _CONFIG
_GETCONFIGRESPONSE.fields_by_name['configuration'].message_type = _CONFIG
_CREATECONFIGREQUEST.fields_by_name['configuration'].message_type = _CONFIG
_UPDATECONFIGREQUEST.fields_by_name['configuration'].message_type = _CONFIG
_PROBERESULT.fields_by_name['success'].message_type = _PROBESUCCESS
_PROBERESULT.fields_by_name['error'].message_type = _PROBEERROR
_PROBERESULT.oneofs_by_name['result'].fields.append(
  _PROBERESULT.fields_by_name['success'])
_PROBERESULT.fields_by_name['success'].containing_oneof = _PROBERESULT.oneofs_by_name['result']
_PROBERESULT.oneofs_by_name['result'].fields.append(
  _PROBERESULT.fields_by_name['error'])
_PROBERESULT.fields_by_name['error'].containing_oneof = _PROBERESULT.oneofs_by_name['result']
_WAITFORPROBECONFIGREQUEST.fields_by_name['configuration'].message_type = _CONFIG
_WAITFORPROBECONFIGRESPONSE.fields_by_name['result'].message_type = _PROBERESULT
_PROBECONFIGREQUEST.fields_by_name['configuration'].message_type = _CONFIG
_PROBECONFIGRESPONSE.fields_by_name['result'].message_type = _PROBERESULT
_GETCONFIGSTREAMRESPONSE.fields_by_name['configuration'].message_type = _CONFIG
DESCRIPTOR.message_types_by_name['Config'] = _CONFIG
DESCRIPTOR.message_types_by_name['ConfigurationType'] = _CONFIGURATIONTYPE
DESCRIPTOR.message_types_by_name['MSTeams'] = _MSTEAMS
DESCRIPTOR.message_types_by_name['ListConfigsRequest'] = _LISTCONFIGSREQUEST
DESCRIPTOR.message_types_by_name['ListConfigsResponse'] = _LISTCONFIGSRESPONSE
DESCRIPTOR.message_types_by_name['GetConfigRequest'] = _GETCONFIGREQUEST
DESCRIPTOR.message_types_by_name['GetConfigResponse'] = _GETCONFIGRESPONSE
DESCRIPTOR.message_types_by_name['CreateConfigRequest'] = _CREATECONFIGREQUEST
DESCRIPTOR.message_types_by_name['UpdateConfigRequest'] = _UPDATECONFIGREQUEST
DESCRIPTOR.message_types_by_name['DeleteConfigRequest'] = _DELETECONFIGREQUEST
DESCRIPTOR.message_types_by_name['DeleteConfigResponse'] = _DELETECONFIGRESPONSE
DESCRIPTOR.message_types_by_name['ProbeSuccess'] = _PROBESUCCESS
DESCRIPTOR.message_types_by_name['ProbeError'] = _PROBEERROR
DESCRIPTOR.message_types_by_name['ProbeResult'] = _PROBERESULT
DESCRIPTOR.message_types_by_name['WaitForProbeConfigRequest'] = _WAITFORPROBECONFIGREQUEST
DESCRIPTOR.message_types_by_name['WaitForProbeConfigResponse'] = _WAITFORPROBECONFIGRESPONSE
DESCRIPTOR.message_types_by_name['ProbeConfigRequest'] = _PROBECONFIGREQUEST
DESCRIPTOR.message_types_by_name['ProbeConfigResponse'] = _PROBECONFIGRESPONSE
DESCRIPTOR.message_types_by_name['GetConfigStreamRequest'] = _GETCONFIGSTREAMREQUEST
DESCRIPTOR.message_types_by_name['GetConfigStreamResponse'] = _GETCONFIGSTREAMRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Config = _reflection.GeneratedProtocolMessageType('Config', (_message.Message,), dict(
  DESCRIPTOR = _CONFIG,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.Config)
  ))
_sym_db.RegisterMessage(Config)

ConfigurationType = _reflection.GeneratedProtocolMessageType('ConfigurationType', (_message.Message,), dict(
  DESCRIPTOR = _CONFIGURATIONTYPE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ConfigurationType)
  ))
_sym_db.RegisterMessage(ConfigurationType)

MSTeams = _reflection.GeneratedProtocolMessageType('MSTeams', (_message.Message,), dict(
  DESCRIPTOR = _MSTEAMS,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.MSTeams)
  ))
_sym_db.RegisterMessage(MSTeams)

ListConfigsRequest = _reflection.GeneratedProtocolMessageType('ListConfigsRequest', (_message.Message,), dict(
  DESCRIPTOR = _LISTCONFIGSREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ListConfigsRequest)
  ))
_sym_db.RegisterMessage(ListConfigsRequest)

ListConfigsResponse = _reflection.GeneratedProtocolMessageType('ListConfigsResponse', (_message.Message,), dict(
  DESCRIPTOR = _LISTCONFIGSRESPONSE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ListConfigsResponse)
  ))
_sym_db.RegisterMessage(ListConfigsResponse)

GetConfigRequest = _reflection.GeneratedProtocolMessageType('GetConfigRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETCONFIGREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.GetConfigRequest)
  ))
_sym_db.RegisterMessage(GetConfigRequest)

GetConfigResponse = _reflection.GeneratedProtocolMessageType('GetConfigResponse', (_message.Message,), dict(
  DESCRIPTOR = _GETCONFIGRESPONSE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.GetConfigResponse)
  ))
_sym_db.RegisterMessage(GetConfigResponse)

CreateConfigRequest = _reflection.GeneratedProtocolMessageType('CreateConfigRequest', (_message.Message,), dict(
  DESCRIPTOR = _CREATECONFIGREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.CreateConfigRequest)
  ))
_sym_db.RegisterMessage(CreateConfigRequest)

UpdateConfigRequest = _reflection.GeneratedProtocolMessageType('UpdateConfigRequest', (_message.Message,), dict(
  DESCRIPTOR = _UPDATECONFIGREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.UpdateConfigRequest)
  ))
_sym_db.RegisterMessage(UpdateConfigRequest)

DeleteConfigRequest = _reflection.GeneratedProtocolMessageType('DeleteConfigRequest', (_message.Message,), dict(
  DESCRIPTOR = _DELETECONFIGREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.DeleteConfigRequest)
  ))
_sym_db.RegisterMessage(DeleteConfigRequest)

DeleteConfigResponse = _reflection.GeneratedProtocolMessageType('DeleteConfigResponse', (_message.Message,), dict(
  DESCRIPTOR = _DELETECONFIGRESPONSE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.DeleteConfigResponse)
  ))
_sym_db.RegisterMessage(DeleteConfigResponse)

ProbeSuccess = _reflection.GeneratedProtocolMessageType('ProbeSuccess', (_message.Message,), dict(
  DESCRIPTOR = _PROBESUCCESS,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeSuccess)
  ))
_sym_db.RegisterMessage(ProbeSuccess)

ProbeError = _reflection.GeneratedProtocolMessageType('ProbeError', (_message.Message,), dict(
  DESCRIPTOR = _PROBEERROR,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeError)
  ))
_sym_db.RegisterMessage(ProbeError)

ProbeResult = _reflection.GeneratedProtocolMessageType('ProbeResult', (_message.Message,), dict(
  DESCRIPTOR = _PROBERESULT,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeResult)
  ))
_sym_db.RegisterMessage(ProbeResult)

WaitForProbeConfigRequest = _reflection.GeneratedProtocolMessageType('WaitForProbeConfigRequest', (_message.Message,), dict(
  DESCRIPTOR = _WAITFORPROBECONFIGREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.WaitForProbeConfigRequest)
  ))
_sym_db.RegisterMessage(WaitForProbeConfigRequest)

WaitForProbeConfigResponse = _reflection.GeneratedProtocolMessageType('WaitForProbeConfigResponse', (_message.Message,), dict(
  DESCRIPTOR = _WAITFORPROBECONFIGRESPONSE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.WaitForProbeConfigResponse)
  ))
_sym_db.RegisterMessage(WaitForProbeConfigResponse)

ProbeConfigRequest = _reflection.GeneratedProtocolMessageType('ProbeConfigRequest', (_message.Message,), dict(
  DESCRIPTOR = _PROBECONFIGREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeConfigRequest)
  ))
_sym_db.RegisterMessage(ProbeConfigRequest)

ProbeConfigResponse = _reflection.GeneratedProtocolMessageType('ProbeConfigResponse', (_message.Message,), dict(
  DESCRIPTOR = _PROBECONFIGRESPONSE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeConfigResponse)
  ))
_sym_db.RegisterMessage(ProbeConfigResponse)

GetConfigStreamRequest = _reflection.GeneratedProtocolMessageType('GetConfigStreamRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETCONFIGSTREAMREQUEST,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.GetConfigStreamRequest)
  ))
_sym_db.RegisterMessage(GetConfigStreamRequest)

GetConfigStreamResponse = _reflection.GeneratedProtocolMessageType('GetConfigStreamResponse', (_message.Message,), dict(
  DESCRIPTOR = _GETCONFIGSTREAMRESPONSE,
  __module__ = 'zenoss.cloud.collection_cfg_pb2'
  # @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.GetConfigStreamResponse)
  ))
_sym_db.RegisterMessage(GetConfigStreamResponse)


DESCRIPTOR._options = None

_COLLECTIONCONFIGSERVICE = _descriptor.ServiceDescriptor(
  name='CollectionConfigService',
  full_name='zenoss.cloud.collection_cfg.CollectionConfigService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1601,
  serialized_end=1899,
  methods=[
  _descriptor.MethodDescriptor(
    name='WaitForProbeConfig',
    full_name='zenoss.cloud.collection_cfg.CollectionConfigService.WaitForProbeConfig',
    index=0,
    containing_service=None,
    input_type=_WAITFORPROBECONFIGRESPONSE,
    output_type=_WAITFORPROBECONFIGREQUEST,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetConfigStream',
    full_name='zenoss.cloud.collection_cfg.CollectionConfigService.GetConfigStream',
    index=1,
    containing_service=None,
    input_type=_GETCONFIGSTREAMREQUEST,
    output_type=_GETCONFIGSTREAMRESPONSE,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_COLLECTIONCONFIGSERVICE)

DESCRIPTOR.services_by_name['CollectionConfigService'] = _COLLECTIONCONFIGSERVICE

# @@protoc_insertion_point(module_scope)
