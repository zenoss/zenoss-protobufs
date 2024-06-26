// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataReceiver;

public interface StatusResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.StatusResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * failed is the count of metrics that failed to be accepted
   * </pre>
   *
   * <code>int32 failed = 1 [json_name = "failed"];</code>
   * @return The failed.
   */
  int getFailed();

  /**
   * <pre>
   * succeeded is the count of metrics that were accepted
   * </pre>
   *
   * <code>int32 succeeded = 2 [json_name = "succeeded"];</code>
   * @return The succeeded.
   */
  int getSucceeded();

  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Failed metrics only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.CompactMetricError failedCompactMetrics = 4 [json_name = "failedCompactMetrics"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.CompactMetricError> 
      getFailedCompactMetricsList();
  /**
   * <pre>
   * Failed metrics only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.CompactMetricError failedCompactMetrics = 4 [json_name = "failedCompactMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.CompactMetricError getFailedCompactMetrics(int index);
  /**
   * <pre>
   * Failed metrics only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.CompactMetricError failedCompactMetrics = 4 [json_name = "failedCompactMetrics"];</code>
   */
  int getFailedCompactMetricsCount();
  /**
   * <pre>
   * Failed metrics only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.CompactMetricError failedCompactMetrics = 4 [json_name = "failedCompactMetrics"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.CompactMetricErrorOrBuilder> 
      getFailedCompactMetricsOrBuilderList();
  /**
   * <pre>
   * Failed metrics only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.CompactMetricError failedCompactMetrics = 4 [json_name = "failedCompactMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.CompactMetricErrorOrBuilder getFailedCompactMetricsOrBuilder(
      int index);

  /**
   * <code>repeated .zenoss.cloud.TaggedMetricError failedTaggedMetrics = 5 [json_name = "failedTaggedMetrics"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.TaggedMetricError> 
      getFailedTaggedMetricsList();
  /**
   * <code>repeated .zenoss.cloud.TaggedMetricError failedTaggedMetrics = 5 [json_name = "failedTaggedMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.TaggedMetricError getFailedTaggedMetrics(int index);
  /**
   * <code>repeated .zenoss.cloud.TaggedMetricError failedTaggedMetrics = 5 [json_name = "failedTaggedMetrics"];</code>
   */
  int getFailedTaggedMetricsCount();
  /**
   * <code>repeated .zenoss.cloud.TaggedMetricError failedTaggedMetrics = 5 [json_name = "failedTaggedMetrics"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.TaggedMetricErrorOrBuilder> 
      getFailedTaggedMetricsOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.TaggedMetricError failedTaggedMetrics = 5 [json_name = "failedTaggedMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.TaggedMetricErrorOrBuilder getFailedTaggedMetricsOrBuilder(
      int index);

  /**
   * <code>repeated .zenoss.cloud.MetricError failedMetrics = 6 [json_name = "failedMetrics"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.MetricError> 
      getFailedMetricsList();
  /**
   * <code>repeated .zenoss.cloud.MetricError failedMetrics = 6 [json_name = "failedMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.MetricError getFailedMetrics(int index);
  /**
   * <code>repeated .zenoss.cloud.MetricError failedMetrics = 6 [json_name = "failedMetrics"];</code>
   */
  int getFailedMetricsCount();
  /**
   * <code>repeated .zenoss.cloud.MetricError failedMetrics = 6 [json_name = "failedMetrics"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.MetricErrorOrBuilder> 
      getFailedMetricsOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.MetricError failedMetrics = 6 [json_name = "failedMetrics"];</code>
   */
  org.zenoss.cloud.dataReceiver.MetricErrorOrBuilder getFailedMetricsOrBuilder(
      int index);
}
