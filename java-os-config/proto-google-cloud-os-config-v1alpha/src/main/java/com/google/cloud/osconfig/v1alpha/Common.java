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
// source: google/cloud/osconfig/v1alpha/osconfig_common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.osconfig.v1alpha;

public final class Common {
  private Common() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_FixedOrPercent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_FixedOrPercent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/osconfig/v1alpha/osconfig"
          + "_common.proto\022\035google.cloud.osconfig.v1a"
          + "lpha\"<\n\016FixedOrPercent\022\017\n\005fixed\030\001 \001(\005H\000\022"
          + "\021\n\007percent\030\002 \001(\005H\000B\006\n\004modeB\317\001\n!com.googl"
          + "e.cloud.osconfig.v1alphaB\006CommonP\001Z=clou"
          + "d.google.com/go/osconfig/apiv1alpha/osco"
          + "nfigpb;osconfigpb\252\002\035Google.Cloud.OsConfi"
          + "g.V1Alpha\312\002\035Google\\Cloud\\OsConfig\\V1alph"
          + "a\352\002 Google::Cloud::OsConfig::V1alphab\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_osconfig_v1alpha_FixedOrPercent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_FixedOrPercent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_FixedOrPercent_descriptor,
            new java.lang.String[] {
              "Fixed", "Percent", "Mode",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
