// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface EventStatusResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.EventStatusResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * failed is the count of events that failed to be accepted
   * </pre>
   *
   * <code>int32 failed = 1;</code>
   * @return The failed.
   */
  int getFailed();

  /**
   * <pre>
   * succeeded is the count of events that were accepted
   * </pre>
   *
   * <code>int32 succeeded = 2;</code>
   * @return The succeeded.
   */
  int getSucceeded();

  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.EventError> 
      getFailedEventsList();
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  org.zenoss.cloud.dataReceiver.EventError getFailedEvents(int index);
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  int getFailedEventsCount();
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.EventErrorOrBuilder> 
      getFailedEventsOrBuilderList();
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  org.zenoss.cloud.dataReceiver.EventErrorOrBuilder getFailedEventsOrBuilder(
      int index);
}
