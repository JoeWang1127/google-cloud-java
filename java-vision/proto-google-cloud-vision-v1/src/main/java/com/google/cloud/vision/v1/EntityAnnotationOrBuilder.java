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
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface EntityAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.EntityAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string mid = 1;</code>
   *
   * @return The mid.
   */
  java.lang.String getMid();
  /**
   *
   *
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string mid = 1;</code>
   *
   * @return The bytes for mid.
   */
  com.google.protobuf.ByteString getMidBytes();

  /**
   *
   *
   * <pre>
   * The language code for the locale in which the entity textual
   * `description` is expressed.
   * </pre>
   *
   * <code>string locale = 2;</code>
   *
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   *
   *
   * <pre>
   * The language code for the locale in which the entity textual
   * `description` is expressed.
   * </pre>
   *
   * <code>string locale = 2;</code>
   *
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString getLocaleBytes();

  /**
   *
   *
   * <pre>
   * Entity textual description, expressed in its `locale` language.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Entity textual description, expressed in its `locale` language.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Overall score of the result. Range [0, 1].
   * </pre>
   *
   * <code>float score = 4;</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * **Deprecated. Use `score` instead.**
   * The accuracy of the entity detection in an image.
   * For example, for an image in which the "Eiffel Tower" entity is detected,
   * this field represents the confidence that there is a tower in the query
   * image. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.vision.v1.EntityAnnotation.confidence is deprecated. See
   *     google/cloud/vision/v1/image_annotator.proto;l=510
   * @return The confidence.
   */
  @java.lang.Deprecated
  float getConfidence();

  /**
   *
   *
   * <pre>
   * The relevancy of the ICA (Image Content Annotation) label to the
   * image. For example, the relevancy of "tower" is likely higher to an image
   * containing the detected "Eiffel Tower" than to an image containing a
   * detected distant towering building, even though the confidence that
   * there is a tower in each image may be the same. Range [0, 1].
   * </pre>
   *
   * <code>float topicality = 6;</code>
   *
   * @return The topicality.
   */
  float getTopicality();

  /**
   *
   *
   * <pre>
   * Image region to which this entity belongs. Not produced
   * for `LABEL_DETECTION` features.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 7;</code>
   *
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * Image region to which this entity belongs. Not produced
   * for `LABEL_DETECTION` features.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 7;</code>
   *
   * @return The boundingPoly.
   */
  com.google.cloud.vision.v1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * Image region to which this entity belongs. Not produced
   * for `LABEL_DETECTION` features.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 7;</code>
   */
  com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.LocationInfo locations = 8;</code>
   */
  java.util.List<com.google.cloud.vision.v1.LocationInfo> getLocationsList();
  /**
   *
   *
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.LocationInfo locations = 8;</code>
   */
  com.google.cloud.vision.v1.LocationInfo getLocations(int index);
  /**
   *
   *
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.LocationInfo locations = 8;</code>
   */
  int getLocationsCount();
  /**
   *
   *
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.LocationInfo locations = 8;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.LocationInfoOrBuilder>
      getLocationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.LocationInfo locations = 8;</code>
   */
  com.google.cloud.vision.v1.LocationInfoOrBuilder getLocationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Property properties = 9;</code>
   */
  java.util.List<com.google.cloud.vision.v1.Property> getPropertiesList();
  /**
   *
   *
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Property properties = 9;</code>
   */
  com.google.cloud.vision.v1.Property getProperties(int index);
  /**
   *
   *
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Property properties = 9;</code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Property properties = 9;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.PropertyOrBuilder>
      getPropertiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Property properties = 9;</code>
   */
  com.google.cloud.vision.v1.PropertyOrBuilder getPropertiesOrBuilder(int index);
}
