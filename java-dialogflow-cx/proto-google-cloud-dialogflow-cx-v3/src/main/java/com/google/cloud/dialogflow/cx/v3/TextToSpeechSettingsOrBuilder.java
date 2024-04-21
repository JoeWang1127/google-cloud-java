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
// source: google/cloud/dialogflow/cx/v3/audio_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3;

public interface TextToSpeechSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.TextToSpeechSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration of how speech should be synthesized, mapping from language
   * (https://cloud.google.com/dialogflow/cx/docs/reference/language) to
   * SynthesizeSpeechConfig.
   *
   * These settings affect:
   *
   *  - The [phone
   *  gateway](https://cloud.google.com/dialogflow/cx/docs/concept/integration/phone-gateway)
   *    synthesize configuration set via
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings].
   *
   *  - How speech is synthesized when invoking
   *  [session][google.cloud.dialogflow.cx.v3.Sessions] APIs.
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings]
   *    only applies if
   *    [OutputAudioConfig.synthesize_speech_config][google.cloud.dialogflow.cx.v3.OutputAudioConfig.synthesize_speech_config]
   *    is not specified.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 1;
   * </code>
   */
  int getSynthesizeSpeechConfigsCount();
  /**
   *
   *
   * <pre>
   * Configuration of how speech should be synthesized, mapping from language
   * (https://cloud.google.com/dialogflow/cx/docs/reference/language) to
   * SynthesizeSpeechConfig.
   *
   * These settings affect:
   *
   *  - The [phone
   *  gateway](https://cloud.google.com/dialogflow/cx/docs/concept/integration/phone-gateway)
   *    synthesize configuration set via
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings].
   *
   *  - How speech is synthesized when invoking
   *  [session][google.cloud.dialogflow.cx.v3.Sessions] APIs.
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings]
   *    only applies if
   *    [OutputAudioConfig.synthesize_speech_config][google.cloud.dialogflow.cx.v3.OutputAudioConfig.synthesize_speech_config]
   *    is not specified.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 1;
   * </code>
   */
  boolean containsSynthesizeSpeechConfigs(java.lang.String key);
  /** Use {@link #getSynthesizeSpeechConfigsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig>
      getSynthesizeSpeechConfigs();
  /**
   *
   *
   * <pre>
   * Configuration of how speech should be synthesized, mapping from language
   * (https://cloud.google.com/dialogflow/cx/docs/reference/language) to
   * SynthesizeSpeechConfig.
   *
   * These settings affect:
   *
   *  - The [phone
   *  gateway](https://cloud.google.com/dialogflow/cx/docs/concept/integration/phone-gateway)
   *    synthesize configuration set via
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings].
   *
   *  - How speech is synthesized when invoking
   *  [session][google.cloud.dialogflow.cx.v3.Sessions] APIs.
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings]
   *    only applies if
   *    [OutputAudioConfig.synthesize_speech_config][google.cloud.dialogflow.cx.v3.OutputAudioConfig.synthesize_speech_config]
   *    is not specified.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 1;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig>
      getSynthesizeSpeechConfigsMap();
  /**
   *
   *
   * <pre>
   * Configuration of how speech should be synthesized, mapping from language
   * (https://cloud.google.com/dialogflow/cx/docs/reference/language) to
   * SynthesizeSpeechConfig.
   *
   * These settings affect:
   *
   *  - The [phone
   *  gateway](https://cloud.google.com/dialogflow/cx/docs/concept/integration/phone-gateway)
   *    synthesize configuration set via
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings].
   *
   *  - How speech is synthesized when invoking
   *  [session][google.cloud.dialogflow.cx.v3.Sessions] APIs.
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings]
   *    only applies if
   *    [OutputAudioConfig.synthesize_speech_config][google.cloud.dialogflow.cx.v3.OutputAudioConfig.synthesize_speech_config]
   *    is not specified.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 1;
   * </code>
   */
  /* nullable */
  com.google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig getSynthesizeSpeechConfigsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig defaultValue);
  /**
   *
   *
   * <pre>
   * Configuration of how speech should be synthesized, mapping from language
   * (https://cloud.google.com/dialogflow/cx/docs/reference/language) to
   * SynthesizeSpeechConfig.
   *
   * These settings affect:
   *
   *  - The [phone
   *  gateway](https://cloud.google.com/dialogflow/cx/docs/concept/integration/phone-gateway)
   *    synthesize configuration set via
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings].
   *
   *  - How speech is synthesized when invoking
   *  [session][google.cloud.dialogflow.cx.v3.Sessions] APIs.
   *    [Agent.text_to_speech_settings][google.cloud.dialogflow.cx.v3.Agent.text_to_speech_settings]
   *    only applies if
   *    [OutputAudioConfig.synthesize_speech_config][google.cloud.dialogflow.cx.v3.OutputAudioConfig.synthesize_speech_config]
   *    is not specified.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 1;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.SynthesizeSpeechConfig getSynthesizeSpeechConfigsOrThrow(
      java.lang.String key);
}
