// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

public interface DeleteScheduleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.DeleteScheduleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/schedules/{schedule_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/schedules/{schedule_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}