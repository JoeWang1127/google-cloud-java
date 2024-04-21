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
// source: google/cloud/edgecontainer/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.edgecontainer.v1;

public interface CreateNodePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.CreateNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent cluster where this node pool will be created.
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
   * Required. The parent cluster where this node pool will be created.
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
   * Required. A client-specified unique identifier for the node pool.
   * </pre>
   *
   * <code>string node_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The nodePoolId.
   */
  java.lang.String getNodePoolId();
  /**
   *
   *
   * <pre>
   * Required. A client-specified unique identifier for the node pool.
   * </pre>
   *
   * <code>string node_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for nodePoolId.
   */
  com.google.protobuf.ByteString getNodePoolIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The node pool to create.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.NodePool node_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the nodePool field is set.
   */
  boolean hasNodePool();
  /**
   *
   *
   * <pre>
   * Required. The node pool to create.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.NodePool node_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The nodePool.
   */
  com.google.cloud.edgecontainer.v1.NodePool getNodePool();
  /**
   *
   *
   * <pre>
   * Required. The node pool to create.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.NodePool node_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.NodePoolOrBuilder getNodePoolOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters. A
   * random UUID is recommended. This request is only idempotent if
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters. A
   * random UUID is recommended. This request is only idempotent if
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
