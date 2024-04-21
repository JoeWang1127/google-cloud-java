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
// source: google/apps/meet/v2/service.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.meet.v2;

public interface ListConferenceRecordsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.meet.v2.ListConferenceRecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of conference records to return. The service might
   * return fewer than this value. If unspecified, at most 25 conference records
   * are returned. The maximum value is 100; values above 100 are coerced to
   * 100. Maximum might change in the future.
   * </pre>
   *
   * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Page token returned from previous List Call.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Page token returned from previous List Call.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. User specified filtering condition in [EBNF
   * format](https://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_form).
   * The following are the filterable fields:
   *
   * * `space.meeting_code`
   * * `space.name`
   * * `start_time`
   * * `end_time`
   *
   * For example, `space.meeting_code = "abc-mnop-xyz"`.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. User specified filtering condition in [EBNF
   * format](https://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_form).
   * The following are the filterable fields:
   *
   * * `space.meeting_code`
   * * `space.name`
   * * `start_time`
   * * `end_time`
   *
   * For example, `space.meeting_code = "abc-mnop-xyz"`.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
