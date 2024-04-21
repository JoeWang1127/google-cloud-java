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

public interface ConversationProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ConversationProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of this conversation profile.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
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
   * The unique identifier of this conversation profile.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
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
   * Required. Human readable name for this profile. Max length 1024 bytes.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Human readable name for this profile. Max length 1024 bytes.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time of the conversation profile.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time of the conversation profile.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time of the conversation profile.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Update time of the conversation profile.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time of the conversation profile.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time of the conversation profile.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for an automated agent to use with this profile.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AutomatedAgentConfig automated_agent_config = 3;</code>
   *
   * @return Whether the automatedAgentConfig field is set.
   */
  boolean hasAutomatedAgentConfig();
  /**
   *
   *
   * <pre>
   * Configuration for an automated agent to use with this profile.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AutomatedAgentConfig automated_agent_config = 3;</code>
   *
   * @return The automatedAgentConfig.
   */
  com.google.cloud.dialogflow.v2.AutomatedAgentConfig getAutomatedAgentConfig();
  /**
   *
   *
   * <pre>
   * Configuration for an automated agent to use with this profile.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AutomatedAgentConfig automated_agent_config = 3;</code>
   */
  com.google.cloud.dialogflow.v2.AutomatedAgentConfigOrBuilder getAutomatedAgentConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for agent assistance to use with this profile.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig human_agent_assistant_config = 4;
   * </code>
   *
   * @return Whether the humanAgentAssistantConfig field is set.
   */
  boolean hasHumanAgentAssistantConfig();
  /**
   *
   *
   * <pre>
   * Configuration for agent assistance to use with this profile.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig human_agent_assistant_config = 4;
   * </code>
   *
   * @return The humanAgentAssistantConfig.
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig getHumanAgentAssistantConfig();
  /**
   *
   *
   * <pre>
   * Configuration for agent assistance to use with this profile.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig human_agent_assistant_config = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2.HumanAgentAssistantConfigOrBuilder
      getHumanAgentAssistantConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for connecting to a live agent.
   *
   * Currently, this feature is not general available, please contact Google
   * to get access.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentHandoffConfig human_agent_handoff_config = 5;
   * </code>
   *
   * @return Whether the humanAgentHandoffConfig field is set.
   */
  boolean hasHumanAgentHandoffConfig();
  /**
   *
   *
   * <pre>
   * Configuration for connecting to a live agent.
   *
   * Currently, this feature is not general available, please contact Google
   * to get access.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentHandoffConfig human_agent_handoff_config = 5;
   * </code>
   *
   * @return The humanAgentHandoffConfig.
   */
  com.google.cloud.dialogflow.v2.HumanAgentHandoffConfig getHumanAgentHandoffConfig();
  /**
   *
   *
   * <pre>
   * Configuration for connecting to a live agent.
   *
   * Currently, this feature is not general available, please contact Google
   * to get access.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentHandoffConfig human_agent_handoff_config = 5;
   * </code>
   */
  com.google.cloud.dialogflow.v2.HumanAgentHandoffConfigOrBuilder
      getHumanAgentHandoffConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for publishing conversation lifecycle events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig notification_config = 6;</code>
   *
   * @return Whether the notificationConfig field is set.
   */
  boolean hasNotificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for publishing conversation lifecycle events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig notification_config = 6;</code>
   *
   * @return The notificationConfig.
   */
  com.google.cloud.dialogflow.v2.NotificationConfig getNotificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for publishing conversation lifecycle events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig notification_config = 6;</code>
   */
  com.google.cloud.dialogflow.v2.NotificationConfigOrBuilder getNotificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for logging conversation lifecycle events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.LoggingConfig logging_config = 7;</code>
   *
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   *
   *
   * <pre>
   * Configuration for logging conversation lifecycle events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.LoggingConfig logging_config = 7;</code>
   *
   * @return The loggingConfig.
   */
  com.google.cloud.dialogflow.v2.LoggingConfig getLoggingConfig();
  /**
   *
   *
   * <pre>
   * Configuration for logging conversation lifecycle events.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.LoggingConfig logging_config = 7;</code>
   */
  com.google.cloud.dialogflow.v2.LoggingConfigOrBuilder getLoggingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for publishing new message events. Event will be sent in
   * format of [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent]
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig new_message_event_notification_config = 8;
   * </code>
   *
   * @return Whether the newMessageEventNotificationConfig field is set.
   */
  boolean hasNewMessageEventNotificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for publishing new message events. Event will be sent in
   * format of [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent]
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig new_message_event_notification_config = 8;
   * </code>
   *
   * @return The newMessageEventNotificationConfig.
   */
  com.google.cloud.dialogflow.v2.NotificationConfig getNewMessageEventNotificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for publishing new message events. Event will be sent in
   * format of [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent]
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig new_message_event_notification_config = 8;
   * </code>
   */
  com.google.cloud.dialogflow.v2.NotificationConfigOrBuilder
      getNewMessageEventNotificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings for speech transcription.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechToTextConfig stt_config = 9;</code>
   *
   * @return Whether the sttConfig field is set.
   */
  boolean hasSttConfig();
  /**
   *
   *
   * <pre>
   * Settings for speech transcription.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechToTextConfig stt_config = 9;</code>
   *
   * @return The sttConfig.
   */
  com.google.cloud.dialogflow.v2.SpeechToTextConfig getSttConfig();
  /**
   *
   *
   * <pre>
   * Settings for speech transcription.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechToTextConfig stt_config = 9;</code>
   */
  com.google.cloud.dialogflow.v2.SpeechToTextConfigOrBuilder getSttConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Language code for the conversation profile. If not specified, the language
   * is en-US. Language at ConversationProfile should be set for all non en-US
   * languages.
   * This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag. Example: "en-US".
   * </pre>
   *
   * <code>string language_code = 10;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language code for the conversation profile. If not specified, the language
   * is en-US. Language at ConversationProfile should be set for all non en-US
   * languages.
   * This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag. Example: "en-US".
   * </pre>
   *
   * <code>string language_code = 10;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The time zone of this conversational profile from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. Defaults to America/New_York.
   * </pre>
   *
   * <code>string time_zone = 14;</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * The time zone of this conversational profile from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. Defaults to America/New_York.
   * </pre>
   *
   * <code>string time_zone = 14;</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Name of the CX SecuritySettings reference for the agent.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string security_settings = 13 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The securitySettings.
   */
  java.lang.String getSecuritySettings();
  /**
   *
   *
   * <pre>
   * Name of the CX SecuritySettings reference for the agent.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string security_settings = 13 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for securitySettings.
   */
  com.google.protobuf.ByteString getSecuritySettingsBytes();

  /**
   *
   *
   * <pre>
   * Configuration for Text-to-Speech synthesization.
   *
   * Used by Phone Gateway to specify synthesization options. If agent defines
   * synthesization options as well, agent settings overrides the option here.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig tts_config = 18;</code>
   *
   * @return Whether the ttsConfig field is set.
   */
  boolean hasTtsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for Text-to-Speech synthesization.
   *
   * Used by Phone Gateway to specify synthesization options. If agent defines
   * synthesization options as well, agent settings overrides the option here.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig tts_config = 18;</code>
   *
   * @return The ttsConfig.
   */
  com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig getTtsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for Text-to-Speech synthesization.
   *
   * Used by Phone Gateway to specify synthesization options. If agent defines
   * synthesization options as well, agent settings overrides the option here.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig tts_config = 18;</code>
   */
  com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder getTtsConfigOrBuilder();
}
