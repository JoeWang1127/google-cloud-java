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
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.3
package com.google.recaptchaenterprise.v1beta1;

public interface TransactionDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1beta1.TransactionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique identifier for the transaction. This custom identifier can be used
   * to reference this transaction in the future, for example, labeling a refund
   * or chargeback event. Two attempts at the same transaction should use the
   * same transaction id.
   * </pre>
   *
   * <code>optional string transaction_id = 11;</code>
   *
   * @return Whether the transactionId field is set.
   */
  boolean hasTransactionId();
  /**
   *
   *
   * <pre>
   * Unique identifier for the transaction. This custom identifier can be used
   * to reference this transaction in the future, for example, labeling a refund
   * or chargeback event. Two attempts at the same transaction should use the
   * same transaction id.
   * </pre>
   *
   * <code>optional string transaction_id = 11;</code>
   *
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   *
   *
   * <pre>
   * Unique identifier for the transaction. This custom identifier can be used
   * to reference this transaction in the future, for example, labeling a refund
   * or chargeback event. Two attempts at the same transaction should use the
   * same transaction id.
   * </pre>
   *
   * <code>optional string transaction_id = 11;</code>
   *
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString getTransactionIdBytes();

  /**
   *
   *
   * <pre>
   * The payment method for the transaction. The allowed values are:
   *
   * * credit-card
   * * debit-card
   * * gift-card
   * * processor-{name} (If a third-party is used, for example,
   * processor-paypal)
   * * custom-{name} (If an alternative method is used, for example,
   * custom-crypto)
   * </pre>
   *
   * <code>string payment_method = 1;</code>
   *
   * @return The paymentMethod.
   */
  java.lang.String getPaymentMethod();
  /**
   *
   *
   * <pre>
   * The payment method for the transaction. The allowed values are:
   *
   * * credit-card
   * * debit-card
   * * gift-card
   * * processor-{name} (If a third-party is used, for example,
   * processor-paypal)
   * * custom-{name} (If an alternative method is used, for example,
   * custom-crypto)
   * </pre>
   *
   * <code>string payment_method = 1;</code>
   *
   * @return The bytes for paymentMethod.
   */
  com.google.protobuf.ByteString getPaymentMethodBytes();

  /**
   *
   *
   * <pre>
   * The Bank Identification Number - generally the first 6 or 8 digits of the
   * card.
   * </pre>
   *
   * <code>string card_bin = 2;</code>
   *
   * @return The cardBin.
   */
  java.lang.String getCardBin();
  /**
   *
   *
   * <pre>
   * The Bank Identification Number - generally the first 6 or 8 digits of the
   * card.
   * </pre>
   *
   * <code>string card_bin = 2;</code>
   *
   * @return The bytes for cardBin.
   */
  com.google.protobuf.ByteString getCardBinBytes();

  /**
   *
   *
   * <pre>
   * The last four digits of the card.
   * </pre>
   *
   * <code>string card_last_four = 3;</code>
   *
   * @return The cardLastFour.
   */
  java.lang.String getCardLastFour();
  /**
   *
   *
   * <pre>
   * The last four digits of the card.
   * </pre>
   *
   * <code>string card_last_four = 3;</code>
   *
   * @return The bytes for cardLastFour.
   */
  com.google.protobuf.ByteString getCardLastFourBytes();

  /**
   *
   *
   * <pre>
   * The currency code in ISO-4217 format.
   * </pre>
   *
   * <code>string currency_code = 4;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * The currency code in ISO-4217 format.
   * </pre>
   *
   * <code>string currency_code = 4;</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * The decimal value of the transaction in the specified currency.
   * </pre>
   *
   * <code>double value = 5;</code>
   *
   * @return The value.
   */
  double getValue();

  /**
   *
   *
   * <pre>
   * The value of shipping in the specified currency. 0 for free or no shipping.
   * </pre>
   *
   * <code>double shipping_value = 12;</code>
   *
   * @return The shippingValue.
   */
  double getShippingValue();

  /**
   *
   *
   * <pre>
   * Destination address if this transaction involves shipping a physical item.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.Address shipping_address = 6;
   * </code>
   *
   * @return Whether the shippingAddress field is set.
   */
  boolean hasShippingAddress();
  /**
   *
   *
   * <pre>
   * Destination address if this transaction involves shipping a physical item.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.Address shipping_address = 6;
   * </code>
   *
   * @return The shippingAddress.
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.Address getShippingAddress();
  /**
   *
   *
   * <pre>
   * Destination address if this transaction involves shipping a physical item.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.Address shipping_address = 6;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.AddressOrBuilder
      getShippingAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * Address associated with the payment method when applicable.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.Address billing_address = 7;
   * </code>
   *
   * @return Whether the billingAddress field is set.
   */
  boolean hasBillingAddress();
  /**
   *
   *
   * <pre>
   * Address associated with the payment method when applicable.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.Address billing_address = 7;
   * </code>
   *
   * @return The billingAddress.
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.Address getBillingAddress();
  /**
   *
   *
   * <pre>
   * Address associated with the payment method when applicable.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.Address billing_address = 7;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.AddressOrBuilder
      getBillingAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the user paying/initiating the transaction.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.User user = 8;</code>
   *
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   *
   *
   * <pre>
   * Information about the user paying/initiating the transaction.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.User user = 8;</code>
   *
   * @return The user.
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.User getUser();
  /**
   *
   *
   * <pre>
   * Information about the user paying/initiating the transaction.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.User user = 8;</code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.UserOrBuilder getUserOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the user or users fulfilling the transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.User merchants = 13;
   * </code>
   */
  java.util.List<com.google.recaptchaenterprise.v1beta1.TransactionData.User> getMerchantsList();
  /**
   *
   *
   * <pre>
   * Information about the user or users fulfilling the transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.User merchants = 13;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.User getMerchants(int index);
  /**
   *
   *
   * <pre>
   * Information about the user or users fulfilling the transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.User merchants = 13;
   * </code>
   */
  int getMerchantsCount();
  /**
   *
   *
   * <pre>
   * Information about the user or users fulfilling the transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.User merchants = 13;
   * </code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1beta1.TransactionData.UserOrBuilder>
      getMerchantsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information about the user or users fulfilling the transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.User merchants = 13;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.UserOrBuilder getMerchantsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Items purchased in this transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.Item items = 14;
   * </code>
   */
  java.util.List<com.google.recaptchaenterprise.v1beta1.TransactionData.Item> getItemsList();
  /**
   *
   *
   * <pre>
   * Items purchased in this transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.Item items = 14;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.Item getItems(int index);
  /**
   *
   *
   * <pre>
   * Items purchased in this transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.Item items = 14;
   * </code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * Items purchased in this transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.Item items = 14;
   * </code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1beta1.TransactionData.ItemOrBuilder>
      getItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Items purchased in this transaction.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.TransactionData.Item items = 14;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.ItemOrBuilder getItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Information about the payment gateway's response to the transaction.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.GatewayInfo gateway_info = 10;
   * </code>
   *
   * @return Whether the gatewayInfo field is set.
   */
  boolean hasGatewayInfo();
  /**
   *
   *
   * <pre>
   * Information about the payment gateway's response to the transaction.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.GatewayInfo gateway_info = 10;
   * </code>
   *
   * @return The gatewayInfo.
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.GatewayInfo getGatewayInfo();
  /**
   *
   *
   * <pre>
   * Information about the payment gateway's response to the transaction.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1beta1.TransactionData.GatewayInfo gateway_info = 10;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.TransactionData.GatewayInfoOrBuilder
      getGatewayInfoOrBuilder();
}
