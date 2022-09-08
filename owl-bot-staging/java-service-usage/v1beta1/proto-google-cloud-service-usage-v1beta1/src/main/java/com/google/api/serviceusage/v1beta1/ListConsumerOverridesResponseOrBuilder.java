// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

public interface ListConsumerOverridesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.ListConsumerOverridesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Consumer overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> 
      getOverridesList();
  /**
   * <pre>
   * Consumer overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverride getOverrides(int index);
  /**
   * <pre>
   * Consumer overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  int getOverridesCount();
  /**
   * <pre>
   * Consumer overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder> 
      getOverridesOrBuilderList();
  /**
   * <pre>
   * Consumer overrides on this limit.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getOverridesOrBuilder(
      int index);

  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}