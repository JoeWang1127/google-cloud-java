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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

public interface NetworkPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.NetworkPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of this network policy.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/networkPolicies/my-network-policy`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of this network policy.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/networkPolicies/my-network-policy`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Network service that allows VMware workloads to access the internet.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService internet_access = 6;</code>
   *
   * @return Whether the internetAccess field is set.
   */
  boolean hasInternetAccess();
  /**
   *
   *
   * <pre>
   * Network service that allows VMware workloads to access the internet.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService internet_access = 6;</code>
   *
   * @return The internetAccess.
   */
  com.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService getInternetAccess();
  /**
   *
   *
   * <pre>
   * Network service that allows VMware workloads to access the internet.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService internet_access = 6;</code>
   */
  com.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkServiceOrBuilder
      getInternetAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Network service that allows External IP addresses to be assigned to VMware
   * workloads. This service can only be enabled when `internet_access` is also
   * enabled.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService external_ip = 7;</code>
   *
   * @return Whether the externalIp field is set.
   */
  boolean hasExternalIp();
  /**
   *
   *
   * <pre>
   * Network service that allows External IP addresses to be assigned to VMware
   * workloads. This service can only be enabled when `internet_access` is also
   * enabled.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService external_ip = 7;</code>
   *
   * @return The externalIp.
   */
  com.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService getExternalIp();
  /**
   *
   *
   * <pre>
   * Network service that allows External IP addresses to be assigned to VMware
   * workloads. This service can only be enabled when `internet_access` is also
   * enabled.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkService external_ip = 7;</code>
   */
  com.google.cloud.vmwareengine.v1.NetworkPolicy.NetworkServiceOrBuilder getExternalIpOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. IP address range in CIDR notation used to create internet access
   * and external IP access. An RFC 1918 CIDR block, with a "/26" prefix, is
   * required. The range cannot overlap with any prefixes either in the consumer
   * VPC network or in use by the private clouds attached to that VPC network.
   * </pre>
   *
   * <code>string edge_services_cidr = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The edgeServicesCidr.
   */
  java.lang.String getEdgeServicesCidr();
  /**
   *
   *
   * <pre>
   * Required. IP address range in CIDR notation used to create internet access
   * and external IP access. An RFC 1918 CIDR block, with a "/26" prefix, is
   * required. The range cannot overlap with any prefixes either in the consumer
   * VPC network or in use by the private clouds attached to that VPC network.
   * </pre>
   *
   * <code>string edge_services_cidr = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for edgeServicesCidr.
   */
  com.google.protobuf.ByteString getEdgeServicesCidrBytes();

  /**
   *
   *
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. The relative resource name of the VMware Engine network.
   * Specify the name in the following form:
   * `projects/{project}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * where `{project}` can either be a project number or a project ID.
   * </pre>
   *
   * <code>
   * string vmware_engine_network = 12 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The vmwareEngineNetwork.
   */
  java.lang.String getVmwareEngineNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The relative resource name of the VMware Engine network.
   * Specify the name in the following form:
   * `projects/{project}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * where `{project}` can either be a project number or a project ID.
   * </pre>
   *
   * <code>
   * string vmware_engine_network = 12 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for vmwareEngineNetwork.
   */
  com.google.protobuf.ByteString getVmwareEngineNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided description for this network policy.
   * </pre>
   *
   * <code>string description = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User-provided description for this network policy.
   * </pre>
   *
   * <code>string description = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The canonical name of the VMware Engine network in the form:
   * `projects/{project_number}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * </pre>
   *
   * <code>
   * string vmware_engine_network_canonical = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The vmwareEngineNetworkCanonical.
   */
  java.lang.String getVmwareEngineNetworkCanonical();
  /**
   *
   *
   * <pre>
   * Output only. The canonical name of the VMware Engine network in the form:
   * `projects/{project_number}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * </pre>
   *
   * <code>
   * string vmware_engine_network_canonical = 14 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for vmwareEngineNetworkCanonical.
   */
  com.google.protobuf.ByteString getVmwareEngineNetworkCanonicalBytes();
}
