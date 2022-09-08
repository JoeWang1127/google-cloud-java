// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/catalog.proto

package com.google.cloud.retail.v2;

public final class CatalogProto {
  private CatalogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_ProductLevelConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ProductLevelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CatalogAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_AttributesConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_AttributesConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_CompletionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CompletionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Catalog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Catalog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/retail/v2/catalog.proto\022\026" +
      "google.cloud.retail.v2\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032#google/cloud/retail/v2/common.proto\032" +
      "*google/cloud/retail/v2/import_config.pr" +
      "oto\"^\n\022ProductLevelConfig\022\036\n\026ingestion_p" +
      "roduct_type\030\001 \001(\t\022(\n merchant_center_pro" +
      "duct_id_field\030\002 \001(\t\"\233\006\n\020CatalogAttribute" +
      "\022\020\n\003key\030\001 \001(\tB\003\340A\002\022\023\n\006in_use\030\t \001(\010B\003\340A\003\022" +
      "I\n\004type\030\n \001(\01626.google.cloud.retail.v2.C" +
      "atalogAttribute.AttributeTypeB\003\340A\003\022R\n\020in" +
      "dexable_option\030\005 \001(\01628.google.cloud.reta" +
      "il.v2.CatalogAttribute.IndexableOption\022a" +
      "\n\030dynamic_facetable_option\030\006 \001(\0162?.googl" +
      "e.cloud.retail.v2.CatalogAttribute.Dynam" +
      "icFacetableOption\022T\n\021searchable_option\030\007" +
      " \001(\01629.google.cloud.retail.v2.CatalogAtt" +
      "ribute.SearchableOption\"8\n\rAttributeType" +
      "\022\013\n\007UNKNOWN\020\000\022\013\n\007TEXTUAL\020\001\022\r\n\tNUMERICAL\020" +
      "\002\"b\n\017IndexableOption\022 \n\034INDEXABLE_OPTION" +
      "_UNSPECIFIED\020\000\022\025\n\021INDEXABLE_ENABLED\020\001\022\026\n" +
      "\022INDEXABLE_DISABLED\020\002\"\201\001\n\026DynamicFacetab" +
      "leOption\022(\n$DYNAMIC_FACETABLE_OPTION_UNS" +
      "PECIFIED\020\000\022\035\n\031DYNAMIC_FACETABLE_ENABLED\020" +
      "\001\022\036\n\032DYNAMIC_FACETABLE_DISABLED\020\002\"f\n\020Sea" +
      "rchableOption\022!\n\035SEARCHABLE_OPTION_UNSPE" +
      "CIFIED\020\000\022\026\n\022SEARCHABLE_ENABLED\020\001\022\027\n\023SEAR" +
      "CHABLE_DISABLED\020\002\"\266\003\n\020AttributesConfig\022\024" +
      "\n\004name\030\001 \001(\tB\006\340A\002\340A\005\022[\n\022catalog_attribut" +
      "es\030\002 \003(\0132?.google.cloud.retail.v2.Attrib" +
      "utesConfig.CatalogAttributesEntry\022Q\n\026att" +
      "ribute_config_level\030\003 \001(\0162,.google.cloud" +
      ".retail.v2.AttributeConfigLevelB\003\340A\003\032b\n\026" +
      "CatalogAttributesEntry\022\013\n\003key\030\001 \001(\t\0227\n\005v" +
      "alue\030\002 \001(\0132(.google.cloud.retail.v2.Cata" +
      "logAttribute:\0028\001:x\352Au\n&retail.googleapis" +
      ".com/AttributesConfig\022Kprojects/{project" +
      "}/locations/{location}/catalogs/{catalog" +
      "}/attributesConfig\"\231\005\n\020CompletionConfig\022" +
      "\024\n\004name\030\001 \001(\tB\006\340A\002\340A\005\022\026\n\016matching_order\030" +
      "\002 \001(\t\022\027\n\017max_suggestions\030\003 \001(\005\022\031\n\021min_pr" +
      "efix_length\030\004 \001(\005\022\025\n\rauto_learning\030\013 \001(\010" +
      "\022X\n\030suggestions_input_config\030\005 \001(\01321.goo" +
      "gle.cloud.retail.v2.CompletionDataInputC" +
      "onfigB\003\340A\003\022.\n!last_suggestions_import_op" +
      "eration\030\006 \001(\tB\003\340A\003\022U\n\025denylist_input_con" +
      "fig\030\007 \001(\01321.google.cloud.retail.v2.Compl" +
      "etionDataInputConfigB\003\340A\003\022+\n\036last_denyli" +
      "st_import_operation\030\010 \001(\tB\003\340A\003\022V\n\026allowl" +
      "ist_input_config\030\t \001(\01321.google.cloud.re" +
      "tail.v2.CompletionDataInputConfigB\003\340A\003\022," +
      "\n\037last_allowlist_import_operation\030\n \001(\tB" +
      "\003\340A\003:x\352Au\n&retail.googleapis.com/Complet" +
      "ionConfig\022Kprojects/{project}/locations/" +
      "{location}/catalogs/{catalog}/completion" +
      "Config\"\354\001\n\007Catalog\022\024\n\004name\030\001 \001(\tB\006\340A\002\340A\005" +
      "\022\034\n\014display_name\030\002 \001(\tB\006\340A\002\340A\005\022M\n\024produc" +
      "t_level_config\030\004 \001(\0132*.google.cloud.reta" +
      "il.v2.ProductLevelConfigB\003\340A\002:^\352A[\n\035reta" +
      "il.googleapis.com/Catalog\022:projects/{pro" +
      "ject}/locations/{location}/catalogs/{cat" +
      "alog}B\301\001\n\032com.google.cloud.retail.v2B\014Ca" +
      "talogProtoP\001Z<google.golang.org/genproto" +
      "/googleapis/cloud/retail/v2;retail\242\002\006RET" +
      "AIL\252\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cl" +
      "oud\\Retail\\V2\352\002\031Google::Cloud::Retail::V" +
      "2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2.ImportConfigProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2_ProductLevelConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_ProductLevelConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_ProductLevelConfig_descriptor,
        new java.lang.String[] { "IngestionProductType", "MerchantCenterProductIdField", });
    internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_CatalogAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_CatalogAttribute_descriptor,
        new java.lang.String[] { "Key", "InUse", "Type", "IndexableOption", "DynamicFacetableOption", "SearchableOption", });
    internal_static_google_cloud_retail_v2_AttributesConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_AttributesConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_AttributesConfig_descriptor,
        new java.lang.String[] { "Name", "CatalogAttributes", "AttributeConfigLevel", });
    internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_descriptor =
      internal_static_google_cloud_retail_v2_AttributesConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_AttributesConfig_CatalogAttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_retail_v2_CompletionConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_CompletionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_CompletionConfig_descriptor,
        new java.lang.String[] { "Name", "MatchingOrder", "MaxSuggestions", "MinPrefixLength", "AutoLearning", "SuggestionsInputConfig", "LastSuggestionsImportOperation", "DenylistInputConfig", "LastDenylistImportOperation", "AllowlistInputConfig", "LastAllowlistImportOperation", });
    internal_static_google_cloud_retail_v2_Catalog_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_Catalog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Catalog_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "ProductLevelConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.ImportConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}