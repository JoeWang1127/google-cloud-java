// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface CreateRowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.CreateRowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent table where this row will be created.
   * Format: tables/{table}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent table where this row will be created.
   * Format: tables/{table}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The row to create.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.Row row = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the row field is set.
   */
  boolean hasRow();
  /**
   * <pre>
   * Required. The row to create.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.Row row = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The row.
   */
  com.google.area120.tables.v1alpha1.Row getRow();
  /**
   * <pre>
   * Required. The row to create.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.Row row = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.area120.tables.v1alpha1.RowOrBuilder getRowOrBuilder();

  /**
   * <pre>
   * Optional. Column key to use for values in the row.
   * Defaults to user entered name.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. Column key to use for values in the row.
   * Defaults to user entered name.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.area120.tables.v1alpha1.View getView();
}