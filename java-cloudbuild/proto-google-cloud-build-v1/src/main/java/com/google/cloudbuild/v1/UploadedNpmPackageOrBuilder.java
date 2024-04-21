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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v1;

public interface UploadedNpmPackageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.UploadedNpmPackage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URI of the uploaded npm package.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of the uploaded npm package.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Hash types and values of the npm package.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
   *
   * @return Whether the fileHashes field is set.
   */
  boolean hasFileHashes();
  /**
   *
   *
   * <pre>
   * Hash types and values of the npm package.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
   *
   * @return The fileHashes.
   */
  com.google.cloudbuild.v1.FileHashes getFileHashes();
  /**
   *
   *
   * <pre>
   * Hash types and values of the npm package.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.FileHashes file_hashes = 2;</code>
   */
  com.google.cloudbuild.v1.FileHashesOrBuilder getFileHashesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified artifact.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pushTiming field is set.
   */
  boolean hasPushTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified artifact.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pushTiming.
   */
  com.google.cloudbuild.v1.TimeSpan getPushTiming();
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified artifact.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloudbuild.v1.TimeSpanOrBuilder getPushTimingOrBuilder();
}
