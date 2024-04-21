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
// source: google/apps/script/type/extension_point.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.script.type;

public interface HomepageExtensionPointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.script.type.HomepageExtensionPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The endpoint to execute when this extension point is
   * activated.
   * </pre>
   *
   * <code>string run_function = 1;</code>
   *
   * @return The runFunction.
   */
  java.lang.String getRunFunction();
  /**
   *
   *
   * <pre>
   * Required. The endpoint to execute when this extension point is
   * activated.
   * </pre>
   *
   * <code>string run_function = 1;</code>
   *
   * @return The bytes for runFunction.
   */
  com.google.protobuf.ByteString getRunFunctionBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set to `false`, disable the home-page view in this context.
   *
   * Defaults to `true` if unset.
   *
   * If an add-ons custom home-page view is disabled, an autogenerated overview
   * card will be provided for users instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 2;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   *
   *
   * <pre>
   * Optional. If set to `false`, disable the home-page view in this context.
   *
   * Defaults to `true` if unset.
   *
   * If an add-ons custom home-page view is disabled, an autogenerated overview
   * card will be provided for users instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 2;</code>
   *
   * @return The enabled.
   */
  com.google.protobuf.BoolValue getEnabled();
  /**
   *
   *
   * <pre>
   * Optional. If set to `false`, disable the home-page view in this context.
   *
   * Defaults to `true` if unset.
   *
   * If an add-ons custom home-page view is disabled, an autogenerated overview
   * card will be provided for users instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enabled = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnabledOrBuilder();
}
