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
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p3beta1;

public interface FaceAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.FaceAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon around the face. The coordinates of the bounding box
   * are in the original image's scale, as returned in `ImageParams`.
   * The bounding box is computed to "frame" the face in accordance with human
   * expectations. It is based on the landmarker results.
   * Note that one or more x and/or y coordinates may not be generated in the
   * `BoundingPoly` (the polygon will be unbounded) if only a partial face
   * appears in the image to be annotated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 1;</code>
   *
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the face. The coordinates of the bounding box
   * are in the original image's scale, as returned in `ImageParams`.
   * The bounding box is computed to "frame" the face in accordance with human
   * expectations. It is based on the landmarker results.
   * Note that one or more x and/or y coordinates may not be generated in the
   * `BoundingPoly` (the polygon will be unbounded) if only a partial face
   * appears in the image to be annotated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 1;</code>
   *
   * @return The boundingPoly.
   */
  com.google.cloud.vision.v1p3beta1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the face. The coordinates of the bounding box
   * are in the original image's scale, as returned in `ImageParams`.
   * The bounding box is computed to "frame" the face in accordance with human
   * expectations. It is based on the landmarker results.
   * Note that one or more x and/or y coordinates may not be generated in the
   * `BoundingPoly` (the polygon will be unbounded) if only a partial face
   * appears in the image to be annotated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * The `fd_bounding_poly` bounding polygon is tighter than the
   * `boundingPoly`, and encloses only the skin part of the face. Typically, it
   * is used to eliminate the face from any image analysis that detects the
   * "amount of skin" visible in an image. It is not based on the
   * landmarker results, only on the initial face detection, hence
   * the &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly fd_bounding_poly = 2;</code>
   *
   * @return Whether the fdBoundingPoly field is set.
   */
  boolean hasFdBoundingPoly();
  /**
   *
   *
   * <pre>
   * The `fd_bounding_poly` bounding polygon is tighter than the
   * `boundingPoly`, and encloses only the skin part of the face. Typically, it
   * is used to eliminate the face from any image analysis that detects the
   * "amount of skin" visible in an image. It is not based on the
   * landmarker results, only on the initial face detection, hence
   * the &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly fd_bounding_poly = 2;</code>
   *
   * @return The fdBoundingPoly.
   */
  com.google.cloud.vision.v1p3beta1.BoundingPoly getFdBoundingPoly();
  /**
   *
   *
   * <pre>
   * The `fd_bounding_poly` bounding polygon is tighter than the
   * `boundingPoly`, and encloses only the skin part of the face. Typically, it
   * is used to eliminate the face from any image analysis that detects the
   * "amount of skin" visible in an image. It is not based on the
   * landmarker results, only on the initial face detection, hence
   * the &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BoundingPoly fd_bounding_poly = 2;</code>
   */
  com.google.cloud.vision.v1p3beta1.BoundingPolyOrBuilder getFdBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark> getLandmarksList();
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  com.google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark getLandmarks(int index);
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  int getLandmarksCount();
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.FaceAnnotation.LandmarkOrBuilder>
      getLandmarksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  com.google.cloud.vision.v1p3beta1.FaceAnnotation.LandmarkOrBuilder getLandmarksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Roll angle, which indicates the amount of clockwise/anti-clockwise rotation
   * of the face relative to the image vertical about the axis perpendicular to
   * the face. Range [-180,180].
   * </pre>
   *
   * <code>float roll_angle = 4;</code>
   *
   * @return The rollAngle.
   */
  float getRollAngle();

  /**
   *
   *
   * <pre>
   * Yaw angle, which indicates the leftward/rightward angle that the face is
   * pointing relative to the vertical plane perpendicular to the image. Range
   * [-180,180].
   * </pre>
   *
   * <code>float pan_angle = 5;</code>
   *
   * @return The panAngle.
   */
  float getPanAngle();

  /**
   *
   *
   * <pre>
   * Pitch angle, which indicates the upwards/downwards angle that the face is
   * pointing relative to the image's horizontal plane. Range [-180,180].
   * </pre>
   *
   * <code>float tilt_angle = 6;</code>
   *
   * @return The tiltAngle.
   */
  float getTiltAngle();

  /**
   *
   *
   * <pre>
   * Detection confidence. Range [0, 1].
   * </pre>
   *
   * <code>float detection_confidence = 7;</code>
   *
   * @return The detectionConfidence.
   */
  float getDetectionConfidence();

  /**
   *
   *
   * <pre>
   * Face landmarking confidence. Range [0, 1].
   * </pre>
   *
   * <code>float landmarking_confidence = 8;</code>
   *
   * @return The landmarkingConfidence.
   */
  float getLandmarkingConfidence();

  /**
   *
   *
   * <pre>
   * Joy likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood joy_likelihood = 9;</code>
   *
   * @return The enum numeric value on the wire for joyLikelihood.
   */
  int getJoyLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Joy likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood joy_likelihood = 9;</code>
   *
   * @return The joyLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getJoyLikelihood();

  /**
   *
   *
   * <pre>
   * Sorrow likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood sorrow_likelihood = 10;</code>
   *
   * @return The enum numeric value on the wire for sorrowLikelihood.
   */
  int getSorrowLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Sorrow likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood sorrow_likelihood = 10;</code>
   *
   * @return The sorrowLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getSorrowLikelihood();

  /**
   *
   *
   * <pre>
   * Anger likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood anger_likelihood = 11;</code>
   *
   * @return The enum numeric value on the wire for angerLikelihood.
   */
  int getAngerLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Anger likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood anger_likelihood = 11;</code>
   *
   * @return The angerLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getAngerLikelihood();

  /**
   *
   *
   * <pre>
   * Surprise likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood surprise_likelihood = 12;</code>
   *
   * @return The enum numeric value on the wire for surpriseLikelihood.
   */
  int getSurpriseLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Surprise likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood surprise_likelihood = 12;</code>
   *
   * @return The surpriseLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getSurpriseLikelihood();

  /**
   *
   *
   * <pre>
   * Under-exposed likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood under_exposed_likelihood = 13;</code>
   *
   * @return The enum numeric value on the wire for underExposedLikelihood.
   */
  int getUnderExposedLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Under-exposed likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood under_exposed_likelihood = 13;</code>
   *
   * @return The underExposedLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getUnderExposedLikelihood();

  /**
   *
   *
   * <pre>
   * Blurred likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood blurred_likelihood = 14;</code>
   *
   * @return The enum numeric value on the wire for blurredLikelihood.
   */
  int getBlurredLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Blurred likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood blurred_likelihood = 14;</code>
   *
   * @return The blurredLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getBlurredLikelihood();

  /**
   *
   *
   * <pre>
   * Headwear likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood headwear_likelihood = 15;</code>
   *
   * @return The enum numeric value on the wire for headwearLikelihood.
   */
  int getHeadwearLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Headwear likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Likelihood headwear_likelihood = 15;</code>
   *
   * @return The headwearLikelihood.
   */
  com.google.cloud.vision.v1p3beta1.Likelihood getHeadwearLikelihood();
}
