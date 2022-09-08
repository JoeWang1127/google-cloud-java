// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public interface DeleteBreakpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoint to delete.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  java.lang.String getDebuggeeId();
  /**
   * <pre>
   * Required. ID of the debuggee whose breakpoint to delete.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  com.google.protobuf.ByteString
      getDebuggeeIdBytes();

  /**
   * <pre>
   * Required. ID of the breakpoint to delete.
   * </pre>
   *
   * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The breakpointId.
   */
  java.lang.String getBreakpointId();
  /**
   * <pre>
   * Required. ID of the breakpoint to delete.
   * </pre>
   *
   * <code>string breakpoint_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for breakpointId.
   */
  com.google.protobuf.ByteString
      getBreakpointIdBytes();

  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientVersion.
   */
  java.lang.String getClientVersion();
  /**
   * <pre>
   * Required. The client version making the call.
   * Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clientVersion.
   */
  com.google.protobuf.ByteString
      getClientVersionBytes();
}