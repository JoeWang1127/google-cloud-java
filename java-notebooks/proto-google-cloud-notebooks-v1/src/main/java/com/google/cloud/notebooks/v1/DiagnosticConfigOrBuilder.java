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
// source: google/cloud/notebooks/v1/diagnostic_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.notebooks.v1;

public interface DiagnosticConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.DiagnosticConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. User Cloud Storage bucket location (REQUIRED).
   * Must be formatted with path prefix (`gs://$GCS_BUCKET`).
   *
   * Permissions:
   * User Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account
   *   attached to VM.
   * Google Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account or
   *   user credentials attached to VM depending on authentication mode.
   *
   * Cloud Storage bucket Log file will be written to
   * `gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz`
   * </pre>
   *
   * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The gcsBucket.
   */
  java.lang.String getGcsBucket();
  /**
   *
   *
   * <pre>
   * Required. User Cloud Storage bucket location (REQUIRED).
   * Must be formatted with path prefix (`gs://$GCS_BUCKET`).
   *
   * Permissions:
   * User Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account
   *   attached to VM.
   * Google Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account or
   *   user credentials attached to VM depending on authentication mode.
   *
   * Cloud Storage bucket Log file will be written to
   * `gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz`
   * </pre>
   *
   * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for gcsBucket.
   */
  com.google.protobuf.ByteString getGcsBucketBytes();

  /**
   *
   *
   * <pre>
   * Optional. Defines the relative storage path in the Cloud Storage bucket
   * where the diagnostic logs will be written: Default path will be the root
   * directory of the Cloud Storage bucket
   * (`gs://$GCS_BUCKET/$DATE_$TIME.tar.gz`)
   * Example of full path where Log file will be written:
   * `gs://$GCS_BUCKET/$RELATIVE_PATH/`
   * </pre>
   *
   * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The relativePath.
   */
  java.lang.String getRelativePath();
  /**
   *
   *
   * <pre>
   * Optional. Defines the relative storage path in the Cloud Storage bucket
   * where the diagnostic logs will be written: Default path will be the root
   * directory of the Cloud Storage bucket
   * (`gs://$GCS_BUCKET/$DATE_$TIME.tar.gz`)
   * Example of full path where Log file will be written:
   * `gs://$GCS_BUCKET/$RELATIVE_PATH/`
   * </pre>
   *
   * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for relativePath.
   */
  com.google.protobuf.ByteString getRelativePathBytes();

  /**
   *
   *
   * <pre>
   * Optional. Enables flag to repair service for instance
   * </pre>
   *
   * <code>bool repair_flag_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The repairFlagEnabled.
   */
  boolean getRepairFlagEnabled();

  /**
   *
   *
   * <pre>
   * Optional. Enables flag to capture packets from the instance for 30 seconds
   * </pre>
   *
   * <code>bool packet_capture_flag_enabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The packetCaptureFlagEnabled.
   */
  boolean getPacketCaptureFlagEnabled();

  /**
   *
   *
   * <pre>
   * Optional. Enables flag to copy all `/home/jupyter` folder contents
   * </pre>
   *
   * <code>bool copy_home_files_flag_enabled = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The copyHomeFilesFlagEnabled.
   */
  boolean getCopyHomeFilesFlagEnabled();
}
