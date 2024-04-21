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
// source: google/cloud/bigquery/connection/v1/connection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.connection.v1;

public interface CloudSqlPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.CloudSqlProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud SQL instance ID in the form `project:location:instance`.
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Cloud SQL instance ID in the form `project:location:instance`.
   * </pre>
   *
   * <code>string instance_id = 1;</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 2;</code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   *
   *
   * <pre>
   * Database name.
   * </pre>
   *
   * <code>string database = 2;</code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * Type of the Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSqlProperties.DatabaseType type = 3;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the Cloud SQL database.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.CloudSqlProperties.DatabaseType type = 3;</code>
   *
   * @return The type.
   */
  com.google.cloud.bigquery.connection.v1.CloudSqlProperties.DatabaseType getType();

  /**
   *
   *
   * <pre>
   * Input only. Cloud SQL credential.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.CloudSqlCredential credential = 4 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return Whether the credential field is set.
   */
  boolean hasCredential();
  /**
   *
   *
   * <pre>
   * Input only. Cloud SQL credential.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.CloudSqlCredential credential = 4 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The credential.
   */
  com.google.cloud.bigquery.connection.v1.CloudSqlCredential getCredential();
  /**
   *
   *
   * <pre>
   * Input only. Cloud SQL credential.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.CloudSqlCredential credential = 4 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  com.google.cloud.bigquery.connection.v1.CloudSqlCredentialOrBuilder getCredentialOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The account ID of the service used for the purpose of this
   * connection.
   *
   * When the connection is used in the context of an operation in
   * BigQuery, this service account will serve as the identity being used for
   * connecting to the CloudSQL instance specified in this connection.
   * </pre>
   *
   * <code>string service_account_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAccountId.
   */
  java.lang.String getServiceAccountId();
  /**
   *
   *
   * <pre>
   * Output only. The account ID of the service used for the purpose of this
   * connection.
   *
   * When the connection is used in the context of an operation in
   * BigQuery, this service account will serve as the identity being used for
   * connecting to the CloudSQL instance specified in this connection.
   * </pre>
   *
   * <code>string service_account_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAccountId.
   */
  com.google.protobuf.ByteString getServiceAccountIdBytes();
}
