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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface AllocationAggregateReservationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AllocationAggregateReservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] List of resources currently in use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo in_use_resources = 409009107;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo>
      getInUseResourcesList();
  /**
   *
   *
   * <pre>
   * [Output only] List of resources currently in use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo in_use_resources = 409009107;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo getInUseResources(
      int index);
  /**
   *
   *
   * <pre>
   * [Output only] List of resources currently in use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo in_use_resources = 409009107;
   * </code>
   */
  int getInUseResourcesCount();
  /**
   *
   *
   * <pre>
   * [Output only] List of resources currently in use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo in_use_resources = 409009107;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1
                  .AllocationAggregateReservationReservedResourceInfoOrBuilder>
      getInUseResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output only] List of resources currently in use.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo in_use_resources = 409009107;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfoOrBuilder
      getInUseResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of reserved resources (CPUs, memory, accelerators).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo reserved_resources = 213217742;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo>
      getReservedResourcesList();
  /**
   *
   *
   * <pre>
   * List of reserved resources (CPUs, memory, accelerators).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo reserved_resources = 213217742;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo
      getReservedResources(int index);
  /**
   *
   *
   * <pre>
   * List of reserved resources (CPUs, memory, accelerators).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo reserved_resources = 213217742;
   * </code>
   */
  int getReservedResourcesCount();
  /**
   *
   *
   * <pre>
   * List of reserved resources (CPUs, memory, accelerators).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo reserved_resources = 213217742;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1
                  .AllocationAggregateReservationReservedResourceInfoOrBuilder>
      getReservedResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of reserved resources (CPUs, memory, accelerators).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfo reserved_resources = 213217742;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfoOrBuilder
      getReservedResourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The VM family that all instances scheduled against this reservation must belong to.
   * Check the VmFamily enum for the list of possible values.
   * </pre>
   *
   * <code>optional string vm_family = 125017580;</code>
   *
   * @return Whether the vmFamily field is set.
   */
  boolean hasVmFamily();
  /**
   *
   *
   * <pre>
   * The VM family that all instances scheduled against this reservation must belong to.
   * Check the VmFamily enum for the list of possible values.
   * </pre>
   *
   * <code>optional string vm_family = 125017580;</code>
   *
   * @return The vmFamily.
   */
  java.lang.String getVmFamily();
  /**
   *
   *
   * <pre>
   * The VM family that all instances scheduled against this reservation must belong to.
   * Check the VmFamily enum for the list of possible values.
   * </pre>
   *
   * <code>optional string vm_family = 125017580;</code>
   *
   * @return The bytes for vmFamily.
   */
  com.google.protobuf.ByteString getVmFamilyBytes();

  /**
   *
   *
   * <pre>
   * The workload type of the instances that will target this reservation.
   * Check the WorkloadType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string workload_type = 273432322;</code>
   *
   * @return Whether the workloadType field is set.
   */
  boolean hasWorkloadType();
  /**
   *
   *
   * <pre>
   * The workload type of the instances that will target this reservation.
   * Check the WorkloadType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string workload_type = 273432322;</code>
   *
   * @return The workloadType.
   */
  java.lang.String getWorkloadType();
  /**
   *
   *
   * <pre>
   * The workload type of the instances that will target this reservation.
   * Check the WorkloadType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string workload_type = 273432322;</code>
   *
   * @return The bytes for workloadType.
   */
  com.google.protobuf.ByteString getWorkloadTypeBytes();
}
