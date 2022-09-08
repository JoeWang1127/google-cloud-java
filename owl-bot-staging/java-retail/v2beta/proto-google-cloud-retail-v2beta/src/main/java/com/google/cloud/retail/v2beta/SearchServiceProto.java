// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/search_service.proto

package com.google.cloud.retail.v2beta;

public final class SearchServiceProto {
  private SearchServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_FacetKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_DynamicFacetSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_DynamicFacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_QueryExpansionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_QueryExpansionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_PersonalizationSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_PersonalizationSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_SpellCorrectionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_SpellCorrectionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchRequest_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_MatchingVariantFieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_VariantRollupValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_FacetValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_FacetValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2beta_SearchResponse_QueryExpansionInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_SearchResponse_QueryExpansionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/retail/v2beta/search_serv" +
      "ice.proto\022\032google.cloud.retail.v2beta\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\032\'google" +
      "/cloud/retail/v2beta/common.proto\032(googl" +
      "e/cloud/retail/v2beta/product.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\034google/pr" +
      "otobuf/struct.proto\"\356\023\n\rSearchRequest\022\026\n" +
      "\tplacement\030\001 \001(\tB\003\340A\002\0221\n\006branch\030\002 \001(\tB!\372" +
      "A\036\n\034retail.googleapis.com/Branch\022\r\n\005quer" +
      "y\030\003 \001(\t\022\027\n\nvisitor_id\030\004 \001(\tB\003\340A\002\0227\n\tuser" +
      "_info\030\005 \001(\0132$.google.cloud.retail.v2beta" +
      ".UserInfo\022\021\n\tpage_size\030\007 \001(\005\022\022\n\npage_tok" +
      "en\030\010 \001(\t\022\016\n\006offset\030\t \001(\005\022\016\n\006filter\030\n \001(\t" +
      "\022\030\n\020canonical_filter\030\034 \001(\t\022\020\n\010order_by\030\013" +
      " \001(\t\022H\n\013facet_specs\030\014 \003(\01323.google.cloud" +
      ".retail.v2beta.SearchRequest.FacetSpec\022Z" +
      "\n\022dynamic_facet_spec\030\025 \001(\0132:.google.clou" +
      "d.retail.v2beta.SearchRequest.DynamicFac" +
      "etSpecB\002\030\001\022G\n\nboost_spec\030\r \001(\01323.google." +
      "cloud.retail.v2beta.SearchRequest.BoostS" +
      "pec\022Z\n\024query_expansion_spec\030\016 \001(\0132<.goog" +
      "le.cloud.retail.v2beta.SearchRequest.Que" +
      "ryExpansionSpec\022\033\n\023variant_rollup_keys\030\021" +
      " \003(\t\022\027\n\017page_categories\030\027 \003(\t\022I\n\013search_" +
      "mode\030\037 \001(\01624.google.cloud.retail.v2beta." +
      "SearchRequest.SearchMode\022[\n\024personalizat" +
      "ion_spec\030  \001(\0132=.google.cloud.retail.v2b" +
      "eta.SearchRequest.PersonalizationSpec\022E\n" +
      "\006labels\030\" \003(\01325.google.cloud.retail.v2be" +
      "ta.SearchRequest.LabelsEntry\022a\n\025spell_co" +
      "rrection_spec\030# \001(\0132=.google.cloud.retai" +
      "l.v2beta.SearchRequest.SpellCorrectionSp" +
      "ecH\000\210\001\001\032\231\003\n\tFacetSpec\022T\n\tfacet_key\030\001 \001(\013" +
      "2<.google.cloud.retail.v2beta.SearchRequ" +
      "est.FacetSpec.FacetKeyB\003\340A\002\022\r\n\005limit\030\002 \001" +
      "(\005\022\034\n\024excluded_filter_keys\030\003 \003(\t\022\037\n\027enab" +
      "le_dynamic_position\030\004 \001(\010\032\347\001\n\010FacetKey\022\020" +
      "\n\003key\030\001 \001(\tB\003\340A\002\0227\n\tintervals\030\002 \003(\0132$.go" +
      "ogle.cloud.retail.v2beta.Interval\022\031\n\021res" +
      "tricted_values\030\003 \003(\t\022\020\n\010prefixes\030\010 \003(\t\022\020" +
      "\n\010contains\030\t \003(\t\022\030\n\020case_insensitive\030\n \001" +
      "(\010\022\020\n\010order_by\030\004 \001(\t\022\r\n\005query\030\005 \001(\t\022\026\n\016r" +
      "eturn_min_max\030\013 \001(\010\032\232\001\n\020DynamicFacetSpec" +
      "\022M\n\004mode\030\001 \001(\0162?.google.cloud.retail.v2b" +
      "eta.SearchRequest.DynamicFacetSpec.Mode\"" +
      "7\n\004Mode\022\024\n\020MODE_UNSPECIFIED\020\000\022\014\n\010DISABLE" +
      "D\020\001\022\013\n\007ENABLED\020\002\032\362\001\n\tBoostSpec\022e\n\025condit" +
      "ion_boost_specs\030\001 \003(\0132F.google.cloud.ret" +
      "ail.v2beta.SearchRequest.BoostSpec.Condi" +
      "tionBoostSpec\022\'\n\032skip_boost_spec_validat" +
      "ion\030\002 \001(\010H\000\210\001\001\0326\n\022ConditionBoostSpec\022\021\n\t" +
      "condition\030\001 \001(\t\022\r\n\005boost\030\002 \001(\002B\035\n\033_skip_" +
      "boost_spec_validation\032\317\001\n\022QueryExpansion" +
      "Spec\022Y\n\tcondition\030\001 \001(\0162F.google.cloud.r" +
      "etail.v2beta.SearchRequest.QueryExpansio" +
      "nSpec.Condition\022\036\n\026pin_unexpanded_result" +
      "s\030\002 \001(\010\">\n\tCondition\022\031\n\025CONDITION_UNSPEC" +
      "IFIED\020\000\022\014\n\010DISABLED\020\001\022\010\n\004AUTO\020\003\032\235\001\n\023Pers" +
      "onalizationSpec\022P\n\004mode\030\001 \001(\0162B.google.c" +
      "loud.retail.v2beta.SearchRequest.Persona" +
      "lizationSpec.Mode\"4\n\004Mode\022\024\n\020MODE_UNSPEC" +
      "IFIED\020\000\022\010\n\004AUTO\020\001\022\014\n\010DISABLED\020\002\032\244\001\n\023Spel" +
      "lCorrectionSpec\022P\n\004mode\030\001 \001(\0162B.google.c" +
      "loud.retail.v2beta.SearchRequest.SpellCo" +
      "rrectionSpec.Mode\";\n\004Mode\022\024\n\020MODE_UNSPEC" +
      "IFIED\020\000\022\023\n\017SUGGESTION_ONLY\020\001\022\010\n\004AUTO\020\002\032-" +
      "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001\"[\n\nSearchMode\022\033\n\027SEARCH_MODE_UNSPE" +
      "CIFIED\020\000\022\027\n\023PRODUCT_SEARCH_ONLY\020\001\022\027\n\023FAC" +
      "ETED_SEARCH_ONLY\020\002B\030\n\026_spell_correction_" +
      "spec\"\375\n\n\016SearchResponse\022H\n\007results\030\001 \003(\013" +
      "27.google.cloud.retail.v2beta.SearchResp" +
      "onse.SearchResult\022@\n\006facets\030\002 \003(\01320.goog" +
      "le.cloud.retail.v2beta.SearchResponse.Fa" +
      "cet\022\022\n\ntotal_size\030\003 \001(\005\022\027\n\017corrected_que" +
      "ry\030\004 \001(\t\022\031\n\021attribution_token\030\005 \001(\t\022\027\n\017n" +
      "ext_page_token\030\006 \001(\t\022[\n\024query_expansion_" +
      "info\030\007 \001(\0132=.google.cloud.retail.v2beta." +
      "SearchResponse.QueryExpansionInfo\022\024\n\014red" +
      "irect_uri\030\n \001(\t\022\030\n\020applied_controls\030\014 \003(" +
      "\t\022m\n\035invalid_condition_boost_specs\030\016 \003(\013" +
      "2F.google.cloud.retail.v2beta.SearchRequ" +
      "est.BoostSpec.ConditionBoostSpec\032\235\004\n\014Sea" +
      "rchResult\022\n\n\002id\030\001 \001(\t\0224\n\007product\030\002 \001(\0132#" +
      ".google.cloud.retail.v2beta.Product\022\036\n\026m" +
      "atching_variant_count\030\003 \001(\005\022s\n\027matching_" +
      "variant_fields\030\004 \003(\0132R.google.cloud.reta" +
      "il.v2beta.SearchResponse.SearchResult.Ma" +
      "tchingVariantFieldsEntry\022o\n\025variant_roll" +
      "up_values\030\005 \003(\0132P.google.cloud.retail.v2" +
      "beta.SearchResponse.SearchResult.Variant" +
      "RollupValuesEntry\022\027\n\017personal_labels\030\007 \003" +
      "(\t\032X\n\032MatchingVariantFieldsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.google.protobuf.F" +
      "ieldMask:\0028\001\032R\n\030VariantRollupValuesEntry" +
      "\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google.pr" +
      "otobuf.Value:\0028\001\032\226\002\n\005Facet\022\013\n\003key\030\001 \001(\t\022" +
      "K\n\006values\030\002 \003(\0132;.google.cloud.retail.v2" +
      "beta.SearchResponse.Facet.FacetValue\022\025\n\r" +
      "dynamic_facet\030\003 \001(\010\032\233\001\n\nFacetValue\022\017\n\005va" +
      "lue\030\001 \001(\tH\000\0228\n\010interval\030\002 \001(\0132$.google.c" +
      "loud.retail.v2beta.IntervalH\000\022\r\n\005count\030\003" +
      " \001(\003\022\021\n\tmin_value\030\005 \001(\001\022\021\n\tmax_value\030\006 \001" +
      "(\001B\r\n\013facet_value\032I\n\022QueryExpansionInfo\022" +
      "\026\n\016expanded_query\030\001 \001(\010\022\033\n\023pinned_result" +
      "_count\030\002 \001(\0032\350\002\n\rSearchService\022\213\002\n\006Searc" +
      "h\022).google.cloud.retail.v2beta.SearchReq" +
      "uest\032*.google.cloud.retail.v2beta.Search" +
      "Response\"\251\001\202\323\344\223\002\242\001\"I/v2beta/{placement=p" +
      "rojects/*/locations/*/catalogs/*/placeme" +
      "nts/*}:search:\001*ZR\"M/v2beta/{placement=p" +
      "rojects/*/locations/*/catalogs/*/serving" +
      "Configs/*}:search:\001*\032I\312A\025retail.googleap" +
      "is.com\322A.https://www.googleapis.com/auth" +
      "/cloud-platformB\333\001\n\036com.google.cloud.ret" +
      "ail.v2betaB\022SearchServiceProtoP\001Z@google" +
      ".golang.org/genproto/googleapis/cloud/re" +
      "tail/v2beta;retail\242\002\006RETAIL\252\002\032Google.Clo" +
      "ud.Retail.V2Beta\312\002\032Google\\Cloud\\Retail\\V" +
      "2beta\352\002\035Google::Cloud::Retail::V2betab\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2beta.ProductProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor,
        new java.lang.String[] { "Placement", "Branch", "Query", "VisitorId", "UserInfo", "PageSize", "PageToken", "Offset", "Filter", "CanonicalFilter", "OrderBy", "FacetSpecs", "DynamicFacetSpec", "BoostSpec", "QueryExpansionSpec", "VariantRollupKeys", "PageCategories", "SearchMode", "PersonalizationSpec", "Labels", "SpellCorrectionSpec", "SpellCorrectionSpec", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_descriptor,
        new java.lang.String[] { "FacetKey", "Limit", "ExcludedFilterKeys", "EnableDynamicPosition", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_FacetKey_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_FacetSpec_FacetKey_descriptor,
        new java.lang.String[] { "Key", "Intervals", "RestrictedValues", "Prefixes", "Contains", "CaseInsensitive", "OrderBy", "Query", "ReturnMinMax", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_DynamicFacetSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2beta_SearchRequest_DynamicFacetSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_DynamicFacetSpec_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_descriptor,
        new java.lang.String[] { "ConditionBoostSpecs", "SkipBoostSpecValidation", "SkipBoostSpecValidation", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor,
        new java.lang.String[] { "Condition", "Boost", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_QueryExpansionSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_retail_v2beta_SearchRequest_QueryExpansionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_QueryExpansionSpec_descriptor,
        new java.lang.String[] { "Condition", "PinUnexpandedResults", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_PersonalizationSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_retail_v2beta_SearchRequest_PersonalizationSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_PersonalizationSpec_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_SpellCorrectionSpec_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_retail_v2beta_SearchRequest_SpellCorrectionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_SpellCorrectionSpec_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_google_cloud_retail_v2beta_SearchRequest_LabelsEntry_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchRequest_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_retail_v2beta_SearchRequest_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchRequest_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_SearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_descriptor,
        new java.lang.String[] { "Results", "Facets", "TotalSize", "CorrectedQuery", "AttributionToken", "NextPageToken", "QueryExpansionInfo", "RedirectUri", "AppliedControls", "InvalidConditionBoostSpecs", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_descriptor,
        new java.lang.String[] { "Id", "Product", "MatchingVariantCount", "MatchingVariantFields", "VariantRollupValues", "PersonalLabels", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_MatchingVariantFieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_MatchingVariantFieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_VariantRollupValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_SearchResult_VariantRollupValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_descriptor,
        new java.lang.String[] { "Key", "Values", "DynamicFacet", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_FacetValue_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_FacetValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_Facet_FacetValue_descriptor,
        new java.lang.String[] { "Value", "Interval", "Count", "MinValue", "MaxValue", "FacetValue", });
    internal_static_google_cloud_retail_v2beta_SearchResponse_QueryExpansionInfo_descriptor =
      internal_static_google_cloud_retail_v2beta_SearchResponse_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_retail_v2beta_SearchResponse_QueryExpansionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2beta_SearchResponse_QueryExpansionInfo_descriptor,
        new java.lang.String[] { "ExpandedQuery", "PinnedResultCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.cloud.retail.v2beta.ProductProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}