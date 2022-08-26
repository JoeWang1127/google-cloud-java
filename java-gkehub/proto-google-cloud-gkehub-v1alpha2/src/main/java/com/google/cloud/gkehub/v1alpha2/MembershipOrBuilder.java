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
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public interface MembershipOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha2.Membership)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The full, unique name of this Membership resource in the format
   * `projects/&#42;&#47;locations/&#42;&#47;memberships/{membership_id}`, set during creation.
   * `membership_id` must be a valid RFC 1123 compliant DNS label:
   *   1. At most 63 characters in length
   *   2. It must consist of lower case alphanumeric characters or `-`
   *   3. It must start and end with an alphanumeric character
   * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
   * with a maximum length of 63 characters.
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
   * Output only. The full, unique name of this Membership resource in the format
   * `projects/&#42;&#47;locations/&#42;&#47;memberships/{membership_id}`, set during creation.
   * `membership_id` must be a valid RFC 1123 compliant DNS label:
   *   1. At most 63 characters in length
   *   2. It must consist of lower case alphanumeric characters or `-`
   *   3. It must start and end with an alphanumeric character
   * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
   * with a maximum length of 63 characters.
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
   * Optional. GCP labels for this membership.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. GCP labels for this membership.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. GCP labels for this membership.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. GCP labels for this membership.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. GCP labels for this membership.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Description of this membership, limited to 63 characters.
   * Must match the regex: `[a-zA-Z0-9][a-zA-Z0-9_&#92;-&#92;.&#92; ]*`
   * This field is present for legacy purposes.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Output only. Description of this membership, limited to 63 characters.
   * Must match the regex: `[a-zA-Z0-9][a-zA-Z0-9_&#92;-&#92;.&#92; ]*`
   * This field is present for legacy purposes.
   * </pre>
   *
   * <code>string description = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Endpoint information to reach this member.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.MembershipEndpoint endpoint = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   *
   *
   * <pre>
   * Optional. Endpoint information to reach this member.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.MembershipEndpoint endpoint = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The endpoint.
   */
  com.google.cloud.gkehub.v1alpha2.MembershipEndpoint getEndpoint();
  /**
   *
   *
   * <pre>
   * Optional. Endpoint information to reach this member.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.MembershipEndpoint endpoint = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkehub.v1alpha2.MembershipEndpointOrBuilder getEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the Membership resource.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.MembershipState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * Output only. State of the Membership resource.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.MembershipState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkehub.v1alpha2.MembershipState getState();
  /**
   *
   *
   * <pre>
   * Output only. State of the Membership resource.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.MembershipState state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.v1alpha2.MembershipStateOrBuilder getStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the Membership was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Membership was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Membership was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the Membership was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Membership was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Membership was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the Membership was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Membership was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. When the Membership was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An externally-generated and managed ID for this Membership. This ID may
   * be modified after creation, but this is not recommended. For GKE clusters,
   * external_id is managed by the Hub API and updates will be ignored.
   * The ID must match the regex: `[a-zA-Z0-9][a-zA-Z0-9_&#92;-&#92;.]*`
   * If this Membership represents a Kubernetes cluster, this value should be
   * set to the UID of the `kube-system` namespace object.
   * </pre>
   *
   * <code>string external_id = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   *
   *
   * <pre>
   * Optional. An externally-generated and managed ID for this Membership. This ID may
   * be modified after creation, but this is not recommended. For GKE clusters,
   * external_id is managed by the Hub API and updates will be ignored.
   * The ID must match the regex: `[a-zA-Z0-9][a-zA-Z0-9_&#92;-&#92;.]*`
   * If this Membership represents a Kubernetes cluster, this value should be
   * set to the UID of the `kube-system` namespace object.
   * </pre>
   *
   * <code>string external_id = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString getExternalIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. How to identify workloads from this Membership.
   * See the documentation on Workload Identity for more details:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Authority authority = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the authority field is set.
   */
  boolean hasAuthority();
  /**
   *
   *
   * <pre>
   * Optional. How to identify workloads from this Membership.
   * See the documentation on Workload Identity for more details:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Authority authority = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The authority.
   */
  com.google.cloud.gkehub.v1alpha2.Authority getAuthority();
  /**
   *
   *
   * <pre>
   * Optional. How to identify workloads from this Membership.
   * See the documentation on Workload Identity for more details:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Authority authority = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkehub.v1alpha2.AuthorityOrBuilder getAuthorityOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. For clusters using Connect, the timestamp of the most recent connection
   * established with Google Cloud. This time is updated every several minutes,
   * not continuously. For clusters that do not use GKE Connect, or that have
   * never connected successfully, this field will be unset.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_connection_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastConnectionTime field is set.
   */
  boolean hasLastConnectionTime();
  /**
   *
   *
   * <pre>
   * Output only. For clusters using Connect, the timestamp of the most recent connection
   * established with Google Cloud. This time is updated every several minutes,
   * not continuously. For clusters that do not use GKE Connect, or that have
   * never connected successfully, this field will be unset.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_connection_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastConnectionTime.
   */
  com.google.protobuf.Timestamp getLastConnectionTime();
  /**
   *
   *
   * <pre>
   * Output only. For clusters using Connect, the timestamp of the most recent connection
   * established with Google Cloud. This time is updated every several minutes,
   * not continuously. For clusters that do not use GKE Connect, or that have
   * never connected successfully, this field will be unset.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_connection_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastConnectionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across all
   * Membership resources. If a Membership resource is deleted and another
   * resource with the same name is created, it gets a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   *
   *
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across all
   * Membership resources. If a Membership resource is deleted and another
   * resource with the same name is created, it gets a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString getUniqueIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The infrastructure type this Membership is running on.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Membership.InfrastructureType infrastructure_type = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for infrastructureType.
   */
  int getInfrastructureTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The infrastructure type this Membership is running on.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Membership.InfrastructureType infrastructure_type = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The infrastructureType.
   */
  com.google.cloud.gkehub.v1alpha2.Membership.InfrastructureType getInfrastructureType();

  public com.google.cloud.gkehub.v1alpha2.Membership.TypeCase getTypeCase();
}