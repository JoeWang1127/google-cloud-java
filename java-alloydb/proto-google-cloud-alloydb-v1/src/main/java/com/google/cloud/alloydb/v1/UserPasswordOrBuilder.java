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
// source: google/cloud/alloydb/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.alloydb.v1;

public interface UserPasswordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1.UserPassword)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The database username.
   * </pre>
   *
   * <code>string user = 1;</code>
   *
   * @return The user.
   */
  java.lang.String getUser();
  /**
   *
   *
   * <pre>
   * The database username.
   * </pre>
   *
   * <code>string user = 1;</code>
   *
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString getUserBytes();

  /**
   *
   *
   * <pre>
   * The initial password for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * The initial password for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();
}
