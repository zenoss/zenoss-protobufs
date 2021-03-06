// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface ModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time when the value was sent.
   * </pre>
   *
   * <code>int64 timestamp = 1;</code>
   */
  long getTimestamp();

  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2;</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2;</code>
   */
  boolean containsDimensions(
      java.lang.String key);
  /**
   * Use {@link #getDimensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDimensions();
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDimensionsMap();
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2;</code>
   */

  java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2;</code>
   */

  java.lang.String getDimensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Fields associated with this model.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3;</code>
   */
  boolean hasMetadataFields();
  /**
   * <pre>
   * Fields associated with this model.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3;</code>
   */
  com.google.protobuf.Struct getMetadataFields();
  /**
   * <pre>
   * Fields associated with this model.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder();
}
