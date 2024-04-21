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

public interface InterconnectRemoteLocationConstraintsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectRemoteLocationConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Port pair remote location constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API refers only to individual ports, but the UI uses this field when ordering a pair of ports, to prevent users from accidentally ordering something that is incompatible with their cloud provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI requires that both ports use the same remote location.
   * Check the PortPairRemoteLocation enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_pair_remote_location = 495917351;</code>
   *
   * @return Whether the portPairRemoteLocation field is set.
   */
  boolean hasPortPairRemoteLocation();
  /**
   *
   *
   * <pre>
   * [Output Only] Port pair remote location constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API refers only to individual ports, but the UI uses this field when ordering a pair of ports, to prevent users from accidentally ordering something that is incompatible with their cloud provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI requires that both ports use the same remote location.
   * Check the PortPairRemoteLocation enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_pair_remote_location = 495917351;</code>
   *
   * @return The portPairRemoteLocation.
   */
  java.lang.String getPortPairRemoteLocation();
  /**
   *
   *
   * <pre>
   * [Output Only] Port pair remote location constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API refers only to individual ports, but the UI uses this field when ordering a pair of ports, to prevent users from accidentally ordering something that is incompatible with their cloud provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI requires that both ports use the same remote location.
   * Check the PortPairRemoteLocation enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_pair_remote_location = 495917351;</code>
   *
   * @return The bytes for portPairRemoteLocation.
   */
  com.google.protobuf.ByteString getPortPairRemoteLocationBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Port pair VLAN constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
   * Check the PortPairVlan enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_pair_vlan = 478214506;</code>
   *
   * @return Whether the portPairVlan field is set.
   */
  boolean hasPortPairVlan();
  /**
   *
   *
   * <pre>
   * [Output Only] Port pair VLAN constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
   * Check the PortPairVlan enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_pair_vlan = 478214506;</code>
   *
   * @return The portPairVlan.
   */
  java.lang.String getPortPairVlan();
  /**
   *
   *
   * <pre>
   * [Output Only] Port pair VLAN constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
   * Check the PortPairVlan enum for the list of possible values.
   * </pre>
   *
   * <code>optional string port_pair_vlan = 478214506;</code>
   *
   * @return The bytes for portPairVlan.
   */
  com.google.protobuf.ByteString getPortPairVlanBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4 subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30} because Azure requires /30 subnets. This range specifies the values supported by both cloud providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30}.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InterconnectRemoteLocationConstraintsSubnetLengthRange subnet_length_range = 184473670;
   * </code>
   *
   * @return Whether the subnetLengthRange field is set.
   */
  boolean hasSubnetLengthRange();
  /**
   *
   *
   * <pre>
   * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4 subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30} because Azure requires /30 subnets. This range specifies the values supported by both cloud providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30}.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InterconnectRemoteLocationConstraintsSubnetLengthRange subnet_length_range = 184473670;
   * </code>
   *
   * @return The subnetLengthRange.
   */
  com.google.cloud.compute.v1.InterconnectRemoteLocationConstraintsSubnetLengthRange
      getSubnetLengthRange();
  /**
   *
   *
   * <pre>
   * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4 subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30} because Azure requires /30 subnets. This range specifies the values supported by both cloud providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30}.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InterconnectRemoteLocationConstraintsSubnetLengthRange subnet_length_range = 184473670;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectRemoteLocationConstraintsSubnetLengthRangeOrBuilder
      getSubnetLengthRangeOrBuilder();
}
