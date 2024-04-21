/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/entity_type.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface ImportEntityTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to import the entity types into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to import the entity types into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to import entity types from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string entity_types_uri = 2;</code>
   *
   * @return Whether the entityTypesUri field is set.
   */
  boolean hasEntityTypesUri();
  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to import entity types from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string entity_types_uri = 2;</code>
   *
   * @return The entityTypesUri.
   */
  java.lang.String getEntityTypesUri();
  /**
   *
   *
   * <pre>
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI
   * to import entity types from. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string entity_types_uri = 2;</code>
   *
   * @return The bytes for entityTypesUri.
   */
  com.google.protobuf.ByteString getEntityTypesUriBytes();

  /**
   *
   *
   * <pre>
   * Uncompressed byte content of entity types.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.InlineSource entity_types_content = 3;</code>
   *
   * @return Whether the entityTypesContent field is set.
   */
  boolean hasEntityTypesContent();
  /**
   *
   *
   * <pre>
   * Uncompressed byte content of entity types.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.InlineSource entity_types_content = 3;</code>
   *
   * @return The entityTypesContent.
   */
  com.google.cloud.dialogflow.cx.v3beta1.InlineSource getEntityTypesContent();
  /**
   *
   *
   * <pre>
   * Uncompressed byte content of entity types.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.InlineSource entity_types_content = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.InlineSourceOrBuilder getEntityTypesContentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Merge option for importing entity types.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest.MergeOption merge_option = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for mergeOption.
   */
  int getMergeOptionValue();
  /**
   *
   *
   * <pre>
   * Required. Merge option for importing entity types.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest.MergeOption merge_option = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The mergeOption.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest.MergeOption getMergeOption();

  /**
   *
   *
   * <pre>
   * Optional. The target entity type to import into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entity_types/&lt;EntityType ID&gt;`.
   * If set, there should be only one entity type included in
   * [entity_types][google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest.entity_types],
   * of which the type should match the type of the target entity type. All
   * [entities][google.cloud.dialogflow.cx.v3beta1.EntityType.entities] in the
   * imported entity type will be added to the target entity type.
   * </pre>
   *
   * <code>
   * string target_entity_type = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The targetEntityType.
   */
  java.lang.String getTargetEntityType();
  /**
   *
   *
   * <pre>
   * Optional. The target entity type to import into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entity_types/&lt;EntityType ID&gt;`.
   * If set, there should be only one entity type included in
   * [entity_types][google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest.entity_types],
   * of which the type should match the type of the target entity type. All
   * [entities][google.cloud.dialogflow.cx.v3beta1.EntityType.entities] in the
   * imported entity type will be added to the target entity type.
   * </pre>
   *
   * <code>
   * string target_entity_type = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for targetEntityType.
   */
  com.google.protobuf.ByteString getTargetEntityTypeBytes();

  com.google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest.EntityTypesCase
      getEntityTypesCase();
}
