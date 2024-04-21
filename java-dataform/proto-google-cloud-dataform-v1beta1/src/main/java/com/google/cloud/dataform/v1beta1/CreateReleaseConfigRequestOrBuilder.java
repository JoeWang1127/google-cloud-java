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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataform.v1beta1;

public interface CreateReleaseConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.CreateReleaseConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The repository in which to create the release config. Must be in
   * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The repository in which to create the release config. Must be in
   * the format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The release config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the releaseConfig field is set.
   */
  boolean hasReleaseConfig();
  /**
   *
   *
   * <pre>
   * Required. The release config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The releaseConfig.
   */
  com.google.cloud.dataform.v1beta1.ReleaseConfig getReleaseConfig();
  /**
   *
   *
   * <pre>
   * Required. The release config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder getReleaseConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the release config, which will become the final
   * component of the release config's resource name.
   * </pre>
   *
   * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The releaseConfigId.
   */
  java.lang.String getReleaseConfigId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the release config, which will become the final
   * component of the release config's resource name.
   * </pre>
   *
   * <code>string release_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for releaseConfigId.
   */
  com.google.protobuf.ByteString getReleaseConfigIdBytes();
}
