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
// source: google/analytics/admin/v1beta/access_report.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1beta;

public interface AccessDimensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.AccessDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The API name of the dimension. See [Data Access
   * Schema](https://developers.google.com/analytics/devguides/config/admin/v1/access-api-schema)
   * for the list of dimensions supported in this API.
   *
   * Dimensions are referenced by name in `dimensionFilter` and `orderBys`.
   * </pre>
   *
   * <code>string dimension_name = 1;</code>
   *
   * @return The dimensionName.
   */
  java.lang.String getDimensionName();
  /**
   *
   *
   * <pre>
   * The API name of the dimension. See [Data Access
   * Schema](https://developers.google.com/analytics/devguides/config/admin/v1/access-api-schema)
   * for the list of dimensions supported in this API.
   *
   * Dimensions are referenced by name in `dimensionFilter` and `orderBys`.
   * </pre>
   *
   * <code>string dimension_name = 1;</code>
   *
   * @return The bytes for dimensionName.
   */
  com.google.protobuf.ByteString getDimensionNameBytes();
}
