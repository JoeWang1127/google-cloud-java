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

public interface PrivateConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.PrivateConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the private connection.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/privateConnections/my-connection`
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
   * Output only. The resource name of the private connection.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/privateConnections/my-connection`
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
   * Optional. User-provided description for this private connection.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User-provided description for this private connection.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the private connection.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the private connection.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.vmwareengine.v1.PrivateConnection.State getState();

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of Legacy VMware Engine network.
   * Specify the name in the following form:
   * `projects/{project}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * where `{project}`, `{location}` will be same as specified in private
   * connection resource name and `{vmware_engine_network_id}` will be in the
   * form of `{location}`-default e.g.
   * projects/project/locations/us-central1/vmwareEngineNetworks/us-central1-default.
   * </pre>
   *
   * <code>
   * string vmware_engine_network = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The vmwareEngineNetwork.
   */
  java.lang.String getVmwareEngineNetwork();
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of Legacy VMware Engine network.
   * Specify the name in the following form:
   * `projects/{project}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * where `{project}`, `{location}` will be same as specified in private
   * connection resource name and `{vmware_engine_network_id}` will be in the
   * form of `{location}`-default e.g.
   * projects/project/locations/us-central1/vmwareEngineNetworks/us-central1-default.
   * </pre>
   *
   * <code>
   * string vmware_engine_network = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for vmwareEngineNetwork.
   */
  com.google.protobuf.ByteString getVmwareEngineNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The canonical name of the VMware Engine network in the form:
   * `projects/{project_number}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network_id}`
   * </pre>
   *
   * <code>
   * string vmware_engine_network_canonical = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
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
   * string vmware_engine_network_canonical = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for vmwareEngineNetworkCanonical.
   */
  com.google.protobuf.ByteString getVmwareEngineNetworkCanonicalBytes();

  /**
   *
   *
   * <pre>
   * Required. Private connection type.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.Type type = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Private connection type.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.Type type = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.vmwareengine.v1.PrivateConnection.Type getType();

  /**
   *
   *
   * <pre>
   * Output only. VPC network peering id between given network VPC and
   * VMwareEngineNetwork.
   * </pre>
   *
   * <code>string peering_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The peeringId.
   */
  java.lang.String getPeeringId();
  /**
   *
   *
   * <pre>
   * Output only. VPC network peering id between given network VPC and
   * VMwareEngineNetwork.
   * </pre>
   *
   * <code>string peering_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for peeringId.
   */
  com.google.protobuf.ByteString getPeeringIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Routing Mode.
   * Default value is set to GLOBAL.
   * For type = PRIVATE_SERVICE_ACCESS, this field can be set to GLOBAL or
   * REGIONAL, for other types only GLOBAL is supported.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.RoutingMode routing_mode = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for routingMode.
   */
  int getRoutingModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Routing Mode.
   * Default value is set to GLOBAL.
   * For type = PRIVATE_SERVICE_ACCESS, this field can be set to GLOBAL or
   * REGIONAL, for other types only GLOBAL is supported.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.RoutingMode routing_mode = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The routingMode.
   */
  com.google.cloud.vmwareengine.v1.PrivateConnection.RoutingMode getRoutingMode();

  /**
   *
   *
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * <code>string uid = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Required. Service network to create private connection.
   * Specify the name in the following form:
   * `projects/{project}/global/networks/{network_id}`
   * For type = PRIVATE_SERVICE_ACCESS, this field represents servicenetworking
   * VPC, e.g. projects/project-tp/global/networks/servicenetworking.
   * For type = NETAPP_CLOUD_VOLUME, this field represents NetApp service VPC,
   * e.g. projects/project-tp/global/networks/netapp-tenant-vpc.
   * For type = DELL_POWERSCALE, this field represent Dell service VPC, e.g.
   * projects/project-tp/global/networks/dell-tenant-vpc.
   * For type= THIRD_PARTY_SERVICE, this field could represent a consumer VPC or
   * any other producer VPC to which the VMware Engine Network needs to be
   * connected, e.g. projects/project/global/networks/vpc.
   * </pre>
   *
   * <code>
   * string service_network = 16 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceNetwork.
   */
  java.lang.String getServiceNetwork();
  /**
   *
   *
   * <pre>
   * Required. Service network to create private connection.
   * Specify the name in the following form:
   * `projects/{project}/global/networks/{network_id}`
   * For type = PRIVATE_SERVICE_ACCESS, this field represents servicenetworking
   * VPC, e.g. projects/project-tp/global/networks/servicenetworking.
   * For type = NETAPP_CLOUD_VOLUME, this field represents NetApp service VPC,
   * e.g. projects/project-tp/global/networks/netapp-tenant-vpc.
   * For type = DELL_POWERSCALE, this field represent Dell service VPC, e.g.
   * projects/project-tp/global/networks/dell-tenant-vpc.
   * For type= THIRD_PARTY_SERVICE, this field could represent a consumer VPC or
   * any other producer VPC to which the VMware Engine Network needs to be
   * connected, e.g. projects/project/global/networks/vpc.
   * </pre>
   *
   * <code>
   * string service_network = 16 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceNetwork.
   */
  com.google.protobuf.ByteString getServiceNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. Peering state between service network and VMware Engine
   * network.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.PeeringState peering_state = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for peeringState.
   */
  int getPeeringStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Peering state between service network and VMware Engine
   * network.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.PrivateConnection.PeeringState peering_state = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The peeringState.
   */
  com.google.cloud.vmwareengine.v1.PrivateConnection.PeeringState getPeeringState();
}
