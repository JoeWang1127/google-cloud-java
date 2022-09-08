// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

package com.google.cloud.commerce.consumer.procurement.v1alpha1;

public interface LineItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The name of the offer can have either of these formats:
   * 'billingAccounts/{billing_account}/offers/{offer}',
   * or 'services/{service}/standardOffers/{offer}'.
   * </pre>
   *
   * <code>string offer = 13 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The offer.
   */
  java.lang.String getOffer();
  /**
   * <pre>
   * Optional. The name of the offer can have either of these formats:
   * 'billingAccounts/{billing_account}/offers/{offer}',
   * or 'services/{service}/standardOffers/{offer}'.
   * </pre>
   *
   * <code>string offer = 13 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for offer.
   */
  com.google.protobuf.ByteString
      getOfferBytes();

  /**
   * <pre>
   * Optional. User-provided parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Parameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter> 
      getParametersList();
  /**
   * <pre>
   * Optional. User-provided parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Parameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter getParameters(int index);
  /**
   * <pre>
   * Optional. User-provided parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Parameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Optional. User-provided parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Parameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.commerce.consumer.procurement.v1alpha1.ParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * Optional. User-provided parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Parameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.ParameterOrBuilder getParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Information about the subscription created, if applicable.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription subscription = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <pre>
   * Output only. Information about the subscription created, if applicable.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription subscription = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subscription.
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription getSubscription();
  /**
   * <pre>
   * Output only. Information about the subscription created, if applicable.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.Subscription subscription = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.SubscriptionOrBuilder getSubscriptionOrBuilder();
}