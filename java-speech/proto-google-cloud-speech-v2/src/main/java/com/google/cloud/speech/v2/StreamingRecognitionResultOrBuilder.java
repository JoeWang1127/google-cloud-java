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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.speech.v2;

public interface StreamingRecognitionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.StreamingRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses. These alternatives are
   * ordered in terms of accuracy, with the top (first) alternative being the
   * most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v2.SpeechRecognitionAlternative> getAlternativesList();
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses. These alternatives are
   * ordered in terms of accuracy, with the top (first) alternative being the
   * most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v2.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses. These alternatives are
   * ordered in terms of accuracy, with the top (first) alternative being the
   * most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses. These alternatives are
   * ordered in terms of accuracy, with the top (first) alternative being the
   * most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.SpeechRecognitionAlternativeOrBuilder>
      getAlternativesOrBuilderList();
  /**
   *
   *
   * <pre>
   * May contain one or more recognition hypotheses. These alternatives are
   * ordered in terms of accuracy, with the top (first) alternative being the
   * most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v2.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If `false`, this
   * [StreamingRecognitionResult][google.cloud.speech.v2.StreamingRecognitionResult]
   * represents an interim result that may change. If `true`, this is the final
   * time the speech service will return this particular
   * [StreamingRecognitionResult][google.cloud.speech.v2.StreamingRecognitionResult],
   * the recognizer will not return any further hypotheses for this portion of
   * the transcript and corresponding audio.
   * </pre>
   *
   * <code>bool is_final = 2;</code>
   *
   * @return The isFinal.
   */
  boolean getIsFinal();

  /**
   *
   *
   * <pre>
   * An estimate of the likelihood that the recognizer will not change its guess
   * about this interim result. Values range from 0.0 (completely unstable)
   * to 1.0 (completely stable). This field is only provided for interim results
   * ([is_final][google.cloud.speech.v2.StreamingRecognitionResult.is_final]=`false`).
   * The default of 0.0 is a sentinel value indicating `stability` was not set.
   * </pre>
   *
   * <code>float stability = 3;</code>
   *
   * @return The stability.
   */
  float getStability();

  /**
   *
   *
   * <pre>
   * Time offset of the end of this result relative to the beginning of the
   * audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration result_end_offset = 4;</code>
   *
   * @return Whether the resultEndOffset field is set.
   */
  boolean hasResultEndOffset();
  /**
   *
   *
   * <pre>
   * Time offset of the end of this result relative to the beginning of the
   * audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration result_end_offset = 4;</code>
   *
   * @return The resultEndOffset.
   */
  com.google.protobuf.Duration getResultEndOffset();
  /**
   *
   *
   * <pre>
   * Time offset of the end of this result relative to the beginning of the
   * audio.
   * </pre>
   *
   * <code>.google.protobuf.Duration result_end_offset = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getResultEndOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * For multi-channel audio, this is the channel number corresponding to the
   * recognized result for the audio from that channel.
   * For
   * `audio_channel_count` = `N`, its output values can range from `1` to `N`.
   * </pre>
   *
   * <code>int32 channel_tag = 5;</code>
   *
   * @return The channelTag.
   */
  int getChannelTag();

  /**
   *
   *
   * <pre>
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag of the language in this result. This language code was
   * detected to have the most likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag of the language in this result. This language code was
   * detected to have the most likelihood of being spoken in the audio.
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
