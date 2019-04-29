// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public final class DataReceiver {
  private DataReceiver() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Void_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_TaggedMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_TaggedMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_TaggedMetric_TagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_TaggedMetric_TagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_CompactMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_CompactMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Metric_DimensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Metric_DimensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Model_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Model_DimensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Model_DimensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Models_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Models_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_ModelError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_ModelError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_ModelStatusResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_ModelStatusResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_StatusResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_StatusResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_MetricWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_MetricWrapper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_MetricBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_MetricBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_MetricBatch_GlobalTagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_MetricBatch_GlobalTagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_CompactMetricError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_CompactMetricError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_MetricError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_MetricError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_TaggedMetricError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_TaggedMetricError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zenoss_cloud_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zenoss_cloud_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n zenoss/cloud/data_receiver.proto\022\014zeno" +
      "ss.cloud\032\034google/protobuf/struct.proto\"\006" +
      "\n\004Void\"\241\001\n\014TaggedMetric\022\016\n\006metric\030\001 \001(\t\022" +
      "\021\n\ttimestamp\030\002 \001(\003\022\r\n\005value\030\003 \001(\001\0222\n\004tag" +
      "s\030\004 \003(\0132$.zenoss.cloud.TaggedMetric.Tags" +
      "Entry\032+\n\tTagsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001\"=\n\rCompactMetric\022\n\n\002id\030\001 \001(\t\022" +
      "\021\n\ttimestamp\030\002 \001(\003\022\r\n\005value\030\003 \001(\001\"\330\001\n\006Me" +
      "tric\022\016\n\006metric\030\001 \001(\t\022\021\n\ttimestamp\030\002 \001(\003\022" +
      "\r\n\005value\030\003 \001(\001\0228\n\ndimensions\030\004 \003(\0132$.zen",
      "oss.cloud.Metric.DimensionsEntry\022/\n\016meta" +
      "dataFields\030\006 \001(\0132\027.google.protobuf.Struc" +
      "t\0321\n\017DimensionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\"\267\001\n\005Model\022\021\n\ttimestamp\030\001 \001(" +
      "\003\0227\n\ndimensions\030\002 \003(\0132#.zenoss.cloud.Mod" +
      "el.DimensionsEntry\022/\n\016metadataFields\030\003 \001" +
      "(\0132\027.google.protobuf.Struct\0321\n\017Dimension" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"G" +
      "\n\006Models\022\030\n\020detailedResponse\030\001 \001(\010\022#\n\006mo" +
      "dels\030\002 \003(\0132\023.zenoss.cloud.Model\"?\n\nModel",
      "Error\022\r\n\005error\030\001 \001(\t\022\"\n\005model\030\002 \001(\0132\023.ze" +
      "noss.cloud.Model\"w\n\021ModelStatusResult\022\016\n" +
      "\006failed\030\001 \001(\005\022\021\n\tsucceeded\030\002 \001(\005\022\017\n\007mess" +
      "age\030\003 \001(\t\022.\n\014failedModels\030\004 \003(\0132\030.zenoss" +
      ".cloud.ModelError\"\362\001\n\014StatusResult\022\016\n\006fa" +
      "iled\030\001 \001(\005\022\021\n\tsucceeded\030\002 \001(\005\022\017\n\007message" +
      "\030\003 \001(\t\022>\n\024failedCompactMetrics\030\004 \003(\0132 .z" +
      "enoss.cloud.CompactMetricError\022<\n\023failed" +
      "TaggedMetrics\030\005 \003(\0132\037.zenoss.cloud.Tagge" +
      "dMetricError\0220\n\rfailedMetrics\030\006 \003(\0132\031.ze",
      "noss.cloud.MetricError\"\247\001\n\rMetricWrapper" +
      "\022,\n\006tagged\030\001 \001(\0132\032.zenoss.cloud.TaggedMe" +
      "tricH\000\022.\n\007compact\030\002 \001(\0132\033.zenoss.cloud.C" +
      "ompactMetricH\000\022)\n\tcanonical\030\003 \001(\0132\024.zeno" +
      "ss.cloud.MetricH\000B\r\n\013metric_type\"\256\001\n\013Met" +
      "ricBatch\022>\n\013global_tags\030\002 \003(\0132).zenoss.c" +
      "loud.MetricBatch.GlobalTagsEntry\022,\n\007metr" +
      "ics\030\003 \003(\0132\033.zenoss.cloud.MetricWrapper\0321" +
      "\n\017GlobalTagsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030" +
      "\002 \001(\t:\0028\001\"P\n\022CompactMetricError\022\r\n\005error",
      "\030\001 \001(\t\022+\n\006metric\030\002 \001(\0132\033.zenoss.cloud.Co" +
      "mpactMetric\"B\n\013MetricError\022\r\n\005error\030\001 \001(" +
      "\t\022$\n\006metric\030\002 \001(\0132\024.zenoss.cloud.Metric\"" +
      "N\n\021TaggedMetricError\022\r\n\005error\030\001 \001(\t\022*\n\006m" +
      "etric\030\002 \001(\0132\032.zenoss.cloud.TaggedMetric\"" +
      "\262\001\n\007Metrics\022\030\n\020detailedResponse\030\001 \001(\010\0223\n" +
      "\016compactMetrics\030\003 \003(\0132\033.zenoss.cloud.Com" +
      "pactMetric\0221\n\rtaggedMetrics\030\004 \003(\0132\032.zeno" +
      "ss.cloud.TaggedMetric\022%\n\007metrics\030\005 \003(\0132\024" +
      ".zenoss.cloud.Metric2\340\001\n\023DataReceiverSer",
      "vice\022A\n\nPutMetrics\022\025.zenoss.cloud.Metric" +
      "s\032\032.zenoss.cloud.StatusResult\"\000\022@\n\tPutMe" +
      "tric\022\033.zenoss.cloud.MetricWrapper\032\022.zeno" +
      "ss.cloud.Void\"\000(\001\022D\n\tPutModels\022\024.zenoss." +
      "cloud.Models\032\037.zenoss.cloud.ModelStatusR" +
      "esult\"\000B\\\n\035org.zenoss.cloud.dataReceiver" +
      "P\001Z9github.com/zenoss/zenoss-protobufs/g" +
      "o/cloud/data_receiverb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_zenoss_cloud_Void_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zenoss_cloud_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Void_descriptor,
        new java.lang.String[] { });
    internal_static_zenoss_cloud_TaggedMetric_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zenoss_cloud_TaggedMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_TaggedMetric_descriptor,
        new java.lang.String[] { "Metric", "Timestamp", "Value", "Tags", });
    internal_static_zenoss_cloud_TaggedMetric_TagsEntry_descriptor =
      internal_static_zenoss_cloud_TaggedMetric_descriptor.getNestedTypes().get(0);
    internal_static_zenoss_cloud_TaggedMetric_TagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_TaggedMetric_TagsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_zenoss_cloud_CompactMetric_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_zenoss_cloud_CompactMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_CompactMetric_descriptor,
        new java.lang.String[] { "Id", "Timestamp", "Value", });
    internal_static_zenoss_cloud_Metric_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_zenoss_cloud_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Metric_descriptor,
        new java.lang.String[] { "Metric", "Timestamp", "Value", "Dimensions", "MetadataFields", });
    internal_static_zenoss_cloud_Metric_DimensionsEntry_descriptor =
      internal_static_zenoss_cloud_Metric_descriptor.getNestedTypes().get(0);
    internal_static_zenoss_cloud_Metric_DimensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Metric_DimensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_zenoss_cloud_Model_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_zenoss_cloud_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Model_descriptor,
        new java.lang.String[] { "Timestamp", "Dimensions", "MetadataFields", });
    internal_static_zenoss_cloud_Model_DimensionsEntry_descriptor =
      internal_static_zenoss_cloud_Model_descriptor.getNestedTypes().get(0);
    internal_static_zenoss_cloud_Model_DimensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Model_DimensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_zenoss_cloud_Models_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_zenoss_cloud_Models_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Models_descriptor,
        new java.lang.String[] { "DetailedResponse", "Models", });
    internal_static_zenoss_cloud_ModelError_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_zenoss_cloud_ModelError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_ModelError_descriptor,
        new java.lang.String[] { "Error", "Model", });
    internal_static_zenoss_cloud_ModelStatusResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_zenoss_cloud_ModelStatusResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_ModelStatusResult_descriptor,
        new java.lang.String[] { "Failed", "Succeeded", "Message", "FailedModels", });
    internal_static_zenoss_cloud_StatusResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_zenoss_cloud_StatusResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_StatusResult_descriptor,
        new java.lang.String[] { "Failed", "Succeeded", "Message", "FailedCompactMetrics", "FailedTaggedMetrics", "FailedMetrics", });
    internal_static_zenoss_cloud_MetricWrapper_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_zenoss_cloud_MetricWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_MetricWrapper_descriptor,
        new java.lang.String[] { "Tagged", "Compact", "Canonical", "MetricType", });
    internal_static_zenoss_cloud_MetricBatch_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_zenoss_cloud_MetricBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_MetricBatch_descriptor,
        new java.lang.String[] { "GlobalTags", "Metrics", });
    internal_static_zenoss_cloud_MetricBatch_GlobalTagsEntry_descriptor =
      internal_static_zenoss_cloud_MetricBatch_descriptor.getNestedTypes().get(0);
    internal_static_zenoss_cloud_MetricBatch_GlobalTagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_MetricBatch_GlobalTagsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_zenoss_cloud_CompactMetricError_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_zenoss_cloud_CompactMetricError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_CompactMetricError_descriptor,
        new java.lang.String[] { "Error", "Metric", });
    internal_static_zenoss_cloud_MetricError_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_zenoss_cloud_MetricError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_MetricError_descriptor,
        new java.lang.String[] { "Error", "Metric", });
    internal_static_zenoss_cloud_TaggedMetricError_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_zenoss_cloud_TaggedMetricError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_TaggedMetricError_descriptor,
        new java.lang.String[] { "Error", "Metric", });
    internal_static_zenoss_cloud_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_zenoss_cloud_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zenoss_cloud_Metrics_descriptor,
        new java.lang.String[] { "DetailedResponse", "CompactMetrics", "TaggedMetrics", "Metrics", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
