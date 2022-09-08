// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

public interface SubmissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.Submission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The URI that is being reported for phishing content to be analyzed.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Required. The URI that is being reported for phishing content to be analyzed.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}