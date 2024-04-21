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
// source: google/cloud/dialogflow/cx/v3/flow.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3;

public interface ExportFlowRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ExportFlowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the flow to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the flow to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
   * unspecified, the serialized flow is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The flowUri.
   */
  java.lang.String getFlowUri();
  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
   * unspecified, the serialized flow is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for flowUri.
   */
  com.google.protobuf.ByteString getFlowUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Whether to export flows referenced by the specified flow.
   * </pre>
   *
   * <code>bool include_referenced_flows = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The includeReferencedFlows.
   */
  boolean getIncludeReferencedFlows();
}
