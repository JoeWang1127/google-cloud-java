// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public interface SecurityProjectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.SecurityProjection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   * @return The details.
   */
  com.google.protobuf.Struct getDetails();
  /**
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getDetailsOrBuilder();
}