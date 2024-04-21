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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public interface ListReactionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.ListReactionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of reactions in the requested (or first) page.
   * </pre>
   *
   * <code>repeated .google.chat.v1.Reaction reactions = 1;</code>
   */
  java.util.List<com.google.chat.v1.Reaction> getReactionsList();
  /**
   *
   *
   * <pre>
   * List of reactions in the requested (or first) page.
   * </pre>
   *
   * <code>repeated .google.chat.v1.Reaction reactions = 1;</code>
   */
  com.google.chat.v1.Reaction getReactions(int index);
  /**
   *
   *
   * <pre>
   * List of reactions in the requested (or first) page.
   * </pre>
   *
   * <code>repeated .google.chat.v1.Reaction reactions = 1;</code>
   */
  int getReactionsCount();
  /**
   *
   *
   * <pre>
   * List of reactions in the requested (or first) page.
   * </pre>
   *
   * <code>repeated .google.chat.v1.Reaction reactions = 1;</code>
   */
  java.util.List<? extends com.google.chat.v1.ReactionOrBuilder> getReactionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of reactions in the requested (or first) page.
   * </pre>
   *
   * <code>repeated .google.chat.v1.Reaction reactions = 1;</code>
   */
  com.google.chat.v1.ReactionOrBuilder getReactionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Continuation token to retrieve the next page of results. It's empty
   * for the last page of results.
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
   * Continuation token to retrieve the next page of results. It's empty
   * for the last page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
