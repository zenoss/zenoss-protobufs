// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

public interface WaitForProbeConfigResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.collection_cfg.WaitForProbeConfigResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string config_id = 1 [json_name = "configId"];</code>
   * @return The configId.
   */
  java.lang.String getConfigId();
  /**
   * <code>string config_id = 1 [json_name = "configId"];</code>
   * @return The bytes for configId.
   */
  com.google.protobuf.ByteString
      getConfigIdBytes();

  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
   * @return The result.
   */
  org.zenoss.cloud.collection.ProbeResult getResult();
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
   */
  org.zenoss.cloud.collection.ProbeResultOrBuilder getResultOrBuilder();
}
