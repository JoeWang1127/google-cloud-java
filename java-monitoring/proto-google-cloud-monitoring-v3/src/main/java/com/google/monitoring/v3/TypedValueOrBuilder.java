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
// source: google/monitoring/v3/common.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface TypedValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.TypedValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Boolean value: `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 1;</code>
   *
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   *
   *
   * <pre>
   * A Boolean value: `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 1;</code>
   *
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   *
   *
   * <pre>
   * A 64-bit integer. Its range is approximately &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   *
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   *
   *
   * <pre>
   * A 64-bit integer. Its range is approximately &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   *
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   *
   *
   * <pre>
   * A 64-bit double-precision floating-point number. Its magnitude
   * is approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it has 16
   * significant digits of precision.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   *
   *
   * <pre>
   * A 64-bit double-precision floating-point number. Its magnitude
   * is approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it has 16
   * significant digits of precision.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * A variable-length string value.
   * </pre>
   *
   * <code>string string_value = 4;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * A variable-length string value.
   * </pre>
   *
   * <code>string string_value = 4;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * A variable-length string value.
   * </pre>
   *
   * <code>string string_value = 4;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.google.api.Distribution distribution_value = 5;</code>
   *
   * @return Whether the distributionValue field is set.
   */
  boolean hasDistributionValue();
  /**
   *
   *
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.google.api.Distribution distribution_value = 5;</code>
   *
   * @return The distributionValue.
   */
  com.google.api.Distribution getDistributionValue();
  /**
   *
   *
   * <pre>
   * A distribution value.
   * </pre>
   *
   * <code>.google.api.Distribution distribution_value = 5;</code>
   */
  com.google.api.DistributionOrBuilder getDistributionValueOrBuilder();

  com.google.monitoring.v3.TypedValue.ValueCase getValueCase();
}
