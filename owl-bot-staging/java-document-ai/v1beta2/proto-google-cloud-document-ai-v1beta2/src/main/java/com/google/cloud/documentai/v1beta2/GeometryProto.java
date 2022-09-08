// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta2/geometry.proto

package com.google.cloud.documentai.v1beta2;

public final class GeometryProto {
  private GeometryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta2_Vertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta2_NormalizedVertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta2_BoundingPoly_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta2_BoundingPoly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/documentai/v1beta2/geomet" +
      "ry.proto\022\037google.cloud.documentai.v1beta" +
      "2\"\036\n\006Vertex\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005\"(\n\020Nor" +
      "malizedVertex\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"\231\001\n\014" +
      "BoundingPoly\0229\n\010vertices\030\001 \003(\0132\'.google." +
      "cloud.documentai.v1beta2.Vertex\022N\n\023norma" +
      "lized_vertices\030\002 \003(\01321.google.cloud.docu" +
      "mentai.v1beta2.NormalizedVertexB\352\001\n#com." +
      "google.cloud.documentai.v1beta2B\rGeometr" +
      "yProtoP\001ZIgoogle.golang.org/genproto/goo" +
      "gleapis/cloud/documentai/v1beta2;documen" +
      "tai\252\002\037Google.Cloud.DocumentAI.V1Beta2\312\002\037" +
      "Google\\Cloud\\DocumentAI\\V1beta2\352\002\"Google" +
      "::Cloud::DocumentAI::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_documentai_v1beta2_Vertex_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta2_Vertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta2_Vertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_documentai_v1beta2_NormalizedVertex_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta2_NormalizedVertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta2_NormalizedVertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_documentai_v1beta2_BoundingPoly_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta2_BoundingPoly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta2_BoundingPoly_descriptor,
        new java.lang.String[] { "Vertices", "NormalizedVertices", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}