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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contactcenterinsights.v1;

public interface IssueModelLabelStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.IssueModelLabelStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of conversations the issue model has analyzed at this point in time.
   * </pre>
   *
   * <code>int64 analyzed_conversations_count = 1;</code>
   *
   * @return The analyzedConversationsCount.
   */
  long getAnalyzedConversationsCount();

  /**
   *
   *
   * <pre>
   * Number of analyzed conversations for which no issue was applicable at this
   * point in time.
   * </pre>
   *
   * <code>int64 unclassified_conversations_count = 2;</code>
   *
   * @return The unclassifiedConversationsCount.
   */
  long getUnclassifiedConversationsCount();

  /**
   *
   *
   * <pre>
   * Statistics on each issue. Key is the issue's resource name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_stats = 3;
   * </code>
   */
  int getIssueStatsCount();
  /**
   *
   *
   * <pre>
   * Statistics on each issue. Key is the issue's resource name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_stats = 3;
   * </code>
   */
  boolean containsIssueStats(java.lang.String key);
  /** Use {@link #getIssueStatsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats>
      getIssueStats();
  /**
   *
   *
   * <pre>
   * Statistics on each issue. Key is the issue's resource name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_stats = 3;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats>
      getIssueStatsMap();
  /**
   *
   *
   * <pre>
   * Statistics on each issue. Key is the issue's resource name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_stats = 3;
   * </code>
   */
  /* nullable */
  com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats getIssueStatsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats defaultValue);
  /**
   *
   *
   * <pre>
   * Statistics on each issue. Key is the issue's resource name.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_stats = 3;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats getIssueStatsOrThrow(
      java.lang.String key);
}
