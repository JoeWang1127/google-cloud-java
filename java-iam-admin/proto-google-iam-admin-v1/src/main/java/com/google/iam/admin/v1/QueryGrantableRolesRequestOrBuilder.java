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

public interface QueryGrantableRolesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.QueryGrantableRolesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full resource name to query from the list of grantable roles.
   *
   * The name follows the Google Cloud Platform resource format.
   * For example, a Cloud Platform project with id `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * </pre>
   *
   * <code>string full_resource_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The fullResourceName.
   */
  java.lang.String getFullResourceName();
  /**
   *
   *
   * <pre>
   * Required. The full resource name to query from the list of grantable roles.
   *
   * The name follows the Google Cloud Platform resource format.
   * For example, a Cloud Platform project with id `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * </pre>
   *
   * <code>string full_resource_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for fullResourceName.
   */
  com.google.protobuf.ByteString getFullResourceNameBytes();

  /**
   * <code>.google.iam.admin.v1.RoleView view = 2;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <code>.google.iam.admin.v1.RoleView view = 2;</code>
   *
   * @return The view.
   */
  com.google.iam.admin.v1.RoleView getView();

  /**
   *
   *
   * <pre>
   * Optional limit on the number of roles to include in the response.
   *
   * The default is 300, and the maximum is 1,000.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional pagination token returned in an earlier
   * QueryGrantableRolesResponse.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional pagination token returned in an earlier
   * QueryGrantableRolesResponse.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
