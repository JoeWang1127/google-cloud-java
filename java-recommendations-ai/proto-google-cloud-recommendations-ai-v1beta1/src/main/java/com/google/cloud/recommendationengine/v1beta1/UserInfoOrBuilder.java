/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recommendationengine/v1beta1/user_event.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface UserInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A unique identifier for tracking visitors with a length limit of
   * 128 bytes.
   * For example, this could be implemented with a http cookie, which should be
   * able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor log in/out of the website.
   * Maximum length 128 bytes. Cannot be empty.
   * </pre>
   *
   * <code>string visitor_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The visitorId.
   */
  java.lang.String getVisitorId();
  /**
   *
   *
   * <pre>
   * Required. A unique identifier for tracking visitors with a length limit of
   * 128 bytes.
   * For example, this could be implemented with a http cookie, which should be
   * able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor log in/out of the website.
   * Maximum length 128 bytes. Cannot be empty.
   * </pre>
   *
   * <code>string visitor_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for visitorId.
   */
  com.google.protobuf.ByteString getVisitorIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Unique identifier for logged-in user with a length limit of 128
   * bytes. Required only for logged-in users.
   * </pre>
   *
   * <code>string user_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   *
   *
   * <pre>
   * Optional. Unique identifier for logged-in user with a length limit of 128
   * bytes. Required only for logged-in users.
   * </pre>
   *
   * <code>string user_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString getUserIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. IP address of the user. This could be either IPv4 (e.g. 104.133.9.80) or
   * IPv6 (e.g. 2001:0db8:85a3:0000:0000:8a2e:0370:7334). This should *not* be
   * set when using the javascript pixel or if `direct_user_request` is set.
   * Used to extract location information for personalization.
   * </pre>
   *
   * <code>string ip_address = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * Optional. IP address of the user. This could be either IPv4 (e.g. 104.133.9.80) or
   * IPv6 (e.g. 2001:0db8:85a3:0000:0000:8a2e:0370:7334). This should *not* be
   * set when using the javascript pixel or if `direct_user_request` is set.
   * Used to extract location information for personalization.
   * </pre>
   *
   * <code>string ip_address = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Optional. User agent as included in the HTTP header. UTF-8 encoded string
   * with a length limit of 1 KiB.
   * This should *not* be set when using the JavaScript pixel or if
   * `directUserRequest` is set.
   * </pre>
   *
   * <code>string user_agent = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   *
   *
   * <pre>
   * Optional. User agent as included in the HTTP header. UTF-8 encoded string
   * with a length limit of 1 KiB.
   * This should *not* be set when using the JavaScript pixel or if
   * `directUserRequest` is set.
   * </pre>
   *
   * <code>string user_agent = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString getUserAgentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates if the request is made directly from the end user
   * in which case the user_agent and ip_address fields can be populated
   * from the HTTP request. This should *not* be set when using the javascript
   * pixel. This flag should be set only if the API request is made directly
   * from the end user such as a mobile app (and not if a gateway or a server is
   * processing and pushing the user events).
   * </pre>
   *
   * <code>bool direct_user_request = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The directUserRequest.
   */
  boolean getDirectUserRequest();
}