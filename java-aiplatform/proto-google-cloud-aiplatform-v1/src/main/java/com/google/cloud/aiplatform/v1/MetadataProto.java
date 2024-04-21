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
// source: google/cloud/aiplatform/v1/metadata_store.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class MetadataProto {
  private MetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MetadataStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MetadataStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MetadataStore_MetadataStoreState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MetadataStore_MetadataStoreState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1/metadata_st"
          + "ore.proto\022\032google.cloud.aiplatform.v1\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\0320google/cloud/aiplatfo"
          + "rm/v1/encryption_spec.proto\032\037google/prot"
          + "obuf/timestamp.proto\"\347\003\n\rMetadataStore\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\0224\n\013updat"
          + "e_time\030\004 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\022C\n\017encryption_spec\030\005 \001(\0132*.google."
          + "cloud.aiplatform.v1.EncryptionSpec\022\023\n\013de"
          + "scription\030\006 \001(\t\022P\n\005state\030\007 \001(\0132<.google."
          + "cloud.aiplatform.v1.MetadataStore.Metada"
          + "taStoreStateB\003\340A\003\0324\n\022MetadataStoreState\022"
          + "\036\n\026disk_utilization_bytes\030\001 \001(\003:u\352Ar\n\'ai"
          + "platform.googleapis.com/MetadataStore\022Gp"
          + "rojects/{project}/locations/{location}/m"
          + "etadataStores/{metadata_store}B\313\001\n\036com.g"
          + "oogle.cloud.aiplatform.v1B\rMetadataProto"
          + "P\001Z>cloud.google.com/go/aiplatform/apiv1"
          + "/aiplatformpb;aiplatformpb\252\002\032Google.Clou"
          + "d.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfor"
          + "m\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_MetadataStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MetadataStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MetadataStore_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "EncryptionSpec", "Description", "State",
            });
    internal_static_google_cloud_aiplatform_v1_MetadataStore_MetadataStoreState_descriptor =
        internal_static_google_cloud_aiplatform_v1_MetadataStore_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MetadataStore_MetadataStoreState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MetadataStore_MetadataStoreState_descriptor,
            new java.lang.String[] {
              "DiskUtilizationBytes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
