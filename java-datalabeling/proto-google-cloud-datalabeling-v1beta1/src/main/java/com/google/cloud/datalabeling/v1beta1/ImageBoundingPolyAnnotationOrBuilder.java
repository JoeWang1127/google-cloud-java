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
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface ImageBoundingPolyAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.cloud.datalabeling.v1beta1.BoundingPoly bounding_poly = 2;</code>
   *
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.BoundingPoly bounding_poly = 2;</code>
   *
   * @return The boundingPoly.
   */
  com.google.cloud.datalabeling.v1beta1.BoundingPoly getBoundingPoly();
  /** <code>.google.cloud.datalabeling.v1beta1.BoundingPoly bounding_poly = 2;</code> */
  com.google.cloud.datalabeling.v1beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   * <code>.google.cloud.datalabeling.v1beta1.NormalizedBoundingPoly normalized_bounding_poly = 3;
   * </code>
   *
   * @return Whether the normalizedBoundingPoly field is set.
   */
  boolean hasNormalizedBoundingPoly();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.NormalizedBoundingPoly normalized_bounding_poly = 3;
   * </code>
   *
   * @return The normalizedBoundingPoly.
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedBoundingPoly getNormalizedBoundingPoly();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.NormalizedBoundingPoly normalized_bounding_poly = 3;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedBoundingPolyOrBuilder
      getNormalizedBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * Label of object in this bounding polygon.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return Whether the annotationSpec field is set.
   */
  boolean hasAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of object in this bounding polygon.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return The annotationSpec.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of object in this bounding polygon.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();

  com.google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotation.BoundedAreaCase
      getBoundedAreaCase();
}
