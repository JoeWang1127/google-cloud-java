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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.analyticshub.v1;

public interface CreateListingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.CreateListingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource path of the listing.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
   * Required. The parent resource path of the listing.
   * e.g. `projects/myproject/locations/US/dataExchanges/123`.
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
   * Required. The ID of the listing to create.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The listingId.
   */
  java.lang.String getListingId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the listing to create.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string listing_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for listingId.
   */
  com.google.protobuf.ByteString getListingIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the listing field is set.
   */
  boolean hasListing();
  /**
   *
   *
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The listing.
   */
  com.google.cloud.bigquery.analyticshub.v1.Listing getListing();
  /**
   *
   *
   * <pre>
   * Required. The listing to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.Listing listing = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingOrBuilder();
}
