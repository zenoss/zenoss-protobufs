// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.ProbeError}
 */
public final class ProbeError extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.ProbeError)
    ProbeErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProbeError.newBuilder() to construct.
  private ProbeError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProbeError() {
    message_ = "";
    description_ = "";
    fieldErrors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProbeError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProbeError(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fieldErrors_ = new java.util.ArrayList<org.zenoss.cloud.collection.FieldError>();
              mutable_bitField0_ |= 0x00000001;
            }
            fieldErrors_.add(
                input.readMessage(org.zenoss.cloud.collection.FieldError.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fieldErrors_ = java.util.Collections.unmodifiableList(fieldErrors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.ProbeError.class, org.zenoss.cloud.collection.ProbeError.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * message is a short human-friendly text. Can be emtpy.
   * </pre>
   *
   * <code>string message = 3;</code>
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
   * message is a short human-friendly text. Can be emtpy.
   * </pre>
   *
   * <code>string message = 3;</code>
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

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * description is a parsed API error. Usually long and technical.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * description is a parsed API error. Usually long and technical.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_ERRORS_FIELD_NUMBER = 2;
  private java.util.List<org.zenoss.cloud.collection.FieldError> fieldErrors_;
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.zenoss.cloud.collection.FieldError> getFieldErrorsList() {
    return fieldErrors_;
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.zenoss.cloud.collection.FieldErrorOrBuilder> 
      getFieldErrorsOrBuilderList() {
    return fieldErrors_;
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
   */
  @java.lang.Override
  public int getFieldErrorsCount() {
    return fieldErrors_.size();
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.FieldError getFieldErrors(int index) {
    return fieldErrors_.get(index);
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.FieldErrorOrBuilder getFieldErrorsOrBuilder(
      int index) {
    return fieldErrors_.get(index);
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
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    for (int i = 0; i < fieldErrors_.size(); i++) {
      output.writeMessage(2, fieldErrors_.get(i));
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    for (int i = 0; i < fieldErrors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fieldErrors_.get(i));
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
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
    if (!(obj instanceof org.zenoss.cloud.collection.ProbeError)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.ProbeError other = (org.zenoss.cloud.collection.ProbeError) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getFieldErrorsList()
        .equals(other.getFieldErrorsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getFieldErrorsCount() > 0) {
      hash = (37 * hash) + FIELD_ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldErrorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ProbeError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ProbeError parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.ProbeError prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.ProbeError}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.ProbeError)
      org.zenoss.cloud.collection.ProbeErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.ProbeError.class, org.zenoss.cloud.collection.ProbeError.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.ProbeError.newBuilder()
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
        getFieldErrorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      description_ = "";

      if (fieldErrorsBuilder_ == null) {
        fieldErrors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fieldErrorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeError_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeError getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeError build() {
      org.zenoss.cloud.collection.ProbeError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeError buildPartial() {
      org.zenoss.cloud.collection.ProbeError result = new org.zenoss.cloud.collection.ProbeError(this);
      int from_bitField0_ = bitField0_;
      result.message_ = message_;
      result.description_ = description_;
      if (fieldErrorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fieldErrors_ = java.util.Collections.unmodifiableList(fieldErrors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fieldErrors_ = fieldErrors_;
      } else {
        result.fieldErrors_ = fieldErrorsBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof org.zenoss.cloud.collection.ProbeError) {
        return mergeFrom((org.zenoss.cloud.collection.ProbeError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.ProbeError other) {
      if (other == org.zenoss.cloud.collection.ProbeError.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (fieldErrorsBuilder_ == null) {
        if (!other.fieldErrors_.isEmpty()) {
          if (fieldErrors_.isEmpty()) {
            fieldErrors_ = other.fieldErrors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFieldErrorsIsMutable();
            fieldErrors_.addAll(other.fieldErrors_);
          }
          onChanged();
        }
      } else {
        if (!other.fieldErrors_.isEmpty()) {
          if (fieldErrorsBuilder_.isEmpty()) {
            fieldErrorsBuilder_.dispose();
            fieldErrorsBuilder_ = null;
            fieldErrors_ = other.fieldErrors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fieldErrorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldErrorsFieldBuilder() : null;
          } else {
            fieldErrorsBuilder_.addAllMessages(other.fieldErrors_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.zenoss.cloud.collection.ProbeError parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.collection.ProbeError) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * message is a short human-friendly text. Can be emtpy.
     * </pre>
     *
     * <code>string message = 3;</code>
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
     * message is a short human-friendly text. Can be emtpy.
     * </pre>
     *
     * <code>string message = 3;</code>
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
     * message is a short human-friendly text. Can be emtpy.
     * </pre>
     *
     * <code>string message = 3;</code>
     * @param value The message to set.
     * @return This builder for chaining.
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
     * message is a short human-friendly text. Can be emtpy.
     * </pre>
     *
     * <code>string message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * message is a short human-friendly text. Can be emtpy.
     * </pre>
     *
     * <code>string message = 3;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
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

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * description is a parsed API error. Usually long and technical.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * description is a parsed API error. Usually long and technical.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * description is a parsed API error. Usually long and technical.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * description is a parsed API error. Usually long and technical.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * description is a parsed API error. Usually long and technical.
     * </pre>
     *
     * <code>string description = 1;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.zenoss.cloud.collection.FieldError> fieldErrors_ =
      java.util.Collections.emptyList();
    private void ensureFieldErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fieldErrors_ = new java.util.ArrayList<org.zenoss.cloud.collection.FieldError>(fieldErrors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.zenoss.cloud.collection.FieldError, org.zenoss.cloud.collection.FieldError.Builder, org.zenoss.cloud.collection.FieldErrorOrBuilder> fieldErrorsBuilder_;

    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public java.util.List<org.zenoss.cloud.collection.FieldError> getFieldErrorsList() {
      if (fieldErrorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fieldErrors_);
      } else {
        return fieldErrorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public int getFieldErrorsCount() {
      if (fieldErrorsBuilder_ == null) {
        return fieldErrors_.size();
      } else {
        return fieldErrorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public org.zenoss.cloud.collection.FieldError getFieldErrors(int index) {
      if (fieldErrorsBuilder_ == null) {
        return fieldErrors_.get(index);
      } else {
        return fieldErrorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder setFieldErrors(
        int index, org.zenoss.cloud.collection.FieldError value) {
      if (fieldErrorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldErrorsIsMutable();
        fieldErrors_.set(index, value);
        onChanged();
      } else {
        fieldErrorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder setFieldErrors(
        int index, org.zenoss.cloud.collection.FieldError.Builder builderForValue) {
      if (fieldErrorsBuilder_ == null) {
        ensureFieldErrorsIsMutable();
        fieldErrors_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldErrorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder addFieldErrors(org.zenoss.cloud.collection.FieldError value) {
      if (fieldErrorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldErrorsIsMutable();
        fieldErrors_.add(value);
        onChanged();
      } else {
        fieldErrorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder addFieldErrors(
        int index, org.zenoss.cloud.collection.FieldError value) {
      if (fieldErrorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldErrorsIsMutable();
        fieldErrors_.add(index, value);
        onChanged();
      } else {
        fieldErrorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder addFieldErrors(
        org.zenoss.cloud.collection.FieldError.Builder builderForValue) {
      if (fieldErrorsBuilder_ == null) {
        ensureFieldErrorsIsMutable();
        fieldErrors_.add(builderForValue.build());
        onChanged();
      } else {
        fieldErrorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder addFieldErrors(
        int index, org.zenoss.cloud.collection.FieldError.Builder builderForValue) {
      if (fieldErrorsBuilder_ == null) {
        ensureFieldErrorsIsMutable();
        fieldErrors_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldErrorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder addAllFieldErrors(
        java.lang.Iterable<? extends org.zenoss.cloud.collection.FieldError> values) {
      if (fieldErrorsBuilder_ == null) {
        ensureFieldErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fieldErrors_);
        onChanged();
      } else {
        fieldErrorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder clearFieldErrors() {
      if (fieldErrorsBuilder_ == null) {
        fieldErrors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fieldErrorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public Builder removeFieldErrors(int index) {
      if (fieldErrorsBuilder_ == null) {
        ensureFieldErrorsIsMutable();
        fieldErrors_.remove(index);
        onChanged();
      } else {
        fieldErrorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public org.zenoss.cloud.collection.FieldError.Builder getFieldErrorsBuilder(
        int index) {
      return getFieldErrorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public org.zenoss.cloud.collection.FieldErrorOrBuilder getFieldErrorsOrBuilder(
        int index) {
      if (fieldErrorsBuilder_ == null) {
        return fieldErrors_.get(index);  } else {
        return fieldErrorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public java.util.List<? extends org.zenoss.cloud.collection.FieldErrorOrBuilder> 
         getFieldErrorsOrBuilderList() {
      if (fieldErrorsBuilder_ != null) {
        return fieldErrorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fieldErrors_);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public org.zenoss.cloud.collection.FieldError.Builder addFieldErrorsBuilder() {
      return getFieldErrorsFieldBuilder().addBuilder(
          org.zenoss.cloud.collection.FieldError.getDefaultInstance());
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public org.zenoss.cloud.collection.FieldError.Builder addFieldErrorsBuilder(
        int index) {
      return getFieldErrorsFieldBuilder().addBuilder(
          index, org.zenoss.cloud.collection.FieldError.getDefaultInstance());
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.FieldError field_errors = 2;</code>
     */
    public java.util.List<org.zenoss.cloud.collection.FieldError.Builder> 
         getFieldErrorsBuilderList() {
      return getFieldErrorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.zenoss.cloud.collection.FieldError, org.zenoss.cloud.collection.FieldError.Builder, org.zenoss.cloud.collection.FieldErrorOrBuilder> 
        getFieldErrorsFieldBuilder() {
      if (fieldErrorsBuilder_ == null) {
        fieldErrorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.zenoss.cloud.collection.FieldError, org.zenoss.cloud.collection.FieldError.Builder, org.zenoss.cloud.collection.FieldErrorOrBuilder>(
                fieldErrors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fieldErrors_ = null;
      }
      return fieldErrorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.ProbeError)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeError)
  private static final org.zenoss.cloud.collection.ProbeError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.ProbeError();
  }

  public static org.zenoss.cloud.collection.ProbeError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProbeError>
      PARSER = new com.google.protobuf.AbstractParser<ProbeError>() {
    @java.lang.Override
    public ProbeError parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProbeError(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProbeError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProbeError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

