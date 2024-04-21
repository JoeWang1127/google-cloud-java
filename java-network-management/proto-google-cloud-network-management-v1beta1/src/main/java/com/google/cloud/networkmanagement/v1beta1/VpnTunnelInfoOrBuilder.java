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

public interface VpnTunnelInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.VpnTunnelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of a VPN tunnel.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of a VPN tunnel.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * URI of a VPN tunnel.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of a VPN tunnel.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * URI of the VPN gateway at local end of the tunnel.
   * </pre>
   *
   * <code>string source_gateway = 3;</code>
   *
   * @return The sourceGateway.
   */
  java.lang.String getSourceGateway();
  /**
   *
   *
   * <pre>
   * URI of the VPN gateway at local end of the tunnel.
   * </pre>
   *
   * <code>string source_gateway = 3;</code>
   *
   * @return The bytes for sourceGateway.
   */
  com.google.protobuf.ByteString getSourceGatewayBytes();

  /**
   *
   *
   * <pre>
   * URI of a VPN gateway at remote end of the tunnel.
   * </pre>
   *
   * <code>string remote_gateway = 4;</code>
   *
   * @return The remoteGateway.
   */
  java.lang.String getRemoteGateway();
  /**
   *
   *
   * <pre>
   * URI of a VPN gateway at remote end of the tunnel.
   * </pre>
   *
   * <code>string remote_gateway = 4;</code>
   *
   * @return The bytes for remoteGateway.
   */
  com.google.protobuf.ByteString getRemoteGatewayBytes();

  /**
   *
   *
   * <pre>
   * Remote VPN gateway's IP address.
   * </pre>
   *
   * <code>string remote_gateway_ip = 5;</code>
   *
   * @return The remoteGatewayIp.
   */
  java.lang.String getRemoteGatewayIp();
  /**
   *
   *
   * <pre>
   * Remote VPN gateway's IP address.
   * </pre>
   *
   * <code>string remote_gateway_ip = 5;</code>
   *
   * @return The bytes for remoteGatewayIp.
   */
  com.google.protobuf.ByteString getRemoteGatewayIpBytes();

  /**
   *
   *
   * <pre>
   * Local VPN gateway's IP address.
   * </pre>
   *
   * <code>string source_gateway_ip = 6;</code>
   *
   * @return The sourceGatewayIp.
   */
  java.lang.String getSourceGatewayIp();
  /**
   *
   *
   * <pre>
   * Local VPN gateway's IP address.
   * </pre>
   *
   * <code>string source_gateway_ip = 6;</code>
   *
   * @return The bytes for sourceGatewayIp.
   */
  com.google.protobuf.ByteString getSourceGatewayIpBytes();

  /**
   *
   *
   * <pre>
   * URI of a Compute Engine network where the VPN tunnel is configured.
   * </pre>
   *
   * <code>string network_uri = 7;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * URI of a Compute Engine network where the VPN tunnel is configured.
   * </pre>
   *
   * <code>string network_uri = 7;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * Name of a Google Cloud region where this VPN tunnel is configured.
   * </pre>
   *
   * <code>string region = 8;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of a Google Cloud region where this VPN tunnel is configured.
   * </pre>
   *
   * <code>string region = 8;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Type of the routing policy.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.VpnTunnelInfo.RoutingType routing_type = 9;
   * </code>
   *
   * @return The enum numeric value on the wire for routingType.
   */
  int getRoutingTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the routing policy.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.VpnTunnelInfo.RoutingType routing_type = 9;
   * </code>
   *
   * @return The routingType.
   */
  com.google.cloud.networkmanagement.v1beta1.VpnTunnelInfo.RoutingType getRoutingType();
}
