// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class RecommendationengineResources {
  private RecommendationengineResources() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/recommendationengine/v1be" +
      "ta1/recommendationengine_resources.proto" +
      "\022)google.cloud.recommendationengine.v1be" +
      "ta1\032\031google/api/resource.protoB\253\010\n-com.g" +
      "oogle.cloud.recommendationengine.v1beta1" +
      "P\001Z]google.golang.org/genproto/googleapi" +
      "s/cloud/recommendationengine/v1beta1;rec" +
      "ommendationengine\242\002\005RECAI\252\002)Google.Cloud" +
      ".RecommendationEngine.V1Beta1\312\002)Google\\C" +
      "loud\\RecommendationEngine\\V1beta1\352\002,Goog" +
      "le::Cloud::RecommendationEngine::V1beta1" +
      "\352Ai\n+recommendationengine.googleapis.com" +
      "/Catalog\022:projects/{project}/locations/{" +
      "location}/catalogs/{catalog}\352A\225\001\n3recomm" +
      "endationengine.googleapis.com/CatalogIte" +
      "mPath\022^projects/{project}/locations/{loc" +
      "ation}/catalogs/{catalog}/catalogItems/{" +
      "catalog_item_path=**}\352A\206\001\n.recommendatio" +
      "nengine.googleapis.com/EventStore\022Tproje" +
      "cts/{project}/locations/{location}/catal" +
      "ogs/{catalog}/eventStores/{event_store}\352" +
      "A\331\001\n@recommendationengine.googleapis.com" +
      "/PredictionApiKeyRegistration\022\224\001projects" +
      "/{project}/locations/{location}/catalogs" +
      "/{catalog}/eventStores/{event_store}/pre" +
      "dictionApiKeyRegistrations/{prediction_a" +
      "pi_key_registration}\352A\234\001\n-recommendation" +
      "engine.googleapis.com/Placement\022kproject" +
      "s/{project}/locations/{location}/catalog" +
      "s/{catalog}/eventStores/{event_store}/pl" +
      "acements/{placement}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}