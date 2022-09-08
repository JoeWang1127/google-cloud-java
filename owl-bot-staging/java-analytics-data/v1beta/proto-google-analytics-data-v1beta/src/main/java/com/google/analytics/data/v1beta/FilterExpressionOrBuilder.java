// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

public interface FilterExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.FilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpressionList and_group = 1;</code>
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();
  /**
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpressionList and_group = 1;</code>
   * @return The andGroup.
   */
  com.google.analytics.data.v1beta.FilterExpressionList getAndGroup();
  /**
   * <pre>
   * The FilterExpressions in and_group have an AND relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionListOrBuilder getAndGroupOrBuilder();

  /**
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpressionList or_group = 2;</code>
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();
  /**
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpressionList or_group = 2;</code>
   * @return The orGroup.
   */
  com.google.analytics.data.v1beta.FilterExpressionList getOrGroup();
  /**
   * <pre>
   * The FilterExpressions in or_group have an OR relationship.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionListOrBuilder getOrGroupOrBuilder();

  /**
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression not_expression = 3;</code>
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();
  /**
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression not_expression = 3;</code>
   * @return The notExpression.
   */
  com.google.analytics.data.v1beta.FilterExpression getNotExpression();
  /**
   * <pre>
   * The FilterExpression is NOT of not_expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.FilterExpression not_expression = 3;</code>
   */
  com.google.analytics.data.v1beta.FilterExpressionOrBuilder getNotExpressionOrBuilder();

  /**
   * <pre>
   * A primitive filter.
   * All fields in filter in same FilterExpression needs to be either all
   * dimensions or metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.Filter filter = 4;</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * A primitive filter.
   * All fields in filter in same FilterExpression needs to be either all
   * dimensions or metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.Filter filter = 4;</code>
   * @return The filter.
   */
  com.google.analytics.data.v1beta.Filter getFilter();
  /**
   * <pre>
   * A primitive filter.
   * All fields in filter in same FilterExpression needs to be either all
   * dimensions or metrics.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.Filter filter = 4;</code>
   */
  com.google.analytics.data.v1beta.FilterOrBuilder getFilterOrBuilder();

  public com.google.analytics.data.v1beta.FilterExpression.ExprCase getExprCase();
}