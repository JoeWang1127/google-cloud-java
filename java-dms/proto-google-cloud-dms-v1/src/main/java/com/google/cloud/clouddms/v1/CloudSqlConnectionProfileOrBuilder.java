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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

public interface CloudSqlConnectionProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.CloudSqlConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL instance ID that this connection profile is
   * associated with.
   * </pre>
   *
   * <code>string cloud_sql_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The cloudSqlId.
   */
  java.lang.String getCloudSqlId();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL instance ID that this connection profile is
   * associated with.
   * </pre>
   *
   * <code>string cloud_sql_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for cloudSqlId.
   */
  com.google.protobuf.ByteString getCloudSqlIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.CloudSqlSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.CloudSqlSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The settings.
   */
  com.google.cloud.clouddms.v1.CloudSqlSettings getSettings();
  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.CloudSqlSettings settings = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.clouddms.v1.CloudSqlSettingsOrBuilder getSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL database instance's private IP.
   * </pre>
   *
   * <code>string private_ip = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The privateIp.
   */
  java.lang.String getPrivateIp();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL database instance's private IP.
   * </pre>
   *
   * <code>string private_ip = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for privateIp.
   */
  com.google.protobuf.ByteString getPrivateIpBytes();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL database instance's public IP.
   * </pre>
   *
   * <code>string public_ip = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The publicIp.
   */
  java.lang.String getPublicIp();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL database instance's public IP.
   * </pre>
   *
   * <code>string public_ip = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for publicIp.
   */
  com.google.protobuf.ByteString getPublicIpBytes();

  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL database instance's additional (outgoing) public
   * IP. Used when the Cloud SQL database availability type is REGIONAL (i.e.
   * multiple zones / highly available).
   * </pre>
   *
   * <code>string additional_public_ip = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The additionalPublicIp.
   */
  java.lang.String getAdditionalPublicIp();
  /**
   *
   *
   * <pre>
   * Output only. The Cloud SQL database instance's additional (outgoing) public
   * IP. Used when the Cloud SQL database availability type is REGIONAL (i.e.
   * multiple zones / highly available).
   * </pre>
   *
   * <code>string additional_public_ip = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for additionalPublicIp.
   */
  com.google.protobuf.ByteString getAdditionalPublicIpBytes();
}
