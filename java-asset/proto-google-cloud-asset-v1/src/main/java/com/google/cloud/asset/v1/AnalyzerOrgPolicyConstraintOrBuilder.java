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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1;

public interface AnalyzerOrgPolicyConstraintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzerOrgPolicyConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The definition of the canned constraint defined by Google.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.Constraint google_defined_constraint = 1;
   * </code>
   *
   * @return Whether the googleDefinedConstraint field is set.
   */
  boolean hasGoogleDefinedConstraint();
  /**
   *
   *
   * <pre>
   * The definition of the canned constraint defined by Google.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.Constraint google_defined_constraint = 1;
   * </code>
   *
   * @return The googleDefinedConstraint.
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.Constraint getGoogleDefinedConstraint();
  /**
   *
   *
   * <pre>
   * The definition of the canned constraint defined by Google.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.Constraint google_defined_constraint = 1;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.ConstraintOrBuilder
      getGoogleDefinedConstraintOrBuilder();

  /**
   *
   *
   * <pre>
   * The definition of the custom constraint.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.CustomConstraint custom_constraint = 2;
   * </code>
   *
   * @return Whether the customConstraint field is set.
   */
  boolean hasCustomConstraint();
  /**
   *
   *
   * <pre>
   * The definition of the custom constraint.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.CustomConstraint custom_constraint = 2;
   * </code>
   *
   * @return The customConstraint.
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.CustomConstraint getCustomConstraint();
  /**
   *
   *
   * <pre>
   * The definition of the custom constraint.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.CustomConstraint custom_constraint = 2;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.CustomConstraintOrBuilder
      getCustomConstraintOrBuilder();

  com.google.cloud.asset.v1.AnalyzerOrgPolicyConstraint.ConstraintDefinitionCase
      getConstraintDefinitionCase();
}
