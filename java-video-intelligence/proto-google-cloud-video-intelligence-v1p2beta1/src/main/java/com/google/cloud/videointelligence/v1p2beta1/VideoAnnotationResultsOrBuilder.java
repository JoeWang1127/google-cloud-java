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
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1p2beta1;

public interface VideoAnnotationResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.VideoAnnotationResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString getInputUriBytes();

  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.LabelAnnotation>
      getSegmentLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.LabelAnnotation getSegmentLabelAnnotations(
      int index);
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  int getSegmentLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.LabelAnnotationOrBuilder>
      getSegmentLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.LabelAnnotationOrBuilder
      getSegmentLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.LabelAnnotation>
      getShotLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.LabelAnnotation getShotLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  int getShotLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.LabelAnnotationOrBuilder>
      getShotLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.LabelAnnotationOrBuilder
      getShotLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.LabelAnnotation>
      getFrameLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.LabelAnnotation getFrameLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  int getFrameLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.LabelAnnotationOrBuilder>
      getFrameLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.LabelAnnotationOrBuilder
      getFrameLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.VideoSegment shot_annotations = 6;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.VideoSegment>
      getShotAnnotationsList();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.VideoSegment shot_annotations = 6;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.VideoSegment getShotAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.VideoSegment shot_annotations = 6;
   * </code>
   */
  int getShotAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.VideoSegment shot_annotations = 6;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.VideoSegmentOrBuilder>
      getShotAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.VideoSegment shot_annotations = 6;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.VideoSegmentOrBuilder getShotAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p2beta1.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   *
   * @return Whether the explicitAnnotation field is set.
   */
  boolean hasExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p2beta1.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   *
   * @return The explicitAnnotation.
   */
  com.google.cloud.videointelligence.v1p2beta1.ExplicitContentAnnotation getExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p2beta1.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.ExplicitContentAnnotationOrBuilder
      getExplicitAnnotationOrBuilder();

  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextAnnotation text_annotations = 12;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextAnnotation>
      getTextAnnotationsList();
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextAnnotation text_annotations = 12;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.TextAnnotation getTextAnnotations(int index);
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextAnnotation text_annotations = 12;
   * </code>
   */
  int getTextAnnotationsCount();
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextAnnotation text_annotations = 12;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.TextAnnotationOrBuilder>
      getTextAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextAnnotation text_annotations = 12;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.TextAnnotationOrBuilder getTextAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation>
      getObjectAnnotationsList();
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation getObjectAnnotations(
      int index);
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  int getObjectAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotationOrBuilder>
      getObjectAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  com.google.cloud.videointelligence.v1p2beta1.ObjectTrackingAnnotationOrBuilder
      getObjectAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
