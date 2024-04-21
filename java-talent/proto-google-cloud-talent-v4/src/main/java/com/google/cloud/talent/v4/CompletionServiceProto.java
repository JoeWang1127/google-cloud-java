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
// source: google/cloud/talent/v4/completion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CompleteQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CompleteQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CompleteQueryResponse_CompletionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompleteQueryResponse_CompletionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/talent/v4/completion_serv"
          + "ice.proto\022\026google.cloud.talent.v4\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032#google/clo"
          + "ud/talent/v4/common.proto\"\210\004\n\024CompleteQu"
          + "eryRequest\0222\n\006tenant\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs"
          + ".googleapis.com/Tenant\022\022\n\005query\030\002 \001(\tB\003\340"
          + "A\002\022\026\n\016language_codes\030\003 \003(\t\022\026\n\tpage_size\030"
          + "\004 \001(\005B\003\340A\002\0221\n\007company\030\005 \001(\tB \372A\035\n\033jobs.g"
          + "oogleapis.com/Company\022K\n\005scope\030\006 \001(\0162<.g"
          + "oogle.cloud.talent.v4.CompleteQueryReque"
          + "st.CompletionScope\022I\n\004type\030\007 \001(\0162;.googl"
          + "e.cloud.talent.v4.CompleteQueryRequest.C"
          + "ompletionType\"K\n\017CompletionScope\022 \n\034COMP"
          + "LETION_SCOPE_UNSPECIFIED\020\000\022\n\n\006TENANT\020\001\022\n"
          + "\n\006PUBLIC\020\002\"`\n\016CompletionType\022\037\n\033COMPLETI"
          + "ON_TYPE_UNSPECIFIED\020\000\022\r\n\tJOB_TITLE\020\001\022\020\n\014"
          + "COMPANY_NAME\020\002\022\014\n\010COMBINED\020\003\"\266\002\n\025Complet"
          + "eQueryResponse\022Z\n\022completion_results\030\001 \003"
          + "(\0132>.google.cloud.talent.v4.CompleteQuer"
          + "yResponse.CompletionResult\022:\n\010metadata\030\002"
          + " \001(\0132(.google.cloud.talent.v4.ResponseMe"
          + "tadata\032\204\001\n\020CompletionResult\022\022\n\nsuggestio"
          + "n\030\001 \001(\t\022I\n\004type\030\002 \001(\0162;.google.cloud.tal"
          + "ent.v4.CompleteQueryRequest.CompletionTy"
          + "pe\022\021\n\timage_uri\030\003 \001(\t2\242\002\n\nCompletion\022\245\001\n"
          + "\rCompleteQuery\022,.google.cloud.talent.v4."
          + "CompleteQueryRequest\032-.google.cloud.tale"
          + "nt.v4.CompleteQueryResponse\"7\202\323\344\223\0021\022//v4"
          + "/{tenant=projects/*/tenants/*}:completeQ"
          + "uery\032l\312A\023jobs.googleapis.com\322AShttps://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/jobsBp\n\032co"
          + "m.google.cloud.talent.v4B\026CompletionServ"
          + "iceProtoP\001Z2cloud.google.com/go/talent/a"
          + "piv4/talentpb;talentpb\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4.CommonProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_CompleteQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_CompleteQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CompleteQueryRequest_descriptor,
            new java.lang.String[] {
              "Tenant", "Query", "LanguageCodes", "PageSize", "Company", "Scope", "Type",
            });
    internal_static_google_cloud_talent_v4_CompleteQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_CompleteQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CompleteQueryResponse_descriptor,
            new java.lang.String[] {
              "CompletionResults", "Metadata",
            });
    internal_static_google_cloud_talent_v4_CompleteQueryResponse_CompletionResult_descriptor =
        internal_static_google_cloud_talent_v4_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4_CompleteQueryResponse_CompletionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CompleteQueryResponse_CompletionResult_descriptor,
            new java.lang.String[] {
              "Suggestion", "Type", "ImageUri",
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
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
