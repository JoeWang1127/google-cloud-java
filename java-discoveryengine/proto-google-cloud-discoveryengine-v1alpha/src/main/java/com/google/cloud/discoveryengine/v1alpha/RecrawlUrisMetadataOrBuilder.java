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
// source: google/cloud/discoveryengine/v1alpha/site_search_engine_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public interface RecrawlUrisMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.RecrawlUrisMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Operation create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Operation create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Operation create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Operation last update time. If the operation is done, this is also the
   * finish time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Operation last update time. If the operation is done, this is also the
   * finish time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Operation last update time. If the operation is done, this is also the
   * finish time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Unique URIs in the request that don't match any TargetSite in the
   * DataStore, only match TargetSites that haven't been fully indexed, or match
   * a TargetSite with type EXCLUDE.
   * </pre>
   *
   * <code>repeated string invalid_uris = 3;</code>
   *
   * @return A list containing the invalidUris.
   */
  java.util.List<java.lang.String> getInvalidUrisList();
  /**
   *
   *
   * <pre>
   * Unique URIs in the request that don't match any TargetSite in the
   * DataStore, only match TargetSites that haven't been fully indexed, or match
   * a TargetSite with type EXCLUDE.
   * </pre>
   *
   * <code>repeated string invalid_uris = 3;</code>
   *
   * @return The count of invalidUris.
   */
  int getInvalidUrisCount();
  /**
   *
   *
   * <pre>
   * Unique URIs in the request that don't match any TargetSite in the
   * DataStore, only match TargetSites that haven't been fully indexed, or match
   * a TargetSite with type EXCLUDE.
   * </pre>
   *
   * <code>repeated string invalid_uris = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The invalidUris at the given index.
   */
  java.lang.String getInvalidUris(int index);
  /**
   *
   *
   * <pre>
   * Unique URIs in the request that don't match any TargetSite in the
   * DataStore, only match TargetSites that haven't been fully indexed, or match
   * a TargetSite with type EXCLUDE.
   * </pre>
   *
   * <code>repeated string invalid_uris = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the invalidUris at the given index.
   */
  com.google.protobuf.ByteString getInvalidUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Total number of unique URIs in the request that are not in invalid_uris.
   * </pre>
   *
   * <code>int32 valid_uris_count = 4;</code>
   *
   * @return The validUrisCount.
   */
  int getValidUrisCount();

  /**
   *
   *
   * <pre>
   * Total number of URIs that have been crawled so far.
   * </pre>
   *
   * <code>int32 success_count = 5;</code>
   *
   * @return The successCount.
   */
  int getSuccessCount();

  /**
   *
   *
   * <pre>
   * Total number of URIs that have yet to be crawled.
   * </pre>
   *
   * <code>int32 pending_count = 6;</code>
   *
   * @return The pendingCount.
   */
  int getPendingCount();

  /**
   *
   *
   * <pre>
   * Total number of URIs that were rejected due to insufficient indexing
   * resources.
   * </pre>
   *
   * <code>int32 quota_exceeded_count = 7;</code>
   *
   * @return The quotaExceededCount.
   */
  int getQuotaExceededCount();
}
