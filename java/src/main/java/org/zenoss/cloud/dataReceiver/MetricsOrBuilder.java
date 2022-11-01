// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface MetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Metrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * detailedResponse if set to true will return any metrics that failed to be sent
   * </pre>
   *
   * <code>bool detailedResponse = 1 [json_name = "detailedResponse"];</code>
   * @return The detailedResponse.
   */
  boolean getDetailedResponse();

  /**
   * <code>repeated .zenoss.cloud.CompactMetric compactMetrics = 3 [json_name = "compactMetrics"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.CompactMetric> 
      getCompactMetricsList();
  /**
   * <code>repeated .zenoss.cloud.CompactMetric compactMetrics = 3 [json_name = "compactMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.CompactMetric getCompactMetrics(int index);
  /**
   * <code>repeated .zenoss.cloud.CompactMetric compactMetrics = 3 [json_name = "compactMetrics"];</code>
   */
  int getCompactMetricsCount();
  /**
   * <code>repeated .zenoss.cloud.CompactMetric compactMetrics = 3 [json_name = "compactMetrics"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder> 
      getCompactMetricsOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.CompactMetric compactMetrics = 3 [json_name = "compactMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder getCompactMetricsOrBuilder(
      int index);

  /**
   * <code>repeated .zenoss.cloud.TaggedMetric taggedMetrics = 4 [json_name = "taggedMetrics"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.TaggedMetric> 
      getTaggedMetricsList();
  /**
   * <code>repeated .zenoss.cloud.TaggedMetric taggedMetrics = 4 [json_name = "taggedMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.TaggedMetric getTaggedMetrics(int index);
  /**
   * <code>repeated .zenoss.cloud.TaggedMetric taggedMetrics = 4 [json_name = "taggedMetrics"];</code>
   */
  int getTaggedMetricsCount();
  /**
   * <code>repeated .zenoss.cloud.TaggedMetric taggedMetrics = 4 [json_name = "taggedMetrics"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.TaggedMetricOrBuilder> 
      getTaggedMetricsOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.TaggedMetric taggedMetrics = 4 [json_name = "taggedMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.TaggedMetricOrBuilder getTaggedMetricsOrBuilder(
      int index);

  /**
   * <code>repeated .zenoss.cloud.Metric metrics = 5 [json_name = "metrics"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.Metric> 
      getMetricsList();
  /**
   * <code>repeated .zenoss.cloud.Metric metrics = 5 [json_name = "metrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.Metric getMetrics(int index);
  /**
   * <code>repeated .zenoss.cloud.Metric metrics = 5 [json_name = "metrics"];</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .zenoss.cloud.Metric metrics = 5 [json_name = "metrics"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.MetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.Metric metrics = 5 [json_name = "metrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.MetricOrBuilder getMetricsOrBuilder(
      int index);
}
