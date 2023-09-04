// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package com.zenoss.cloud;

/**
 * Protobuf type {@code zenoss.cloud.EventStatusResult}
 */
public final class EventStatusResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.EventStatusResult)
    EventStatusResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventStatusResult.newBuilder() to construct.
  private EventStatusResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventStatusResult() {
    message_ = "";
    failedEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventStatusResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zenoss.cloud.DataReceiverProto.internal_static_zenoss_cloud_EventStatusResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zenoss.cloud.DataReceiverProto.internal_static_zenoss_cloud_EventStatusResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zenoss.cloud.EventStatusResult.class, com.zenoss.cloud.EventStatusResult.Builder.class);
  }

  public static final int FAILED_FIELD_NUMBER = 1;
  private int failed_ = 0;
  /**
   * <pre>
   * failed is the count of events that failed to be accepted
   * </pre>
   *
   * <code>int32 failed = 1 [json_name = "failed"];</code>
   * @return The failed.
   */
  @java.lang.Override
  public int getFailed() {
    return failed_;
  }

  public static final int SUCCEEDED_FIELD_NUMBER = 2;
  private int succeeded_ = 0;
  /**
   * <pre>
   * succeeded is the count of events that were accepted
   * </pre>
   *
   * <code>int32 succeeded = 2 [json_name = "succeeded"];</code>
   * @return The succeeded.
   */
  @java.lang.Override
  public int getSucceeded() {
    return succeeded_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
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
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
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
  @SuppressWarnings("serial")
  private java.util.List<com.zenoss.cloud.EventError> failedEvents_;
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
   */
  @java.lang.Override
  public java.util.List<com.zenoss.cloud.EventError> getFailedEventsList() {
    return failedEvents_;
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.zenoss.cloud.EventErrorOrBuilder> 
      getFailedEventsOrBuilderList() {
    return failedEvents_;
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
   */
  @java.lang.Override
  public int getFailedEventsCount() {
    return failedEvents_.size();
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
   */
  @java.lang.Override
  public com.zenoss.cloud.EventError getFailedEvents(int index) {
    return failedEvents_.get(index);
  }
  /**
   * <pre>
   * Failed events only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
   */
  @java.lang.Override
  public com.zenoss.cloud.EventErrorOrBuilder getFailedEventsOrBuilder(
      int index) {
    return failedEvents_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (failed_ != 0) {
      output.writeInt32(1, failed_);
    }
    if (succeeded_ != 0) {
      output.writeInt32(2, succeeded_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    for (int i = 0; i < failedEvents_.size(); i++) {
      output.writeMessage(4, failedEvents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    for (int i = 0; i < failedEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, failedEvents_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.zenoss.cloud.EventStatusResult)) {
      return super.equals(obj);
    }
    com.zenoss.cloud.EventStatusResult other = (com.zenoss.cloud.EventStatusResult) obj;

    if (getFailed()
        != other.getFailed()) return false;
    if (getSucceeded()
        != other.getSucceeded()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getFailedEventsList()
        .equals(other.getFailedEventsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zenoss.cloud.EventStatusResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.zenoss.cloud.EventStatusResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.zenoss.cloud.EventStatusResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zenoss.cloud.EventStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.zenoss.cloud.EventStatusResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
      com.zenoss.cloud.EventStatusResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zenoss.cloud.DataReceiverProto.internal_static_zenoss_cloud_EventStatusResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zenoss.cloud.DataReceiverProto.internal_static_zenoss_cloud_EventStatusResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zenoss.cloud.EventStatusResult.class, com.zenoss.cloud.EventStatusResult.Builder.class);
    }

    // Construct using com.zenoss.cloud.EventStatusResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      failed_ = 0;
      succeeded_ = 0;
      message_ = "";
      if (failedEventsBuilder_ == null) {
        failedEvents_ = java.util.Collections.emptyList();
      } else {
        failedEvents_ = null;
        failedEventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zenoss.cloud.DataReceiverProto.internal_static_zenoss_cloud_EventStatusResult_descriptor;
    }

    @java.lang.Override
    public com.zenoss.cloud.EventStatusResult getDefaultInstanceForType() {
      return com.zenoss.cloud.EventStatusResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.zenoss.cloud.EventStatusResult build() {
      com.zenoss.cloud.EventStatusResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zenoss.cloud.EventStatusResult buildPartial() {
      com.zenoss.cloud.EventStatusResult result = new com.zenoss.cloud.EventStatusResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.zenoss.cloud.EventStatusResult result) {
      if (failedEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          failedEvents_ = java.util.Collections.unmodifiableList(failedEvents_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.failedEvents_ = failedEvents_;
      } else {
        result.failedEvents_ = failedEventsBuilder_.build();
      }
    }

    private void buildPartial0(com.zenoss.cloud.EventStatusResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.failed_ = failed_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.succeeded_ = succeeded_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zenoss.cloud.EventStatusResult) {
        return mergeFrom((com.zenoss.cloud.EventStatusResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zenoss.cloud.EventStatusResult other) {
      if (other == com.zenoss.cloud.EventStatusResult.getDefaultInstance()) return this;
      if (other.getFailed() != 0) {
        setFailed(other.getFailed());
      }
      if (other.getSucceeded() != 0) {
        setSucceeded(other.getSucceeded());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
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
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              failed_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              succeeded_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              com.zenoss.cloud.EventError m =
                  input.readMessage(
                      com.zenoss.cloud.EventError.parser(),
                      extensionRegistry);
              if (failedEventsBuilder_ == null) {
                ensureFailedEventsIsMutable();
                failedEvents_.add(m);
              } else {
                failedEventsBuilder_.addMessage(m);
              }
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int failed_ ;
    /**
     * <pre>
     * failed is the count of events that failed to be accepted
     * </pre>
     *
     * <code>int32 failed = 1 [json_name = "failed"];</code>
     * @return The failed.
     */
    @java.lang.Override
    public int getFailed() {
      return failed_;
    }
    /**
     * <pre>
     * failed is the count of events that failed to be accepted
     * </pre>
     *
     * <code>int32 failed = 1 [json_name = "failed"];</code>
     * @param value The failed to set.
     * @return This builder for chaining.
     */
    public Builder setFailed(int value) {

      failed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failed is the count of events that failed to be accepted
     * </pre>
     *
     * <code>int32 failed = 1 [json_name = "failed"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailed() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * <code>int32 succeeded = 2 [json_name = "succeeded"];</code>
     * @return The succeeded.
     */
    @java.lang.Override
    public int getSucceeded() {
      return succeeded_;
    }
    /**
     * <pre>
     * succeeded is the count of events that were accepted
     * </pre>
     *
     * <code>int32 succeeded = 2 [json_name = "succeeded"];</code>
     * @param value The succeeded to set.
     * @return This builder for chaining.
     */
    public Builder setSucceeded(int value) {

      succeeded_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * succeeded is the count of events that were accepted
     * </pre>
     *
     * <code>int32 succeeded = 2 [json_name = "succeeded"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSucceeded() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * <code>string message = 3 [json_name = "message"];</code>
     * @return The message.
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
     * <code>string message = 3 [json_name = "message"];</code>
     * @return The bytes for message.
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
     * <code>string message = 3 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * message is an informational message that may or may not be set
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.util.List<com.zenoss.cloud.EventError> failedEvents_ =
      java.util.Collections.emptyList();
    private void ensureFailedEventsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        failedEvents_ = new java.util.ArrayList<com.zenoss.cloud.EventError>(failedEvents_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zenoss.cloud.EventError, com.zenoss.cloud.EventError.Builder, com.zenoss.cloud.EventErrorOrBuilder> failedEventsBuilder_;

    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public java.util.List<com.zenoss.cloud.EventError> getFailedEventsList() {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public com.zenoss.cloud.EventError getFailedEvents(int index) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder setFailedEvents(
        int index, com.zenoss.cloud.EventError value) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder setFailedEvents(
        int index, com.zenoss.cloud.EventError.Builder builderForValue) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder addFailedEvents(com.zenoss.cloud.EventError value) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder addFailedEvents(
        int index, com.zenoss.cloud.EventError value) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder addFailedEvents(
        com.zenoss.cloud.EventError.Builder builderForValue) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder addFailedEvents(
        int index, com.zenoss.cloud.EventError.Builder builderForValue) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public Builder addAllFailedEvents(
        java.lang.Iterable<? extends com.zenoss.cloud.EventError> values) {
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public com.zenoss.cloud.EventError.Builder getFailedEventsBuilder(
        int index) {
      return getFailedEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public com.zenoss.cloud.EventErrorOrBuilder getFailedEventsOrBuilder(
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public java.util.List<? extends com.zenoss.cloud.EventErrorOrBuilder> 
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
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public com.zenoss.cloud.EventError.Builder addFailedEventsBuilder() {
      return getFailedEventsFieldBuilder().addBuilder(
          com.zenoss.cloud.EventError.getDefaultInstance());
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public com.zenoss.cloud.EventError.Builder addFailedEventsBuilder(
        int index) {
      return getFailedEventsFieldBuilder().addBuilder(
          index, com.zenoss.cloud.EventError.getDefaultInstance());
    }
    /**
     * <pre>
     * Failed events only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.EventError failedEvents = 4 [json_name = "failedEvents"];</code>
     */
    public java.util.List<com.zenoss.cloud.EventError.Builder> 
         getFailedEventsBuilderList() {
      return getFailedEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.zenoss.cloud.EventError, com.zenoss.cloud.EventError.Builder, com.zenoss.cloud.EventErrorOrBuilder> 
        getFailedEventsFieldBuilder() {
      if (failedEventsBuilder_ == null) {
        failedEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.zenoss.cloud.EventError, com.zenoss.cloud.EventError.Builder, com.zenoss.cloud.EventErrorOrBuilder>(
                failedEvents_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        failedEvents_ = null;
      }
      return failedEventsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.EventStatusResult)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.EventStatusResult)
  private static final com.zenoss.cloud.EventStatusResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zenoss.cloud.EventStatusResult();
  }

  public static com.zenoss.cloud.EventStatusResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventStatusResult>
      PARSER = new com.google.protobuf.AbstractParser<EventStatusResult>() {
    @java.lang.Override
    public EventStatusResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EventStatusResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventStatusResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zenoss.cloud.EventStatusResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

