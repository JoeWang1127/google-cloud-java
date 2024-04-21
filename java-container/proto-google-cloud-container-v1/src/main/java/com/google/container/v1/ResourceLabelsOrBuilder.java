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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

public interface ResourceLabelsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ResourceLabels)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
