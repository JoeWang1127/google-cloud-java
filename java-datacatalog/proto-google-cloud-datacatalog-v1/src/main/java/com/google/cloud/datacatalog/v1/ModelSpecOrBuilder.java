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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

public interface ModelSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ModelSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specification for vertex model resources.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSpec vertex_model_spec = 1;</code>
   *
   * @return Whether the vertexModelSpec field is set.
   */
  boolean hasVertexModelSpec();
  /**
   *
   *
   * <pre>
   * Specification for vertex model resources.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSpec vertex_model_spec = 1;</code>
   *
   * @return The vertexModelSpec.
   */
  com.google.cloud.datacatalog.v1.VertexModelSpec getVertexModelSpec();
  /**
   *
   *
   * <pre>
   * Specification for vertex model resources.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSpec vertex_model_spec = 1;</code>
   */
  com.google.cloud.datacatalog.v1.VertexModelSpecOrBuilder getVertexModelSpecOrBuilder();

  com.google.cloud.datacatalog.v1.ModelSpec.SystemSpecCase getSystemSpecCase();
}
