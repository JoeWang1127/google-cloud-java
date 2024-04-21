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
// source: google/cloud/dataproc/v1/workflow_templates.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface WorkflowMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.WorkflowMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the workflow template as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *
   * * For `projects.locations.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string template = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The template.
   */
  java.lang.String getTemplate();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the workflow template as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *
   * * For `projects.locations.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string template = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for template.
   */
  com.google.protobuf.ByteString getTemplateBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version of template at the time of
   * workflow instantiation.
   * </pre>
   *
   * <code>int32 version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The version.
   */
  int getVersion();

  /**
   *
   *
   * <pre>
   * Output only. The create cluster operation metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperation create_cluster = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createCluster field is set.
   */
  boolean hasCreateCluster();
  /**
   *
   *
   * <pre>
   * Output only. The create cluster operation metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperation create_cluster = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createCluster.
   */
  com.google.cloud.dataproc.v1.ClusterOperation getCreateCluster();
  /**
   *
   *
   * <pre>
   * Output only. The create cluster operation metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperation create_cluster = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterOperationOrBuilder getCreateClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The workflow graph.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowGraph graph = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the graph field is set.
   */
  boolean hasGraph();
  /**
   *
   *
   * <pre>
   * Output only. The workflow graph.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowGraph graph = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The graph.
   */
  com.google.cloud.dataproc.v1.WorkflowGraph getGraph();
  /**
   *
   *
   * <pre>
   * Output only. The workflow graph.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowGraph graph = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.WorkflowGraphOrBuilder getGraphOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The delete cluster operation metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperation delete_cluster = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteCluster field is set.
   */
  boolean hasDeleteCluster();
  /**
   *
   *
   * <pre>
   * Output only. The delete cluster operation metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperation delete_cluster = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteCluster.
   */
  com.google.cloud.dataproc.v1.ClusterOperation getDeleteCluster();
  /**
   *
   *
   * <pre>
   * Output only. The delete cluster operation metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperation delete_cluster = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterOperationOrBuilder getDeleteClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The workflow state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowMetadata.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The workflow state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowMetadata.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataproc.v1.WorkflowMetadata.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The name of the target cluster.
   * </pre>
   *
   * <code>string cluster_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the target cluster.
   * </pre>
   *
   * <code>string cluster_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Map from parameter names to values that were used for those parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Map from parameter names to values that were used for those parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  boolean containsParameters(java.lang.String key);
  /** Use {@link #getParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParameters();
  /**
   *
   *
   * <pre>
   * Map from parameter names to values that were used for those parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParametersMap();
  /**
   *
   *
   * <pre>
   * Map from parameter names to values that were used for those parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  /* nullable */
  java.lang.String getParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Map from parameter names to values that were used for those parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  java.lang.String getParametersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Workflow start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Workflow start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Workflow start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Workflow end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Workflow end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Workflow end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The UUID of target cluster.
   * </pre>
   *
   * <code>string cluster_uuid = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterUuid.
   */
  java.lang.String getClusterUuid();
  /**
   *
   *
   * <pre>
   * Output only. The UUID of target cluster.
   * </pre>
   *
   * <code>string cluster_uuid = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterUuid.
   */
  com.google.protobuf.ByteString getClusterUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timeout duration for the DAG of jobs, expressed in seconds
   * (see [JSON representation of
   * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration dag_timeout = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dagTimeout field is set.
   */
  boolean hasDagTimeout();
  /**
   *
   *
   * <pre>
   * Output only. The timeout duration for the DAG of jobs, expressed in seconds
   * (see [JSON representation of
   * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration dag_timeout = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dagTimeout.
   */
  com.google.protobuf.Duration getDagTimeout();
  /**
   *
   *
   * <pre>
   * Output only. The timeout duration for the DAG of jobs, expressed in seconds
   * (see [JSON representation of
   * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration dag_timeout = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getDagTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. DAG start time, only set for workflows with
   * [dag_timeout][google.cloud.dataproc.v1.WorkflowMetadata.dag_timeout] when
   * DAG begins.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp dag_start_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dagStartTime field is set.
   */
  boolean hasDagStartTime();
  /**
   *
   *
   * <pre>
   * Output only. DAG start time, only set for workflows with
   * [dag_timeout][google.cloud.dataproc.v1.WorkflowMetadata.dag_timeout] when
   * DAG begins.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp dag_start_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dagStartTime.
   */
  com.google.protobuf.Timestamp getDagStartTime();
  /**
   *
   *
   * <pre>
   * Output only. DAG start time, only set for workflows with
   * [dag_timeout][google.cloud.dataproc.v1.WorkflowMetadata.dag_timeout] when
   * DAG begins.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp dag_start_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDagStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. DAG end time, only set for workflows with
   * [dag_timeout][google.cloud.dataproc.v1.WorkflowMetadata.dag_timeout] when
   * DAG ends.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp dag_end_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dagEndTime field is set.
   */
  boolean hasDagEndTime();
  /**
   *
   *
   * <pre>
   * Output only. DAG end time, only set for workflows with
   * [dag_timeout][google.cloud.dataproc.v1.WorkflowMetadata.dag_timeout] when
   * DAG ends.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp dag_end_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dagEndTime.
   */
  com.google.protobuf.Timestamp getDagEndTime();
  /**
   *
   *
   * <pre>
   * Output only. DAG end time, only set for workflows with
   * [dag_timeout][google.cloud.dataproc.v1.WorkflowMetadata.dag_timeout] when
   * DAG ends.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp dag_end_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDagEndTimeOrBuilder();
}
