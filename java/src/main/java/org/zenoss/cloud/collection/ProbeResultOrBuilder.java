// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

public interface ProbeResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.collection_cfg.ProbeResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1;</code>
   * @return Whether the success field is set.
   */
  boolean hasSuccess();
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1;</code>
   * @return The success.
   */
  org.zenoss.cloud.collection.ProbeSuccess getSuccess();
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1;</code>
   */
  org.zenoss.cloud.collection.ProbeSuccessOrBuilder getSuccessOrBuilder();

  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2;</code>
   * @return The error.
   */
  org.zenoss.cloud.collection.ProbeError getError();
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2;</code>
   */
  org.zenoss.cloud.collection.ProbeErrorOrBuilder getErrorOrBuilder();

  public org.zenoss.cloud.collection.ProbeResult.ResultCase getResultCase();
}
