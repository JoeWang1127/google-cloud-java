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
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.metastore.v1beta;

public interface EncryptionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.EncryptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fully qualified customer provided Cloud KMS key name to use for
   * customer data encryption, in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}`.
   * </pre>
   *
   * <code>string kms_key = 1;</code>
   *
   * @return The kmsKey.
   */
  java.lang.String getKmsKey();
  /**
   *
   *
   * <pre>
   * The fully qualified customer provided Cloud KMS key name to use for
   * customer data encryption, in the following form:
   *
   * `projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}`.
   * </pre>
   *
   * <code>string kms_key = 1;</code>
   *
   * @return The bytes for kmsKey.
   */
  com.google.protobuf.ByteString getKmsKeyBytes();
}
