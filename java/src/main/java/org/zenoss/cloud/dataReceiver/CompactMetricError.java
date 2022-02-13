// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

/**
 * Protobuf type {@code zenoss.cloud.CompactMetricError}
 */
public final class CompactMetricError extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.CompactMetricError)
    CompactMetricErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompactMetricError.newBuilder() to construct.
  private CompactMetricError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompactMetricError() {
    error_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompactMetricError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompactMetricError(
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

            error_ = s;
            break;
          }
          case 18: {
            org.zenoss.cloud.dataReceiver.CompactMetric.Builder subBuilder = null;
            if (metric_ != null) {
              subBuilder = metric_.toBuilder();
            }
            metric_ = input.readMessage(org.zenoss.cloud.dataReceiver.CompactMetric.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metric_);
              metric_ = subBuilder.buildPartial();
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
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_CompactMetricError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_CompactMetricError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataReceiver.CompactMetricError.class, org.zenoss.cloud.dataReceiver.CompactMetricError.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 1;</code>
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 1;</code>
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_FIELD_NUMBER = 2;
  private org.zenoss.cloud.dataReceiver.CompactMetric metric_;
  /**
   * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
   * @return Whether the metric field is set.
   */
  @java.lang.Override
  public boolean hasMetric() {
    return metric_ != null;
  }
  /**
   * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
   * @return The metric.
   */
  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.CompactMetric getMetric() {
    return metric_ == null ? org.zenoss.cloud.dataReceiver.CompactMetric.getDefaultInstance() : metric_;
  }
  /**
   * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder getMetricOrBuilder() {
    return getMetric();
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
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, error_);
    }
    if (metric_ != null) {
      output.writeMessage(2, getMetric());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, error_);
    }
    if (metric_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetric());
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
    if (!(obj instanceof org.zenoss.cloud.dataReceiver.CompactMetricError)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataReceiver.CompactMetricError other = (org.zenoss.cloud.dataReceiver.CompactMetricError) obj;

    if (!getError()
        .equals(other.getError())) return false;
    if (hasMetric() != other.hasMetric()) return false;
    if (hasMetric()) {
      if (!getMetric()
          .equals(other.getMetric())) return false;
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
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    if (hasMetric()) {
      hash = (37 * hash) + METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getMetric().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataReceiver.CompactMetricError parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataReceiver.CompactMetricError prototype) {
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
   * Protobuf type {@code zenoss.cloud.CompactMetricError}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.CompactMetricError)
      org.zenoss.cloud.dataReceiver.CompactMetricErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_CompactMetricError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_CompactMetricError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataReceiver.CompactMetricError.class, org.zenoss.cloud.dataReceiver.CompactMetricError.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataReceiver.CompactMetricError.newBuilder()
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
      error_ = "";

      if (metricBuilder_ == null) {
        metric_ = null;
      } else {
        metric_ = null;
        metricBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataReceiver.DataReceiver.internal_static_zenoss_cloud_CompactMetricError_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.CompactMetricError getDefaultInstanceForType() {
      return org.zenoss.cloud.dataReceiver.CompactMetricError.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.CompactMetricError build() {
      org.zenoss.cloud.dataReceiver.CompactMetricError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.dataReceiver.CompactMetricError buildPartial() {
      org.zenoss.cloud.dataReceiver.CompactMetricError result = new org.zenoss.cloud.dataReceiver.CompactMetricError(this);
      result.error_ = error_;
      if (metricBuilder_ == null) {
        result.metric_ = metric_;
      } else {
        result.metric_ = metricBuilder_.build();
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
      if (other instanceof org.zenoss.cloud.dataReceiver.CompactMetricError) {
        return mergeFrom((org.zenoss.cloud.dataReceiver.CompactMetricError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataReceiver.CompactMetricError other) {
      if (other == org.zenoss.cloud.dataReceiver.CompactMetricError.getDefaultInstance()) return this;
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (other.hasMetric()) {
        mergeMetric(other.getMetric());
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
      org.zenoss.cloud.dataReceiver.CompactMetricError parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.dataReceiver.CompactMetricError) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 1;</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 1;</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 1;</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 1;</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private org.zenoss.cloud.dataReceiver.CompactMetric metric_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.dataReceiver.CompactMetric, org.zenoss.cloud.dataReceiver.CompactMetric.Builder, org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder> metricBuilder_;
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     * @return Whether the metric field is set.
     */
    public boolean hasMetric() {
      return metricBuilder_ != null || metric_ != null;
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     * @return The metric.
     */
    public org.zenoss.cloud.dataReceiver.CompactMetric getMetric() {
      if (metricBuilder_ == null) {
        return metric_ == null ? org.zenoss.cloud.dataReceiver.CompactMetric.getDefaultInstance() : metric_;
      } else {
        return metricBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    public Builder setMetric(org.zenoss.cloud.dataReceiver.CompactMetric value) {
      if (metricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metric_ = value;
        onChanged();
      } else {
        metricBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    public Builder setMetric(
        org.zenoss.cloud.dataReceiver.CompactMetric.Builder builderForValue) {
      if (metricBuilder_ == null) {
        metric_ = builderForValue.build();
        onChanged();
      } else {
        metricBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    public Builder mergeMetric(org.zenoss.cloud.dataReceiver.CompactMetric value) {
      if (metricBuilder_ == null) {
        if (metric_ != null) {
          metric_ =
            org.zenoss.cloud.dataReceiver.CompactMetric.newBuilder(metric_).mergeFrom(value).buildPartial();
        } else {
          metric_ = value;
        }
        onChanged();
      } else {
        metricBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    public Builder clearMetric() {
      if (metricBuilder_ == null) {
        metric_ = null;
        onChanged();
      } else {
        metric_ = null;
        metricBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    public org.zenoss.cloud.dataReceiver.CompactMetric.Builder getMetricBuilder() {
      
      onChanged();
      return getMetricFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    public org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder getMetricOrBuilder() {
      if (metricBuilder_ != null) {
        return metricBuilder_.getMessageOrBuilder();
      } else {
        return metric_ == null ?
            org.zenoss.cloud.dataReceiver.CompactMetric.getDefaultInstance() : metric_;
      }
    }
    /**
     * <code>.zenoss.cloud.CompactMetric metric = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.dataReceiver.CompactMetric, org.zenoss.cloud.dataReceiver.CompactMetric.Builder, org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder> 
        getMetricFieldBuilder() {
      if (metricBuilder_ == null) {
        metricBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.dataReceiver.CompactMetric, org.zenoss.cloud.dataReceiver.CompactMetric.Builder, org.zenoss.cloud.dataReceiver.CompactMetricOrBuilder>(
                getMetric(),
                getParentForChildren(),
                isClean());
        metric_ = null;
      }
      return metricBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.CompactMetricError)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.CompactMetricError)
  private static final org.zenoss.cloud.dataReceiver.CompactMetricError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataReceiver.CompactMetricError();
  }

  public static org.zenoss.cloud.dataReceiver.CompactMetricError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompactMetricError>
      PARSER = new com.google.protobuf.AbstractParser<CompactMetricError>() {
    @java.lang.Override
    public CompactMetricError parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompactMetricError(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompactMetricError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompactMetricError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.dataReceiver.CompactMetricError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

