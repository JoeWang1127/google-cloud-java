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
// source: google/cloud/osconfig/v1alpha/os_policy.proto

package com.google.cloud.osconfig.v1alpha;

public final class OsPolicyProto {
  private OsPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_OSFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_OSFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_InventoryFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_InventoryFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Remote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Remote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Gcs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Gcs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Deb_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Deb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_APT_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_APT_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_RPM_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_RPM_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_YUM_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_YUM_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Zypper_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Zypper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_GooGet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_GooGet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_MSI_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_MSI_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_AptRepository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_AptRepository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_YumRepository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_YumRepository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_ZypperRepository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_ZypperRepository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_GooRepository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_GooRepository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_Exec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_Exec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_FileResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_FileResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_ResourceGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicy_ResourceGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/osconfig/v1alpha/os_polic"
          + "y.proto\022\035google.cloud.osconfig.v1alpha\032\037"
          + "google/api/field_behavior.proto\"\204#\n\010OSPo"
          + "licy\022\017\n\002id\030\001 \001(\tB\003\340A\002\022\023\n\013description\030\002 \001"
          + "(\t\022?\n\004mode\030\003 \001(\0162,.google.cloud.osconfig"
          + ".v1alpha.OSPolicy.ModeB\003\340A\002\022S\n\017resource_"
          + "groups\030\004 \003(\01325.google.cloud.osconfig.v1a"
          + "lpha.OSPolicy.ResourceGroupB\003\340A\002\022%\n\035allo"
          + "w_no_resource_group_match\030\005 \001(\010\0325\n\010OSFil"
          + "ter\022\025\n\ros_short_name\030\001 \001(\t\022\022\n\nos_version"
          + "\030\002 \001(\t\032A\n\017InventoryFilter\022\032\n\ros_short_na"
          + "me\030\001 \001(\tB\003\340A\002\022\022\n\nos_version\030\002 \001(\t\032\342\035\n\010Re"
          + "source\022\017\n\002id\030\001 \001(\tB\003\340A\002\022O\n\003pkg\030\002 \001(\0132@.g"
          + "oogle.cloud.osconfig.v1alpha.OSPolicy.Re"
          + "source.PackageResourceH\000\022Y\n\nrepository\030\003"
          + " \001(\0132C.google.cloud.osconfig.v1alpha.OSP"
          + "olicy.Resource.RepositoryResourceH\000\022M\n\004e"
          + "xec\030\004 \001(\0132=.google.cloud.osconfig.v1alph"
          + "a.OSPolicy.Resource.ExecResourceH\000\022M\n\004fi"
          + "le\030\005 \001(\0132=.google.cloud.osconfig.v1alpha"
          + ".OSPolicy.Resource.FileResourceH\000\032\320\002\n\004Fi"
          + "le\022N\n\006remote\030\001 \001(\0132<.google.cloud.osconf"
          + "ig.v1alpha.OSPolicy.Resource.File.Remote"
          + "H\000\022H\n\003gcs\030\002 \001(\01329.google.cloud.osconfig."
          + "v1alpha.OSPolicy.Resource.File.GcsH\000\022\024\n\n"
          + "local_path\030\003 \001(\tH\000\022\026\n\016allow_insecure\030\004 \001"
          + "(\010\0323\n\006Remote\022\020\n\003uri\030\001 \001(\tB\003\340A\002\022\027\n\017sha256"
          + "_checksum\030\002 \001(\t\032C\n\003Gcs\022\023\n\006bucket\030\001 \001(\tB\003"
          + "\340A\002\022\023\n\006object\030\002 \001(\tB\003\340A\002\022\022\n\ngeneration\030\003"
          + " \001(\003B\006\n\004type\032\331\t\n\017PackageResource\022i\n\rdesi"
          + "red_state\030\001 \001(\0162M.google.cloud.osconfig."
          + "v1alpha.OSPolicy.Resource.PackageResourc"
          + "e.DesiredStateB\003\340A\002\022S\n\003apt\030\002 \001(\0132D.googl"
          + "e.cloud.osconfig.v1alpha.OSPolicy.Resour"
          + "ce.PackageResource.APTH\000\022S\n\003deb\030\003 \001(\0132D."
          + "google.cloud.osconfig.v1alpha.OSPolicy.R"
          + "esource.PackageResource.DebH\000\022S\n\003yum\030\004 \001"
          + "(\0132D.google.cloud.osconfig.v1alpha.OSPol"
          + "icy.Resource.PackageResource.YUMH\000\022Y\n\006zy"
          + "pper\030\005 \001(\0132G.google.cloud.osconfig.v1alp"
          + "ha.OSPolicy.Resource.PackageResource.Zyp"
          + "perH\000\022S\n\003rpm\030\006 \001(\0132D.google.cloud.osconf"
          + "ig.v1alpha.OSPolicy.Resource.PackageReso"
          + "urce.RPMH\000\022Y\n\006googet\030\007 \001(\0132G.google.clou"
          + "d.osconfig.v1alpha.OSPolicy.Resource.Pac"
          + "kageResource.GooGetH\000\022S\n\003msi\030\010 \001(\0132D.goo"
          + "gle.cloud.osconfig.v1alpha.OSPolicy.Reso"
          + "urce.PackageResource.MSIH\000\032d\n\003Deb\022J\n\006sou"
          + "rce\030\001 \001(\01325.google.cloud.osconfig.v1alph"
          + "a.OSPolicy.Resource.FileB\003\340A\002\022\021\n\tpull_de"
          + "ps\030\002 \001(\010\032\030\n\003APT\022\021\n\004name\030\001 \001(\tB\003\340A\002\032d\n\003RP"
          + "M\022J\n\006source\030\001 \001(\01325.google.cloud.osconfi"
          + "g.v1alpha.OSPolicy.Resource.FileB\003\340A\002\022\021\n"
          + "\tpull_deps\030\002 \001(\010\032\030\n\003YUM\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\002\032\033\n\006Zypper\022\021\n\004name\030\001 \001(\tB\003\340A\002\032\033\n\006GooGe"
          + "t\022\021\n\004name\030\001 \001(\tB\003\340A\002\032e\n\003MSI\022J\n\006source\030\001 "
          + "\001(\01325.google.cloud.osconfig.v1alpha.OSPo"
          + "licy.Resource.FileB\003\340A\002\022\022\n\nproperties\030\002 "
          + "\003(\t\"I\n\014DesiredState\022\035\n\031DESIRED_STATE_UNS"
          + "PECIFIED\020\000\022\r\n\tINSTALLED\020\001\022\013\n\007REMOVED\020\002B\020"
          + "\n\016system_package\032\321\007\n\022RepositoryResource\022"
          + "`\n\003apt\030\001 \001(\0132Q.google.cloud.osconfig.v1a"
          + "lpha.OSPolicy.Resource.RepositoryResourc"
          + "e.AptRepositoryH\000\022`\n\003yum\030\002 \001(\0132Q.google."
          + "cloud.osconfig.v1alpha.OSPolicy.Resource"
          + ".RepositoryResource.YumRepositoryH\000\022f\n\006z"
          + "ypper\030\003 \001(\0132T.google.cloud.osconfig.v1al"
          + "pha.OSPolicy.Resource.RepositoryResource"
          + ".ZypperRepositoryH\000\022`\n\003goo\030\004 \001(\0132Q.googl"
          + "e.cloud.osconfig.v1alpha.OSPolicy.Resour"
          + "ce.RepositoryResource.GooRepositoryH\000\032\243\002"
          + "\n\rAptRepository\022x\n\014archive_type\030\001 \001(\0162]."
          + "google.cloud.osconfig.v1alpha.OSPolicy.R"
          + "esource.RepositoryResource.AptRepository"
          + ".ArchiveTypeB\003\340A\002\022\020\n\003uri\030\002 \001(\tB\003\340A\002\022\031\n\014d"
          + "istribution\030\003 \001(\tB\003\340A\002\022\027\n\ncomponents\030\004 \003"
          + "(\tB\003\340A\002\022\017\n\007gpg_key\030\005 \001(\t\"A\n\013ArchiveType\022"
          + "\034\n\030ARCHIVE_TYPE_UNSPECIFIED\020\000\022\007\n\003DEB\020\001\022\013"
          + "\n\007DEB_SRC\020\002\032_\n\rYumRepository\022\017\n\002id\030\001 \001(\t"
          + "B\003\340A\002\022\024\n\014display_name\030\002 \001(\t\022\025\n\010base_url\030"
          + "\003 \001(\tB\003\340A\002\022\020\n\010gpg_keys\030\004 \003(\t\032b\n\020ZypperRe"
          + "pository\022\017\n\002id\030\001 \001(\tB\003\340A\002\022\024\n\014display_nam"
          + "e\030\002 \001(\t\022\025\n\010base_url\030\003 \001(\tB\003\340A\002\022\020\n\010gpg_ke"
          + "ys\030\004 \003(\t\0324\n\rGooRepository\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\002\022\020\n\003url\030\002 \001(\tB\003\340A\002B\014\n\nrepository\032\215\004\n"
          + "\014ExecResource\022Y\n\010validate\030\001 \001(\0132B.google"
          + ".cloud.osconfig.v1alpha.OSPolicy.Resourc"
          + "e.ExecResource.ExecB\003\340A\002\022S\n\007enforce\030\002 \001("
          + "\0132B.google.cloud.osconfig.v1alpha.OSPoli"
          + "cy.Resource.ExecResource.Exec\032\314\002\n\004Exec\022E"
          + "\n\004file\030\001 \001(\01325.google.cloud.osconfig.v1a"
          + "lpha.OSPolicy.Resource.FileH\000\022\020\n\006script\030"
          + "\002 \001(\tH\000\022\014\n\004args\030\003 \003(\t\022h\n\013interpreter\030\004 \001"
          + "(\0162N.google.cloud.osconfig.v1alpha.OSPol"
          + "icy.Resource.ExecResource.Exec.Interpret"
          + "erB\003\340A\002\022\030\n\020output_file_path\030\005 \001(\t\"O\n\013Int"
          + "erpreter\022\033\n\027INTERPRETER_UNSPECIFIED\020\000\022\010\n"
          + "\004NONE\020\001\022\t\n\005SHELL\020\002\022\016\n\nPOWERSHELL\020\003B\010\n\006so"
          + "urce\032\326\002\n\014FileResource\022E\n\004file\030\001 \001(\01325.go"
          + "ogle.cloud.osconfig.v1alpha.OSPolicy.Res"
          + "ource.FileH\000\022\021\n\007content\030\002 \001(\tH\000\022\021\n\004path\030"
          + "\003 \001(\tB\003\340A\002\022^\n\005state\030\004 \001(\0162J.google.cloud"
          + ".osconfig.v1alpha.OSPolicy.Resource.File"
          + "Resource.DesiredStateB\003\340A\002\022\023\n\013permission"
          + "s\030\005 \001(\t\"Z\n\014DesiredState\022\035\n\031DESIRED_STATE"
          + "_UNSPECIFIED\020\000\022\013\n\007PRESENT\020\001\022\n\n\006ABSENT\020\002\022"
          + "\022\n\016CONTENTS_MATCH\020\003B\010\n\006sourceB\017\n\rresourc"
          + "e_type\032\366\001\n\rResourceGroup\022G\n\tos_filter\030\001 "
          + "\001(\01320.google.cloud.osconfig.v1alpha.OSPo"
          + "licy.OSFilterB\002\030\001\022R\n\021inventory_filters\030\003"
          + " \003(\01327.google.cloud.osconfig.v1alpha.OSP"
          + "olicy.InventoryFilter\022H\n\tresources\030\002 \003(\013"
          + "20.google.cloud.osconfig.v1alpha.OSPolic"
          + "y.ResourceB\003\340A\002\"=\n\004Mode\022\024\n\020MODE_UNSPECIF"
          + "IED\020\000\022\016\n\nVALIDATION\020\001\022\017\n\013ENFORCEMENT\020\002B\336"
          + "\001\n!com.google.cloud.osconfig.v1alphaB\rOs"
          + "PolicyProtoP\001ZEgoogle.golang.org/genprot"
          + "o/googleapis/cloud/osconfig/v1alpha;osco"
          + "nfig\252\002\035Google.Cloud.OsConfig.V1Alpha\312\002\035G"
          + "oogle\\Cloud\\OsConfig\\V1alpha\352\002 Google::C"
          + "loud::OsConfig::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor,
            new java.lang.String[] {
              "Id", "Description", "Mode", "ResourceGroups", "AllowNoResourceGroupMatch",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_OSFilter_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_OSFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_OSFilter_descriptor,
            new java.lang.String[] {
              "OsShortName", "OsVersion",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_InventoryFilter_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_InventoryFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_InventoryFilter_descriptor,
            new java.lang.String[] {
              "OsShortName", "OsVersion",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor,
            new java.lang.String[] {
              "Id", "Pkg", "Repository", "Exec", "File", "ResourceType",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_descriptor,
            new java.lang.String[] {
              "Remote", "Gcs", "LocalPath", "AllowInsecure", "Type",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Remote_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Remote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Remote_descriptor,
            new java.lang.String[] {
              "Uri", "Sha256Checksum",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Gcs_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Gcs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_File_Gcs_descriptor,
            new java.lang.String[] {
              "Bucket", "Object", "Generation",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor,
            new java.lang.String[] {
              "DesiredState",
              "Apt",
              "Deb",
              "Yum",
              "Zypper",
              "Rpm",
              "Googet",
              "Msi",
              "SystemPackage",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Deb_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Deb_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Deb_descriptor,
            new java.lang.String[] {
              "Source", "PullDeps",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_APT_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_APT_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_APT_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_RPM_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_RPM_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_RPM_descriptor,
            new java.lang.String[] {
              "Source", "PullDeps",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_YUM_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_YUM_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_YUM_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Zypper_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Zypper_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_Zypper_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_GooGet_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_GooGet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_GooGet_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_MSI_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_MSI_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_PackageResource_MSI_descriptor,
            new java.lang.String[] {
              "Source", "Properties",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor,
            new java.lang.String[] {
              "Apt", "Yum", "Zypper", "Goo", "Repository",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_AptRepository_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_AptRepository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_AptRepository_descriptor,
            new java.lang.String[] {
              "ArchiveType", "Uri", "Distribution", "Components", "GpgKey",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_YumRepository_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_YumRepository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_YumRepository_descriptor,
            new java.lang.String[] {
              "Id", "DisplayName", "BaseUrl", "GpgKeys",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_ZypperRepository_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_ZypperRepository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_ZypperRepository_descriptor,
            new java.lang.String[] {
              "Id", "DisplayName", "BaseUrl", "GpgKeys",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_GooRepository_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_GooRepository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_RepositoryResource_GooRepository_descriptor,
            new java.lang.String[] {
              "Name", "Url",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_descriptor,
            new java.lang.String[] {
              "Validate", "Enforce",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_Exec_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_Exec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_ExecResource_Exec_descriptor,
            new java.lang.String[] {
              "File", "Script", "Args", "Interpreter", "OutputFilePath", "Source",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_FileResource_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_FileResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_Resource_FileResource_descriptor,
            new java.lang.String[] {
              "File", "Content", "Path", "State", "Permissions", "Source",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_ResourceGroup_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicy_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicy_ResourceGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicy_ResourceGroup_descriptor,
            new java.lang.String[] {
              "OsFilter", "InventoryFilters", "Resources",
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