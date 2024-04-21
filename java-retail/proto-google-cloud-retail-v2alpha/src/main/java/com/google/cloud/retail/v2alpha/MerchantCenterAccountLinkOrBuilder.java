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
// source: google/cloud/retail/v2alpha/merchant_center_account_link.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2alpha;

public interface MerchantCenterAccountLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.MerchantCenterAccountLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Immutable. Full resource name of the Merchant Center Account
   * Link, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/merchantCenterAccountLinks/merchant_center_account_link`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. Full resource name of the Merchant Center Account
   * Link, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/merchantCenterAccountLinks/merchant_center_account_link`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Immutable.
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink]
   * identifier, which is the final component of
   * [name][google.cloud.retail.v2alpha.MerchantCenterAccountLink.name]. This
   * field is auto generated and follows the convention:
   * `BranchId_MerchantCenterAccountId`.
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/merchantCenterAccountLinks/id_1`.
   * </pre>
   *
   * <code>
   * string id = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. Immutable.
   * [MerchantCenterAccountLink][google.cloud.retail.v2alpha.MerchantCenterAccountLink]
   * identifier, which is the final component of
   * [name][google.cloud.retail.v2alpha.MerchantCenterAccountLink.name]. This
   * field is auto generated and follows the convention:
   * `BranchId_MerchantCenterAccountId`.
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/merchantCenterAccountLinks/id_1`.
   * </pre>
   *
   * <code>
   * string id = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The linked [Merchant center account
   * id](https://developers.google.com/shopping-content/guides/accountstatuses).
   * The account must be a standalone account or a sub-account of a MCA.
   * </pre>
   *
   * <code>int64 merchant_center_account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The merchantCenterAccountId.
   */
  long getMerchantCenterAccountId();

  /**
   *
   *
   * <pre>
   * Required. The branch id (e.g. 0/1/2) within the catalog that products from
   * merchant_center_account_id are streamed to. When updating this field, an
   * empty value will use the currently configured default branch. However,
   * changing the default branch later on won't change the linked branch here.
   *
   * A single branch id can only have one linked merchant center account id.
   * </pre>
   *
   * <code>string branch_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The branchId.
   */
  java.lang.String getBranchId();
  /**
   *
   *
   * <pre>
   * Required. The branch id (e.g. 0/1/2) within the catalog that products from
   * merchant_center_account_id are streamed to. When updating this field, an
   * empty value will use the currently configured default branch. However,
   * changing the default branch later on won't change the linked branch here.
   *
   * A single branch id can only have one linked merchant center account id.
   * </pre>
   *
   * <code>string branch_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for branchId.
   */
  com.google.protobuf.ByteString getBranchIdBytes();

  /**
   *
   *
   * <pre>
   * The FeedLabel used to perform filtering.
   * Note: this replaces
   * [region_id](https://developers.google.com/shopping-content/reference/rest/v2.1/products#Product.FIELDS.feed_label).
   *
   * Example value: `US`.
   * Example value: `FeedLabel1`.
   * </pre>
   *
   * <code>string feed_label = 4;</code>
   *
   * @return The feedLabel.
   */
  java.lang.String getFeedLabel();
  /**
   *
   *
   * <pre>
   * The FeedLabel used to perform filtering.
   * Note: this replaces
   * [region_id](https://developers.google.com/shopping-content/reference/rest/v2.1/products#Product.FIELDS.feed_label).
   *
   * Example value: `US`.
   * Example value: `FeedLabel1`.
   * </pre>
   *
   * <code>string feed_label = 4;</code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Language of the title/description and other string attributes. Use language
   * tags defined by [BCP 47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt).
   * ISO 639-1.
   *
   * This specifies the language of offers in Merchant Center that will be
   * accepted. If empty, no language filtering will be performed.
   *
   * Example value: `en`.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language of the title/description and other string attributes. Use language
   * tags defined by [BCP 47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt).
   * ISO 639-1.
   *
   * This specifies the language of offers in Merchant Center that will be
   * accepted. If empty, no language filtering will be performed.
   *
   * Example value: `en`.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Criteria for the Merchant Center feeds to be ingested via the link.
   * All offers will be ingested if the list is empty.
   * Otherwise the offers will be ingested from selected feeds.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter feed_filters = 6;
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter>
      getFeedFiltersList();
  /**
   *
   *
   * <pre>
   * Criteria for the Merchant Center feeds to be ingested via the link.
   * All offers will be ingested if the list is empty.
   * Otherwise the offers will be ingested from selected feeds.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter feed_filters = 6;
   * </code>
   */
  com.google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter getFeedFilters(
      int index);
  /**
   *
   *
   * <pre>
   * Criteria for the Merchant Center feeds to be ingested via the link.
   * All offers will be ingested if the list is empty.
   * Otherwise the offers will be ingested from selected feeds.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter feed_filters = 6;
   * </code>
   */
  int getFeedFiltersCount();
  /**
   *
   *
   * <pre>
   * Criteria for the Merchant Center feeds to be ingested via the link.
   * All offers will be ingested if the list is empty.
   * Otherwise the offers will be ingested from selected feeds.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter feed_filters = 6;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.retail.v2alpha.MerchantCenterAccountLink
                  .MerchantCenterFeedFilterOrBuilder>
      getFeedFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Criteria for the Merchant Center feeds to be ingested via the link.
   * All offers will be ingested if the list is empty.
   * Otherwise the offers will be ingested from selected feeds.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilter feed_filters = 6;
   * </code>
   */
  com.google.cloud.retail.v2alpha.MerchantCenterAccountLink.MerchantCenterFeedFilterOrBuilder
      getFeedFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Represents the state of the link.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.MerchantCenterAccountLink.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Represents the state of the link.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.MerchantCenterAccountLink.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.retail.v2alpha.MerchantCenterAccountLink.State getState();

  /**
   *
   *
   * <pre>
   * Output only. GCP project ID.
   * </pre>
   *
   * <code>string project_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Output only. GCP project ID.
   * </pre>
   *
   * <code>string project_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();
}
