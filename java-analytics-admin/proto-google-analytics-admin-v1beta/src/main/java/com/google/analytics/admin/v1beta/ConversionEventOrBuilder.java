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
// source: google/analytics/admin/v1beta/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1beta;

public interface ConversionEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.ConversionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this conversion event.
   * Format: properties/{property}/conversionEvents/{conversion_event}
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
   * Output only. Resource name of this conversion event.
   * Format: properties/{property}/conversionEvents/{conversion_event}
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
   * Immutable. The event name for this conversion event.
   * Examples: 'click', 'purchase'
   * </pre>
   *
   * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The eventName.
   */
  java.lang.String getEventName();
  /**
   *
   *
   * <pre>
   * Immutable. The event name for this conversion event.
   * Examples: 'click', 'purchase'
   * </pre>
   *
   * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for eventName.
   */
  com.google.protobuf.ByteString getEventNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this conversion event was created in the property.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this conversion event was created in the property.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this conversion event was created in the property.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. If set, this event can currently be deleted with
   * DeleteConversionEvent.
   * </pre>
   *
   * <code>bool deletable = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deletable.
   */
  boolean getDeletable();

  /**
   *
   *
   * <pre>
   * Output only. If set to true, this conversion event refers to a custom
   * event.  If set to false, this conversion event refers to a default event in
   * GA. Default events typically have special meaning in GA. Default events are
   * usually created for you by the GA system, but in some cases can be created
   * by property admins. Custom events count towards the maximum number of
   * custom conversion events that may be created per property.
   * </pre>
   *
   * <code>bool custom = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The custom.
   */
  boolean getCustom();

  /**
   *
   *
   * <pre>
   * Optional. The method by which conversions will be counted across multiple
   * events within a session. If this value is not provided, it will be set to
   * `ONCE_PER_EVENT`.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ConversionEvent.ConversionCountingMethod counting_method = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for countingMethod.
   */
  int getCountingMethodValue();
  /**
   *
   *
   * <pre>
   * Optional. The method by which conversions will be counted across multiple
   * events within a session. If this value is not provided, it will be set to
   * `ONCE_PER_EVENT`.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ConversionEvent.ConversionCountingMethod counting_method = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The countingMethod.
   */
  com.google.analytics.admin.v1beta.ConversionEvent.ConversionCountingMethod getCountingMethod();
}
