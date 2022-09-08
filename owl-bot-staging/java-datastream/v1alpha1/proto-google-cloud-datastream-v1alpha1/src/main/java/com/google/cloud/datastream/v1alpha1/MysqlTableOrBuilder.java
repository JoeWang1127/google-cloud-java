// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface MysqlTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.MysqlTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.MysqlColumn> 
      getMysqlColumnsList();
  /**
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.MysqlColumn getMysqlColumns(int index);
  /**
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  int getMysqlColumnsCount();
  /**
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder> 
      getMysqlColumnsOrBuilderList();
  /**
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder getMysqlColumnsOrBuilder(
      int index);
}