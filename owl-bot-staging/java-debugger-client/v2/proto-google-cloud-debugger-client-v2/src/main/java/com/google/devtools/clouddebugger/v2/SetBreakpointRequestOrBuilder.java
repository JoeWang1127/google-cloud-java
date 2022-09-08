// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

public interface SetBreakpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.SetBreakpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the debuggee where the breakpoint is to be set.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggeeId.
   */
  java.lang.String getDebuggeeId();
  /**
   * <pre>
   * Required. ID of the debuggee where the breakpoint is to be set.
   * </pre>
   *
   * <code>string debuggee_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for debuggeeId.
   */
  com.google.protobuf.ByteString
      getDebuggeeIdBytes();

  /**
   * <pre>
   * Required. Breakpoint specification to set.
   * The field `location` of the breakpoint must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the breakpoint field is set.
   */
  boolean hasBreakpoint();
  /**
   * <pre>
   * Required. Breakpoint specification to set.
   * The field `location` of the breakpoint must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The breakpoint.
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint();
  /**
   * <pre>
   * Required. Breakpoint specification to set.
   * The field `location` of the breakpoint must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder();

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