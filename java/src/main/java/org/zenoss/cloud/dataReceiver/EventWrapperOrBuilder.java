// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface EventWrapperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.EventWrapper)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Canonical format
   * </pre>
   *
   * <code>.zenoss.cloud.Event canonical = 1 [json_name = "canonical"];</code>
   * @return Whether the canonical field is set.
   */
  boolean hasCanonical();
  /**
   * <pre>
   * Canonical format
   * </pre>
   *
   * <code>.zenoss.cloud.Event canonical = 1 [json_name = "canonical"];</code>
   * @return The canonical.
   */
  org.zenoss.cloud.dataReceiver.Event getCanonical();
  /**
   * <pre>
   * Canonical format
   * </pre>
   *
   * <code>.zenoss.cloud.Event canonical = 1 [json_name = "canonical"];</code>
   */
  org.zenoss.cloud.dataReceiver.EventOrBuilder getCanonicalOrBuilder();

  public org.zenoss.cloud.dataReceiver.EventWrapper.EventTypeCase getEventTypeCase();
}
