// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

public interface RegisterMetricVerboseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.RegisterMetricVerboseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
   */
  boolean hasResponse();
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
   */
  org.zenoss.cloud.dataRegistry.RegisterMetricResponse getResponse();
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
   */
  org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder getResponseOrBuilder();

  /**
   * <code>string error = 2;</code>
   */
  java.lang.String getError();
  /**
   * <code>string error = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
