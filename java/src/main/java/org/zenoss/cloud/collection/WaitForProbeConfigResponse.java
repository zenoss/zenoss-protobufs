// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.WaitForProbeConfigResponse}
 */
public final class WaitForProbeConfigResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.WaitForProbeConfigResponse)
    WaitForProbeConfigResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      WaitForProbeConfigResponse.class.getName());
  }
  // Use WaitForProbeConfigResponse.newBuilder() to construct.
  private WaitForProbeConfigResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private WaitForProbeConfigResponse() {
    configId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.WaitForProbeConfigResponse.class, org.zenoss.cloud.collection.WaitForProbeConfigResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CONFIG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object configId_ = "";
  /**
   * <code>string config_id = 1 [json_name = "configId"];</code>
   * @return The configId.
   */
  @java.lang.Override
  public java.lang.String getConfigId() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      configId_ = s;
      return s;
    }
  }
  /**
   * <code>string config_id = 1 [json_name = "configId"];</code>
   * @return The bytes for configId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfigIdBytes() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      configId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private org.zenoss.cloud.collection.ProbeResult result_;
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeResult getResult() {
    return result_ == null ? org.zenoss.cloud.collection.ProbeResult.getDefaultInstance() : result_;
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeResultOrBuilder getResultOrBuilder() {
    return result_ == null ? org.zenoss.cloud.collection.ProbeResult.getDefaultInstance() : result_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(configId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, configId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(configId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, configId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof org.zenoss.cloud.collection.WaitForProbeConfigResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.WaitForProbeConfigResponse other = (org.zenoss.cloud.collection.WaitForProbeConfigResponse) obj;

    if (!getConfigId()
        .equals(other.getConfigId())) return false;
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
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
    hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConfigId().hashCode();
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.WaitForProbeConfigResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.WaitForProbeConfigResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.WaitForProbeConfigResponse)
      org.zenoss.cloud.collection.WaitForProbeConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.WaitForProbeConfigResponse.class, org.zenoss.cloud.collection.WaitForProbeConfigResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.WaitForProbeConfigResponse.newBuilder()
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
        getResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      configId_ = "";
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_WaitForProbeConfigResponse_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.WaitForProbeConfigResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.WaitForProbeConfigResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.WaitForProbeConfigResponse build() {
      org.zenoss.cloud.collection.WaitForProbeConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.WaitForProbeConfigResponse buildPartial() {
      org.zenoss.cloud.collection.WaitForProbeConfigResponse result = new org.zenoss.cloud.collection.WaitForProbeConfigResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.zenoss.cloud.collection.WaitForProbeConfigResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.configId_ = configId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.collection.WaitForProbeConfigResponse) {
        return mergeFrom((org.zenoss.cloud.collection.WaitForProbeConfigResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.WaitForProbeConfigResponse other) {
      if (other == org.zenoss.cloud.collection.WaitForProbeConfigResponse.getDefaultInstance()) return this;
      if (!other.getConfigId().isEmpty()) {
        configId_ = other.configId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
              configId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object configId_ = "";
    /**
     * <code>string config_id = 1 [json_name = "configId"];</code>
     * @return The configId.
     */
    public java.lang.String getConfigId() {
      java.lang.Object ref = configId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        configId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string config_id = 1 [json_name = "configId"];</code>
     * @return The bytes for configId.
     */
    public com.google.protobuf.ByteString
        getConfigIdBytes() {
      java.lang.Object ref = configId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        configId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string config_id = 1 [json_name = "configId"];</code>
     * @param value The configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      configId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string config_id = 1 [json_name = "configId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigId() {
      configId_ = getDefaultInstance().getConfigId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string config_id = 1 [json_name = "configId"];</code>
     * @param value The bytes for configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      configId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private org.zenoss.cloud.collection.ProbeResult result_;
    private com.google.protobuf.SingleFieldBuilder<
        org.zenoss.cloud.collection.ProbeResult, org.zenoss.cloud.collection.ProbeResult.Builder, org.zenoss.cloud.collection.ProbeResultOrBuilder> resultBuilder_;
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     * @return The result.
     */
    public org.zenoss.cloud.collection.ProbeResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? org.zenoss.cloud.collection.ProbeResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    public Builder setResult(org.zenoss.cloud.collection.ProbeResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    public Builder setResult(
        org.zenoss.cloud.collection.ProbeResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    public Builder mergeResult(org.zenoss.cloud.collection.ProbeResult value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          result_ != null &&
          result_ != org.zenoss.cloud.collection.ProbeResult.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000002);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    public org.zenoss.cloud.collection.ProbeResult.Builder getResultBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    public org.zenoss.cloud.collection.ProbeResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            org.zenoss.cloud.collection.ProbeResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeResult result = 2 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.zenoss.cloud.collection.ProbeResult, org.zenoss.cloud.collection.ProbeResult.Builder, org.zenoss.cloud.collection.ProbeResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.zenoss.cloud.collection.ProbeResult, org.zenoss.cloud.collection.ProbeResult.Builder, org.zenoss.cloud.collection.ProbeResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.WaitForProbeConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.WaitForProbeConfigResponse)
  private static final org.zenoss.cloud.collection.WaitForProbeConfigResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.WaitForProbeConfigResponse();
  }

  public static org.zenoss.cloud.collection.WaitForProbeConfigResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WaitForProbeConfigResponse>
      PARSER = new com.google.protobuf.AbstractParser<WaitForProbeConfigResponse>() {
    @java.lang.Override
    public WaitForProbeConfigResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<WaitForProbeConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WaitForProbeConfigResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.WaitForProbeConfigResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

