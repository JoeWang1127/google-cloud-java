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
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.orgpolicy.v2;

public interface ListPoliciesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.ListPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The target Google Cloud resource that parents the set of
   * constraints and policies that will be returned from this call. Must be in
   * one of the following forms:
   *
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
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
   * Required. The target Google Cloud resource that parents the set of
   * constraints and policies that will be returned from this call. Must be in
   * one of the following forms:
   *
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
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
   * Size of the pages to be returned. This is currently unsupported and will
   * be ignored. The server may at any point start using this field to limit
   * page size.
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
   * Page token used to retrieve the next page. This is currently unsupported
   * and will be ignored. The server may at any point start using this field.
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
   * Page token used to retrieve the next page. This is currently unsupported
   * and will be ignored. The server may at any point start using this field.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
