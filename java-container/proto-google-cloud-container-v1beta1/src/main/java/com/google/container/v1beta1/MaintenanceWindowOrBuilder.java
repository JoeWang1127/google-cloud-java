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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface MaintenanceWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.MaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1beta1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   *
   * @return Whether the dailyMaintenanceWindow field is set.
   */
  boolean hasDailyMaintenanceWindow();
  /**
   *
   *
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1beta1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   *
   * @return The dailyMaintenanceWindow.
   */
  com.google.container.v1beta1.DailyMaintenanceWindow getDailyMaintenanceWindow();
  /**
   *
   *
   * <pre>
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * </pre>
   *
   * <code>.google.container.v1beta1.DailyMaintenanceWindow daily_maintenance_window = 2;</code>
   */
  com.google.container.v1beta1.DailyMaintenanceWindowOrBuilder getDailyMaintenanceWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * RecurringWindow specifies some number of recurring time periods for
   * maintenance to occur. The time windows may be overlapping. If no
   * maintenance windows are set, maintenance can occur at any time.
   * </pre>
   *
   * <code>.google.container.v1beta1.RecurringTimeWindow recurring_window = 3;</code>
   *
   * @return Whether the recurringWindow field is set.
   */
  boolean hasRecurringWindow();
  /**
   *
   *
   * <pre>
   * RecurringWindow specifies some number of recurring time periods for
   * maintenance to occur. The time windows may be overlapping. If no
   * maintenance windows are set, maintenance can occur at any time.
   * </pre>
   *
   * <code>.google.container.v1beta1.RecurringTimeWindow recurring_window = 3;</code>
   *
   * @return The recurringWindow.
   */
  com.google.container.v1beta1.RecurringTimeWindow getRecurringWindow();
  /**
   *
   *
   * <pre>
   * RecurringWindow specifies some number of recurring time periods for
   * maintenance to occur. The time windows may be overlapping. If no
   * maintenance windows are set, maintenance can occur at any time.
   * </pre>
   *
   * <code>.google.container.v1beta1.RecurringTimeWindow recurring_window = 3;</code>
   */
  com.google.container.v1beta1.RecurringTimeWindowOrBuilder getRecurringWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1beta1.TimeWindow&gt; maintenance_exclusions = 4;
   * </code>
   */
  int getMaintenanceExclusionsCount();
  /**
   *
   *
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1beta1.TimeWindow&gt; maintenance_exclusions = 4;
   * </code>
   */
  boolean containsMaintenanceExclusions(java.lang.String key);
  /** Use {@link #getMaintenanceExclusionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.container.v1beta1.TimeWindow>
      getMaintenanceExclusions();
  /**
   *
   *
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1beta1.TimeWindow&gt; maintenance_exclusions = 4;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.container.v1beta1.TimeWindow>
      getMaintenanceExclusionsMap();
  /**
   *
   *
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1beta1.TimeWindow&gt; maintenance_exclusions = 4;
   * </code>
   */
  /* nullable */
  com.google.container.v1beta1.TimeWindow getMaintenanceExclusionsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.container.v1beta1.TimeWindow defaultValue);
  /**
   *
   *
   * <pre>
   * Exceptions to maintenance window. Non-emergency maintenance should not
   * occur in these windows.
   * </pre>
   *
   * <code>map&lt;string, .google.container.v1beta1.TimeWindow&gt; maintenance_exclusions = 4;
   * </code>
   */
  com.google.container.v1beta1.TimeWindow getMaintenanceExclusionsOrThrow(java.lang.String key);

  com.google.container.v1beta1.MaintenanceWindow.PolicyCase getPolicyCase();
}
