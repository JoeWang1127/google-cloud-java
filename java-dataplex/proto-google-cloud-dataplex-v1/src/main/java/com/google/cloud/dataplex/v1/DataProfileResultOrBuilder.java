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
// source: google/cloud/dataplex/v1/data_profile.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataplex.v1;

public interface DataProfileResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataProfileResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The count of rows scanned.
   * </pre>
   *
   * <code>int64 row_count = 3;</code>
   *
   * @return The rowCount.
   */
  long getRowCount();

  /**
   *
   *
   * <pre>
   * The profile information per field.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileResult.Profile profile = 4;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * The profile information per field.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileResult.Profile profile = 4;</code>
   *
   * @return The profile.
   */
  com.google.cloud.dataplex.v1.DataProfileResult.Profile getProfile();
  /**
   *
   *
   * <pre>
   * The profile information per field.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileResult.Profile profile = 4;</code>
   */
  com.google.cloud.dataplex.v1.DataProfileResult.ProfileOrBuilder getProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData scanned_data = 5;</code>
   *
   * @return Whether the scannedData field is set.
   */
  boolean hasScannedData();
  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData scanned_data = 5;</code>
   *
   * @return The scannedData.
   */
  com.google.cloud.dataplex.v1.ScannedData getScannedData();
  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData scanned_data = 5;</code>
   */
  com.google.cloud.dataplex.v1.ScannedDataOrBuilder getScannedDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileResult.PostScanActionsResult post_scan_actions_result = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the postScanActionsResult field is set.
   */
  boolean hasPostScanActionsResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileResult.PostScanActionsResult post_scan_actions_result = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The postScanActionsResult.
   */
  com.google.cloud.dataplex.v1.DataProfileResult.PostScanActionsResult getPostScanActionsResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileResult.PostScanActionsResult post_scan_actions_result = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataProfileResult.PostScanActionsResultOrBuilder
      getPostScanActionsResultOrBuilder();
}
