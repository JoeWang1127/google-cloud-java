// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_action_recognition.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLVideoActionRecognitionProto {
  private AutoMLVideoActionRecognitionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\ncgoogle/cloud/aiplatform/v1beta1/schema" +
      "/trainingjob/definition/automl_video_act" +
      "ion_recognition.proto\022=google.cloud.aipl" +
      "atform.v1beta1.schema.trainingjob.defini" +
      "tion\"\221\001\n\034AutoMlVideoActionRecognition\022q\n" +
      "\006inputs\030\001 \001(\0132a.google.cloud.aiplatform." +
      "v1beta1.schema.trainingjob.definition.Au" +
      "toMlVideoActionRecognitionInputs\"\257\002\n\"Aut" +
      "oMlVideoActionRecognitionInputs\022\177\n\nmodel" +
      "_type\030\001 \001(\0162k.google.cloud.aiplatform.v1" +
      "beta1.schema.trainingjob.definition.Auto" +
      "MlVideoActionRecognitionInputs.ModelType" +
      "\"\207\001\n\tModelType\022\032\n\026MODEL_TYPE_UNSPECIFIED" +
      "\020\000\022\t\n\005CLOUD\020\001\022\026\n\022MOBILE_VERSATILE_1\020\002\022\035\n" +
      "\031MOBILE_JETSON_VERSATILE_1\020\003\022\034\n\030MOBILE_C" +
      "ORAL_VERSATILE_1\020\004B\227\003\nAcom.google.cloud." +
      "aiplatform.v1beta1.schema.trainingjob.de" +
      "finitionB!AutoMLVideoActionRecognitionPr" +
      "otoP\001Zggoogle.golang.org/genproto/google" +
      "apis/cloud/aiplatform/v1beta1/schema/tra" +
      "iningjob/definition;definition\252\002=Google." +
      "Cloud.AIPlatform.V1Beta1.Schema.Training" +
      "Job.Definition\312\002=Google\\Cloud\\AIPlatform" +
      "\\V1beta1\\Schema\\TrainingJob\\Definition\352\002" +
      "CGoogle::Cloud::AIPlatform::V1beta1::Sch" +
      "ema::TrainingJob::Definitionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognition_descriptor,
        new java.lang.String[] { "Inputs", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoActionRecognitionInputs_descriptor,
        new java.lang.String[] { "ModelType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}