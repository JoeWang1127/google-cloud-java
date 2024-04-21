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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.3
package com.google.recaptchaenterprise.v1;

public interface AppleDeveloperIdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.AppleDeveloperId)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Input only. A private key (downloaded as a text file with a .p8
   * file extension) generated for your Apple Developer account. Ensure that
   * Apple DeviceCheck is enabled for the private key.
   * </pre>
   *
   * <code>
   * string private_key = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The privateKey.
   */
  java.lang.String getPrivateKey();
  /**
   *
   *
   * <pre>
   * Required. Input only. A private key (downloaded as a text file with a .p8
   * file extension) generated for your Apple Developer account. Ensure that
   * Apple DeviceCheck is enabled for the private key.
   * </pre>
   *
   * <code>
   * string private_key = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The bytes for privateKey.
   */
  com.google.protobuf.ByteString getPrivateKeyBytes();

  /**
   *
   *
   * <pre>
   * Required. The Apple developer key ID (10-character string).
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   *
   *
   * <pre>
   * Required. The Apple developer key ID (10-character string).
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString getKeyIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Apple team ID (10-character string) owning the provisioning
   * profile used to build your application.
   * </pre>
   *
   * <code>string team_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The teamId.
   */
  java.lang.String getTeamId();
  /**
   *
   *
   * <pre>
   * Required. The Apple team ID (10-character string) owning the provisioning
   * profile used to build your application.
   * </pre>
   *
   * <code>string team_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for teamId.
   */
  com.google.protobuf.ByteString getTeamIdBytes();
}
