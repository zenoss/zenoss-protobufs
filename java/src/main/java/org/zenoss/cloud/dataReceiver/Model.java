// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

// Protobuf Java Version: 4.26.1
package org.zenoss.cloud.dataReceiver;

/**
 * Protobuf type {@code zenoss.cloud.Model}
 */
public final class Model extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.Model)
    ModelOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Model.class.getName());
  }
  // Use Model.newBuilder() to construct.
  private Model(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Model() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_Model_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetDimensions();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_Model_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataReceiver.Model.class, org.zenoss.cloud.dataReceiver.Model.Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_ = 0L;
  /**
   * <pre>
   * The time when the value was sent.
   * </pre>
   *
   * <code>int64 timestamp = 1 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int DIMENSIONS_FIELD_NUMBER = 2;
  private static final class DimensionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_Model_DimensionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> dimensions_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetDimensions() {
    if (dimensions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DimensionsDefaultEntryHolder.defaultEntry);
    }
    return dimensions_;
  }
  public int getDimensionsCount() {
    return internalGetDimensions().getMap().size();
  }
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
   */
  @java.lang.Override
  public boolean containsDimensions(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetDimensions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDimensionsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getDimensions() {
    return getDimensionsMap();
  }
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getDimensionsMap() {
    return internalGetDimensions().getMap();
  }
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetDimensions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Dimensions associated with this model.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
   */
  @java.lang.Override
  public java.lang.String getDimensionsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetDimensions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int METADATAFIELDS_FIELD_NUMBER = 3;
  private com.google.protobuf.Struct metadataFields_;
  /**
   * <pre>
   * Fields associated with this model.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
   * @return Whether the metadataFields field is set.
   */
  @java.lang.Override
  public boolean hasMetadataFields() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Fields associated with this model.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
   * @return The metadataFields.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getMetadataFields() {
    return metadataFields_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadataFields_;
  }
  /**
   * <pre>
   * Fields associated with this model.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getMetadataFieldsOrBuilder() {
    return metadataFields_ == null ? com.google.protobuf.Struct.getDefaultInstance() : metadataFields_;
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
    if (timestamp_ != 0L) {
      output.writeInt64(1, timestamp_);
    }
    com.google.protobuf.GeneratedMessage
      .serializeStringMapTo(
        output,
        internalGetDimensions(),
        DimensionsDefaultEntryHolder.defaultEntry,
        2);
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getMetadataFields());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestamp_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetDimensions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      dimensions__ = DimensionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, dimensions__);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMetadataFields());
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
    if (!(obj instanceof org.zenoss.cloud.dataReceiver.Model)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataReceiver.Model other = (org.zenoss.cloud.dataReceiver.Model) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!internalGetDimensions().equals(
        other.internalGetDimensions())) return false;
    if (hasMetadataFields() != other.hasMetadataFields()) return false;
    if (hasMetadataFields()) {
      if (!getMetadataFields()
          .equals(other.getMetadataFields())) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    if (!internalGetDimensions().getMap().isEmpty()) {
      hash = (37 * hash) + DIMENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDimensions().hashCode();
    }
    if (hasMetadataFields()) {
      hash = (37 * hash) + METADATAFIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataFields().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.dataReceiver.Model parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.dataReceiver.Model parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.Model parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataReceiver.Model prototype) {
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
   * Protobuf type {@code zenoss.cloud.Model}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.Model)
      org.zenoss.cloud.dataReceiver.ModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_Model_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetDimensions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableDimensions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_Model_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataReceiver.Model.class, org.zenoss.cloud.dataReceiver.Model.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataReceiver.Model.newBuilder()
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
        getMetadataFieldsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timestamp_ = 0L;
      internalGetMutableDimensions().clear();
      metadataFields_ = null;
      if (metadataFieldsBuilder_ != null) {
        metadataFieldsBuilder_.dispose();
        metadataFieldsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_Model_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.Model getDefaultInstanceForType() {
      return org.zenoss.cloud.dataReceiver.Model.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.Model build() {
      org.zenoss.cloud.dataReceiver.Model result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.Model buildPartial() {
      org.zenoss.cloud.dataReceiver.Model result = new org.zenoss.cloud.dataReceiver.Model(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.zenoss.cloud.dataReceiver.Model result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dimensions_ = internalGetDimensions();
        result.dimensions_.makeImmutable();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadataFields_ = metadataFieldsBuilder_ == null
            ? metadataFields_
            : metadataFieldsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zenoss.cloud.dataReceiver.Model) {
        return mergeFrom((org.zenoss.cloud.dataReceiver.Model)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataReceiver.Model other) {
      if (other == org.zenoss.cloud.dataReceiver.Model.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      internalGetMutableDimensions().mergeFrom(
          other.internalGetDimensions());
      bitField0_ |= 0x00000002;
      if (other.hasMetadataFields()) {
        mergeMetadataFields(other.getMetadataFields());
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
            case 8: {
              timestamp_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              dimensions__ = input.readMessage(
                  DimensionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableDimensions().getMutableMap().put(
                  dimensions__.getKey(), dimensions__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getMetadataFieldsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long timestamp_ ;
    /**
     * <pre>
     * The time when the value was sent.
     * </pre>
     *
     * <code>int64 timestamp = 1 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * The time when the value was sent.
     * </pre>
     *
     * <code>int64 timestamp = 1 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the value was sent.
     * </pre>
     *
     * <code>int64 timestamp = 1 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> dimensions_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetDimensions() {
      if (dimensions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DimensionsDefaultEntryHolder.defaultEntry);
      }
      return dimensions_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableDimensions() {
      if (dimensions_ == null) {
        dimensions_ = com.google.protobuf.MapField.newMapField(
            DimensionsDefaultEntryHolder.defaultEntry);
      }
      if (!dimensions_.isMutable()) {
        dimensions_ = dimensions_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return dimensions_;
    }
    public int getDimensionsCount() {
      return internalGetDimensions().getMap().size();
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    @java.lang.Override
    public boolean containsDimensions(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetDimensions().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDimensionsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getDimensions() {
      return getDimensionsMap();
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getDimensionsMap() {
      return internalGetDimensions().getMap();
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getDimensionsOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetDimensions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    @java.lang.Override
    public java.lang.String getDimensionsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetDimensions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearDimensions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableDimensions().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    public Builder removeDimensions(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableDimensions().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableDimensions() {
      bitField0_ |= 0x00000002;
      return internalGetMutableDimensions().getMutableMap();
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    public Builder putDimensions(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableDimensions().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Dimensions associated with this model.
     * </pre>
     *
     * <code>map&lt;string, string&gt; dimensions = 2 [json_name = "dimensions"];</code>
     */
    public Builder putAllDimensions(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableDimensions().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    private com.google.protobuf.Struct metadataFields_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> metadataFieldsBuilder_;
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     * @return Whether the metadataFields field is set.
     */
    public boolean hasMetadataFields() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
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
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     */
    public Builder setMetadataFields(com.google.protobuf.Struct value) {
      if (metadataFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadataFields_ = value;
      } else {
        metadataFieldsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     */
    public Builder setMetadataFields(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (metadataFieldsBuilder_ == null) {
        metadataFields_ = builderForValue.build();
      } else {
        metadataFieldsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     */
    public Builder mergeMetadataFields(com.google.protobuf.Struct value) {
      if (metadataFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          metadataFields_ != null &&
          metadataFields_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getMetadataFieldsBuilder().mergeFrom(value);
        } else {
          metadataFields_ = value;
        }
      } else {
        metadataFieldsBuilder_.mergeFrom(value);
      }
      if (metadataFields_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     */
    public Builder clearMetadataFields() {
      bitField0_ = (bitField0_ & ~0x00000004);
      metadataFields_ = null;
      if (metadataFieldsBuilder_ != null) {
        metadataFieldsBuilder_.dispose();
        metadataFieldsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     */
    public com.google.protobuf.Struct.Builder getMetadataFieldsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMetadataFieldsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
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
     * Fields associated with this model.
     * </pre>
     *
     * <code>.google.protobuf.Struct metadataFields = 3 [json_name = "metadataFields"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getMetadataFieldsFieldBuilder() {
      if (metadataFieldsBuilder_ == null) {
        metadataFieldsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getMetadataFields(),
                getParentForChildren(),
                isClean());
        metadataFields_ = null;
      }
      return metadataFieldsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:zenoss.cloud.Model)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.Model)
  private static final org.zenoss.cloud.dataReceiver.Model DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataReceiver.Model();
  }

  public static org.zenoss.cloud.dataReceiver.Model getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Model>
      PARSER = new com.google.protobuf.AbstractParser<Model>() {
    @java.lang.Override
    public Model parsePartialFrom(
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

  public static com.google.protobuf.Parser<Model> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Model> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.Model getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

