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
// source: google/cloud/aiplatform/v1/prediction_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface StreamingPredictRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.StreamingPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor inputs = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Tensor> getInputsList();
  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor inputs = 2;</code>
   */
  com.google.cloud.aiplatform.v1.Tensor getInputs(int index);
  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor inputs = 2;</code>
   */
  int getInputsCount();
  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor inputs = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TensorOrBuilder> getInputsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor inputs = 2;</code>
   */
  com.google.cloud.aiplatform.v1.TensorOrBuilder getInputsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 3;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 3;</code>
   *
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1.Tensor getParameters();
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 3;</code>
   */
  com.google.cloud.aiplatform.v1.TensorOrBuilder getParametersOrBuilder();
}
