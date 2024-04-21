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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1beta1;

public interface AuthorityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.Authority)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with
   * `https://` and be a valid URL with length &lt;2000 characters.
   *
   * If set, then Google will allow valid OIDC tokens from this issuer to
   * authenticate within the workload_identity_pool. OIDC discovery will be
   * performed on this URI to validate tokens from the issuer.
   *
   * Clearing `issuer` disables Workload Identity. `issuer` cannot be directly
   * modified; it must be cleared (and Workload Identity disabled) before using
   * a new issuer (and re-enabling Workload Identity).
   * </pre>
   *
   * <code>string issuer = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The issuer.
   */
  java.lang.String getIssuer();
  /**
   *
   *
   * <pre>
   * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with
   * `https://` and be a valid URL with length &lt;2000 characters.
   *
   * If set, then Google will allow valid OIDC tokens from this issuer to
   * authenticate within the workload_identity_pool. OIDC discovery will be
   * performed on this URI to validate tokens from the issuer.
   *
   * Clearing `issuer` disables Workload Identity. `issuer` cannot be directly
   * modified; it must be cleared (and Workload Identity disabled) before using
   * a new issuer (and re-enabling Workload Identity).
   * </pre>
   *
   * <code>string issuer = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for issuer.
   */
  com.google.protobuf.ByteString getIssuerBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the workload identity pool in which `issuer` will
   * be recognized.
   *
   * There is a single Workload Identity Pool per Hub that is shared
   * between all Memberships that belong to that Hub. For a Hub hosted in
   * {PROJECT_ID}, the workload pool format is `{PROJECT_ID}.hub.id.goog`,
   * although this is subject to change in newer versions of this API.
   * </pre>
   *
   * <code>string workload_identity_pool = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The workloadIdentityPool.
   */
  java.lang.String getWorkloadIdentityPool();
  /**
   *
   *
   * <pre>
   * Output only. The name of the workload identity pool in which `issuer` will
   * be recognized.
   *
   * There is a single Workload Identity Pool per Hub that is shared
   * between all Memberships that belong to that Hub. For a Hub hosted in
   * {PROJECT_ID}, the workload pool format is `{PROJECT_ID}.hub.id.goog`,
   * although this is subject to change in newer versions of this API.
   * </pre>
   *
   * <code>string workload_identity_pool = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for workloadIdentityPool.
   */
  com.google.protobuf.ByteString getWorkloadIdentityPoolBytes();

  /**
   *
   *
   * <pre>
   * Output only. An identity provider that reflects the `issuer` in the
   * workload identity pool.
   * </pre>
   *
   * <code>string identity_provider = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The identityProvider.
   */
  java.lang.String getIdentityProvider();
  /**
   *
   *
   * <pre>
   * Output only. An identity provider that reflects the `issuer` in the
   * workload identity pool.
   * </pre>
   *
   * <code>string identity_provider = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for identityProvider.
   */
  com.google.protobuf.ByteString getIdentityProviderBytes();

  /**
   *
   *
   * <pre>
   * Optional. OIDC verification keys for this Membership in JWKS format (RFC
   * 7517).
   *
   * When this field is set, OIDC discovery will NOT be performed on `issuer`,
   * and instead OIDC tokens will be validated using this field.
   * </pre>
   *
   * <code>bytes oidc_jwks = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The oidcJwks.
   */
  com.google.protobuf.ByteString getOidcJwks();
}
