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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface ImportDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ImportDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The desired input locations. The contents of all input locations
   * will be imported in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ImportDataConfig> getImportConfigsList();
  /**
   *
   *
   * <pre>
   * Required. The desired input locations. The contents of all input locations
   * will be imported in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ImportDataConfig getImportConfigs(int index);
  /**
   *
   *
   * <pre>
   * Required. The desired input locations. The contents of all input locations
   * will be imported in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getImportConfigsCount();
  /**
   *
   *
   * <pre>
   * Required. The desired input locations. The contents of all input locations
   * will be imported in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ImportDataConfigOrBuilder>
      getImportConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The desired input locations. The contents of all input locations
   * will be imported in one batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ImportDataConfig import_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ImportDataConfigOrBuilder getImportConfigsOrBuilder(
      int index);
}
