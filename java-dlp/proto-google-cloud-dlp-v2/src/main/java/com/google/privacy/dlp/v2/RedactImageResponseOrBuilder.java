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

public interface RedactImageResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RedactImageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The redacted image. The type will be the same as the original image.
   * </pre>
   *
   * <code>bytes redacted_image = 1;</code>
   *
   * @return The redactedImage.
   */
  com.google.protobuf.ByteString getRedactedImage();

  /**
   *
   *
   * <pre>
   * If an image was being inspected and the InspectConfig's include_quote was
   * set to true, then this field will include all text, if any, that was found
   * in the image.
   * </pre>
   *
   * <code>string extracted_text = 2;</code>
   *
   * @return The extractedText.
   */
  java.lang.String getExtractedText();
  /**
   *
   *
   * <pre>
   * If an image was being inspected and the InspectConfig's include_quote was
   * set to true, then this field will include all text, if any, that was found
   * in the image.
   * </pre>
   *
   * <code>string extracted_text = 2;</code>
   *
   * @return The bytes for extractedText.
   */
  com.google.protobuf.ByteString getExtractedTextBytes();

  /**
   *
   *
   * <pre>
   * The findings. Populated when include_findings in the request is true.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
   *
   * @return Whether the inspectResult field is set.
   */
  boolean hasInspectResult();
  /**
   *
   *
   * <pre>
   * The findings. Populated when include_findings in the request is true.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
   *
   * @return The inspectResult.
   */
  com.google.privacy.dlp.v2.InspectResult getInspectResult();
  /**
   *
   *
   * <pre>
   * The findings. Populated when include_findings in the request is true.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectResult inspect_result = 3;</code>
   */
  com.google.privacy.dlp.v2.InspectResultOrBuilder getInspectResultOrBuilder();
}
