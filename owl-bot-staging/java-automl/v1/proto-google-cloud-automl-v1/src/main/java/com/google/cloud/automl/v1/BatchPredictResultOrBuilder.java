// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/prediction_service.proto

package com.google.cloud.automl.v1;

public interface BatchPredictResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.BatchPredictResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * AutoML Vision Object Detection
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per image.
   * AutoML Video Intelligence Object Tracking
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per frame.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * AutoML Vision Object Detection
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per image.
   * AutoML Video Intelligence Object Tracking
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per frame.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * AutoML Vision Object Detection
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per image.
   * AutoML Video Intelligence Object Tracking
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per frame.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * AutoML Vision Object Detection
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per image.
   * AutoML Video Intelligence Object Tracking
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per frame.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */

  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Additional domain-specific prediction response metadata.
   * AutoML Vision Object Detection
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per image.
   * AutoML Video Intelligence Object Tracking
   * `max_bounding_box_count`
   * : (int64) The maximum number of bounding boxes returned per frame.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 1;</code>
   */

  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}