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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface NodeTaintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeTaint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Key for taint.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * Key for taint.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Value for taint.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * Value for taint.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * Effect for taint.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeTaint.Effect effect = 3;</code>
   *
   * @return The enum numeric value on the wire for effect.
   */
  int getEffectValue();
  /**
   *
   *
   * <pre>
   * Effect for taint.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeTaint.Effect effect = 3;</code>
   *
   * @return The effect.
   */
  com.google.container.v1beta1.NodeTaint.Effect getEffect();
}
