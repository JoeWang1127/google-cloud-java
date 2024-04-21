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
// source: google/cloud/securitycenter/v1p1beta1/finding.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1p1beta1;

public final class FindingOuterClass {
  private FindingOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_Finding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1p1beta1_Finding_SourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1p1beta1_Finding_SourcePropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/securitycenter/v1p1beta1/"
          + "finding.proto\022%google.cloud.securitycent"
          + "er.v1p1beta1\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\032:google"
          + "/cloud/securitycenter/v1p1beta1/security"
          + "_marks.proto\032\034google/protobuf/struct.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\337\007\n\007"
          + "Finding\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030\002 \001(\t\022\025\n"
          + "\rresource_name\030\003 \001(\t\022C\n\005state\030\004 \001(\01624.go"
          + "ogle.cloud.securitycenter.v1p1beta1.Find"
          + "ing.State\022\020\n\010category\030\005 \001(\t\022\024\n\014external_"
          + "uri\030\006 \001(\t\022_\n\021source_properties\030\007 \003(\0132D.g"
          + "oogle.cloud.securitycenter.v1p1beta1.Fin"
          + "ding.SourcePropertiesEntry\022Q\n\016security_m"
          + "arks\030\010 \001(\01324.google.cloud.securitycenter"
          + ".v1p1beta1.SecurityMarksB\003\340A\003\022.\n\nevent_t"
          + "ime\030\t \001(\0132\032.google.protobuf.Timestamp\022/\n"
          + "\013create_time\030\n \001(\0132\032.google.protobuf.Tim"
          + "estamp\022I\n\010severity\030\r \001(\01627.google.cloud."
          + "securitycenter.v1p1beta1.Finding.Severit"
          + "y\022\026\n\016canonical_name\030\016 \001(\t\032O\n\025SourcePrope"
          + "rtiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026"
          + ".google.protobuf.Value:\0028\001\"8\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014\n\010INACTI"
          + "VE\020\002\"Q\n\010Severity\022\030\n\024SEVERITY_UNSPECIFIED"
          + "\020\000\022\014\n\010CRITICAL\020\001\022\010\n\004HIGH\020\002\022\n\n\006MEDIUM\020\003\022\007"
          + "\n\003LOW\020\004:\333\001\352A\327\001\n%securitycenter.googleapi"
          + "s.com/Finding\022@organizations/{organizati"
          + "on}/sources/{source}/findings/{finding}\022"
          + "4folders/{folder}/sources/{source}/findi"
          + "ngs/{finding}\0226projects/{project}/source"
          + "s/{source}/findings/{finding}B\373\001\n)com.go"
          + "ogle.cloud.securitycenter.v1p1beta1P\001ZQc"
          + "loud.google.com/go/securitycenter/apiv1p"
          + "1beta1/securitycenterpb;securitycenterpb"
          + "\252\002%Google.Cloud.SecurityCenter.V1P1Beta1"
          + "\312\002%Google\\Cloud\\SecurityCenter\\V1p1beta1"
          + "\352\002(Google::Cloud::SecurityCenter::V1p1be"
          + "ta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1p1beta1.SecurityMarksOuterClass.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "Parent",
              "ResourceName",
              "State",
              "Category",
              "ExternalUri",
              "SourceProperties",
              "SecurityMarks",
              "EventTime",
              "CreateTime",
              "Severity",
              "CanonicalName",
            });
    internal_static_google_cloud_securitycenter_v1p1beta1_Finding_SourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1p1beta1_Finding_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1p1beta1_Finding_SourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1p1beta1_Finding_SourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1p1beta1.SecurityMarksOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
