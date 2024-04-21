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
// source: google/cloud/contentwarehouse/v1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

public interface UpdateOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.UpdateOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type for update.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
   *
   * @return The enum numeric value on the wire for updateType.
   */
  int getUpdateTypeValue();
  /**
   *
   *
   * <pre>
   * Type for update.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
   *
   * @return The updateType.
   */
  com.google.cloud.contentwarehouse.v1.UpdateType getUpdateType();

  /**
   *
   *
   * <pre>
   * Field mask for merging Document fields.
   * For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
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
   * Field mask for merging Document fields.
   * For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
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
   * Field mask for merging Document fields.
   * For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Options for merging.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
   *
   * @return Whether the mergeFieldsOptions field is set.
   */
  boolean hasMergeFieldsOptions();
  /**
   *
   *
   * <pre>
   * Options for merging.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
   *
   * @return The mergeFieldsOptions.
   */
  com.google.cloud.contentwarehouse.v1.MergeFieldsOptions getMergeFieldsOptions();
  /**
   *
   *
   * <pre>
   * Options for merging.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.MergeFieldsOptionsOrBuilder getMergeFieldsOptionsOrBuilder();
}
