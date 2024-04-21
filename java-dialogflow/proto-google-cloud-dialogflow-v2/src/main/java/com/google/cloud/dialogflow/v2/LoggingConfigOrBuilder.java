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
// source: google/cloud/dialogflow/v2/conversation_profile.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

public interface LoggingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.LoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether to log conversation events like
   * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
   * to Stackdriver in the conversation project as JSON format
   * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
   * </pre>
   *
   * <code>bool enable_stackdriver_logging = 3;</code>
   *
   * @return The enableStackdriverLogging.
   */
  boolean getEnableStackdriverLogging();
}
