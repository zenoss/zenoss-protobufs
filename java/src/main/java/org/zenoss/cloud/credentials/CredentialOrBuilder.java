// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/credentials.proto

package org.zenoss.cloud.credentials;

public interface CredentialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.credentials.Credential)
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
   * <code>.zenoss.cloud.credentials.Info info = 2 [json_name = "info"];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.zenoss.cloud.credentials.Info info = 2 [json_name = "info"];</code>
   * @return The info.
   */
  org.zenoss.cloud.credentials.Info getInfo();
  /**
   * <code>.zenoss.cloud.credentials.Info info = 2 [json_name = "info"];</code>
   */
  org.zenoss.cloud.credentials.InfoOrBuilder getInfoOrBuilder();

  /**
   * <code>map&lt;string, string&gt; secrets = 3 [json_name = "secrets"];</code>
   */
  int getSecretsCount();
  /**
   * <code>map&lt;string, string&gt; secrets = 3 [json_name = "secrets"];</code>
   */
  boolean containsSecrets(
      java.lang.String key);
  /**
   * Use {@link #getSecretsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSecrets();
  /**
   * <code>map&lt;string, string&gt; secrets = 3 [json_name = "secrets"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSecretsMap();
  /**
   * <code>map&lt;string, string&gt; secrets = 3 [json_name = "secrets"];</code>
   */

  /* nullable */
java.lang.String getSecretsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; secrets = 3 [json_name = "secrets"];</code>
   */

  java.lang.String getSecretsOrThrow(
      java.lang.String key);
}