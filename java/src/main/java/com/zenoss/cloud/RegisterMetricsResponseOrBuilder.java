// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package com.zenoss.cloud;

public interface RegisterMetricsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.RegisterMetricsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  java.util.List<com.zenoss.cloud.RegisterMetricVerboseResponse> 
      getResponsesList();
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  com.zenoss.cloud.RegisterMetricVerboseResponse getResponses(int index);
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  java.util.List<? extends com.zenoss.cloud.RegisterMetricVerboseResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.RegisterMetricVerboseResponse responses = 1 [json_name = "responses"];</code>
   */
  com.zenoss.cloud.RegisterMetricVerboseResponseOrBuilder getResponsesOrBuilder(
      int index);
}
