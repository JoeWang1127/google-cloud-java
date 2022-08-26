/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recommendationengine/v1beta1/user_event.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class UserEventOuterClass {
  private UserEventOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_UserEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_UserEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_EventDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_EventDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ProductEventDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ProductEventDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_TaxesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_TaxesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_CostsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_CostsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ProductDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ProductDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/recommendationengine/v1be"
          + "ta1/user_event.proto\022)google.cloud.recom"
          + "mendationengine.v1beta1\032\037google/api/fiel"
          + "d_behavior.proto\0327google/cloud/recommend"
          + "ationengine/v1beta1/catalog.proto\0326googl"
          + "e/cloud/recommendationengine/v1beta1/com"
          + "mon.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\222\004\n\tUserEvent\022\027\n\nevent_type\030\001 \001(\tB\003\340A"
          + "\002\022K\n\tuser_info\030\002 \001(\01323.google.cloud.reco"
          + "mmendationengine.v1beta1.UserInfoB\003\340A\002\022Q"
          + "\n\014event_detail\030\003 \001(\01326.google.cloud.reco"
          + "mmendationengine.v1beta1.EventDetailB\003\340A"
          + "\001\022`\n\024product_event_detail\030\004 \001(\0132=.google"
          + ".cloud.recommendationengine.v1beta1.Prod"
          + "uctEventDetailB\003\340A\001\0223\n\nevent_time\030\005 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\001\022[\n\014even"
          + "t_source\030\006 \001(\0162@.google.cloud.recommenda"
          + "tionengine.v1beta1.UserEvent.EventSource"
          + "B\003\340A\001\"X\n\013EventSource\022\034\n\030EVENT_SOURCE_UNS"
          + "PECIFIED\020\000\022\n\n\006AUTOML\020\001\022\r\n\tECOMMERCE\020\002\022\020\n"
          + "\014BATCH_UPLOAD\020\003\"\215\001\n\010UserInfo\022\027\n\nvisitor_"
          + "id\030\001 \001(\tB\003\340A\002\022\024\n\007user_id\030\002 \001(\tB\003\340A\001\022\027\n\ni"
          + "p_address\030\003 \001(\tB\003\340A\001\022\027\n\nuser_agent\030\004 \001(\t"
          + "B\003\340A\001\022 \n\023direct_user_request\030\005 \001(\010B\003\340A\001\""
          + "\353\001\n\013EventDetail\022\020\n\003uri\030\001 \001(\tB\003\340A\001\022\031\n\014ref"
          + "errer_uri\030\006 \001(\tB\003\340A\001\022\031\n\014page_view_id\030\002 \001"
          + "(\tB\003\340A\001\022\033\n\016experiment_ids\030\003 \003(\tB\003\340A\001\022!\n\024"
          + "recommendation_token\030\004 \001(\tB\003\340A\001\022T\n\020event"
          + "_attributes\030\005 \001(\01325.google.cloud.recomme"
          + "ndationengine.v1beta1.FeatureMapB\003\340A\001\"\352\002"
          + "\n\022ProductEventDetail\022\024\n\014search_query\030\001 \001"
          + "(\t\022a\n\017page_categories\030\002 \003(\0132H.google.clo"
          + "ud.recommendationengine.v1beta1.CatalogI"
          + "tem.CategoryHierarchy\022Q\n\017product_details"
          + "\030\003 \003(\01328.google.cloud.recommendationengi"
          + "ne.v1beta1.ProductDetail\022\017\n\007list_id\030\004 \001("
          + "\t\022\024\n\007cart_id\030\005 \001(\tB\003\340A\001\022a\n\024purchase_tran"
          + "saction\030\006 \001(\0132>.google.cloud.recommendat"
          + "ionengine.v1beta1.PurchaseTransactionB\003\340"
          + "A\001\"\362\002\n\023PurchaseTransaction\022\017\n\002id\030\001 \001(\tB\003"
          + "\340A\001\022\024\n\007revenue\030\002 \001(\002B\003\340A\002\022]\n\005taxes\030\003 \003(\013"
          + "2I.google.cloud.recommendationengine.v1b"
          + "eta1.PurchaseTransaction.TaxesEntryB\003\340A\001"
          + "\022]\n\005costs\030\004 \003(\0132I.google.cloud.recommend"
          + "ationengine.v1beta1.PurchaseTransaction."
          + "CostsEntryB\003\340A\001\022\032\n\rcurrency_code\030\006 \001(\tB\003"
          + "\340A\002\032,\n\nTaxesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\002:\0028\001\032,\n\nCostsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\002:\0028\001\"\346\002\n\rProductDetail\022\017\n\002id\030"
          + "\001 \001(\tB\003\340A\002\022\032\n\rcurrency_code\030\002 \001(\tB\003\340A\001\022\033"
          + "\n\016original_price\030\003 \001(\002B\003\340A\001\022\032\n\rdisplay_p"
          + "rice\030\004 \001(\002B\003\340A\001\022b\n\013stock_state\030\005 \001(\0162H.g"
          + "oogle.cloud.recommendationengine.v1beta1"
          + ".ProductCatalogItem.StockStateB\003\340A\001\022\025\n\010q"
          + "uantity\030\006 \001(\005B\003\340A\001\022\037\n\022available_quantity"
          + "\030\007 \001(\005B\003\340A\001\022S\n\017item_attributes\030\010 \001(\01325.g"
          + "oogle.cloud.recommendationengine.v1beta1"
          + ".FeatureMapB\003\340A\001B\237\002\n-com.google.cloud.re"
          + "commendationengine.v1beta1P\001Z]google.gol"
          + "ang.org/genproto/googleapis/cloud/recomm"
          + "endationengine/v1beta1;recommendationeng"
          + "ine\242\002\005RECAI\252\002)Google.Cloud.Recommendatio"
          + "nEngine.V1Beta1\312\002)Google\\Cloud\\Recommend"
          + "ationEngine\\V1beta1\352\002,Google::Cloud::Rec"
          + "ommendationEngine::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.Catalog.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.Common.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_UserEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_UserEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_UserEvent_descriptor,
            new java.lang.String[] {
              "EventType",
              "UserInfo",
              "EventDetail",
              "ProductEventDetail",
              "EventTime",
              "EventSource",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_UserInfo_descriptor,
            new java.lang.String[] {
              "VisitorId", "UserId", "IpAddress", "UserAgent", "DirectUserRequest",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_EventDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_EventDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_EventDetail_descriptor,
            new java.lang.String[] {
              "Uri",
              "ReferrerUri",
              "PageViewId",
              "ExperimentIds",
              "RecommendationToken",
              "EventAttributes",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ProductEventDetail_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_ProductEventDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ProductEventDetail_descriptor,
            new java.lang.String[] {
              "SearchQuery",
              "PageCategories",
              "ProductDetails",
              "ListId",
              "CartId",
              "PurchaseTransaction",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_descriptor,
            new java.lang.String[] {
              "Id", "Revenue", "Taxes", "Costs", "CurrencyCode",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_TaxesEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_TaxesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_TaxesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_CostsEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_CostsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurchaseTransaction_CostsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ProductDetail_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommendationengine_v1beta1_ProductDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ProductDetail_descriptor,
            new java.lang.String[] {
              "Id",
              "CurrencyCode",
              "OriginalPrice",
              "DisplayPrice",
              "StockState",
              "Quantity",
              "AvailableQuantity",
              "ItemAttributes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.Catalog.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.Common.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}