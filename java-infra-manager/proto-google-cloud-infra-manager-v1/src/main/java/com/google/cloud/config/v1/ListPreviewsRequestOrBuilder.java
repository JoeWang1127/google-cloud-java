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
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.config.v1;

public interface ListPreviewsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.ListPreviewsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent in whose context the Previews are listed. The parent
   * value is in the format: 'projects/{project_id}/locations/{location}'.
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
   * Required. The parent in whose context the Previews are listed. The parent
   * value is in the format: 'projects/{project_id}/locations/{location}'.
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
   * Optional. When requesting a page of resources, 'page_size' specifies number
   * of resources to return. If unspecified, at most 500 will be returned. The
   * maximum value is 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Token returned by previous call to 'ListDeployments' which
   * specifies the position in the list from where to continue listing the
   * resources.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Token returned by previous call to 'ListDeployments' which
   * specifies the position in the list from where to continue listing the
   * resources.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Lists the Deployments that match the filter expression. A filter
   * expression filters the resources listed in the response. The expression
   * must be of the form '{field} {operator} {value}' where operators: '&lt;', '&gt;',
   * '&lt;=', '&gt;=', '!=', '=', ':' are supported (colon ':' represents a HAS
   * operator which is roughly synonymous with equality). {field} can refer to a
   * proto or JSON field, or a synthetic field. Field names can be camelCase or
   * snake_case.
   *
   * Examples:
   * - Filter by name:
   *   name = "projects/foo/locations/us-central1/deployments/bar
   *
   * - Filter by labels:
   *   - Resources that have a key called 'foo'
   *     labels.foo:*
   *   - Resources that have a key called 'foo' whose value is 'bar'
   *     labels.foo = bar
   *
   * - Filter by state:
   *   - Deployments in CREATING state.
   *     state=CREATING
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Lists the Deployments that match the filter expression. A filter
   * expression filters the resources listed in the response. The expression
   * must be of the form '{field} {operator} {value}' where operators: '&lt;', '&gt;',
   * '&lt;=', '&gt;=', '!=', '=', ':' are supported (colon ':' represents a HAS
   * operator which is roughly synonymous with equality). {field} can refer to a
   * proto or JSON field, or a synthetic field. Field names can be camelCase or
   * snake_case.
   *
   * Examples:
   * - Filter by name:
   *   name = "projects/foo/locations/us-central1/deployments/bar
   *
   * - Filter by labels:
   *   - Resources that have a key called 'foo'
   *     labels.foo:*
   *   - Resources that have a key called 'foo' whose value is 'bar'
   *     labels.foo = bar
   *
   * - Filter by state:
   *   - Deployments in CREATING state.
   *     state=CREATING
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Field to use to sort the list.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. Field to use to sort the list.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
