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
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.servicehealth.v1;

public interface AssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Full name of the resource as defined in
   * [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * </pre>
   *
   * <code>string asset_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The assetName.
   */
  java.lang.String getAssetName();
  /**
   *
   *
   * <pre>
   * Output only. Full name of the resource as defined in
   * [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * </pre>
   *
   * <code>string asset_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for assetName.
   */
  com.google.protobuf.ByteString getAssetNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Type of the asset. Example:
   * `"cloudresourcemanager.googleapis.com/Project"`
   * </pre>
   *
   * <code>string asset_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * Output only. Type of the asset. Example:
   * `"cloudresourcemanager.googleapis.com/Project"`
   * </pre>
   *
   * <code>string asset_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();
}
