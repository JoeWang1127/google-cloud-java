/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/metrics.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

public interface JobMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.JobMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Timestamp as of which metric values are current.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp metric_time = 1;</code>
   *
   * @return Whether the metricTime field is set.
   */
  boolean hasMetricTime();
  /**
   *
   *
   * <pre>
   * Timestamp as of which metric values are current.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp metric_time = 1;</code>
   *
   * @return The metricTime.
   */
  com.google.protobuf.Timestamp getMetricTime();
  /**
   *
   *
   * <pre>
   * Timestamp as of which metric values are current.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp metric_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMetricTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.MetricUpdate> getMetricsList();
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  com.google.dataflow.v1beta3.MetricUpdate getMetrics(int index);
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.MetricUpdateOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  com.google.dataflow.v1beta3.MetricUpdateOrBuilder getMetricsOrBuilder(int index);
}
