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
// source: google/cloud/dialogflow/v2/session_entity_type.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

public interface SessionEntityTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SessionEntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of this session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`, or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
   * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display
   * Name&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   *
   * `&lt;Entity Type Display Name&gt;` must be the display name of an existing entity
   * type in the same agent that will be overridden or supplemented.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of this session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`, or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
   * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display
   * Name&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   *
   * `&lt;Entity Type Display Name&gt;` must be the display name of an existing entity
   * type in the same agent that will be overridden or supplemented.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Indicates whether the additional data should override or
   * supplement the custom entity type definition.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode entity_override_mode = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for entityOverrideMode.
   */
  int getEntityOverrideModeValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates whether the additional data should override or
   * supplement the custom entity type definition.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode entity_override_mode = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entityOverrideMode.
   */
  com.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode getEntityOverrideMode();

  /**
   *
   *
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.EntityType.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EntityType.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.EntityType.EntityOrBuilder>
      getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The collection of entities associated with this session entity
   * type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EntityType.EntityOrBuilder getEntitiesOrBuilder(int index);
}
