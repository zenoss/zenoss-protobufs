// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * timestamp is the time (in ms since epoch) at which the event occurred.
   * </pre>
   *
   * <code>int64 timestamp = 1;</code>
   */
  long getTimestamp();

  /**
   * <pre>
   * name, when combined with dimensions, makes this event unique.
   *   - should be set to the ID for systems that have an event ID concept
   *   - otherwise the same as "type"
   *   - e.g. linkDown, fault-F0157, adaeff80-b1b0-47fe-92a1-69e958145e10
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * name, when combined with dimensions, makes this event unique.
   *   - should be set to the ID for systems that have an event ID concept
   *   - otherwise the same as "type"
   *   - e.g. linkDown, fault-F0157, adaeff80-b1b0-47fe-92a1-69e958145e10
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Dimensions associated with this event.
   * Dimensions, when combined with name, make this event unique.
   *   - typically set the same as the entity to which event is related
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Dimensions associated with this event.
   * Dimensions, when combined with name, make this event unique.
   *   - typically set the same as the entity to which event is related
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  boolean containsDimensions(
      java.lang.String key);
  /**
   * Use {@link #getDimensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDimensions();
  /**
   * <pre>
   * Dimensions associated with this event.
   * Dimensions, when combined with name, make this event unique.
   *   - typically set the same as the entity to which event is related
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDimensionsMap();
  /**
   * <pre>
   * Dimensions associated with this event.
   * Dimensions, when combined with name, make this event unique.
   *   - typically set the same as the entity to which event is related
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */

  java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Dimensions associated with this event.
   * Dimensions, when combined with name, make this event unique.
   *   - typically set the same as the entity to which event is related
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */

  java.lang.String getDimensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Fields associated with this event.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 4;</code>
   */
  boolean hasMetadataFields();
  /**
   * <pre>
   * Fields associated with this event.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 4;</code>
   */
  com.google.protobuf.Struct getMetadataFields();
  /**
   * <pre>
   * Fields associated with this event.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder();

  /**
   * <pre>
   * type uniquely identifies the context-free type of event.
   *   - typically set the same as "name" for systems that have an event ID.
   *   - e.g. linkDown, fault-F0157
   * </pre>
   *
   * <code>string type = 5;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * type uniquely identifies the context-free type of event.
   *   - typically set the same as "name" for systems that have an event ID.
   *   - e.g. linkDown, fault-F0157
   * </pre>
   *
   * <code>string type = 5;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * summary is a short (&lt;128 character) summary of the event.
   *   - most commonly displayed per-event field
   *   - highly recommend to set this
   * </pre>
   *
   * <code>string summary = 6;</code>
   */
  java.lang.String getSummary();
  /**
   * <pre>
   * summary is a short (&lt;128 character) summary of the event.
   *   - most commonly displayed per-event field
   *   - highly recommend to set this
   * </pre>
   *
   * <code>string summary = 6;</code>
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <pre>
   * body is a long (? character) further description of the event.
   *   - it is not necessary to repeat summary in the body
   * </pre>
   *
   * <code>string body = 7;</code>
   */
  java.lang.String getBody();
  /**
   * <pre>
   * body is a long (? character) further description of the event.
   *   - it is not necessary to repeat summary in the body
   * </pre>
   *
   * <code>string body = 7;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * severity defines how severe the event is.
   *   - use SEVERITY_DEFAULT when not currently known
   *   - use SEVERITY_DEBUG when not severe enough to show by default
   *   - use SEVERITY_INFO when when no action is likely required
   *   - use SEVERITY_WARNING when delayed action may be required
   *   - use SEVERITY_ERROR when system is degraded, but not down
   *   - use SEVERITY_CRITICAL for system down
   * </pre>
   *
   * <code>.zenoss.cloud.Severity severity = 8;</code>
   */
  int getSeverityValue();
  /**
   * <pre>
   * severity defines how severe the event is.
   *   - use SEVERITY_DEFAULT when not currently known
   *   - use SEVERITY_DEBUG when not severe enough to show by default
   *   - use SEVERITY_INFO when when no action is likely required
   *   - use SEVERITY_WARNING when delayed action may be required
   *   - use SEVERITY_ERROR when system is degraded, but not down
   *   - use SEVERITY_CRITICAL for system down
   * </pre>
   *
   * <code>.zenoss.cloud.Severity severity = 8;</code>
   */
  org.zenoss.cloud.dataReceiver.Severity getSeverity();

  /**
   * <pre>
   * status defines the event's disposition from the system perspective.
   *   - use STATUS_DEFAULT when not currently known
   *   - use STATUS_OPEN when event is known to be actively ongoing
   *   - use STATUS_SUPPRESSED when event should be suppressed
   *   - use STATUS_CLOSED when the event is known to have subsided
   * </pre>
   *
   * <code>.zenoss.cloud.Status status = 9;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * status defines the event's disposition from the system perspective.
   *   - use STATUS_DEFAULT when not currently known
   *   - use STATUS_OPEN when event is known to be actively ongoing
   *   - use STATUS_SUPPRESSED when event should be suppressed
   *   - use STATUS_CLOSED when the event is known to have subsided
   * </pre>
   *
   * <code>.zenoss.cloud.Status status = 9;</code>
   */
  org.zenoss.cloud.dataReceiver.Status getStatus();

  /**
   * <pre>
   * acknowledged explicitly sets the events acknowledged state.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue acknowledged = 10;</code>
   */
  boolean hasAcknowledged();
  /**
   * <pre>
   * acknowledged explicitly sets the events acknowledged state.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue acknowledged = 10;</code>
   */
  com.google.protobuf.BoolValue getAcknowledged();
  /**
   * <pre>
   * acknowledged explicitly sets the events acknowledged state.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue acknowledged = 10;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAcknowledgedOrBuilder();
}
