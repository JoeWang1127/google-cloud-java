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
// source: google/cloud/aiplatform/v1/notebook_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface ListNotebookRuntimesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListNotebookRuntimesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.NotebookRuntime> getNotebookRuntimesList();
  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  com.google.cloud.aiplatform.v1.NotebookRuntime getNotebookRuntimes(int index);
  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  int getNotebookRuntimesCount();
  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.NotebookRuntimeOrBuilder>
      getNotebookRuntimesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  com.google.cloud.aiplatform.v1.NotebookRuntimeOrBuilder getNotebookRuntimesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1.ListNotebookRuntimesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1.ListNotebookRuntimesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
