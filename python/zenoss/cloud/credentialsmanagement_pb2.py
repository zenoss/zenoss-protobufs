# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: zenoss/cloud/credentialsmanagement.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(zenoss/cloud/credentialsmanagement.proto\x12\x0czenoss.cloud\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\"\xe7\x01\n\nCredential\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x19\n\x07\x61pi_key\x18\x03 \x01(\tH\x00R\x06\x61piKey\x12\x46\n\x11username_password\x18\x04 \x01(\x0b\x32\x17.zenoss.cloud.CredsPairH\x00R\x10usernamePassword\x12H\n\x12\x63lient_credentials\x18\x05 \x01(\x0b\x32\x17.zenoss.cloud.CredsPairH\x00R\x11\x63lientCredentialsB\x08\n\x06secret\"3\n\tCredsPair\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value\"&\n\x14GetCredentialRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\"Q\n\x15GetCredentialResponse\x12\x38\n\ncredential\x18\x01 \x01(\x0b\x32\x18.zenoss.cloud.CredentialR\ncredential2\x8e\x01\n\x14\x43redentialManagement\x12v\n\rGetCredential\x12\".zenoss.cloud.GetCredentialRequest\x1a#.zenoss.cloud.GetCredentialResponse\"\x1c\x82\xd3\xe4\x93\x02\x16\x12\x14/v1/credentials/{id}Bm\n&org.zenoss.cloud.credentialsManagementP\x01ZAgithub.com/zenoss/zenoss-protobufs/go/cloud/credentialsmanagementb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'zenoss.cloud.credentialsmanagement_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&org.zenoss.cloud.credentialsManagementP\001ZAgithub.com/zenoss/zenoss-protobufs/go/cloud/credentialsmanagement'
  _CREDENTIALMANAGEMENT.methods_by_name['GetCredential']._options = None
  _CREDENTIALMANAGEMENT.methods_by_name['GetCredential']._serialized_options = b'\202\323\344\223\002\026\022\024/v1/credentials/{id}'
  _CREDENTIAL._serialized_start=118
  _CREDENTIAL._serialized_end=349
  _CREDSPAIR._serialized_start=351
  _CREDSPAIR._serialized_end=402
  _GETCREDENTIALREQUEST._serialized_start=404
  _GETCREDENTIALREQUEST._serialized_end=442
  _GETCREDENTIALRESPONSE._serialized_start=444
  _GETCREDENTIALRESPONSE._serialized_end=525
  _CREDENTIALMANAGEMENT._serialized_start=528
  _CREDENTIALMANAGEMENT._serialized_end=670
# @@protoc_insertion_point(module_scope)
