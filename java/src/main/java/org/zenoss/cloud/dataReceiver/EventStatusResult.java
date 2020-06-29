// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

/**
 * Protobuf type {@code zenoss.cloud.EventStatusResult}
 */
public  final class EventStatusResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.EventStatusResult)
    EventStatusResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventStatusResult.newBuilder() to construct.
  private EventStatusResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventStatusResult() {
    failed_ = 0;
    succeeded_ = 0;
    message_ = "";
    failedEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventStatusResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            failed_ = input.readInt32();
            break;
          }
          case 16: {

            succeeded_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              failedEvents_ = new java.util.ArrayList<org.zenoss.cloud.dataReceiver.EventError>();
              mutable_bitField0_ |= 0x00000008;
            }
            failedEvents_.add(
                input.readMessage(org.zenoss.cloud.dataReceiver.EventError.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        failedEvents_ = java.util.Collections.unmodifiableList(failedEvents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_EventStatusResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_EventStatusResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataReceiver.EventStatusResult.class, org.zenoss.cloud.dataReceiver.EventStatusResult.Builder.class);
  }

  private int bitField0_;
  public static final int FAILED_FIELD_NUMBER = 1;
  private int failed_;
  /**
   * <pre>
   * failed is the count of events that failed to be accepted
   * </pre>
   *
   * <code>int32 failed = 1;</code>
   */
  public int getFailed() {
    return failed_;
  }

  public static final int SUCCEEDED_FIELD_NUMBER = 2;
  private int succeeded_;
  /**
   * <pre>
   * succeeded is the count of events that were accepted
   * </pre>
   *
   * <code>int32 succeeded = 2;</code>
   */
  public int getSucceeded() {
    return succeeded_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILEDEVENTS_FIELD_NUMBER = 4;
  private java.util.List<org.zenoss.cloud.dataReceiver.EventError> failedEvents_;
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  public java.util.List<org.zenoss.cloud.dataReceiver.EventError> getFailedEventsList() {
    return failedEvents_;
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  public java.util.List<? extends org.zenoss.cloud.dataReceiver.EventErrorOrBuilder> 
      getFailedEventsOrBuilderList() {
    return failedEvents_;
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  public int getFailedEventsCount() {
    return failedEvents_.size();
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  public org.zenoss.cloud.dataReceiver.EventError getFailedEvents(int index) {
    return failedEvents_.get(index);
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
   */
  public org.zenoss.cloud.dataReceiver.EventErrorOrBuilder getFailedEventsOrBuilder(
      int index) {
    return failedEvents_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (failed_ != 0) {
      output.writeInt32(1, failed_);
    }
    if (succeeded_ != 0) {
      output.writeInt32(2, succeeded_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    for (int i = 0; i < failedEvents_.size(); i++) {
      output.writeMessage(4, failedEvents_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (failed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, failed_);
    }
    if (succeeded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, succeeded_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    for (int i = 0; i < failedEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, failedEvents_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.zenoss.cloud.dataReceiver.EventStatusResult)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataReceiver.EventStatusResult other = (org.zenoss.cloud.dataReceiver.EventStatusResult) obj;

    boolean result = true;
    result = result && (getFailed()
        == other.getFailed());
    result = result && (getSucceeded()
        == other.getSucceeded());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getFailedEventsList()
        .equals(other.getFailedEventsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FAILED_FIELD_NUMBER;
    hash = (53 * hash) + getFailed();
    hash = (37 * hash) + SUCCEEDED_FIELD_NUMBER;
    hash = (53 * hash) + getSucceeded();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (getFailedEventsCount() > 0) {
      hash = (37 * hash) + FAILEDEVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getFailedEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.EventStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.zenoss.cloud.dataReceiver.EventStatusResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code zenoss.cloud.EventStatusResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.EventStatusResult)
      org.zenoss.cloud.dataReceiver.EventStatusResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_EventStatusResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_EventStatusResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataReceiver.EventStatusResult.class, org.zenoss.cloud.dataReceiver.EventStatusResult.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataReceiver.EventStatusResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFailedEventsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      failed_ = 0;

      succeeded_ = 0;

      message_ = "";

      if (failedEventsBuilder_ == null) {
        failedEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        failedEventsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_EventStatusResult_descriptor;
    }

    public org.zenoss.cloud.dataReceiver.EventStatusResult getDefaultInstanceForType() {
      return org.zenoss.cloud.dataReceiver.EventStatusResult.getDefaultInstance();
    }

    public org.zenoss.cloud.dataReceiver.EventStatusResult build() {
      org.zenoss.cloud.dataReceiver.EventStatusResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zenoss.cloud.dataReceiver.EventStatusResult buildPartial() {
      org.zenoss.cloud.dataReceiver.EventStatusResult result = new org.zenoss.cloud.dataReceiver.EventStatusResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.failed_ = failed_;
      result.succeeded_ = succeeded_;
      result.message_ = message_;
      if (failedEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          failedEvents_ = java.util.Collections.unmodifiableList(failedEvents_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.failedEvents_ = failedEvents_;
      } else {
        result.failedEvents_ = failedEventsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.dataReceiver.EventStatusResult) {
        return mergeFrom((org.zenoss.cloud.dataReceiver.EventStatusResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataReceiver.EventStatusResult other) {
      if (other == org.zenoss.cloud.dataReceiver.EventStatusResult.getDefaultInstance()) return this;
      if (other.getFailed() != 0) {
        setFailed(other.getFailed());
      }
      if (other.getSucceeded() != 0) {
        setSucceeded(other.getSucceeded());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (failedEventsBuilder_ == null) {
        if (!other.failedEvents_.isEmpty()) {
          if (failedEvents_.isEmpty()) {
            failedEvents_ = other.failedEvents_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFailedEventsIsMutable();
            failedEvents_.addAll(other.failedEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.failedEvents_.isEmpty()) {
          if (failedEventsBuilder_.isEmpty()) {
            failedEventsBuilder_.dispose();
            failedEventsBuilder_ = null;
            failedEvents_ = other.failedEvents_;
            bitField0_ = (bitField0_ & ~0x00000008);
            failedEventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFailedEventsFieldBuilder() : null;
          } else {
            failedEventsBuilder_.addAllMessages(other.failedEvents_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.zenoss.cloud.dataReceiver.EventStatusResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.dataReceiver.EventStatusResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int failed_ ;
    /**
     * <pre>
     * failed is the count of events that failed to be accepted
     * </pre>
     *
     * <code>int32 failed = 1;</code>
     */
    public int getFailed() {
      return failed_;
    }
    /**
     * <pre>
     * failed is the count of events that failed to be accepted
     * </pre>
     *
     * <code>int32 failed = 1;</code>
     */
    public Builder setFailed(int value) {
      
      failed_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failed is the count of events that failed to be accepted
     * </pre>
     *
     * <code>int32 failed = 1;</code>
     */
    public Builder clearFailed() {
      
      failed_ = 0;
      onChanged();
      return this;
    }

    private int succeeded_ ;
    /**
     * <pre>
     * succeeded is the count of events that were accepted
     * </pre>
     *
     * <code>int32 succeeded = 2;</code>
     */
    public int getSucceeded() {
      return succeeded_;
    }
    /**
     * <pre>
     * succeeded is the count of events that were accepted
     * </pre>
     *
     * <code>int32 succeeded = 2;</code>
     */
    public Builder setSucceeded(int value) {
      
      succeeded_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * succeeded is the count of events that were accepted
     * </pre>
     *
     * <code>int32 succeeded = 2;</code>
     */
    public Builder clearSucceeded() {
      
      succeeded_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.zenoss.cloud.dataReceiver.EventError> failedEvents_ =
      java.util.Collections.emptyList();
    private void ensureFailedEventsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        failedEvents_ = new java.util.ArrayList<org.zenoss.cloud.dataReceiver.EventError>(failedEvents_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.zenoss.cloud.dataReceiver.EventError, org.zenoss.cloud.dataReceiver.EventError.Builder, org.zenoss.cloud.dataReceiver.EventErrorOrBuilder> failedEventsBuilder_;

    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public java.util.List<org.zenoss.cloud.dataReceiver.EventError> getFailedEventsList() {
      if (failedEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(failedEvents_);
      } else {
        return failedEventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public int getFailedEventsCount() {
      if (failedEventsBuilder_ == null) {
        return failedEvents_.size();
      } else {
        return failedEventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public org.zenoss.cloud.dataReceiver.EventError getFailedEvents(int index) {
      if (failedEventsBuilder_ == null) {
        return failedEvents_.get(index);
      } else {
        return failedEventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder setFailedEvents(
        int index, org.zenoss.cloud.dataReceiver.EventError value) {
      if (failedEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedEventsIsMutable();
        failedEvents_.set(index, value);
        onChanged();
      } else {
        failedEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder setFailedEvents(
        int index, org.zenoss.cloud.dataReceiver.EventError.Builder builderForValue) {
      if (failedEventsBuilder_ == null) {
        ensureFailedEventsIsMutable();
        failedEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        failedEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder addFailedEvents(org.zenoss.cloud.dataReceiver.EventError value) {
      if (failedEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedEventsIsMutable();
        failedEvents_.add(value);
        onChanged();
      } else {
        failedEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder addFailedEvents(
        int index, org.zenoss.cloud.dataReceiver.EventError value) {
      if (failedEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedEventsIsMutable();
        failedEvents_.add(index, value);
        onChanged();
      } else {
        failedEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder addFailedEvents(
        org.zenoss.cloud.dataReceiver.EventError.Builder builderForValue) {
      if (failedEventsBuilder_ == null) {
        ensureFailedEventsIsMutable();
        failedEvents_.add(builderForValue.build());
        onChanged();
      } else {
        failedEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder addFailedEvents(
        int index, org.zenoss.cloud.dataReceiver.EventError.Builder builderForValue) {
      if (failedEventsBuilder_ == null) {
        ensureFailedEventsIsMutable();
        failedEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        failedEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder addAllFailedEvents(
        java.lang.Iterable<? extends org.zenoss.cloud.dataReceiver.EventError> values) {
      if (failedEventsBuilder_ == null) {
        ensureFailedEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, failedEvents_);
        onChanged();
      } else {
        failedEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder clearFailedEvents() {
      if (failedEventsBuilder_ == null) {
        failedEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        failedEventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public Builder removeFailedEvents(int index) {
      if (failedEventsBuilder_ == null) {
        ensureFailedEventsIsMutable();
        failedEvents_.remove(index);
        onChanged();
      } else {
        failedEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public org.zenoss.cloud.dataReceiver.EventError.Builder getFailedEventsBuilder(
        int index) {
      return getFailedEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public org.zenoss.cloud.dataReceiver.EventErrorOrBuilder getFailedEventsOrBuilder(
        int index) {
      if (failedEventsBuilder_ == null) {
        return failedEvents_.get(index);  } else {
        return failedEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public java.util.List<? extends org.zenoss.cloud.dataReceiver.EventErrorOrBuilder> 
         getFailedEventsOrBuilderList() {
      if (failedEventsBuilder_ != null) {
        return failedEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(failedEvents_);
      }
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public org.zenoss.cloud.dataReceiver.EventError.Builder addFailedEventsBuilder() {
      return getFailedEventsFieldBuilder().addBuilder(
          org.zenoss.cloud.dataReceiver.EventError.getDefaultInstance());
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public org.zenoss.cloud.dataReceiver.EventError.Builder addFailedEventsBuilder(
        int index) {
      return getFailedEventsFieldBuilder().addBuilder(
          index, org.zenoss.cloud.dataReceiver.EventError.getDefaultInstance());
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4;</code>
     */
    public java.util.List<org.zenoss.cloud.dataReceiver.EventError.Builder> 
         getFailedEventsBuilderList() {
      return getFailedEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.zenoss.cloud.dataReceiver.EventError, org.zenoss.cloud.dataReceiver.EventError.Builder, org.zenoss.cloud.dataReceiver.EventErrorOrBuilder> 
        getFailedEventsFieldBuilder() {
      if (failedEventsBuilder_ == null) {
        failedEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.zenoss.cloud.dataReceiver.EventError, org.zenoss.cloud.dataReceiver.EventError.Builder, org.zenoss.cloud.dataReceiver.EventErrorOrBuilder>(
                failedEvents_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        failedEvents_ = null;
      }
      return failedEventsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.EventStatusResult)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.EventStatusResult)
  private static final org.zenoss.cloud.dataReceiver.EventStatusResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataReceiver.EventStatusResult();
  }

  public static org.zenoss.cloud.dataReceiver.EventStatusResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventStatusResult>
      PARSER = new com.google.protobuf.AbstractParser<EventStatusResult>() {
    public EventStatusResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EventStatusResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventStatusResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventStatusResult> getParserForType() {
    return PARSER;
  }

  public org.zenoss.cloud.dataReceiver.EventStatusResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

