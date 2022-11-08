// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

/**
 * Protobuf type {@code zenoss.cloud.UpdateMetricRequest}
 */
public final class UpdateMetricRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.UpdateMetricRequest)
    UpdateMetricRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateMetricRequest.newBuilder() to construct.
  private UpdateMetricRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateMetricRequest() {
    instanceId_ = "";
    updateMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateMetricRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_UpdateMetricRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_UpdateMetricRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataRegistry.UpdateMetricRequest.class, org.zenoss.cloud.dataRegistry.UpdateMetricRequest.Builder.class);
  }

  public static final int INSTANCEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceId_;
  /**
   * <code>string instanceId = 1 [json_name = "instanceId"];</code>
   * @return The instanceId.
   */
  @java.lang.Override
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   * <code>string instanceId = 1 [json_name = "instanceId"];</code>
   * @return The bytes for instanceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATAFIELDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct metadataFields_;
  /**
   * <pre>
   * Metadata for the datapoint
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
   * @return Whether the metadataFields field is set.
   */
  @java.lang.Override
  public boolean hasMetadataFields() {
    return metadataFields_ != null;
  }
  /**
   * <pre>
   * Metadata for the datapoint
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
   * @return The metadataFields.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getMetadataFields() {
    return metadataFields_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadataFields_;
  }
  /**
   * <pre>
   * Metadata for the datapoint
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder() {
    return getMetadataFields();
  }

  public static final int UPDATE_MODE_FIELD_NUMBER = 3;
  private int updateMode_;
  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
   * @return The enum numeric value on the wire for updateMode.
   */
  @java.lang.Override public int getUpdateModeValue() {
    return updateMode_;
  }
  /**
   * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
   * @return The updateMode.
   */
  @java.lang.Override public org.zenoss.cloud.dataRegistry.UpdateMode getUpdateMode() {
    @SuppressWarnings("deprecation")
    org.zenoss.cloud.dataRegistry.UpdateMode result = org.zenoss.cloud.dataRegistry.UpdateMode.valueOf(updateMode_);
    return result == null ? org.zenoss.cloud.dataRegistry.UpdateMode.UNRECOGNIZED : result;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 4 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceId_);
    }
    if (metadataFields_ != null) {
      output.writeMessage(2, getMetadataFields());
    }
    if (updateMode_ != org.zenoss.cloud.dataRegistry.UpdateMode.MERGE.getNumber()) {
      output.writeEnum(3, updateMode_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(4, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceId_);
    }
    if (metadataFields_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadataFields());
    }
    if (updateMode_ != org.zenoss.cloud.dataRegistry.UpdateMode.MERGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, updateMode_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, timestamp_);
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
    if (!(obj instanceof org.zenoss.cloud.dataRegistry.UpdateMetricRequest)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataRegistry.UpdateMetricRequest other = (org.zenoss.cloud.dataRegistry.UpdateMetricRequest) obj;

    if (!getInstanceId()
        .equals(other.getInstanceId())) return false;
    if (hasMetadataFields() != other.hasMetadataFields()) return false;
    if (hasMetadataFields()) {
      if (!getMetadataFields()
          .equals(other.getMetadataFields())) return false;
    }
    if (updateMode_ != other.updateMode_) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + INSTANCEID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    if (hasMetadataFields()) {
      hash = (37 * hash) + METADATAFIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataFields().hashCode();
    }
    hash = (37 * hash) + UPDATE_MODE_FIELD_NUMBER;
    hash = (53 * hash) + updateMode_;
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataRegistry.UpdateMetricRequest prototype) {
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
   * Protobuf type {@code zenoss.cloud.UpdateMetricRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.UpdateMetricRequest)
      org.zenoss.cloud.dataRegistry.UpdateMetricRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_UpdateMetricRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_UpdateMetricRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataRegistry.UpdateMetricRequest.class, org.zenoss.cloud.dataRegistry.UpdateMetricRequest.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataRegistry.UpdateMetricRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instanceId_ = "";

      if (metadataFieldsBuilder_ == null) {
        metadataFields_ = null;
      } else {
        metadataFields_ = null;
        metadataFieldsBuilder_ = null;
      }
      updateMode_ = 0;

      timestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_UpdateMetricRequest_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.UpdateMetricRequest getDefaultInstanceForType() {
      return org.zenoss.cloud.dataRegistry.UpdateMetricRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.UpdateMetricRequest build() {
      org.zenoss.cloud.dataRegistry.UpdateMetricRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.UpdateMetricRequest buildPartial() {
      org.zenoss.cloud.dataRegistry.UpdateMetricRequest result = new org.zenoss.cloud.dataRegistry.UpdateMetricRequest(this);
      result.instanceId_ = instanceId_;
      if (metadataFieldsBuilder_ == null) {
        result.metadataFields_ = metadataFields_;
      } else {
        result.metadataFields_ = metadataFieldsBuilder_.build();
      }
      result.updateMode_ = updateMode_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof org.zenoss.cloud.dataRegistry.UpdateMetricRequest) {
        return mergeFrom((org.zenoss.cloud.dataRegistry.UpdateMetricRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataRegistry.UpdateMetricRequest other) {
      if (other == org.zenoss.cloud.dataRegistry.UpdateMetricRequest.getDefaultInstance()) return this;
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
        onChanged();
      }
      if (other.hasMetadataFields()) {
        mergeMetadataFields(other.getMetadataFields());
      }
      if (other.updateMode_ != 0) {
        setUpdateModeValue(other.getUpdateModeValue());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              instanceId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataFieldsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              updateMode_ = input.readEnum();

              break;
            } // case 24
            case 32: {
              timestamp_ = input.readInt64();

              break;
            } // case 32
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

    private java.lang.Object instanceId_ = "";
    /**
     * <code>string instanceId = 1 [json_name = "instanceId"];</code>
     * @return The instanceId.
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string instanceId = 1 [json_name = "instanceId"];</code>
     * @return The bytes for instanceId.
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string instanceId = 1 [json_name = "instanceId"];</code>
     * @param value The instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string instanceId = 1 [json_name = "instanceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceId() {
      
      instanceId_ = getDefaultInstance().getInstanceId();
      onChanged();
      return this;
    }
    /**
     * <code>string instanceId = 1 [json_name = "instanceId"];</code>
     * @param value The bytes for instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct metadataFields_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> metadataFieldsBuilder_;
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     * @return Whether the metadataFields field is set.
     */
    public boolean hasMetadataFields() {
      return metadataFieldsBuilder_ != null || metadataFields_ != null;
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     * @return The metadataFields.
     */
    public com.google.protobuf.Struct getMetadataFields() {
      if (metadataFieldsBuilder_ == null) {
        return metadataFields_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadataFields_;
      } else {
        return metadataFieldsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    public Builder setMetadataFields(com.google.protobuf.Struct value) {
      if (metadataFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadataFields_ = value;
        onChanged();
      } else {
        metadataFieldsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    public Builder setMetadataFields(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (metadataFieldsBuilder_ == null) {
        metadataFields_ = builderForValue.build();
        onChanged();
      } else {
        metadataFieldsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    public Builder mergeMetadataFields(com.google.protobuf.Struct value) {
      if (metadataFieldsBuilder_ == null) {
        if (metadataFields_ != null) {
          metadataFields_ =
            com.google.protobuf.Struct.newBuilder(metadataFields_).mergeFrom(value).buildPartial();
        } else {
          metadataFields_ = value;
        }
        onChanged();
      } else {
        metadataFieldsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    public Builder clearMetadataFields() {
      if (metadataFieldsBuilder_ == null) {
        metadataFields_ = null;
        onChanged();
      } else {
        metadataFields_ = null;
        metadataFieldsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    public com.google.protobuf.Struct.Builder getMetadataFieldsBuilder() {
      
      onChanged();
      return getMetadataFieldsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    public com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder() {
      if (metadataFieldsBuilder_ != null) {
        return metadataFieldsBuilder_.getMessageOrBuilder();
      } else {
        return metadataFields_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : metadataFields_;
      }
    }
    /**
     * <pre>
     * Metadata for the datapoint
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 2 [json_name = "metadataFields"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getMetadataFieldsFieldBuilder() {
      if (metadataFieldsBuilder_ == null) {
        metadataFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getMetadataFields(),
                getParentForChildren(),
                isClean());
        metadataFields_ = null;
      }
      return metadataFieldsBuilder_;
    }

    private int updateMode_ = 0;
    /**
     * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
     * @return The enum numeric value on the wire for updateMode.
     */
    @java.lang.Override public int getUpdateModeValue() {
      return updateMode_;
    }
    /**
     * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
     * @param value The enum numeric value on the wire for updateMode to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateModeValue(int value) {
      
      updateMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
     * @return The updateMode.
     */
    @java.lang.Override
    public org.zenoss.cloud.dataRegistry.UpdateMode getUpdateMode() {
      @SuppressWarnings("deprecation")
      org.zenoss.cloud.dataRegistry.UpdateMode result = org.zenoss.cloud.dataRegistry.UpdateMode.valueOf(updateMode_);
      return result == null ? org.zenoss.cloud.dataRegistry.UpdateMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
     * @param value The updateMode to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateMode(org.zenoss.cloud.dataRegistry.UpdateMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      updateMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.zenoss.cloud.UpdateMode update_mode = 3 [json_name = "updateMode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateMode() {
      
      updateMode_ = 0;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 4 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 4 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 4 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.UpdateMetricRequest)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.UpdateMetricRequest)
  private static final org.zenoss.cloud.dataRegistry.UpdateMetricRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataRegistry.UpdateMetricRequest();
  }

  public static org.zenoss.cloud.dataRegistry.UpdateMetricRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMetricRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMetricRequest>() {
    @java.lang.Override
    public UpdateMetricRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateMetricRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMetricRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.dataRegistry.UpdateMetricRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

