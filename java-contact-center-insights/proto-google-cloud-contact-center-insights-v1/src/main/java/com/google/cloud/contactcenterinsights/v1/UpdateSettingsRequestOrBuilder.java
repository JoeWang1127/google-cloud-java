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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contactcenterinsights.v1;

public interface UpdateSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.UpdateSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new settings values.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Settings settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   *
   *
   * <pre>
   * Required. The new settings values.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Settings settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The settings.
   */
  com.google.cloud.contactcenterinsights.v1.Settings getSettings();
  /**
   *
   *
   * <pre>
   * Required. The new settings values.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Settings settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.SettingsOrBuilder getSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
