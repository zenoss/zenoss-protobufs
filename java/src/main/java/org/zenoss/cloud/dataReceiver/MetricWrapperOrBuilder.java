// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface MetricWrapperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.MetricWrapper)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Verbose format
   * </pre>
   *
   * <code>.zenoss.cloud.TaggedMetric tagged = 1;</code>
   * @return Whether the tagged field is set.
   */
  boolean hasTagged();
  /**
   * <pre>
   * Verbose format
   * </pre>
   *
   * <code>.zenoss.cloud.TaggedMetric tagged = 1;</code>
   * @return The tagged.
   */
  org.zenoss.cloud.dataReceiver.TaggedMetric getTagged();
  /**
   * <pre>
   * Verbose format
   * </pre>
   *
   * <code>.zenoss.cloud.TaggedMetric tagged = 1;</code>
   */
  org.zenoss.cloud.dataReceiver.TaggedMetricOrBuilder getTaggedOrBuilder();

  /**
   * <pre>
   * Compact format
   * </pre>
   *
   * <code>.zenoss.cloud.CompactMetric compact = 2;</code>
   * @return Whether the compact field is set.
   */
  boolean hasCompact();
  /**
   * <pre>
   * Compact format
   * </pre>
   *
   * <code>.zenoss.cloud.CompactMetric compact = 2;</code>
   * @return The compact.
   */
  org.zenoss.cloud.dataReceiver.CompactMetric getCompact();
  /**
   * <pre>
   * Compact format
   * </pre>
   *
   * <code>.zenoss.cloud.CompactMetric compact = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder getCompactOrBuilder();

  /**
   * <pre>
   * Canonical format
   * </pre>
   *
   * <code>.zenoss.cloud.Metric canonical = 3;</code>
   * @return Whether the canonical field is set.
   */
  boolean hasCanonical();
  /**
   * <pre>
   * Canonical format
   * </pre>
   *
   * <code>.zenoss.cloud.Metric canonical = 3;</code>
   * @return The canonical.
   */
  org.zenoss.cloud.dataReceiver.Metric getCanonical();
  /**
   * <pre>
   * Canonical format
   * </pre>
   *
   * <code>.zenoss.cloud.Metric canonical = 3;</code>
   */
  org.zenoss.cloud.dataReceiver.MetricOrBuilder getCanonicalOrBuilder();

  public org.zenoss.cloud.dataReceiver.MetricWrapper.MetricTypeCase getMetricTypeCase();
}
