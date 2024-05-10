// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataReceiver;

/**
 * Protobuf type {@code zenoss.cloud.ModelStatusResult}
 */
public final class ModelStatusResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.ModelStatusResult)
    ModelStatusResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ModelStatusResult.class.getName());
  }
  // Use ModelStatusResult.newBuilder() to construct.
  private ModelStatusResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ModelStatusResult() {
    message_ = "";
    failedModels_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_ModelStatusResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_ModelStatusResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataReceiver.ModelStatusResult.class, org.zenoss.cloud.dataReceiver.ModelStatusResult.Builder.class);
  }

  public static final int FAILED_FIELD_NUMBER = 1;
  private int failed_ = 0;
  /**
   * <pre>
   * failed is the count of models that failed to be accepted
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
   * succeeded is the count of models that were accepted
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

  public static final int FAILEDMODELS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<org.zenoss.cloud.dataReceiver.ModelError> failedModels_;
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  @java.lang.Override
  public java.util.List<org.zenoss.cloud.dataReceiver.ModelError> getFailedModelsList() {
    return failedModels_;
  }
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder> 
      getFailedModelsOrBuilderList() {
    return failedModels_;
  }
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  @java.lang.Override
  public int getFailedModelsCount() {
    return failedModels_.size();
  }
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.ModelError getFailedModels(int index) {
    return failedModels_.get(index);
  }
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder getFailedModelsOrBuilder(
      int index) {
    return failedModels_.get(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, message_);
    }
    for (int i = 0; i < failedModels_.size(); i++) {
      output.writeMessage(4, failedModels_.get(i));
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, message_);
    }
    for (int i = 0; i < failedModels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, failedModels_.get(i));
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
    if (!(obj instanceof org.zenoss.cloud.dataReceiver.ModelStatusResult)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataReceiver.ModelStatusResult other = (org.zenoss.cloud.dataReceiver.ModelStatusResult) obj;

    if (getFailed()
        != other.getFailed()) return false;
    if (getSucceeded()
        != other.getSucceeded()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getFailedModelsList()
        .equals(other.getFailedModelsList())) return false;
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
    if (getFailedModelsCount() > 0) {
      hash = (37 * hash) + FAILEDMODELS_FIELD_NUMBER;
      hash = (53 * hash) + getFailedModelsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.ModelStatusResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.zenoss.cloud.dataReceiver.ModelStatusResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code zenoss.cloud.ModelStatusResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.ModelStatusResult)
      org.zenoss.cloud.dataReceiver.ModelStatusResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_ModelStatusResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_ModelStatusResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataReceiver.ModelStatusResult.class, org.zenoss.cloud.dataReceiver.ModelStatusResult.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataReceiver.ModelStatusResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      failed_ = 0;
      succeeded_ = 0;
      message_ = "";
      if (failedModelsBuilder_ == null) {
        failedModels_ = java.util.Collections.emptyList();
      } else {
        failedModels_ = null;
        failedModelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_ModelStatusResult_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.ModelStatusResult getDefaultInstanceForType() {
      return org.zenoss.cloud.dataReceiver.ModelStatusResult.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.ModelStatusResult build() {
      org.zenoss.cloud.dataReceiver.ModelStatusResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.ModelStatusResult buildPartial() {
      org.zenoss.cloud.dataReceiver.ModelStatusResult result = new org.zenoss.cloud.dataReceiver.ModelStatusResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.zenoss.cloud.dataReceiver.ModelStatusResult result) {
      if (failedModelsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          failedModels_ = java.util.Collections.unmodifiableList(failedModels_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.failedModels_ = failedModels_;
      } else {
        result.failedModels_ = failedModelsBuilder_.build();
      }
    }

    private void buildPartial0(org.zenoss.cloud.dataReceiver.ModelStatusResult result) {
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
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.dataReceiver.ModelStatusResult) {
        return mergeFrom((org.zenoss.cloud.dataReceiver.ModelStatusResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataReceiver.ModelStatusResult other) {
      if (other == org.zenoss.cloud.dataReceiver.ModelStatusResult.getDefaultInstance()) return this;
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
      if (failedModelsBuilder_ == null) {
        if (!other.failedModels_.isEmpty()) {
          if (failedModels_.isEmpty()) {
            failedModels_ = other.failedModels_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFailedModelsIsMutable();
            failedModels_.addAll(other.failedModels_);
          }
          onChanged();
        }
      } else {
        if (!other.failedModels_.isEmpty()) {
          if (failedModelsBuilder_.isEmpty()) {
            failedModelsBuilder_.dispose();
            failedModelsBuilder_ = null;
            failedModels_ = other.failedModels_;
            bitField0_ = (bitField0_ & ~0x00000008);
            failedModelsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getFailedModelsFieldBuilder() : null;
          } else {
            failedModelsBuilder_.addAllMessages(other.failedModels_);
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
              org.zenoss.cloud.dataReceiver.ModelError m =
                  input.readMessage(
                      org.zenoss.cloud.dataReceiver.ModelError.parser(),
                      extensionRegistry);
              if (failedModelsBuilder_ == null) {
                ensureFailedModelsIsMutable();
                failedModels_.add(m);
              } else {
                failedModelsBuilder_.addMessage(m);
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
     * failed is the count of models that failed to be accepted
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
     * failed is the count of models that failed to be accepted
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
     * failed is the count of models that failed to be accepted
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
     * succeeded is the count of models that were accepted
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
     * succeeded is the count of models that were accepted
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
     * succeeded is the count of models that were accepted
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

    private java.util.List<org.zenoss.cloud.dataReceiver.ModelError> failedModels_ =
      java.util.Collections.emptyList();
    private void ensureFailedModelsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        failedModels_ = new java.util.ArrayList<org.zenoss.cloud.dataReceiver.ModelError>(failedModels_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.zenoss.cloud.dataReceiver.ModelError, org.zenoss.cloud.dataReceiver.ModelError.Builder, org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder> failedModelsBuilder_;

    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public java.util.List<org.zenoss.cloud.dataReceiver.ModelError> getFailedModelsList() {
      if (failedModelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(failedModels_);
      } else {
        return failedModelsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public int getFailedModelsCount() {
      if (failedModelsBuilder_ == null) {
        return failedModels_.size();
      } else {
        return failedModelsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public org.zenoss.cloud.dataReceiver.ModelError getFailedModels(int index) {
      if (failedModelsBuilder_ == null) {
        return failedModels_.get(index);
      } else {
        return failedModelsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder setFailedModels(
        int index, org.zenoss.cloud.dataReceiver.ModelError value) {
      if (failedModelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedModelsIsMutable();
        failedModels_.set(index, value);
        onChanged();
      } else {
        failedModelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder setFailedModels(
        int index, org.zenoss.cloud.dataReceiver.ModelError.Builder builderForValue) {
      if (failedModelsBuilder_ == null) {
        ensureFailedModelsIsMutable();
        failedModels_.set(index, builderForValue.build());
        onChanged();
      } else {
        failedModelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder addFailedModels(org.zenoss.cloud.dataReceiver.ModelError value) {
      if (failedModelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedModelsIsMutable();
        failedModels_.add(value);
        onChanged();
      } else {
        failedModelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder addFailedModels(
        int index, org.zenoss.cloud.dataReceiver.ModelError value) {
      if (failedModelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedModelsIsMutable();
        failedModels_.add(index, value);
        onChanged();
      } else {
        failedModelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder addFailedModels(
        org.zenoss.cloud.dataReceiver.ModelError.Builder builderForValue) {
      if (failedModelsBuilder_ == null) {
        ensureFailedModelsIsMutable();
        failedModels_.add(builderForValue.build());
        onChanged();
      } else {
        failedModelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder addFailedModels(
        int index, org.zenoss.cloud.dataReceiver.ModelError.Builder builderForValue) {
      if (failedModelsBuilder_ == null) {
        ensureFailedModelsIsMutable();
        failedModels_.add(index, builderForValue.build());
        onChanged();
      } else {
        failedModelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder addAllFailedModels(
        java.lang.Iterable<? extends org.zenoss.cloud.dataReceiver.ModelError> values) {
      if (failedModelsBuilder_ == null) {
        ensureFailedModelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, failedModels_);
        onChanged();
      } else {
        failedModelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder clearFailedModels() {
      if (failedModelsBuilder_ == null) {
        failedModels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        failedModelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public Builder removeFailedModels(int index) {
      if (failedModelsBuilder_ == null) {
        ensureFailedModelsIsMutable();
        failedModels_.remove(index);
        onChanged();
      } else {
        failedModelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public org.zenoss.cloud.dataReceiver.ModelError.Builder getFailedModelsBuilder(
        int index) {
      return getFailedModelsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder getFailedModelsOrBuilder(
        int index) {
      if (failedModelsBuilder_ == null) {
        return failedModels_.get(index);  } else {
        return failedModelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public java.util.List<? extends org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder> 
         getFailedModelsOrBuilderList() {
      if (failedModelsBuilder_ != null) {
        return failedModelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(failedModels_);
      }
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public org.zenoss.cloud.dataReceiver.ModelError.Builder addFailedModelsBuilder() {
      return getFailedModelsFieldBuilder().addBuilder(
          org.zenoss.cloud.dataReceiver.ModelError.getDefaultInstance());
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public org.zenoss.cloud.dataReceiver.ModelError.Builder addFailedModelsBuilder(
        int index) {
      return getFailedModelsFieldBuilder().addBuilder(
          index, org.zenoss.cloud.dataReceiver.ModelError.getDefaultInstance());
    }
    /**
     * <pre>
     * Failed models only returned if detailedResponse is set to true
     * </pre>
     *
     * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
     */
    public java.util.List<org.zenoss.cloud.dataReceiver.ModelError.Builder> 
         getFailedModelsBuilderList() {
      return getFailedModelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.zenoss.cloud.dataReceiver.ModelError, org.zenoss.cloud.dataReceiver.ModelError.Builder, org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder> 
        getFailedModelsFieldBuilder() {
      if (failedModelsBuilder_ == null) {
        failedModelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.zenoss.cloud.dataReceiver.ModelError, org.zenoss.cloud.dataReceiver.ModelError.Builder, org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder>(
                failedModels_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        failedModels_ = null;
      }
      return failedModelsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:zenoss.cloud.ModelStatusResult)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.ModelStatusResult)
  private static final org.zenoss.cloud.dataReceiver.ModelStatusResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataReceiver.ModelStatusResult();
  }

  public static org.zenoss.cloud.dataReceiver.ModelStatusResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelStatusResult>
      PARSER = new com.google.protobuf.AbstractParser<ModelStatusResult>() {
    @java.lang.Override
    public ModelStatusResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelStatusResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelStatusResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.ModelStatusResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

