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
// source: google/cloud/aiplatform/v1/schema/predict/params/image_object_detection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1.schema.predict.params;

public final class ImageObjectDetectionPredictionParamsProto {
  private ImageObjectDetectionPredictionParamsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageObjectDetectionPredictionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageObjectDetectionPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/params/image_object_detection.proto\022"
          + "0google.cloud.aiplatform.v1.schema.predi"
          + "ct.params\"]\n$ImageObjectDetectionPredict"
          + "ionParams\022\034\n\024confidence_threshold\030\001 \001(\002\022"
          + "\027\n\017max_predictions\030\002 \001(\005B\320\002\n4com.google."
          + "cloud.aiplatform.v1.schema.predict.param"
          + "sB)ImageObjectDetectionPredictionParamsP"
          + "rotoP\001ZLcloud.google.com/go/aiplatform/a"
          + "piv1/schema/predict/params/paramspb;para"
          + "mspb\252\0020Google.Cloud.AIPlatform.V1.Schema"
          + ".Predict.Params\312\0020Google\\Cloud\\AIPlatfor"
          + "m\\V1\\Schema\\Predict\\Params\352\0026Google::Clo"
          + "ud::AIPlatform::V1::Schema::Predict::Par"
          + "amsb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageObjectDetectionPredictionParams_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageObjectDetectionPredictionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageObjectDetectionPredictionParams_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold", "MaxPredictions",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
