// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataRegistry;

public interface RegisterMetricsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.RegisterMetricsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  java.util.List<org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse> 
      getResponsesList();
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse getResponses(int index);
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponseOrBuilder getResponsesOrBuilder(
      int index);
}
