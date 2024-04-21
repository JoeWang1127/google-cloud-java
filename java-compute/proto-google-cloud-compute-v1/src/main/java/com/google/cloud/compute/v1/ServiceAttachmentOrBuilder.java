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

public interface ServiceAttachmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ServiceAttachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the consumers connected to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint connected_endpoints = 72223688;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint>
      getConnectedEndpointsList();
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the consumers connected to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint connected_endpoints = 72223688;
   * </code>
   */
  com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint getConnectedEndpoints(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the consumers connected to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint connected_endpoints = 72223688;
   * </code>
   */
  int getConnectedEndpointsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the consumers connected to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint connected_endpoints = 72223688;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpointOrBuilder>
      getConnectedEndpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] An array of connections for all the consumers connected to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint connected_endpoints = 72223688;
   * </code>
   */
  com.google.cloud.compute.v1.ServiceAttachmentConnectedEndpointOrBuilder
      getConnectedEndpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
   * Check the ConnectionPreference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_preference = 285818076;</code>
   *
   * @return Whether the connectionPreference field is set.
   */
  boolean hasConnectionPreference();
  /**
   *
   *
   * <pre>
   * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
   * Check the ConnectionPreference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_preference = 285818076;</code>
   *
   * @return The connectionPreference.
   */
  java.lang.String getConnectionPreference();
  /**
   *
   *
   * <pre>
   * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
   * Check the ConnectionPreference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string connection_preference = 285818076;</code>
   *
   * @return The bytes for connectionPreference.
   */
  com.google.protobuf.ByteString getConnectionPreferenceBytes();

  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit consumer_accept_lists = 402725703;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit>
      getConsumerAcceptListsList();
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit consumer_accept_lists = 402725703;
   * </code>
   */
  com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit getConsumerAcceptLists(
      int index);
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit consumer_accept_lists = 402725703;
   * </code>
   */
  int getConsumerAcceptListsCount();
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit consumer_accept_lists = 402725703;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimitOrBuilder>
      getConsumerAcceptListsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Projects that are allowed to connect to this service attachment.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit consumer_accept_lists = 402725703;
   * </code>
   */
  com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimitOrBuilder
      getConsumerAcceptListsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string consumer_reject_lists = 204033182;</code>
   *
   * @return A list containing the consumerRejectLists.
   */
  java.util.List<java.lang.String> getConsumerRejectListsList();
  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string consumer_reject_lists = 204033182;</code>
   *
   * @return The count of consumerRejectLists.
   */
  int getConsumerRejectListsCount();
  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string consumer_reject_lists = 204033182;</code>
   *
   * @param index The index of the element to return.
   * @return The consumerRejectLists at the given index.
   */
  java.lang.String getConsumerRejectLists(int index);
  /**
   *
   *
   * <pre>
   * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
   * </pre>
   *
   * <code>repeated string consumer_reject_lists = 204033182;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the consumerRejectLists at the given index.
   */
  com.google.protobuf.ByteString getConsumerRejectListsBytes(int index);

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
   * An optional description of this resource. Provide this property when you create the resource.
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
   * An optional description of this resource. Provide this property when you create the resource.
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
   * An optional description of this resource. Provide this property when you create the resource.
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
   * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
   * </pre>
   *
   * <code>repeated string domain_names = 6450189;</code>
   *
   * @return A list containing the domainNames.
   */
  java.util.List<java.lang.String> getDomainNamesList();
  /**
   *
   *
   * <pre>
   * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
   * </pre>
   *
   * <code>repeated string domain_names = 6450189;</code>
   *
   * @return The count of domainNames.
   */
  int getDomainNamesCount();
  /**
   *
   *
   * <pre>
   * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
   * </pre>
   *
   * <code>repeated string domain_names = 6450189;</code>
   *
   * @param index The index of the element to return.
   * @return The domainNames at the given index.
   */
  java.lang.String getDomainNames(int index);
  /**
   *
   *
   * <pre>
   * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
   * </pre>
   *
   * <code>repeated string domain_names = 6450189;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the domainNames at the given index.
   */
  com.google.protobuf.ByteString getDomainNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
   * </pre>
   *
   * <code>optional bool enable_proxy_protocol = 363791237;</code>
   *
   * @return Whether the enableProxyProtocol field is set.
   */
  boolean hasEnableProxyProtocol();
  /**
   *
   *
   * <pre>
   * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
   * </pre>
   *
   * <code>optional bool enable_proxy_protocol = 363791237;</code>
   *
   * @return The enableProxyProtocol.
   */
  boolean getEnableProxyProtocol();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource type. The server generates this identifier.
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
   * [Output Only] The unique identifier for the resource type. The server generates this identifier.
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
   * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
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
   * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
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
   * [Output Only] Type of the resource. Always compute#serviceAttachment for service attachments.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
   * </pre>
   *
   * <code>repeated string nat_subnets = 374785944;</code>
   *
   * @return A list containing the natSubnets.
   */
  java.util.List<java.lang.String> getNatSubnetsList();
  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
   * </pre>
   *
   * <code>repeated string nat_subnets = 374785944;</code>
   *
   * @return The count of natSubnets.
   */
  int getNatSubnetsCount();
  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
   * </pre>
   *
   * <code>repeated string nat_subnets = 374785944;</code>
   *
   * @param index The index of the element to return.
   * @return The natSubnets at the given index.
   */
  java.lang.String getNatSubnets(int index);
  /**
   *
   *
   * <pre>
   * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
   * </pre>
   *
   * <code>repeated string nat_subnets = 374785944;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the natSubnets at the given index.
   */
  com.google.protobuf.ByteString getNatSubnetsBytes(int index);

  /**
   *
   *
   * <pre>
   * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
   * </pre>
   *
   * <code>optional string producer_forwarding_rule = 247927889;</code>
   *
   * @return Whether the producerForwardingRule field is set.
   */
  boolean hasProducerForwardingRule();
  /**
   *
   *
   * <pre>
   * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
   * </pre>
   *
   * <code>optional string producer_forwarding_rule = 247927889;</code>
   *
   * @return The producerForwardingRule.
   */
  java.lang.String getProducerForwardingRule();
  /**
   *
   *
   * <pre>
   * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
   * </pre>
   *
   * <code>optional string producer_forwarding_rule = 247927889;</code>
   *
   * @return The bytes for producerForwardingRule.
   */
  com.google.protobuf.ByteString getProducerForwardingRuleBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] An 128-bit global unique ID of the PSC service attachment.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Uint128 psc_service_attachment_id = 527695214;</code>
   *
   * @return Whether the pscServiceAttachmentId field is set.
   */
  boolean hasPscServiceAttachmentId();
  /**
   *
   *
   * <pre>
   * [Output Only] An 128-bit global unique ID of the PSC service attachment.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Uint128 psc_service_attachment_id = 527695214;</code>
   *
   * @return The pscServiceAttachmentId.
   */
  com.google.cloud.compute.v1.Uint128 getPscServiceAttachmentId();
  /**
   *
   *
   * <pre>
   * [Output Only] An 128-bit global unique ID of the PSC service attachment.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Uint128 psc_service_attachment_id = 527695214;</code>
   */
  com.google.cloud.compute.v1.Uint128OrBuilder getPscServiceAttachmentIdOrBuilder();

  /**
   *
   *
   * <pre>
   * This flag determines whether a consumer accept/reject list change can reconcile the statuses of existing ACCEPTED or REJECTED PSC endpoints. - If false, connection policy update will only affect existing PENDING PSC endpoints. Existing ACCEPTED/REJECTED endpoints will remain untouched regardless how the connection policy is modified . - If true, update will affect both PENDING and ACCEPTED/REJECTED PSC endpoints. For example, an ACCEPTED PSC endpoint will be moved to REJECTED if its project is added to the reject list. For newly created service attachment, this boolean defaults to false.
   * </pre>
   *
   * <code>optional bool reconcile_connections = 125493732;</code>
   *
   * @return Whether the reconcileConnections field is set.
   */
  boolean hasReconcileConnections();
  /**
   *
   *
   * <pre>
   * This flag determines whether a consumer accept/reject list change can reconcile the statuses of existing ACCEPTED or REJECTED PSC endpoints. - If false, connection policy update will only affect existing PENDING PSC endpoints. Existing ACCEPTED/REJECTED endpoints will remain untouched regardless how the connection policy is modified . - If true, update will affect both PENDING and ACCEPTED/REJECTED PSC endpoints. For example, an ACCEPTED PSC endpoint will be moved to REJECTED if its project is added to the reject list. For newly created service attachment, this boolean defaults to false.
   * </pre>
   *
   * <code>optional bool reconcile_connections = 125493732;</code>
   *
   * @return The reconcileConnections.
   */
  boolean getReconcileConnections();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

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
   * The URL of a service serving the endpoint identified by this service attachment.
   * </pre>
   *
   * <code>optional string target_service = 1293831;</code>
   *
   * @return Whether the targetService field is set.
   */
  boolean hasTargetService();
  /**
   *
   *
   * <pre>
   * The URL of a service serving the endpoint identified by this service attachment.
   * </pre>
   *
   * <code>optional string target_service = 1293831;</code>
   *
   * @return The targetService.
   */
  java.lang.String getTargetService();
  /**
   *
   *
   * <pre>
   * The URL of a service serving the endpoint identified by this service attachment.
   * </pre>
   *
   * <code>optional string target_service = 1293831;</code>
   *
   * @return The bytes for targetService.
   */
  com.google.protobuf.ByteString getTargetServiceBytes();
}
