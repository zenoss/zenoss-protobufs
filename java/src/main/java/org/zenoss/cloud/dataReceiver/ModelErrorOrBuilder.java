// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface ModelErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.ModelError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string error = 1;</code>
   */
  java.lang.String getError();
  /**
   * <code>string error = 1;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>.zenoss.cloud.Model model = 2;</code>
   */
  boolean hasModel();
  /**
   * <code>.zenoss.cloud.Model model = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.Model getModel();
  /**
   * <code>.zenoss.cloud.Model model = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.ModelOrBuilder getModelOrBuilder();
}
