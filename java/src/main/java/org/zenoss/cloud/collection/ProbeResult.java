// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

/**
 * Protobuf type {@code zenoss.cloud.collection_cfg.ProbeResult}
 */
public final class ProbeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.collection_cfg.ProbeResult)
    ProbeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProbeResult.newBuilder() to construct.
  private ProbeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProbeResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProbeResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.collection.ProbeResult.class, org.zenoss.cloud.collection.ProbeResult.Builder.class);
  }

  private int resultCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object result_;
  public enum ResultCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SUCCESS(1),
    ERROR(2),
    RESULT_NOT_SET(0);
    private final int value;
    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 1: return SUCCESS;
        case 2: return ERROR;
        case 0: return RESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase
  getResultCase() {
    return ResultCase.forNumber(
        resultCase_);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
   * @return Whether the success field is set.
   */
  @java.lang.Override
  public boolean hasSuccess() {
    return resultCase_ == 1;
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeSuccess getSuccess() {
    if (resultCase_ == 1) {
       return (org.zenoss.cloud.collection.ProbeSuccess) result_;
    }
    return org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance();
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeSuccessOrBuilder getSuccessOrBuilder() {
    if (resultCase_ == 1) {
       return (org.zenoss.cloud.collection.ProbeSuccess) result_;
    }
    return org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return resultCase_ == 2;
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeError getError() {
    if (resultCase_ == 2) {
       return (org.zenoss.cloud.collection.ProbeError) result_;
    }
    return org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
  }
  /**
   * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeErrorOrBuilder getErrorOrBuilder() {
    if (resultCase_ == 2) {
       return (org.zenoss.cloud.collection.ProbeError) result_;
    }
    return org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
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
    if (resultCase_ == 1) {
      output.writeMessage(1, (org.zenoss.cloud.collection.ProbeSuccess) result_);
    }
    if (resultCase_ == 2) {
      output.writeMessage(2, (org.zenoss.cloud.collection.ProbeError) result_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resultCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.zenoss.cloud.collection.ProbeSuccess) result_);
    }
    if (resultCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.zenoss.cloud.collection.ProbeError) result_);
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
    if (!(obj instanceof org.zenoss.cloud.collection.ProbeResult)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.collection.ProbeResult other = (org.zenoss.cloud.collection.ProbeResult) obj;

    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 1:
        if (!getSuccess()
            .equals(other.getSuccess())) return false;
        break;
      case 2:
        if (!getError()
            .equals(other.getError())) return false;
        break;
      case 0:
      default:
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
    switch (resultCase_) {
      case 1:
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + getSuccess().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.zenoss.cloud.collection.ProbeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.zenoss.cloud.collection.ProbeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.collection.ProbeResult parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.collection.ProbeResult prototype) {
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
   * Protobuf type {@code zenoss.cloud.collection_cfg.ProbeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.collection_cfg.ProbeResult)
      org.zenoss.cloud.collection.ProbeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.collection.ProbeResult.class, org.zenoss.cloud.collection.ProbeResult.Builder.class);
    }

    // Construct using org.zenoss.cloud.collection.ProbeResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (successBuilder_ != null) {
        successBuilder_.clear();
      }
      if (errorBuilder_ != null) {
        errorBuilder_.clear();
      }
      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.collection.CollectionCfg.internal_static_zenoss_cloud_collection_cfg_ProbeResult_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeResult getDefaultInstanceForType() {
      return org.zenoss.cloud.collection.ProbeResult.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeResult build() {
      org.zenoss.cloud.collection.ProbeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeResult buildPartial() {
      org.zenoss.cloud.collection.ProbeResult result = new org.zenoss.cloud.collection.ProbeResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.zenoss.cloud.collection.ProbeResult result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.zenoss.cloud.collection.ProbeResult result) {
      result.resultCase_ = resultCase_;
      result.result_ = this.result_;
      if (resultCase_ == 1 &&
          successBuilder_ != null) {
        result.result_ = successBuilder_.build();
      }
      if (resultCase_ == 2 &&
          errorBuilder_ != null) {
        result.result_ = errorBuilder_.build();
      }
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
      if (other instanceof org.zenoss.cloud.collection.ProbeResult) {
        return mergeFrom((org.zenoss.cloud.collection.ProbeResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.collection.ProbeResult other) {
      if (other == org.zenoss.cloud.collection.ProbeResult.getDefaultInstance()) return this;
      switch (other.getResultCase()) {
        case SUCCESS: {
          mergeSuccess(other.getSuccess());
          break;
        }
        case ERROR: {
          mergeError(other.getError());
          break;
        }
        case RESULT_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getSuccessFieldBuilder().getBuilder(),
                  extensionRegistry);
              resultCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              resultCase_ = 2;
              break;
            } // case 18
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
    private int resultCase_ = 0;
    private java.lang.Object result_;
    public ResultCase
        getResultCase() {
      return ResultCase.forNumber(
          resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.ProbeSuccess, org.zenoss.cloud.collection.ProbeSuccess.Builder, org.zenoss.cloud.collection.ProbeSuccessOrBuilder> successBuilder_;
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     * @return Whether the success field is set.
     */
    @java.lang.Override
    public boolean hasSuccess() {
      return resultCase_ == 1;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     * @return The success.
     */
    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeSuccess getSuccess() {
      if (successBuilder_ == null) {
        if (resultCase_ == 1) {
          return (org.zenoss.cloud.collection.ProbeSuccess) result_;
        }
        return org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance();
      } else {
        if (resultCase_ == 1) {
          return successBuilder_.getMessage();
        }
        return org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    public Builder setSuccess(org.zenoss.cloud.collection.ProbeSuccess value) {
      if (successBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        successBuilder_.setMessage(value);
      }
      resultCase_ = 1;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    public Builder setSuccess(
        org.zenoss.cloud.collection.ProbeSuccess.Builder builderForValue) {
      if (successBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        successBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 1;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    public Builder mergeSuccess(org.zenoss.cloud.collection.ProbeSuccess value) {
      if (successBuilder_ == null) {
        if (resultCase_ == 1 &&
            result_ != org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance()) {
          result_ = org.zenoss.cloud.collection.ProbeSuccess.newBuilder((org.zenoss.cloud.collection.ProbeSuccess) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 1) {
          successBuilder_.mergeFrom(value);
        } else {
          successBuilder_.setMessage(value);
        }
      }
      resultCase_ = 1;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    public Builder clearSuccess() {
      if (successBuilder_ == null) {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
        }
        successBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    public org.zenoss.cloud.collection.ProbeSuccess.Builder getSuccessBuilder() {
      return getSuccessFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeSuccessOrBuilder getSuccessOrBuilder() {
      if ((resultCase_ == 1) && (successBuilder_ != null)) {
        return successBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 1) {
          return (org.zenoss.cloud.collection.ProbeSuccess) result_;
        }
        return org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeSuccess success = 1 [json_name = "success"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.ProbeSuccess, org.zenoss.cloud.collection.ProbeSuccess.Builder, org.zenoss.cloud.collection.ProbeSuccessOrBuilder> 
        getSuccessFieldBuilder() {
      if (successBuilder_ == null) {
        if (!(resultCase_ == 1)) {
          result_ = org.zenoss.cloud.collection.ProbeSuccess.getDefaultInstance();
        }
        successBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.collection.ProbeSuccess, org.zenoss.cloud.collection.ProbeSuccess.Builder, org.zenoss.cloud.collection.ProbeSuccessOrBuilder>(
                (org.zenoss.cloud.collection.ProbeSuccess) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 1;
      onChanged();
      return successBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.ProbeError, org.zenoss.cloud.collection.ProbeError.Builder, org.zenoss.cloud.collection.ProbeErrorOrBuilder> errorBuilder_;
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return resultCase_ == 2;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     * @return The error.
     */
    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeError getError() {
      if (errorBuilder_ == null) {
        if (resultCase_ == 2) {
          return (org.zenoss.cloud.collection.ProbeError) result_;
        }
        return org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
      } else {
        if (resultCase_ == 2) {
          return errorBuilder_.getMessage();
        }
        return org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    public Builder setError(org.zenoss.cloud.collection.ProbeError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    public Builder setError(
        org.zenoss.cloud.collection.ProbeError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    public Builder mergeError(org.zenoss.cloud.collection.ProbeError value) {
      if (errorBuilder_ == null) {
        if (resultCase_ == 2 &&
            result_ != org.zenoss.cloud.collection.ProbeError.getDefaultInstance()) {
          result_ = org.zenoss.cloud.collection.ProbeError.newBuilder((org.zenoss.cloud.collection.ProbeError) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 2) {
          errorBuilder_.mergeFrom(value);
        } else {
          errorBuilder_.setMessage(value);
        }
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
        }
        errorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    public org.zenoss.cloud.collection.ProbeError.Builder getErrorBuilder() {
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    @java.lang.Override
    public org.zenoss.cloud.collection.ProbeErrorOrBuilder getErrorOrBuilder() {
      if ((resultCase_ == 2) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 2) {
          return (org.zenoss.cloud.collection.ProbeError) result_;
        }
        return org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
      }
    }
    /**
     * <code>.zenoss.cloud.collection_cfg.ProbeError error = 2 [json_name = "error"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.collection.ProbeError, org.zenoss.cloud.collection.ProbeError.Builder, org.zenoss.cloud.collection.ProbeErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        if (!(resultCase_ == 2)) {
          result_ = org.zenoss.cloud.collection.ProbeError.getDefaultInstance();
        }
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.collection.ProbeError, org.zenoss.cloud.collection.ProbeError.Builder, org.zenoss.cloud.collection.ProbeErrorOrBuilder>(
                (org.zenoss.cloud.collection.ProbeError) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 2;
      onChanged();
      return errorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.collection_cfg.ProbeResult)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.collection_cfg.ProbeResult)
  private static final org.zenoss.cloud.collection.ProbeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.collection.ProbeResult();
  }

  public static org.zenoss.cloud.collection.ProbeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProbeResult>
      PARSER = new com.google.protobuf.AbstractParser<ProbeResult>() {
    @java.lang.Override
    public ProbeResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProbeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProbeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.collection.ProbeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

