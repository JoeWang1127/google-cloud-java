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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface ExplanationSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExplanationSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters();
  /**
   *
   *
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The metadata.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder getMetadataOrBuilder();
}
