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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface CreateRollupPropertyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateRollupPropertyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The roll-up property to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Property rollup_property = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rollupProperty field is set.
   */
  boolean hasRollupProperty();
  /**
   *
   *
   * <pre>
   * Required. The roll-up property to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Property rollup_property = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rollupProperty.
   */
  com.google.analytics.admin.v1alpha.Property getRollupProperty();
  /**
   *
   *
   * <pre>
   * Required. The roll-up property to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.Property rollup_property = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.PropertyOrBuilder getRollupPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The resource names of properties that will be sources to the
   * created roll-up property.
   * </pre>
   *
   * <code>repeated string source_properties = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the sourceProperties.
   */
  java.util.List<java.lang.String> getSourcePropertiesList();
  /**
   *
   *
   * <pre>
   * Optional. The resource names of properties that will be sources to the
   * created roll-up property.
   * </pre>
   *
   * <code>repeated string source_properties = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of sourceProperties.
   */
  int getSourcePropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. The resource names of properties that will be sources to the
   * created roll-up property.
   * </pre>
   *
   * <code>repeated string source_properties = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The sourceProperties at the given index.
   */
  java.lang.String getSourceProperties(int index);
  /**
   *
   *
   * <pre>
   * Optional. The resource names of properties that will be sources to the
   * created roll-up property.
   * </pre>
   *
   * <code>repeated string source_properties = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourceProperties at the given index.
   */
  com.google.protobuf.ByteString getSourcePropertiesBytes(int index);
}
