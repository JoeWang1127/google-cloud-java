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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkmanagement.v1beta1;

public interface ForwardInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.ForwardInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Target type where this packet is forwarded to.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.ForwardInfo.Target target = 1;</code>
   *
   * @return The enum numeric value on the wire for target.
   */
  int getTargetValue();
  /**
   *
   *
   * <pre>
   * Target type where this packet is forwarded to.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.ForwardInfo.Target target = 1;</code>
   *
   * @return The target.
   */
  com.google.cloud.networkmanagement.v1beta1.ForwardInfo.Target getTarget();

  /**
   *
   *
   * <pre>
   * URI of the resource that the packet is forwarded to.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The resourceUri.
   */
  java.lang.String getResourceUri();
  /**
   *
   *
   * <pre>
   * URI of the resource that the packet is forwarded to.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The bytes for resourceUri.
   */
  com.google.protobuf.ByteString getResourceUriBytes();

  /**
   *
   *
   * <pre>
   * IP address of the target (if applicable).
   * </pre>
   *
   * <code>string ip_address = 3 [(.google.api.field_info) = { ... }</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the target (if applicable).
   * </pre>
   *
   * <code>string ip_address = 3 [(.google.api.field_info) = { ... }</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();
}
