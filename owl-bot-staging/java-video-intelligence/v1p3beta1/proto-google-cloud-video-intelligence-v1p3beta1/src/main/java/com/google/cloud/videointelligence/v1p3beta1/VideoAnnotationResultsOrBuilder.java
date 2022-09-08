// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface VideoAnnotationResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.VideoAnnotationResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video file location in
   * [Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   * <pre>
   * Video file location in
   * [Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString
      getInputUriBytes();

  /**
   * <pre>
   * Video segment on which the annotation is run.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.VideoSegment segment = 10;</code>
   * @return Whether the segment field is set.
   */
  boolean hasSegment();
  /**
   * <pre>
   * Video segment on which the annotation is run.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.VideoSegment segment = 10;</code>
   * @return The segment.
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegment getSegment();
  /**
   * <pre>
   * Video segment on which the annotation is run.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.VideoSegment segment = 10;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder getSegmentOrBuilder();

  /**
   * <pre>
   * Topical label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation> 
      getSegmentLabelAnnotationsList();
  /**
   * <pre>
   * Topical label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation getSegmentLabelAnnotations(int index);
  /**
   * <pre>
   * Topical label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  int getSegmentLabelAnnotationsCount();
  /**
   * <pre>
   * Topical label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder> 
      getSegmentLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Topical label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_label_annotations = 2;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder getSegmentLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Presence label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label. Compared to the
   * existing topical `segment_label_annotations`, this field presents more
   * fine-grained, segment-level labels detected in video content and is made
   * available only when the client sets `LabelDetectionConfig.model` to
   * "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_presence_label_annotations = 23;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation> 
      getSegmentPresenceLabelAnnotationsList();
  /**
   * <pre>
   * Presence label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label. Compared to the
   * existing topical `segment_label_annotations`, this field presents more
   * fine-grained, segment-level labels detected in video content and is made
   * available only when the client sets `LabelDetectionConfig.model` to
   * "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_presence_label_annotations = 23;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation getSegmentPresenceLabelAnnotations(int index);
  /**
   * <pre>
   * Presence label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label. Compared to the
   * existing topical `segment_label_annotations`, this field presents more
   * fine-grained, segment-level labels detected in video content and is made
   * available only when the client sets `LabelDetectionConfig.model` to
   * "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_presence_label_annotations = 23;</code>
   */
  int getSegmentPresenceLabelAnnotationsCount();
  /**
   * <pre>
   * Presence label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label. Compared to the
   * existing topical `segment_label_annotations`, this field presents more
   * fine-grained, segment-level labels detected in video content and is made
   * available only when the client sets `LabelDetectionConfig.model` to
   * "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_presence_label_annotations = 23;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder> 
      getSegmentPresenceLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Presence label annotations on video level or user-specified segment level.
   * There is exactly one element for each unique label. Compared to the
   * existing topical `segment_label_annotations`, this field presents more
   * fine-grained, segment-level labels detected in video content and is made
   * available only when the client sets `LabelDetectionConfig.model` to
   * "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation segment_presence_label_annotations = 23;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder getSegmentPresenceLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation> 
      getShotLabelAnnotationsList();
  /**
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation getShotLabelAnnotations(int index);
  /**
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  int getShotLabelAnnotationsCount();
  /**
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder> 
      getShotLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_label_annotations = 3;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder getShotLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Presence label annotations on shot level. There is exactly one element for
   * each unique label. Compared to the existing topical
   * `shot_label_annotations`, this field presents more fine-grained, shot-level
   * labels detected in video content and is made available only when the client
   * sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_presence_label_annotations = 24;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation> 
      getShotPresenceLabelAnnotationsList();
  /**
   * <pre>
   * Presence label annotations on shot level. There is exactly one element for
   * each unique label. Compared to the existing topical
   * `shot_label_annotations`, this field presents more fine-grained, shot-level
   * labels detected in video content and is made available only when the client
   * sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_presence_label_annotations = 24;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation getShotPresenceLabelAnnotations(int index);
  /**
   * <pre>
   * Presence label annotations on shot level. There is exactly one element for
   * each unique label. Compared to the existing topical
   * `shot_label_annotations`, this field presents more fine-grained, shot-level
   * labels detected in video content and is made available only when the client
   * sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_presence_label_annotations = 24;</code>
   */
  int getShotPresenceLabelAnnotationsCount();
  /**
   * <pre>
   * Presence label annotations on shot level. There is exactly one element for
   * each unique label. Compared to the existing topical
   * `shot_label_annotations`, this field presents more fine-grained, shot-level
   * labels detected in video content and is made available only when the client
   * sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_presence_label_annotations = 24;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder> 
      getShotPresenceLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Presence label annotations on shot level. There is exactly one element for
   * each unique label. Compared to the existing topical
   * `shot_label_annotations`, this field presents more fine-grained, shot-level
   * labels detected in video content and is made available only when the client
   * sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation shot_presence_label_annotations = 24;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder getShotPresenceLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation> 
      getFrameLabelAnnotationsList();
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotation getFrameLabelAnnotations(int index);
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  int getFrameLabelAnnotationsCount();
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder> 
      getFrameLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LabelAnnotation frame_label_annotations = 4;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LabelAnnotationOrBuilder getFrameLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation> 
      getFaceDetectionAnnotationsList();
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation getFaceDetectionAnnotations(int index);
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  int getFaceDetectionAnnotationsCount();
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotationOrBuilder> 
      getFaceDetectionAnnotationsOrBuilderList();
  /**
   * <pre>
   * Face detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation face_detection_annotations = 13;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotationOrBuilder getFaceDetectionAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 6;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.VideoSegment> 
      getShotAnnotationsList();
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 6;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegment getShotAnnotations(int index);
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 6;</code>
   */
  int getShotAnnotationsCount();
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 6;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder> 
      getShotAnnotationsOrBuilderList();
  /**
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.VideoSegment shot_annotations = 6;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.VideoSegmentOrBuilder getShotAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation explicit_annotation = 7;</code>
   * @return Whether the explicitAnnotation field is set.
   */
  boolean hasExplicitAnnotation();
  /**
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation explicit_annotation = 7;</code>
   * @return The explicitAnnotation.
   */
  com.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation getExplicitAnnotation();
  /**
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotation explicit_annotation = 7;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ExplicitContentAnnotationOrBuilder getExplicitAnnotationOrBuilder();

  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.SpeechTranscription> 
      getSpeechTranscriptionsList();
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.SpeechTranscription getSpeechTranscriptions(int index);
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  int getSpeechTranscriptionsCount();
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.SpeechTranscriptionOrBuilder> 
      getSpeechTranscriptionsOrBuilderList();
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.SpeechTranscription speech_transcriptions = 11;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.SpeechTranscriptionOrBuilder getSpeechTranscriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextAnnotation text_annotations = 12;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.TextAnnotation> 
      getTextAnnotationsList();
  /**
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextAnnotation text_annotations = 12;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.TextAnnotation getTextAnnotations(int index);
  /**
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextAnnotation text_annotations = 12;</code>
   */
  int getTextAnnotationsCount();
  /**
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextAnnotation text_annotations = 12;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TextAnnotationOrBuilder> 
      getTextAnnotationsOrBuilderList();
  /**
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.TextAnnotation text_annotations = 12;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.TextAnnotationOrBuilder getTextAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 14;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation> 
      getObjectAnnotationsList();
  /**
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 14;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation getObjectAnnotations(int index);
  /**
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 14;</code>
   */
  int getObjectAnnotationsCount();
  /**
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 14;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotationOrBuilder> 
      getObjectAnnotationsOrBuilderList();
  /**
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotation object_annotations = 14;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.ObjectTrackingAnnotationOrBuilder getObjectAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Annotations for list of logos detected, tracked and recognized in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation logo_recognition_annotations = 19;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation> 
      getLogoRecognitionAnnotationsList();
  /**
   * <pre>
   * Annotations for list of logos detected, tracked and recognized in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation logo_recognition_annotations = 19;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation getLogoRecognitionAnnotations(int index);
  /**
   * <pre>
   * Annotations for list of logos detected, tracked and recognized in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation logo_recognition_annotations = 19;</code>
   */
  int getLogoRecognitionAnnotationsCount();
  /**
   * <pre>
   * Annotations for list of logos detected, tracked and recognized in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation logo_recognition_annotations = 19;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotationOrBuilder> 
      getLogoRecognitionAnnotationsOrBuilderList();
  /**
   * <pre>
   * Annotations for list of logos detected, tracked and recognized in video.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotation logo_recognition_annotations = 19;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.LogoRecognitionAnnotationOrBuilder getLogoRecognitionAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Person detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation person_detection_annotations = 20;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation> 
      getPersonDetectionAnnotationsList();
  /**
   * <pre>
   * Person detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation person_detection_annotations = 20;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation getPersonDetectionAnnotations(int index);
  /**
   * <pre>
   * Person detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation person_detection_annotations = 20;</code>
   */
  int getPersonDetectionAnnotationsCount();
  /**
   * <pre>
   * Person detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation person_detection_annotations = 20;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotationOrBuilder> 
      getPersonDetectionAnnotationsOrBuilderList();
  /**
   * <pre>
   * Person detection annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotation person_detection_annotations = 20;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.PersonDetectionAnnotationOrBuilder getPersonDetectionAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * Celebrity recognition annotations.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.CelebrityRecognitionAnnotation celebrity_recognition_annotations = 21;</code>
   * @return Whether the celebrityRecognitionAnnotations field is set.
   */
  boolean hasCelebrityRecognitionAnnotations();
  /**
   * <pre>
   * Celebrity recognition annotations.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.CelebrityRecognitionAnnotation celebrity_recognition_annotations = 21;</code>
   * @return The celebrityRecognitionAnnotations.
   */
  com.google.cloud.videointelligence.v1p3beta1.CelebrityRecognitionAnnotation getCelebrityRecognitionAnnotations();
  /**
   * <pre>
   * Celebrity recognition annotations.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.CelebrityRecognitionAnnotation celebrity_recognition_annotations = 21;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.CelebrityRecognitionAnnotationOrBuilder getCelebrityRecognitionAnnotationsOrBuilder();

  /**
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}