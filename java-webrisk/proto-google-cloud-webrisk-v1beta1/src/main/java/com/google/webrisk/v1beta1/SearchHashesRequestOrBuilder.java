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
// source: google/cloud/webrisk/v1beta1/webrisk.proto

// Protobuf Java Version: 3.25.3
package com.google.webrisk.v1beta1;

public interface SearchHashesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.SearchHashesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
   * hash. For JSON requests, this field is base64-encoded.
   * </pre>
   *
   * <code>bytes hash_prefix = 1;</code>
   *
   * @return The hashPrefix.
   */
  com.google.protobuf.ByteString getHashPrefix();

  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the threatTypes.
   */
  java.util.List<com.google.webrisk.v1beta1.ThreatType> getThreatTypesList();
  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of threatTypes.
   */
  int getThreatTypesCount();
  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The threatTypes at the given index.
   */
  com.google.webrisk.v1beta1.ThreatType getThreatTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for threatTypes.
   */
  java.util.List<java.lang.Integer> getThreatTypesValueList();
  /**
   *
   *
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of threatTypes at the given index.
   */
  int getThreatTypesValue(int index);
}
