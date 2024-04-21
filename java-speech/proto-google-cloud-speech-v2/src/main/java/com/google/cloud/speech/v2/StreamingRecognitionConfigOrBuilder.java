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

public interface StreamingRecognitionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.StreamingRecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Features and audio metadata to use for the Automatic Speech
   * Recognition. This field in combination with the
   * [config_mask][google.cloud.speech.v2.StreamingRecognitionConfig.config_mask]
   * field can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. Features and audio metadata to use for the Automatic Speech
   * Recognition. This field in combination with the
   * [config_mask][google.cloud.speech.v2.StreamingRecognitionConfig.config_mask]
   * field can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.speech.v2.RecognitionConfig getConfig();
  /**
   *
   *
   * <pre>
   * Required. Features and audio metadata to use for the Automatic Speech
   * Recognition. This field in combination with the
   * [config_mask][google.cloud.speech.v2.StreamingRecognitionConfig.config_mask]
   * field can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.speech.v2.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config] that
   * override the values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all non-default valued fields in
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config] override
   * the values in the Recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * Recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config]
   * completely overrides and replaces the config in the recognizer for this
   * recognition request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 3;</code>
   *
   * @return Whether the configMask field is set.
   */
  boolean hasConfigMask();
  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config] that
   * override the values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all non-default valued fields in
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config] override
   * the values in the Recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * Recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config]
   * completely overrides and replaces the config in the recognizer for this
   * recognition request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 3;</code>
   *
   * @return The configMask.
   */
  com.google.protobuf.FieldMask getConfigMask();
  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config] that
   * override the values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all non-default valued fields in
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config] override
   * the values in the Recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * Recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.StreamingRecognitionConfig.config]
   * completely overrides and replaces the config in the recognizer for this
   * recognition request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getConfigMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Speech recognition features to enable specific to streaming audio
   * recognition requests.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.StreamingRecognitionFeatures streaming_features = 2;</code>
   *
   * @return Whether the streamingFeatures field is set.
   */
  boolean hasStreamingFeatures();
  /**
   *
   *
   * <pre>
   * Speech recognition features to enable specific to streaming audio
   * recognition requests.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.StreamingRecognitionFeatures streaming_features = 2;</code>
   *
   * @return The streamingFeatures.
   */
  com.google.cloud.speech.v2.StreamingRecognitionFeatures getStreamingFeatures();
  /**
   *
   *
   * <pre>
   * Speech recognition features to enable specific to streaming audio
   * recognition requests.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.StreamingRecognitionFeatures streaming_features = 2;</code>
   */
  com.google.cloud.speech.v2.StreamingRecognitionFeaturesOrBuilder getStreamingFeaturesOrBuilder();
}
