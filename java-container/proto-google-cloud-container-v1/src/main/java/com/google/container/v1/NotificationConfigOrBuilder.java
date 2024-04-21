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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

public interface NotificationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NotificationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Notification config for Pub/Sub.
   * </pre>
   *
   * <code>.google.container.v1.NotificationConfig.PubSub pubsub = 1;</code>
   *
   * @return Whether the pubsub field is set.
   */
  boolean hasPubsub();
  /**
   *
   *
   * <pre>
   * Notification config for Pub/Sub.
   * </pre>
   *
   * <code>.google.container.v1.NotificationConfig.PubSub pubsub = 1;</code>
   *
   * @return The pubsub.
   */
  com.google.container.v1.NotificationConfig.PubSub getPubsub();
  /**
   *
   *
   * <pre>
   * Notification config for Pub/Sub.
   * </pre>
   *
   * <code>.google.container.v1.NotificationConfig.PubSub pubsub = 1;</code>
   */
  com.google.container.v1.NotificationConfig.PubSubOrBuilder getPubsubOrBuilder();
}
