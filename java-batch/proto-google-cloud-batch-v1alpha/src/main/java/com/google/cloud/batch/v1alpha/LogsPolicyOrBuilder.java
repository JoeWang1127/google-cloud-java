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
// source: google/cloud/batch/v1alpha/job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.batch.v1alpha;

public interface LogsPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.LogsPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Where logs should be saved.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
   *
   * @return The enum numeric value on the wire for destination.
   */
  int getDestinationValue();
  /**
   *
   *
   * <pre>
   * Where logs should be saved.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.LogsPolicy.Destination destination = 1;</code>
   *
   * @return The destination.
   */
  com.google.cloud.batch.v1alpha.LogsPolicy.Destination getDestination();

  /**
   *
   *
   * <pre>
   * The path to which logs are saved when the destination = PATH. This can be a
   * local file path on the VM, or under the mount point of a Persistent Disk or
   * Filestore, or a Cloud Storage path.
   * </pre>
   *
   * <code>string logs_path = 2;</code>
   *
   * @return The logsPath.
   */
  java.lang.String getLogsPath();
  /**
   *
   *
   * <pre>
   * The path to which logs are saved when the destination = PATH. This can be a
   * local file path on the VM, or under the mount point of a Persistent Disk or
   * Filestore, or a Cloud Storage path.
   * </pre>
   *
   * <code>string logs_path = 2;</code>
   *
   * @return The bytes for logsPath.
   */
  com.google.protobuf.ByteString getLogsPathBytes();

  /**
   *
   *
   * <pre>
   * Optional. Additional settings for Cloud Logging. It will only take effect
   * when the destination of `LogsPolicy` is set to `CLOUD_LOGGING`.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.LogsPolicy.CloudLoggingOption cloud_logging_option = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the cloudLoggingOption field is set.
   */
  boolean hasCloudLoggingOption();
  /**
   *
   *
   * <pre>
   * Optional. Additional settings for Cloud Logging. It will only take effect
   * when the destination of `LogsPolicy` is set to `CLOUD_LOGGING`.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.LogsPolicy.CloudLoggingOption cloud_logging_option = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudLoggingOption.
   */
  com.google.cloud.batch.v1alpha.LogsPolicy.CloudLoggingOption getCloudLoggingOption();
  /**
   *
   *
   * <pre>
   * Optional. Additional settings for Cloud Logging. It will only take effect
   * when the destination of `LogsPolicy` is set to `CLOUD_LOGGING`.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.LogsPolicy.CloudLoggingOption cloud_logging_option = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.batch.v1alpha.LogsPolicy.CloudLoggingOptionOrBuilder
      getCloudLoggingOptionOrBuilder();
}
