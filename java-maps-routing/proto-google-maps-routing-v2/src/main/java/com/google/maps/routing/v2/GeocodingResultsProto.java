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
// source: google/maps/routing/v2/geocoding_results.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.routing.v2;

public final class GeocodingResultsProto {
  private GeocodingResultsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_GeocodingResults_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_GeocodingResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_GeocodedWaypoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_GeocodedWaypoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/maps/routing/v2/geocoding_resul"
          + "ts.proto\022\026google.maps.routing.v2\032\027google"
          + "/rpc/status.proto\"\314\001\n\020GeocodingResults\0228"
          + "\n\006origin\030\001 \001(\0132(.google.maps.routing.v2."
          + "GeocodedWaypoint\022=\n\013destination\030\002 \001(\0132(."
          + "google.maps.routing.v2.GeocodedWaypoint\022"
          + "?\n\rintermediates\030\003 \003(\0132(.google.maps.rou"
          + "ting.v2.GeocodedWaypoint\"\320\001\n\020GeocodedWay"
          + "point\022+\n\017geocoder_status\030\001 \001(\0132\022.google."
          + "rpc.Status\0220\n#intermediate_waypoint_requ"
          + "est_index\030\002 \001(\005H\000\210\001\001\022\014\n\004type\030\003 \003(\t\022\025\n\rpa"
          + "rtial_match\030\004 \001(\010\022\020\n\010place_id\030\005 \001(\tB&\n$_"
          + "intermediate_waypoint_request_indexB\312\001\n\032"
          + "com.google.maps.routing.v2B\025GeocodingRes"
          + "ultsProtoP\001Z:cloud.google.com/go/maps/ro"
          + "uting/apiv2/routingpb;routingpb\370\001\001\242\002\005GMR"
          + "V2\252\002\026Google.Maps.Routing.V2\312\002\026Google\\Map"
          + "s\\Routing\\V2\352\002\031Google::Maps::Routing::V2"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_maps_routing_v2_GeocodingResults_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_GeocodingResults_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_GeocodingResults_descriptor,
            new java.lang.String[] {
              "Origin", "Destination", "Intermediates",
            });
    internal_static_google_maps_routing_v2_GeocodedWaypoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_routing_v2_GeocodedWaypoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_GeocodedWaypoint_descriptor,
            new java.lang.String[] {
              "GeocoderStatus",
              "IntermediateWaypointRequestIndex",
              "Type",
              "PartialMatch",
              "PlaceId",
            });
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
