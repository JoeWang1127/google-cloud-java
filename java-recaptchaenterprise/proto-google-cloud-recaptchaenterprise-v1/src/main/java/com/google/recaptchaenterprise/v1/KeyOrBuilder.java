/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface KeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.Key)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name for the Key in the format
   * `projects/{project}/keys/{key}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name for the Key in the format
   * `projects/{project}/keys/{key}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Human-readable display name of this key. Modifiable by user.
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
   * Required. Human-readable display name of this key. Modifiable by user.
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
   * Settings for keys that can be used by websites.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.WebKeySettings web_settings = 3;</code>
   *
   * @return Whether the webSettings field is set.
   */
  boolean hasWebSettings();
  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by websites.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.WebKeySettings web_settings = 3;</code>
   *
   * @return The webSettings.
   */
  com.google.recaptchaenterprise.v1.WebKeySettings getWebSettings();
  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by websites.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.WebKeySettings web_settings = 3;</code>
   */
  com.google.recaptchaenterprise.v1.WebKeySettingsOrBuilder getWebSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by Android apps.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.AndroidKeySettings android_settings = 4;</code>
   *
   * @return Whether the androidSettings field is set.
   */
  boolean hasAndroidSettings();
  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by Android apps.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.AndroidKeySettings android_settings = 4;</code>
   *
   * @return The androidSettings.
   */
  com.google.recaptchaenterprise.v1.AndroidKeySettings getAndroidSettings();
  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by Android apps.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.AndroidKeySettings android_settings = 4;</code>
   */
  com.google.recaptchaenterprise.v1.AndroidKeySettingsOrBuilder getAndroidSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by iOS apps.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.IOSKeySettings ios_settings = 5;</code>
   *
   * @return Whether the iosSettings field is set.
   */
  boolean hasIosSettings();
  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by iOS apps.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.IOSKeySettings ios_settings = 5;</code>
   *
   * @return The iosSettings.
   */
  com.google.recaptchaenterprise.v1.IOSKeySettings getIosSettings();
  /**
   *
   *
   * <pre>
   * Settings for keys that can be used by iOS apps.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.IOSKeySettings ios_settings = 5;</code>
   */
  com.google.recaptchaenterprise.v1.IOSKeySettingsOrBuilder getIosSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/recaptcha-enterprise/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/recaptcha-enterprise/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/recaptcha-enterprise/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/recaptcha-enterprise/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. See [Creating and managing labels]
   * (https://cloud.google.com/recaptcha-enterprise/docs/labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The timestamp corresponding to the creation of this key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp corresponding to the creation of this key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp corresponding to the creation of this key.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Options for user acceptance testing.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TestingOptions testing_options = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the testingOptions field is set.
   */
  boolean hasTestingOptions();
  /**
   *
   *
   * <pre>
   * Optional. Options for user acceptance testing.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TestingOptions testing_options = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The testingOptions.
   */
  com.google.recaptchaenterprise.v1.TestingOptions getTestingOptions();
  /**
   *
   *
   * <pre>
   * Optional. Options for user acceptance testing.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TestingOptions testing_options = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.TestingOptionsOrBuilder getTestingOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Settings for WAF
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings waf_settings = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the wafSettings field is set.
   */
  boolean hasWafSettings();
  /**
   *
   *
   * <pre>
   * Optional. Settings for WAF
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings waf_settings = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The wafSettings.
   */
  com.google.recaptchaenterprise.v1.WafSettings getWafSettings();
  /**
   *
   *
   * <pre>
   * Optional. Settings for WAF
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings waf_settings = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.WafSettingsOrBuilder getWafSettingsOrBuilder();

  com.google.recaptchaenterprise.v1.Key.PlatformSettingsCase getPlatformSettingsCase();
}
