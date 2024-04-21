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
// source: google/cloud/retail/v2/import_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2;

public interface CompletionDataInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.CompletionDataInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   *
   * Add the IAM permission "BigQuery Data Viewer" for
   * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
   * using this feature otherwise an error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigQuerySource field is set.
   */
  boolean hasBigQuerySource();
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   *
   * Add the IAM permission "BigQuery Data Viewer" for
   * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
   * using this feature otherwise an error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigQuerySource.
   */
  com.google.cloud.retail.v2.BigQuerySource getBigQuerySource();
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   *
   * Add the IAM permission "BigQuery Data Viewer" for
   * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
   * using this feature otherwise an error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder();

  com.google.cloud.retail.v2.CompletionDataInputConfig.SourceCase getSourceCase();
}
