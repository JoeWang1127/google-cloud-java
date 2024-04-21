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
// source: google/cloud/dataplex/v1/datascans.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataplex.v1;

public interface DataScanJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataScanJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the DataScanJob, of the form:
   * `projects/{project}/locations/{location_id}/dataScans/{datascan_id}/jobs/{job_id}`,
   * where `project` refers to a *project_id* or *project_number* and
   * `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the DataScanJob, of the form:
   * `projects/{project}/locations/{location_id}/dataScans/{datascan_id}/jobs/{job_id}`,
   * where `project` refers to a *project_id* or *project_number* and
   * `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the DataScanJob.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the DataScanJob.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the DataScanJob was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the DataScanJob was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the DataScanJob was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the DataScanJob ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the DataScanJob ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the DataScanJob ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Execution state for the DataScanJob.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanJob.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Execution state for the DataScanJob.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanJob.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataplex.v1.DataScanJob.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state.
   * </pre>
   *
   * <code>string message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state.
   * </pre>
   *
   * <code>string message = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of the parent DataScan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanType type = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of the parent DataScan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScanType type = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.dataplex.v1.DataScanType getType();

  /**
   *
   *
   * <pre>
   * Output only. DataQualityScan related setting.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualitySpec data_quality_spec = 100 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataQualitySpec field is set.
   */
  boolean hasDataQualitySpec();
  /**
   *
   *
   * <pre>
   * Output only. DataQualityScan related setting.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualitySpec data_quality_spec = 100 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataQualitySpec.
   */
  com.google.cloud.dataplex.v1.DataQualitySpec getDataQualitySpec();
  /**
   *
   *
   * <pre>
   * Output only. DataQualityScan related setting.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualitySpec data_quality_spec = 100 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualitySpecOrBuilder getDataQualitySpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. DataProfileScan related setting.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileSpec data_profile_spec = 101 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataProfileSpec field is set.
   */
  boolean hasDataProfileSpec();
  /**
   *
   *
   * <pre>
   * Output only. DataProfileScan related setting.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileSpec data_profile_spec = 101 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataProfileSpec.
   */
  com.google.cloud.dataplex.v1.DataProfileSpec getDataProfileSpec();
  /**
   *
   *
   * <pre>
   * Output only. DataProfileScan related setting.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileSpec data_profile_spec = 101 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataProfileSpecOrBuilder getDataProfileSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The result of the data quality scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityResult data_quality_result = 200 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataQualityResult field is set.
   */
  boolean hasDataQualityResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of the data quality scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityResult data_quality_result = 200 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataQualityResult.
   */
  com.google.cloud.dataplex.v1.DataQualityResult getDataQualityResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of the data quality scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityResult data_quality_result = 200 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityResultOrBuilder getDataQualityResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The result of the data profile scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileResult data_profile_result = 201 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataProfileResult field is set.
   */
  boolean hasDataProfileResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of the data profile scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileResult data_profile_result = 201 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataProfileResult.
   */
  com.google.cloud.dataplex.v1.DataProfileResult getDataProfileResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of the data profile scan.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataProfileResult data_profile_result = 201 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataProfileResultOrBuilder getDataProfileResultOrBuilder();

  com.google.cloud.dataplex.v1.DataScanJob.SpecCase getSpecCase();

  com.google.cloud.dataplex.v1.DataScanJob.ResultCase getResultCase();
}
