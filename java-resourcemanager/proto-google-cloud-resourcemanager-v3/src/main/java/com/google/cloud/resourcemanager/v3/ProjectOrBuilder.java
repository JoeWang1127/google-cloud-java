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
// source: google/cloud/resourcemanager/v3/projects.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

public interface ProjectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique resource name of the project. It is an int64
   * generated number prefixed by "projects/".
   *
   * Example: `projects/415104041262`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The unique resource name of the project. It is an int64
   * generated number prefixed by "projects/".
   *
   * Example: `projects/415104041262`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A reference to a parent Resource. eg., `organizations/123` or
   * `folders/876`.
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Optional. A reference to a parent Resource. eg., `organizations/123` or
   * `folders/876`.
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The unique, user-assigned id of the project.
   * It must be 6 to 30 lowercase ASCII letters, digits, or hyphens.
   * It must start with a letter.
   * Trailing hyphens are prohibited.
   *
   * Example: `tokyo-rain-123`
   * </pre>
   *
   * <code>string project_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Immutable. The unique, user-assigned id of the project.
   * It must be 6 to 30 lowercase ASCII letters, digits, or hyphens.
   * It must start with a letter.
   * Trailing hyphens are prohibited.
   *
   * Example: `tokyo-rain-123`
   * </pre>
   *
   * <code>string project_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The project lifecycle state.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Project.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The project lifecycle state.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Project.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.resourcemanager.v3.Project.State getState();

  /**
   *
   *
   * <pre>
   * Optional. A user-assigned display name of the project.
   * When present it must be between 4 to 30 characters.
   * Allowed characters are: lowercase and uppercase letters, numbers,
   * hyphen, single-quote, double-quote, space, and exclamation point.
   *
   * Example: `My Project`
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. A user-assigned display name of the project.
   * When present it must be between 4 to 30 characters.
   * Allowed characters are: lowercase and uppercase letters, numbers,
   * hyphen, single-quote, double-quote, space, and exclamation point.
   *
   * Example: `My Project`
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The most recent time this resource was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time this resource was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time this resource was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A checksum computed by the server based on the current value
   * of the Project resource. This may be sent on update and delete requests to
   * ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. A checksum computed by the server based on the current value
   * of the Project resource. This may be sent on update and delete requests to
   * ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels associated with this project.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   *
   * No more than 64 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not
   * depend on specific characters being disallowed.
   *
   * Example: `"myBusinessDimension" : "businessValue"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels associated with this project.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   *
   * No more than 64 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not
   * depend on specific characters being disallowed.
   *
   * Example: `"myBusinessDimension" : "businessValue"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels associated with this project.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   *
   * No more than 64 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not
   * depend on specific characters being disallowed.
   *
   * Example: `"myBusinessDimension" : "businessValue"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels associated with this project.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   *
   * No more than 64 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not
   * depend on specific characters being disallowed.
   *
   * Example: `"myBusinessDimension" : "businessValue"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels associated with this project.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   *
   * No more than 64 labels can be associated with a given resource.
   *
   * Clients should store labels in a representation such as JSON that does not
   * depend on specific characters being disallowed.
   *
   * Example: `"myBusinessDimension" : "businessValue"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
