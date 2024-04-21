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
// source: google/iam/credentials/v1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.iam.credentials.v1;

public interface GenerateIdTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.GenerateIdTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The OpenId Connect ID token.
   * </pre>
   *
   * <code>string token = 1;</code>
   *
   * @return The token.
   */
  java.lang.String getToken();
  /**
   *
   *
   * <pre>
   * The OpenId Connect ID token.
   * </pre>
   *
   * <code>string token = 1;</code>
   *
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString getTokenBytes();
}
