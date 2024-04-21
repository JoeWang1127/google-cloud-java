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
// source: google/cloud/functions/v2beta/functions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.functions.v2beta;

public interface FunctionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.Function)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the function. Function names must be unique
   * globally and match pattern `projects/&#42;&#47;locations/&#42;&#47;functions/&#42;`
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
   * A user-defined name of the function. Function names must be unique
   * globally and match pattern `projects/&#42;&#47;locations/&#42;&#47;functions/&#42;`
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
   * User-provided description of a function.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User-provided description of a function.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Describes the Build step of the function that builds a container from the
   * given source.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.BuildConfig build_config = 3;</code>
   *
   * @return Whether the buildConfig field is set.
   */
  boolean hasBuildConfig();
  /**
   *
   *
   * <pre>
   * Describes the Build step of the function that builds a container from the
   * given source.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.BuildConfig build_config = 3;</code>
   *
   * @return The buildConfig.
   */
  com.google.cloud.functions.v2beta.BuildConfig getBuildConfig();
  /**
   *
   *
   * <pre>
   * Describes the Build step of the function that builds a container from the
   * given source.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.BuildConfig build_config = 3;</code>
   */
  com.google.cloud.functions.v2beta.BuildConfigOrBuilder getBuildConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the Service being deployed. Currently deploys services to Cloud
   * Run (fully managed).
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.ServiceConfig service_config = 4;</code>
   *
   * @return Whether the serviceConfig field is set.
   */
  boolean hasServiceConfig();
  /**
   *
   *
   * <pre>
   * Describes the Service being deployed. Currently deploys services to Cloud
   * Run (fully managed).
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.ServiceConfig service_config = 4;</code>
   *
   * @return The serviceConfig.
   */
  com.google.cloud.functions.v2beta.ServiceConfig getServiceConfig();
  /**
   *
   *
   * <pre>
   * Describes the Service being deployed. Currently deploys services to Cloud
   * Run (fully managed).
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.ServiceConfig service_config = 4;</code>
   */
  com.google.cloud.functions.v2beta.ServiceConfigOrBuilder getServiceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * An Eventarc trigger managed by Google Cloud Functions that fires events in
   * response to a condition in another service.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.EventTrigger event_trigger = 5;</code>
   *
   * @return Whether the eventTrigger field is set.
   */
  boolean hasEventTrigger();
  /**
   *
   *
   * <pre>
   * An Eventarc trigger managed by Google Cloud Functions that fires events in
   * response to a condition in another service.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.EventTrigger event_trigger = 5;</code>
   *
   * @return The eventTrigger.
   */
  com.google.cloud.functions.v2beta.EventTrigger getEventTrigger();
  /**
   *
   *
   * <pre>
   * An Eventarc trigger managed by Google Cloud Functions that fires events in
   * response to a condition in another service.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.EventTrigger event_trigger = 5;</code>
   */
  com.google.cloud.functions.v2beta.EventTriggerOrBuilder getEventTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the function.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2beta.Function.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the function.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2beta.Function.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.functions.v2beta.Function.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a Cloud Function.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this Cloud Function.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.functions.v2beta.StateMessage state_messages = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.functions.v2beta.StateMessage> getStateMessagesList();
  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.functions.v2beta.StateMessage state_messages = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.functions.v2beta.StateMessage getStateMessages(int index);
  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.functions.v2beta.StateMessage state_messages = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStateMessagesCount();
  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.functions.v2beta.StateMessage state_messages = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.functions.v2beta.StateMessageOrBuilder>
      getStateMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. State Messages for this Cloud Function.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.functions.v2beta.StateMessage state_messages = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.functions.v2beta.StateMessageOrBuilder getStateMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Describe whether the function is 1st Gen or 2nd Gen.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.Environment environment = 10;</code>
   *
   * @return The enum numeric value on the wire for environment.
   */
  int getEnvironmentValue();
  /**
   *
   *
   * <pre>
   * Describe whether the function is 1st Gen or 2nd Gen.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.Environment environment = 10;</code>
   *
   * @return The environment.
   */
  com.google.cloud.functions.v2beta.Environment getEnvironment();

  /**
   *
   *
   * <pre>
   * Output only. The deployed url for the function.
   * </pre>
   *
   * <code>string url = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * Output only. The deployed url for the function.
   * </pre>
   *
   * <code>string url = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * [Preview] Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function resources.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>string kms_key_name = 25 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * [Preview] Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function resources.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>string kms_key_name = 25 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();
}
