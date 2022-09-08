// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface OracleSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.OracleSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();

  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.OracleTable> 
      getOracleTablesList();
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  com.google.cloud.datastream.v1.OracleTable getOracleTables(int index);
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  int getOracleTablesCount();
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.OracleTableOrBuilder> 
      getOracleTablesOrBuilderList();
  /**
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  com.google.cloud.datastream.v1.OracleTableOrBuilder getOracleTablesOrBuilder(
      int index);
}