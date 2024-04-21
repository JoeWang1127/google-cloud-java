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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.3
package com.google.iam.admin.v1;

public interface ListRolesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.ListRolesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  java.util.List<com.google.iam.admin.v1.Role> getRolesList();
  /**
   *
   *
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  com.google.iam.admin.v1.Role getRoles(int index);
  /**
   *
   *
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  int getRolesCount();
  /**
   *
   *
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  java.util.List<? extends com.google.iam.admin.v1.RoleOrBuilder> getRolesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  com.google.iam.admin.v1.RoleOrBuilder getRolesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * To retrieve the next page of results, set
   * `ListRolesRequest.page_token` to this value.
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
   * To retrieve the next page of results, set
   * `ListRolesRequest.page_token` to this value.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
