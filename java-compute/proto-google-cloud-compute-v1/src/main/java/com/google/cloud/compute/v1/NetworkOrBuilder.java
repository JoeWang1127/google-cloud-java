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

public interface NetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Network)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
   * </pre>
   *
   * <code>optional string I_pv4_range = 59234358;</code>
   *
   * @return Whether the iPv4Range field is set.
   */
  boolean hasIPv4Range();
  /**
   *
   *
   * <pre>
   * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
   * </pre>
   *
   * <code>optional string I_pv4_range = 59234358;</code>
   *
   * @return The iPv4Range.
   */
  java.lang.String getIPv4Range();
  /**
   *
   *
   * <pre>
   * Deprecated in favor of subnet mode networks. The range of internal addresses that are legal on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by the client when the network is created.
   * </pre>
   *
   * <code>optional string I_pv4_range = 59234358;</code>
   *
   * @return The bytes for iPv4Range.
   */
  com.google.protobuf.ByteString getIPv4RangeBytes();

  /**
   *
   *
   * <pre>
   * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
   * </pre>
   *
   * <code>optional bool auto_create_subnetworks = 256156690;</code>
   *
   * @return Whether the autoCreateSubnetworks field is set.
   */
  boolean hasAutoCreateSubnetworks();
  /**
   *
   *
   * <pre>
   * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
   * </pre>
   *
   * <code>optional bool auto_create_subnetworks = 256156690;</code>
   *
   * @return The autoCreateSubnetworks.
   */
  boolean getAutoCreateSubnetworks();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
   * </pre>
   *
   * <code>optional bool enable_ula_internal_ipv6 = 423757720;</code>
   *
   * @return Whether the enableUlaInternalIpv6 field is set.
   */
  boolean hasEnableUlaInternalIpv6();
  /**
   *
   *
   * <pre>
   * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
   * </pre>
   *
   * <code>optional bool enable_ula_internal_ipv6 = 423757720;</code>
   *
   * @return The enableUlaInternalIpv6.
   */
  boolean getEnableUlaInternalIpv6();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the firewall policy the network is associated with.
   * </pre>
   *
   * <code>optional string firewall_policy = 498173265;</code>
   *
   * @return Whether the firewallPolicy field is set.
   */
  boolean hasFirewallPolicy();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the firewall policy the network is associated with.
   * </pre>
   *
   * <code>optional string firewall_policy = 498173265;</code>
   *
   * @return The firewallPolicy.
   */
  java.lang.String getFirewallPolicy();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the firewall policy the network is associated with.
   * </pre>
   *
   * <code>optional string firewall_policy = 498173265;</code>
   *
   * @return The bytes for firewallPolicy.
   */
  com.google.protobuf.ByteString getFirewallPolicyBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The gateway address for default routing out of the network, selected by Google Cloud.
   * </pre>
   *
   * <code>optional string gateway_i_pv4 = 178678877;</code>
   *
   * @return Whether the gatewayIPv4 field is set.
   */
  boolean hasGatewayIPv4();
  /**
   *
   *
   * <pre>
   * [Output Only] The gateway address for default routing out of the network, selected by Google Cloud.
   * </pre>
   *
   * <code>optional string gateway_i_pv4 = 178678877;</code>
   *
   * @return The gatewayIPv4.
   */
  java.lang.String getGatewayIPv4();
  /**
   *
   *
   * <pre>
   * [Output Only] The gateway address for default routing out of the network, selected by Google Cloud.
   * </pre>
   *
   * <code>optional string gateway_i_pv4 = 178678877;</code>
   *
   * @return The bytes for gatewayIPv4.
   */
  com.google.protobuf.ByteString getGatewayIPv4Bytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
   * </pre>
   *
   * <code>optional string internal_ipv6_range = 277456807;</code>
   *
   * @return Whether the internalIpv6Range field is set.
   */
  boolean hasInternalIpv6Range();
  /**
   *
   *
   * <pre>
   * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
   * </pre>
   *
   * <code>optional string internal_ipv6_range = 277456807;</code>
   *
   * @return The internalIpv6Range.
   */
  java.lang.String getInternalIpv6Range();
  /**
   *
   *
   * <pre>
   * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
   * </pre>
   *
   * <code>optional string internal_ipv6_range = 277456807;</code>
   *
   * @return The bytes for internalIpv6Range.
   */
  com.google.protobuf.ByteString getInternalIpv6RangeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#network for networks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#network for networks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#network for networks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Maximum Transmission Unit in bytes. The minimum value for this field is 1300 and the maximum value is 8896. The suggested value is 1500, which is the default MTU used on the Internet, or 8896 if you want to use Jumbo frames. If unspecified, the value defaults to 1460.
   * </pre>
   *
   * <code>optional int32 mtu = 108462;</code>
   *
   * @return Whether the mtu field is set.
   */
  boolean hasMtu();
  /**
   *
   *
   * <pre>
   * Maximum Transmission Unit in bytes. The minimum value for this field is 1300 and the maximum value is 8896. The suggested value is 1500, which is the default MTU used on the Internet, or 8896 if you want to use Jumbo frames. If unspecified, the value defaults to 1460.
   * </pre>
   *
   * <code>optional int32 mtu = 108462;</code>
   *
   * @return The mtu.
   */
  int getMtu();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
   * Check the NetworkFirewallPolicyEnforcementOrder enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_firewall_policy_enforcement_order = 6504784;</code>
   *
   * @return Whether the networkFirewallPolicyEnforcementOrder field is set.
   */
  boolean hasNetworkFirewallPolicyEnforcementOrder();
  /**
   *
   *
   * <pre>
   * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
   * Check the NetworkFirewallPolicyEnforcementOrder enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_firewall_policy_enforcement_order = 6504784;</code>
   *
   * @return The networkFirewallPolicyEnforcementOrder.
   */
  java.lang.String getNetworkFirewallPolicyEnforcementOrder();
  /**
   *
   *
   * <pre>
   * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
   * Check the NetworkFirewallPolicyEnforcementOrder enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_firewall_policy_enforcement_order = 6504784;</code>
   *
   * @return The bytes for networkFirewallPolicyEnforcementOrder.
   */
  com.google.protobuf.ByteString getNetworkFirewallPolicyEnforcementOrderBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A list of network peerings for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkPeering peerings = 69883187;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NetworkPeering> getPeeringsList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of network peerings for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkPeering peerings = 69883187;</code>
   */
  com.google.cloud.compute.v1.NetworkPeering getPeerings(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of network peerings for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkPeering peerings = 69883187;</code>
   */
  int getPeeringsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of network peerings for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkPeering peerings = 69883187;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NetworkPeeringOrBuilder>
      getPeeringsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of network peerings for the resource.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkPeering peerings = 69883187;</code>
   */
  com.google.cloud.compute.v1.NetworkPeeringOrBuilder getPeeringsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkRoutingConfig routing_config = 523556059;</code>
   *
   * @return Whether the routingConfig field is set.
   */
  boolean hasRoutingConfig();
  /**
   *
   *
   * <pre>
   * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkRoutingConfig routing_config = 523556059;</code>
   *
   * @return The routingConfig.
   */
  com.google.cloud.compute.v1.NetworkRoutingConfig getRoutingConfig();
  /**
   *
   *
   * <pre>
   * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.NetworkRoutingConfig routing_config = 523556059;</code>
   */
  com.google.cloud.compute.v1.NetworkRoutingConfigOrBuilder getRoutingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return Whether the selfLinkWithId field is set.
   */
  boolean hasSelfLinkWithId();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return The selfLinkWithId.
   */
  java.lang.String getSelfLinkWithId();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return The bytes for selfLinkWithId.
   */
  com.google.protobuf.ByteString getSelfLinkWithIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @return A list containing the subnetworks.
   */
  java.util.List<java.lang.String> getSubnetworksList();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @return The count of subnetworks.
   */
  int getSubnetworksCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @param index The index of the element to return.
   * @return The subnetworks at the given index.
   */
  java.lang.String getSubnetworks(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.
   * </pre>
   *
   * <code>repeated string subnetworks = 415853125;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subnetworks at the given index.
   */
  com.google.protobuf.ByteString getSubnetworksBytes(int index);
}
