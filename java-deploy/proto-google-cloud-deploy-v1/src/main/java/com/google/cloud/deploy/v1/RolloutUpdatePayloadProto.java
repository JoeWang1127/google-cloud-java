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
// source: google/cloud/deploy/v1/rollout_update_payload.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

public final class RolloutUpdatePayloadProto {
  private RolloutUpdatePayloadProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_deploy_v1_RolloutUpdateEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_deploy_v1_RolloutUpdateEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/deploy/v1/rollout_update_"
          + "payload.proto\022\026google.cloud.deploy.v1\032&g"
          + "oogle/cloud/deploy/v1/log_enums.proto\"\227\004"
          + "\n\022RolloutUpdateEvent\022\017\n\007message\030\006 \001(\t\022\024\n"
          + "\014pipeline_uid\030\001 \001(\t\022\023\n\013release_uid\030\002 \001(\t"
          + "\022\017\n\007release\030\010 \001(\t\022\017\n\007rollout\030\003 \001(\t\022\021\n\tta"
          + "rget_id\030\004 \001(\t\022*\n\004type\030\007 \001(\0162\034.google.clo"
          + "ud.deploy.v1.Type\022Y\n\023rollout_update_type"
          + "\030\005 \001(\0162<.google.cloud.deploy.v1.RolloutU"
          + "pdateEvent.RolloutUpdateType\"\210\002\n\021Rollout"
          + "UpdateType\022#\n\037ROLLOUT_UPDATE_TYPE_UNSPEC"
          + "IFIED\020\000\022\013\n\007PENDING\020\001\022\023\n\017PENDING_RELEASE\020"
          + "\002\022\017\n\013IN_PROGRESS\020\003\022\016\n\nCANCELLING\020\004\022\r\n\tCA"
          + "NCELLED\020\005\022\n\n\006HALTED\020\006\022\r\n\tSUCCEEDED\020\007\022\n\n\006"
          + "FAILED\020\010\022\025\n\021APPROVAL_REQUIRED\020\t\022\014\n\010APPRO"
          + "VED\020\n\022\014\n\010REJECTED\020\013\022\024\n\020ADVANCE_REQUIRED\020"
          + "\014\022\014\n\010ADVANCED\020\rBm\n\032com.google.cloud.depl"
          + "oy.v1B\031RolloutUpdatePayloadProtoP\001Z2clou"
          + "d.google.com/go/deploy/apiv1/deploypb;de"
          + "ploypbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor(),
            });
    internal_static_google_cloud_deploy_v1_RolloutUpdateEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_deploy_v1_RolloutUpdateEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_deploy_v1_RolloutUpdateEvent_descriptor,
            new java.lang.String[] {
              "Message",
              "PipelineUid",
              "ReleaseUid",
              "Release",
              "Rollout",
              "TargetId",
              "Type",
              "RolloutUpdateType",
            });
    com.google.cloud.deploy.v1.LogEnumsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
