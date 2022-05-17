// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

public final class CollectionCfg {
  private CollectionCfg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_Configuration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_Configuration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_ProbeSuccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_ProbeSuccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_ProbeError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_ProbeError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_FieldError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_FieldError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_ProbeResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_ProbeResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_GetConfigStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_GetConfigStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!zenoss/cloud/collection_cfg.proto\022\033zen" +
      "oss.cloud.collection_cfg\"u\n\006Config\022\n\n\002id" +
      "\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006tenant\030\003 \001(\t\022A\n\r" +
      "configuration\030\004 \001(\0132*.zenoss.cloud.colle" +
      "ction_cfg.Configuration\"+\n\rConfiguration" +
      "\022\014\n\004type\030\001 \001(\t\022\014\n\004data\030\002 \001(\t\"\016\n\014ProbeSuc" +
      "cess\"`\n\nProbeError\022\023\n\013description\030\001 \001(\t\022" +
      "=\n\014field_errors\030\002 \003(\0132\'.zenoss.cloud.col" +
      "lection_cfg.FieldError\"0\n\nFieldError\022\r\n\005" +
      "field\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\"\217\001\n\013Pro" +
      "beResult\022<\n\007success\030\001 \001(\0132).zenoss.cloud" +
      ".collection_cfg.ProbeSuccessH\000\0228\n\005error\030" +
      "\002 \001(\0132\'.zenoss.cloud.collection_cfg.Prob" +
      "eErrorH\000B\010\n\006result\"i\n\031WaitForProbeConfig" +
      "Request\022:\n\rconfiguration\030\001 \001(\0132#.zenoss." +
      "cloud.collection_cfg.Config\022\020\n\010deadline\030" +
      "\002 \001(\003\"i\n\032WaitForProbeConfigResponse\022\021\n\tc" +
      "onfig_id\030\001 \001(\t\0228\n\006result\030\002 \001(\0132(.zenoss." +
      "cloud.collection_cfg.ProbeResult\"\030\n\026GetC" +
      "onfigStreamRequest\"U\n\027GetConfigStreamRes" +
      "ponse\022:\n\rconfiguration\030\001 \003(\0132#.zenoss.cl" +
      "oud.collection_cfg.Config2\252\002\n\027Collection" +
      "ConfigService\022\213\001\n\022WaitForProbeConfig\0227.z" +
      "enoss.cloud.collection_cfg.WaitForProbeC" +
      "onfigResponse\0326.zenoss.cloud.collection_" +
      "cfg.WaitForProbeConfigRequest\"\000(\0010\001\022\200\001\n\017" +
      "GetConfigStream\0223.zenoss.cloud.collectio" +
      "n_cfg.GetConfigStreamRequest\0324.zenoss.cl" +
      "oud.collection_cfg.GetConfigStreamRespon" +
      "se\"\0000\001BW\n\033org.zenoss.cloud.collectionP\001Z" +
      "6github.com/zenoss/zenoss-protobufs/go/c" +
      "loud/collectionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_zenoss_cloud_collection_cfg_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zenoss_cloud_collection_cfg_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_Config_descriptor,
        new java.lang.String[] { "Id", "Name", "Tenant", "Configuration", });
    internal_static_zenoss_cloud_collection_cfg_Configuration_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zenoss_cloud_collection_cfg_Configuration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_Configuration_descriptor,
        new java.lang.String[] { "Type", "Data", });
    internal_static_zenoss_cloud_collection_cfg_ProbeSuccess_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_zenoss_cloud_collection_cfg_ProbeSuccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_ProbeSuccess_descriptor,
        new java.lang.String[] { });
    internal_static_zenoss_cloud_collection_cfg_ProbeError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_zenoss_cloud_collection_cfg_ProbeError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_ProbeError_descriptor,
        new java.lang.String[] { "Description", "FieldErrors", });
    internal_static_zenoss_cloud_collection_cfg_FieldError_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_zenoss_cloud_collection_cfg_FieldError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_FieldError_descriptor,
        new java.lang.String[] { "Field", "Description", });
    internal_static_zenoss_cloud_collection_cfg_ProbeResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_zenoss_cloud_collection_cfg_ProbeResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_ProbeResult_descriptor,
        new java.lang.String[] { "Success", "Error", "Result", });
    internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigRequest_descriptor,
        new java.lang.String[] { "Configuration", "Deadline", });
    internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_descriptor,
        new java.lang.String[] { "ConfigId", "Result", });
    internal_static_zenoss_cloud_collection_cfg_GetConfigStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_zenoss_cloud_collection_cfg_GetConfigStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_GetConfigStreamRequest_descriptor,
        new java.lang.String[] { });
    internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_descriptor,
        new java.lang.String[] { "Configuration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
