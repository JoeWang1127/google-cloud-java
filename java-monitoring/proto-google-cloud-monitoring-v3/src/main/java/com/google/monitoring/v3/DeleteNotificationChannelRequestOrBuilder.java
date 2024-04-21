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
// source: google/monitoring/v3/notification_service.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface DeleteNotificationChannelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.DeleteNotificationChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The channel for which to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The channel for which to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If true, the notification channel will be deleted regardless of its
   * use in alert policies (the policies will be updated to remove the
   * channel). If false, channels that are still referenced by an existing
   * alerting policy will fail to be deleted in a delete operation.
   * </pre>
   *
   * <code>bool force = 5;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
