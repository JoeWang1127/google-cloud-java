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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycentermanagement.v1;

public interface ListSecurityHealthAnalyticsCustomModulesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.ListSecurityHealthAnalyticsCustomModulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;
   * </code>
   */
  java.util.List<com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule>
      getSecurityHealthAnalyticsCustomModulesList();
  /**
   *
   *
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule
      getSecurityHealthAnalyticsCustomModules(int index);
  /**
   *
   *
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;
   * </code>
   */
  int getSecurityHealthAnalyticsCustomModulesCount();
  /**
   *
   *
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.securitycentermanagement.v1
                  .SecurityHealthAnalyticsCustomModuleOrBuilder>
      getSecurityHealthAnalyticsCustomModulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of SecurityHealthAnalyticsCustomModules
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_modules = 1;
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.SecurityHealthAnalyticsCustomModuleOrBuilder
      getSecurityHealthAnalyticsCustomModulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
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
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
