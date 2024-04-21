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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.optimization.v1;

public interface LocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   *
   * @return Whether the latLng field is set.
   */
  boolean hasLatLng();
  /**
   *
   *
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   *
   * @return The latLng.
   */
  com.google.type.LatLng getLatLng();
  /**
   *
   *
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();

  /**
   *
   *
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc.
   * </pre>
   *
   * <code>optional int32 heading = 2;</code>
   *
   * @return Whether the heading field is set.
   */
  boolean hasHeading();
  /**
   *
   *
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc.
   * </pre>
   *
   * <code>optional int32 heading = 2;</code>
   *
   * @return The heading.
   */
  int getHeading();
}
