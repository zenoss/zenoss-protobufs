// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    id_ = "";
    name_ = "";
    tenant_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            tenant_ = s;
            break;
          }
          case 42: {
            org.zenoss.cloud.collection.Configuration.Builder subBuilder = null;
            if (configuration_ != null) {
              subBuilder = configuration_.toBuilder();
            }
            configuration_ = input.readMessage(org.zenoss.cloud.collection.Configuration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(configuration_);
              configuration_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.Config.class, org.zenoss.cloud.collection.Config.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANT_FIELD_NUMBER = 3;
  private volatile java.lang.Object tenant_;
  /**
   * <code>string tenant = 3;</code>
   * @return The tenant.
   */
  @java.lang.Override
  public java.lang.String getTenant() {
    java.lang.Object ref = tenant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tenant_ = s;
      return s;
    }
  }
  /**
   * <code>string tenant = 3;</code>
   * @return The bytes for tenant.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantBytes() {
    java.lang.Object ref = tenant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tenant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIGURATION_FIELD_NUMBER = 5;
  private org.zenoss.cloud.collection.Configuration configuration_;
  /**
   * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
   * @return Whether the configuration field is set.
   */
  @java.lang.Override
  public boolean hasConfiguration() {
    return configuration_ != null;
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
   * @return The configuration.
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.Configuration getConfiguration() {
    return configuration_ == null ? org.zenoss.cloud.collection.Configuration.getDefaultInstance() : configuration_;
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ConfigurationOrBuilder getConfigurationOrBuilder() {
    return getConfiguration();
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getTenantBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tenant_);
    }
    if (configuration_ != null) {
      output.writeMessage(5, getConfiguration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getTenantBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tenant_);
    }
    if (configuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getConfiguration());
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
    if (!(obj instanceof org.zenoss.cloud.collection.Config)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.Config other = (org.zenoss.cloud.collection.Config) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getTenant()
        .equals(other.getTenant())) return false;
    if (hasConfiguration() != other.hasConfiguration()) return false;
    if (hasConfiguration()) {
      if (!getConfiguration()
          .equals(other.getConfiguration())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TENANT_FIELD_NUMBER;
    hash = (53 * hash) + getTenant().hashCode();
    if (hasConfiguration()) {
      hash = (37 * hash) + CONFIGURATION_FIELD_NUMBER;
      hash = (53 * hash) + getConfiguration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.Config parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.Config prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.Config)
      org.zenoss.cloud.collection.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.Config.class, org.zenoss.cloud.collection.Config.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.Config.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      name_ = "";

      tenant_ = "";

      if (configurationBuilder_ == null) {
        configuration_ = null;
      } else {
        configuration_ = null;
        configurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_Config_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.Config getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.Config.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.Config build() {
      org.zenoss.cloud.collection.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.Config buildPartial() {
      org.zenoss.cloud.collection.Config result = new org.zenoss.cloud.collection.Config(this);
      result.id_ = id_;
      result.name_ = name_;
      result.tenant_ = tenant_;
      if (configurationBuilder_ == null) {
        result.configuration_ = configuration_;
      } else {
        result.configuration_ = configurationBuilder_.build();
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
      if (other instanceof org.zenoss.cloud.collection.Config) {
        return mergeFrom((org.zenoss.cloud.collection.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.Config other) {
      if (other == org.zenoss.cloud.collection.Config.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getTenant().isEmpty()) {
        tenant_ = other.tenant_;
        onChanged();
      }
      if (other.hasConfiguration()) {
        mergeConfiguration(other.getConfiguration());
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
      org.zenoss.cloud.collection.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.collection.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tenant_ = "";
    /**
     * <code>string tenant = 3;</code>
     * @return The tenant.
     */
    public java.lang.String getTenant() {
      java.lang.Object ref = tenant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tenant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tenant = 3;</code>
     * @return The bytes for tenant.
     */
    public com.google.protobuf.ByteString
        getTenantBytes() {
      java.lang.Object ref = tenant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tenant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tenant = 3;</code>
     * @param value The tenant to set.
     * @return This builder for chaining.
     */
    public Builder setTenant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tenant_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tenant = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenant() {
      
      tenant_ = getDefaultInstance().getTenant();
      onChanged();
      return this;
    }
    /**
     * <code>string tenant = 3;</code>
     * @param value The bytes for tenant to set.
     * @return This builder for chaining.
     */
    public Builder setTenantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tenant_ = value;
      onChanged();
      return this;
    }

    private org.zenoss.cloud.collection.Configuration configuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.Configuration, org.zenoss.cloud.collection.Configuration.Builder, org.zenoss.cloud.collection.ConfigurationOrBuilder> configurationBuilder_;
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     * @return Whether the configuration field is set.
     */
    public boolean hasConfiguration() {
      return configurationBuilder_ != null || configuration_ != null;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     * @return The configuration.
     */
    public org.zenoss.cloud.collection.Configuration getConfiguration() {
      if (configurationBuilder_ == null) {
        return configuration_ == null ? org.zenoss.cloud.collection.Configuration.getDefaultInstance() : configuration_;
      } else {
        return configurationBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    public Builder setConfiguration(org.zenoss.cloud.collection.Configuration value) {
      if (configurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configuration_ = value;
        onChanged();
      } else {
        configurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    public Builder setConfiguration(
        org.zenoss.cloud.collection.Configuration.Builder builderForValue) {
      if (configurationBuilder_ == null) {
        configuration_ = builderForValue.build();
        onChanged();
      } else {
        configurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    public Builder mergeConfiguration(org.zenoss.cloud.collection.Configuration value) {
      if (configurationBuilder_ == null) {
        if (configuration_ != null) {
          configuration_ =
            org.zenoss.cloud.collection.Configuration.newBuilder(configuration_).mergeFrom(value).buildPartial();
        } else {
          configuration_ = value;
        }
        onChanged();
      } else {
        configurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    public Builder clearConfiguration() {
      if (configurationBuilder_ == null) {
        configuration_ = null;
        onChanged();
      } else {
        configuration_ = null;
        configurationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    public org.zenoss.cloud.collection.Configuration.Builder getConfigurationBuilder() {
      
      onChanged();
      return getConfigurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    public org.zenoss.cloud.collection.ConfigurationOrBuilder getConfigurationOrBuilder() {
      if (configurationBuilder_ != null) {
        return configurationBuilder_.getMessageOrBuilder();
      } else {
        return configuration_ == null ?
            org.zenoss.cloud.collection.Configuration.getDefaultInstance() : configuration_;
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.Configuration configuration = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.Configuration, org.zenoss.cloud.collection.Configuration.Builder, org.zenoss.cloud.collection.ConfigurationOrBuilder> 
        getConfigurationFieldBuilder() {
      if (configurationBuilder_ == null) {
        configurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.collection.Configuration, org.zenoss.cloud.collection.Configuration.Builder, org.zenoss.cloud.collection.ConfigurationOrBuilder>(
                getConfiguration(),
                getParentForChildren(),
                isClean());
        configuration_ = null;
      }
      return configurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.Config)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.Config)
  private static final org.zenoss.cloud.collection.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.Config();
  }

  public static org.zenoss.cloud.collection.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

