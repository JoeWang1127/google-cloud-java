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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v1;

public interface DeleteWorkerPoolOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the `WorkerPool` being deleted.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * </pre>
   *
   * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();
  /**
   *
   *
   * <pre>
   * The resource name of the `WorkerPool` being deleted.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * </pre>
   *
   * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Time the operation was created.
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
   * Time the operation was created.
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
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   *
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   *
   *
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   *
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   *
   *
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();
}
