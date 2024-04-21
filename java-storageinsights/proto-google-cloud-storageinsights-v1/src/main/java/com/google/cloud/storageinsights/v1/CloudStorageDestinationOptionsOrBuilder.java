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
// source: google/cloud/storageinsights/v1/storageinsights.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.storageinsights.v1;

public interface CloudStorageDestinationOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.storageinsights.v1.CloudStorageDestinationOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Destination bucket.
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Destination bucket.
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Destination path is the path in the bucket where the report should be
   * generated.
   * </pre>
   *
   * <code>string destination_path = 2;</code>
   *
   * @return The destinationPath.
   */
  java.lang.String getDestinationPath();
  /**
   *
   *
   * <pre>
   * Destination path is the path in the bucket where the report should be
   * generated.
   * </pre>
   *
   * <code>string destination_path = 2;</code>
   *
   * @return The bytes for destinationPath.
   */
  com.google.protobuf.ByteString getDestinationPathBytes();
}
