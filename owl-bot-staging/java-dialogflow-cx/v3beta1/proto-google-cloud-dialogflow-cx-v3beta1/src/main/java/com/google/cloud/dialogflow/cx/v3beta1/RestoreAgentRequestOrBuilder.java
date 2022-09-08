// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/agent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface RestoreAgentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.RestoreAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the agent to restore into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the agent to restore into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to restore agent from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   * @return Whether the agentUri field is set.
   */
  boolean hasAgentUri();
  /**
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to restore agent from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   * @return The agentUri.
   */
  java.lang.String getAgentUri();
  /**
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to restore agent from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   * @return The bytes for agentUri.
   */
  com.google.protobuf.ByteString
      getAgentUriBytes();

  /**
   * <pre>
   * Uncompressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   * @return Whether the agentContent field is set.
   */
  boolean hasAgentContent();
  /**
   * <pre>
   * Uncompressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   * @return The agentContent.
   */
  com.google.protobuf.ByteString getAgentContent();

  /**
   * <pre>
   * Agent restore mode. If not specified, `KEEP` is assumed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RestoreAgentRequest.RestoreOption restore_option = 5;</code>
   * @return The enum numeric value on the wire for restoreOption.
   */
  int getRestoreOptionValue();
  /**
   * <pre>
   * Agent restore mode. If not specified, `KEEP` is assumed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RestoreAgentRequest.RestoreOption restore_option = 5;</code>
   * @return The restoreOption.
   */
  com.google.cloud.dialogflow.cx.v3beta1.RestoreAgentRequest.RestoreOption getRestoreOption();

  public com.google.cloud.dialogflow.cx.v3beta1.RestoreAgentRequest.AgentCase getAgentCase();
}