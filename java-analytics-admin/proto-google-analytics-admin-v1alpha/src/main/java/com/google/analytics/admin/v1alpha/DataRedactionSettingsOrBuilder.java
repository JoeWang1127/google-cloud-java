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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface DataRedactionSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.DataRedactionSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of this Data Redaction Settings resource.
   * Format:
   * properties/{property_id}/dataStreams/{data_stream}/dataRedactionSettings
   * Example: "properties/1000/dataStreams/2000/dataRedactionSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Name of this Data Redaction Settings resource.
   * Format:
   * properties/{property_id}/dataStreams/{data_stream}/dataRedactionSettings
   * Example: "properties/1000/dataStreams/2000/dataRedactionSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If enabled, any event parameter or user property values that look like an
   * email will be redacted.
   * </pre>
   *
   * <code>bool email_redaction_enabled = 2;</code>
   *
   * @return The emailRedactionEnabled.
   */
  boolean getEmailRedactionEnabled();

  /**
   *
   *
   * <pre>
   * Query Parameter redaction removes the key and value portions of a
   * query parameter if it is in the configured set of query parameters.
   *
   * If enabled, URL query replacement logic will be run for the Stream. Any
   * query parameters defined in query_parameter_keys will be redacted.
   * </pre>
   *
   * <code>bool query_parameter_redaction_enabled = 3;</code>
   *
   * @return The queryParameterRedactionEnabled.
   */
  boolean getQueryParameterRedactionEnabled();

  /**
   *
   *
   * <pre>
   * The query parameter keys to apply redaction logic to if present in the URL.
   * Query parameter matching is case-insensitive.
   *
   * Must contain at least one element if query_parameter_replacement_enabled
   * is true. Keys cannot contain commas.
   * </pre>
   *
   * <code>repeated string query_parameter_keys = 4;</code>
   *
   * @return A list containing the queryParameterKeys.
   */
  java.util.List<java.lang.String> getQueryParameterKeysList();
  /**
   *
   *
   * <pre>
   * The query parameter keys to apply redaction logic to if present in the URL.
   * Query parameter matching is case-insensitive.
   *
   * Must contain at least one element if query_parameter_replacement_enabled
   * is true. Keys cannot contain commas.
   * </pre>
   *
   * <code>repeated string query_parameter_keys = 4;</code>
   *
   * @return The count of queryParameterKeys.
   */
  int getQueryParameterKeysCount();
  /**
   *
   *
   * <pre>
   * The query parameter keys to apply redaction logic to if present in the URL.
   * Query parameter matching is case-insensitive.
   *
   * Must contain at least one element if query_parameter_replacement_enabled
   * is true. Keys cannot contain commas.
   * </pre>
   *
   * <code>repeated string query_parameter_keys = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The queryParameterKeys at the given index.
   */
  java.lang.String getQueryParameterKeys(int index);
  /**
   *
   *
   * <pre>
   * The query parameter keys to apply redaction logic to if present in the URL.
   * Query parameter matching is case-insensitive.
   *
   * Must contain at least one element if query_parameter_replacement_enabled
   * is true. Keys cannot contain commas.
   * </pre>
   *
   * <code>repeated string query_parameter_keys = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the queryParameterKeys at the given index.
   */
  com.google.protobuf.ByteString getQueryParameterKeysBytes(int index);
}
