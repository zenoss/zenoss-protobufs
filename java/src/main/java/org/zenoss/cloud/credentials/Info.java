// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/credentials.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.credentials;

/**
 * Protobuf type {@code zenoss.cloud.credentials.Info}
 */
public final class Info extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.credentials.Info)
    InfoOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Info.class.getName());
  }
  // Use Info.newBuilder() to construct.
  private Info(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Info() {
    name_ = "";
    type_ = "";
    description_ = "";
    tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_Info_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_Info_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.credentials.Info.class, org.zenoss.cloud.credentials.Info.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1 [json_name = "name"];</code>
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
   * <code>string name = 1 [json_name = "name"];</code>
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

  public static final int TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 3 [json_name = "description"];</code>
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
   * <code>string description = 3 [json_name = "description"];</code>
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

  public static final int TAGS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList tags_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  public java.lang.String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, type_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, description_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, tags_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, description_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
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
    if (!(obj instanceof org.zenoss.cloud.credentials.Info)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.credentials.Info other = (org.zenoss.cloud.credentials.Info) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getTagsList()
        .equals(other.getTagsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.credentials.Info parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.credentials.Info parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.credentials.Info parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.credentials.Info parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.credentials.Info prototype) {
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
   * Protobuf type {@code zenoss.cloud.credentials.Info}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.credentials.Info)
      org.zenoss.cloud.credentials.InfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_Info_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_Info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.credentials.Info.class, org.zenoss.cloud.credentials.Info.Builder.class);
    }

    // Construct using org.zenoss.cloud.credentials.Info.newBuilder()
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
      name_ = "";
      type_ = "";
      description_ = "";
      tags_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_Info_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.credentials.Info getDefaultInstanceForType() {
      return org.zenoss.cloud.credentials.Info.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.credentials.Info build() {
      org.zenoss.cloud.credentials.Info result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.credentials.Info buildPartial() {
      org.zenoss.cloud.credentials.Info result = new org.zenoss.cloud.credentials.Info(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.zenoss.cloud.credentials.Info result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        tags_.makeImmutable();
        result.tags_ = tags_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.credentials.Info) {
        return mergeFrom((org.zenoss.cloud.credentials.Info)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.credentials.Info other) {
      if (other == org.zenoss.cloud.credentials.Info.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ |= 0x00000008;
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
        }
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTagsIsMutable();
              tags_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
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
     * <code>string name = 1 [json_name = "name"];</code>
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
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2 [json_name = "type"];</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2 [json_name = "type"];</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2 [json_name = "type"];</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3 [json_name = "description"];</code>
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
     * <code>string description = 3 [json_name = "description"];</code>
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
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTagsIsMutable() {
      if (!tags_.isModifiable()) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @return A list containing the tags.
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      tags_.makeImmutable();
      return tags_;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @return The count of tags.
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param index The index to set the value at.
     * @param value The tags to set.
     * @return This builder for chaining.
     */
    public Builder setTags(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param value The tags to add.
     * @return This builder for chaining.
     */
    public Builder addTags(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param values The tags to add.
     * @return This builder for chaining.
     */
    public Builder addAllTags(
        java.lang.Iterable<java.lang.String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTags() {
      tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param value The bytes of the tags to add.
     * @return This builder for chaining.
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:zenoss.cloud.credentials.Info)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.credentials.Info)
  private static final org.zenoss.cloud.credentials.Info DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.credentials.Info();
  }

  public static org.zenoss.cloud.credentials.Info getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Info>
      PARSER = new com.google.protobuf.AbstractParser<Info>() {
    @java.lang.Override
    public Info parsePartialFrom(
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

  public static com.google.protobuf.Parser<Info> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Info> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.credentials.Info getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

