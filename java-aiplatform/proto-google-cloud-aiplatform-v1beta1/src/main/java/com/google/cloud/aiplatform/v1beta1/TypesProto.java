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
// source: google/cloud/aiplatform/v1beta1/types.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public final class TypesProto {
  private TypesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BoolArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BoolArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Int64Array_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Int64Array_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StringArray_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StringArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Tensor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Tensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Tensor_StructValEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Tensor_StructValEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/types."
          + "proto\022\037google.cloud.aiplatform.v1beta1\"\033"
          + "\n\tBoolArray\022\016\n\006values\030\001 \003(\010\"\035\n\013DoubleArr"
          + "ay\022\016\n\006values\030\001 \003(\001\"\034\n\nInt64Array\022\016\n\006valu"
          + "es\030\001 \003(\003\"\035\n\013StringArray\022\016\n\006values\030\001 \003(\t\""
          + "\247\005\n\006Tensor\022?\n\005dtype\030\001 \001(\01620.google.cloud"
          + ".aiplatform.v1beta1.Tensor.DataType\022\r\n\005s"
          + "hape\030\002 \003(\003\022\020\n\010bool_val\030\003 \003(\010\022\022\n\nstring_v"
          + "al\030\016 \003(\t\022\021\n\tbytes_val\030\017 \003(\014\022\021\n\tfloat_val"
          + "\030\005 \003(\002\022\022\n\ndouble_val\030\006 \003(\001\022\017\n\007int_val\030\007 "
          + "\003(\005\022\021\n\tint64_val\030\010 \003(\003\022\020\n\010uint_val\030\t \003(\r"
          + "\022\022\n\nuint64_val\030\n \003(\004\0229\n\010list_val\030\013 \003(\0132\'"
          + ".google.cloud.aiplatform.v1beta1.Tensor\022"
          + "J\n\nstruct_val\030\014 \003(\01326.google.cloud.aipla"
          + "tform.v1beta1.Tensor.StructValEntry\022\022\n\nt"
          + "ensor_val\030\r \001(\014\032Y\n\016StructValEntry\022\013\n\003key"
          + "\030\001 \001(\t\0226\n\005value\030\002 \001(\0132\'.google.cloud.aip"
          + "latform.v1beta1.Tensor:\0028\001\"\254\001\n\010DataType\022"
          + "\031\n\025DATA_TYPE_UNSPECIFIED\020\000\022\010\n\004BOOL\020\001\022\n\n\006"
          + "STRING\020\002\022\t\n\005FLOAT\020\003\022\n\n\006DOUBLE\020\004\022\010\n\004INT8\020"
          + "\005\022\t\n\005INT16\020\006\022\t\n\005INT32\020\007\022\t\n\005INT64\020\010\022\t\n\005UI"
          + "NT8\020\t\022\n\n\006UINT16\020\n\022\n\n\006UINT32\020\013\022\n\n\006UINT64\020"
          + "\014B\341\001\n#com.google.cloud.aiplatform.v1beta"
          + "1B\nTypesProtoP\001ZCcloud.google.com/go/aip"
          + "latform/apiv1beta1/aiplatformpb;aiplatfo"
          + "rmpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002"
          + "\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Googl"
          + "e::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_BoolArray_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_BoolArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BoolArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Int64Array_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Int64Array_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Int64Array_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StringArray_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_StringArray_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StringArray_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Tensor_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_Tensor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Tensor_descriptor,
            new java.lang.String[] {
              "Dtype",
              "Shape",
              "BoolVal",
              "StringVal",
              "BytesVal",
              "FloatVal",
              "DoubleVal",
              "IntVal",
              "Int64Val",
              "UintVal",
              "Uint64Val",
              "ListVal",
              "StructVal",
              "TensorVal",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Tensor_StructValEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Tensor_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Tensor_StructValEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Tensor_StructValEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
