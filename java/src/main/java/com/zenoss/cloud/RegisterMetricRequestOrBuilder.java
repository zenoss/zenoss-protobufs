// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package com.zenoss.cloud;

public interface RegisterMetricRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.RegisterMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.zenoss.cloud.MetricWrapper metric = 1 [json_name = "metric"];</code>
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   * <code>.zenoss.cloud.MetricWrapper metric = 1 [json_name = "metric"];</code>
   * @return The metric.
   */
  com.zenoss.cloud.MetricWrapper getMetric();
  /**
   * <code>.zenoss.cloud.MetricWrapper metric = 1 [json_name = "metric"];</code>
   */
  com.zenoss.cloud.MetricWrapperOrBuilder getMetricOrBuilder();

  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 2 [json_name = "updateMode"];</code>
   * @return The enum numeric value on the wire for updateMode.
   */
  int getUpdateModeValue();
  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 2 [json_name = "updateMode"];</code>
   * @return The updateMode.
   */
  com.zenoss.cloud.UpdateMode getUpdateMode();
}
