// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zenoss/cloud/data_receiver.proto

package org.zenoss.cloud.dataReceiver;

public interface ModelStatusResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zenoss.cloud.ModelStatusResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * failed is the count of models that failed to be accepted
   * </pre>
   *
   * <code>int32 failed = 1 [json_name = "failed"];</code>
   * @return The failed.
   */
  int getFailed();

  /**
   * <pre>
   * succeeded is the count of models that were accepted
   * </pre>
   *
   * <code>int32 succeeded = 2 [json_name = "succeeded"];</code>
   * @return The succeeded.
   */
  int getSucceeded();

  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * message is an informational message that may or may not be set
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  java.util.List<org.zenoss.cloud.dataReceiver.ModelError> 
      getFailedModelsList();
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  org.zenoss.cloud.dataReceiver.ModelError getFailedModels(int index);
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  int getFailedModelsCount();
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  java.util.List<? extends org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder> 
      getFailedModelsOrBuilderList();
  /**
   * <pre>
   * Failed models only returned if detailedResponse is set to true
   * </pre>
   *
   * <code>repeated .zenoss.cloud.ModelError failedModels = 4 [json_name = "failedModels"];</code>
   */
  org.zenoss.cloud.dataReceiver.ModelErrorOrBuilder getFailedModelsOrBuilder(
      int index);
}
