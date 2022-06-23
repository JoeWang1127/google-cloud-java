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
// source: google/cloud/scheduler/v1beta1/target.proto

package com.google.cloud.scheduler.v1beta1;

public interface OAuthTokenOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.OAuthToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OAuth token.
   * The service account must be within the same project as the job. The caller
   * must have iam.serviceAccounts.actAs permission for the service account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OAuth token.
   * The service account must be within the same project as the job. The caller
   * must have iam.serviceAccounts.actAs permission for the service account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * OAuth scope to be used for generating OAuth access token.
   * If not specified, "https://www.googleapis.com/auth/cloud-platform"
   * will be used.
   * </pre>
   *
   * <code>string scope = 2;</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * OAuth scope to be used for generating OAuth access token.
   * If not specified, "https://www.googleapis.com/auth/cloud-platform"
   * will be used.
   * </pre>
   *
   * <code>string scope = 2;</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();
}
