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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataplex.v1;

public interface ListAspectTypesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListAspectTypesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ListAspectTypes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.AspectType aspect_types = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.AspectType> getAspectTypesList();
  /**
   *
   *
   * <pre>
   * ListAspectTypes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.AspectType aspect_types = 1;</code>
   */
  com.google.cloud.dataplex.v1.AspectType getAspectTypes(int index);
  /**
   *
   *
   * <pre>
   * ListAspectTypes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.AspectType aspect_types = 1;</code>
   */
  int getAspectTypesCount();
  /**
   *
   *
   * <pre>
   * ListAspectTypes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.AspectType aspect_types = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.AspectTypeOrBuilder>
      getAspectTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * ListAspectTypes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.AspectType aspect_types = 1;</code>
   */
  com.google.cloud.dataplex.v1.AspectTypeOrBuilder getAspectTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   *
   * @return A list containing the unreachableLocations.
   */
  java.util.List<java.lang.String> getUnreachableLocationsList();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   *
   * @return The count of unreachableLocations.
   */
  int getUnreachableLocationsCount();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachableLocations at the given index.
   */
  java.lang.String getUnreachableLocations(int index);
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachableLocations at the given index.
   */
  com.google.protobuf.ByteString getUnreachableLocationsBytes(int index);
}
