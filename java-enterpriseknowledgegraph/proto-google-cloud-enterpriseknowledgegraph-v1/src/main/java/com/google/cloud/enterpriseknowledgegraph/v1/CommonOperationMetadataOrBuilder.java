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
// source: google/cloud/enterpriseknowledgegraph/v1/operation_metadata.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.enterpriseknowledgegraph.v1;

public interface CommonOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.CommonOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.CommonOperationMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.CommonOperationMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.enterpriseknowledgegraph.v1.CommonOperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * The creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The creation time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The last update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update time of the operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
