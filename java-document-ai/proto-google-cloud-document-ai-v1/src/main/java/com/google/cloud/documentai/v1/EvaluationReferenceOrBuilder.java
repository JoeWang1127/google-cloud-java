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
// source: google/cloud/documentai/v1/evaluation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1;

public interface EvaluationReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.EvaluationReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the Long Running Operation for the evaluation.
   * </pre>
   *
   * <code>string operation = 1;</code>
   *
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   *
   *
   * <pre>
   * The resource name of the Long Running Operation for the evaluation.
   * </pre>
   *
   * <code>string operation = 1;</code>
   *
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString getOperationBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the evaluation.
   * </pre>
   *
   * <code>string evaluation = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The evaluation.
   */
  java.lang.String getEvaluation();
  /**
   *
   *
   * <pre>
   * The resource name of the evaluation.
   * </pre>
   *
   * <code>string evaluation = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for evaluation.
   */
  com.google.protobuf.ByteString getEvaluationBytes();

  /**
   *
   *
   * <pre>
   * An aggregate of the statistics for the evaluation with fuzzy matching on.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Evaluation.Metrics aggregate_metrics = 4;</code>
   *
   * @return Whether the aggregateMetrics field is set.
   */
  boolean hasAggregateMetrics();
  /**
   *
   *
   * <pre>
   * An aggregate of the statistics for the evaluation with fuzzy matching on.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Evaluation.Metrics aggregate_metrics = 4;</code>
   *
   * @return The aggregateMetrics.
   */
  com.google.cloud.documentai.v1.Evaluation.Metrics getAggregateMetrics();
  /**
   *
   *
   * <pre>
   * An aggregate of the statistics for the evaluation with fuzzy matching on.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Evaluation.Metrics aggregate_metrics = 4;</code>
   */
  com.google.cloud.documentai.v1.Evaluation.MetricsOrBuilder getAggregateMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * An aggregate of the statistics for the evaluation with fuzzy matching off.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Evaluation.Metrics aggregate_metrics_exact = 5;</code>
   *
   * @return Whether the aggregateMetricsExact field is set.
   */
  boolean hasAggregateMetricsExact();
  /**
   *
   *
   * <pre>
   * An aggregate of the statistics for the evaluation with fuzzy matching off.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Evaluation.Metrics aggregate_metrics_exact = 5;</code>
   *
   * @return The aggregateMetricsExact.
   */
  com.google.cloud.documentai.v1.Evaluation.Metrics getAggregateMetricsExact();
  /**
   *
   *
   * <pre>
   * An aggregate of the statistics for the evaluation with fuzzy matching off.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Evaluation.Metrics aggregate_metrics_exact = 5;</code>
   */
  com.google.cloud.documentai.v1.Evaluation.MetricsOrBuilder getAggregateMetricsExactOrBuilder();
}
