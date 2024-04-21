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
// source: google/cloud/discoveryengine/v1alpha/user_event.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public interface PanelInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.PanelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The panel ID.
   * </pre>
   *
   * <code>string panel_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The panelId.
   */
  java.lang.String getPanelId();
  /**
   *
   *
   * <pre>
   * Required. The panel ID.
   * </pre>
   *
   * <code>string panel_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for panelId.
   */
  com.google.protobuf.ByteString getPanelIdBytes();

  /**
   *
   *
   * <pre>
   * The display name of the panel.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the panel.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The ordered position of the panel, if shown to the user with other panels.
   * If set, then
   * [total_panels][google.cloud.discoveryengine.v1alpha.PanelInfo.total_panels]
   * must also be set.
   * </pre>
   *
   * <code>optional int32 panel_position = 4;</code>
   *
   * @return Whether the panelPosition field is set.
   */
  boolean hasPanelPosition();
  /**
   *
   *
   * <pre>
   * The ordered position of the panel, if shown to the user with other panels.
   * If set, then
   * [total_panels][google.cloud.discoveryengine.v1alpha.PanelInfo.total_panels]
   * must also be set.
   * </pre>
   *
   * <code>optional int32 panel_position = 4;</code>
   *
   * @return The panelPosition.
   */
  int getPanelPosition();

  /**
   *
   *
   * <pre>
   * The total number of panels, including this one, shown to the user.
   * Must be set if
   * [panel_position][google.cloud.discoveryengine.v1alpha.PanelInfo.panel_position]
   * is set.
   * </pre>
   *
   * <code>optional int32 total_panels = 5;</code>
   *
   * @return Whether the totalPanels field is set.
   */
  boolean hasTotalPanels();
  /**
   *
   *
   * <pre>
   * The total number of panels, including this one, shown to the user.
   * Must be set if
   * [panel_position][google.cloud.discoveryengine.v1alpha.PanelInfo.panel_position]
   * is set.
   * </pre>
   *
   * <code>optional int32 total_panels = 5;</code>
   *
   * @return The totalPanels.
   */
  int getTotalPanels();
}
