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

public interface RawHashesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.RawHashes)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of bytes for each prefix encoded below.  This field can be
   * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
   * </pre>
   *
   * <code>int32 prefix_size = 1;</code>
   *
   * @return The prefixSize.
   */
  int getPrefixSize();

  /**
   *
   *
   * <pre>
   * The hashes, in binary format, concatenated into one long string. Hashes are
   * sorted in lexicographic order. For JSON API users, hashes are
   * base64-encoded.
   * </pre>
   *
   * <code>bytes raw_hashes = 2;</code>
   *
   * @return The rawHashes.
   */
  com.google.protobuf.ByteString getRawHashes();
}
