// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package com.zenoss.cloud;

/**
 * Protobuf enum {@code zenoss.cloud.Severity}
 */
public enum Severity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SEVERITY_DEFAULT = 0;</code>
   */
  SEVERITY_DEFAULT(0),
  /**
   * <code>SEVERITY_DEBUG = 1;</code>
   */
  SEVERITY_DEBUG(1),
  /**
   * <code>SEVERITY_INFO = 2;</code>
   */
  SEVERITY_INFO(2),
  /**
   * <code>SEVERITY_WARNING = 3;</code>
   */
  SEVERITY_WARNING(3),
  /**
   * <code>SEVERITY_ERROR = 4;</code>
   */
  SEVERITY_ERROR(4),
  /**
   * <code>SEVERITY_CRITICAL = 5;</code>
   */
  SEVERITY_CRITICAL(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SEVERITY_DEFAULT = 0;</code>
   */
  public static final int SEVERITY_DEFAULT_VALUE = 0;
  /**
   * <code>SEVERITY_DEBUG = 1;</code>
   */
  public static final int SEVERITY_DEBUG_VALUE = 1;
  /**
   * <code>SEVERITY_INFO = 2;</code>
   */
  public static final int SEVERITY_INFO_VALUE = 2;
  /**
   * <code>SEVERITY_WARNING = 3;</code>
   */
  public static final int SEVERITY_WARNING_VALUE = 3;
  /**
   * <code>SEVERITY_ERROR = 4;</code>
   */
  public static final int SEVERITY_ERROR_VALUE = 4;
  /**
   * <code>SEVERITY_CRITICAL = 5;</code>
   */
  public static final int SEVERITY_CRITICAL_VALUE = 5;


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
  public static Severity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Severity forNumber(int value) {
    switch (value) {
      case 0: return SEVERITY_DEFAULT;
      case 1: return SEVERITY_DEBUG;
      case 2: return SEVERITY_INFO;
      case 3: return SEVERITY_WARNING;
      case 4: return SEVERITY_ERROR;
      case 5: return SEVERITY_CRITICAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Severity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Severity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
          public Severity findValueByNumber(int number) {
            return Severity.forNumber(number);
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
    return com.zenoss.cloud.DataReceiverProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Severity[] VALUES = values();

  public static Severity valueOf(
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

  private Severity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:zenoss.cloud.Severity)
}

