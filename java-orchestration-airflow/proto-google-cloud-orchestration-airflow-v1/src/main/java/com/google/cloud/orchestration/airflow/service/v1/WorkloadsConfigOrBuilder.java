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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.orchestration.airflow.service.v1;

public interface WorkloadsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.WorkloadsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow schedulers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.SchedulerResource scheduler = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scheduler field is set.
   */
  boolean hasScheduler();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow schedulers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.SchedulerResource scheduler = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scheduler.
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.SchedulerResource
      getScheduler();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow schedulers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.SchedulerResource scheduler = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.SchedulerResourceOrBuilder
      getSchedulerOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow web server.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WebServerResource web_server = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the webServer field is set.
   */
  boolean hasWebServer();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow web server.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WebServerResource web_server = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The webServer.
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WebServerResource
      getWebServer();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow web server.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WebServerResource web_server = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WebServerResourceOrBuilder
      getWebServerOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow workers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WorkerResource worker = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the worker field is set.
   */
  boolean hasWorker();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow workers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WorkerResource worker = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The worker.
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WorkerResource getWorker();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow workers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WorkerResource worker = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.WorkerResourceOrBuilder
      getWorkerOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow triggerers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.TriggererResource triggerer = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the triggerer field is set.
   */
  boolean hasTriggerer();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow triggerers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.TriggererResource triggerer = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The triggerer.
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.TriggererResource
      getTriggerer();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow triggerers.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.TriggererResource triggerer = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.TriggererResourceOrBuilder
      getTriggererOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow DAG processors.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-3.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.DagProcessorResource dag_processor = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dagProcessor field is set.
   */
  boolean hasDagProcessor();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow DAG processors.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-3.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.DagProcessorResource dag_processor = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dagProcessor.
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.DagProcessorResource
      getDagProcessor();
  /**
   *
   *
   * <pre>
   * Optional. Resources used by Airflow DAG processors.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-3.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.DagProcessorResource dag_processor = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.WorkloadsConfig.DagProcessorResourceOrBuilder
      getDagProcessorOrBuilder();
}
