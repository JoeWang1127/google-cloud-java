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
// source: google/devtools/artifactregistry/v1/apt_artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.artifactregistry.v1;

public final class AptArtifactProto {
  private AptArtifactProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_AptArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_AptArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsErrorInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsErrorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1/ap"
          + "t_artifact.proto\022#google.devtools.artifa"
          + "ctregistry.v1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\027googl"
          + "e/rpc/status.proto\"\272\003\n\013AptArtifact\022\021\n\004na"
          + "me\030\001 \001(\tB\003\340A\003\022\031\n\014package_name\030\002 \001(\tB\003\340A\003"
          + "\022W\n\014package_type\030\003 \001(\0162<.google.devtools"
          + ".artifactregistry.v1.AptArtifact.Package"
          + "TypeB\003\340A\003\022\031\n\014architecture\030\004 \001(\tB\003\340A\003\022\026\n\t"
          + "component\030\005 \001(\tB\003\340A\003\022\031\n\014control_file\030\006 \001"
          + "(\014B\003\340A\003\"C\n\013PackageType\022\034\n\030PACKAGE_TYPE_U"
          + "NSPECIFIED\020\000\022\n\n\006BINARY\020\001\022\n\n\006SOURCE\020\002:\220\001\352"
          + "A\214\001\n+artifactregistry.googleapis.com/Apt"
          + "Artifact\022]projects/{project}/locations/{"
          + "location}/repositories/{repository}/aptA"
          + "rtifacts/{apt_artifact}\"B\n\033ImportAptArti"
          + "factsGcsSource\022\014\n\004uris\030\001 \003(\t\022\025\n\ruse_wild"
          + "cards\030\002 \001(\010\"\215\001\n\031ImportAptArtifactsReques"
          + "t\022V\n\ngcs_source\030\002 \001(\0132@.google.devtools."
          + "artifactregistry.v1.ImportAptArtifactsGc"
          + "sSourceH\000\022\016\n\006parent\030\001 \001(\tB\010\n\006source\"\242\001\n\033"
          + "ImportAptArtifactsErrorInfo\022V\n\ngcs_sourc"
          + "e\030\001 \001(\0132@.google.devtools.artifactregist"
          + "ry.v1.ImportAptArtifactsGcsSourceH\000\022!\n\005e"
          + "rror\030\002 \001(\0132\022.google.rpc.StatusB\010\n\006source"
          + "\"\267\001\n\032ImportAptArtifactsResponse\022G\n\rapt_a"
          + "rtifacts\030\001 \003(\01320.google.devtools.artifac"
          + "tregistry.v1.AptArtifact\022P\n\006errors\030\002 \003(\013"
          + "2@.google.devtools.artifactregistry.v1.I"
          + "mportAptArtifactsErrorInfo\"\034\n\032ImportAptA"
          + "rtifactsMetadataB\373\001\n\'com.google.devtools"
          + ".artifactregistry.v1B\020AptArtifactProtoP\001"
          + "ZPcloud.google.com/go/artifactregistry/a"
          + "piv1/artifactregistrypb;artifactregistry"
          + "pb\252\002 Google.Cloud.ArtifactRegistry.V1\312\002 "
          + "Google\\Cloud\\ArtifactRegistry\\V1\352\002#Googl"
          + "e::Cloud::ArtifactRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_AptArtifact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_AptArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_AptArtifact_descriptor,
            new java.lang.String[] {
              "Name", "PackageName", "PackageType", "Architecture", "Component", "ControlFile",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsGcsSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsGcsSource_descriptor,
            new java.lang.String[] {
              "Uris", "UseWildcards",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsRequest_descriptor,
            new java.lang.String[] {
              "GcsSource", "Parent", "Source",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsErrorInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsErrorInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsErrorInfo_descriptor,
            new java.lang.String[] {
              "GcsSource", "Error", "Source",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsResponse_descriptor,
            new java.lang.String[] {
              "AptArtifacts", "Errors",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportAptArtifactsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
