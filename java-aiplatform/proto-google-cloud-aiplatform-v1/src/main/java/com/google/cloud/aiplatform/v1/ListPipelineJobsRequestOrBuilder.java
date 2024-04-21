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
// source: google/cloud/aiplatform/v1/pipeline_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface ListPipelineJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListPipelineJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to list the PipelineJobs from.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to list the PipelineJobs from.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Lists the PipelineJobs that match the filter expression. The following
   * fields are supported:
   *
   * * `pipeline_name`: Supports `=` and `!=` comparisons.
   * * `display_name`: Supports `=`, `!=` comparisons, and `:` wildcard.
   * * `pipeline_job_user_id`: Supports `=`, `!=` comparisons, and `:` wildcard.
   *   for example, can check if pipeline's display_name contains *step* by
   *   doing display_name:&#92;"*step*&#92;"
   * * `state`: Supports `=` and `!=` comparisons.
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *   Values must be in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *   Values must be in RFC 3339 format.
   * * `end_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *   Values must be in RFC 3339 format.
   * * `labels`: Supports key-value equality and key presence.
   * * `template_uri`: Supports `=`, `!=` comparisons, and `:` wildcard.
   * * `template_metadata.version`: Supports `=`, `!=` comparisons, and `:`
   *   wildcard.
   *
   * Filter expressions can be combined together using logical operators
   * (`AND` &amp; `OR`).
   * For example: `pipeline_name="test" AND create_time&gt;"2020-05-18T13:30:00Z"`.
   *
   * The syntax to define filter expression is based on
   * https://google.aip.dev/160.
   *
   * Examples:
   *
   * * `create_time&gt;"2021-05-18T00:00:00Z" OR
   *   update_time&gt;"2020-05-18T00:00:00Z"` PipelineJobs created or updated
   *   after 2020-05-18 00:00:00 UTC.
   * * `labels.env = "prod"`
   *   PipelineJobs with label "env" set to "prod".
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Lists the PipelineJobs that match the filter expression. The following
   * fields are supported:
   *
   * * `pipeline_name`: Supports `=` and `!=` comparisons.
   * * `display_name`: Supports `=`, `!=` comparisons, and `:` wildcard.
   * * `pipeline_job_user_id`: Supports `=`, `!=` comparisons, and `:` wildcard.
   *   for example, can check if pipeline's display_name contains *step* by
   *   doing display_name:&#92;"*step*&#92;"
   * * `state`: Supports `=` and `!=` comparisons.
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *   Values must be in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *   Values must be in RFC 3339 format.
   * * `end_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *   Values must be in RFC 3339 format.
   * * `labels`: Supports key-value equality and key presence.
   * * `template_uri`: Supports `=`, `!=` comparisons, and `:` wildcard.
   * * `template_metadata.version`: Supports `=`, `!=` comparisons, and `:`
   *   wildcard.
   *
   * Filter expressions can be combined together using logical operators
   * (`AND` &amp; `OR`).
   * For example: `pipeline_name="test" AND create_time&gt;"2020-05-18T13:30:00Z"`.
   *
   * The syntax to define filter expression is based on
   * https://google.aip.dev/160.
   *
   * Examples:
   *
   * * `create_time&gt;"2021-05-18T00:00:00Z" OR
   *   update_time&gt;"2020-05-18T00:00:00Z"` PipelineJobs created or updated
   *   after 2020-05-18 00:00:00 UTC.
   * * `labels.env = "prod"`
   *   PipelineJobs with label "env" set to "prod".
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListPipelineJobsResponse.next_page_token][google.cloud.aiplatform.v1.ListPipelineJobsResponse.next_page_token]
   * of the previous
   * [PipelineService.ListPipelineJobs][google.cloud.aiplatform.v1.PipelineService.ListPipelineJobs]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListPipelineJobsResponse.next_page_token][google.cloud.aiplatform.v1.ListPipelineJobsResponse.next_page_token]
   * of the previous
   * [PipelineService.ListPipelineJobs][google.cloud.aiplatform.v1.PipelineService.ListPipelineJobs]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by. The default sort order is in
   * ascending order. Use "desc" after a field name for descending. You can have
   * multiple order_by fields provided e.g. "create_time desc, end_time",
   * "end_time, start_time, update_time" For example, using "create_time desc,
   * end_time" will order results by create time in descending order, and if
   * there are multiple jobs having the same create time, order them by the end
   * time in ascending order. if order_by is not specified, it will order by
   * default order is create time in descending order. Supported fields:
   *
   *   * `create_time`
   *   * `update_time`
   *   * `end_time`
   *   * `start_time`
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by. The default sort order is in
   * ascending order. Use "desc" after a field name for descending. You can have
   * multiple order_by fields provided e.g. "create_time desc, end_time",
   * "end_time, start_time, update_time" For example, using "create_time desc,
   * end_time" will order results by create time in descending order, and if
   * there are multiple jobs having the same create time, order them by the end
   * time in ascending order. if order_by is not specified, it will order by
   * default order is create time in descending order. Supported fields:
   *
   *   * `create_time`
   *   * `update_time`
   *   * `end_time`
   *   * `start_time`
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 7;</code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 7;</code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 7;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
