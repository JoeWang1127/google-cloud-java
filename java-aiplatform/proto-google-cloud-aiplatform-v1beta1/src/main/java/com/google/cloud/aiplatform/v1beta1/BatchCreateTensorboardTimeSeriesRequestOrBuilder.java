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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface BatchCreateTensorboardTimeSeriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BatchCreateTensorboardTimeSeriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardExperiment to create the
   * TensorboardTimeSeries in.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * The TensorboardRuns referenced by the parent fields in the
   * CreateTensorboardTimeSeriesRequest messages must be sub resources of this
   * TensorboardExperiment.
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
   * Required. The resource name of the TensorboardExperiment to create the
   * TensorboardTimeSeries in.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * The TensorboardRuns referenced by the parent fields in the
   * CreateTensorboardTimeSeriesRequest messages must be sub resources of this
   * TensorboardExperiment.
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
   * Required. The request message specifying the TensorboardTimeSeries to
   * create. A maximum of 1000 TensorboardTimeSeries can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest>
      getRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the TensorboardTimeSeries to
   * create. A maximum of 1000 TensorboardTimeSeries can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the TensorboardTimeSeries to
   * create. A maximum of 1000 TensorboardTimeSeries can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the TensorboardTimeSeries to
   * create. A maximum of 1000 TensorboardTimeSeries can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the TensorboardTimeSeries to
   * create. A maximum of 1000 TensorboardTimeSeries can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.CreateTensorboardTimeSeriesRequestOrBuilder
      getRequestsOrBuilder(int index);
}
