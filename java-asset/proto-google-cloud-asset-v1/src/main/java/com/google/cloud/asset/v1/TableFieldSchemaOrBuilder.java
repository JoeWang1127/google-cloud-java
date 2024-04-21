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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.asset.v1;

public interface TableFieldSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.TableFieldSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The field name. The name must contain only letters (a-z, A-Z),
   * numbers (0-9), or underscores (_), and must start with a letter or
   * underscore. The maximum length is 128 characters.
   * </pre>
   *
   * <code>string field = 1;</code>
   *
   * @return The field.
   */
  java.lang.String getField();
  /**
   *
   *
   * <pre>
   * The field name. The name must contain only letters (a-z, A-Z),
   * numbers (0-9), or underscores (_), and must start with a letter or
   * underscore. The maximum length is 128 characters.
   * </pre>
   *
   * <code>string field = 1;</code>
   *
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString getFieldBytes();

  /**
   *
   *
   * <pre>
   * The field data type. Possible values include
   * * STRING
   * * BYTES
   * * INTEGER
   * * FLOAT
   * * BOOLEAN
   * * TIMESTAMP
   * * DATE
   * * TIME
   * * DATETIME
   * * GEOGRAPHY,
   * * NUMERIC,
   * * BIGNUMERIC,
   * * RECORD
   * (where RECORD indicates that the field contains a nested schema).
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The field data type. Possible values include
   * * STRING
   * * BYTES
   * * INTEGER
   * * FLOAT
   * * BOOLEAN
   * * TIMESTAMP
   * * DATE
   * * TIME
   * * DATETIME
   * * GEOGRAPHY,
   * * NUMERIC,
   * * BIGNUMERIC,
   * * RECORD
   * (where RECORD indicates that the field contains a nested schema).
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The field mode. Possible values include NULLABLE, REQUIRED and
   * REPEATED. The default value is NULLABLE.
   * </pre>
   *
   * <code>string mode = 3;</code>
   *
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   *
   *
   * <pre>
   * The field mode. Possible values include NULLABLE, REQUIRED and
   * REPEATED. The default value is NULLABLE.
   * </pre>
   *
   * <code>string mode = 3;</code>
   *
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString getModeBytes();

  /**
   *
   *
   * <pre>
   * Describes the nested schema fields if the type property is set
   * to RECORD.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TableFieldSchema fields = 4;</code>
   */
  java.util.List<com.google.cloud.asset.v1.TableFieldSchema> getFieldsList();
  /**
   *
   *
   * <pre>
   * Describes the nested schema fields if the type property is set
   * to RECORD.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TableFieldSchema fields = 4;</code>
   */
  com.google.cloud.asset.v1.TableFieldSchema getFields(int index);
  /**
   *
   *
   * <pre>
   * Describes the nested schema fields if the type property is set
   * to RECORD.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TableFieldSchema fields = 4;</code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Describes the nested schema fields if the type property is set
   * to RECORD.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TableFieldSchema fields = 4;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.TableFieldSchemaOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Describes the nested schema fields if the type property is set
   * to RECORD.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TableFieldSchema fields = 4;</code>
   */
  com.google.cloud.asset.v1.TableFieldSchemaOrBuilder getFieldsOrBuilder(int index);
}
