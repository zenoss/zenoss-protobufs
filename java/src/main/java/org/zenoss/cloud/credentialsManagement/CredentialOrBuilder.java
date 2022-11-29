// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/credentialsmanagement.proto

package org.zenoss.cloud.credentialsManagement;

public interface CredentialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.Credential)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string api_key = 3 [json_name = "apiKey"];</code>
   * @return Whether the apiKey field is set.
   */
  boolean hasApiKey();
  /**
   * <code>string api_key = 3 [json_name = "apiKey"];</code>
   * @return The apiKey.
   */
  java.lang.String getApiKey();
  /**
   * <code>string api_key = 3 [json_name = "apiKey"];</code>
   * @return The bytes for apiKey.
   */
  com.google.protobuf.ByteString
      getApiKeyBytes();

  /**
   * <code>.zenoss.cloud.CredsPair username_password = 4 [json_name = "usernamePassword"];</code>
   * @return Whether the usernamePassword field is set.
   */
  boolean hasUsernamePassword();
  /**
   * <code>.zenoss.cloud.CredsPair username_password = 4 [json_name = "usernamePassword"];</code>
   * @return The usernamePassword.
   */
  org.zenoss.cloud.credentialsManagement.CredsPair getUsernamePassword();
  /**
   * <code>.zenoss.cloud.CredsPair username_password = 4 [json_name = "usernamePassword"];</code>
   */
  org.zenoss.cloud.credentialsManagement.CredsPairOrBuilder getUsernamePasswordOrBuilder();

  /**
   * <code>.zenoss.cloud.CredsPair client_credentials = 5 [json_name = "clientCredentials"];</code>
   * @return Whether the clientCredentials field is set.
   */
  boolean hasClientCredentials();
  /**
   * <code>.zenoss.cloud.CredsPair client_credentials = 5 [json_name = "clientCredentials"];</code>
   * @return The clientCredentials.
   */
  org.zenoss.cloud.credentialsManagement.CredsPair getClientCredentials();
  /**
   * <code>.zenoss.cloud.CredsPair client_credentials = 5 [json_name = "clientCredentials"];</code>
   */
  org.zenoss.cloud.credentialsManagement.CredsPairOrBuilder getClientCredentialsOrBuilder();

  public org.zenoss.cloud.credentialsManagement.Credential.SecretCase getSecretCase();
}
