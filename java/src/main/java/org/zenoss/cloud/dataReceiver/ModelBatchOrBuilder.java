// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface ModelBatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.ModelBatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tags that apply to all models in the batch
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_tags = 1;</code>
   */
  int getGlobalTagsCount();
  /**
   * <pre>
   * Tags that apply to all models in the batch
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_tags = 1;</code>
   */
  boolean containsGlobalTags(
      java.lang.String key);
  /**
   * Use {@link #getGlobalTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getGlobalTags();
  /**
   * <pre>
   * Tags that apply to all models in the batch
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_tags = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getGlobalTagsMap();
  /**
   * <pre>
   * Tags that apply to all models in the batch
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_tags = 1;</code>
   */

  java.lang.String getGlobalTagsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Tags that apply to all models in the batch
   * </pre>
   *
   * <code>map&lt;string, string&gt; global_tags = 1;</code>
   */

  java.lang.String getGlobalTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The models
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Model models = 2;</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.Model> 
      getModelsList();
  /**
   * <pre>
   * The models
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Model models = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.Model getModels(int index);
  /**
   * <pre>
   * The models
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Model models = 2;</code>
   */
  int getModelsCount();
  /**
   * <pre>
   * The models
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Model models = 2;</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.ModelOrBuilder> 
      getModelsOrBuilderList();
  /**
   * <pre>
   * The models
   * </pre>
   *
   * <code>repeated .zenoss.cloud.Model models = 2;</code>
   */
  org.zenoss.cloud.dataReceiver.ModelOrBuilder getModelsOrBuilder(
      int index);
}
