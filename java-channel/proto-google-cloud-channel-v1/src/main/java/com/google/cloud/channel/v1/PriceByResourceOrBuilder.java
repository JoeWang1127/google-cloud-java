/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.channel.v1;

public interface PriceByResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.PriceByResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource Type. Example: SEAT
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ResourceType resource_type = 1;</code>
   *
   * @return The enum numeric value on the wire for resourceType.
   */
  int getResourceTypeValue();
  /**
   *
   *
   * <pre>
   * Resource Type. Example: SEAT
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ResourceType resource_type = 1;</code>
   *
   * @return The resourceType.
   */
  com.google.cloud.channel.v1.ResourceType getResourceType();

  /**
   *
   *
   * <pre>
   * Price of the Offer. Present if there are no price phases.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 2;</code>
   *
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   *
   *
   * <pre>
   * Price of the Offer. Present if there are no price phases.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 2;</code>
   *
   * @return The price.
   */
  com.google.cloud.channel.v1.Price getPrice();
  /**
   *
   *
   * <pre>
   * Price of the Offer. Present if there are no price phases.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 2;</code>
   */
  com.google.cloud.channel.v1.PriceOrBuilder getPriceOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the price by time range.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PricePhase price_phases = 3;</code>
   */
  java.util.List<com.google.cloud.channel.v1.PricePhase> getPricePhasesList();
  /**
   *
   *
   * <pre>
   * Specifies the price by time range.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PricePhase price_phases = 3;</code>
   */
  com.google.cloud.channel.v1.PricePhase getPricePhases(int index);
  /**
   *
   *
   * <pre>
   * Specifies the price by time range.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PricePhase price_phases = 3;</code>
   */
  int getPricePhasesCount();
  /**
   *
   *
   * <pre>
   * Specifies the price by time range.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PricePhase price_phases = 3;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.PricePhaseOrBuilder>
      getPricePhasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies the price by time range.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.PricePhase price_phases = 3;</code>
   */
  com.google.cloud.channel.v1.PricePhaseOrBuilder getPricePhasesOrBuilder(int index);
}