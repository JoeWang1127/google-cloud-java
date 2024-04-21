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
// source: google/cloud/dialogflow/cx/v3beta1/session_entity_type.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public final class SessionEntityTypeProto {
  private SessionEntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/dialogflow/cx/v3beta1/ses"
          + "sion_entity_type.proto\022\"google.cloud.dia"
          + "logflow.cx.v3beta1\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0324google/cloud/dialogflow/c"
          + "x/v3beta1/entity_type.proto\032\033google/prot"
          + "obuf/empty.proto\032 google/protobuf/field_"
          + "mask.proto\"\377\004\n\021SessionEntityType\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\002\022k\n\024entity_override_mode\030\003 \001("
          + "\0162H.google.cloud.dialogflow.cx.v3beta1.S"
          + "essionEntityType.EntityOverrideModeB\003\340A\002"
          + "\022L\n\010entities\030\004 \003(\01325.google.cloud.dialog"
          + "flow.cx.v3beta1.EntityType.EntityB\003\340A\002\"\202"
          + "\001\n\022EntityOverrideMode\022$\n ENTITY_OVERRIDE"
          + "_MODE_UNSPECIFIED\020\000\022!\n\035ENTITY_OVERRIDE_M"
          + "ODE_OVERRIDE\020\001\022#\n\037ENTITY_OVERRIDE_MODE_S"
          + "UPPLEMENT\020\002:\226\002\352A\222\002\n+dialogflow.googleapi"
          + "s.com/SessionEntityType\022cprojects/{proje"
          + "ct}/locations/{location}/agents/{agent}/"
          + "sessions/{session}/entityTypes/{entity_t"
          + "ype}\022~projects/{project}/locations/{loca"
          + "tion}/agents/{agent}/environments/{envir"
          + "onment}/sessions/{session}/entityTypes/{"
          + "entity_type}\"\213\001\n\035ListSessionEntityTypesR"
          + "equest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\022+dialogfl"
          + "ow.googleapis.com/SessionEntityType\022\021\n\tp"
          + "age_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\216\001\n\036L"
          + "istSessionEntityTypesResponse\022S\n\024session"
          + "_entity_types\030\001 \003(\01325.google.cloud.dialo"
          + "gflow.cx.v3beta1.SessionEntityType\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"`\n\033GetSessionEntityT"
          + "ypeRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+dialog"
          + "flow.googleapis.com/SessionEntityType\"\276\001"
          + "\n\036CreateSessionEntityTypeRequest\022C\n\006pare"
          + "nt\030\001 \001(\tB3\340A\002\372A-\022+dialogflow.googleapis."
          + "com/SessionEntityType\022W\n\023session_entity_"
          + "type\030\002 \001(\01325.google.cloud.dialogflow.cx."
          + "v3beta1.SessionEntityTypeB\003\340A\002\"\252\001\n\036Updat"
          + "eSessionEntityTypeRequest\022W\n\023session_ent"
          + "ity_type\030\001 \001(\01325.google.cloud.dialogflow"
          + ".cx.v3beta1.SessionEntityTypeB\003\340A\002\022/\n\013up"
          + "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM"
          + "ask\"c\n\036DeleteSessionEntityTypeRequest\022A\n"
          + "\004name\030\001 \001(\tB3\340A\002\372A-\n+dialogflow.googleap"
          + "is.com/SessionEntityType2\245\017\n\022SessionEnti"
          + "tyTypes\022\327\002\n\026ListSessionEntityTypes\022A.goo"
          + "gle.cloud.dialogflow.cx.v3beta1.ListSess"
          + "ionEntityTypesRequest\032B.google.cloud.dia"
          + "logflow.cx.v3beta1.ListSessionEntityType"
          + "sResponse\"\265\001\332A\006parent\202\323\344\223\002\245\001\022H/v3beta1/{"
          + "parent=projects/*/locations/*/agents/*/s"
          + "essions/*}/entityTypesZY\022W/v3beta1/{pare"
          + "nt=projects/*/locations/*/agents/*/envir"
          + "onments/*/sessions/*}/entityTypes\022\304\002\n\024Ge"
          + "tSessionEntityType\022?.google.cloud.dialog"
          + "flow.cx.v3beta1.GetSessionEntityTypeRequ"
          + "est\0325.google.cloud.dialogflow.cx.v3beta1"
          + ".SessionEntityType\"\263\001\332A\004name\202\323\344\223\002\245\001\022H/v3"
          + "beta1/{name=projects/*/locations/*/agent"
          + "s/*/sessions/*/entityTypes/*}ZY\022W/v3beta"
          + "1/{name=projects/*/locations/*/agents/*/"
          + "environments/*/sessions/*/entityTypes/*}"
          + "\022\212\003\n\027CreateSessionEntityType\022B.google.cl"
          + "oud.dialogflow.cx.v3beta1.CreateSessionE"
          + "ntityTypeRequest\0325.google.cloud.dialogfl"
          + "ow.cx.v3beta1.SessionEntityType\"\363\001\332A\032par"
          + "ent,session_entity_type\202\323\344\223\002\317\001\"H/v3beta1"
          + "/{parent=projects/*/locations/*/agents/*"
          + "/sessions/*}/entityTypes:\023session_entity"
          + "_typeZn\"W/v3beta1/{parent=projects/*/loc"
          + "ations/*/agents/*/environments/*/session"
          + "s/*}/entityTypes:\023session_entity_type\022\270\003"
          + "\n\027UpdateSessionEntityType\022B.google.cloud"
          + ".dialogflow.cx.v3beta1.UpdateSessionEnti"
          + "tyTypeRequest\0325.google.cloud.dialogflow."
          + "cx.v3beta1.SessionEntityType\"\241\002\332A\037sessio"
          + "n_entity_type,update_mask\202\323\344\223\002\370\0012\\/v3bet"
          + "a1/{session_entity_type.name=projects/*/"
          + "locations/*/agents/*/sessions/*/entityTy"
          + "pes/*}:\023session_entity_typeZ\202\0012k/v3beta1"
          + "/{session_entity_type.name=projects/*/lo"
          + "cations/*/agents/*/environments/*/sessio"
          + "ns/*/entityTypes/*}:\023session_entity_type"
          + "\022\253\002\n\027DeleteSessionEntityType\022B.google.cl"
          + "oud.dialogflow.cx.v3beta1.DeleteSessionE"
          + "ntityTypeRequest\032\026.google.protobuf.Empty"
          + "\"\263\001\332A\004name\202\323\344\223\002\245\001*H/v3beta1/{name=projec"
          + "ts/*/locations/*/agents/*/sessions/*/ent"
          + "ityTypes/*}ZY*W/v3beta1/{name=projects/*"
          + "/locations/*/agents/*/environments/*/ses"
          + "sions/*/entityTypes/*}\032x\312A\031dialogflow.go"
          + "ogleapis.com\322AYhttps://www.googleapis.co"
          + "m/auth/cloud-platform,https://www.google"
          + "apis.com/auth/dialogflowB\320\001\n&com.google."
          + "cloud.dialogflow.cx.v3beta1B\026SessionEnti"
          + "tyTypeProtoP\001Z6cloud.google.com/go/dialo"
          + "gflow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\""
          + "Google.Cloud.Dialogflow.Cx.V3Beta1\352\002&Goo"
          + "gle::Cloud::Dialogflow::CX::V3beta1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.EntityTypeProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SessionEntityType_descriptor,
            new java.lang.String[] {
              "Name", "EntityOverrideMode", "Entities",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "SessionEntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SessionEntityType",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "SessionEntityType", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.EntityTypeProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
