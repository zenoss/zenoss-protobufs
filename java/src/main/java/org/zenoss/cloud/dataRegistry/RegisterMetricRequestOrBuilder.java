// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataRegistry;

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
  org.zenoss.cloud.dataReceiver.MetricWrapper getMetric();
  /**
   * <code>.zenoss.cloud.MetricWrapper metric = 1 [json_name = "metric"];</code>
   */
  org.zenoss.cloud.dataReceiver.MetricWrapperOrBuilder getMetricOrBuilder();

  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 2 [json_name = "updateMode"];</code>
   * @return The enum numeric value on the wire for updateMode.
   */
  int getUpdateModeValue();
  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 2 [json_name = "updateMode"];</code>
   * @return The updateMode.
   */
  org.zenoss.cloud.dataRegistry.UpdateMode getUpdateMode();
}
