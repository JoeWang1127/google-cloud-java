/*
 * Copyright 2020 Google LLC
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
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface ConfigSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ConfigSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.ConfigFile> getFilesList();
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  com.google.api.servicemanagement.v1.ConfigFile getFiles(int index);
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  int getFilesCount();
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.ConfigFileOrBuilder>
      getFilesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  com.google.api.servicemanagement.v1.ConfigFileOrBuilder getFilesOrBuilder(int index);
}