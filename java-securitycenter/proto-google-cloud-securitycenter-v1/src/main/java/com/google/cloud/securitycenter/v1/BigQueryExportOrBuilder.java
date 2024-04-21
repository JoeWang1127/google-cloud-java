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
// source: google/cloud/securitycenter/v1/bigquery_export.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public interface BigQueryExportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.BigQueryExport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this export. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name.
   * Example format:
   * "organizations/{organization_id}/bigQueryExports/{export_id}" Example
   * format: "folders/{folder_id}/bigQueryExports/{export_id}" Example format:
   * "projects/{project_id}/bigQueryExports/{export_id}"
   * This field is provided in responses, and is ignored when provided in create
   * requests.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of this export. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name.
   * Example format:
   * "organizations/{organization_id}/bigQueryExports/{export_id}" Example
   * format: "folders/{folder_id}/bigQueryExports/{export_id}" Example format:
   * "projects/{project_id}/bigQueryExports/{export_id}"
   * This field is provided in responses, and is ignored when provided in create
   * requests.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the export (max of 1024 characters).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the export (max of 1024 characters).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across create/update events
   * of findings. The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR`
   * has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a
   * `-` character in front of them to indicate negation. The fields map to
   * those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across create/update events
   * of findings. The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR`
   * has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a
   * `-` character in front of them to indicate negation. The fields map to
   * those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The dataset to write findings' updates to. Its format is
   * "projects/[project_id]/datasets/[bigquery_dataset_id]".
   * BigQuery Dataset unique ID  must contain only letters (a-z, A-Z), numbers
   * (0-9), or underscores (_).
   * </pre>
   *
   * <code>string dataset = 4;</code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * The dataset to write findings' updates to. Its format is
   * "projects/[project_id]/datasets/[bigquery_dataset_id]".
   * BigQuery Dataset unique ID  must contain only letters (a-z, A-Z), numbers
   * (0-9), or underscores (_).
   * </pre>
   *
   * <code>string dataset = 4;</code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the BigQuery export was created.
   * This field is set by the server and will be ignored if provided on export
   * on creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the BigQuery export was created.
   * This field is set by the server and will be ignored if provided on export
   * on creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the BigQuery export was created.
   * This field is set by the server and will be ignored if provided on export
   * on creation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the BigQuery export was updated.
   * This field is set by the server and will be ignored if provided on export
   * creation or update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the BigQuery export was updated.
   * This field is set by the server and will be ignored if provided on export
   * creation or update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time at which the BigQuery export was updated.
   * This field is set by the server and will be ignored if provided on export
   * creation or update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Email address of the user who last edited the BigQuery export.
   * This field is set by the server and will be ignored if provided on export
   * creation or update.
   * </pre>
   *
   * <code>string most_recent_editor = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The mostRecentEditor.
   */
  java.lang.String getMostRecentEditor();
  /**
   *
   *
   * <pre>
   * Output only. Email address of the user who last edited the BigQuery export.
   * This field is set by the server and will be ignored if provided on export
   * creation or update.
   * </pre>
   *
   * <code>string most_recent_editor = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for mostRecentEditor.
   */
  com.google.protobuf.ByteString getMostRecentEditorBytes();

  /**
   *
   *
   * <pre>
   * Output only. The service account that needs permission to create table and
   * upload data to the BigQuery dataset.
   * </pre>
   *
   * <code>string principal = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The principal.
   */
  java.lang.String getPrincipal();
  /**
   *
   *
   * <pre>
   * Output only. The service account that needs permission to create table and
   * upload data to the BigQuery dataset.
   * </pre>
   *
   * <code>string principal = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for principal.
   */
  com.google.protobuf.ByteString getPrincipalBytes();
}
