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
// source: google/cloud/securityposture/v1/org_policy_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securityposture.v1;

public interface CustomConstraintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.CustomConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Name of the constraint. This is unique within the organization.
   * Format of the name should be
   *
   * -
   * `organizations/{organization_id}/customConstraints/{custom_constraint_id}`
   *
   * Example: `organizations/123/customConstraints/custom.createOnlyE2TypeVms`
   *
   * The max length is 70 characters and the minimum length is 1. Note that the
   * prefix `organizations/{organization_id}/customConstraints/` is not counted.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Name of the constraint. This is unique within the organization.
   * Format of the name should be
   *
   * -
   * `organizations/{organization_id}/customConstraints/{custom_constraint_id}`
   *
   * Example: `organizations/123/customConstraints/custom.createOnlyE2TypeVms`
   *
   * The max length is 70 characters and the minimum length is 1. Note that the
   * prefix `organizations/{organization_id}/customConstraints/` is not counted.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The resource instance type on which this policy applies. Format
   * will be of the form : `&lt;canonical service name&gt;/&lt;type&gt;` Example:
   *
   *  - `compute.googleapis.com/Instance`.
   * </pre>
   *
   * <code>repeated string resource_types = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return A list containing the resourceTypes.
   */
  java.util.List<java.lang.String> getResourceTypesList();
  /**
   *
   *
   * <pre>
   * Immutable. The resource instance type on which this policy applies. Format
   * will be of the form : `&lt;canonical service name&gt;/&lt;type&gt;` Example:
   *
   *  - `compute.googleapis.com/Instance`.
   * </pre>
   *
   * <code>repeated string resource_types = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The count of resourceTypes.
   */
  int getResourceTypesCount();
  /**
   *
   *
   * <pre>
   * Immutable. The resource instance type on which this policy applies. Format
   * will be of the form : `&lt;canonical service name&gt;/&lt;type&gt;` Example:
   *
   *  - `compute.googleapis.com/Instance`.
   * </pre>
   *
   * <code>repeated string resource_types = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @param index The index of the element to return.
   * @return The resourceTypes at the given index.
   */
  java.lang.String getResourceTypes(int index);
  /**
   *
   *
   * <pre>
   * Immutable. The resource instance type on which this policy applies. Format
   * will be of the form : `&lt;canonical service name&gt;/&lt;type&gt;` Example:
   *
   *  - `compute.googleapis.com/Instance`.
   * </pre>
   *
   * <code>repeated string resource_types = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceTypes at the given index.
   */
  com.google.protobuf.ByteString getResourceTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * All the operations being applied for this constraint.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.CustomConstraint.MethodType method_types = 3;
   * </code>
   *
   * @return A list containing the methodTypes.
   */
  java.util.List<com.google.cloud.securityposture.v1.CustomConstraint.MethodType>
      getMethodTypesList();
  /**
   *
   *
   * <pre>
   * All the operations being applied for this constraint.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.CustomConstraint.MethodType method_types = 3;
   * </code>
   *
   * @return The count of methodTypes.
   */
  int getMethodTypesCount();
  /**
   *
   *
   * <pre>
   * All the operations being applied for this constraint.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.CustomConstraint.MethodType method_types = 3;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The methodTypes at the given index.
   */
  com.google.cloud.securityposture.v1.CustomConstraint.MethodType getMethodTypes(int index);
  /**
   *
   *
   * <pre>
   * All the operations being applied for this constraint.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.CustomConstraint.MethodType method_types = 3;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for methodTypes.
   */
  java.util.List<java.lang.Integer> getMethodTypesValueList();
  /**
   *
   *
   * <pre>
   * All the operations being applied for this constraint.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.CustomConstraint.MethodType method_types = 3;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of methodTypes at the given index.
   */
  int getMethodTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Org policy condition/expression. For example:
   * `resource.instanceName.matches("[production|test]_.*_(&#92;d)+")` or,
   * `resource.management.auto_upgrade == true`
   *
   * The max length of the condition is 1000 characters.
   * </pre>
   *
   * <code>string condition = 4;</code>
   *
   * @return The condition.
   */
  java.lang.String getCondition();
  /**
   *
   *
   * <pre>
   * Org policy condition/expression. For example:
   * `resource.instanceName.matches("[production|test]_.*_(&#92;d)+")` or,
   * `resource.management.auto_upgrade == true`
   *
   * The max length of the condition is 1000 characters.
   * </pre>
   *
   * <code>string condition = 4;</code>
   *
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString getConditionBytes();

  /**
   *
   *
   * <pre>
   * Allow or deny type.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.CustomConstraint.ActionType action_type = 5;</code>
   *
   * @return The enum numeric value on the wire for actionType.
   */
  int getActionTypeValue();
  /**
   *
   *
   * <pre>
   * Allow or deny type.
   * </pre>
   *
   * <code>.google.cloud.securityposture.v1.CustomConstraint.ActionType action_type = 5;</code>
   *
   * @return The actionType.
   */
  com.google.cloud.securityposture.v1.CustomConstraint.ActionType getActionType();

  /**
   *
   *
   * <pre>
   * One line display name for the UI.
   * The max length of the display_name is 200 characters.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * One line display name for the UI.
   * The max length of the display_name is 200 characters.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Detailed information about this custom policy constraint.
   * The max length of the description is 2000 characters.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Detailed information about this custom policy constraint.
   * The max length of the description is 2000 characters.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The last time this custom constraint was updated. This
   * represents the last time that the `CreateCustomConstraint` or
   * `UpdateCustomConstraint` RPC was called
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time this custom constraint was updated. This
   * represents the last time that the `CreateCustomConstraint` or
   * `UpdateCustomConstraint` RPC was called
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time this custom constraint was updated. This
   * represents the last time that the `CreateCustomConstraint` or
   * `UpdateCustomConstraint` RPC was called
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
