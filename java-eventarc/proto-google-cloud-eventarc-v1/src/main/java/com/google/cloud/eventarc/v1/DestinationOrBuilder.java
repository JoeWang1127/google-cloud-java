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
// source: google/cloud/eventarc/v1/trigger.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.eventarc.v1;

public interface DestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Destination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Run fully-managed resource that receives the events. The resource
   * should be in the same project as the trigger.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.CloudRun cloud_run = 1;</code>
   *
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   *
   *
   * <pre>
   * Cloud Run fully-managed resource that receives the events. The resource
   * should be in the same project as the trigger.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.CloudRun cloud_run = 1;</code>
   *
   * @return The cloudRun.
   */
  com.google.cloud.eventarc.v1.CloudRun getCloudRun();
  /**
   *
   *
   * <pre>
   * Cloud Run fully-managed resource that receives the events. The resource
   * should be in the same project as the trigger.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.CloudRun cloud_run = 1;</code>
   */
  com.google.cloud.eventarc.v1.CloudRunOrBuilder getCloudRunOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Function resource name. Only Cloud Functions V2 is supported.
   * Format: `projects/{project}/locations/{location}/functions/{function}`
   * </pre>
   *
   * <code>string cloud_function = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the cloudFunction field is set.
   */
  boolean hasCloudFunction();
  /**
   *
   *
   * <pre>
   * The Cloud Function resource name. Only Cloud Functions V2 is supported.
   * Format: `projects/{project}/locations/{location}/functions/{function}`
   * </pre>
   *
   * <code>string cloud_function = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The cloudFunction.
   */
  java.lang.String getCloudFunction();
  /**
   *
   *
   * <pre>
   * The Cloud Function resource name. Only Cloud Functions V2 is supported.
   * Format: `projects/{project}/locations/{location}/functions/{function}`
   * </pre>
   *
   * <code>string cloud_function = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for cloudFunction.
   */
  com.google.protobuf.ByteString getCloudFunctionBytes();

  /**
   *
   *
   * <pre>
   * A GKE service capable of receiving events. The service should be running
   * in the same project as the trigger.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.GKE gke = 3;</code>
   *
   * @return Whether the gke field is set.
   */
  boolean hasGke();
  /**
   *
   *
   * <pre>
   * A GKE service capable of receiving events. The service should be running
   * in the same project as the trigger.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.GKE gke = 3;</code>
   *
   * @return The gke.
   */
  com.google.cloud.eventarc.v1.GKE getGke();
  /**
   *
   *
   * <pre>
   * A GKE service capable of receiving events. The service should be running
   * in the same project as the trigger.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.GKE gke = 3;</code>
   */
  com.google.cloud.eventarc.v1.GKEOrBuilder getGkeOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of the Workflow whose Executions are triggered by
   * the events. The Workflow resource should be deployed in the same project
   * as the trigger.
   * Format: `projects/{project}/locations/{location}/workflows/{workflow}`
   * </pre>
   *
   * <code>string workflow = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the workflow field is set.
   */
  boolean hasWorkflow();
  /**
   *
   *
   * <pre>
   * The resource name of the Workflow whose Executions are triggered by
   * the events. The Workflow resource should be deployed in the same project
   * as the trigger.
   * Format: `projects/{project}/locations/{location}/workflows/{workflow}`
   * </pre>
   *
   * <code>string workflow = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The workflow.
   */
  java.lang.String getWorkflow();
  /**
   *
   *
   * <pre>
   * The resource name of the Workflow whose Executions are triggered by
   * the events. The Workflow resource should be deployed in the same project
   * as the trigger.
   * Format: `projects/{project}/locations/{location}/workflows/{workflow}`
   * </pre>
   *
   * <code>string workflow = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for workflow.
   */
  com.google.protobuf.ByteString getWorkflowBytes();

  com.google.cloud.eventarc.v1.Destination.DescriptorCase getDescriptorCase();
}
