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
// source: google/cloud/gkehub/v1alpha/cloudauditlogging/cloudauditlogging.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.cloudauditlogging.v1alpha;

public final class CloudAuditLoggingProto {
  private CloudAuditLoggingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/cloud/gkehub/v1alpha/cloudaudit"
          + "logging/cloudauditlogging.proto\022-google."
          + "cloud.gkehub.cloudauditlogging.v1alpha\"3"
          + "\n\013FeatureSpec\022$\n\034allowlisted_service_acc"
          + "ounts\030\001 \003(\tB\302\002\n1com.google.cloud.gkehub."
          + "cloudauditlogging.v1alphaB\026CloudAuditLog"
          + "gingProtoP\001Z_cloud.google.com/go/gkehub/"
          + "cloudauditlogging/apiv1alpha/cloudauditl"
          + "oggingpb;cloudauditloggingpb\252\002-Google.Cl"
          + "oud.GkeHub.CloudAuditLogging.V1Alpha\312\002-G"
          + "oogle\\Cloud\\GkeHub\\CloudAuditLogging\\V1a"
          + "lpha\352\0021Google::Cloud::GkeHub::CloudAudit"
          + "Logging::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_descriptor,
            new java.lang.String[] {
              "AllowlistedServiceAccounts",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
