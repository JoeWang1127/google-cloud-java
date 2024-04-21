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
// source: google/cloud/websecurityscanner/v1alpha/finding.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1alpha;

public interface FindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.Finding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
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
   * The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
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
   * The type of the Finding.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 2;</code>
   *
   * @return The enum numeric value on the wire for findingType.
   */
  int getFindingTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the Finding.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 2;</code>
   *
   * @return The findingType.
   */
  com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType getFindingType();

  /**
   *
   *
   * <pre>
   * The http method of the request that triggered the vulnerability, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 3;</code>
   *
   * @return The httpMethod.
   */
  java.lang.String getHttpMethod();
  /**
   *
   *
   * <pre>
   * The http method of the request that triggered the vulnerability, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 3;</code>
   *
   * @return The bytes for httpMethod.
   */
  com.google.protobuf.ByteString getHttpMethodBytes();

  /**
   *
   *
   * <pre>
   * The URL produced by the server-side fuzzer and used in the request that
   * triggered the vulnerability.
   * </pre>
   *
   * <code>string fuzzed_url = 4;</code>
   *
   * @return The fuzzedUrl.
   */
  java.lang.String getFuzzedUrl();
  /**
   *
   *
   * <pre>
   * The URL produced by the server-side fuzzer and used in the request that
   * triggered the vulnerability.
   * </pre>
   *
   * <code>string fuzzed_url = 4;</code>
   *
   * @return The bytes for fuzzedUrl.
   */
  com.google.protobuf.ByteString getFuzzedUrlBytes();

  /**
   *
   *
   * <pre>
   * The body of the request that triggered the vulnerability.
   * </pre>
   *
   * <code>string body = 5;</code>
   *
   * @return The body.
   */
  java.lang.String getBody();
  /**
   *
   *
   * <pre>
   * The body of the request that triggered the vulnerability.
   * </pre>
   *
   * <code>string body = 5;</code>
   *
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString getBodyBytes();

  /**
   *
   *
   * <pre>
   * The description of the vulnerability.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the vulnerability.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The URL containing human-readable payload that user can leverage to
   * reproduce the vulnerability.
   * </pre>
   *
   * <code>string reproduction_url = 7;</code>
   *
   * @return The reproductionUrl.
   */
  java.lang.String getReproductionUrl();
  /**
   *
   *
   * <pre>
   * The URL containing human-readable payload that user can leverage to
   * reproduce the vulnerability.
   * </pre>
   *
   * <code>string reproduction_url = 7;</code>
   *
   * @return The bytes for reproductionUrl.
   */
  com.google.protobuf.ByteString getReproductionUrlBytes();

  /**
   *
   *
   * <pre>
   * If the vulnerability was originated from nested IFrame, the immediate
   * parent IFrame is reported.
   * </pre>
   *
   * <code>string frame_url = 8;</code>
   *
   * @return The frameUrl.
   */
  java.lang.String getFrameUrl();
  /**
   *
   *
   * <pre>
   * If the vulnerability was originated from nested IFrame, the immediate
   * parent IFrame is reported.
   * </pre>
   *
   * <code>string frame_url = 8;</code>
   *
   * @return The bytes for frameUrl.
   */
  com.google.protobuf.ByteString getFrameUrlBytes();

  /**
   *
   *
   * <pre>
   * The URL where the browser lands when the vulnerability is detected.
   * </pre>
   *
   * <code>string final_url = 9;</code>
   *
   * @return The finalUrl.
   */
  java.lang.String getFinalUrl();
  /**
   *
   *
   * <pre>
   * The URL where the browser lands when the vulnerability is detected.
   * </pre>
   *
   * <code>string final_url = 9;</code>
   *
   * @return The bytes for finalUrl.
   */
  com.google.protobuf.ByteString getFinalUrlBytes();

  /**
   *
   *
   * <pre>
   * The tracking ID uniquely identifies a vulnerability instance across
   * multiple ScanRuns.
   * </pre>
   *
   * <code>string tracking_id = 10;</code>
   *
   * @return The trackingId.
   */
  java.lang.String getTrackingId();
  /**
   *
   *
   * <pre>
   * The tracking ID uniquely identifies a vulnerability instance across
   * multiple ScanRuns.
   * </pre>
   *
   * <code>string tracking_id = 10;</code>
   *
   * @return The bytes for trackingId.
   */
  com.google.protobuf.ByteString getTrackingIdBytes();

  /**
   *
   *
   * <pre>
   * An addon containing information about outdated libraries.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary outdated_library = 11;</code>
   *
   * @return Whether the outdatedLibrary field is set.
   */
  boolean hasOutdatedLibrary();
  /**
   *
   *
   * <pre>
   * An addon containing information about outdated libraries.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary outdated_library = 11;</code>
   *
   * @return The outdatedLibrary.
   */
  com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary getOutdatedLibrary();
  /**
   *
   *
   * <pre>
   * An addon containing information about outdated libraries.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary outdated_library = 11;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.OutdatedLibraryOrBuilder
      getOutdatedLibraryOrBuilder();

  /**
   *
   *
   * <pre>
   * An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ViolatingResource violating_resource = 12;
   * </code>
   *
   * @return Whether the violatingResource field is set.
   */
  boolean hasViolatingResource();
  /**
   *
   *
   * <pre>
   * An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ViolatingResource violating_resource = 12;
   * </code>
   *
   * @return The violatingResource.
   */
  com.google.cloud.websecurityscanner.v1alpha.ViolatingResource getViolatingResource();
  /**
   *
   *
   * <pre>
   * An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ViolatingResource violating_resource = 12;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ViolatingResourceOrBuilder
      getViolatingResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * An addon containing information about vulnerable or missing HTTP headers.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders vulnerable_headers = 15;
   * </code>
   *
   * @return Whether the vulnerableHeaders field is set.
   */
  boolean hasVulnerableHeaders();
  /**
   *
   *
   * <pre>
   * An addon containing information about vulnerable or missing HTTP headers.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders vulnerable_headers = 15;
   * </code>
   *
   * @return The vulnerableHeaders.
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders getVulnerableHeaders();
  /**
   *
   *
   * <pre>
   * An addon containing information about vulnerable or missing HTTP headers.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders vulnerable_headers = 15;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableHeadersOrBuilder
      getVulnerableHeadersOrBuilder();

  /**
   *
   *
   * <pre>
   * An addon containing information about request parameters which were found
   * to be vulnerable.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableParameters vulnerable_parameters = 13;
   * </code>
   *
   * @return Whether the vulnerableParameters field is set.
   */
  boolean hasVulnerableParameters();
  /**
   *
   *
   * <pre>
   * An addon containing information about request parameters which were found
   * to be vulnerable.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableParameters vulnerable_parameters = 13;
   * </code>
   *
   * @return The vulnerableParameters.
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableParameters getVulnerableParameters();
  /**
   *
   *
   * <pre>
   * An addon containing information about request parameters which were found
   * to be vulnerable.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableParameters vulnerable_parameters = 13;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableParametersOrBuilder
      getVulnerableParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * An addon containing information reported for an XSS, if any.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Xss xss = 14;</code>
   *
   * @return Whether the xss field is set.
   */
  boolean hasXss();
  /**
   *
   *
   * <pre>
   * An addon containing information reported for an XSS, if any.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Xss xss = 14;</code>
   *
   * @return The xss.
   */
  com.google.cloud.websecurityscanner.v1alpha.Xss getXss();
  /**
   *
   *
   * <pre>
   * An addon containing information reported for an XSS, if any.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Xss xss = 14;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.XssOrBuilder getXssOrBuilder();
}
