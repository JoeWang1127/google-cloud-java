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
// source: google/cloud/bigquery/migration/v2/translation_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.migration.v2;

public interface NameMappingKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.NameMappingKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of object that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingKey.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of object that is being mapped.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NameMappingKey.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.bigquery.migration.v2.NameMappingKey.Type getType();

  /**
   *
   *
   * <pre>
   * The database name (BigQuery project ID equivalent in the source data
   * warehouse).
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
   * The database name (BigQuery project ID equivalent in the source data
   * warehouse).
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
   * The schema name (BigQuery dataset equivalent in the source data warehouse).
   * </pre>
   *
   * <code>string schema = 3;</code>
   *
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   *
   *
   * <pre>
   * The schema name (BigQuery dataset equivalent in the source data warehouse).
   * </pre>
   *
   * <code>string schema = 3;</code>
   *
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString getSchemaBytes();

  /**
   *
   *
   * <pre>
   * The relation name (BigQuery table or view equivalent in the source data
   * warehouse).
   * </pre>
   *
   * <code>string relation = 4;</code>
   *
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   *
   *
   * <pre>
   * The relation name (BigQuery table or view equivalent in the source data
   * warehouse).
   * </pre>
   *
   * <code>string relation = 4;</code>
   *
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString getRelationBytes();

  /**
   *
   *
   * <pre>
   * The attribute name (BigQuery column equivalent in the source data
   * warehouse).
   * </pre>
   *
   * <code>string attribute = 5;</code>
   *
   * @return The attribute.
   */
  java.lang.String getAttribute();
  /**
   *
   *
   * <pre>
   * The attribute name (BigQuery column equivalent in the source data
   * warehouse).
   * </pre>
   *
   * <code>string attribute = 5;</code>
   *
   * @return The bytes for attribute.
   */
  com.google.protobuf.ByteString getAttributeBytes();
}
