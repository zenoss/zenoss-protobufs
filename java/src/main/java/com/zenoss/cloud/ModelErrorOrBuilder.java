// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package com.zenoss.cloud;

public interface ModelErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.ModelError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string error = 1 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 1 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>.zenoss.cloud.Model model = 2 [json_name = "model"];</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.zenoss.cloud.Model model = 2 [json_name = "model"];</code>
   * @return The model.
   */
  com.zenoss.cloud.Model getModel();
  /**
   * <code>.zenoss.cloud.Model model = 2 [json_name = "model"];</code>
   */
  com.zenoss.cloud.ModelOrBuilder getModelOrBuilder();
}
