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
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v2;

public interface FetchReadTokenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.FetchReadTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the repository in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The repository.
   */
  java.lang.String getRepository();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the repository in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>
   * string repository = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString getRepositoryBytes();
}
