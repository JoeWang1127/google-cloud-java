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
// source: google/cloud/websecurityscanner/v1alpha/scan_run.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1alpha;

public interface ScanRunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.ScanRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the ScanRun. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
   * The ScanRun IDs are generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the ScanRun. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
   * The ScanRun IDs are generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The execution state of the ScanRun.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun.ExecutionState execution_state = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for executionState.
   */
  int getExecutionStateValue();
  /**
   *
   *
   * <pre>
   * The execution state of the ScanRun.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun.ExecutionState execution_state = 2;
   * </code>
   *
   * @return The executionState.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanRun.ExecutionState getExecutionState();

  /**
   *
   *
   * <pre>
   * The result state of the ScanRun. This field is only available after the
   * execution state reaches "FINISHED".
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun.ResultState result_state = 3;</code>
   *
   * @return The enum numeric value on the wire for resultState.
   */
  int getResultStateValue();
  /**
   *
   *
   * <pre>
   * The result state of the ScanRun. This field is only available after the
   * execution state reaches "FINISHED".
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun.ResultState result_state = 3;</code>
   *
   * @return The resultState.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanRun.ResultState getResultState();

  /**
   *
   *
   * <pre>
   * The time at which the ScanRun started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time at which the ScanRun started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time at which the ScanRun started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the ScanRun reached termination state - that the ScanRun
   * is either finished or stopped by user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time at which the ScanRun reached termination state - that the ScanRun
   * is either finished or stopped by user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time at which the ScanRun reached termination state - that the ScanRun
   * is either finished or stopped by user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of URLs crawled during this ScanRun. If the scan is in progress,
   * the value represents the number of URLs crawled up to now.
   * </pre>
   *
   * <code>int64 urls_crawled_count = 6;</code>
   *
   * @return The urlsCrawledCount.
   */
  long getUrlsCrawledCount();

  /**
   *
   *
   * <pre>
   * The number of URLs tested during this ScanRun. If the scan is in progress,
   * the value represents the number of URLs tested up to now. The number of
   * URLs tested is usually larger than the number URLS crawled because
   * typically a crawled URL is tested with multiple test payloads.
   * </pre>
   *
   * <code>int64 urls_tested_count = 7;</code>
   *
   * @return The urlsTestedCount.
   */
  long getUrlsTestedCount();

  /**
   *
   *
   * <pre>
   * Whether the scan run has found any vulnerabilities.
   * </pre>
   *
   * <code>bool has_vulnerabilities = 8;</code>
   *
   * @return The hasVulnerabilities.
   */
  boolean getHasVulnerabilities();

  /**
   *
   *
   * <pre>
   * The percentage of total completion ranging from 0 to 100.
   * If the scan is in queue, the value is 0.
   * If the scan is running, the value ranges from 0 to 100.
   * If the scan is finished, the value is 100.
   * </pre>
   *
   * <code>int32 progress_percent = 9;</code>
   *
   * @return The progressPercent.
   */
  int getProgressPercent();
}
