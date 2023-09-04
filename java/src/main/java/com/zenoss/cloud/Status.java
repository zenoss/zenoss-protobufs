// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package com.zenoss.cloud;

/**
 * Protobuf enum {@code zenoss.cloud.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATUS_DEFAULT = 0;</code>
   */
  STATUS_DEFAULT(0),
  /**
   * <code>STATUS_OPEN = 1;</code>
   */
  STATUS_OPEN(1),
  /**
   * <code>STATUS_SUPPRESSED = 2;</code>
   */
  STATUS_SUPPRESSED(2),
  /**
   * <code>STATUS_CLOSED = 3;</code>
   */
  STATUS_CLOSED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATUS_DEFAULT = 0;</code>
   */
  public static final int STATUS_DEFAULT_VALUE = 0;
  /**
   * <code>STATUS_OPEN = 1;</code>
   */
  public static final int STATUS_OPEN_VALUE = 1;
  /**
   * <code>STATUS_SUPPRESSED = 2;</code>
   */
  public static final int STATUS_SUPPRESSED_VALUE = 2;
  /**
   * <code>STATUS_CLOSED = 3;</code>
   */
  public static final int STATUS_CLOSED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return STATUS_DEFAULT;
      case 1: return STATUS_OPEN;
      case 2: return STATUS_SUPPRESSED;
      case 3: return STATUS_CLOSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.zenoss.cloud.DataReceiverProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:zenoss.cloud.Status)
}

