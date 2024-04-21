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
// source: google/cloud/essentialcontacts/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.essentialcontacts.v1;

public interface ComputeContactsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.essentialcontacts.v1.ComputeContactsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the resource to compute contacts for.
   * Format: organizations/{organization_id},
   * folders/{folder_id} or projects/{project_id}
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
   * Required. The name of the resource to compute contacts for.
   * Format: organizations/{organization_id},
   * folders/{folder_id} or projects/{project_id}
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
   * The categories of notifications to compute contacts for. If ALL is included
   * in this list, contacts subscribed to any notification category will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.essentialcontacts.v1.NotificationCategory notification_categories = 6;
   * </code>
   *
   * @return A list containing the notificationCategories.
   */
  java.util.List<com.google.cloud.essentialcontacts.v1.NotificationCategory>
      getNotificationCategoriesList();
  /**
   *
   *
   * <pre>
   * The categories of notifications to compute contacts for. If ALL is included
   * in this list, contacts subscribed to any notification category will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.essentialcontacts.v1.NotificationCategory notification_categories = 6;
   * </code>
   *
   * @return The count of notificationCategories.
   */
  int getNotificationCategoriesCount();
  /**
   *
   *
   * <pre>
   * The categories of notifications to compute contacts for. If ALL is included
   * in this list, contacts subscribed to any notification category will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.essentialcontacts.v1.NotificationCategory notification_categories = 6;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The notificationCategories at the given index.
   */
  com.google.cloud.essentialcontacts.v1.NotificationCategory getNotificationCategories(int index);
  /**
   *
   *
   * <pre>
   * The categories of notifications to compute contacts for. If ALL is included
   * in this list, contacts subscribed to any notification category will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.essentialcontacts.v1.NotificationCategory notification_categories = 6;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for notificationCategories.
   */
  java.util.List<java.lang.Integer> getNotificationCategoriesValueList();
  /**
   *
   *
   * <pre>
   * The categories of notifications to compute contacts for. If ALL is included
   * in this list, contacts subscribed to any notification category will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.essentialcontacts.v1.NotificationCategory notification_categories = 6;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of notificationCategories at the given index.
   */
  int getNotificationCategoriesValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return from this request.
   * Non-positive values are ignored. The presence of `next_page_token` in the
   * response indicates that more results might be available.
   * If not specified, the default page_size is 100.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, retrieves the next batch of results from the
   * preceding call to this method. `page_token` must be the value of
   * `next_page_token` from the previous response. The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, retrieves the next batch of results from the
   * preceding call to this method. `page_token` must be the value of
   * `next_page_token` from the previous response. The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
