// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

/**
 * Protobuf type {@code zenoss.cloud.RegisterMetricVerboseResponse}
 */
public  final class RegisterMetricVerboseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.RegisterMetricVerboseResponse)
    RegisterMetricVerboseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterMetricVerboseResponse.newBuilder() to construct.
  private RegisterMetricVerboseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterMetricVerboseResponse() {
    error_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterMetricVerboseResponse(
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
          case 10: {
            org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder subBuilder = null;
            if (response_ != null) {
              subBuilder = response_.toBuilder();
            }
            response_ = input.readMessage(org.zenoss.cloud.dataRegistry.RegisterMetricResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(response_);
              response_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.class, org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private org.zenoss.cloud.dataRegistry.RegisterMetricResponse response_;
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
   */
  public boolean hasResponse() {
    return response_ != null;
  }
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
   */
  public org.zenoss.cloud.dataRegistry.RegisterMetricResponse getResponse() {
    return response_ == null ? org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance() : response_;
  }
  /**
   * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
   */
  public org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder getResponseOrBuilder() {
    return getResponse();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 2;</code>
   */
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
   * <code>string error = 2;</code>
   */
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
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (response_ != null) {
      output.writeMessage(1, getResponse());
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (response_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
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
    if (!(obj instanceof org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse other = (org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse) obj;

    boolean result = true;
    result = result && (hasResponse() == other.hasResponse());
    if (hasResponse()) {
      result = result && getResponse()
          .equals(other.getResponse());
    }
    result = result && getError()
        .equals(other.getError());
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
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
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
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.RegisterMetricVerboseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.RegisterMetricVerboseResponse)
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
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
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (responseBuilder_ == null) {
        response_ = null;
      } else {
        response_ = null;
        responseBuilder_ = null;
      }
      error_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_RegisterMetricVerboseResponse_descriptor;
    }

    public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse.getDefaultInstance();
    }

    public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse build() {
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse buildPartial() {
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse result = new org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse(this);
      if (responseBuilder_ == null) {
        result.response_ = response_;
      } else {
        result.response_ = responseBuilder_.build();
      }
      result.error_ = error_;
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
        onChanged();
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
      org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.zenoss.cloud.dataRegistry.RegisterMetricResponse response_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.dataRegistry.RegisterMetricResponse, org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder, org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder> responseBuilder_;
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public boolean hasResponse() {
      return responseBuilder_ != null || response_ != null;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponse getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? org.zenoss.cloud.dataRegistry.RegisterMetricResponse.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public Builder setResponse(org.zenoss.cloud.dataRegistry.RegisterMetricResponse value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public Builder setResponse(
        org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public Builder mergeResponse(org.zenoss.cloud.dataRegistry.RegisterMetricResponse value) {
      if (responseBuilder_ == null) {
        if (response_ != null) {
          response_ =
            org.zenoss.cloud.dataRegistry.RegisterMetricResponse.newBuilder(response_).mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        responseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public Builder clearResponse() {
      if (responseBuilder_ == null) {
        response_ = null;
        onChanged();
      } else {
        response_ = null;
        responseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    public org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder getResponseBuilder() {
      
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
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
     * <code>.zenoss.cloud.RegisterMetricResponse response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.dataRegistry.RegisterMetricResponse, org.zenoss.cloud.dataRegistry.RegisterMetricResponse.Builder, org.zenoss.cloud.dataRegistry.RegisterMetricResponseOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
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
     * <code>string error = 2;</code>
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
     * <code>string error = 2;</code>
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
     * <code>string error = 2;</code>
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2;</code>
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2;</code>
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
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
    public RegisterMetricVerboseResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterMetricVerboseResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterMetricVerboseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterMetricVerboseResponse> getParserForType() {
    return PARSER;
  }

  public org.zenoss.cloud.dataRegistry.RegisterMetricVerboseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

