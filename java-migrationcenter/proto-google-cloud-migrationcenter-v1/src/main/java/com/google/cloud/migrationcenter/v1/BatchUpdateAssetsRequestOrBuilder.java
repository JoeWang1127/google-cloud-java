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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

public interface BatchUpdateAssetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.BatchUpdateAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent value for batch asset update.
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
   * Required. Parent value for batch asset update.
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
   * Required. The request message specifying the resources to update.
   * A maximum of 1000 assets can be modified in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.UpdateAssetRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.UpdateAssetRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to update.
   * A maximum of 1000 assets can be modified in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.UpdateAssetRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.UpdateAssetRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to update.
   * A maximum of 1000 assets can be modified in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.UpdateAssetRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to update.
   * A maximum of 1000 assets can be modified in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.UpdateAssetRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.UpdateAssetRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to update.
   * A maximum of 1000 assets can be modified in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.UpdateAssetRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.UpdateAssetRequestOrBuilder getRequestsOrBuilder(int index);
}
