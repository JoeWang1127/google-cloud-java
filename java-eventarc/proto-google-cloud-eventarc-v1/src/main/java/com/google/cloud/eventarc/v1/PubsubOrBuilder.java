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
// source: google/cloud/eventarc/v1/trigger.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.eventarc.v1;

public interface PubsubOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Pubsub)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc as
   * a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`.
   *
   * You can set an existing topic for triggers of the type
   * `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide
   * here is not deleted by Eventarc at trigger deletion.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc as
   * a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`.
   *
   * You can set an existing topic for triggers of the type
   * `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide
   * here is not deleted by Eventarc at trigger deletion.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc
   * as a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * </pre>
   *
   * <code>string subscription = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc
   * as a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * </pre>
   *
   * <code>string subscription = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();
}
