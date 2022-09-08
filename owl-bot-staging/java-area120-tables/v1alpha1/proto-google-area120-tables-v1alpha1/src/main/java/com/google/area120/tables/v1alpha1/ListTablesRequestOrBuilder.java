// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface ListTablesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.ListTablesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The maximum number of tables to return. The service may return fewer than
   * this value.
   * If unspecified, at most 20 tables are returned. The maximum value is 100;
   * values above 100 are coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous `ListTables` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListTables` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous `ListTables` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListTables` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}