// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataRegistry;

/**
 * Protobuf type {@code zenoss.cloud.RegisterMetricVerboseResponse}
 */
public final class RegisterMetricVerboseResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.RegisterMetricVerboseResponse)
    RegisterMetricVerboseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      RegisterMetricVerboseResponse.class.getName());
  }
  // Use RegisterMetricVerboseResponse.newBuilder() to construct.
  private RegisterMetricVerboseResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RegisterMetricVerboseResponse() {
    error_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.class, org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESPONSE_FIELD_NUMBER = 1;
  private org.zenoss.cloud.dataRegistry.RegisterMetricResponse response_;
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
   * @return Whether the response field is set.
   */
  @java.lang.Override
  public boolean hasResponse() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
   * @return The response.
   */
  @java.lang.Override
  public org.zenoss.cloud.dataRegistry.RegisterMetricResponse getResponse() {
    return response_ == null ? org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance() : response_;
  }
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder getResponseOrBuilder() {
    return response_ == null ? org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance() : response_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object error_ = "";
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getResponse());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(error_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, error_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(error_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, error_);
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
    if (!(obj instanceof org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse other = (org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse) obj;

    if (hasResponse() != other.hasResponse()) return false;
    if (hasResponse()) {
      if (!getResponse()
          .equals(other.getResponse())) return false;
    }
    if (!getError()
        .equals(other.getError())) return false;
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
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.RegisterMetricVerboseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.RegisterMetricVerboseResponse)
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.class, org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getResponseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      error_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse build() {
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse buildPartial() {
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse result = new org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.response_ = responseBuilder_ == null
            ? response_
            : responseBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = error_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse) {
        return mergeFrom((org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse other) {
      if (other == org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.getDefaultInstance()) return this;
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10: {
              input.readMessage(
                  getResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              error_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private org.zenoss.cloud.dataRegistry.RegisterMetricResponse response_;
    private com.google.protobuf.SingleFieldBuilder<
        org.zenoss.cloud.dataRegistry.RegisterMetricResponse, org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder, org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder> responseBuilder_;
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     * @return The response.
     */
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponse getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    public Builder setResponse(org.zenoss.cloud.dataRegistry.RegisterMetricResponse value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    public Builder setResponse(
        org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    public Builder mergeResponse(org.zenoss.cloud.dataRegistry.RegisterMetricResponse value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          response_ != null &&
          response_ != org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance()) {
          getResponseBuilder().mergeFrom(value);
        } else {
          response_ = value;
        }
      } else {
        responseBuilder_.mergeFrom(value);
      }
      if (response_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    public Builder clearResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder getResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ?
            org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance() : response_;
      }
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1 [json_name = "response"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zenoss.cloud.dataRegistry.RegisterMetricResponse, org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder, org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zenoss.cloud.dataRegistry.RegisterMetricResponse, org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder, org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder>(
                getResponse(),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      error_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      error_ = getDefaultInstance().getError();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      error_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:zenoss.cloud.RegisterMetricVerboseResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.RegisterMetricVerboseResponse)
  private static final org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse();
  }

  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterMetricVerboseResponse>
      PARSER = new com.google.protobuf.AbstractParser<RegisterMetricVerboseResponse>() {
    @java.lang.Override
    public RegisterMetricVerboseResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterMetricVerboseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterMetricVerboseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

