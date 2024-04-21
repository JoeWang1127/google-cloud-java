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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

public interface ListDeidentifyTemplatesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.DeidentifyTemplate> getDeidentifyTemplatesList();
  /**
   *
   *
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplates(int index);
  /**
   *
   *
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  int getDeidentifyTemplatesCount();
  /**
   *
   *
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder>
      getDeidentifyTemplatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplatesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If the next page is available then the next page token to be used in the
   * following ListDeidentifyTemplates request.
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
   * If the next page is available then the next page token to be used in the
   * following ListDeidentifyTemplates request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
