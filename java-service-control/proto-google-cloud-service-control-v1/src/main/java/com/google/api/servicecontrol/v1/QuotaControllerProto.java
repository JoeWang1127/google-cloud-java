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
// source: google/api/servicecontrol/v1/quota_controller.proto

// Protobuf Java Version: 3.25.3
package com.google.api.servicecontrol.v1;

public final class QuotaControllerProto {
  private QuotaControllerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_QuotaOperation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_QuotaOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_QuotaOperation_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_QuotaOperation_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_AllocateQuotaResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_AllocateQuotaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_QuotaError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_QuotaError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/api/servicecontrol/v1/quota_con"
          + "troller.proto\022\034google.api.servicecontrol"
          + ".v1\032\034google/api/annotations.proto\032/googl"
          + "e/api/servicecontrol/v1/metric_value.pro"
          + "to\032\027google/rpc/status.proto\032\027google/api/"
          + "client.proto\"\221\001\n\024AllocateQuotaRequest\022\024\n"
          + "\014service_name\030\001 \001(\t\022H\n\022allocate_operatio"
          + "n\030\002 \001(\0132,.google.api.servicecontrol.v1.Q"
          + "uotaOperation\022\031\n\021service_config_id\030\004 \001(\t"
          + "\"\306\003\n\016QuotaOperation\022\024\n\014operation_id\030\001 \001("
          + "\t\022\023\n\013method_name\030\002 \001(\t\022\023\n\013consumer_id\030\003 "
          + "\001(\t\022H\n\006labels\030\004 \003(\01328.google.api.service"
          + "control.v1.QuotaOperation.LabelsEntry\022C\n"
          + "\rquota_metrics\030\005 \003(\0132,.google.api.servic"
          + "econtrol.v1.MetricValueSet\022J\n\nquota_mode"
          + "\030\006 \001(\01626.google.api.servicecontrol.v1.Qu"
          + "otaOperation.QuotaMode\032-\n\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"j\n\tQuotaMo"
          + "de\022\017\n\013UNSPECIFIED\020\000\022\n\n\006NORMAL\020\001\022\017\n\013BEST_"
          + "EFFORT\020\002\022\016\n\nCHECK_ONLY\020\003\022\016\n\nQUERY_ONLY\020\004"
          + "\022\017\n\013ADJUST_ONLY\020\005\"\320\001\n\025AllocateQuotaRespo"
          + "nse\022\024\n\014operation_id\030\001 \001(\t\022A\n\017allocate_er"
          + "rors\030\002 \003(\0132(.google.api.servicecontrol.v"
          + "1.QuotaError\022C\n\rquota_metrics\030\003 \003(\0132,.go"
          + "ogle.api.servicecontrol.v1.MetricValueSe"
          + "t\022\031\n\021service_config_id\030\004 \001(\t\"\234\002\n\nQuotaEr"
          + "ror\022;\n\004code\030\001 \001(\0162-.google.api.serviceco"
          + "ntrol.v1.QuotaError.Code\022\017\n\007subject\030\002 \001("
          + "\t\022\023\n\013description\030\003 \001(\t\022\"\n\006status\030\004 \001(\0132\022"
          + ".google.rpc.Status\"\206\001\n\004Code\022\017\n\013UNSPECIFI"
          + "ED\020\000\022\026\n\022RESOURCE_EXHAUSTED\020\010\022\026\n\022BILLING_"
          + "NOT_ACTIVE\020k\022\023\n\017PROJECT_DELETED\020l\022\023\n\017API"
          + "_KEY_INVALID\020i\022\023\n\017API_KEY_EXPIRED\020p2\305\002\n\017"
          + "QuotaController\022\256\001\n\rAllocateQuota\0222.goog"
          + "le.api.servicecontrol.v1.AllocateQuotaRe"
          + "quest\0323.google.api.servicecontrol.v1.All"
          + "ocateQuotaResponse\"4\202\323\344\223\002.\")/v1/services"
          + "/{service_name}:allocateQuota:\001*\032\200\001\312A\035se"
          + "rvicecontrol.googleapis.com\322A]https://ww"
          + "w.googleapis.com/auth/cloud-platform,htt"
          + "ps://www.googleapis.com/auth/servicecont"
          + "rolB\357\001\n com.google.api.servicecontrol.v1"
          + "B\024QuotaControllerProtoP\001ZJcloud.google.c"
          + "om/go/servicecontrol/apiv1/servicecontro"
          + "lpb;servicecontrolpb\370\001\001\252\002\036Google.Cloud.S"
          + "erviceControl.V1\312\002\036Google\\Cloud\\ServiceC"
          + "ontrol\\V1\352\002!Google::Cloud::ServiceContro"
          + "l::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.servicecontrol.v1.MetricValueSetProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_AllocateQuotaRequest_descriptor,
            new java.lang.String[] {
              "ServiceName", "AllocateOperation", "ServiceConfigId",
            });
    internal_static_google_api_servicecontrol_v1_QuotaOperation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_servicecontrol_v1_QuotaOperation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_QuotaOperation_descriptor,
            new java.lang.String[] {
              "OperationId", "MethodName", "ConsumerId", "Labels", "QuotaMetrics", "QuotaMode",
            });
    internal_static_google_api_servicecontrol_v1_QuotaOperation_LabelsEntry_descriptor =
        internal_static_google_api_servicecontrol_v1_QuotaOperation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_servicecontrol_v1_QuotaOperation_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_QuotaOperation_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_servicecontrol_v1_AllocateQuotaResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_servicecontrol_v1_AllocateQuotaResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_AllocateQuotaResponse_descriptor,
            new java.lang.String[] {
              "OperationId", "AllocateErrors", "QuotaMetrics", "ServiceConfigId",
            });
    internal_static_google_api_servicecontrol_v1_QuotaError_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_servicecontrol_v1_QuotaError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_QuotaError_descriptor,
            new java.lang.String[] {
              "Code", "Subject", "Description", "Status",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.servicecontrol.v1.MetricValueSetProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
