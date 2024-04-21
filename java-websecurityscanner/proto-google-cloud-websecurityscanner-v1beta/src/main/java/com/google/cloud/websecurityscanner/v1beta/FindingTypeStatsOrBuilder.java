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
// source: google/cloud/websecurityscanner/v1beta/finding_type_stats.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1beta;

public interface FindingTypeStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.FindingTypeStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>string finding_type = 1;</code>
   *
   * @return The findingType.
   */
  java.lang.String getFindingType();
  /**
   *
   *
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>string finding_type = 1;</code>
   *
   * @return The bytes for findingType.
   */
  com.google.protobuf.ByteString getFindingTypeBytes();

  /**
   *
   *
   * <pre>
   * The count of findings belonging to this finding type.
   * </pre>
   *
   * <code>int32 finding_count = 2;</code>
   *
   * @return The findingCount.
   */
  int getFindingCount();
}
