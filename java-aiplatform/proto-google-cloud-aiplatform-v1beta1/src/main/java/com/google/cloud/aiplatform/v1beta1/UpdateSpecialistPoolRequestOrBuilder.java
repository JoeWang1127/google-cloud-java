/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdateSpecialistPoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateSpecialistPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The SpecialistPool which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pool = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the specialistPool field is set.
   */
  boolean hasSpecialistPool();
  /**
   *
   *
   * <pre>
   * Required. The SpecialistPool which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pool = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The specialistPool.
   */
  com.google.cloud.aiplatform.v1beta1.SpecialistPool getSpecialistPool();
  /**
   *
   *
   * <pre>
   * Required. The SpecialistPool which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SpecialistPool specialist_pool = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SpecialistPoolOrBuilder getSpecialistPoolOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
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
   * Required. The update mask applies to the resource.
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
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
