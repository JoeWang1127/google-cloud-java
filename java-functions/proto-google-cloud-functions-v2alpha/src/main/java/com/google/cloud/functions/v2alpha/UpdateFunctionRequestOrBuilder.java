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
// source: google/cloud/functions/v2alpha/functions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.functions.v2alpha;

public interface UpdateFunctionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2alpha.UpdateFunctionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2alpha.Function function = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   *
   *
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2alpha.Function function = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The function.
   */
  com.google.cloud.functions.v2alpha.Function getFunction();
  /**
   *
   *
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2alpha.Function function = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.functions.v2alpha.FunctionOrBuilder getFunctionOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * If no field mask is provided, all provided fields in the request will be
   * updated.
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
   * The list of fields to be updated.
   * If no field mask is provided, all provided fields in the request will be
   * updated.
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
   * The list of fields to be updated.
   * If no field mask is provided, all provided fields in the request will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
