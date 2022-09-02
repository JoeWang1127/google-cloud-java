/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

public interface EventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the event, in the form of:
   * `projects/{project}/locations/{location}/channels/{channelId}/events/{eventId}`.
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
   * The resource name of the event, in the form of:
   * `projects/{project}/locations/{location}/channels/{channelId}/events/{eventId}`.
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
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Inserts a new ad opportunity.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Event.AdBreakTask ad_break = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the adBreak field is set.
   */
  boolean hasAdBreak();
  /**
   *
   *
   * <pre>
   * Required. Inserts a new ad opportunity.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Event.AdBreakTask ad_break = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The adBreak.
   */
  com.google.cloud.video.livestream.v1.Event.AdBreakTask getAdBreak();
  /**
   *
   *
   * <pre>
   * Required. Inserts a new ad opportunity.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Event.AdBreakTask ad_break = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.video.livestream.v1.Event.AdBreakTaskOrBuilder getAdBreakOrBuilder();

  /**
   *
   *
   * <pre>
   * When this field is set to true, the event will be executed at the earliest
   * time that the server can schedule the event and [execution_time][google.cloud.video.livestream.v1.Event.execution_time] will be
   * populated with the time that the server actually schedules the event.
   * </pre>
   *
   * <code>bool execute_now = 9;</code>
   *
   * @return The executeNow.
   */
  boolean getExecuteNow();

  /**
   *
   *
   * <pre>
   * The time when the event should be executed. When [execute_now][google.cloud.video.livestream.v1.Event.execute_now] is set to
   * `true`, this field should not be set in `CreateEvent` request and will be
   * populated with the time that the server schedules the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_time = 10;</code>
   *
   * @return Whether the executionTime field is set.
   */
  boolean hasExecutionTime();
  /**
   *
   *
   * <pre>
   * The time when the event should be executed. When [execute_now][google.cloud.video.livestream.v1.Event.execute_now] is set to
   * `true`, this field should not be set in `CreateEvent` request and will be
   * populated with the time that the server schedules the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_time = 10;</code>
   *
   * @return The executionTime.
   */
  com.google.protobuf.Timestamp getExecutionTime();
  /**
   *
   *
   * <pre>
   * The time when the event should be executed. When [execute_now][google.cloud.video.livestream.v1.Event.execute_now] is set to
   * `true`, this field should not be set in `CreateEvent` request and will be
   * populated with the time that the server schedules the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExecutionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Event.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the event.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Event.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.video.livestream.v1.Event.State getState();

  /**
   *
   *
   * <pre>
   * Output only. An error object that describes the reason for the failure.
   * This property is always present when `state` is `FAILED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. An error object that describes the reason for the failure.
   * This property is always present when `state` is `FAILED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. An error object that describes the reason for the failure.
   * This property is always present when `state` is `FAILED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  public com.google.cloud.video.livestream.v1.Event.TaskCase getTaskCase();
}