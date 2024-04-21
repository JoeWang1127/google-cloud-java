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
// source: google/cloud/retail/v2alpha/model_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2alpha;

public interface CreateModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.CreateModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource under which to create the model. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
   * Required. The parent resource under which to create the model. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
   * Required. The payload of the [Model][google.cloud.retail.v2alpha.Model]  to
   * create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   *
   *
   * <pre>
   * Required. The payload of the [Model][google.cloud.retail.v2alpha.Model]  to
   * create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The model.
   */
  com.google.cloud.retail.v2alpha.Model getModel();
  /**
   *
   *
   * <pre>
   * Required. The payload of the [Model][google.cloud.retail.v2alpha.Model]  to
   * create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2alpha.ModelOrBuilder getModelOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Whether to run a dry run to validate the request (without
   * actually creating the model).
   * </pre>
   *
   * <code>bool dry_run = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dryRun.
   */
  boolean getDryRun();
}
