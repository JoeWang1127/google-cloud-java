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
// source: google/cloud/cloudcontrolspartner/v1beta/ekm_connections.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.cloudcontrolspartner.v1beta;

public interface EkmConnectionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1beta.EkmConnections)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}/ekmConnections
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
   * organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}/ekmConnections
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
   * The EKM connections associated with the workload
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1beta.EkmConnection ekm_connections = 2;
   * </code>
   */
  java.util.List<com.google.cloud.cloudcontrolspartner.v1beta.EkmConnection>
      getEkmConnectionsList();
  /**
   *
   *
   * <pre>
   * The EKM connections associated with the workload
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1beta.EkmConnection ekm_connections = 2;
   * </code>
   */
  com.google.cloud.cloudcontrolspartner.v1beta.EkmConnection getEkmConnections(int index);
  /**
   *
   *
   * <pre>
   * The EKM connections associated with the workload
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1beta.EkmConnection ekm_connections = 2;
   * </code>
   */
  int getEkmConnectionsCount();
  /**
   *
   *
   * <pre>
   * The EKM connections associated with the workload
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1beta.EkmConnection ekm_connections = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.cloudcontrolspartner.v1beta.EkmConnectionOrBuilder>
      getEkmConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The EKM connections associated with the workload
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1beta.EkmConnection ekm_connections = 2;
   * </code>
   */
  com.google.cloud.cloudcontrolspartner.v1beta.EkmConnectionOrBuilder getEkmConnectionsOrBuilder(
      int index);
}
