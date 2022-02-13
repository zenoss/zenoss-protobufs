// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

public interface UpdateMetricRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.UpdateMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string instanceId = 1;</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <code>string instanceId = 1;</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <pre>
   * Metadata for the datapoint
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2;</code>
   * @return Whether the metadataFields field is set.
   */
  boolean hasMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2;</code>
   * @return The metadataFields.
   */
  com.google.protobuf.Struct getMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder();

  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 3;</code>
   * @return The enum numeric value on the wire for updateMode.
   */
  int getUpdateModeValue();
  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 3;</code>
   * @return The updateMode.
   */
  org.zenoss.cloud.dataRegistry.UpdateMode getUpdateMode();

  /**
   * <code>int64 timestamp = 4;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}