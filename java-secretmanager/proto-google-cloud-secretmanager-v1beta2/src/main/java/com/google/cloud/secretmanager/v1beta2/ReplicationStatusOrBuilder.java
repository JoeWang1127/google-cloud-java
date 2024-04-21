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
// source: google/cloud/secretmanager/v1beta2/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.secretmanager.v1beta2;

public interface ReplicationStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1beta2.ReplicationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Describes the replication status of a
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] with
   * automatic replication.
   *
   * Only populated if the parent
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] has an automatic
   * replication policy.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.ReplicationStatus.AutomaticStatus automatic = 1;
   * </code>
   *
   * @return Whether the automatic field is set.
   */
  boolean hasAutomatic();
  /**
   *
   *
   * <pre>
   * Describes the replication status of a
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] with
   * automatic replication.
   *
   * Only populated if the parent
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] has an automatic
   * replication policy.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.ReplicationStatus.AutomaticStatus automatic = 1;
   * </code>
   *
   * @return The automatic.
   */
  com.google.cloud.secretmanager.v1beta2.ReplicationStatus.AutomaticStatus getAutomatic();
  /**
   *
   *
   * <pre>
   * Describes the replication status of a
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] with
   * automatic replication.
   *
   * Only populated if the parent
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] has an automatic
   * replication policy.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.ReplicationStatus.AutomaticStatus automatic = 1;
   * </code>
   */
  com.google.cloud.secretmanager.v1beta2.ReplicationStatus.AutomaticStatusOrBuilder
      getAutomaticOrBuilder();

  /**
   *
   *
   * <pre>
   * Describes the replication status of a
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] with
   * user-managed replication.
   *
   * Only populated if the parent
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] has a user-managed
   * replication policy.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.ReplicationStatus.UserManagedStatus user_managed = 2;
   * </code>
   *
   * @return Whether the userManaged field is set.
   */
  boolean hasUserManaged();
  /**
   *
   *
   * <pre>
   * Describes the replication status of a
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] with
   * user-managed replication.
   *
   * Only populated if the parent
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] has a user-managed
   * replication policy.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.ReplicationStatus.UserManagedStatus user_managed = 2;
   * </code>
   *
   * @return The userManaged.
   */
  com.google.cloud.secretmanager.v1beta2.ReplicationStatus.UserManagedStatus getUserManaged();
  /**
   *
   *
   * <pre>
   * Describes the replication status of a
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] with
   * user-managed replication.
   *
   * Only populated if the parent
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] has a user-managed
   * replication policy.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.ReplicationStatus.UserManagedStatus user_managed = 2;
   * </code>
   */
  com.google.cloud.secretmanager.v1beta2.ReplicationStatus.UserManagedStatusOrBuilder
      getUserManagedOrBuilder();

  com.google.cloud.secretmanager.v1beta2.ReplicationStatus.ReplicationStatusCase
      getReplicationStatusCase();
}
