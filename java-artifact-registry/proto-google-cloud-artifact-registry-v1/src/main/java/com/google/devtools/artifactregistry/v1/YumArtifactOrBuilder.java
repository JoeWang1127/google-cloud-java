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
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.artifactregistry.v1;

public interface YumArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.YumArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Artifact Registry resource name of the artifact.
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
   * Output only. The Artifact Registry resource name of the artifact.
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
   * Output only. The yum package name of the artifact.
   * </pre>
   *
   * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The packageName.
   */
  java.lang.String getPackageName();
  /**
   *
   *
   * <pre>
   * Output only. The yum package name of the artifact.
   * </pre>
   *
   * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for packageName.
   */
  com.google.protobuf.ByteString getPackageNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. An artifact is a binary or source package.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for packageType.
   */
  int getPackageTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. An artifact is a binary or source package.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The packageType.
   */
  com.google.devtools.artifactregistry.v1.YumArtifact.PackageType getPackageType();

  /**
   *
   *
   * <pre>
   * Output only. Operating system architecture of the artifact.
   * </pre>
   *
   * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The architecture.
   */
  java.lang.String getArchitecture();
  /**
   *
   *
   * <pre>
   * Output only. Operating system architecture of the artifact.
   * </pre>
   *
   * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for architecture.
   */
  com.google.protobuf.ByteString getArchitectureBytes();
}
