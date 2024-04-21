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
// source: google/cloud/recommender/v1/recommendation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.recommender.v1;

public interface ReliabilityProjectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.ReliabilityProjection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Reliability risks mitigated by this recommendation.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.ReliabilityProjection.RiskType risks = 1;</code>
   *
   * @return A list containing the risks.
   */
  java.util.List<com.google.cloud.recommender.v1.ReliabilityProjection.RiskType> getRisksList();
  /**
   *
   *
   * <pre>
   * Reliability risks mitigated by this recommendation.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.ReliabilityProjection.RiskType risks = 1;</code>
   *
   * @return The count of risks.
   */
  int getRisksCount();
  /**
   *
   *
   * <pre>
   * Reliability risks mitigated by this recommendation.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.ReliabilityProjection.RiskType risks = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The risks at the given index.
   */
  com.google.cloud.recommender.v1.ReliabilityProjection.RiskType getRisks(int index);
  /**
   *
   *
   * <pre>
   * Reliability risks mitigated by this recommendation.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.ReliabilityProjection.RiskType risks = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for risks.
   */
  java.util.List<java.lang.Integer> getRisksValueList();
  /**
   *
   *
   * <pre>
   * Reliability risks mitigated by this recommendation.
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1.ReliabilityProjection.RiskType risks = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of risks at the given index.
   */
  int getRisksValue(int index);

  /**
   *
   *
   * <pre>
   * Per-recommender projection.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   *
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   *
   *
   * <pre>
   * Per-recommender projection.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   *
   * @return The details.
   */
  com.google.protobuf.Struct getDetails();
  /**
   *
   *
   * <pre>
   * Per-recommender projection.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getDetailsOrBuilder();
}
