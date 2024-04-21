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

public interface CreateUserWorkloadsConfigMapRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The environment name to create a ConfigMap for, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
   * Required. The environment name to create a ConfigMap for, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
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
   * Required. User workloads ConfigMap to create.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userWorkloadsConfigMap field is set.
   */
  boolean hasUserWorkloadsConfigMap();
  /**
   *
   *
   * <pre>
   * Required. User workloads ConfigMap to create.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userWorkloadsConfigMap.
   */
  com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      getUserWorkloadsConfigMap();
  /**
   *
   *
   * <pre>
   * Required. User workloads ConfigMap to create.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap user_workloads_config_map = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder
      getUserWorkloadsConfigMapOrBuilder();
}
