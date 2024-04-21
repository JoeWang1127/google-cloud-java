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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1p3beta1;

public interface StreamingVideoAnnotationResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.StreamingVideoAnnotationResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Shot annotation results. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 1;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoSegment>
      getShotAnnotationsList();
  /**
   *
   *
   * <pre>
   * Shot annotation results. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegment getShotAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Shot annotation results. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 1;
   * </code>
   */
  int getShotAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Shot annotation results. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder>
      getShotAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Shot annotation results. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder getShotAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Label annotation results.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation label_annotations = 2;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation>
      getLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotation results.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation getLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotation results.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation label_annotations = 2;
   * </code>
   */
  int getLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotation results.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation label_annotations = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder>
      getLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotation results.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder
      getLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Explicit content annotation results.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation explicit_annotation = 3;
   * </code>
   *
   * @return Whether the explicitAnnotation field is set.
   */
  boolean hasExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation results.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation explicit_annotation = 3;
   * </code>
   *
   * @return The explicitAnnotation.
   */
  com.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation getExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation results.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation explicit_annotation = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotationOrBuilder
      getExplicitAnnotationOrBuilder();

  /**
   *
   *
   * <pre>
   * Object tracking results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 4;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation>
      getObjectAnnotationsList();
  /**
   *
   *
   * <pre>
   * Object tracking results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation getObjectAnnotations(
      int index);
  /**
   *
   *
   * <pre>
   * Object tracking results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 4;
   * </code>
   */
  int getObjectAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Object tracking results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 4;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotationOrBuilder>
      getObjectAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Object tracking results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotationOrBuilder
      getObjectAnnotationsOrBuilder(int index);
}
