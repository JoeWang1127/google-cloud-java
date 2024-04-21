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

public interface VertexModelSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.VertexModelSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The version ID of the model.
   * </pre>
   *
   * <code>string version_id = 1;</code>
   *
   * @return The versionId.
   */
  java.lang.String getVersionId();
  /**
   *
   *
   * <pre>
   * The version ID of the model.
   * </pre>
   *
   * <code>string version_id = 1;</code>
   *
   * @return The bytes for versionId.
   */
  com.google.protobuf.ByteString getVersionIdBytes();

  /**
   *
   *
   * <pre>
   * User provided version aliases so that a model version can be referenced via
   * alias
   * </pre>
   *
   * <code>repeated string version_aliases = 2;</code>
   *
   * @return A list containing the versionAliases.
   */
  java.util.List<java.lang.String> getVersionAliasesList();
  /**
   *
   *
   * <pre>
   * User provided version aliases so that a model version can be referenced via
   * alias
   * </pre>
   *
   * <code>repeated string version_aliases = 2;</code>
   *
   * @return The count of versionAliases.
   */
  int getVersionAliasesCount();
  /**
   *
   *
   * <pre>
   * User provided version aliases so that a model version can be referenced via
   * alias
   * </pre>
   *
   * <code>repeated string version_aliases = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The versionAliases at the given index.
   */
  java.lang.String getVersionAliases(int index);
  /**
   *
   *
   * <pre>
   * User provided version aliases so that a model version can be referenced via
   * alias
   * </pre>
   *
   * <code>repeated string version_aliases = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the versionAliases at the given index.
   */
  com.google.protobuf.ByteString getVersionAliasesBytes(int index);

  /**
   *
   *
   * <pre>
   * The description of this version.
   * </pre>
   *
   * <code>string version_description = 3;</code>
   *
   * @return The versionDescription.
   */
  java.lang.String getVersionDescription();
  /**
   *
   *
   * <pre>
   * The description of this version.
   * </pre>
   *
   * <code>string version_description = 3;</code>
   *
   * @return The bytes for versionDescription.
   */
  com.google.protobuf.ByteString getVersionDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Source of a Vertex model.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSourceInfo vertex_model_source_info = 4;</code>
   *
   * @return Whether the vertexModelSourceInfo field is set.
   */
  boolean hasVertexModelSourceInfo();
  /**
   *
   *
   * <pre>
   * Source of a Vertex model.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSourceInfo vertex_model_source_info = 4;</code>
   *
   * @return The vertexModelSourceInfo.
   */
  com.google.cloud.datacatalog.v1.VertexModelSourceInfo getVertexModelSourceInfo();
  /**
   *
   *
   * <pre>
   * Source of a Vertex model.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.VertexModelSourceInfo vertex_model_source_info = 4;</code>
   */
  com.google.cloud.datacatalog.v1.VertexModelSourceInfoOrBuilder
      getVertexModelSourceInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * URI of the Docker image to be used as the custom container for serving
   * predictions.
   * </pre>
   *
   * <code>string container_image_uri = 5;</code>
   *
   * @return The containerImageUri.
   */
  java.lang.String getContainerImageUri();
  /**
   *
   *
   * <pre>
   * URI of the Docker image to be used as the custom container for serving
   * predictions.
   * </pre>
   *
   * <code>string container_image_uri = 5;</code>
   *
   * @return The bytes for containerImageUri.
   */
  com.google.protobuf.ByteString getContainerImageUriBytes();
}
