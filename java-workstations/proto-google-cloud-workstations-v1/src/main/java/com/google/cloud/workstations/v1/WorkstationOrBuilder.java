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
// source: google/cloud/workstations/v1/workstations.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.workstations.v1;

public interface WorkstationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1.Workstation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full name of this workstation.
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
   * Full name of this workstation.
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
   * Optional. Human-readable name for this workstation.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. Human-readable name for this workstation.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identifier for this workstation.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. A system-assigned unique identifier for this workstation.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this workstation is currently being updated
   * to match its intended state.
   * </pre>
   *
   * <code>bool reconciling = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Client-specified annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation and that are also propagated to the
   * underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation and that are also propagated to the
   * underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation and that are also propagated to the
   * underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation and that are also propagated to the
   * underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional.
   * [Labels](https://cloud.google.com/workstations/docs/label-resources) that
   * are applied to the workstation and that are also propagated to the
   * underlying Compute Engine resources.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation was created.
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
   * Output only. Time when this workstation was created.
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
   * Output only. Time when this workstation was created.
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
   * Output only. Time when this workstation was most recently updated.
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
   * Output only. Time when this workstation was most recently updated.
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
   * Output only. Time when this workstation was most recently updated.
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
   * Output only. Time when this workstation was most recently successfully
   * started, regardless of the workstation's initial state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation was most recently successfully
   * started, regardless of the workstation's initial state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation was most recently successfully
   * started, regardless of the workstation's initial state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this workstation was soft-deleted.
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
   * Output only. Time when this workstation was soft-deleted.
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
   * Output only. Time when this workstation was soft-deleted.
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
   * Optional. Checksum computed by the server. May be sent on update and delete
   * requests to make sure that the client has an up-to-date value before
   * proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Checksum computed by the server. May be sent on update and delete
   * requests to make sure that the client has an up-to-date value before
   * proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the workstation.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.Workstation.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the workstation.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.Workstation.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.workstations.v1.Workstation.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Host to which clients can send HTTPS traffic that will be
   * received by the workstation. Authorized traffic will be received to the
   * workstation as HTTP on port 80. To send traffic to a different port,
   * clients may prefix the host with the destination port in the format
   * `{port}-{host}`.
   * </pre>
   *
   * <code>string host = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Output only. Host to which clients can send HTTPS traffic that will be
   * received by the workstation. Authorized traffic will be received to the
   * workstation as HTTP on port 80. To send traffic to a different port,
   * clients may prefix the host with the destination port in the format
   * `{port}-{host}`.
   * </pre>
   *
   * <code>string host = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();
}
