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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface ResourcePoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ResourcePool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The unique ID in a PersistentResource for referring to this
   * resource pool. User can specify it if necessary. Otherwise, it's generated
   * automatically.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Immutable. The unique ID in a PersistentResource for referring to this
   * resource pool. User can specify it if necessary. Otherwise, it's generated
   * automatically.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpec getMachineSpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The total number of machines to use for this resource pool.
   * </pre>
   *
   * <code>optional int64 replica_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the replicaCount field is set.
   */
  boolean hasReplicaCount();
  /**
   *
   *
   * <pre>
   * Optional. The total number of machines to use for this resource pool.
   * </pre>
   *
   * <code>optional int64 replica_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The replicaCount.
   */
  long getReplicaCount();

  /**
   *
   *
   * <pre>
   * Optional. Disk spec for the machine in this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the diskSpec field is set.
   */
  boolean hasDiskSpec();
  /**
   *
   *
   * <pre>
   * Optional. Disk spec for the machine in this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diskSpec.
   */
  com.google.cloud.aiplatform.v1beta1.DiskSpec getDiskSpec();
  /**
   *
   *
   * <pre>
   * Optional. Disk spec for the machine in this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DiskSpecOrBuilder getDiskSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The number of machines currently in use by training jobs for
   * this resource pool. Will replace idle_replica_count.
   * </pre>
   *
   * <code>int64 used_replica_count = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The usedReplicaCount.
   */
  long getUsedReplicaCount();

  /**
   *
   *
   * <pre>
   * Optional. Optional spec to configure GKE autoscaling
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourcePool.AutoscalingSpec autoscaling_spec = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the autoscalingSpec field is set.
   */
  boolean hasAutoscalingSpec();
  /**
   *
   *
   * <pre>
   * Optional. Optional spec to configure GKE autoscaling
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourcePool.AutoscalingSpec autoscaling_spec = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The autoscalingSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ResourcePool.AutoscalingSpec getAutoscalingSpec();
  /**
   *
   *
   * <pre>
   * Optional. Optional spec to configure GKE autoscaling
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourcePool.AutoscalingSpec autoscaling_spec = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ResourcePool.AutoscalingSpecOrBuilder
      getAutoscalingSpecOrBuilder();
}
