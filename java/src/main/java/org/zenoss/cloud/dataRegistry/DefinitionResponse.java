// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

/**
 * Protobuf type {@code zenoss.cloud.DefinitionResponse}
 */
public final class DefinitionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.DefinitionResponse)
    DefinitionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DefinitionResponse.newBuilder() to construct.
  private DefinitionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DefinitionResponse() {
    definitionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DefinitionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DefinitionResponse(
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

            definitionId_ = s;
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
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_DefinitionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_DefinitionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataRegistry.DefinitionResponse.class, org.zenoss.cloud.dataRegistry.DefinitionResponse.Builder.class);
  }

  public static final int DEFINITIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object definitionId_;
  /**
   * <code>string definitionId = 1;</code>
   * @return The definitionId.
   */
  @java.lang.Override
  public java.lang.String getDefinitionId() {
    java.lang.Object ref = definitionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      definitionId_ = s;
      return s;
    }
  }
  /**
   * <code>string definitionId = 1;</code>
   * @return The bytes for definitionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefinitionIdBytes() {
    java.lang.Object ref = definitionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      definitionId_ = b;
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
    if (!getDefinitionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, definitionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDefinitionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, definitionId_);
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
    if (!(obj instanceof org.zenoss.cloud.dataRegistry.DefinitionResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataRegistry.DefinitionResponse other = (org.zenoss.cloud.dataRegistry.DefinitionResponse) obj;

    if (!getDefinitionId()
        .equals(other.getDefinitionId())) return false;
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
    hash = (37 * hash) + DEFINITIONID_FIELD_NUMBER;
    hash = (53 * hash) + getDefinitionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.DefinitionResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataRegistry.DefinitionResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.DefinitionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.DefinitionResponse)
      org.zenoss.cloud.dataRegistry.DefinitionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_DefinitionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_DefinitionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataRegistry.DefinitionResponse.class, org.zenoss.cloud.dataRegistry.DefinitionResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataRegistry.DefinitionResponse.newBuilder()
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
      definitionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_DefinitionResponse_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.DefinitionResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.dataRegistry.DefinitionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.DefinitionResponse build() {
      org.zenoss.cloud.dataRegistry.DefinitionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.DefinitionResponse buildPartial() {
      org.zenoss.cloud.dataRegistry.DefinitionResponse result = new org.zenoss.cloud.dataRegistry.DefinitionResponse(this);
      result.definitionId_ = definitionId_;
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
      if (other instanceof org.zenoss.cloud.dataRegistry.DefinitionResponse) {
        return mergeFrom((org.zenoss.cloud.dataRegistry.DefinitionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataRegistry.DefinitionResponse other) {
      if (other == org.zenoss.cloud.dataRegistry.DefinitionResponse.getDefaultInstance()) return this;
      if (!other.getDefinitionId().isEmpty()) {
        definitionId_ = other.definitionId_;
        onChanged();
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
      org.zenoss.cloud.dataRegistry.DefinitionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.dataRegistry.DefinitionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object definitionId_ = "";
    /**
     * <code>string definitionId = 1;</code>
     * @return The definitionId.
     */
    public java.lang.String getDefinitionId() {
      java.lang.Object ref = definitionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        definitionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string definitionId = 1;</code>
     * @return The bytes for definitionId.
     */
    public com.google.protobuf.ByteString
        getDefinitionIdBytes() {
      java.lang.Object ref = definitionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        definitionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string definitionId = 1;</code>
     * @param value The definitionId to set.
     * @return This builder for chaining.
     */
    public Builder setDefinitionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      definitionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string definitionId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefinitionId() {
      
      definitionId_ = getDefaultInstance().getDefinitionId();
      onChanged();
      return this;
    }
    /**
     * <code>string definitionId = 1;</code>
     * @param value The bytes for definitionId to set.
     * @return This builder for chaining.
     */
    public Builder setDefinitionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      definitionId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.DefinitionResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.DefinitionResponse)
  private static final org.zenoss.cloud.dataRegistry.DefinitionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataRegistry.DefinitionResponse();
  }

  public static org.zenoss.cloud.dataRegistry.DefinitionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DefinitionResponse>
      PARSER = new com.google.protobuf.AbstractParser<DefinitionResponse>() {
    @java.lang.Override
    public DefinitionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DefinitionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DefinitionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DefinitionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.dataRegistry.DefinitionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

