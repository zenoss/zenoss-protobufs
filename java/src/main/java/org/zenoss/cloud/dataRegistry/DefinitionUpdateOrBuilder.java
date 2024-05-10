// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataRegistry;

public interface DefinitionUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.DefinitionUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string definition_id = 1 [json_name = "definitionId"];</code>
   * @return The definitionId.
   */
  java.lang.String getDefinitionId();
  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string definition_id = 1 [json_name = "definitionId"];</code>
   * @return The bytes for definitionId.
   */
  com.google.protobuf.ByteString
      getDefinitionIdBytes();

  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
   * @return Whether the metadataFields field is set.
   */
  boolean hasMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
   * @return The metadataFields.
   */
  com.google.protobuf.Struct getMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder();

  /**
   * <pre>
   * Determines what happens to the existing definition metadata fields.  If MERGE (default), the provided metadata
   * is merged with the existing metadata.  If REPLACE, the provided metadata replaces the metadata on the existing
   * definition.
   * </pre>
   *
   * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
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
   * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
   * @return The updateMode.
   */
  org.zenoss.cloud.dataRegistry.UpdateMode getUpdateMode();
}
