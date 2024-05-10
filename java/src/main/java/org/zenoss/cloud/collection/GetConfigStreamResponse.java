// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.GetConfigStreamResponse}
 */
public final class GetConfigStreamResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.GetConfigStreamResponse)
    GetConfigStreamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GetConfigStreamResponse.class.getName());
  }
  // Use GetConfigStreamResponse.newBuilder() to construct.
  private GetConfigStreamResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetConfigStreamResponse() {
    configuration_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.GetConfigStreamResponse.class, org.zenoss.cloud.collection.GetConfigStreamResponse.Builder.class);
  }

  public static final int CONFIGURATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.zenoss.cloud.collection.Config> configuration_;
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
   */
  @java.lang.Override
  public java.util.List<org.zenoss.cloud.collection.Config> getConfigurationList() {
    return configuration_;
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.zenoss.cloud.collection.ConfigOrBuilder> 
      getConfigurationOrBuilderList() {
    return configuration_;
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
   */
  @java.lang.Override
  public int getConfigurationCount() {
    return configuration_.size();
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.Config getConfiguration(int index) {
    return configuration_.get(index);
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ConfigOrBuilder getConfigurationOrBuilder(
      int index) {
    return configuration_.get(index);
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
    for (int i = 0; i < configuration_.size(); i++) {
      output.writeMessage(1, configuration_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < configuration_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, configuration_.get(i));
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
    if (!(obj instanceof org.zenoss.cloud.collection.GetConfigStreamResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.GetConfigStreamResponse other = (org.zenoss.cloud.collection.GetConfigStreamResponse) obj;

    if (!getConfigurationList()
        .equals(other.getConfigurationList())) return false;
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
    if (getConfigurationCount() > 0) {
      hash = (37 * hash) + CONFIGURATION_FIELD_NUMBER;
      hash = (53 * hash) + getConfigurationList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.GetConfigStreamResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.GetConfigStreamResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.GetConfigStreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.GetConfigStreamResponse)
      org.zenoss.cloud.collection.GetConfigStreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.GetConfigStreamResponse.class, org.zenoss.cloud.collection.GetConfigStreamResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.GetConfigStreamResponse.newBuilder()
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
      if (configurationBuilder_ == null) {
        configuration_ = java.util.Collections.emptyList();
      } else {
        configuration_ = null;
        configurationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_GetConfigStreamResponse_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.GetConfigStreamResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.GetConfigStreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.GetConfigStreamResponse build() {
      org.zenoss.cloud.collection.GetConfigStreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.GetConfigStreamResponse buildPartial() {
      org.zenoss.cloud.collection.GetConfigStreamResponse result = new org.zenoss.cloud.collection.GetConfigStreamResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.zenoss.cloud.collection.GetConfigStreamResponse result) {
      if (configurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          configuration_ = java.util.Collections.unmodifiableList(configuration_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.configuration_ = configuration_;
      } else {
        result.configuration_ = configurationBuilder_.build();
      }
    }

    private void buildPartial0(org.zenoss.cloud.collection.GetConfigStreamResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.collection.GetConfigStreamResponse) {
        return mergeFrom((org.zenoss.cloud.collection.GetConfigStreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.GetConfigStreamResponse other) {
      if (other == org.zenoss.cloud.collection.GetConfigStreamResponse.getDefaultInstance()) return this;
      if (configurationBuilder_ == null) {
        if (!other.configuration_.isEmpty()) {
          if (configuration_.isEmpty()) {
            configuration_ = other.configuration_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfigurationIsMutable();
            configuration_.addAll(other.configuration_);
          }
          onChanged();
        }
      } else {
        if (!other.configuration_.isEmpty()) {
          if (configurationBuilder_.isEmpty()) {
            configurationBuilder_.dispose();
            configurationBuilder_ = null;
            configuration_ = other.configuration_;
            bitField0_ = (bitField0_ & ~0x00000001);
            configurationBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getConfigurationFieldBuilder() : null;
          } else {
            configurationBuilder_.addAllMessages(other.configuration_);
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
            case 10: {
              org.zenoss.cloud.collection.Config m =
                  input.readMessage(
                      org.zenoss.cloud.collection.Config.parser(),
                      extensionRegistry);
              if (configurationBuilder_ == null) {
                ensureConfigurationIsMutable();
                configuration_.add(m);
              } else {
                configurationBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<org.zenoss.cloud.collection.Config> configuration_ =
      java.util.Collections.emptyList();
    private void ensureConfigurationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        configuration_ = new java.util.ArrayList<org.zenoss.cloud.collection.Config>(configuration_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.zenoss.cloud.collection.Config, org.zenoss.cloud.collection.Config.Builder, org.zenoss.cloud.collection.ConfigOrBuilder> configurationBuilder_;

    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public java.util.List<org.zenoss.cloud.collection.Config> getConfigurationList() {
      if (configurationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(configuration_);
      } else {
        return configurationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public int getConfigurationCount() {
      if (configurationBuilder_ == null) {
        return configuration_.size();
      } else {
        return configurationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public org.zenoss.cloud.collection.Config getConfiguration(int index) {
      if (configurationBuilder_ == null) {
        return configuration_.get(index);
      } else {
        return configurationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder setConfiguration(
        int index, org.zenoss.cloud.collection.Config value) {
      if (configurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationIsMutable();
        configuration_.set(index, value);
        onChanged();
      } else {
        configurationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder setConfiguration(
        int index, org.zenoss.cloud.collection.Config.Builder builderForValue) {
      if (configurationBuilder_ == null) {
        ensureConfigurationIsMutable();
        configuration_.set(index, builderForValue.build());
        onChanged();
      } else {
        configurationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder addConfiguration(org.zenoss.cloud.collection.Config value) {
      if (configurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationIsMutable();
        configuration_.add(value);
        onChanged();
      } else {
        configurationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder addConfiguration(
        int index, org.zenoss.cloud.collection.Config value) {
      if (configurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationIsMutable();
        configuration_.add(index, value);
        onChanged();
      } else {
        configurationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder addConfiguration(
        org.zenoss.cloud.collection.Config.Builder builderForValue) {
      if (configurationBuilder_ == null) {
        ensureConfigurationIsMutable();
        configuration_.add(builderForValue.build());
        onChanged();
      } else {
        configurationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder addConfiguration(
        int index, org.zenoss.cloud.collection.Config.Builder builderForValue) {
      if (configurationBuilder_ == null) {
        ensureConfigurationIsMutable();
        configuration_.add(index, builderForValue.build());
        onChanged();
      } else {
        configurationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder addAllConfiguration(
        java.lang.Iterable<? extends org.zenoss.cloud.collection.Config> values) {
      if (configurationBuilder_ == null) {
        ensureConfigurationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, configuration_);
        onChanged();
      } else {
        configurationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder clearConfiguration() {
      if (configurationBuilder_ == null) {
        configuration_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        configurationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public Builder removeConfiguration(int index) {
      if (configurationBuilder_ == null) {
        ensureConfigurationIsMutable();
        configuration_.remove(index);
        onChanged();
      } else {
        configurationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public org.zenoss.cloud.collection.Config.Builder getConfigurationBuilder(
        int index) {
      return getConfigurationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public org.zenoss.cloud.collection.ConfigOrBuilder getConfigurationOrBuilder(
        int index) {
      if (configurationBuilder_ == null) {
        return configuration_.get(index);  } else {
        return configurationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public java.util.List<? extends org.zenoss.cloud.collection.ConfigOrBuilder> 
         getConfigurationOrBuilderList() {
      if (configurationBuilder_ != null) {
        return configurationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(configuration_);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public org.zenoss.cloud.collection.Config.Builder addConfigurationBuilder() {
      return getConfigurationFieldBuilder().addBuilder(
          org.zenoss.cloud.collection.Config.getDefaultInstance());
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public org.zenoss.cloud.collection.Config.Builder addConfigurationBuilder(
        int index) {
      return getConfigurationFieldBuilder().addBuilder(
          index, org.zenoss.cloud.collection.Config.getDefaultInstance());
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configuration = 1 [json_name = "configuration"];</code>
     */
    public java.util.List<org.zenoss.cloud.collection.Config.Builder> 
         getConfigurationBuilderList() {
      return getConfigurationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.zenoss.cloud.collection.Config, org.zenoss.cloud.collection.Config.Builder, org.zenoss.cloud.collection.ConfigOrBuilder> 
        getConfigurationFieldBuilder() {
      if (configurationBuilder_ == null) {
        configurationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.zenoss.cloud.collection.Config, org.zenoss.cloud.collection.Config.Builder, org.zenoss.cloud.collection.ConfigOrBuilder>(
                configuration_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        configuration_ = null;
      }
      return configurationBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.GetConfigStreamResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.GetConfigStreamResponse)
  private static final org.zenoss.cloud.collection.GetConfigStreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.GetConfigStreamResponse();
  }

  public static org.zenoss.cloud.collection.GetConfigStreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConfigStreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetConfigStreamResponse>() {
    @java.lang.Override
    public GetConfigStreamResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetConfigStreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConfigStreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.GetConfigStreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

