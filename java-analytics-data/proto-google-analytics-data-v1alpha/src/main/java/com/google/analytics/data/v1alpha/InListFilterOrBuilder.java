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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

public interface InListFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.InListFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of string values.
   * Must be non-empty.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * The list of string values.
   * Must be non-empty.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * The list of string values.
   * Must be non-empty.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * The list of string values.
   * Must be non-empty.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * If true, the string value is case sensitive.
   * </pre>
   *
   * <code>bool case_sensitive = 2;</code>
   *
   * @return The caseSensitive.
   */
  boolean getCaseSensitive();
}
