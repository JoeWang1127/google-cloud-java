// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface TimedCountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.TimedCount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Approximate number of occurrences in the given time period.
   * </pre>
   *
   * <code>int64 count = 1;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * Start of the time period to which `count` refers (included).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Start of the time period to which `count` refers (included).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Start of the time period to which `count` refers (included).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * End of the time period to which `count` refers (excluded).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * End of the time period to which `count` refers (excluded).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * End of the time period to which `count` refers (excluded).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}