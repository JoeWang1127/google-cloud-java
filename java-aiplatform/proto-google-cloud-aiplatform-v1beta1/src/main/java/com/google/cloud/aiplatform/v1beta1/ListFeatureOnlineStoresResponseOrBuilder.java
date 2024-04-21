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
// source: google/cloud/aiplatform/v1beta1/feature_online_store_admin_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface ListFeatureOnlineStoresResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListFeatureOnlineStoresResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The FeatureOnlineStores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_stores = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore>
      getFeatureOnlineStoresList();
  /**
   *
   *
   * <pre>
   * The FeatureOnlineStores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_stores = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStore getFeatureOnlineStores(int index);
  /**
   *
   *
   * <pre>
   * The FeatureOnlineStores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_stores = 1;
   * </code>
   */
  int getFeatureOnlineStoresCount();
  /**
   *
   *
   * <pre>
   * The FeatureOnlineStores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_stores = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreOrBuilder>
      getFeatureOnlineStoresOrBuilderList();
  /**
   *
   *
   * <pre>
   * The FeatureOnlineStores matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureOnlineStore feature_online_stores = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureOnlineStoreOrBuilder getFeatureOnlineStoresOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListFeatureOnlineStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeatureOnlineStoresRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
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
   * A token, which can be sent as
   * [ListFeatureOnlineStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListFeatureOnlineStoresRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
