// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface DialogflowInteractionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.DialogflowInteractionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Dialogflow intent resource path. Format:
   * projects/{project}/agent/{agent}/intents/{intent}
   * </pre>
   *
   * <code>string dialogflow_intent_id = 1;</code>
   * @return The dialogflowIntentId.
   */
  java.lang.String getDialogflowIntentId();
  /**
   * <pre>
   * The Dialogflow intent resource path. Format:
   * projects/{project}/agent/{agent}/intents/{intent}
   * </pre>
   *
   * <code>string dialogflow_intent_id = 1;</code>
   * @return The bytes for dialogflowIntentId.
   */
  com.google.protobuf.ByteString
      getDialogflowIntentIdBytes();

  /**
   * <pre>
   * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0
   * (completely certain).
   * </pre>
   *
   * <code>float confidence = 2;</code>
   * @return The confidence.
   */
  float getConfidence();
}