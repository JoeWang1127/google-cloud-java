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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.orchestration.airflow.service.v1;

public interface WebServerNetworkAccessControlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A collection of allowed IP ranges with descriptions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl.AllowedIpRange allowed_ip_ranges = 1;
   * </code>
   */
  java.util.List<
          com.google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl
              .AllowedIpRange>
      getAllowedIpRangesList();
  /**
   *
   *
   * <pre>
   * A collection of allowed IP ranges with descriptions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl.AllowedIpRange allowed_ip_ranges = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl.AllowedIpRange
      getAllowedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * A collection of allowed IP ranges with descriptions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl.AllowedIpRange allowed_ip_ranges = 1;
   * </code>
   */
  int getAllowedIpRangesCount();
  /**
   *
   *
   * <pre>
   * A collection of allowed IP ranges with descriptions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl.AllowedIpRange allowed_ip_ranges = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl
                  .AllowedIpRangeOrBuilder>
      getAllowedIpRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A collection of allowed IP ranges with descriptions.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl.AllowedIpRange allowed_ip_ranges = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WebServerNetworkAccessControl
          .AllowedIpRangeOrBuilder
      getAllowedIpRangesOrBuilder(int index);
}
