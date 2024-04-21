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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface ResourcePolicyWeeklyCycleDayOfWeekOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
   * Check the Day enum for the list of possible values.
   * </pre>
   *
   * <code>optional string day = 99228;</code>
   *
   * @return Whether the day field is set.
   */
  boolean hasDay();
  /**
   *
   *
   * <pre>
   * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
   * Check the Day enum for the list of possible values.
   * </pre>
   *
   * <code>optional string day = 99228;</code>
   *
   * @return The day.
   */
  java.lang.String getDay();
  /**
   *
   *
   * <pre>
   * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
   * Check the Day enum for the list of possible values.
   * </pre>
   *
   * <code>optional string day = 99228;</code>
   *
   * @return The bytes for day.
   */
  com.google.protobuf.ByteString getDayBytes();

  /**
   *
   *
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   *
   * @return The duration.
   */
  java.lang.String getDuration();
  /**
   *
   *
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   *
   * @return The bytes for duration.
   */
  com.google.protobuf.ByteString getDurationBytes();

  /**
   *
   *
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   *
   *
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString getStartTimeBytes();
}
