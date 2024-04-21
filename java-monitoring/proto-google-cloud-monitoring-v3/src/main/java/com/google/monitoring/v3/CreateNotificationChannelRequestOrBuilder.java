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

public interface CreateNotificationChannelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateNotificationChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) on which
   * to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
   *
   * This names the container into which the channel will be
   * written, this does not name the newly created channel. The resulting
   * channel's name will have a normalized version of this field as a prefix,
   * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
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
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) on which
   * to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
   *
   * This names the container into which the channel will be
   * written, this does not name the newly created channel. The resulting
   * channel's name will have a normalized version of this field as a prefix,
   * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
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
   * Required. The definition of the `NotificationChannel` to create.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the notificationChannel field is set.
   */
  boolean hasNotificationChannel();
  /**
   *
   *
   * <pre>
   * Required. The definition of the `NotificationChannel` to create.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The notificationChannel.
   */
  com.google.monitoring.v3.NotificationChannel getNotificationChannel();
  /**
   *
   *
   * <pre>
   * Required. The definition of the `NotificationChannel` to create.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder();
}
