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
// source: google/cloud/domains/v1/domains.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.domains.v1;

public interface SearchDomainsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1.SearchDomainsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. String used to search for available domain names.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. String used to search for available domain names.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Required. The location. Must be in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}
