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
// source: google/cloud/aiplatform/v1/match_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface FindNeighborsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FindNeighborsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the index endpoint.
   * Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The indexEndpoint.
   */
  java.lang.String getIndexEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the index endpoint.
   * Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for indexEndpoint.
   */
  com.google.protobuf.ByteString getIndexEndpointBytes();

  /**
   *
   *
   * <pre>
   * The ID of the DeployedIndex that will serve the request. This request is
   * sent to a specific IndexEndpoint, as per the IndexEndpoint.network. That
   * IndexEndpoint also has IndexEndpoint.deployed_indexes, and each such index
   * has a DeployedIndex.id field.
   * The value of the field below must equal one of the DeployedIndex.id
   * fields of the IndexEndpoint that is being called for this request.
   * </pre>
   *
   * <code>string deployed_index_id = 2;</code>
   *
   * @return The deployedIndexId.
   */
  java.lang.String getDeployedIndexId();
  /**
   *
   *
   * <pre>
   * The ID of the DeployedIndex that will serve the request. This request is
   * sent to a specific IndexEndpoint, as per the IndexEndpoint.network. That
   * IndexEndpoint also has IndexEndpoint.deployed_indexes, and each such index
   * has a DeployedIndex.id field.
   * The value of the field below must equal one of the DeployedIndex.id
   * fields of the IndexEndpoint that is being called for this request.
   * </pre>
   *
   * <code>string deployed_index_id = 2;</code>
   *
   * @return The bytes for deployedIndexId.
   */
  com.google.protobuf.ByteString getDeployedIndexIdBytes();

  /**
   *
   *
   * <pre>
   * The list of queries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FindNeighborsRequest.Query queries = 3;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.FindNeighborsRequest.Query> getQueriesList();
  /**
   *
   *
   * <pre>
   * The list of queries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FindNeighborsRequest.Query queries = 3;</code>
   */
  com.google.cloud.aiplatform.v1.FindNeighborsRequest.Query getQueries(int index);
  /**
   *
   *
   * <pre>
   * The list of queries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FindNeighborsRequest.Query queries = 3;</code>
   */
  int getQueriesCount();
  /**
   *
   *
   * <pre>
   * The list of queries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FindNeighborsRequest.Query queries = 3;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.FindNeighborsRequest.QueryOrBuilder>
      getQueriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of queries.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FindNeighborsRequest.Query queries = 3;</code>
   */
  com.google.cloud.aiplatform.v1.FindNeighborsRequest.QueryOrBuilder getQueriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If set to true, the full datapoints (including all vector values and
   * restricts) of the nearest neighbors are returned.
   * Note that returning full datapoint will significantly increase the
   * latency and cost of the query.
   * </pre>
   *
   * <code>bool return_full_datapoint = 4;</code>
   *
   * @return The returnFullDatapoint.
   */
  boolean getReturnFullDatapoint();
}
