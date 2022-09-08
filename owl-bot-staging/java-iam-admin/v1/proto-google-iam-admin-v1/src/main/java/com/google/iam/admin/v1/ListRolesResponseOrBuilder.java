// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface ListRolesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.ListRolesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  java.util.List<com.google.iam.admin.v1.Role> 
      getRolesList();
  /**
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  com.google.iam.admin.v1.Role getRoles(int index);
  /**
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  int getRolesCount();
  /**
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  java.util.List<? extends com.google.iam.admin.v1.RoleOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <pre>
   * The Roles defined on this resource.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1;</code>
   */
  com.google.iam.admin.v1.RoleOrBuilder getRolesOrBuilder(
      int index);

  /**
   * <pre>
   * To retrieve the next page of results, set
   * `ListRolesRequest.page_token` to this value.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * To retrieve the next page of results, set
   * `ListRolesRequest.page_token` to this value.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}