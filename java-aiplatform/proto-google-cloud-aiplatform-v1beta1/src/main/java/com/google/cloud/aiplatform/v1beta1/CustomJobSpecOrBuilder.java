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
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface CustomJobSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CustomJobSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The ID of the PersistentResource in the same Project and Location
   * which to run
   *
   * If this is specified, the job will be run on existing machines held by the
   * PersistentResource instead of on-demand short-live machines.
   * The network and CMEK configs on the job should be consistent with those on
   * the PersistentResource, otherwise, the job will be rejected.
   * </pre>
   *
   * <code>
   * string persistent_resource_id = 14 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The persistentResourceId.
   */
  java.lang.String getPersistentResourceId();
  /**
   *
   *
   * <pre>
   * Optional. The ID of the PersistentResource in the same Project and Location
   * which to run
   *
   * If this is specified, the job will be run on existing machines held by the
   * PersistentResource instead of on-demand short-live machines.
   * The network and CMEK configs on the job should be consistent with those on
   * the PersistentResource, otherwise, the job will be rejected.
   * </pre>
   *
   * <code>
   * string persistent_resource_id = 14 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for persistentResourceId.
   */
  com.google.protobuf.ByteString getPersistentResourceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker
   * image. All worker pools except the first one are optional and can be
   * skipped by providing an empty value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec> getWorkerPoolSpecsList();
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker
   * image. All worker pools except the first one are optional and can be
   * skipped by providing an empty value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec getWorkerPoolSpecs(int index);
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker
   * image. All worker pools except the first one are optional and can be
   * skipped by providing an empty value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getWorkerPoolSpecsCount();
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker
   * image. All worker pools except the first one are optional and can be
   * skipped by providing an empty value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.WorkerPoolSpecOrBuilder>
      getWorkerPoolSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker
   * image. All worker pools except the first one are optional and can be
   * skipped by providing an empty value.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.WorkerPoolSpecOrBuilder getWorkerPoolSpecsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Scheduling options for a CustomJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Scheduling scheduling = 3;</code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Scheduling options for a CustomJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Scheduling scheduling = 3;</code>
   *
   * @return The scheduling.
   */
  com.google.cloud.aiplatform.v1beta1.Scheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Scheduling options for a CustomJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Scheduling scheduling = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the service account for workload run-as account.
   * Users submitting jobs must have act-as permission on this run-as account.
   * If unspecified, the [Vertex AI Custom Code Service
   * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
   * for the CustomJob's project is used.
   * </pre>
   *
   * <code>string service_account = 4;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Specifies the service account for workload run-as account.
   * Users submitting jobs must have act-as permission on this run-as account.
   * If unspecified, the [Vertex AI Custom Code Service
   * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
   * for the CustomJob's project is used.
   * </pre>
   *
   * <code>string service_account = 4;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the Job
   * should be peered. For example, `projects/12345/global/networks/myVPC`.
   * [Format](/compute/docs/reference/rest/v1/networks/insert)
   * is of the form `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in `12345`, and {network} is a
   * network name.
   *
   * To specify this field, you must have already [configured VPC Network
   * Peering for Vertex
   * AI](https://cloud.google.com/vertex-ai/docs/general/vpc-peering).
   *
   * If this field is left unspecified, the job is not peered with any network.
   * </pre>
   *
   * <code>
   * string network = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The full name of the Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the Job
   * should be peered. For example, `projects/12345/global/networks/myVPC`.
   * [Format](/compute/docs/reference/rest/v1/networks/insert)
   * is of the form `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in `12345`, and {network} is a
   * network name.
   *
   * To specify this field, you must have already [configured VPC Network
   * Peering for Vertex
   * AI](https://cloud.google.com/vertex-ai/docs/general/vpc-peering).
   *
   * If this field is left unspecified, the job is not peered with any network.
   * </pre>
   *
   * <code>
   * string network = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved ip ranges under the VPC network
   * that can be used for this job.
   *
   * If set, we will deploy the job within the provided ip ranges. Otherwise,
   * the job will be deployed to any ip ranges under the provided VPC
   * network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the reservedIpRanges.
   */
  java.util.List<java.lang.String> getReservedIpRangesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved ip ranges under the VPC network
   * that can be used for this job.
   *
   * If set, we will deploy the job within the provided ip ranges. Otherwise,
   * the job will be deployed to any ip ranges under the provided VPC
   * network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of reservedIpRanges.
   */
  int getReservedIpRangesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved ip ranges under the VPC network
   * that can be used for this job.
   *
   * If set, we will deploy the job within the provided ip ranges. Otherwise,
   * the job will be deployed to any ip ranges under the provided VPC
   * network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The reservedIpRanges at the given index.
   */
  java.lang.String getReservedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved ip ranges under the VPC network
   * that can be used for this job.
   *
   * If set, we will deploy the job within the provided ip ranges. Otherwise,
   * the job will be deployed to any ip ranges under the provided VPC
   * network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the reservedIpRanges at the given index.
   */
  com.google.protobuf.ByteString getReservedIpRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * The Cloud Storage location to store the output of this CustomJob or
   * HyperparameterTuningJob. For HyperparameterTuningJob,
   * the baseOutputDirectory of
   * each child CustomJob backing a Trial is set to a subdirectory of name
   * [id][google.cloud.aiplatform.v1beta1.Trial.id] under its parent
   * HyperparameterTuningJob's baseOutputDirectory.
   *
   * The following Vertex AI environment variables will be passed to
   * containers or python modules when this field is set:
   *
   *   For CustomJob:
   *
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/logs/`
   *
   *   For CustomJob backing a Trial of HyperparameterTuningJob:
   *
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/logs/`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination base_output_directory = 6;</code>
   *
   * @return Whether the baseOutputDirectory field is set.
   */
  boolean hasBaseOutputDirectory();
  /**
   *
   *
   * <pre>
   * The Cloud Storage location to store the output of this CustomJob or
   * HyperparameterTuningJob. For HyperparameterTuningJob,
   * the baseOutputDirectory of
   * each child CustomJob backing a Trial is set to a subdirectory of name
   * [id][google.cloud.aiplatform.v1beta1.Trial.id] under its parent
   * HyperparameterTuningJob's baseOutputDirectory.
   *
   * The following Vertex AI environment variables will be passed to
   * containers or python modules when this field is set:
   *
   *   For CustomJob:
   *
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/logs/`
   *
   *   For CustomJob backing a Trial of HyperparameterTuningJob:
   *
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/logs/`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination base_output_directory = 6;</code>
   *
   * @return The baseOutputDirectory.
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestination getBaseOutputDirectory();
  /**
   *
   *
   * <pre>
   * The Cloud Storage location to store the output of this CustomJob or
   * HyperparameterTuningJob. For HyperparameterTuningJob,
   * the baseOutputDirectory of
   * each child CustomJob backing a Trial is set to a subdirectory of name
   * [id][google.cloud.aiplatform.v1beta1.Trial.id] under its parent
   * HyperparameterTuningJob's baseOutputDirectory.
   *
   * The following Vertex AI environment variables will be passed to
   * containers or python modules when this field is set:
   *
   *   For CustomJob:
   *
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/logs/`
   *
   *   For CustomJob backing a Trial of HyperparameterTuningJob:
   *
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/logs/`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination base_output_directory = 6;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder getBaseOutputDirectoryOrBuilder();

  /**
   *
   *
   * <pre>
   * The ID of the location to store protected artifacts. e.g. us-central1.
   * Populate only when the location is different than CustomJob location.
   * List of supported locations:
   * https://cloud.google.com/vertex-ai/docs/general/locations
   * </pre>
   *
   * <code>string protected_artifact_location_id = 19;</code>
   *
   * @return The protectedArtifactLocationId.
   */
  java.lang.String getProtectedArtifactLocationId();
  /**
   *
   *
   * <pre>
   * The ID of the location to store protected artifacts. e.g. us-central1.
   * Populate only when the location is different than CustomJob location.
   * List of supported locations:
   * https://cloud.google.com/vertex-ai/docs/general/locations
   * </pre>
   *
   * <code>string protected_artifact_location_id = 19;</code>
   *
   * @return The bytes for protectedArtifactLocationId.
   */
  com.google.protobuf.ByteString getProtectedArtifactLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of a Vertex AI
   * [Tensorboard][google.cloud.aiplatform.v1beta1.Tensorboard] resource to
   * which this CustomJob will upload Tensorboard logs. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * </pre>
   *
   * <code>
   * string tensorboard = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboard.
   */
  java.lang.String getTensorboard();
  /**
   *
   *
   * <pre>
   * Optional. The name of a Vertex AI
   * [Tensorboard][google.cloud.aiplatform.v1beta1.Tensorboard] resource to
   * which this CustomJob will upload Tensorboard logs. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * </pre>
   *
   * <code>
   * string tensorboard = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboard.
   */
  com.google.protobuf.ByteString getTensorboardBytes();

  /**
   *
   *
   * <pre>
   * Optional. Whether you want Vertex AI to enable [interactive shell
   * access](https://cloud.google.com/vertex-ai/docs/training/monitor-debug-interactive-shell)
   * to training containers.
   *
   * If set to `true`, you can access interactive shells at the URIs given
   * by
   * [CustomJob.web_access_uris][google.cloud.aiplatform.v1beta1.CustomJob.web_access_uris]
   * or
   * [Trial.web_access_uris][google.cloud.aiplatform.v1beta1.Trial.web_access_uris]
   * (within
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.trials]).
   * </pre>
   *
   * <code>bool enable_web_access = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableWebAccess.
   */
  boolean getEnableWebAccess();

  /**
   *
   *
   * <pre>
   * Optional. Whether you want Vertex AI to enable access to the customized
   * dashboard in training chief container.
   *
   * If set to `true`, you can access the dashboard at the URIs given
   * by
   * [CustomJob.web_access_uris][google.cloud.aiplatform.v1beta1.CustomJob.web_access_uris]
   * or
   * [Trial.web_access_uris][google.cloud.aiplatform.v1beta1.Trial.web_access_uris]
   * (within
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1beta1.HyperparameterTuningJob.trials]).
   * </pre>
   *
   * <code>bool enable_dashboard_access = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableDashboardAccess.
   */
  boolean getEnableDashboardAccess();

  /**
   *
   *
   * <pre>
   * Optional. The Experiment associated with this job.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadataStores}/contexts/{experiment-name}`
   * </pre>
   *
   * <code>
   * string experiment = 17 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The experiment.
   */
  java.lang.String getExperiment();
  /**
   *
   *
   * <pre>
   * Optional. The Experiment associated with this job.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadataStores}/contexts/{experiment-name}`
   * </pre>
   *
   * <code>
   * string experiment = 17 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for experiment.
   */
  com.google.protobuf.ByteString getExperimentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Experiment Run associated with this job.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadataStores}/contexts/{experiment-name}-{experiment-run-name}`
   * </pre>
   *
   * <code>
   * string experiment_run = 18 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The experimentRun.
   */
  java.lang.String getExperimentRun();
  /**
   *
   *
   * <pre>
   * Optional. The Experiment Run associated with this job.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadataStores}/contexts/{experiment-name}-{experiment-run-name}`
   * </pre>
   *
   * <code>
   * string experiment_run = 18 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for experimentRun.
   */
  com.google.protobuf.ByteString getExperimentRunBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the Model resources for which to generate a mapping
   * to artifact URIs. Applicable only to some of the Google-provided custom
   * jobs. Format: `projects/{project}/locations/{location}/models/{model}`
   *
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
   * </pre>
   *
   * <code>
   * repeated string models = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the models.
   */
  java.util.List<java.lang.String> getModelsList();
  /**
   *
   *
   * <pre>
   * Optional. The name of the Model resources for which to generate a mapping
   * to artifact URIs. Applicable only to some of the Google-provided custom
   * jobs. Format: `projects/{project}/locations/{location}/models/{model}`
   *
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
   * </pre>
   *
   * <code>
   * repeated string models = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of models.
   */
  int getModelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The name of the Model resources for which to generate a mapping
   * to artifact URIs. Applicable only to some of the Google-provided custom
   * jobs. Format: `projects/{project}/locations/{location}/models/{model}`
   *
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
   * </pre>
   *
   * <code>
   * repeated string models = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The models at the given index.
   */
  java.lang.String getModels(int index);
  /**
   *
   *
   * <pre>
   * Optional. The name of the Model resources for which to generate a mapping
   * to artifact URIs. Applicable only to some of the Google-provided custom
   * jobs. Format: `projects/{project}/locations/{location}/models/{model}`
   *
   * In order to retrieve a specific version of the model, also provide
   * the version ID or version alias.
   *   Example: `projects/{project}/locations/{location}/models/{model}&#64;2`
   *              or
   *            `projects/{project}/locations/{location}/models/{model}&#64;golden`
   * If no version ID or alias is specified, the "default" version will be
   * returned. The "default" version alias is created for the first version of
   * the model, and can be moved to other versions later on. There will be
   * exactly one default version.
   * </pre>
   *
   * <code>
   * repeated string models = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the models at the given index.
   */
  com.google.protobuf.ByteString getModelsBytes(int index);
}
