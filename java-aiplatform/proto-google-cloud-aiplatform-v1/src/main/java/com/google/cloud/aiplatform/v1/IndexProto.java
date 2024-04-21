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
// source: google/cloud/aiplatform/v1/index.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class IndexProto {
  private IndexProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Index_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_IndexStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/index.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/aiplatform/v1/dep"
          + "loyed_index_ref.proto\0320google/cloud/aipl"
          + "atform/v1/encryption_spec.proto\032\034google/"
          + "protobuf/struct.proto\032\037google/protobuf/t"
          + "imestamp.proto\"\354\006\n\005Index\022\021\n\004name\030\001 \001(\tB\003"
          + "\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013descri"
          + "ption\030\003 \001(\t\022 \n\023metadata_schema_uri\030\004 \001(\t"
          + "B\003\340A\005\022(\n\010metadata\030\006 \001(\0132\026.google.protobu"
          + "f.Value\022K\n\020deployed_indexes\030\007 \003(\0132,.goog"
          + "le.cloud.aiplatform.v1.DeployedIndexRefB"
          + "\003\340A\003\022\014\n\004etag\030\010 \001(\t\022=\n\006labels\030\t \003(\0132-.goo"
          + "gle.cloud.aiplatform.v1.Index.LabelsEntr"
          + "y\0224\n\013create_time\030\n \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\0224\n\013update_time\030\013 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\022@\n\013index_s"
          + "tats\030\016 \001(\0132&.google.cloud.aiplatform.v1."
          + "IndexStatsB\003\340A\003\022U\n\023index_update_method\030\020"
          + " \001(\01623.google.cloud.aiplatform.v1.Index."
          + "IndexUpdateMethodB\003\340A\005\022H\n\017encryption_spe"
          + "c\030\021 \001(\0132*.google.cloud.aiplatform.v1.Enc"
          + "ryptionSpecB\003\340A\005\032-\n\013LabelsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"]\n\021IndexUpdateMe"
          + "thod\022#\n\037INDEX_UPDATE_METHOD_UNSPECIFIED\020"
          + "\000\022\020\n\014BATCH_UPDATE\020\001\022\021\n\rSTREAM_UPDATE\020\002:]"
          + "\352AZ\n\037aiplatform.googleapis.com/Index\0227pr"
          + "ojects/{project}/locations/{location}/in"
          + "dexes/{index}\"\203\006\n\016IndexDatapoint\022\031\n\014data"
          + "point_id\030\001 \001(\tB\003\340A\002\022\033\n\016feature_vector\030\002 "
          + "\003(\002B\003\340A\002\022N\n\trestricts\030\004 \003(\01326.google.clo"
          + "ud.aiplatform.v1.IndexDatapoint.Restrict"
          + "ionB\003\340A\001\022]\n\021numeric_restricts\030\006 \003(\0132=.go"
          + "ogle.cloud.aiplatform.v1.IndexDatapoint."
          + "NumericRestrictionB\003\340A\001\022Q\n\014crowding_tag\030"
          + "\005 \001(\01326.google.cloud.aiplatform.v1.Index"
          + "Datapoint.CrowdingTagB\003\340A\001\032G\n\013Restrictio"
          + "n\022\021\n\tnamespace\030\001 \001(\t\022\022\n\nallow_list\030\002 \003(\t"
          + "\022\021\n\tdeny_list\030\003 \003(\t\032\302\002\n\022NumericRestricti"
          + "on\022\023\n\tvalue_int\030\002 \001(\003H\000\022\025\n\013value_float\030\003"
          + " \001(\002H\000\022\026\n\014value_double\030\004 \001(\001H\000\022\021\n\tnamesp"
          + "ace\030\001 \001(\t\022R\n\002op\030\005 \001(\0162F.google.cloud.aip"
          + "latform.v1.IndexDatapoint.NumericRestric"
          + "tion.Operator\"x\n\010Operator\022\030\n\024OPERATOR_UN"
          + "SPECIFIED\020\000\022\010\n\004LESS\020\001\022\016\n\nLESS_EQUAL\020\002\022\t\n"
          + "\005EQUAL\020\003\022\021\n\rGREATER_EQUAL\020\004\022\013\n\007GREATER\020\005"
          + "\022\r\n\tNOT_EQUAL\020\006B\007\n\005Value\032)\n\013CrowdingTag\022"
          + "\032\n\022crowding_attribute\030\001 \001(\t\"C\n\nIndexStat"
          + "s\022\032\n\rvectors_count\030\001 \001(\003B\003\340A\003\022\031\n\014shards_"
          + "count\030\002 \001(\005B\003\340A\003B\310\001\n\036com.google.cloud.ai"
          + "platform.v1B\nIndexProtoP\001Z>cloud.google."
          + "com/go/aiplatform/apiv1/aiplatformpb;aip"
          + "latformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002"
          + "\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cl"
          + "oud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Index_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Index_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "IndexStats",
              "IndexUpdateMethod",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Index_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor,
            new java.lang.String[] {
              "DatapointId", "FeatureVector", "Restricts", "NumericRestricts", "CrowdingTag",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_Restriction_descriptor,
            new java.lang.String[] {
              "Namespace", "AllowList", "DenyList",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_NumericRestriction_descriptor,
            new java.lang.String[] {
              "ValueInt", "ValueFloat", "ValueDouble", "Namespace", "Op", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor =
        internal_static_google_cloud_aiplatform_v1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexDatapoint_CrowdingTag_descriptor,
            new java.lang.String[] {
              "CrowdingAttribute",
            });
    internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_IndexStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_IndexStats_descriptor,
            new java.lang.String[] {
              "VectorsCount", "ShardsCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
