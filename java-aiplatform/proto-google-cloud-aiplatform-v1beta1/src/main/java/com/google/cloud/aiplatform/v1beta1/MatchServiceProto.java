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
// source: google/cloud/aiplatform/v1beta1/match_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public final class MatchServiceProto {
  private MatchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_Query_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_Query_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_Neighbor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_Neighbor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_NearestNeighbors_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_NearestNeighbors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1beta1/match_"
          + "service.proto\022\037google.cloud.aiplatform.v"
          + "1beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032+google/cloud/aiplatform/v1beta1/index"
          + ".proto\"\325\003\n\024FindNeighborsRequest\022G\n\016index"
          + "_endpoint\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform.goog"
          + "leapis.com/IndexEndpoint\022\031\n\021deployed_ind"
          + "ex_id\030\002 \001(\t\022L\n\007queries\030\003 \003(\0132;.google.cl"
          + "oud.aiplatform.v1beta1.FindNeighborsRequ"
          + "est.Query\022\035\n\025return_full_datapoint\030\004 \001(\010"
          + "\032\353\001\n\005Query\022G\n\tdatapoint\030\001 \001(\0132/.google.c"
          + "loud.aiplatform.v1beta1.IndexDatapointB\003"
          + "\340A\002\022\026\n\016neighbor_count\030\002 \001(\005\022-\n%per_crowd"
          + "ing_attribute_neighbor_count\030\003 \001(\005\022\"\n\032ap"
          + "proximate_neighbor_count\030\004 \001(\005\022.\n&fracti"
          + "on_leaf_nodes_to_search_override\030\005 \001(\001\"\321"
          + "\002\n\025FindNeighborsResponse\022b\n\021nearest_neig"
          + "hbors\030\001 \003(\0132G.google.cloud.aiplatform.v1"
          + "beta1.FindNeighborsResponse.NearestNeigh"
          + "bors\032`\n\010Neighbor\022B\n\tdatapoint\030\001 \001(\0132/.go"
          + "ogle.cloud.aiplatform.v1beta1.IndexDatap"
          + "oint\022\020\n\010distance\030\002 \001(\001\032r\n\020NearestNeighbo"
          + "rs\022\n\n\002id\030\001 \001(\t\022R\n\tneighbors\030\002 \003(\0132?.goog"
          + "le.cloud.aiplatform.v1beta1.FindNeighbor"
          + "sResponse.Neighbor\"\215\001\n\032ReadIndexDatapoin"
          + "tsRequest\022G\n\016index_endpoint\030\001 \001(\tB/\340A\002\372A"
          + ")\n\'aiplatform.googleapis.com/IndexEndpoi"
          + "nt\022\031\n\021deployed_index_id\030\002 \001(\t\022\013\n\003ids\030\003 \003"
          + "(\t\"b\n\033ReadIndexDatapointsResponse\022C\n\ndat"
          + "apoints\030\001 \003(\0132/.google.cloud.aiplatform."
          + "v1beta1.IndexDatapoint2\257\004\n\014MatchService\022"
          + "\332\001\n\rFindNeighbors\0225.google.cloud.aiplatf"
          + "orm.v1beta1.FindNeighborsRequest\0326.googl"
          + "e.cloud.aiplatform.v1beta1.FindNeighbors"
          + "Response\"Z\202\323\344\223\002T\"O/v1beta1/{index_endpoi"
          + "nt=projects/*/locations/*/indexEndpoints"
          + "/*}:findNeighbors:\001*\022\362\001\n\023ReadIndexDatapo"
          + "ints\022;.google.cloud.aiplatform.v1beta1.R"
          + "eadIndexDatapointsRequest\032<.google.cloud"
          + ".aiplatform.v1beta1.ReadIndexDatapointsR"
          + "esponse\"`\202\323\344\223\002Z\"U/v1beta1/{index_endpoin"
          + "t=projects/*/locations/*/indexEndpoints/"
          + "*}:readIndexDatapoints:\001*\032M\312A\031aiplatform"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\350\001\n#com.google."
          + "cloud.aiplatform.v1beta1B\021MatchServicePr"
          + "otoP\001ZCcloud.google.com/go/aiplatform/ap"
          + "iv1beta1/aiplatformpb;aiplatformpb\252\002\037Goo"
          + "gle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cl"
          + "oud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::"
          + "AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IndexProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndexId", "Queries", "ReturnFullDatapoint",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_Query_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_Query_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsRequest_Query_descriptor,
            new java.lang.String[] {
              "Datapoint",
              "NeighborCount",
              "PerCrowdingAttributeNeighborCount",
              "ApproximateNeighborCount",
              "FractionLeafNodesToSearchOverride",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_descriptor,
            new java.lang.String[] {
              "NearestNeighbors",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_Neighbor_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_Neighbor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_Neighbor_descriptor,
            new java.lang.String[] {
              "Datapoint", "Distance",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_NearestNeighbors_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_NearestNeighbors_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FindNeighborsResponse_NearestNeighbors_descriptor,
            new java.lang.String[] {
              "Id", "Neighbors",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndexId", "Ids",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_descriptor,
            new java.lang.String[] {
              "Datapoints",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IndexProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
