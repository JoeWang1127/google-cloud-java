// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface UpdateMuteConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.UpdateMuteConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The mute config being updated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MuteConfig mute_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the muteConfig field is set.
   */
  boolean hasMuteConfig();
  /**
   * <pre>
   * Required. The mute config being updated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MuteConfig mute_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The muteConfig.
   */
  com.google.cloud.securitycenter.v1.MuteConfig getMuteConfig();
  /**
   * <pre>
   * Required. The mute config being updated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MuteConfig mute_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securitycenter.v1.MuteConfigOrBuilder getMuteConfigOrBuilder();

  /**
   * <pre>
   * The list of fields to be updated.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}