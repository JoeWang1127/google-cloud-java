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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface WriteTensorboardExperimentDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.WriteTensorboardExperimentDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardExperiment to write data to.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>
   * string tensorboard_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboardExperiment.
   */
  java.lang.String getTensorboardExperiment();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardExperiment to write data to.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>
   * string tensorboard_experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboardExperiment.
   */
  com.google.protobuf.ByteString getTensorboardExperimentBytes();

  /**
   *
   *
   * <pre>
   * Required. Requests containing per-run TensorboardTimeSeries data to write.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest write_run_data_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest>
      getWriteRunDataRequestsList();
  /**
   *
   *
   * <pre>
   * Required. Requests containing per-run TensorboardTimeSeries data to write.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest write_run_data_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest getWriteRunDataRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. Requests containing per-run TensorboardTimeSeries data to write.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest write_run_data_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getWriteRunDataRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. Requests containing per-run TensorboardTimeSeries data to write.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest write_run_data_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.WriteTensorboardRunDataRequestOrBuilder>
      getWriteRunDataRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Requests containing per-run TensorboardTimeSeries data to write.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.WriteTensorboardRunDataRequest write_run_data_requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.WriteTensorboardRunDataRequestOrBuilder
      getWriteRunDataRequestsOrBuilder(int index);
}
