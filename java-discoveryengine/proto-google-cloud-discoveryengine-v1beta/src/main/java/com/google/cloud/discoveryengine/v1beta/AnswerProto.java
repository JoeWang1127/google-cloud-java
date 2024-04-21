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
// source: google/cloud/discoveryengine/v1beta/answer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public final class AnswerProto {
  private AnswerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_CitationSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_CitationSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_SearchAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_SearchAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/discoveryengine/v1beta/an"
          + "swer.proto\022#google.cloud.discoveryengine"
          + ".v1beta\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032\037google/prot"
          + "obuf/timestamp.proto\"\240\036\n\006Answer\022\021\n\004name\030"
          + "\001 \001(\tB\003\340A\005\022@\n\005state\030\002 \001(\01621.google.cloud"
          + ".discoveryengine.v1beta.Answer.State\022\023\n\013"
          + "answer_text\030\003 \001(\t\022G\n\tcitations\030\004 \003(\01324.g"
          + "oogle.cloud.discoveryengine.v1beta.Answe"
          + "r.Citation\022I\n\nreferences\030\005 \003(\01325.google."
          + "cloud.discoveryengine.v1beta.Answer.Refe"
          + "rence\022\031\n\021related_questions\030\006 \003(\t\022?\n\005step"
          + "s\030\007 \003(\01320.google.cloud.discoveryengine.v"
          + "1beta.Answer.Step\022d\n\030query_understanding"
          + "_info\030\n \001(\0132B.google.cloud.discoveryengi"
          + "ne.v1beta.Answer.QueryUnderstandingInfo\022"
          + "_\n\026answer_skipped_reasons\030\013 \003(\0162?.google"
          + ".cloud.discoveryengine.v1beta.Answer.Ans"
          + "werSkippedReason\0224\n\013create_time\030\010 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0226\n\rcomple"
          + "te_time\030\t \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\032\177\n\010Citation\022\023\n\013start_index\030\001 \001(\003\022"
          + "\021\n\tend_index\030\002 \001(\003\022K\n\007sources\030\003 \003(\0132:.go"
          + "ogle.cloud.discoveryengine.v1beta.Answer"
          + ".CitationSource\032&\n\016CitationSource\022\024\n\014ref"
          + "erence_id\030\001 \001(\t\032\215\007\n\tReference\022t\n\032unstruc"
          + "tured_document_info\030\001 \001(\0132N.google.cloud"
          + ".discoveryengine.v1beta.Answer.Reference"
          + ".UnstructuredDocumentInfoH\000\022U\n\nchunk_inf"
          + "o\030\002 \001(\0132?.google.cloud.discoveryengine.v"
          + "1beta.Answer.Reference.ChunkInfoH\000\032\245\002\n\030U"
          + "nstructuredDocumentInfo\022>\n\010document\030\001 \001("
          + "\tB,\372A)\n\'discoveryengine.googleapis.com/D"
          + "ocument\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022s\n\016c"
          + "hunk_contents\030\004 \003(\0132[.google.cloud.disco"
          + "veryengine.v1beta.Answer.Reference.Unstr"
          + "ucturedDocumentInfo.ChunkContent\0328\n\014Chun"
          + "kContent\022\017\n\007content\030\001 \001(\t\022\027\n\017page_identi"
          + "fier\030\002 \001(\t\032\377\002\n\tChunkInfo\0228\n\005chunk\030\001 \001(\tB"
          + ")\372A&\n$discoveryengine.googleapis.com/Chu"
          + "nk\022\017\n\007content\030\002 \001(\t\022\034\n\017relevance_score\030\003"
          + " \001(\002H\000\210\001\001\022k\n\021document_metadata\030\004 \001(\0132P.g"
          + "oogle.cloud.discoveryengine.v1beta.Answe"
          + "r.Reference.ChunkInfo.DocumentMetadata\032\207"
          + "\001\n\020DocumentMetadata\022>\n\010document\030\001 \001(\tB,\372"
          + "A)\n\'discoveryengine.googleapis.com/Docum"
          + "ent\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\027\n\017page_"
          + "identifier\030\004 \001(\tB\022\n\020_relevance_scoreB\t\n\007"
          + "content\032\252\010\n\004Step\022E\n\005state\030\001 \001(\01626.google"
          + ".cloud.discoveryengine.v1beta.Answer.Ste"
          + "p.State\022\023\n\013description\030\002 \001(\t\022\017\n\007thought\030"
          + "\003 \001(\t\022H\n\007actions\030\004 \003(\01327.google.cloud.di"
          + "scoveryengine.v1beta.Answer.Step.Action\032"
          + "\236\006\n\006Action\022]\n\rsearch_action\030\002 \001(\0132D.goog"
          + "le.cloud.discoveryengine.v1beta.Answer.S"
          + "tep.Action.SearchActionH\000\022X\n\013observation"
          + "\030\003 \001(\0132C.google.cloud.discoveryengine.v1"
          + "beta.Answer.Step.Action.Observation\032\035\n\014S"
          + "earchAction\022\r\n\005query\030\001 \001(\t\032\261\004\n\013Observati"
          + "on\022h\n\016search_results\030\002 \003(\0132P.google.clou"
          + "d.discoveryengine.v1beta.Answer.Step.Act"
          + "ion.Observation.SearchResult\032\267\003\n\014SearchR"
          + "esult\022\020\n\010document\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\r\n\005"
          + "title\030\003 \001(\t\022r\n\014snippet_info\030\004 \003(\0132\\.goog"
          + "le.cloud.discoveryengine.v1beta.Answer.S"
          + "tep.Action.Observation.SearchResult.Snip"
          + "petInfo\022n\n\nchunk_info\030\005 \003(\0132Z.google.clo"
          + "ud.discoveryengine.v1beta.Answer.Step.Ac"
          + "tion.Observation.SearchResult.ChunkInfo\032"
          + "6\n\013SnippetInfo\022\017\n\007snippet\030\001 \001(\t\022\026\n\016snipp"
          + "et_status\030\002 \001(\t\032]\n\tChunkInfo\022\r\n\005chunk\030\001 "
          + "\001(\t\022\017\n\007content\030\002 \001(\t\022\034\n\017relevance_score\030"
          + "\003 \001(\002H\000\210\001\001B\022\n\020_relevance_scoreB\010\n\006action"
          + "\"J\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\017\n\013IN_P"
          + "ROGRESS\020\001\022\n\n\006FAILED\020\002\022\r\n\tSUCCEEDED\020\003\032\207\003\n"
          + "\026QueryUnderstandingInfo\022}\n\031query_classif"
          + "ication_info\030\001 \003(\0132Z.google.cloud.discov"
          + "eryengine.v1beta.Answer.QueryUnderstandi"
          + "ngInfo.QueryClassificationInfo\032\355\001\n\027Query"
          + "ClassificationInfo\022m\n\004type\030\001 \001(\0162_.googl"
          + "e.cloud.discoveryengine.v1beta.Answer.Qu"
          + "eryUnderstandingInfo.QueryClassification"
          + "Info.Type\022\020\n\010positive\030\002 \001(\010\"Q\n\004Type\022\024\n\020T"
          + "YPE_UNSPECIFIED\020\000\022\025\n\021ADVERSARIAL_QUERY\020\001"
          + "\022\034\n\030NON_ANSWER_SEEKING_QUERY\020\002\"J\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022"
          + "\n\n\006FAILED\020\002\022\r\n\tSUCCEEDED\020\003\"\302\001\n\023AnswerSki"
          + "ppedReason\022%\n!ANSWER_SKIPPED_REASON_UNSP"
          + "ECIFIED\020\000\022\035\n\031ADVERSARIAL_QUERY_IGNORED\020\001"
          + "\022$\n NON_ANSWER_SEEKING_QUERY_IGNORED\020\002\022\037"
          + "\n\033OUT_OF_DOMAIN_QUERY_IGNORED\020\003\022\036\n\032POTEN"
          + "TIAL_POLICY_VIOLATION\020\004:\205\003\352A\201\003\n%discover"
          + "yengine.googleapis.com/Answer\022cprojects/"
          + "{project}/locations/{location}/dataStore"
          + "s/{data_store}/sessions/{session}/answer"
          + "s/{answer}\022|projects/{project}/locations"
          + "/{location}/collections/{collection}/dat"
          + "aStores/{data_store}/sessions/{session}/"
          + "answers/{answer}\022uprojects/{project}/loc"
          + "ations/{location}/collections/{collectio"
          + "n}/engines/{engine}/sessions/{session}/a"
          + "nswers/{answer}B\222\002\n\'com.google.cloud.dis"
          + "coveryengine.v1betaB\013AnswerProtoP\001ZQclou"
          + "d.google.com/go/discoveryengine/apiv1bet"
          + "a/discoveryenginepb;discoveryenginepb\242\002\017"
          + "DISCOVERYENGINE\252\002#Google.Cloud.Discovery"
          + "Engine.V1Beta\312\002#Google\\Cloud\\DiscoveryEn"
          + "gine\\V1beta\352\002&Google::Cloud::DiscoveryEn"
          + "gine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "AnswerText",
              "Citations",
              "References",
              "RelatedQuestions",
              "Steps",
              "QueryUnderstandingInfo",
              "AnswerSkippedReasons",
              "CreateTime",
              "CompleteTime",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Citation_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Sources",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_CitationSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_CitationSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_CitationSource_descriptor,
            new java.lang.String[] {
              "ReferenceId",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_descriptor,
            new java.lang.String[] {
              "UnstructuredDocumentInfo", "ChunkInfo", "Content",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "ChunkContents",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor,
            new java.lang.String[] {
              "Content", "PageIdentifier",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore", "DocumentMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "PageIdentifier",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_descriptor,
            new java.lang.String[] {
              "State", "Description", "Thought", "Actions",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_descriptor,
            new java.lang.String[] {
              "SearchAction", "Observation", "Action",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_SearchAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_SearchAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_SearchAction_descriptor,
            new java.lang.String[] {
              "Query",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_descriptor,
            new java.lang.String[] {
              "SearchResults",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "SnippetInfo", "ChunkInfo",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor,
            new java.lang.String[] {
              "Snippet", "SnippetStatus",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_descriptor,
            new java.lang.String[] {
              "QueryClassificationInfo",
            });
    internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor,
            new java.lang.String[] {
              "Type", "Positive",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
