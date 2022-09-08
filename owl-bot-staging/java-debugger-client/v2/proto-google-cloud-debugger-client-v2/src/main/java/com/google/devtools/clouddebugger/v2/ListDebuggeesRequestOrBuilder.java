// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public interface ListDebuggeesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.ListDebuggeesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Project number of a Google Cloud project whose debuggees to list.
   * </pre>
   *
   * <code>string project = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Required. Project number of a Google Cloud project whose debuggees to list.
   * </pre>
   *
   * <code>string project = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * When set to `true`, the result includes all debuggees. Otherwise, the
   * result includes only debuggees that are active.
   * </pre>
   *
   * <code>bool include_inactive = 3;</code>
   * @return The includeInactive.
   */
  boolean getIncludeInactive();

  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientVersion.
   */
  java.lang.String getClientVersion();
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientVersion.
   */
  com.google.protobuf.ByteString
      getClientVersionBytes();
}