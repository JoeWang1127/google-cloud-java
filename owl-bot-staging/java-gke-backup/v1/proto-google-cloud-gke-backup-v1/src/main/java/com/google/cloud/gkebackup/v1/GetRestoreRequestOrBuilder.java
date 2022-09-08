// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/gkebackup.proto

package com.google.cloud.gkebackup.v1;

public interface GetRestoreRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.GetRestoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the restore resource.
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the restore resource.
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}