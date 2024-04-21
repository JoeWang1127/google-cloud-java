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
// source: google/cloud/alloydb/connectors/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.alloydb.connectors.v1;

public interface MetadataExchangeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.connectors.v1.MetadataExchangeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Response code.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for responseCode.
   */
  int getResponseCodeValue();
  /**
   *
   *
   * <pre>
   * Response code.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode response_code = 1;
   * </code>
   *
   * @return The responseCode.
   */
  com.google.cloud.alloydb.connectors.v1.MetadataExchangeResponse.ResponseCode getResponseCode();

  /**
   *
   *
   * <pre>
   * Optional. Error message.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The error.
   */
  java.lang.String getError();
  /**
   *
   *
   * <pre>
   * Optional. Error message.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString getErrorBytes();
}
