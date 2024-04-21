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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

public interface RenameTagTemplateFieldRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.RenameTagTemplateFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the tag template field.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the tag template field.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The new ID of this tag template field. For example,
   * `my_new_field`.
   * </pre>
   *
   * <code>string new_tag_template_field_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The newTagTemplateFieldId.
   */
  java.lang.String getNewTagTemplateFieldId();
  /**
   *
   *
   * <pre>
   * Required. The new ID of this tag template field. For example,
   * `my_new_field`.
   * </pre>
   *
   * <code>string new_tag_template_field_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for newTagTemplateFieldId.
   */
  com.google.protobuf.ByteString getNewTagTemplateFieldIdBytes();
}
