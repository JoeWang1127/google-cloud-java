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
// source: google/cloud/backupdr/v1/backupdr.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.backupdr.v1;

public interface WorkforceIdentityBasedManagementURIOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.WorkforceIdentityBasedManagementURI)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. First party Management URI for Google Identities.
   * </pre>
   *
   * <code>string first_party_management_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The firstPartyManagementUri.
   */
  java.lang.String getFirstPartyManagementUri();
  /**
   *
   *
   * <pre>
   * Output only. First party Management URI for Google Identities.
   * </pre>
   *
   * <code>string first_party_management_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for firstPartyManagementUri.
   */
  com.google.protobuf.ByteString getFirstPartyManagementUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Third party Management URI for External Identity Providers.
   * </pre>
   *
   * <code>string third_party_management_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The thirdPartyManagementUri.
   */
  java.lang.String getThirdPartyManagementUri();
  /**
   *
   *
   * <pre>
   * Output only. Third party Management URI for External Identity Providers.
   * </pre>
   *
   * <code>string third_party_management_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for thirdPartyManagementUri.
   */
  com.google.protobuf.ByteString getThirdPartyManagementUriBytes();
}
