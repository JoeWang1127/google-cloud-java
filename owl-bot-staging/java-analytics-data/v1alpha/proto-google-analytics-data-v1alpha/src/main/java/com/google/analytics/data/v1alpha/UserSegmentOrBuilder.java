// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface UserSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.UserSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Defines which users are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
   * @return Whether the userInclusionCriteria field is set.
   */
  boolean hasUserInclusionCriteria();
  /**
   * <pre>
   * Defines which users are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
   * @return The userInclusionCriteria.
   */
  com.google.analytics.data.v1alpha.UserSegmentCriteria getUserInclusionCriteria();
  /**
   * <pre>
   * Defines which users are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
   */
  com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder getUserInclusionCriteriaOrBuilder();

  /**
   * <pre>
   * Defines which users are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
   * @return Whether the exclusion field is set.
   */
  boolean hasExclusion();
  /**
   * <pre>
   * Defines which users are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
   * @return The exclusion.
   */
  com.google.analytics.data.v1alpha.UserSegmentExclusion getExclusion();
  /**
   * <pre>
   * Defines which users are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
   */
  com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder getExclusionOrBuilder();
}