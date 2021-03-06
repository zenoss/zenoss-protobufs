// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

/**
 * Protobuf type {@code zenoss.cloud.TaggedMetric}
 */
public  final class TaggedMetric extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.TaggedMetric)
    TaggedMetricOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaggedMetric.newBuilder() to construct.
  private TaggedMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaggedMetric() {
    metric_ = "";
    timestamp_ = 0L;
    value_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaggedMetric(
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
            java.lang.String s = input.readStringRequireUtf8();

            metric_ = s;
            break;
          }
          case 16: {

            timestamp_ = input.readInt64();
            break;
          }
          case 25: {

            value_ = input.readDouble();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              tags_ = com.google.protobuf.MapField.newMapField(
                  TagsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000008;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            tags__ = input.readMessage(
                TagsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            tags_.getMutableMap().put(
                tags__.getKey(), tags__.getValue());
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
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_TaggedMetric_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetTags();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_TaggedMetric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataReceiver.TaggedMetric.class, org.zenoss.cloud.dataReceiver.TaggedMetric.Builder.class);
  }

  private int bitField0_;
  public static final int METRIC_FIELD_NUMBER = 1;
  private volatile java.lang.Object metric_;
  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1;</code>
   */
  public java.lang.String getMetric() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metric_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The metric name
   * </pre>
   *
   * <code>string metric = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMetricBytes() {
    java.lang.Object ref = metric_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metric_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <pre>
   * The time at which the value was captured
   * </pre>
   *
   * <code>int64 timestamp = 2;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private double value_;
  /**
   * <pre>
   * The metric value
   * </pre>
   *
   * <code>double value = 3;</code>
   */
  public double getValue() {
    return value_;
  }

  public static final int TAGS_FIELD_NUMBER = 4;
  private static final class TagsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_TaggedMetric_TagsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> tags_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetTags() {
    if (tags_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TagsDefaultEntryHolder.defaultEntry);
    }
    return tags_;
  }

  public int getTagsCount() {
    return internalGetTags().getMap().size();
  }
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  public boolean containsTags(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetTags().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getTags() {
    return getTagsMap();
  }
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getTagsMap() {
    return internalGetTags().getMap();
  }
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  public java.lang.String getTagsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetTags().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Metadata associated with this datapoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  public java.lang.String getTagsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetTags().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getMetricBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metric_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(2, timestamp_);
    }
    if (value_ != 0D) {
      output.writeDouble(3, value_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetTags(),
        TagsDefaultEntryHolder.defaultEntry,
        4);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMetricBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metric_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timestamp_);
    }
    if (value_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, value_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetTags().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      tags__ = TagsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, tags__);
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
    if (!(obj instanceof org.zenoss.cloud.dataReceiver.TaggedMetric)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataReceiver.TaggedMetric other = (org.zenoss.cloud.dataReceiver.TaggedMetric) obj;

    boolean result = true;
    result = result && getMetric()
        .equals(other.getMetric());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && (
        java.lang.Double.doubleToLongBits(getValue())
        == java.lang.Double.doubleToLongBits(
            other.getValue()));
    result = result && internalGetTags().equals(
        other.internalGetTags());
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
    hash = (37 * hash) + METRIC_FIELD_NUMBER;
    hash = (53 * hash) + getMetric().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    if (!internalGetTags().getMap().isEmpty()) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTags().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.TaggedMetric parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataReceiver.TaggedMetric prototype) {
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
   * Protobuf type {@code zenoss.cloud.TaggedMetric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.TaggedMetric)
      org.zenoss.cloud.dataReceiver.TaggedMetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_TaggedMetric_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetTags();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableTags();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_TaggedMetric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataReceiver.TaggedMetric.class, org.zenoss.cloud.dataReceiver.TaggedMetric.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataReceiver.TaggedMetric.newBuilder()
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
      metric_ = "";

      timestamp_ = 0L;

      value_ = 0D;

      internalGetMutableTags().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_TaggedMetric_descriptor;
    }

    public org.zenoss.cloud.dataReceiver.TaggedMetric getDefaultInstanceForType() {
      return org.zenoss.cloud.dataReceiver.TaggedMetric.getDefaultInstance();
    }

    public org.zenoss.cloud.dataReceiver.TaggedMetric build() {
      org.zenoss.cloud.dataReceiver.TaggedMetric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zenoss.cloud.dataReceiver.TaggedMetric buildPartial() {
      org.zenoss.cloud.dataReceiver.TaggedMetric result = new org.zenoss.cloud.dataReceiver.TaggedMetric(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.metric_ = metric_;
      result.timestamp_ = timestamp_;
      result.value_ = value_;
      result.tags_ = internalGetTags();
      result.tags_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.zenoss.cloud.dataReceiver.TaggedMetric) {
        return mergeFrom((org.zenoss.cloud.dataReceiver.TaggedMetric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataReceiver.TaggedMetric other) {
      if (other == org.zenoss.cloud.dataReceiver.TaggedMetric.getDefaultInstance()) return this;
      if (!other.getMetric().isEmpty()) {
        metric_ = other.metric_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
      }
      internalGetMutableTags().mergeFrom(
          other.internalGetTags());
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
      org.zenoss.cloud.dataReceiver.TaggedMetric parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.dataReceiver.TaggedMetric) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object metric_ = "";
    /**
     * <pre>
     * The metric name
     * </pre>
     *
     * <code>string metric = 1;</code>
     */
    public java.lang.String getMetric() {
      java.lang.Object ref = metric_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metric_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The metric name
     * </pre>
     *
     * <code>string metric = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMetricBytes() {
      java.lang.Object ref = metric_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metric_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The metric name
     * </pre>
     *
     * <code>string metric = 1;</code>
     */
    public Builder setMetric(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metric_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric name
     * </pre>
     *
     * <code>string metric = 1;</code>
     */
    public Builder clearMetric() {
      
      metric_ = getDefaultInstance().getMetric();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric name
     * </pre>
     *
     * <code>string metric = 1;</code>
     */
    public Builder setMetricBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      metric_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * The time at which the value was captured
     * </pre>
     *
     * <code>int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * The time at which the value was captured
     * </pre>
     *
     * <code>int64 timestamp = 2;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time at which the value was captured
     * </pre>
     *
     * <code>int64 timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <pre>
     * The metric value
     * </pre>
     *
     * <code>double value = 3;</code>
     */
    public double getValue() {
      return value_;
    }
    /**
     * <pre>
     * The metric value
     * </pre>
     *
     * <code>double value = 3;</code>
     */
    public Builder setValue(double value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric value
     * </pre>
     *
     * <code>double value = 3;</code>
     */
    public Builder clearValue() {
      
      value_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> tags_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetTags() {
      if (tags_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      return tags_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableTags() {
      onChanged();;
      if (tags_ == null) {
        tags_ = com.google.protobuf.MapField.newMapField(
            TagsDefaultEntryHolder.defaultEntry);
      }
      if (!tags_.isMutable()) {
        tags_ = tags_.copy();
      }
      return tags_;
    }

    public int getTagsCount() {
      return internalGetTags().getMap().size();
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */

    public boolean containsTags(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetTags().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTagsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getTags() {
      return getTagsMap();
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getTagsMap() {
      return internalGetTags().getMap();
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */

    public java.lang.String getTagsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetTags().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */

    public java.lang.String getTagsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetTags().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearTags() {
      internalGetMutableTags().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */

    public Builder removeTags(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableTags().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableTags() {
      return internalGetMutableTags().getMutableMap();
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */
    public Builder putTags(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableTags().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Metadata associated with this datapoint.
     * </pre>
     *
     * <code>map&lt;string, string&gt; tags = 4;</code>
     */

    public Builder putAllTags(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableTags().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.TaggedMetric)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.TaggedMetric)
  private static final org.zenoss.cloud.dataReceiver.TaggedMetric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataReceiver.TaggedMetric();
  }

  public static org.zenoss.cloud.dataReceiver.TaggedMetric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaggedMetric>
      PARSER = new com.google.protobuf.AbstractParser<TaggedMetric>() {
    public TaggedMetric parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaggedMetric(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaggedMetric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaggedMetric> getParserForType() {
    return PARSER;
  }

  public org.zenoss.cloud.dataReceiver.TaggedMetric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

