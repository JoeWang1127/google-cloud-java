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
// source: google/monitoring/v3/group_service.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface ListGroupMembersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListGroupMembersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  java.util.List<com.google.api.MonitoredResource> getMembersList();
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  com.google.api.MonitoredResource getMembers(int index);
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  int getMembersCount();
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  java.util.List<? extends com.google.api.MonitoredResourceOrBuilder> getMembersOrBuilderList();
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  com.google.api.MonitoredResourceOrBuilder getMembersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is
   * set to a non-empty value.  To see the additional results, use that value as
   * `page_token` in the next call to this method.
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
   * If there are more results than have been returned, then this field is
   * set to a non-empty value.  To see the additional results, use that value as
   * `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of elements matching this request.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
