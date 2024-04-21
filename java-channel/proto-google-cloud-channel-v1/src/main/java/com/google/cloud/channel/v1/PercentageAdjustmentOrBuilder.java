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
// source: google/cloud/channel/v1/repricing.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.channel.v1;

public interface PercentageAdjustmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.PercentageAdjustment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The percentage of the bill to adjust.
   * For example:
   * Mark down by 1% =&gt; "-1.00"
   * Mark up by 1%   =&gt; "1.00"
   * Pass-Through    =&gt; "0.00"
   * </pre>
   *
   * <code>.google.type.Decimal percentage = 2;</code>
   *
   * @return Whether the percentage field is set.
   */
  boolean hasPercentage();
  /**
   *
   *
   * <pre>
   * The percentage of the bill to adjust.
   * For example:
   * Mark down by 1% =&gt; "-1.00"
   * Mark up by 1%   =&gt; "1.00"
   * Pass-Through    =&gt; "0.00"
   * </pre>
   *
   * <code>.google.type.Decimal percentage = 2;</code>
   *
   * @return The percentage.
   */
  com.google.type.Decimal getPercentage();
  /**
   *
   *
   * <pre>
   * The percentage of the bill to adjust.
   * For example:
   * Mark down by 1% =&gt; "-1.00"
   * Mark up by 1%   =&gt; "1.00"
   * Pass-Through    =&gt; "0.00"
   * </pre>
   *
   * <code>.google.type.Decimal percentage = 2;</code>
   */
  com.google.type.DecimalOrBuilder getPercentageOrBuilder();
}
