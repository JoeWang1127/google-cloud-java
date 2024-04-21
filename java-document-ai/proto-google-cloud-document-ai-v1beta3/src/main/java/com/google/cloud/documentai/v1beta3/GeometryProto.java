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
// source: google/cloud/documentai/v1beta3/geometry.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1beta3;

public final class GeometryProto {
  private GeometryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Vertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_BoundingPoly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_BoundingPoly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/documentai/v1beta3/geomet"
          + "ry.proto\022\037google.cloud.documentai.v1beta"
          + "3\"\036\n\006Vertex\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005\"(\n\020Nor"
          + "malizedVertex\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"\231\001\n\014"
          + "BoundingPoly\0229\n\010vertices\030\001 \003(\0132\'.google."
          + "cloud.documentai.v1beta3.Vertex\022N\n\023norma"
          + "lized_vertices\030\002 \003(\01321.google.cloud.docu"
          + "mentai.v1beta3.NormalizedVertexB\344\001\n#com."
          + "google.cloud.documentai.v1beta3B\rGeometr"
          + "yProtoP\001ZCcloud.google.com/go/documentai"
          + "/apiv1beta3/documentaipb;documentaipb\252\002\037"
          + "Google.Cloud.DocumentAI.V1Beta3\312\002\037Google"
          + "\\Cloud\\DocumentAI\\V1beta3\352\002\"Google::Clou"
          + "d::DocumentAI::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_documentai_v1beta3_Vertex_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_Vertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Vertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_documentai_v1beta3_BoundingPoly_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_BoundingPoly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_BoundingPoly_descriptor,
            new java.lang.String[] {
              "Vertices", "NormalizedVertices",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
