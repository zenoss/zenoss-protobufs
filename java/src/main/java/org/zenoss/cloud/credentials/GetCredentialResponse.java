// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/credentials.proto

package org.zenoss.cloud.credentials;

/**
 * Protobuf type {@code zenoss.cloud.credentials.GetCredentialResponse}
 */
public final class GetCredentialResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zenoss.cloud.credentials.GetCredentialResponse)
    GetCredentialResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCredentialResponse.newBuilder() to construct.
  private GetCredentialResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCredentialResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCredentialResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_GetCredentialResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_GetCredentialResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zenoss.cloud.credentials.GetCredentialResponse.class, org.zenoss.cloud.credentials.GetCredentialResponse.Builder.class);
  }

  public static final int CREDENTIAL_FIELD_NUMBER = 1;
  private org.zenoss.cloud.credentials.Credential credential_;
  /**
   * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
   * @return Whether the credential field is set.
   */
  @java.lang.Override
  public boolean hasCredential() {
    return credential_ != null;
  }
  /**
   * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
   * @return The credential.
   */
  @java.lang.Override
  public org.zenoss.cloud.credentials.Credential getCredential() {
    return credential_ == null ? org.zenoss.cloud.credentials.Credential.getDefaultInstance() : credential_;
  }
  /**
   * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
   */
  @java.lang.Override
  public org.zenoss.cloud.credentials.CredentialOrBuilder getCredentialOrBuilder() {
    return getCredential();
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
    if (credential_ != null) {
      output.writeMessage(1, getCredential());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (credential_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCredential());
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
    if (!(obj instanceof org.zenoss.cloud.credentials.GetCredentialResponse)) {
      return super.equals(obj);
    }
    org.zenoss.cloud.credentials.GetCredentialResponse other = (org.zenoss.cloud.credentials.GetCredentialResponse) obj;

    if (hasCredential() != other.hasCredential()) return false;
    if (hasCredential()) {
      if (!getCredential()
          .equals(other.getCredential())) return false;
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
    if (hasCredential()) {
      hash = (37 * hash) + CREDENTIAL_FIELD_NUMBER;
      hash = (53 * hash) + getCredential().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zenoss.cloud.credentials.GetCredentialResponse parseFrom(
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
  public static Builder newBuilder(org.zenoss.cloud.credentials.GetCredentialResponse prototype) {
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
   * Protobuf type {@code zenoss.cloud.credentials.GetCredentialResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zenoss.cloud.credentials.GetCredentialResponse)
      org.zenoss.cloud.credentials.GetCredentialResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_GetCredentialResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_GetCredentialResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zenoss.cloud.credentials.GetCredentialResponse.class, org.zenoss.cloud.credentials.GetCredentialResponse.Builder.class);
    }

    // Construct using org.zenoss.cloud.credentials.GetCredentialResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (credentialBuilder_ == null) {
        credential_ = null;
      } else {
        credential_ = null;
        credentialBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zenoss.cloud.credentials.Credentials.internal_static_zenoss_cloud_credentials_GetCredentialResponse_descriptor;
    }

    @java.lang.Override
    public org.zenoss.cloud.credentials.GetCredentialResponse getDefaultInstanceForType() {
      return org.zenoss.cloud.credentials.GetCredentialResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.zenoss.cloud.credentials.GetCredentialResponse build() {
      org.zenoss.cloud.credentials.GetCredentialResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zenoss.cloud.credentials.GetCredentialResponse buildPartial() {
      org.zenoss.cloud.credentials.GetCredentialResponse result = new org.zenoss.cloud.credentials.GetCredentialResponse(this);
      if (credentialBuilder_ == null) {
        result.credential_ = credential_;
      } else {
        result.credential_ = credentialBuilder_.build();
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
      if (other instanceof org.zenoss.cloud.credentials.GetCredentialResponse) {
        return mergeFrom((org.zenoss.cloud.credentials.GetCredentialResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zenoss.cloud.credentials.GetCredentialResponse other) {
      if (other == org.zenoss.cloud.credentials.GetCredentialResponse.getDefaultInstance()) return this;
      if (other.hasCredential()) {
        mergeCredential(other.getCredential());
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
                  getCredentialFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private org.zenoss.cloud.credentials.Credential credential_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.credentials.Credential, org.zenoss.cloud.credentials.Credential.Builder, org.zenoss.cloud.credentials.CredentialOrBuilder> credentialBuilder_;
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     * @return Whether the credential field is set.
     */
    public boolean hasCredential() {
      return credentialBuilder_ != null || credential_ != null;
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     * @return The credential.
     */
    public org.zenoss.cloud.credentials.Credential getCredential() {
      if (credentialBuilder_ == null) {
        return credential_ == null ? org.zenoss.cloud.credentials.Credential.getDefaultInstance() : credential_;
      } else {
        return credentialBuilder_.getMessage();
      }
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    public Builder setCredential(org.zenoss.cloud.credentials.Credential value) {
      if (credentialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        credential_ = value;
        onChanged();
      } else {
        credentialBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    public Builder setCredential(
        org.zenoss.cloud.credentials.Credential.Builder builderForValue) {
      if (credentialBuilder_ == null) {
        credential_ = builderForValue.build();
        onChanged();
      } else {
        credentialBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    public Builder mergeCredential(org.zenoss.cloud.credentials.Credential value) {
      if (credentialBuilder_ == null) {
        if (credential_ != null) {
          credential_ =
            org.zenoss.cloud.credentials.Credential.newBuilder(credential_).mergeFrom(value).buildPartial();
        } else {
          credential_ = value;
        }
        onChanged();
      } else {
        credentialBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    public Builder clearCredential() {
      if (credentialBuilder_ == null) {
        credential_ = null;
        onChanged();
      } else {
        credential_ = null;
        credentialBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    public org.zenoss.cloud.credentials.Credential.Builder getCredentialBuilder() {
      
      onChanged();
      return getCredentialFieldBuilder().getBuilder();
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    public org.zenoss.cloud.credentials.CredentialOrBuilder getCredentialOrBuilder() {
      if (credentialBuilder_ != null) {
        return credentialBuilder_.getMessageOrBuilder();
      } else {
        return credential_ == null ?
            org.zenoss.cloud.credentials.Credential.getDefaultInstance() : credential_;
      }
    }
    /**
     * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.zenoss.cloud.credentials.Credential, org.zenoss.cloud.credentials.Credential.Builder, org.zenoss.cloud.credentials.CredentialOrBuilder> 
        getCredentialFieldBuilder() {
      if (credentialBuilder_ == null) {
        credentialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.zenoss.cloud.credentials.Credential, org.zenoss.cloud.credentials.Credential.Builder, org.zenoss.cloud.credentials.CredentialOrBuilder>(
                getCredential(),
                getParentForChildren(),
                isClean());
        credential_ = null;
      }
      return credentialBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zenoss.cloud.credentials.GetCredentialResponse)
  }

  // @@protoc_insertion_point(class_scope:zenoss.cloud.credentials.GetCredentialResponse)
  private static final org.zenoss.cloud.credentials.GetCredentialResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zenoss.cloud.credentials.GetCredentialResponse();
  }

  public static org.zenoss.cloud.credentials.GetCredentialResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCredentialResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCredentialResponse>() {
    @java.lang.Override
    public GetCredentialResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCredentialResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCredentialResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zenoss.cloud.credentials.GetCredentialResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
