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
// source: google/cloud/domains/v1alpha2/domains.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.domains.v1alpha2;

public interface ManagementSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1alpha2.ManagementSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The renewal method for this `Registration`.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1alpha2.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for renewalMethod.
   */
  int getRenewalMethodValue();
  /**
   *
   *
   * <pre>
   * Output only. The renewal method for this `Registration`.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1alpha2.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The renewalMethod.
   */
  com.google.cloud.domains.v1alpha2.ManagementSettings.RenewalMethod getRenewalMethod();

  /**
   *
   *
   * <pre>
   * Controls whether the domain can be transferred to another registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.TransferLockState transfer_lock_state = 4;</code>
   *
   * @return The enum numeric value on the wire for transferLockState.
   */
  int getTransferLockStateValue();
  /**
   *
   *
   * <pre>
   * Controls whether the domain can be transferred to another registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.TransferLockState transfer_lock_state = 4;</code>
   *
   * @return The transferLockState.
   */
  com.google.cloud.domains.v1alpha2.TransferLockState getTransferLockState();
}
