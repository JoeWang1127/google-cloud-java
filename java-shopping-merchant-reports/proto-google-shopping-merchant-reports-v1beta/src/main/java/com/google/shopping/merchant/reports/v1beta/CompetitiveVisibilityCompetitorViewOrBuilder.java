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
// source: google/shopping/merchant/reports/v1beta/reports.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.reports.v1beta;

public interface CompetitiveVisibilityCompetitorViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.CompetitiveVisibilityCompetitorView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Date of this row.
   *
   * A condition on `date` is required in the `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * Date of this row.
   *
   * A condition on `date` is required in the `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return The date.
   */
  com.google.type.Date getDate();
  /**
   *
   *
   * <pre>
   * Date of this row.
   *
   * A condition on `date` is required in the `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   */
  com.google.type.DateOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Domain of your competitor or your domain, if 'is_your_domain' is true.
   *
   * Required in the `SELECT` clause. Cannot be filtered on in the 'WHERE'
   * clause.
   * </pre>
   *
   * <code>optional string domain = 2;</code>
   *
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   *
   *
   * <pre>
   * Domain of your competitor or your domain, if 'is_your_domain' is true.
   *
   * Required in the `SELECT` clause. Cannot be filtered on in the 'WHERE'
   * clause.
   * </pre>
   *
   * <code>optional string domain = 2;</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   *
   *
   * <pre>
   * Domain of your competitor or your domain, if 'is_your_domain' is true.
   *
   * Required in the `SELECT` clause. Cannot be filtered on in the 'WHERE'
   * clause.
   * </pre>
   *
   * <code>optional string domain = 2;</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * True if this row contains data for your domain.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional bool is_your_domain = 3;</code>
   *
   * @return Whether the isYourDomain field is set.
   */
  boolean hasIsYourDomain();
  /**
   *
   *
   * <pre>
   * True if this row contains data for your domain.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional bool is_your_domain = 3;</code>
   *
   * @return The isYourDomain.
   */
  boolean getIsYourDomain();

  /**
   *
   *
   * <pre>
   * Country where impressions appeared.
   *
   * Required in the `SELECT` clause. A condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 4;</code>
   *
   * @return Whether the reportCountryCode field is set.
   */
  boolean hasReportCountryCode();
  /**
   *
   *
   * <pre>
   * Country where impressions appeared.
   *
   * Required in the `SELECT` clause. A condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 4;</code>
   *
   * @return The reportCountryCode.
   */
  java.lang.String getReportCountryCode();
  /**
   *
   *
   * <pre>
   * Country where impressions appeared.
   *
   * Required in the `SELECT` clause. A condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 4;</code>
   *
   * @return The bytes for reportCountryCode.
   */
  com.google.protobuf.ByteString getReportCountryCodeBytes();

  /**
   *
   *
   * <pre>
   * Google product category ID to calculate the report for, represented in
   * [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   *
   * Required in the `SELECT` clause. A condition on `report_category_id` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional int64 report_category_id = 5;</code>
   *
   * @return Whether the reportCategoryId field is set.
   */
  boolean hasReportCategoryId();
  /**
   *
   *
   * <pre>
   * Google product category ID to calculate the report for, represented in
   * [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   *
   * Required in the `SELECT` clause. A condition on `report_category_id` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional int64 report_category_id = 5;</code>
   *
   * @return The reportCategoryId.
   */
  long getReportCategoryId();

  /**
   *
   *
   * <pre>
   * Traffic source of impressions.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum traffic_source = 6;
   * </code>
   *
   * @return Whether the trafficSource field is set.
   */
  boolean hasTrafficSource();
  /**
   *
   *
   * <pre>
   * Traffic source of impressions.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum traffic_source = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for trafficSource.
   */
  int getTrafficSourceValue();
  /**
   *
   *
   * <pre>
   * Traffic source of impressions.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum traffic_source = 6;
   * </code>
   *
   * @return The trafficSource.
   */
  com.google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum getTrafficSource();

  /**
   *
   *
   * <pre>
   * Position of the domain in the similar businesses ranking for the selected
   * keys (`date`, `report_category_id`, `report_country_code`,
   * `traffic_source`) based on impressions. 1 is the highest.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional int64 rank = 7;</code>
   *
   * @return Whether the rank field is set.
   */
  boolean hasRank();
  /**
   *
   *
   * <pre>
   * Position of the domain in the similar businesses ranking for the selected
   * keys (`date`, `report_category_id`, `report_country_code`,
   * `traffic_source`) based on impressions. 1 is the highest.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional int64 rank = 7;</code>
   *
   * @return The rank.
   */
  long getRank();

  /**
   *
   *
   * <pre>
   * [Ads / organic ratio]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Cads-free-ratio)
   * shows how often the domain receives impressions from Shopping ads compared
   * to organic traffic. The number is rounded and bucketed.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double ads_organic_ratio = 8;</code>
   *
   * @return Whether the adsOrganicRatio field is set.
   */
  boolean hasAdsOrganicRatio();
  /**
   *
   *
   * <pre>
   * [Ads / organic ratio]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Cads-free-ratio)
   * shows how often the domain receives impressions from Shopping ads compared
   * to organic traffic. The number is rounded and bucketed.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double ads_organic_ratio = 8;</code>
   *
   * @return The adsOrganicRatio.
   */
  double getAdsOrganicRatio();

  /**
   *
   *
   * <pre>
   * [Page overlap rate]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Cpage-overlap-rate)
   * shows how frequently competing retailers’ offers are shown together with
   * your offers on the same page.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double page_overlap_rate = 9;</code>
   *
   * @return Whether the pageOverlapRate field is set.
   */
  boolean hasPageOverlapRate();
  /**
   *
   *
   * <pre>
   * [Page overlap rate]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Cpage-overlap-rate)
   * shows how frequently competing retailers’ offers are shown together with
   * your offers on the same page.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double page_overlap_rate = 9;</code>
   *
   * @return The pageOverlapRate.
   */
  double getPageOverlapRate();

  /**
   *
   *
   * <pre>
   * [Higher position rate]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Chigher-position-rate)
   * shows how often a competitor’s offer got placed in a higher position on the
   * page than your offer.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double higher_position_rate = 10;</code>
   *
   * @return Whether the higherPositionRate field is set.
   */
  boolean hasHigherPositionRate();
  /**
   *
   *
   * <pre>
   * [Higher position rate]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Chigher-position-rate)
   * shows how often a competitor’s offer got placed in a higher position on the
   * page than your offer.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double higher_position_rate = 10;</code>
   *
   * @return The higherPositionRate.
   */
  double getHigherPositionRate();

  /**
   *
   *
   * <pre>
   * [Relative visibility]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Crelative-visibility)
   * shows how often your competitors’ offers are shown compared to your offers.
   * In other words, this is the number of displayed impressions of a competitor
   * retailer divided by the number of your displayed impressions during a
   * selected time range for a selected product category and country.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double relative_visibility = 11;</code>
   *
   * @return Whether the relativeVisibility field is set.
   */
  boolean hasRelativeVisibility();
  /**
   *
   *
   * <pre>
   * [Relative visibility]
   * (https://support.google.com/merchants/answer/11366442#zippy=%2Crelative-visibility)
   * shows how often your competitors’ offers are shown compared to your offers.
   * In other words, this is the number of displayed impressions of a competitor
   * retailer divided by the number of your displayed impressions during a
   * selected time range for a selected product category and country.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double relative_visibility = 11;</code>
   *
   * @return The relativeVisibility.
   */
  double getRelativeVisibility();
}
