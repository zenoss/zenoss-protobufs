// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface EventsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Events)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * detailedResponse: if true, return any events that failed to be sent.
   * </pre>
   *
   * <code>bool detailedResponse = 1;</code>
   * @return The detailedResponse.
   */
  boolean getDetailedResponse();

  /**
   * <pre>
   * The events
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Event events = 2;</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.Event> 
      getEventsList();
  /**
   * <pre>
   * The events
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Event events = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.Event getEvents(int index);
  /**
   * <pre>
   * The events
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Event events = 2;</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * The events
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Event events = 2;</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * The events
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Event events = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.EventOrBuilder getEventsOrBuilder(
      int index);
}