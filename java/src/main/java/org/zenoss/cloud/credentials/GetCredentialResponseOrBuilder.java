// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/credentials.proto

package org.zenoss.cloud.credentials;

public interface GetCredentialResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.credentials.GetCredentialResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
   * @return Whether the credential field is set.
   */
  boolean hasCredential();
  /**
   * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
   * @return The credential.
   */
  org.zenoss.cloud.credentials.Credential getCredential();
  /**
   * <code>.zenoss.cloud.credentials.Credential credential = 1 [json_name = "credential"];</code>
   */
  org.zenoss.cloud.credentials.CredentialOrBuilder getCredentialOrBuilder();
}