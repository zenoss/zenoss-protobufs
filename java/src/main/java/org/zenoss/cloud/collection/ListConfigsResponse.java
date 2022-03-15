// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.ListConfigsResponse}
 */
public final class ListConfigsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.ListConfigsResponse)
    ListConfigsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConfigsResponse.newBuilder() to construct.
  private ListConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConfigsResponse() {
    configurations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConfigsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListConfigsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              configurations_ = new java.util.ArrayList<org.zenoss.cloud.collection.Config>();
              mutable_bitField0_ |= 0x00000001;
            }
            configurations_.add(
                input.readMessage(org.zenoss.cloud.collection.Config.parser(), extensionRegistry));
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
        configurations_ = java.util.Collections.unmodifiableList(configurations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ListConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ListConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.ListConfigsResponse.class, org.zenoss.cloud.collection.ListConfigsResponse.Builder.class);
  }

  public static final int CONFIGURATIONS_FIELD_NUMBER = 1;
  private java.util.List<org.zenoss.cloud.collection.Config> configurations_;
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.zenoss.cloud.collection.Config> getConfigurationsList() {
    return configurations_;
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.zenoss.cloud.collection.ConfigOrBuilder> 
      getConfigurationsOrBuilderList() {
    return configurations_;
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  @java.lang.Override
  public int getConfigurationsCount() {
    return configurations_.size();
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.Config getConfigurations(int index) {
    return configurations_.get(index);
  }
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ConfigOrBuilder getConfigurationsOrBuilder(
      int index) {
    return configurations_.get(index);
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
    for (int i = 0; i < configurations_.size(); i++) {
      output.writeMessage(1, configurations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < configurations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, configurations_.get(i));
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
    if (!(obj instanceof org.zenoss.cloud.collection.ListConfigsResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.ListConfigsResponse other = (org.zenoss.cloud.collection.ListConfigsResponse) obj;

    if (!getConfigurationsList()
        .equals(other.getConfigurationsList())) return false;
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
    if (getConfigurationsCount() > 0) {
      hash = (37 * hash) + CONFIGURATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConfigurationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ListConfigsResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.ListConfigsResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.ListConfigsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.ListConfigsResponse)
      org.zenoss.cloud.collection.ListConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ListConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ListConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.ListConfigsResponse.class, org.zenoss.cloud.collection.ListConfigsResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.ListConfigsResponse.newBuilder()
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
        getConfigurationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (configurationsBuilder_ == null) {
        configurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        configurationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ListConfigsResponse_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ListConfigsResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.ListConfigsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ListConfigsResponse build() {
      org.zenoss.cloud.collection.ListConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ListConfigsResponse buildPartial() {
      org.zenoss.cloud.collection.ListConfigsResponse result = new org.zenoss.cloud.collection.ListConfigsResponse(this);
      int from_bitField0_ = bitField0_;
      if (configurationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          configurations_ = java.util.Collections.unmodifiableList(configurations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.configurations_ = configurations_;
      } else {
        result.configurations_ = configurationsBuilder_.build();
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
      if (other instanceof org.zenoss.cloud.collection.ListConfigsResponse) {
        return mergeFrom((org.zenoss.cloud.collection.ListConfigsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.ListConfigsResponse other) {
      if (other == org.zenoss.cloud.collection.ListConfigsResponse.getDefaultInstance()) return this;
      if (configurationsBuilder_ == null) {
        if (!other.configurations_.isEmpty()) {
          if (configurations_.isEmpty()) {
            configurations_ = other.configurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfigurationsIsMutable();
            configurations_.addAll(other.configurations_);
          }
          onChanged();
        }
      } else {
        if (!other.configurations_.isEmpty()) {
          if (configurationsBuilder_.isEmpty()) {
            configurationsBuilder_.dispose();
            configurationsBuilder_ = null;
            configurations_ = other.configurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            configurationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConfigurationsFieldBuilder() : null;
          } else {
            configurationsBuilder_.addAllMessages(other.configurations_);
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
      org.zenoss.cloud.collection.ListConfigsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.collection.ListConfigsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.zenoss.cloud.collection.Config> configurations_ =
      java.util.Collections.emptyList();
    private void ensureConfigurationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        configurations_ = new java.util.ArrayList<org.zenoss.cloud.collection.Config>(configurations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.zenoss.cloud.collection.Config, org.zenoss.cloud.collection.Config.Builder, org.zenoss.cloud.collection.ConfigOrBuilder> configurationsBuilder_;

    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public java.util.List<org.zenoss.cloud.collection.Config> getConfigurationsList() {
      if (configurationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(configurations_);
      } else {
        return configurationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public int getConfigurationsCount() {
      if (configurationsBuilder_ == null) {
        return configurations_.size();
      } else {
        return configurationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public org.zenoss.cloud.collection.Config getConfigurations(int index) {
      if (configurationsBuilder_ == null) {
        return configurations_.get(index);
      } else {
        return configurationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder setConfigurations(
        int index, org.zenoss.cloud.collection.Config value) {
      if (configurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationsIsMutable();
        configurations_.set(index, value);
        onChanged();
      } else {
        configurationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder setConfigurations(
        int index, org.zenoss.cloud.collection.Config.Builder builderForValue) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.set(index, builderForValue.build());
        onChanged();
      } else {
        configurationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder addConfigurations(org.zenoss.cloud.collection.Config value) {
      if (configurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationsIsMutable();
        configurations_.add(value);
        onChanged();
      } else {
        configurationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder addConfigurations(
        int index, org.zenoss.cloud.collection.Config value) {
      if (configurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConfigurationsIsMutable();
        configurations_.add(index, value);
        onChanged();
      } else {
        configurationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder addConfigurations(
        org.zenoss.cloud.collection.Config.Builder builderForValue) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.add(builderForValue.build());
        onChanged();
      } else {
        configurationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder addConfigurations(
        int index, org.zenoss.cloud.collection.Config.Builder builderForValue) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.add(index, builderForValue.build());
        onChanged();
      } else {
        configurationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder addAllConfigurations(
        java.lang.Iterable<? extends org.zenoss.cloud.collection.Config> values) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, configurations_);
        onChanged();
      } else {
        configurationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder clearConfigurations() {
      if (configurationsBuilder_ == null) {
        configurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        configurationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public Builder removeConfigurations(int index) {
      if (configurationsBuilder_ == null) {
        ensureConfigurationsIsMutable();
        configurations_.remove(index);
        onChanged();
      } else {
        configurationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public org.zenoss.cloud.collection.Config.Builder getConfigurationsBuilder(
        int index) {
      return getConfigurationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public org.zenoss.cloud.collection.ConfigOrBuilder getConfigurationsOrBuilder(
        int index) {
      if (configurationsBuilder_ == null) {
        return configurations_.get(index);  } else {
        return configurationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public java.util.List<? extends org.zenoss.cloud.collection.ConfigOrBuilder> 
         getConfigurationsOrBuilderList() {
      if (configurationsBuilder_ != null) {
        return configurationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(configurations_);
      }
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public org.zenoss.cloud.collection.Config.Builder addConfigurationsBuilder() {
      return getConfigurationsFieldBuilder().addBuilder(
          org.zenoss.cloud.collection.Config.getDefaultInstance());
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public org.zenoss.cloud.collection.Config.Builder addConfigurationsBuilder(
        int index) {
      return getConfigurationsFieldBuilder().addBuilder(
          index, org.zenoss.cloud.collection.Config.getDefaultInstance());
    }
    /**
     * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
     */
    public java.util.List<org.zenoss.cloud.collection.Config.Builder> 
         getConfigurationsBuilderList() {
      return getConfigurationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.zenoss.cloud.collection.Config, org.zenoss.cloud.collection.Config.Builder, org.zenoss.cloud.collection.ConfigOrBuilder> 
        getConfigurationsFieldBuilder() {
      if (configurationsBuilder_ == null) {
        configurationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.zenoss.cloud.collection.Config, org.zenoss.cloud.collection.Config.Builder, org.zenoss.cloud.collection.ConfigOrBuilder>(
                configurations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        configurations_ = null;
      }
      return configurationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.ListConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ListConfigsResponse)
  private static final org.zenoss.cloud.collection.ListConfigsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.ListConfigsResponse();
  }

  public static org.zenoss.cloud.collection.ListConfigsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConfigsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListConfigsResponse>() {
    @java.lang.Override
    public ListConfigsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListConfigsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.ListConfigsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
