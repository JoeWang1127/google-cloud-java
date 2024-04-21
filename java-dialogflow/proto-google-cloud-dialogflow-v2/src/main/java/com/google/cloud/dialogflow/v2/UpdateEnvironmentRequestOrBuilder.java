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
// source: google/cloud/dialogflow/v2/environment.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

public interface UpdateEnvironmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.UpdateEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The environment.
   */
  com.google.cloud.dialogflow.v2.Environment getEnvironment();
  /**
   *
   *
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. This field is used to prevent accidental overwrite of the default
   * environment, which is an operation that cannot be undone. To confirm that
   * the caller desires this overwrite, this field must be explicitly set to
   * true when updating the default environment (environment ID = `-`).
   * </pre>
   *
   * <code>
   * bool allow_load_to_draft_and_discard_changes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The allowLoadToDraftAndDiscardChanges.
   */
  boolean getAllowLoadToDraftAndDiscardChanges();
}
