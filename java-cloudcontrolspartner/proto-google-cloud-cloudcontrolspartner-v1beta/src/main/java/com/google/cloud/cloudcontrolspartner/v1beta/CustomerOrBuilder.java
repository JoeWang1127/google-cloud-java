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
// source: google/cloud/cloudcontrolspartner/v1beta/customers.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.cloudcontrolspartner.v1beta;

public interface CustomerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1beta.Customer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * organizations/{organization}/locations/{location}/customers/{customer}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * organizations/{organization}/locations/{location}/customers/{customer}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The customer organization's display name. E.g. "google.com".
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The customer organization's display name. E.g. "google.com".
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Container for customer onboarding steps
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1beta.CustomerOnboardingState customer_onboarding_state = 3;
   * </code>
   *
   * @return Whether the customerOnboardingState field is set.
   */
  boolean hasCustomerOnboardingState();
  /**
   *
   *
   * <pre>
   * Container for customer onboarding steps
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1beta.CustomerOnboardingState customer_onboarding_state = 3;
   * </code>
   *
   * @return The customerOnboardingState.
   */
  com.google.cloud.cloudcontrolspartner.v1beta.CustomerOnboardingState getCustomerOnboardingState();
  /**
   *
   *
   * <pre>
   * Container for customer onboarding steps
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1beta.CustomerOnboardingState customer_onboarding_state = 3;
   * </code>
   */
  com.google.cloud.cloudcontrolspartner.v1beta.CustomerOnboardingStateOrBuilder
      getCustomerOnboardingStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether a customer is fully onboarded
   * </pre>
   *
   * <code>bool is_onboarded = 4;</code>
   *
   * @return The isOnboarded.
   */
  boolean getIsOnboarded();
}
