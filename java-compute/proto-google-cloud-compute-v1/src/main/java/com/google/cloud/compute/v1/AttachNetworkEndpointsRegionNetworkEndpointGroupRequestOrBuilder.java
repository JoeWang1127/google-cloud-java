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

public interface AttachNetworkEndpointsRegionNetworkEndpointGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AttachNetworkEndpointsRegionNetworkEndpointGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the network endpoint group where you are attaching network endpoints to. It should comply with RFC1035.
   * </pre>
   *
   * <code>string network_endpoint_group = 433907078 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The networkEndpointGroup.
   */
  java.lang.String getNetworkEndpointGroup();
  /**
   *
   *
   * <pre>
   * The name of the network endpoint group where you are attaching network endpoints to. It should comply with RFC1035.
   * </pre>
   *
   * <code>string network_endpoint_group = 433907078 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for networkEndpointGroup.
   */
  com.google.protobuf.ByteString getNetworkEndpointGroupBytes();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The name of the region where you want to create the network endpoint group. It should comply with RFC1035.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * The name of the region where you want to create the network endpoint group. It should comply with RFC1035.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionNetworkEndpointGroupsAttachEndpointsRequest region_network_endpoint_groups_attach_endpoints_request_resource = 334986492 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the regionNetworkEndpointGroupsAttachEndpointsRequestResource field is set.
   */
  boolean hasRegionNetworkEndpointGroupsAttachEndpointsRequestResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionNetworkEndpointGroupsAttachEndpointsRequest region_network_endpoint_groups_attach_endpoints_request_resource = 334986492 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The regionNetworkEndpointGroupsAttachEndpointsRequestResource.
   */
  com.google.cloud.compute.v1.RegionNetworkEndpointGroupsAttachEndpointsRequest
      getRegionNetworkEndpointGroupsAttachEndpointsRequestResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionNetworkEndpointGroupsAttachEndpointsRequest region_network_endpoint_groups_attach_endpoints_request_resource = 334986492 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.RegionNetworkEndpointGroupsAttachEndpointsRequestOrBuilder
      getRegionNetworkEndpointGroupsAttachEndpointsRequestResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
