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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2alpha1;

public interface GenerateServiceIdentityResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   *
   * @return Whether the identity field is set.
   */
  boolean hasIdentity();
  /**
   *
   *
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   *
   * @return The identity.
   */
  com.google.cloud.tpu.v2alpha1.ServiceIdentity getIdentity();
  /**
   *
   *
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder getIdentityOrBuilder();
}
