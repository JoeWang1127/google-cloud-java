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
// source: google/cloud/aiplatform/v1beta1/feature_view_sync.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public final class FeatureViewSyncProto {
  private FeatureViewSyncProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_SyncSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_SyncSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/featur"
          + "e_view_sync.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032\037google/p"
          + "rotobuf/timestamp.proto\032\027google/rpc/stat"
          + "us.proto\032\032google/type/interval.proto\"\227\004\n"
          + "\017FeatureViewSync\022\021\n\004name\030\001 \001(\tB\003\340A\010\0224\n\013c"
          + "reate_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022,\n\010run_time\030\005 \001(\0132\025.google.typ"
          + "e.IntervalB\003\340A\003\022-\n\014final_status\030\004 \001(\0132\022."
          + "google.rpc.StatusB\003\340A\003\022W\n\014sync_summary\030\006"
          + " \001(\0132<.google.cloud.aiplatform.v1beta1.F"
          + "eatureViewSync.SyncSummaryB\003\340A\003\032?\n\013SyncS"
          + "ummary\022\027\n\nrow_synced\030\001 \001(\003B\003\340A\003\022\027\n\ntotal"
          + "_slot\030\002 \001(\003B\003\340A\003:\303\001\352A\277\001\n)aiplatform.goog"
          + "leapis.com/FeatureViewSync\022\221\001projects/{p"
          + "roject}/locations/{location}/featureOnli"
          + "neStores/{feature_online_store}/featureV"
          + "iews/{feature_view}/featureViewSyncs/fea"
          + "ture_view_syncB\353\001\n#com.google.cloud.aipl"
          + "atform.v1beta1B\024FeatureViewSyncProtoP\001ZC"
          + "cloud.google.com/go/aiplatform/apiv1beta"
          + "1/aiplatformpb;aiplatformpb\252\002\037Google.Clo"
          + "ud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIP"
          + "latform\\V1beta1\352\002\"Google::Cloud::Aiplatf"
          + "orm::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "RunTime", "FinalStatus", "SyncSummary",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_SyncSummary_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_SyncSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FeatureViewSync_SyncSummary_descriptor,
            new java.lang.String[] {
              "RowSynced", "TotalSlot",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
