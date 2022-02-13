// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

public interface DefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Definition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1;</code>
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1;</code>
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>repeated string dimensions = 2;</code>
   * @return A list containing the dimensions.
   */
  java.util.List<java.lang.String>
      getDimensionsList();
  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>repeated string dimensions = 2;</code>
   * @return The count of dimensions.
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>repeated string dimensions = 2;</code>
   * @param index The index of the element to return.
   * @return The dimensions at the given index.
   */
  java.lang.String getDimensions(int index);
  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>repeated string dimensions = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dimensions at the given index.
   */
  com.google.protobuf.ByteString
      getDimensionsBytes(int index);

  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3;</code>
   * @return Whether the metadataFields field is set.
   */
  boolean hasMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3;</code>
   * @return The metadataFields.
   */
  com.google.protobuf.Struct getMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder();

  /**
   * <pre>
   * Determines what happens to the existing definition metadata fields.  If MERGE (default), the provided metadata
   * is merged with the existing metadata.  If REPLACE, the provided metadata replaces the metadata on the existing
   * definition.
   * </pre>
   *
   * <code>.zenoss.cloud.UpdateMode update_mode = 4;</code>
   * @return The enum numeric value on the wire for updateMode.
   */
  int getUpdateModeValue();
  /**
   * <pre>
   * Determines what happens to the existing definition metadata fields.  If MERGE (default), the provided metadata
   * is merged with the existing metadata.  If REPLACE, the provided metadata replaces the metadata on the existing
   * definition.
   * </pre>
   *
   * <code>.zenoss.cloud.UpdateMode update_mode = 4;</code>
   * @return The updateMode.
   */
  org.zenoss.cloud.dataRegistry.UpdateMode getUpdateMode();
}
