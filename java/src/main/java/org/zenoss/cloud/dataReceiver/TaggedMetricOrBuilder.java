// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface TaggedMetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.TaggedMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1;</code>
   */
  java.lang.String getMetric();
  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1;</code>
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <pre>
   * The time at which the value was captured
   * </pre>
   *
   * <code>int64 timestamp = 2;</code>
   */
  long getTimestamp();

  /**
   * <pre>
   * The metric value
   * </pre>
   *
   * <code>double value = 3;</code>
   */
  double getValue();

  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  java.lang.String getTagsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  java.lang.String getTagsOrThrow(
      java.lang.String key);
}
