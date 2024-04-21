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

public interface ResourcePolicyInstanceSchedulePolicyScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the frequency for the operation, using the unix-cron format.
   * </pre>
   *
   * <code>optional string schedule = 375820951;</code>
   *
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   *
   *
   * <pre>
   * Specifies the frequency for the operation, using the unix-cron format.
   * </pre>
   *
   * <code>optional string schedule = 375820951;</code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Specifies the frequency for the operation, using the unix-cron format.
   * </pre>
   *
   * <code>optional string schedule = 375820951;</code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();
}
