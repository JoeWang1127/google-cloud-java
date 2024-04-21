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
// source: google/cloud/workstations/v1/workstations.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.workstations.v1;

public interface GenerateAccessTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1.GenerateAccessTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The generated bearer access token. To use this token, include it in an
   * Authorization header of an HTTP request sent to the associated
   * workstation's hostname—for example, `Authorization: Bearer
   * &lt;access_token&gt;`.
   * </pre>
   *
   * <code>string access_token = 1;</code>
   *
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   *
   *
   * <pre>
   * The generated bearer access token. To use this token, include it in an
   * Authorization header of an HTTP request sent to the associated
   * workstation's hostname—for example, `Authorization: Bearer
   * &lt;access_token&gt;`.
   * </pre>
   *
   * <code>string access_token = 1;</code>
   *
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString getAccessTokenBytes();

  /**
   *
   *
   * <pre>
   * Time at which the generated token will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Time at which the generated token will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Time at which the generated token will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();
}
