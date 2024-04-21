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
// source: google/cloud/discoveryengine/v1/completion.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

public interface SuggestionDenyListEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.SuggestionDenyListEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Phrase to block from suggestions served. Can be maximum 125
   * characters.
   * </pre>
   *
   * <code>string block_phrase = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The blockPhrase.
   */
  java.lang.String getBlockPhrase();
  /**
   *
   *
   * <pre>
   * Required. Phrase to block from suggestions served. Can be maximum 125
   * characters.
   * </pre>
   *
   * <code>string block_phrase = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for blockPhrase.
   */
  com.google.protobuf.ByteString getBlockPhraseBytes();

  /**
   *
   *
   * <pre>
   * Required. The match operator to apply for this phrase. Whether to block the
   * exact phrase, or block any suggestions containing this phrase.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SuggestionDenyListEntry.MatchOperator match_operator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for matchOperator.
   */
  int getMatchOperatorValue();
  /**
   *
   *
   * <pre>
   * Required. The match operator to apply for this phrase. Whether to block the
   * exact phrase, or block any suggestions containing this phrase.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SuggestionDenyListEntry.MatchOperator match_operator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The matchOperator.
   */
  com.google.cloud.discoveryengine.v1.SuggestionDenyListEntry.MatchOperator getMatchOperator();
}
