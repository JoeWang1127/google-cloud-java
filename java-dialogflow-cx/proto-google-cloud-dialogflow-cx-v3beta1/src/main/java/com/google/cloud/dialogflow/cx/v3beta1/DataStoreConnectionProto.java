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
// source: google/cloud/dialogflow/cx/v3beta1/data_store_connection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public final class DataStoreConnectionProto {
  private DataStoreConnectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_RewriterModelCallSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_RewriterModelCallSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SearchSnippet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SearchSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerPart_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerPart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_CitedSnippet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_CitedSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_GroundingSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_GroundingSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SafetySignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SafetySignals_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/dialogflow/cx/v3beta1/dat"
          + "a_store_connection.proto\022\"google.cloud.d"
          + "ialogflow.cx.v3beta1\032\037google/api/field_b"
          + "ehavior.proto\"u\n\023DataStoreConnection\022J\n\017"
          + "data_store_type\030\001 \001(\01621.google.cloud.dia"
          + "logflow.cx.v3beta1.DataStoreType\022\022\n\ndata"
          + "_store\030\002 \001(\t\"\301\022\n\032DataStoreConnectionSign"
          + "als\022\201\001\n\033rewriter_model_call_signals\030\001 \001("
          + "\0132W.google.cloud.dialogflow.cx.v3beta1.D"
          + "ataStoreConnectionSignals.RewriterModelC"
          + "allSignalsB\003\340A\001\022\034\n\017rewritten_query\030\002 \001(\t"
          + "B\003\340A\001\022j\n\017search_snippets\030\003 \003(\0132L.google."
          + "cloud.dialogflow.cx.v3beta1.DataStoreCon"
          + "nectionSignals.SearchSnippetB\003\340A\001\022\222\001\n$an"
          + "swer_generation_model_call_signals\030\004 \001(\013"
          + "2_.google.cloud.dialogflow.cx.v3beta1.Da"
          + "taStoreConnectionSignals.AnswerGeneratio"
          + "nModelCallSignalsB\003\340A\001\022\023\n\006answer\030\005 \001(\tB\003"
          + "\340A\001\022d\n\014answer_parts\030\006 \003(\0132I.google.cloud"
          + ".dialogflow.cx.v3beta1.DataStoreConnecti"
          + "onSignals.AnswerPartB\003\340A\001\022h\n\016cited_snipp"
          + "ets\030\007 \003(\0132K.google.cloud.dialogflow.cx.v"
          + "3beta1.DataStoreConnectionSignals.CitedS"
          + "nippetB\003\340A\001\022o\n\021grounding_signals\030\010 \001(\0132O"
          + ".google.cloud.dialogflow.cx.v3beta1.Data"
          + "StoreConnectionSignals.GroundingSignalsB"
          + "\003\340A\001\022i\n\016safety_signals\030\t \001(\0132L.google.cl"
          + "oud.dialogflow.cx.v3beta1.DataStoreConne"
          + "ctionSignals.SafetySignalsB\003\340A\001\032I\n\030Rewri"
          + "terModelCallSignals\022\027\n\017rendered_prompt\030\001"
          + " \001(\t\022\024\n\014model_output\030\002 \001(\t\032K\n\rSearchSnip"
          + "pet\022\026\n\016document_title\030\001 \001(\t\022\024\n\014document_"
          + "uri\030\002 \001(\t\022\014\n\004text\030\003 \001(\t\032Q\n AnswerGenerat"
          + "ionModelCallSignals\022\027\n\017rendered_prompt\030\001"
          + " \001(\t\022\024\n\014model_output\030\002 \001(\t\0326\n\nAnswerPart"
          + "\022\014\n\004text\030\001 \001(\t\022\032\n\022supporting_indices\030\002 \003"
          + "(\005\032\213\001\n\014CitedSnippet\022d\n\016search_snippet\030\001 "
          + "\001(\0132L.google.cloud.dialogflow.cx.v3beta1"
          + ".DataStoreConnectionSignals.SearchSnippe"
          + "t\022\025\n\rsnippet_index\030\002 \001(\005\032\347\003\n\020GroundingSi"
          + "gnals\022s\n\010decision\030\001 \001(\0162a.google.cloud.d"
          + "ialogflow.cx.v3beta1.DataStoreConnection"
          + "Signals.GroundingSignals.GroundingDecisi"
          + "on\022s\n\005score\030\002 \001(\0162d.google.cloud.dialogf"
          + "low.cx.v3beta1.DataStoreConnectionSignal"
          + "s.GroundingSignals.GroundingScoreBucket\""
          + "m\n\021GroundingDecision\022\"\n\036GROUNDING_DECISI"
          + "ON_UNSPECIFIED\020\000\022\031\n\025ACCEPTED_BY_GROUNDIN"
          + "G\020\001\022\031\n\025REJECTED_BY_GROUNDING\020\002\"z\n\024Ground"
          + "ingScoreBucket\022&\n\"GROUNDING_SCORE_BUCKET"
          + "_UNSPECIFIED\020\000\022\014\n\010VERY_LOW\020\001\022\007\n\003LOW\020\003\022\n\n"
          + "\006MEDIUM\020\004\022\010\n\004HIGH\020\005\022\r\n\tVERY_HIGH\020\006\032\243\004\n\rS"
          + "afetySignals\022m\n\010decision\030\001 \001(\0162[.google."
          + "cloud.dialogflow.cx.v3beta1.DataStoreCon"
          + "nectionSignals.SafetySignals.SafetyDecis"
          + "ion\022{\n\023banned_phrase_match\030\002 \001(\0162^.googl"
          + "e.cloud.dialogflow.cx.v3beta1.DataStoreC"
          + "onnectionSignals.SafetySignals.BannedPhr"
          + "aseMatch\022\035\n\025matched_banned_phrase\030\003 \001(\t\""
          + "m\n\016SafetyDecision\022\037\n\033SAFETY_DECISION_UNS"
          + "PECIFIED\020\000\022\034\n\030ACCEPTED_BY_SAFETY_CHECK\020\001"
          + "\022\034\n\030REJECTED_BY_SAFETY_CHECK\020\002\"\227\001\n\021Banne"
          + "dPhraseMatch\022#\n\037BANNED_PHRASE_MATCH_UNSP"
          + "ECIFIED\020\000\022\034\n\030BANNED_PHRASE_MATCH_NONE\020\001\022"
          + "\035\n\031BANNED_PHRASE_MATCH_QUERY\020\002\022 \n\034BANNED"
          + "_PHRASE_MATCH_RESPONSE\020\003*b\n\rDataStoreTyp"
          + "e\022\037\n\033DATA_STORE_TYPE_UNSPECIFIED\020\000\022\016\n\nPU"
          + "BLIC_WEB\020\001\022\020\n\014UNSTRUCTURED\020\002\022\016\n\nSTRUCTUR"
          + "ED\020\003B\322\001\n&com.google.cloud.dialogflow.cx."
          + "v3beta1B\030DataStoreConnectionProtoP\001Z6clo"
          + "ud.google.com/go/dialogflow/cx/apiv3beta"
          + "1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialo"
          + "gflow.Cx.V3Beta1\352\002&Google::Cloud::Dialog"
          + "flow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnection_descriptor,
            new java.lang.String[] {
              "DataStoreType", "DataStore",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor,
            new java.lang.String[] {
              "RewriterModelCallSignals",
              "RewrittenQuery",
              "SearchSnippets",
              "AnswerGenerationModelCallSignals",
              "Answer",
              "AnswerParts",
              "CitedSnippets",
              "GroundingSignals",
              "SafetySignals",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_RewriterModelCallSignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_RewriterModelCallSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_RewriterModelCallSignals_descriptor,
            new java.lang.String[] {
              "RenderedPrompt", "ModelOutput",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SearchSnippet_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SearchSnippet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SearchSnippet_descriptor,
            new java.lang.String[] {
              "DocumentTitle", "DocumentUri", "Text",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_descriptor,
            new java.lang.String[] {
              "RenderedPrompt", "ModelOutput",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerPart_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerPart_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_AnswerPart_descriptor,
            new java.lang.String[] {
              "Text", "SupportingIndices",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_CitedSnippet_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_CitedSnippet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_CitedSnippet_descriptor,
            new java.lang.String[] {
              "SearchSnippet", "SnippetIndex",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_GroundingSignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_GroundingSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_GroundingSignals_descriptor,
            new java.lang.String[] {
              "Decision", "Score",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SafetySignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SafetySignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DataStoreConnectionSignals_SafetySignals_descriptor,
            new java.lang.String[] {
              "Decision", "BannedPhraseMatch", "MatchedBannedPhrase",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
