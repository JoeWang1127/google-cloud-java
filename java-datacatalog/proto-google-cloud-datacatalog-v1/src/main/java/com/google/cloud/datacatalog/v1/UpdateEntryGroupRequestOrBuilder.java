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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

public interface UpdateEntryGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UpdateEntryGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Updates for the entry group. The `name` field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entryGroup field is set.
   */
  boolean hasEntryGroup();
  /**
   *
   *
   * <pre>
   * Required. Updates for the entry group. The `name` field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entryGroup.
   */
  com.google.cloud.datacatalog.v1.EntryGroup getEntryGroup();
  /**
   *
   *
   * <pre>
   * Required. Updates for the entry group. The `name` field must be set.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.EntryGroup entry_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.EntryGroupOrBuilder getEntryGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Names of fields whose values to overwrite on an entry group.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Names of fields whose values to overwrite on an entry group.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Names of fields whose values to overwrite on an entry group.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
