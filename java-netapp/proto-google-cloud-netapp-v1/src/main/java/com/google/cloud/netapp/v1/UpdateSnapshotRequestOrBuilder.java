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
// source: google/cloud/netapp/v1/snapshot.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.netapp.v1;

public interface UpdateSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.UpdateSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The snapshot.
   */
  com.google.cloud.netapp.v1.Snapshot getSnapshot();
  /**
   *
   *
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.netapp.v1.SnapshotOrBuilder getSnapshotOrBuilder();
}
