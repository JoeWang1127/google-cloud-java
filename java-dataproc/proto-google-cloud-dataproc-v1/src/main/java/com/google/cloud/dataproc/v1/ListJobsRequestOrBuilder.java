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
// source: google/cloud/dataproc/v1/jobs.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface ListJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of results to return in each response.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The page token, returned by a previous call, to request the
   * next page of results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The page token, returned by a previous call, to request the
   * next page of results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, the returned jobs list includes only jobs that were
   * submitted to the named cluster.
   * </pre>
   *
   * <code>string cluster_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Optional. If set, the returned jobs list includes only jobs that were
   * submitted to the named cluster.
   * </pre>
   *
   * <code>string cluster_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies enumerated categories of jobs to list.
   * (default = match ALL jobs).
   *
   * If `filter` is provided, `jobStateMatcher` will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ListJobsRequest.JobStateMatcher job_state_matcher = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for jobStateMatcher.
   */
  int getJobStateMatcherValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies enumerated categories of jobs to list.
   * (default = match ALL jobs).
   *
   * If `filter` is provided, `jobStateMatcher` will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ListJobsRequest.JobStateMatcher job_state_matcher = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The jobStateMatcher.
   */
  com.google.cloud.dataproc.v1.ListJobsRequest.JobStateMatcher getJobStateMatcher();

  /**
   *
   *
   * <pre>
   * Optional. A filter constraining the jobs to list. Filters are
   * case-sensitive and have the following syntax:
   *
   * [field = value] AND [field [= value]] ...
   *
   * where **field** is `status.state` or `labels.[KEY]`, and `[KEY]` is a label
   * key. **value** can be `*` to match all values.
   * `status.state` can be either `ACTIVE` or `NON_ACTIVE`.
   * Only the logical `AND` operator is supported; space-separated items are
   * treated as having an implicit `AND` operator.
   *
   * Example filter:
   *
   * status.state = ACTIVE AND labels.env = staging AND labels.starred = *
   * </pre>
   *
   * <code>string filter = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter constraining the jobs to list. Filters are
   * case-sensitive and have the following syntax:
   *
   * [field = value] AND [field [= value]] ...
   *
   * where **field** is `status.state` or `labels.[KEY]`, and `[KEY]` is a label
   * key. **value** can be `*` to match all values.
   * `status.state` can be either `ACTIVE` or `NON_ACTIVE`.
   * Only the logical `AND` operator is supported; space-separated items are
   * treated as having an implicit `AND` operator.
   *
   * Example filter:
   *
   * status.state = ACTIVE AND labels.env = staging AND labels.starred = *
   * </pre>
   *
   * <code>string filter = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
