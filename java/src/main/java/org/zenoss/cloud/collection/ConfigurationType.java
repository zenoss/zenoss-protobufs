// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.ConfigurationType}
 */
public final class ConfigurationType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.ConfigurationType)
    ConfigurationTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfigurationType.newBuilder() to construct.
  private ConfigurationType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfigurationType() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConfigurationType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConfigurationType(
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
            org.zenoss.cloud.collection.MSTeams.Builder subBuilder = null;
            if (configurationTypeCase_ == 1) {
              subBuilder = ((org.zenoss.cloud.collection.MSTeams) configurationType_).toBuilder();
            }
            configurationType_ =
                input.readMessage(org.zenoss.cloud.collection.MSTeams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.zenoss.cloud.collection.MSTeams) configurationType_);
              configurationType_ = subBuilder.buildPartial();
            }
            configurationTypeCase_ = 1;
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
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ConfigurationType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ConfigurationType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.ConfigurationType.class, org.zenoss.cloud.collection.ConfigurationType.Builder.class);
  }

  private int configurationTypeCase_ = 0;
  private java.lang.Object configurationType_;
  public enum ConfigurationTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MS_TEAMS(1),
    CONFIGURATIONTYPE_NOT_SET(0);
    private final int value;
    private ConfigurationTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigurationTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigurationTypeCase forNumber(int value) {
      switch (value) {
        case 1: return MS_TEAMS;
        case 0: return CONFIGURATIONTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConfigurationTypeCase
  getConfigurationTypeCase() {
    return ConfigurationTypeCase.forNumber(
        configurationTypeCase_);
  }

  public static final int MS_TEAMS_FIELD_NUMBER = 1;
  /**
   * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
   * @return Whether the msTeams field is set.
   */
  @java.lang.Override
  public boolean hasMsTeams() {
    return configurationTypeCase_ == 1;
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
   * @return The msTeams.
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.MSTeams getMsTeams() {
    if (configurationTypeCase_ == 1) {
       return (org.zenoss.cloud.collection.MSTeams) configurationType_;
    }
    return org.zenoss.cloud.collection.MSTeams.getDefaultInstance();
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.MSTeamsOrBuilder getMsTeamsOrBuilder() {
    if (configurationTypeCase_ == 1) {
       return (org.zenoss.cloud.collection.MSTeams) configurationType_;
    }
    return org.zenoss.cloud.collection.MSTeams.getDefaultInstance();
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
    if (configurationTypeCase_ == 1) {
      output.writeMessage(1, (org.zenoss.cloud.collection.MSTeams) configurationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configurationTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.zenoss.cloud.collection.MSTeams) configurationType_);
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
    if (!(obj instanceof org.zenoss.cloud.collection.ConfigurationType)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.ConfigurationType other = (org.zenoss.cloud.collection.ConfigurationType) obj;

    if (!getConfigurationTypeCase().equals(other.getConfigurationTypeCase())) return false;
    switch (configurationTypeCase_) {
      case 1:
        if (!getMsTeams()
            .equals(other.getMsTeams())) return false;
        break;
      case 0:
      default:
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
    switch (configurationTypeCase_) {
      case 1:
        hash = (37 * hash) + MS_TEAMS_FIELD_NUMBER;
        hash = (53 * hash) + getMsTeams().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ConfigurationType parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.ConfigurationType prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.ConfigurationType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.ConfigurationType)
      org.zenoss.cloud.collection.ConfigurationTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ConfigurationType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ConfigurationType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.ConfigurationType.class, org.zenoss.cloud.collection.ConfigurationType.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.ConfigurationType.newBuilder()
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
      configurationTypeCase_ = 0;
      configurationType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ConfigurationType_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ConfigurationType getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.ConfigurationType.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ConfigurationType build() {
      org.zenoss.cloud.collection.ConfigurationType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ConfigurationType buildPartial() {
      org.zenoss.cloud.collection.ConfigurationType result = new org.zenoss.cloud.collection.ConfigurationType(this);
      if (configurationTypeCase_ == 1) {
        if (msTeamsBuilder_ == null) {
          result.configurationType_ = configurationType_;
        } else {
          result.configurationType_ = msTeamsBuilder_.build();
        }
      }
      result.configurationTypeCase_ = configurationTypeCase_;
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
      if (other instanceof org.zenoss.cloud.collection.ConfigurationType) {
        return mergeFrom((org.zenoss.cloud.collection.ConfigurationType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.ConfigurationType other) {
      if (other == org.zenoss.cloud.collection.ConfigurationType.getDefaultInstance()) return this;
      switch (other.getConfigurationTypeCase()) {
        case MS_TEAMS: {
          mergeMsTeams(other.getMsTeams());
          break;
        }
        case CONFIGURATIONTYPE_NOT_SET: {
          break;
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
      org.zenoss.cloud.collection.ConfigurationType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.collection.ConfigurationType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int configurationTypeCase_ = 0;
    private java.lang.Object configurationType_;
    public ConfigurationTypeCase
        getConfigurationTypeCase() {
      return ConfigurationTypeCase.forNumber(
          configurationTypeCase_);
    }

    public Builder clearConfigurationType() {
      configurationTypeCase_ = 0;
      configurationType_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.MSTeams, org.zenoss.cloud.collection.MSTeams.Builder, org.zenoss.cloud.collection.MSTeamsOrBuilder> msTeamsBuilder_;
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     * @return Whether the msTeams field is set.
     */
    @java.lang.Override
    public boolean hasMsTeams() {
      return configurationTypeCase_ == 1;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     * @return The msTeams.
     */
    @java.lang.Override
    public org.zenoss.cloud.collection.MSTeams getMsTeams() {
      if (msTeamsBuilder_ == null) {
        if (configurationTypeCase_ == 1) {
          return (org.zenoss.cloud.collection.MSTeams) configurationType_;
        }
        return org.zenoss.cloud.collection.MSTeams.getDefaultInstance();
      } else {
        if (configurationTypeCase_ == 1) {
          return msTeamsBuilder_.getMessage();
        }
        return org.zenoss.cloud.collection.MSTeams.getDefaultInstance();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    public Builder setMsTeams(org.zenoss.cloud.collection.MSTeams value) {
      if (msTeamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configurationType_ = value;
        onChanged();
      } else {
        msTeamsBuilder_.setMessage(value);
      }
      configurationTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    public Builder setMsTeams(
        org.zenoss.cloud.collection.MSTeams.Builder builderForValue) {
      if (msTeamsBuilder_ == null) {
        configurationType_ = builderForValue.build();
        onChanged();
      } else {
        msTeamsBuilder_.setMessage(builderForValue.build());
      }
      configurationTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    public Builder mergeMsTeams(org.zenoss.cloud.collection.MSTeams value) {
      if (msTeamsBuilder_ == null) {
        if (configurationTypeCase_ == 1 &&
            configurationType_ != org.zenoss.cloud.collection.MSTeams.getDefaultInstance()) {
          configurationType_ = org.zenoss.cloud.collection.MSTeams.newBuilder((org.zenoss.cloud.collection.MSTeams) configurationType_)
              .mergeFrom(value).buildPartial();
        } else {
          configurationType_ = value;
        }
        onChanged();
      } else {
        if (configurationTypeCase_ == 1) {
          msTeamsBuilder_.mergeFrom(value);
        }
        msTeamsBuilder_.setMessage(value);
      }
      configurationTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    public Builder clearMsTeams() {
      if (msTeamsBuilder_ == null) {
        if (configurationTypeCase_ == 1) {
          configurationTypeCase_ = 0;
          configurationType_ = null;
          onChanged();
        }
      } else {
        if (configurationTypeCase_ == 1) {
          configurationTypeCase_ = 0;
          configurationType_ = null;
        }
        msTeamsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    public org.zenoss.cloud.collection.MSTeams.Builder getMsTeamsBuilder() {
      return getMsTeamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    @java.lang.Override
    public org.zenoss.cloud.collection.MSTeamsOrBuilder getMsTeamsOrBuilder() {
      if ((configurationTypeCase_ == 1) && (msTeamsBuilder_ != null)) {
        return msTeamsBuilder_.getMessageOrBuilder();
      } else {
        if (configurationTypeCase_ == 1) {
          return (org.zenoss.cloud.collection.MSTeams) configurationType_;
        }
        return org.zenoss.cloud.collection.MSTeams.getDefaultInstance();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.MSTeams ms_teams = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.MSTeams, org.zenoss.cloud.collection.MSTeams.Builder, org.zenoss.cloud.collection.MSTeamsOrBuilder> 
        getMsTeamsFieldBuilder() {
      if (msTeamsBuilder_ == null) {
        if (!(configurationTypeCase_ == 1)) {
          configurationType_ = org.zenoss.cloud.collection.MSTeams.getDefaultInstance();
        }
        msTeamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.collection.MSTeams, org.zenoss.cloud.collection.MSTeams.Builder, org.zenoss.cloud.collection.MSTeamsOrBuilder>(
                (org.zenoss.cloud.collection.MSTeams) configurationType_,
                getParentForChildren(),
                isClean());
        configurationType_ = null;
      }
      configurationTypeCase_ = 1;
      onChanged();;
      return msTeamsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.ConfigurationType)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ConfigurationType)
  private static final org.zenoss.cloud.collection.ConfigurationType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.ConfigurationType();
  }

  public static org.zenoss.cloud.collection.ConfigurationType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigurationType>
      PARSER = new com.google.protobuf.AbstractParser<ConfigurationType>() {
    @java.lang.Override
    public ConfigurationType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConfigurationType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConfigurationType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigurationType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.ConfigurationType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
