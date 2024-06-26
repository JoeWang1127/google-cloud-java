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
// source: google/cloud/aiplatform/v1beta1/notebook_execution_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public final class NotebookExecutionJobProto {
  private NotebookExecutionJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DataformRepositorySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DataformRepositorySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_GcsNotebookSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_GcsNotebookSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DirectNotebookSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DirectNotebookSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1beta1/notebo"
          + "ok_execution_job.proto\022\037google.cloud.aip"
          + "latform.v1beta1\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032/goo"
          + "gle/cloud/aiplatform/v1beta1/job_state.p"
          + "roto\032\036google/protobuf/duration.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\032\027google/rp"
          + "c/status.proto\"\346\013\n\024NotebookExecutionJob\022"
          + "t\n\032dataform_repository_source\030\003 \001(\0132N.go"
          + "ogle.cloud.aiplatform.v1beta1.NotebookEx"
          + "ecutionJob.DataformRepositorySourceH\000\022f\n"
          + "\023gcs_notebook_source\030\004 \001(\0132G.google.clou"
          + "d.aiplatform.v1beta1.NotebookExecutionJo"
          + "b.GcsNotebookSourceH\000\022l\n\026direct_notebook"
          + "_source\030\021 \001(\0132J.google.cloud.aiplatform."
          + "v1beta1.NotebookExecutionJob.DirectNoteb"
          + "ookSourceH\000\022i\n\'notebook_runtime_template"
          + "_resource_name\030\016 \001(\tB6\372A3\n1aiplatform.go"
          + "ogleapis.com/NotebookRuntimeTemplateH\001\022\030"
          + "\n\016gcs_output_uri\030\010 \001(\tH\002\022\030\n\016execution_us"
          + "er\030\t \001(\tH\003\022\031\n\017service_account\030\022 \001(\tH\003\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\024\n\014display_name\030\002 \001(\t\0224"
          + "\n\021execution_timeout\030\005 \001(\0132\031.google.proto"
          + "buf.Duration\022J\n\026schedule_resource_name\030\006"
          + " \001(\tB*\340A\003\372A$\n\"aiplatform.googleapis.com/"
          + "Schedule\022A\n\tjob_state\030\n \001(\0162).google.clo"
          + "ud.aiplatform.v1beta1.JobStateB\003\340A\003\022\'\n\006s"
          + "tatus\030\013 \001(\0132\022.google.rpc.StatusB\003\340A\003\0224\n\013"
          + "create_time\030\014 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0224\n\013update_time\030\r \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\022Q\n\006labels\030\023 \003(\013"
          + "2A.google.cloud.aiplatform.v1beta1.Noteb"
          + "ookExecutionJob.LabelsEntry\032Y\n\030DataformR"
          + "epositorySource\022)\n!dataform_repository_r"
          + "esource_name\030\001 \001(\t\022\022\n\ncommit_sha\030\002 \001(\t\0324"
          + "\n\021GcsNotebookSource\022\013\n\003uri\030\001 \001(\t\022\022\n\ngene"
          + "ration\030\002 \001(\t\032\'\n\024DirectNotebookSource\022\017\n\007"
          + "content\030\001 \001(\014\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t:\0028\001:\271\001\352A\265\001\n.aiplatform."
          + "googleapis.com/NotebookExecutionJob\022Vpro"
          + "jects/{project}/locations/{location}/not"
          + "ebookExecutionJobs/{notebook_execution_j"
          + "ob}*\025notebookExecutionJobs2\024notebookExec"
          + "utionJobB\021\n\017notebook_sourceB\022\n\020environme"
          + "nt_specB\020\n\016execution_sinkB\024\n\022execution_i"
          + "dentityB\360\001\n#com.google.cloud.aiplatform."
          + "v1beta1B\031NotebookExecutionJobProtoP\001ZCcl"
          + "oud.google.com/go/aiplatform/apiv1beta1/"
          + "aiplatformpb;aiplatformpb\252\002\037Google.Cloud"
          + ".AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPla"
          + "tform\\V1beta1\352\002\"Google::Cloud::AIPlatfor"
          + "m::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor,
            new java.lang.String[] {
              "DataformRepositorySource",
              "GcsNotebookSource",
              "DirectNotebookSource",
              "NotebookRuntimeTemplateResourceName",
              "GcsOutputUri",
              "ExecutionUser",
              "ServiceAccount",
              "Name",
              "DisplayName",
              "ExecutionTimeout",
              "ScheduleResourceName",
              "JobState",
              "Status",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "NotebookSource",
              "EnvironmentSpec",
              "ExecutionSink",
              "ExecutionIdentity",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DataformRepositorySource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DataformRepositorySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DataformRepositorySource_descriptor,
            new java.lang.String[] {
              "DataformRepositoryResourceName", "CommitSha",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_GcsNotebookSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_GcsNotebookSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_GcsNotebookSource_descriptor,
            new java.lang.String[] {
              "Uri", "Generation",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DirectNotebookSource_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DirectNotebookSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_DirectNotebookSource_descriptor,
            new java.lang.String[] {
              "Content",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NotebookExecutionJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
