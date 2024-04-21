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
// source: google/cloud/channel/v1/offers.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.channel.v1;

public interface PriceTierOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.PriceTier)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * First resource for which the tier price applies.
   * </pre>
   *
   * <code>int32 first_resource = 1;</code>
   *
   * @return The firstResource.
   */
  int getFirstResource();

  /**
   *
   *
   * <pre>
   * Last resource for which the tier price applies.
   * </pre>
   *
   * <code>int32 last_resource = 2;</code>
   *
   * @return The lastResource.
   */
  int getLastResource();

  /**
   *
   *
   * <pre>
   * Price of the tier.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 3;</code>
   *
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   *
   *
   * <pre>
   * Price of the tier.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 3;</code>
   *
   * @return The price.
   */
  com.google.cloud.channel.v1.Price getPrice();
  /**
   *
   *
   * <pre>
   * Price of the tier.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 3;</code>
   */
  com.google.cloud.channel.v1.PriceOrBuilder getPriceOrBuilder();
}
