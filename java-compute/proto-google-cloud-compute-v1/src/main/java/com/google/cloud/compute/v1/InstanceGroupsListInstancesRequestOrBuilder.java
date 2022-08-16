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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupsListInstancesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupsListInstancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * Check the InstanceState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_state = 92223591;</code>
   *
   * @return Whether the instanceState field is set.
   */
  boolean hasInstanceState();
  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * Check the InstanceState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_state = 92223591;</code>
   *
   * @return The instanceState.
   */
  java.lang.String getInstanceState();
  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * Check the InstanceState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_state = 92223591;</code>
   *
   * @return The bytes for instanceState.
   */
  com.google.protobuf.ByteString getInstanceStateBytes();
}
