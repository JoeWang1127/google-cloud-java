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
// source: google/cloud/redis/v1beta1/cloud_redis.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.redis.v1beta1;

public interface RescheduleMaintenanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.RescheduleMaintenanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. If reschedule type is SPECIFIC_TIME, must set up schedule_time as well.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.RescheduleMaintenanceRequest.RescheduleType reschedule_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for rescheduleType.
   */
  int getRescheduleTypeValue();
  /**
   *
   *
   * <pre>
   * Required. If reschedule type is SPECIFIC_TIME, must set up schedule_time as well.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.RescheduleMaintenanceRequest.RescheduleType reschedule_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rescheduleType.
   */
  com.google.cloud.redis.v1beta1.RescheduleMaintenanceRequest.RescheduleType getRescheduleType();

  /**
   *
   *
   * <pre>
   * Optional. Timestamp when the maintenance shall be rescheduled to if
   * reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for
   * example `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   *
   *
   * <pre>
   * Optional. Timestamp when the maintenance shall be rescheduled to if
   * reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for
   * example `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   *
   *
   * <pre>
   * Optional. Timestamp when the maintenance shall be rescheduled to if
   * reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for
   * example `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();
}
