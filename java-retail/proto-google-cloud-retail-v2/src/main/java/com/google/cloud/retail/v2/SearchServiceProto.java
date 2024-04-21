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
// source: google/cloud/retail/v2/search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2;

public final class SearchServiceProto {
  private SearchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_PersonalizationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_PersonalizationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_SpellCorrectionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_SpellCorrectionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchRequest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ExperimentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ExperimentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ExperimentInfo_ServingConfigExperiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ExperimentInfo_ServingConfigExperiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/retail/v2/search_service."
          + "proto\022\026google.cloud.retail.v2\032\034google/ap"
          + "i/annotations.proto\032\027google/api/client.p"
          + "roto\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032#google/cloud/r"
          + "etail/v2/common.proto\032$google/cloud/reta"
          + "il/v2/product.proto\032 google/protobuf/fie"
          + "ld_mask.proto\032\034google/protobuf/struct.pr"
          + "oto\"\276\023\n\rSearchRequest\022\026\n\tplacement\030\001 \001(\t"
          + "B\003\340A\002\0221\n\006branch\030\002 \001(\tB!\372A\036\n\034retail.googl"
          + "eapis.com/Branch\022\r\n\005query\030\003 \001(\t\022\027\n\nvisit"
          + "or_id\030\004 \001(\tB\003\340A\002\0223\n\tuser_info\030\005 \001(\0132 .go"
          + "ogle.cloud.retail.v2.UserInfo\022\021\n\tpage_si"
          + "ze\030\007 \001(\005\022\022\n\npage_token\030\010 \001(\t\022\016\n\006offset\030\t"
          + " \001(\005\022\016\n\006filter\030\n \001(\t\022\030\n\020canonical_filter"
          + "\030\034 \001(\t\022\020\n\010order_by\030\013 \001(\t\022D\n\013facet_specs\030"
          + "\014 \003(\0132/.google.cloud.retail.v2.SearchReq"
          + "uest.FacetSpec\022V\n\022dynamic_facet_spec\030\025 \001"
          + "(\01326.google.cloud.retail.v2.SearchReques"
          + "t.DynamicFacetSpecB\002\030\001\022C\n\nboost_spec\030\r \001"
          + "(\0132/.google.cloud.retail.v2.SearchReques"
          + "t.BoostSpec\022V\n\024query_expansion_spec\030\016 \001("
          + "\01328.google.cloud.retail.v2.SearchRequest"
          + ".QueryExpansionSpec\022\033\n\023variant_rollup_ke"
          + "ys\030\021 \003(\t\022\027\n\017page_categories\030\027 \003(\t\022E\n\013sea"
          + "rch_mode\030\037 \001(\01620.google.cloud.retail.v2."
          + "SearchRequest.SearchMode\022W\n\024personalizat"
          + "ion_spec\030  \001(\01329.google.cloud.retail.v2."
          + "SearchRequest.PersonalizationSpec\022A\n\006lab"
          + "els\030\" \003(\01321.google.cloud.retail.v2.Searc"
          + "hRequest.LabelsEntry\022]\n\025spell_correction"
          + "_spec\030# \001(\01329.google.cloud.retail.v2.Sea"
          + "rchRequest.SpellCorrectionSpecH\000\210\001\001\022\016\n\006e"
          + "ntity\030& \001(\t\032\221\003\n\tFacetSpec\022P\n\tfacet_key\030\001"
          + " \001(\01328.google.cloud.retail.v2.SearchRequ"
          + "est.FacetSpec.FacetKeyB\003\340A\002\022\r\n\005limit\030\002 \001"
          + "(\005\022\034\n\024excluded_filter_keys\030\003 \003(\t\022\037\n\027enab"
          + "le_dynamic_position\030\004 \001(\010\032\343\001\n\010FacetKey\022\020"
          + "\n\003key\030\001 \001(\tB\003\340A\002\0223\n\tintervals\030\002 \003(\0132 .go"
          + "ogle.cloud.retail.v2.Interval\022\031\n\021restric"
          + "ted_values\030\003 \003(\t\022\020\n\010prefixes\030\010 \003(\t\022\020\n\010co"
          + "ntains\030\t \003(\t\022\030\n\020case_insensitive\030\n \001(\010\022\020"
          + "\n\010order_by\030\004 \001(\t\022\r\n\005query\030\005 \001(\t\022\026\n\016retur"
          + "n_min_max\030\013 \001(\010\032\226\001\n\020DynamicFacetSpec\022I\n\004"
          + "mode\030\001 \001(\0162;.google.cloud.retail.v2.Sear"
          + "chRequest.DynamicFacetSpec.Mode\"7\n\004Mode\022"
          + "\024\n\020MODE_UNSPECIFIED\020\000\022\014\n\010DISABLED\020\001\022\013\n\007E"
          + "NABLED\020\002\032\356\001\n\tBoostSpec\022a\n\025condition_boos"
          + "t_specs\030\001 \003(\0132B.google.cloud.retail.v2.S"
          + "earchRequest.BoostSpec.ConditionBoostSpe"
          + "c\022\'\n\032skip_boost_spec_validation\030\002 \001(\010H\000\210"
          + "\001\001\0326\n\022ConditionBoostSpec\022\021\n\tcondition\030\001 "
          + "\001(\t\022\r\n\005boost\030\002 \001(\002B\035\n\033_skip_boost_spec_v"
          + "alidation\032\313\001\n\022QueryExpansionSpec\022U\n\tcond"
          + "ition\030\001 \001(\0162B.google.cloud.retail.v2.Sea"
          + "rchRequest.QueryExpansionSpec.Condition\022"
          + "\036\n\026pin_unexpanded_results\030\002 \001(\010\">\n\tCondi"
          + "tion\022\031\n\025CONDITION_UNSPECIFIED\020\000\022\014\n\010DISAB"
          + "LED\020\001\022\010\n\004AUTO\020\003\032\231\001\n\023PersonalizationSpec\022"
          + "L\n\004mode\030\001 \001(\0162>.google.cloud.retail.v2.S"
          + "earchRequest.PersonalizationSpec.Mode\"4\n"
          + "\004Mode\022\024\n\020MODE_UNSPECIFIED\020\000\022\010\n\004AUTO\020\001\022\014\n"
          + "\010DISABLED\020\002\032\240\001\n\023SpellCorrectionSpec\022L\n\004m"
          + "ode\030\001 \001(\0162>.google.cloud.retail.v2.Searc"
          + "hRequest.SpellCorrectionSpec.Mode\";\n\004Mod"
          + "e\022\024\n\020MODE_UNSPECIFIED\020\000\022\023\n\017SUGGESTION_ON"
          + "LY\020\001\022\010\n\004AUTO\020\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"[\n\nSearchMode\022\033\n\027S"
          + "EARCH_MODE_UNSPECIFIED\020\000\022\027\n\023PRODUCT_SEAR"
          + "CH_ONLY\020\001\022\027\n\023FACETED_SEARCH_ONLY\020\002B\030\n\026_s"
          + "pell_correction_spec\"\232\013\n\016SearchResponse\022"
          + "D\n\007results\030\001 \003(\01323.google.cloud.retail.v"
          + "2.SearchResponse.SearchResult\022<\n\006facets\030"
          + "\002 \003(\0132,.google.cloud.retail.v2.SearchRes"
          + "ponse.Facet\022\022\n\ntotal_size\030\003 \001(\005\022\027\n\017corre"
          + "cted_query\030\004 \001(\t\022\031\n\021attribution_token\030\005 "
          + "\001(\t\022\027\n\017next_page_token\030\006 \001(\t\022W\n\024query_ex"
          + "pansion_info\030\007 \001(\01329.google.cloud.retail"
          + ".v2.SearchResponse.QueryExpansionInfo\022\024\n"
          + "\014redirect_uri\030\n \001(\t\022\030\n\020applied_controls\030"
          + "\014 \003(\t\022i\n\035invalid_condition_boost_specs\030\016"
          + " \003(\0132B.google.cloud.retail.v2.SearchRequ"
          + "est.BoostSpec.ConditionBoostSpec\022?\n\017expe"
          + "riment_info\030\021 \003(\0132&.google.cloud.retail."
          + "v2.ExperimentInfo\032\221\004\n\014SearchResult\022\n\n\002id"
          + "\030\001 \001(\t\0220\n\007product\030\002 \001(\0132\037.google.cloud.r"
          + "etail.v2.Product\022\036\n\026matching_variant_cou"
          + "nt\030\003 \001(\005\022o\n\027matching_variant_fields\030\004 \003("
          + "\0132N.google.cloud.retail.v2.SearchRespons"
          + "e.SearchResult.MatchingVariantFieldsEntr"
          + "y\022k\n\025variant_rollup_values\030\005 \003(\0132L.googl"
          + "e.cloud.retail.v2.SearchResponse.SearchR"
          + "esult.VariantRollupValuesEntry\022\027\n\017person"
          + "al_labels\030\007 \003(\t\032X\n\032MatchingVariantFields"
          + "Entry\022\013\n\003key\030\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.goog"
          + "le.protobuf.FieldMask:\0028\001\032R\n\030VariantRoll"
          + "upValuesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001("
          + "\0132\026.google.protobuf.Value:\0028\001\032\216\002\n\005Facet\022"
          + "\013\n\003key\030\001 \001(\t\022G\n\006values\030\002 \003(\01327.google.cl"
          + "oud.retail.v2.SearchResponse.Facet.Facet"
          + "Value\022\025\n\rdynamic_facet\030\003 \001(\010\032\227\001\n\nFacetVa"
          + "lue\022\017\n\005value\030\001 \001(\tH\000\0224\n\010interval\030\002 \001(\0132 "
          + ".google.cloud.retail.v2.IntervalH\000\022\r\n\005co"
          + "unt\030\003 \001(\003\022\021\n\tmin_value\030\005 \001(\001\022\021\n\tmax_valu"
          + "e\030\006 \001(\001B\r\n\013facet_value\032I\n\022QueryExpansion"
          + "Info\022\026\n\016expanded_query\030\001 \001(\010\022\033\n\023pinned_r"
          + "esult_count\030\002 \001(\003\"\373\002\n\016ExperimentInfo\022c\n\031"
          + "serving_config_experiment\030\002 \001(\0132>.google"
          + ".cloud.retail.v2.ExperimentInfo.ServingC"
          + "onfigExperimentH\000\0229\n\nexperiment\030\001 \001(\tB%\372"
          + "A\"\n retail.googleapis.com/Experiment\032\261\001\n"
          + "\027ServingConfigExperiment\022I\n\027original_ser"
          + "ving_config\030\001 \001(\tB(\372A%\n#retail.googleapi"
          + "s.com/ServingConfig\022K\n\031experiment_servin"
          + "g_config\030\002 \001(\tB(\372A%\n#retail.googleapis.c"
          + "om/ServingConfigB\025\n\023experiment_metadata2"
          + "\330\002\n\rSearchService\022\373\001\n\006Search\022%.google.cl"
          + "oud.retail.v2.SearchRequest\032&.google.clo"
          + "ud.retail.v2.SearchResponse\"\241\001\202\323\344\223\002\232\001\"E/"
          + "v2/{placement=projects/*/locations/*/cat"
          + "alogs/*/placements/*}:search:\001*ZN\"I/v2/{"
          + "placement=projects/*/locations/*/catalog"
          + "s/*/servingConfigs/*}:search:\001*\032I\312A\025reta"
          + "il.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\267\002\n\032com.googl"
          + "e.cloud.retail.v2B\022SearchServiceProtoP\001Z"
          + "2cloud.google.com/go/retail/apiv2/retail"
          + "pb;retailpb\242\002\006RETAIL\252\002\026Google.Cloud.Reta"
          + "il.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google:"
          + ":Cloud::Retail::V2\352Aw\n retail.googleapis"
          + ".com/Experiment\022Sprojects/{project}/loca"
          + "tions/{location}/catalogs/{catalog}/expe"
          + "riments/{experiment}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2.ProductProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_SearchRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_descriptor,
            new java.lang.String[] {
              "Placement",
              "Branch",
              "Query",
              "VisitorId",
              "UserInfo",
              "PageSize",
              "PageToken",
              "Offset",
              "Filter",
              "CanonicalFilter",
              "OrderBy",
              "FacetSpecs",
              "DynamicFacetSpec",
              "BoostSpec",
              "QueryExpansionSpec",
              "VariantRollupKeys",
              "PageCategories",
              "SearchMode",
              "PersonalizationSpec",
              "Labels",
              "SpellCorrectionSpec",
              "Entity",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor,
            new java.lang.String[] {
              "FacetKey", "Limit", "ExcludedFilterKeys", "EnableDynamicPosition",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_FacetSpec_FacetKey_descriptor,
            new java.lang.String[] {
              "Key",
              "Intervals",
              "RestrictedValues",
              "Prefixes",
              "Contains",
              "CaseInsensitive",
              "OrderBy",
              "Query",
              "ReturnMinMax",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_DynamicFacetSpec_descriptor,
            new java.lang.String[] {
              "Mode",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor,
            new java.lang.String[] {
              "ConditionBoostSpecs", "SkipBoostSpecValidation",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor,
            new java.lang.String[] {
              "Condition", "Boost",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_QueryExpansionSpec_descriptor,
            new java.lang.String[] {
              "Condition", "PinUnexpandedResults",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_PersonalizationSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_retail_v2_SearchRequest_PersonalizationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_PersonalizationSpec_descriptor,
            new java.lang.String[] {
              "Mode",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_SpellCorrectionSpec_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_retail_v2_SearchRequest_SpellCorrectionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_SpellCorrectionSpec_descriptor,
            new java.lang.String[] {
              "Mode",
            });
    internal_static_google_cloud_retail_v2_SearchRequest_LabelsEntry_descriptor =
        internal_static_google_cloud_retail_v2_SearchRequest_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_retail_v2_SearchRequest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchRequest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_SearchResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_descriptor,
            new java.lang.String[] {
              "Results",
              "Facets",
              "TotalSize",
              "CorrectedQuery",
              "AttributionToken",
              "NextPageToken",
              "QueryExpansionInfo",
              "RedirectUri",
              "AppliedControls",
              "InvalidConditionBoostSpecs",
              "ExperimentInfo",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor,
            new java.lang.String[] {
              "Id",
              "Product",
              "MatchingVariantCount",
              "MatchingVariantFields",
              "VariantRollupValues",
              "PersonalLabels",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor,
            new java.lang.String[] {
              "Key", "Values", "DynamicFacet",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_Facet_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_Facet_FacetValue_descriptor,
            new java.lang.String[] {
              "Value", "Interval", "Count", "MinValue", "MaxValue", "FacetValue",
            });
    internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_descriptor =
        internal_static_google_cloud_retail_v2_SearchResponse_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_SearchResponse_QueryExpansionInfo_descriptor,
            new java.lang.String[] {
              "ExpandedQuery", "PinnedResultCount",
            });
    internal_static_google_cloud_retail_v2_ExperimentInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_ExperimentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ExperimentInfo_descriptor,
            new java.lang.String[] {
              "ServingConfigExperiment", "Experiment", "ExperimentMetadata",
            });
    internal_static_google_cloud_retail_v2_ExperimentInfo_ServingConfigExperiment_descriptor =
        internal_static_google_cloud_retail_v2_ExperimentInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_ExperimentInfo_ServingConfigExperiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ExperimentInfo_ServingConfigExperiment_descriptor,
            new java.lang.String[] {
              "OriginalServingConfig", "ExperimentServingConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.ProductProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
