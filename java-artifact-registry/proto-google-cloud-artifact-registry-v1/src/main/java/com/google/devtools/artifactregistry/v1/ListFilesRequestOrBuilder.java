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
// source: google/devtools/artifactregistry/v1/file.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.artifactregistry.v1;

public interface ListFilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the repository whose files will be listed. For
   * example: "projects/p1/locations/us-central1/repositories/repo1
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
   * Required. The name of the repository whose files will be listed. For
   * example: "projects/p1/locations/us-central1/repositories/repo1
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
   * An expression for filtering the results of the request. Filter rules are
   * case insensitive. The fields eligible for filtering are:
   *
   *   * `name`
   *   * `owner`
   *
   *  An example of using a filter:
   *
   *   * `name="projects/p1/locations/us-central1/repositories/repo1/files/a/b/&#42;"` --&gt; Files with an
   *   ID starting with "a/b/".
   *   * `owner="projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0"` --&gt;
   *   Files owned by the version `1.0` in package `pkg1`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request. Filter rules are
   * case insensitive. The fields eligible for filtering are:
   *
   *   * `name`
   *   * `owner`
   *
   *  An example of using a filter:
   *
   *   * `name="projects/p1/locations/us-central1/repositories/repo1/files/a/b/&#42;"` --&gt; Files with an
   *   ID starting with "a/b/".
   *   * `owner="projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0"` --&gt;
   *   Files owned by the version `1.0` in package `pkg1`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of files to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The field to order the results by.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * The field to order the results by.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
