// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_registry.proto

package org.zenoss.cloud.dataRegistry;

/**
 * Protobuf type {@code zenoss.cloud.GetMetricResponse}
 */
public  final class GetMetricResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.GetMetricResponse)
    GetMetricResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMetricResponse.newBuilder() to construct.
  private GetMetricResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMetricResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetMetricResponse(
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
            org.zenoss.cloud.dataReceiver.Metric.Builder subBuilder = null;
            if (metric_ != null) {
              subBuilder = metric_.toBuilder();
            }
            metric_ = input.readMessage(org.zenoss.cloud.dataReceiver.Metric.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metric_);
              metric_ = subBuilder.buildPartial();
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
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_GetMetricResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_GetMetricResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.dataRegistry.GetMetricResponse.class, org.zenoss.cloud.dataRegistry.GetMetricResponse.Builder.class);
  }

  public static final int METRIC_FIELD_NUMBER = 1;
  private org.zenoss.cloud.dataReceiver.Metric metric_;
  /**
   * <code>.zenoss.cloud.Metric metric = 1;</code>
   */
  public boolean hasMetric() {
    return metric_ != null;
  }
  /**
   * <code>.zenoss.cloud.Metric metric = 1;</code>
   */
  public org.zenoss.cloud.dataReceiver.Metric getMetric() {
    return metric_ == null ? org.zenoss.cloud.dataReceiver.Metric.getDefaultInstance() : metric_;
  }
  /**
   * <code>.zenoss.cloud.Metric metric = 1;</code>
   */
  public org.zenoss.cloud.dataReceiver.MetricOrBuilder getMetricOrBuilder() {
    return getMetric();
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
    if (metric_ != null) {
      output.writeMessage(1, getMetric());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metric_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetric());
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
    if (!(obj instanceof org.zenoss.cloud.dataRegistry.GetMetricResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.dataRegistry.GetMetricResponse other = (org.zenoss.cloud.dataRegistry.GetMetricResponse) obj;

    boolean result = true;
    result = result && (hasMetric() == other.hasMetric());
    if (hasMetric()) {
      result = result && getMetric()
          .equals(other.getMetric());
    }
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
    if (hasMetric()) {
      hash = (37 * hash) + METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getMetric().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.dataRegistry.GetMetricResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.dataRegistry.GetMetricResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.GetMetricResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.GetMetricResponse)
      org.zenoss.cloud.dataRegistry.GetMetricResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_GetMetricResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_GetMetricResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.dataRegistry.GetMetricResponse.class, org.zenoss.cloud.dataRegistry.GetMetricResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.dataRegistry.GetMetricResponse.newBuilder()
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
      if (metricBuilder_ == null) {
        metric_ = null;
      } else {
        metric_ = null;
        metricBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.dataRegistry.DataRegistry.internal_static_zenoss_cloud_GetMetricResponse_descriptor;
    }

    public org.zenoss.cloud.dataRegistry.GetMetricResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.dataRegistry.GetMetricResponse.getDefaultInstance();
    }

    public org.zenoss.cloud.dataRegistry.GetMetricResponse build() {
      org.zenoss.cloud.dataRegistry.GetMetricResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.zenoss.cloud.dataRegistry.GetMetricResponse buildPartial() {
      org.zenoss.cloud.dataRegistry.GetMetricResponse result = new org.zenoss.cloud.dataRegistry.GetMetricResponse(this);
      if (metricBuilder_ == null) {
        result.metric_ = metric_;
      } else {
        result.metric_ = metricBuilder_.build();
      }
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
      if (other instanceof org.zenoss.cloud.dataRegistry.GetMetricResponse) {
        return mergeFrom((org.zenoss.cloud.dataRegistry.GetMetricResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.dataRegistry.GetMetricResponse other) {
      if (other == org.zenoss.cloud.dataRegistry.GetMetricResponse.getDefaultInstance()) return this;
      if (other.hasMetric()) {
        mergeMetric(other.getMetric());
      }
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
      org.zenoss.cloud.dataRegistry.GetMetricResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zenoss.cloud.dataRegistry.GetMetricResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.zenoss.cloud.dataReceiver.Metric metric_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.dataReceiver.Metric, org.zenoss.cloud.dataReceiver.Metric.Builder, org.zenoss.cloud.dataReceiver.MetricOrBuilder> metricBuilder_;
    /**
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public boolean hasMetric() {
      return metricBuilder_ != null || metric_ != null;
    }
    /**
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public org.zenoss.cloud.dataReceiver.Metric getMetric() {
      if (metricBuilder_ == null) {
        return metric_ == null ? org.zenoss.cloud.dataReceiver.Metric.getDefaultInstance() : metric_;
      } else {
        return metricBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public Builder setMetric(org.zenoss.cloud.dataReceiver.Metric value) {
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
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public Builder setMetric(
        org.zenoss.cloud.dataReceiver.Metric.Builder builderForValue) {
      if (metricBuilder_ == null) {
        metric_ = builderForValue.build();
        onChanged();
      } else {
        metricBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public Builder mergeMetric(org.zenoss.cloud.dataReceiver.Metric value) {
      if (metricBuilder_ == null) {
        if (metric_ != null) {
          metric_ =
            org.zenoss.cloud.dataReceiver.Metric.newBuilder(metric_).mergeFrom(value).buildPartial();
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
     * <code>.zenoss.cloud.Metric metric = 1;</code>
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
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public org.zenoss.cloud.dataReceiver.Metric.Builder getMetricBuilder() {
      
      onChanged();
      return getMetricFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    public org.zenoss.cloud.dataReceiver.MetricOrBuilder getMetricOrBuilder() {
      if (metricBuilder_ != null) {
        return metricBuilder_.getMessageOrBuilder();
      } else {
        return metric_ == null ?
            org.zenoss.cloud.dataReceiver.Metric.getDefaultInstance() : metric_;
      }
    }
    /**
     * <code>.zenoss.cloud.Metric metric = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.dataReceiver.Metric, org.zenoss.cloud.dataReceiver.Metric.Builder, org.zenoss.cloud.dataReceiver.MetricOrBuilder> 
        getMetricFieldBuilder() {
      if (metricBuilder_ == null) {
        metricBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.dataReceiver.Metric, org.zenoss.cloud.dataReceiver.Metric.Builder, org.zenoss.cloud.dataReceiver.MetricOrBuilder>(
                getMetric(),
                getParentForChildren(),
                isClean());
        metric_ = null;
      }
      return metricBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.GetMetricResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.GetMetricResponse)
  private static final org.zenoss.cloud.dataRegistry.GetMetricResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.dataRegistry.GetMetricResponse();
  }

  public static org.zenoss.cloud.dataRegistry.GetMetricResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMetricResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetMetricResponse>() {
    public GetMetricResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetMetricResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetMetricResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMetricResponse> getParserForType() {
    return PARSER;
  }

  public org.zenoss.cloud.dataRegistry.GetMetricResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

