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
// source: google/cloud/automl/v1/annotation_payload.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.automl.v1;

public interface AnnotationPayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.AnnotationPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   *
   * @return Whether the translation field is set.
   */
  boolean hasTranslation();
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   *
   * @return The translation.
   */
  com.google.cloud.automl.v1.TranslationAnnotation getTranslation();
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  com.google.cloud.automl.v1.TranslationAnnotationOrBuilder getTranslationOrBuilder();

  /**
   *
   *
   * <pre>
   * Annotation details for content or image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationAnnotation classification = 3;</code>
   *
   * @return Whether the classification field is set.
   */
  boolean hasClassification();
  /**
   *
   *
   * <pre>
   * Annotation details for content or image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationAnnotation classification = 3;</code>
   *
   * @return The classification.
   */
  com.google.cloud.automl.v1.ClassificationAnnotation getClassification();
  /**
   *
   *
   * <pre>
   * Annotation details for content or image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ClassificationAnnotation classification = 3;</code>
   */
  com.google.cloud.automl.v1.ClassificationAnnotationOrBuilder getClassificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Annotation details for image object detection.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageObjectDetectionAnnotation image_object_detection = 4;</code>
   *
   * @return Whether the imageObjectDetection field is set.
   */
  boolean hasImageObjectDetection();
  /**
   *
   *
   * <pre>
   * Annotation details for image object detection.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageObjectDetectionAnnotation image_object_detection = 4;</code>
   *
   * @return The imageObjectDetection.
   */
  com.google.cloud.automl.v1.ImageObjectDetectionAnnotation getImageObjectDetection();
  /**
   *
   *
   * <pre>
   * Annotation details for image object detection.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageObjectDetectionAnnotation image_object_detection = 4;</code>
   */
  com.google.cloud.automl.v1.ImageObjectDetectionAnnotationOrBuilder
      getImageObjectDetectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Annotation details for text extraction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextExtractionAnnotation text_extraction = 6;</code>
   *
   * @return Whether the textExtraction field is set.
   */
  boolean hasTextExtraction();
  /**
   *
   *
   * <pre>
   * Annotation details for text extraction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextExtractionAnnotation text_extraction = 6;</code>
   *
   * @return The textExtraction.
   */
  com.google.cloud.automl.v1.TextExtractionAnnotation getTextExtraction();
  /**
   *
   *
   * <pre>
   * Annotation details for text extraction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextExtractionAnnotation text_extraction = 6;</code>
   */
  com.google.cloud.automl.v1.TextExtractionAnnotationOrBuilder getTextExtractionOrBuilder();

  /**
   *
   *
   * <pre>
   * Annotation details for text sentiment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSentimentAnnotation text_sentiment = 7;</code>
   *
   * @return Whether the textSentiment field is set.
   */
  boolean hasTextSentiment();
  /**
   *
   *
   * <pre>
   * Annotation details for text sentiment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSentimentAnnotation text_sentiment = 7;</code>
   *
   * @return The textSentiment.
   */
  com.google.cloud.automl.v1.TextSentimentAnnotation getTextSentiment();
  /**
   *
   *
   * <pre>
   * Annotation details for text sentiment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSentimentAnnotation text_sentiment = 7;</code>
   */
  com.google.cloud.automl.v1.TextSentimentAnnotationOrBuilder getTextSentimentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only . The resource ID of the annotation spec that
   * this annotation pertains to. The annotation spec comes from either an
   * ancestor dataset, or the dataset that was used to train the model in use.
   * </pre>
   *
   * <code>string annotation_spec_id = 1;</code>
   *
   * @return The annotationSpecId.
   */
  java.lang.String getAnnotationSpecId();
  /**
   *
   *
   * <pre>
   * Output only . The resource ID of the annotation spec that
   * this annotation pertains to. The annotation spec comes from either an
   * ancestor dataset, or the dataset that was used to train the model in use.
   * </pre>
   *
   * <code>string annotation_spec_id = 1;</code>
   *
   * @return The bytes for annotationSpecId.
   */
  com.google.protobuf.ByteString getAnnotationSpecIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The value of
   * [display_name][google.cloud.automl.v1.AnnotationSpec.display_name]
   * when the model was trained. Because this field returns a value at model
   * training time, for different models trained using the same dataset, the
   * returned value could be different as model owner could update the
   * `display_name` between any two model training.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The value of
   * [display_name][google.cloud.automl.v1.AnnotationSpec.display_name]
   * when the model was trained. Because this field returns a value at model
   * training time, for different models trained using the same dataset, the
   * returned value could be different as model owner could update the
   * `display_name` between any two model training.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  com.google.cloud.automl.v1.AnnotationPayload.DetailCase getDetailCase();
}
