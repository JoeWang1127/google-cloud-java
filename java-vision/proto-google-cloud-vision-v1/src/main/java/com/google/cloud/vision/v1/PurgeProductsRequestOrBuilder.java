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
// source: google/cloud/vision/v1/product_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface PurgeProductsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.PurgeProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specify which ProductSet contains the Products to be deleted.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSetPurgeConfig product_set_purge_config = 2;</code>
   *
   * @return Whether the productSetPurgeConfig field is set.
   */
  boolean hasProductSetPurgeConfig();
  /**
   *
   *
   * <pre>
   * Specify which ProductSet contains the Products to be deleted.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSetPurgeConfig product_set_purge_config = 2;</code>
   *
   * @return The productSetPurgeConfig.
   */
  com.google.cloud.vision.v1.ProductSetPurgeConfig getProductSetPurgeConfig();
  /**
   *
   *
   * <pre>
   * Specify which ProductSet contains the Products to be deleted.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSetPurgeConfig product_set_purge_config = 2;</code>
   */
  com.google.cloud.vision.v1.ProductSetPurgeConfigOrBuilder getProductSetPurgeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * If delete_orphan_products is true, all Products that are not in any
   * ProductSet will be deleted.
   * </pre>
   *
   * <code>bool delete_orphan_products = 3;</code>
   *
   * @return Whether the deleteOrphanProducts field is set.
   */
  boolean hasDeleteOrphanProducts();
  /**
   *
   *
   * <pre>
   * If delete_orphan_products is true, all Products that are not in any
   * ProductSet will be deleted.
   * </pre>
   *
   * <code>bool delete_orphan_products = 3;</code>
   *
   * @return The deleteOrphanProducts.
   */
  boolean getDeleteOrphanProducts();

  /**
   *
   *
   * <pre>
   * Required. The project and location in which the Products should be deleted.
   *
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and location in which the Products should be deleted.
   *
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The default value is false. Override this value to true to actually perform
   * the purge.
   * </pre>
   *
   * <code>bool force = 4;</code>
   *
   * @return The force.
   */
  boolean getForce();

  com.google.cloud.vision.v1.PurgeProductsRequest.TargetCase getTargetCase();
}
