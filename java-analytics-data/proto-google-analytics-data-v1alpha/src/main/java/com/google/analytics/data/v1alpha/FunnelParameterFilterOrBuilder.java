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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

public interface FunnelParameterFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelParameterFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This filter will be evaluated on the specified event parameter. Event
   * parameters are logged as parameters of the event. Event parameters
   * include fields like "firebase_screen" &amp; "currency".
   *
   * Event parameters can only be used in segments &amp; funnels and can only be
   * used in a descendent filter from an EventFilter. In a descendent filter
   * from an EventFilter either event or item parameters should be used.
   * </pre>
   *
   * <code>string event_parameter_name = 1;</code>
   *
   * @return Whether the eventParameterName field is set.
   */
  boolean hasEventParameterName();
  /**
   *
   *
   * <pre>
   * This filter will be evaluated on the specified event parameter. Event
   * parameters are logged as parameters of the event. Event parameters
   * include fields like "firebase_screen" &amp; "currency".
   *
   * Event parameters can only be used in segments &amp; funnels and can only be
   * used in a descendent filter from an EventFilter. In a descendent filter
   * from an EventFilter either event or item parameters should be used.
   * </pre>
   *
   * <code>string event_parameter_name = 1;</code>
   *
   * @return The eventParameterName.
   */
  java.lang.String getEventParameterName();
  /**
   *
   *
   * <pre>
   * This filter will be evaluated on the specified event parameter. Event
   * parameters are logged as parameters of the event. Event parameters
   * include fields like "firebase_screen" &amp; "currency".
   *
   * Event parameters can only be used in segments &amp; funnels and can only be
   * used in a descendent filter from an EventFilter. In a descendent filter
   * from an EventFilter either event or item parameters should be used.
   * </pre>
   *
   * <code>string event_parameter_name = 1;</code>
   *
   * @return The bytes for eventParameterName.
   */
  com.google.protobuf.ByteString getEventParameterNameBytes();

  /**
   *
   *
   * <pre>
   * This filter will be evaluated on the specified item parameter. Item
   * parameters are logged as parameters in the item array. Item parameters
   * include fields like "item_name" &amp; "item_category".
   *
   * Item parameters can only be used in segments &amp; funnels and can only be
   * used in a descendent filter from an EventFilter. In a descendent filter
   * from an EventFilter either event or item parameters should be used.
   *
   * Item parameters are only available in ecommerce events. To learn more
   * about ecommerce events, see the [Measure ecommerce]
   * (https://developers.google.com/analytics/devguides/collection/ga4/ecommerce)
   * guide.
   * </pre>
   *
   * <code>string item_parameter_name = 2;</code>
   *
   * @return Whether the itemParameterName field is set.
   */
  boolean hasItemParameterName();
  /**
   *
   *
   * <pre>
   * This filter will be evaluated on the specified item parameter. Item
   * parameters are logged as parameters in the item array. Item parameters
   * include fields like "item_name" &amp; "item_category".
   *
   * Item parameters can only be used in segments &amp; funnels and can only be
   * used in a descendent filter from an EventFilter. In a descendent filter
   * from an EventFilter either event or item parameters should be used.
   *
   * Item parameters are only available in ecommerce events. To learn more
   * about ecommerce events, see the [Measure ecommerce]
   * (https://developers.google.com/analytics/devguides/collection/ga4/ecommerce)
   * guide.
   * </pre>
   *
   * <code>string item_parameter_name = 2;</code>
   *
   * @return The itemParameterName.
   */
  java.lang.String getItemParameterName();
  /**
   *
   *
   * <pre>
   * This filter will be evaluated on the specified item parameter. Item
   * parameters are logged as parameters in the item array. Item parameters
   * include fields like "item_name" &amp; "item_category".
   *
   * Item parameters can only be used in segments &amp; funnels and can only be
   * used in a descendent filter from an EventFilter. In a descendent filter
   * from an EventFilter either event or item parameters should be used.
   *
   * Item parameters are only available in ecommerce events. To learn more
   * about ecommerce events, see the [Measure ecommerce]
   * (https://developers.google.com/analytics/devguides/collection/ga4/ecommerce)
   * guide.
   * </pre>
   *
   * <code>string item_parameter_name = 2;</code>
   *
   * @return The bytes for itemParameterName.
   */
  com.google.protobuf.ByteString getItemParameterNameBytes();

  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 4;</code>
   *
   * @return Whether the stringFilter field is set.
   */
  boolean hasStringFilter();
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 4;</code>
   *
   * @return The stringFilter.
   */
  com.google.analytics.data.v1alpha.StringFilter getStringFilter();
  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.StringFilterOrBuilder getStringFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 5;</code>
   *
   * @return Whether the inListFilter field is set.
   */
  boolean hasInListFilter();
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 5;</code>
   *
   * @return The inListFilter.
   */
  com.google.analytics.data.v1alpha.InListFilter getInListFilter();
  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 5;</code>
   */
  com.google.analytics.data.v1alpha.InListFilterOrBuilder getInListFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 6;</code>
   *
   * @return Whether the numericFilter field is set.
   */
  boolean hasNumericFilter();
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 6;</code>
   *
   * @return The numericFilter.
   */
  com.google.analytics.data.v1alpha.NumericFilter getNumericFilter();
  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 6;</code>
   */
  com.google.analytics.data.v1alpha.NumericFilterOrBuilder getNumericFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 7;</code>
   *
   * @return Whether the betweenFilter field is set.
   */
  boolean hasBetweenFilter();
  /**
   *
   *
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 7;</code>
   *
   * @return The betweenFilter.
   */
  com.google.analytics.data.v1alpha.BetweenFilter getBetweenFilter();
  /**
   *
   *
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 7;</code>
   */
  com.google.analytics.data.v1alpha.BetweenFilterOrBuilder getBetweenFilterOrBuilder();

  com.google.analytics.data.v1alpha.FunnelParameterFilter.OneParameterCase getOneParameterCase();

  com.google.analytics.data.v1alpha.FunnelParameterFilter.OneFilterCase getOneFilterCase();
}
