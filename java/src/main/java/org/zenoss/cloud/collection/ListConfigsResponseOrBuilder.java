// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/collection_cfg.proto

package org.zenoss.cloud.collection;

public interface ListConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.collection_cfg.ListConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  java.util.List<org.zenoss.cloud.collection.Config> 
      getConfigurationsList();
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  org.zenoss.cloud.collection.Config getConfigurations(int index);
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  int getConfigurationsCount();
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  java.util.List<? extends org.zenoss.cloud.collection.ConfigOrBuilder> 
      getConfigurationsOrBuilderList();
  /**
   * <code>repeated .zenoss.cloud.collection_cfg.Config configurations = 1;</code>
   */
  org.zenoss.cloud.collection.ConfigOrBuilder getConfigurationsOrBuilder(
      int index);
}
