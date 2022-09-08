// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface ListGcpUserAccessBindingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.ListGcpUserAccessBindingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_bindings = 1;</code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding> 
      getGcpUserAccessBindingsList();
  /**
   * <pre>
   * [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_bindings = 1;</code>
   */
  com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding getGcpUserAccessBindings(int index);
  /**
   * <pre>
   * [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_bindings = 1;</code>
   */
  int getGcpUserAccessBindingsCount();
  /**
   * <pre>
   * [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_bindings = 1;</code>
   */
  java.util.List<? extends com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder> 
      getGcpUserAccessBindingsOrBuilderList();
  /**
   * <pre>
   * [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_bindings = 1;</code>
   */
  com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder getGcpUserAccessBindingsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to get the next page of items. If blank, there are no more items.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to get the next page of items. If blank, there are no more items.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}