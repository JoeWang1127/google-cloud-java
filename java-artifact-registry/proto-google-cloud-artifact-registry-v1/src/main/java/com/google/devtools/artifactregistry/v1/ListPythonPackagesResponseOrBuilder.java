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
// source: google/devtools/artifactregistry/v1/artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.artifactregistry.v1;

public interface ListPythonPackagesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListPythonPackagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The python packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.PythonPackage python_packages = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.PythonPackage> getPythonPackagesList();
  /**
   *
   *
   * <pre>
   * The python packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.PythonPackage python_packages = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.PythonPackage getPythonPackages(int index);
  /**
   *
   *
   * <pre>
   * The python packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.PythonPackage python_packages = 1;</code>
   */
  int getPythonPackagesCount();
  /**
   *
   *
   * <pre>
   * The python packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.PythonPackage python_packages = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1.PythonPackageOrBuilder>
      getPythonPackagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The python packages returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.PythonPackage python_packages = 1;</code>
   */
  com.google.devtools.artifactregistry.v1.PythonPackageOrBuilder getPythonPackagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of artifacts, or empty if there are no
   * more artifacts to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
