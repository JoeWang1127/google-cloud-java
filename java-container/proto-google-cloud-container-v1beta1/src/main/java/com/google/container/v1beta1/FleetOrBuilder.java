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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface FleetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.Fleet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Fleet host project(project ID or project number) where this cluster
   * will be registered to. This field cannot be changed after the cluster has
   * been registered.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The Fleet host project(project ID or project number) where this cluster
   * will be registered to. This field cannot be changed after the cluster has
   * been registered.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The full resource name of the registered fleet membership of
   * the cluster, in the format
   * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string membership = 2;</code>
   *
   * @return The membership.
   */
  java.lang.String getMembership();
  /**
   *
   *
   * <pre>
   * [Output only] The full resource name of the registered fleet membership of
   * the cluster, in the format
   * `//gkehub.googleapis.com/projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string membership = 2;</code>
   *
   * @return The bytes for membership.
   */
  com.google.protobuf.ByteString getMembershipBytes();

  /**
   *
   *
   * <pre>
   * [Output only] Whether the cluster has been registered through the fleet
   * API.
   * </pre>
   *
   * <code>bool pre_registered = 3;</code>
   *
   * @return The preRegistered.
   */
  boolean getPreRegistered();
}
