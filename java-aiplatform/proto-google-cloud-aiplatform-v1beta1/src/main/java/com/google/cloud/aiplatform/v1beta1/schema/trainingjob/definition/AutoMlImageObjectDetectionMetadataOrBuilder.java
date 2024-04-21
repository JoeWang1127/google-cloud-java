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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_object_detection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlImageObjectDetectionMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The actual training cost of creating this model, expressed in
   * milli node hours, i.e. 1,000 value in this field means 1 node hour.
   * Guaranteed to not exceed inputs.budgetMilliNodeHours.
   * </pre>
   *
   * <code>int64 cost_milli_node_hours = 1;</code>
   *
   * @return The costMilliNodeHours.
   */
  long getCostMilliNodeHours();

  /**
   *
   *
   * <pre>
   * For successful job completions, this is the reason why the job has
   * finished.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata.SuccessfulStopReason successful_stop_reason = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for successfulStopReason.
   */
  int getSuccessfulStopReasonValue();
  /**
   *
   *
   * <pre>
   * For successful job completions, this is the reason why the job has
   * finished.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageObjectDetectionMetadata.SuccessfulStopReason successful_stop_reason = 2;
   * </code>
   *
   * @return The successfulStopReason.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlImageObjectDetectionMetadata.SuccessfulStopReason
      getSuccessfulStopReason();
}
