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
// source: google/cloud/dialogflow/v2/conversation_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

public final class ConversationModelProto {
  private ConversationModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ConversationModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_InputDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dialogflow/v2/conversatio"
          + "n_model.proto\022\032google.cloud.dialogflow.v"
          + "2\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032#go"
          + "ogle/longrunning/operations.proto\032\033googl"
          + "e/protobuf/empty.proto\032\037google/protobuf/"
          + "timestamp.proto\"\247\007\n\021ConversationModel\022\014\n"
          + "\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\0224"
          + "\n\013create_time\030\003 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022?\n\010datasets\030\004 \003(\0132(.google."
          + "cloud.dialogflow.v2.InputDatasetB\003\340A\002\022G\n"
          + "\005state\030\007 \001(\01623.google.cloud.dialogflow.v"
          + "2.ConversationModel.StateB\003\340A\003\022\025\n\rlangua"
          + "ge_code\030\023 \001(\t\022g\n!article_suggestion_mode"
          + "l_metadata\030\010 \001(\0132:.google.cloud.dialogfl"
          + "ow.v2.ArticleSuggestionModelMetadataH\000\022Y"
          + "\n\032smart_reply_model_metadata\030\t \001(\01323.goo"
          + "gle.cloud.dialogflow.v2.SmartReplyModelM"
          + "etadataH\000\"\221\001\n\005State\022\025\n\021STATE_UNSPECIFIED"
          + "\020\000\022\014\n\010CREATING\020\001\022\016\n\nUNDEPLOYED\020\002\022\r\n\tDEPL"
          + "OYING\020\003\022\014\n\010DEPLOYED\020\004\022\017\n\013UNDEPLOYING\020\005\022\014"
          + "\n\010DELETING\020\006\022\n\n\006FAILED\020\007\022\013\n\007PENDING\020\010\"g\n"
          + "\tModelType\022\032\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\""
          + "\n\036SMART_REPLY_DUAL_ENCODER_MODEL\020\002\022\032\n\026SM"
          + "ART_REPLY_BERT_MODEL\020\006:\276\001\352A\272\001\n+dialogflo"
          + "w.googleapis.com/ConversationModel\022Oproj"
          + "ects/{project}/locations/{location}/conv"
          + "ersationModels/{conversation_model}\022:pro"
          + "jects/{project}/conversationModels/{conv"
          + "ersation_model}B\020\n\016model_metadata\"\317\004\n\033Co"
          + "nversationModelEvaluation\022\014\n\004name\030\001 \001(\t\022"
          + "\031\n\014display_name\030\002 \001(\tB\003\340A\001\022L\n\021evaluation"
          + "_config\030\006 \001(\0132,.google.cloud.dialogflow."
          + "v2.EvaluationConfigB\003\340A\001\0224\n\013create_time\030"
          + "\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022Q"
          + "\n\023smart_reply_metrics\030\005 \001(\0132-.google.clo"
          + "ud.dialogflow.v2.SmartReplyMetricsB\003\340A\003H"
          + "\000\022(\n\033raw_human_eval_template_csv\030\010 \001(\tB\003"
          + "\340A\003:\372\001\352A\366\001\n5dialogflow.googleapis.com/Co"
          + "nversationModelEvaluation\022Sprojects/{pro"
          + "ject}/conversationModels/{conversation_m"
          + "odel}/evaluations/{evaluation}\022hprojects"
          + "/{project}/locations/{location}/conversa"
          + "tionModels/{conversation_model}/evaluati"
          + "ons/{evaluation}B\t\n\007metrics\"\234\004\n\020Evaluati"
          + "onConfig\022?\n\010datasets\030\003 \003(\0132(.google.clou"
          + "d.dialogflow.v2.InputDatasetB\003\340A\002\022[\n\022sma"
          + "rt_reply_config\030\002 \001(\0132=.google.cloud.dia"
          + "logflow.v2.EvaluationConfig.SmartReplyCo"
          + "nfigH\000\022_\n\024smart_compose_config\030\004 \001(\0132?.g"
          + "oogle.cloud.dialogflow.v2.EvaluationConf"
          + "ig.SmartComposeConfigH\000\032v\n\020SmartReplyCon"
          + "fig\022C\n\022allowlist_document\030\001 \001(\tB\'\372A$\n\"di"
          + "alogflow.googleapis.com/Document\022\035\n\020max_"
          + "result_count\030\002 \001(\005B\003\340A\002\032x\n\022SmartComposeC"
          + "onfig\022C\n\022allowlist_document\030\001 \001(\tB\'\372A$\n\""
          + "dialogflow.googleapis.com/Document\022\035\n\020ma"
          + "x_result_count\030\002 \001(\005B\003\340A\002B\027\n\025model_speci"
          + "fic_config\"V\n\014InputDataset\022F\n\007dataset\030\001 "
          + "\001(\tB5\340A\002\372A/\n-dialogflow.googleapis.com/C"
          + "onversationDataset\"{\n\036ArticleSuggestionM"
          + "odelMetadata\022Y\n\023training_model_type\030\003 \001("
          + "\01627.google.cloud.dialogflow.v2.Conversat"
          + "ionModel.ModelTypeB\003\340A\001\"t\n\027SmartReplyMod"
          + "elMetadata\022Y\n\023training_model_type\030\006 \001(\0162"
          + "7.google.cloud.dialogflow.v2.Conversatio"
          + "nModel.ModelTypeB\003\340A\001\"\307\001\n\021SmartReplyMetr"
          + "ics\022\032\n\022allowlist_coverage\030\001 \001(\002\022P\n\rtop_n"
          + "_metrics\030\002 \003(\01329.google.cloud.dialogflow"
          + ".v2.SmartReplyMetrics.TopNMetrics\022\032\n\022con"
          + "versation_count\030\003 \001(\003\032(\n\013TopNMetrics\022\t\n\001"
          + "n\030\001 \001(\005\022\016\n\006recall\030\002 \001(\002\"\200\001\n\036CreateConver"
          + "sationModelRequest\022\016\n\006parent\030\001 \001(\t\022N\n\022co"
          + "nversation_model\030\002 \001(\0132-.google.cloud.di"
          + "alogflow.v2.ConversationModelB\003\340A\002\"0\n\033Ge"
          + "tConversationModelRequest\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\002\"e\n\035ListConversationModelsRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022\026\n\tpage_size\030\002 \001(\005B\003\340"
          + "A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"\205\001\n\036ListConv"
          + "ersationModelsResponse\022J\n\023conversation_m"
          + "odels\030\001 \003(\0132-.google.cloud.dialogflow.v2"
          + ".ConversationModel\022\027\n\017next_page_token\030\002 "
          + "\001(\t\"3\n\036DeleteConversationModelRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\"3\n\036DeployConversationMo"
          + "delRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"5\n Undeplo"
          + "yConversationModelRequest\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\002\":\n%GetConversationModelEvaluationRe"
          + "quest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"o\n\'ListConversa"
          + "tionModelEvaluationsRequest\022\023\n\006parent\030\001 "
          + "\001(\tB\003\340A\002\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage"
          + "_token\030\003 \001(\tB\003\340A\001\"\244\001\n(ListConversationMo"
          + "delEvaluationsResponse\022_\n\036conversation_m"
          + "odel_evaluations\030\001 \003(\01327.google.cloud.di"
          + "alogflow.v2.ConversationModelEvaluation\022"
          + "\027\n\017next_page_token\030\002 \001(\t\"\336\001\n(CreateConve"
          + "rsationModelEvaluationRequest\022M\n\006parent\030"
          + "\001 \001(\tB=\340A\002\372A7\0225dialogflow.googleapis.com"
          + "/ConversationModelEvaluation\022c\n\035conversa"
          + "tion_model_evaluation\030\002 \001(\01327.google.clo"
          + "ud.dialogflow.v2.ConversationModelEvalua"
          + "tionB\003\340A\002\"\307\002\n(CreateConversationModelOpe"
          + "rationMetadata\022\032\n\022conversation_model\030\001 \001"
          + "(\t\022Y\n\005state\030\002 \001(\0162J.google.cloud.dialogf"
          + "low.v2.CreateConversationModelOperationM"
          + "etadata.State\022/\n\013create_time\030\003 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\"s\n\005State\022\025\n\021STATE"
          + "_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\r\n\tSUCCEEDED"
          + "\020\002\022\n\n\006FAILED\020\003\022\r\n\tCANCELLED\020\004\022\016\n\nCANCELL"
          + "ING\020\005\022\014\n\010TRAINING\020\006\"w\n(DeployConversatio"
          + "nModelOperationMetadata\022\032\n\022conversation_"
          + "model\030\001 \001(\t\022/\n\013create_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\"y\n*UndeployConversa"
          + "tionModelOperationMetadata\022\032\n\022conversati"
          + "on_model\030\001 \001(\t\022/\n\013create_time\030\003 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\"w\n(DeleteConvers"
          + "ationModelOperationMetadata\022\032\n\022conversat"
          + "ion_model\030\001 \001(\t\022/\n\013create_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\"\366\002\n2CreateConve"
          + "rsationModelEvaluationOperationMetadata\022"
          + "%\n\035conversation_model_evaluation\030\001 \001(\t\022\032"
          + "\n\022conversation_model\030\004 \001(\t\022c\n\005state\030\002 \001("
          + "\0162T.google.cloud.dialogflow.v2.CreateCon"
          + "versationModelEvaluationOperationMetadat"
          + "a.State\022/\n\013create_time\030\003 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\"g\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\020\n\014INITIALIZING\020\001\022\013\n\007RUNNING\020\002\022"
          + "\r\n\tCANCELLED\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAILED\020"
          + "\0052\376\026\n\022ConversationModels\022\350\002\n\027CreateConve"
          + "rsationModel\022:.google.cloud.dialogflow.v"
          + "2.CreateConversationModelRequest\032\035.googl"
          + "e.longrunning.Operation\"\361\001\312A=\n\021Conversat"
          + "ionModel\022(CreateConversationModelOperati"
          + "onMetadata\332A\031parent,conversation_model\202\323"
          + "\344\223\002\216\001\"*/v2/{parent=projects/*}/conversat"
          + "ionModels:\022conversation_modelZL\"6/v2/{pa"
          + "rent=projects/*/locations/*}/conversatio"
          + "nModels:\022conversation_model\022\363\001\n\024GetConve"
          + "rsationModel\0227.google.cloud.dialogflow.v"
          + "2.GetConversationModelRequest\032-.google.c"
          + "loud.dialogflow.v2.ConversationModel\"s\332A"
          + "\004name\202\323\344\223\002f\022*/v2/{name=projects/*/conver"
          + "sationModels/*}Z8\0226/v2/{name=projects/*/"
          + "locations/*/conversationModels/*}\022\206\002\n\026Li"
          + "stConversationModels\0229.google.cloud.dial"
          + "ogflow.v2.ListConversationModelsRequest\032"
          + ":.google.cloud.dialogflow.v2.ListConvers"
          + "ationModelsResponse\"u\332A\006parent\202\323\344\223\002f\022*/v"
          + "2/{parent=projects/*}/conversationModels"
          + "Z8\0226/v2/{parent=projects/*/locations/*}/"
          + "conversationModels\022\256\002\n\027DeleteConversatio"
          + "nModel\022:.google.cloud.dialogflow.v2.Dele"
          + "teConversationModelRequest\032\035.google.long"
          + "running.Operation\"\267\001\312AA\n\025google.protobuf"
          + ".Empty\022(DeleteConversationModelOperation"
          + "Metadata\332A\004name\202\323\344\223\002f**/v2/{name=project"
          + "s/*/conversationModels/*}Z8*6/v2/{name=p"
          + "rojects/*/locations/*/conversationModels"
          + "/*}\022\273\002\n\027DeployConversationModel\022:.google"
          + ".cloud.dialogflow.v2.DeployConversationM"
          + "odelRequest\032\035.google.longrunning.Operati"
          + "on\"\304\001\312AA\n\025google.protobuf.Empty\022(DeployC"
          + "onversationModelOperationMetadata\202\323\344\223\002z\""
          + "1/v2/{name=projects/*/conversationModels"
          + "/*}:deploy:\001*ZB\"=/v2/{name=projects/*/lo"
          + "cations/*/conversationModels/*}:deploy:\001"
          + "*\022\305\002\n\031UndeployConversationModel\022<.google"
          + ".cloud.dialogflow.v2.UndeployConversatio"
          + "nModelRequest\032\035.google.longrunning.Opera"
          + "tion\"\312\001\312AC\n\025google.protobuf.Empty\022*Undep"
          + "loyConversationModelOperationMetadata\202\323\344"
          + "\223\002~\"3/v2/{name=projects/*/conversationMo"
          + "dels/*}:undeploy:\001*ZD\"?/v2/{name=project"
          + "s/*/locations/*/conversationModels/*}:un"
          + "deploy:\001*\022\257\002\n\036GetConversationModelEvalua"
          + "tion\022A.google.cloud.dialogflow.v2.GetCon"
          + "versationModelEvaluationRequest\0327.google"
          + ".cloud.dialogflow.v2.ConversationModelEv"
          + "aluation\"\220\001\332A\004name\202\323\344\223\002\202\001\0228/v2/{name=pro"
          + "jects/*/conversationModels/*/evaluations"
          + "/*}ZF\022D/v2/{name=projects/*/locations/*/"
          + "conversationModels/*/evaluations/*}\022\302\002\n "
          + "ListConversationModelEvaluations\022C.googl"
          + "e.cloud.dialogflow.v2.ListConversationMo"
          + "delEvaluationsRequest\032D.google.cloud.dia"
          + "logflow.v2.ListConversationModelEvaluati"
          + "onsResponse\"\222\001\332A\006parent\202\323\344\223\002\202\001\0228/v2/{par"
          + "ent=projects/*/conversationModels/*}/eva"
          + "luationsZF\022D/v2/{parent=projects/*/locat"
          + "ions/*/conversationModels/*}/evaluations"
          + "\022\325\002\n!CreateConversationModelEvaluation\022D"
          + ".google.cloud.dialogflow.v2.CreateConver"
          + "sationModelEvaluationRequest\032\035.google.lo"
          + "ngrunning.Operation\"\312\001\312AQ\n\033ConversationM"
          + "odelEvaluation\0222CreateConversationModelE"
          + "valuationOperationMetadata\332A$parent,conv"
          + "ersation_model_evaluation\202\323\344\223\002I\"D/v2/{pa"
          + "rent=projects/*/locations/*/conversation"
          + "Models/*}/evaluations:\001*\032x\312A\031dialogflow."
          + "googleapis.com\322AYhttps://www.googleapis."
          + "com/auth/cloud-platform,https://www.goog"
          + "leapis.com/auth/dialogflowB\237\001\n\036com.googl"
          + "e.cloud.dialogflow.v2B\026ConversationModel"
          + "ProtoP\001Z>cloud.google.com/go/dialogflow/"
          + "apiv2/dialogflowpb;dialogflowpb\370\001\001\242\002\002DF\252"
          + "\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_ConversationModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_ConversationModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ConversationModel_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CreateTime",
              "Datasets",
              "State",
              "LanguageCode",
              "ArticleSuggestionModelMetadata",
              "SmartReplyModelMetadata",
              "ModelMetadata",
            });
    internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "EvaluationConfig",
              "CreateTime",
              "SmartReplyMetrics",
              "RawHumanEvalTemplateCsv",
              "Metrics",
            });
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor,
            new java.lang.String[] {
              "Datasets", "SmartReplyConfig", "SmartComposeConfig", "ModelSpecificConfig",
            });
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_descriptor =
        internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_descriptor,
            new java.lang.String[] {
              "AllowlistDocument", "MaxResultCount",
            });
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_descriptor =
        internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_descriptor,
            new java.lang.String[] {
              "AllowlistDocument", "MaxResultCount",
            });
    internal_static_google_cloud_dialogflow_v2_InputDataset_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_InputDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_InputDataset_descriptor,
            new java.lang.String[] {
              "Dataset",
            });
    internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor,
            new java.lang.String[] {
              "TrainingModelType",
            });
    internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor,
            new java.lang.String[] {
              "TrainingModelType",
            });
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor,
            new java.lang.String[] {
              "AllowlistCoverage", "TopNMetrics", "ConversationCount",
            });
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_descriptor =
        internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_descriptor,
            new java.lang.String[] {
              "N", "Recall",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ConversationModel",
            });
    internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor,
            new java.lang.String[] {
              "ConversationModels", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_descriptor,
            new java.lang.String[] {
              "ConversationModelEvaluations", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ConversationModelEvaluation",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "State", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(22);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModelEvaluation", "ConversationModel", "State", "CreateTime",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
