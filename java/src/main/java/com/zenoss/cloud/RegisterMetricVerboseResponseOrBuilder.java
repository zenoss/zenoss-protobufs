// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package com.zenoss.cloud;

public interface RegisterMetricVerboseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.RegisterMetricVerboseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
   * @return The response.
   */
  com.zenoss.cloud.RegisterMetricResponse getResponse();
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
   */
  com.zenoss.cloud.RegisterMetricResponseOrBuilder getResponseOrBuilder();

  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
