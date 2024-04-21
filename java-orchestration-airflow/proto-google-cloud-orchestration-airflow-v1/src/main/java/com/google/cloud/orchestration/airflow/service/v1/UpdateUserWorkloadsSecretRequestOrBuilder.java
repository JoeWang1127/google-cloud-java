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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.orchestration.airflow.service.v1;

public interface UpdateUserWorkloadsSecretRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.UpdateUserWorkloadsSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. User workloads Secret to override.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secret = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the userWorkloadsSecret field is set.
   */
  boolean hasUserWorkloadsSecret();
  /**
   *
   *
   * <pre>
   * Optional. User workloads Secret to override.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secret = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The userWorkloadsSecret.
   */
  com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret getUserWorkloadsSecret();
  /**
   *
   *
   * <pre>
   * Optional. User workloads Secret to override.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret user_workloads_secret = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecretOrBuilder
      getUserWorkloadsSecretOrBuilder();
}
