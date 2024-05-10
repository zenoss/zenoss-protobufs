// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataReceiver;

public interface MetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Metric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1 [json_name = "metric"];</code>
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1 [json_name = "metric"];</code>
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <pre>
   * The time at which the value was captured
   * </pre>
   *
   * <code>int64 timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   * The metric value
   * </pre>
   *
   * <code>double value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  double getValue();

  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 4 [json_name = "dimensions"];</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 4 [json_name = "dimensions"];</code>
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
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 4 [json_name = "dimensions"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDimensionsMap();
  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 4 [json_name = "dimensions"];</code>
   */
  /* nullable */
java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Dimensions associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 4 [json_name = "dimensions"];</code>
   */
  java.lang.String getDimensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 6 [json_name = "metadataFields"];</code>
   * @return Whether the metadataFields field is set.
   */
  boolean hasMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 6 [json_name = "metadataFields"];</code>
   * @return The metadataFields.
   */
  com.google.protobuf.Struct getMetadataFields();
  /**
   * <pre>
   * Metadata for the datapoint. Note: using Struct as it is easier than AnyArray when using json representations
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 6 [json_name = "metadataFields"];</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder();
}
