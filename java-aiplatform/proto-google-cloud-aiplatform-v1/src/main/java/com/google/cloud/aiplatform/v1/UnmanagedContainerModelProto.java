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
// source: google/cloud/aiplatform/v1/unmanaged_container_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class UnmanagedContainerModelProto {
  private UnmanagedContainerModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1/unmanaged_c"
          + "ontainer_model.proto\022\032google.cloud.aipla"
          + "tform.v1\032\037google/api/field_behavior.prot"
          + "o\032&google/cloud/aiplatform/v1/model.prot"
          + "o\"\303\001\n\027UnmanagedContainerModel\022\024\n\014artifac"
          + "t_uri\030\001 \001(\t\022E\n\020predict_schemata\030\002 \001(\0132+."
          + "google.cloud.aiplatform.v1.PredictSchema"
          + "ta\022K\n\016container_spec\030\003 \001(\0132..google.clou"
          + "d.aiplatform.v1.ModelContainerSpecB\003\340A\004B"
          + "\332\001\n\036com.google.cloud.aiplatform.v1B\034Unma"
          + "nagedContainerModelProtoP\001Z>cloud.google"
          + ".com/go/aiplatform/apiv1/aiplatformpb;ai"
          + "platformpb\252\002\032Google.Cloud.AIPlatform.V1\312"
          + "\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::C"
          + "loud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UnmanagedContainerModel_descriptor,
            new java.lang.String[] {
              "ArtifactUri", "PredictSchemata", "ContainerSpec",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
