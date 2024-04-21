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
// source: google/cloud/aiplatform/v1/tuning_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface SupervisedTuningSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SupervisedTuningSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Cloud Storage path to file containing training dataset for
   * tuning.
   * </pre>
   *
   * <code>string training_dataset_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The trainingDatasetUri.
   */
  java.lang.String getTrainingDatasetUri();
  /**
   *
   *
   * <pre>
   * Required. Cloud Storage path to file containing training dataset for
   * tuning.
   * </pre>
   *
   * <code>string training_dataset_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for trainingDatasetUri.
   */
  com.google.protobuf.ByteString getTrainingDatasetUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage path to file containing validation dataset for
   * tuning.
   * </pre>
   *
   * <code>string validation_dataset_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validationDatasetUri.
   */
  java.lang.String getValidationDatasetUri();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage path to file containing validation dataset for
   * tuning.
   * </pre>
   *
   * <code>string validation_dataset_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for validationDatasetUri.
   */
  com.google.protobuf.ByteString getValidationDatasetUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Hyperparameters for SFT.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SupervisedHyperParameters hyper_parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the hyperParameters field is set.
   */
  boolean hasHyperParameters();
  /**
   *
   *
   * <pre>
   * Optional. Hyperparameters for SFT.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SupervisedHyperParameters hyper_parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The hyperParameters.
   */
  com.google.cloud.aiplatform.v1.SupervisedHyperParameters getHyperParameters();
  /**
   *
   *
   * <pre>
   * Optional. Hyperparameters for SFT.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SupervisedHyperParameters hyper_parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SupervisedHyperParametersOrBuilder getHyperParametersOrBuilder();
}
