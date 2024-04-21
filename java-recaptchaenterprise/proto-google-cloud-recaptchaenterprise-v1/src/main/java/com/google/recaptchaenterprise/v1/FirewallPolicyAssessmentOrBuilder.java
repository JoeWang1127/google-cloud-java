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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.3
package com.google.recaptchaenterprise.v1;

public interface FirewallPolicyAssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.FirewallPolicyAssessment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. If the processing of a policy config fails, an error will be
   * populated and the firewall_policy will be left empty.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. If the processing of a policy config fails, an error will be
   * populated and the firewall_policy will be left empty.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. If the processing of a policy config fails, an error will be
   * populated and the firewall_policy will be left empty.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The policy that matched the request. If more than one policy
   * may match, this is the first match. If no policy matches the incoming
   * request, the policy field will be left empty.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the firewallPolicy field is set.
   */
  boolean hasFirewallPolicy();
  /**
   *
   *
   * <pre>
   * Output only. The policy that matched the request. If more than one policy
   * may match, this is the first match. If no policy matches the incoming
   * request, the policy field will be left empty.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The firewallPolicy.
   */
  com.google.recaptchaenterprise.v1.FirewallPolicy getFirewallPolicy();
  /**
   *
   *
   * <pre>
   * Output only. The policy that matched the request. If more than one policy
   * may match, this is the first match. If no policy matches the incoming
   * request, the policy field will be left empty.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder getFirewallPolicyOrBuilder();
}
