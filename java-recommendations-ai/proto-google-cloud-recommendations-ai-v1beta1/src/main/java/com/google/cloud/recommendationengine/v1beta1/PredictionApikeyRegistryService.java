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
// source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.recommendationengine.v1beta1;

public final class PredictionApikeyRegistryService {
  private PredictionApikeyRegistryService() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nRgoogle/cloud/recommendationengine/v1be"
          + "ta1/prediction_apikey_registry_service.p"
          + "roto\022)google.cloud.recommendationengine."
          + "v1beta1\032\034google/api/annotations.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\032\033google/protobuf/empty"
          + ".proto\032\027google/api/client.proto\032Ngoogle/"
          + "cloud/recommendationengine/v1beta1/recom"
          + "mendationengine_resources.proto\"/\n\034Predi"
          + "ctionApiKeyRegistration\022\017\n\007api_key\030\001 \001(\t"
          + "\"\352\001\n)CreatePredictionApiKeyRegistrationR"
          + "equest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\n.recommen"
          + "dationengine.googleapis.com/EventStore\022u"
          + "\n\037prediction_api_key_registration\030\002 \001(\0132"
          + "G.google.cloud.recommendationengine.v1be"
          + "ta1.PredictionApiKeyRegistrationB\003\340A\002\"\243\001"
          + "\n(ListPredictionApiKeyRegistrationsReque"
          + "st\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\n.recommendati"
          + "onengine.googleapis.com/EventStore\022\026\n\tpa"
          + "ge_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003"
          + "\340A\001\"\267\001\n)ListPredictionApiKeyRegistration"
          + "sResponse\022q\n prediction_api_key_registra"
          + "tions\030\001 \003(\0132G.google.cloud.recommendatio"
          + "nengine.v1beta1.PredictionApiKeyRegistra"
          + "tion\022\027\n\017next_page_token\030\002 \001(\t\"\203\001\n)Delete"
          + "PredictionApiKeyRegistrationRequest\022V\n\004n"
          + "ame\030\001 \001(\tBH\340A\002\372AB\n@recommendationengine."
          + "googleapis.com/PredictionApiKeyRegistrat"
          + "ion2\227\010\n\030PredictionApiKeyRegistry\022\331\002\n\"Cre"
          + "atePredictionApiKeyRegistration\022T.google"
          + ".cloud.recommendationengine.v1beta1.Crea"
          + "tePredictionApiKeyRegistrationRequest\032G."
          + "google.cloud.recommendationengine.v1beta"
          + "1.PredictionApiKeyRegistration\"\223\001\332A&pare"
          + "nt,prediction_api_key_registration\202\323\344\223\002d"
          + "\"_/v1beta1/{parent=projects/*/locations/"
          + "*/catalogs/*/eventStores/*}/predictionAp"
          + "iKeyRegistrations:\001*\022\300\002\n!ListPredictionA"
          + "piKeyRegistrations\022S.google.cloud.recomm"
          + "endationengine.v1beta1.ListPredictionApi"
          + "KeyRegistrationsRequest\032T.google.cloud.r"
          + "ecommendationengine.v1beta1.ListPredicti"
          + "onApiKeyRegistrationsResponse\"p\332A\006parent"
          + "\202\323\344\223\002a\022_/v1beta1/{parent=projects/*/loca"
          + "tions/*/catalogs/*/eventStores/*}/predic"
          + "tionApiKeyRegistrations\022\202\002\n\"DeletePredic"
          + "tionApiKeyRegistration\022T.google.cloud.re"
          + "commendationengine.v1beta1.DeletePredict"
          + "ionApiKeyRegistrationRequest\032\026.google.pr"
          + "otobuf.Empty\"n\332A\004name\202\323\344\223\002a*_/v1beta1/{n"
          + "ame=projects/*/locations/*/catalogs/*/ev"
          + "entStores/*/predictionApiKeyRegistration"
          + "s/*}\032W\312A#recommendationengine.googleapis"
          + ".com\322A.https://www.googleapis.com/auth/c"
          + "loud-platformB\243\002\n-com.google.cloud.recom"
          + "mendationengine.v1beta1P\001Zacloud.google."
          + "com/go/recommendationengine/apiv1beta1/r"
          + "ecommendationenginepb;recommendationengi"
          + "nepb\242\002\005RECAI\252\002)Google.Cloud.Recommendati"
          + "onEngine.V1Beta1\312\002)Google\\Cloud\\Recommen"
          + "dationEngine\\V1beta1\352\002,Google::Cloud::Re"
          + "commendationEngine::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.RecommendationengineResources
                  .getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor,
            new java.lang.String[] {
              "ApiKey",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PredictionApiKeyRegistration",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_descriptor,
            new java.lang.String[] {
              "PredictionApiKeyRegistrations", "NextPageToken",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_descriptor,
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
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.RecommendationengineResources.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
