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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.configmanagement.v1alpha;

public interface PolicyControllerVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The gatekeeper image tag that is composed of ACM version, git tag, build
   * number.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The gatekeeper image tag that is composed of ACM version, git tag, build
   * number.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
