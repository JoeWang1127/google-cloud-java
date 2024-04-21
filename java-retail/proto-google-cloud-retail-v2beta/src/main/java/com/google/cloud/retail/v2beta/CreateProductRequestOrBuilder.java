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
// source: google/cloud/retail/v2beta/product_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2beta;

public interface CreateProductRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.CreateProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch`.
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
   * Required. The parent catalog resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch`.
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
   * Required. The [Product][google.cloud.retail.v2beta.Product] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   *
   *
   * <pre>
   * Required. The [Product][google.cloud.retail.v2beta.Product] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The product.
   */
  com.google.cloud.retail.v2beta.Product getProduct();
  /**
   *
   *
   * <pre>
   * Required. The [Product][google.cloud.retail.v2beta.Product] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.ProductOrBuilder getProductOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [Product][google.cloud.retail.v2beta.Product], which will become the final
   * component of the [Product.name][google.cloud.retail.v2beta.Product.name].
   *
   * If the caller does not have permission to create the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   *
   * This field must be unique among all
   * [Product][google.cloud.retail.v2beta.Product]s with the same
   * [parent][google.cloud.retail.v2beta.CreateProductRequest.parent].
   * Otherwise, an ALREADY_EXISTS error is returned.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string product_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [Product][google.cloud.retail.v2beta.Product], which will become the final
   * component of the [Product.name][google.cloud.retail.v2beta.Product.name].
   *
   * If the caller does not have permission to create the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   *
   * This field must be unique among all
   * [Product][google.cloud.retail.v2beta.Product]s with the same
   * [parent][google.cloud.retail.v2beta.CreateProductRequest.parent].
   * Otherwise, an ALREADY_EXISTS error is returned.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string product_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString getProductIdBytes();
}
