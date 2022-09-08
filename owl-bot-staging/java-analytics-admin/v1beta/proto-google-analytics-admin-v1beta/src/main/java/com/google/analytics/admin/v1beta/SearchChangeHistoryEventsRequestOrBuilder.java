// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

public interface SearchChangeHistoryEventsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.SearchChangeHistoryEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The account resource for which to return change history resources.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * Required. The account resource for which to return change history resources.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * Optional. Resource name for a child property. If set, only return changes
   * made to this property or its child resources.
   * </pre>
   *
   * <code>string property = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   * <pre>
   * Optional. Resource name for a child property. If set, only return changes
   * made to this property or its child resources.
   * </pre>
   *
   * <code>string property = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString
      getPropertyBytes();

  /**
   * <pre>
   * Optional. If set, only return changes if they are for a resource that matches at
   * least one of these types.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ChangeHistoryResourceType resource_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the resourceType.
   */
  java.util.List<com.google.analytics.admin.v1beta.ChangeHistoryResourceType> getResourceTypeList();
  /**
   * <pre>
   * Optional. If set, only return changes if they are for a resource that matches at
   * least one of these types.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ChangeHistoryResourceType resource_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of resourceType.
   */
  int getResourceTypeCount();
  /**
   * <pre>
   * Optional. If set, only return changes if they are for a resource that matches at
   * least one of these types.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ChangeHistoryResourceType resource_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The resourceType at the given index.
   */
  com.google.analytics.admin.v1beta.ChangeHistoryResourceType getResourceType(int index);
  /**
   * <pre>
   * Optional. If set, only return changes if they are for a resource that matches at
   * least one of these types.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ChangeHistoryResourceType resource_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the enum numeric values on the wire for resourceType.
   */
  java.util.List<java.lang.Integer>
  getResourceTypeValueList();
  /**
   * <pre>
   * Optional. If set, only return changes if they are for a resource that matches at
   * least one of these types.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ChangeHistoryResourceType resource_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of resourceType at the given index.
   */
  int getResourceTypeValue(int index);

  /**
   * <pre>
   * Optional. If set, only return changes that match one or more of these types of
   * actions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ActionType action = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the action.
   */
  java.util.List<com.google.analytics.admin.v1beta.ActionType> getActionList();
  /**
   * <pre>
   * Optional. If set, only return changes that match one or more of these types of
   * actions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ActionType action = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of action.
   */
  int getActionCount();
  /**
   * <pre>
   * Optional. If set, only return changes that match one or more of these types of
   * actions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ActionType action = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The action at the given index.
   */
  com.google.analytics.admin.v1beta.ActionType getAction(int index);
  /**
   * <pre>
   * Optional. If set, only return changes that match one or more of these types of
   * actions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ActionType action = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the enum numeric values on the wire for action.
   */
  java.util.List<java.lang.Integer>
  getActionValueList();
  /**
   * <pre>
   * Optional. If set, only return changes that match one or more of these types of
   * actions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ActionType action = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of action at the given index.
   */
  int getActionValue(int index);

  /**
   * <pre>
   * Optional. If set, only return changes if they are made by a user in this list.
   * </pre>
   *
   * <code>repeated string actor_email = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the actorEmail.
   */
  java.util.List<java.lang.String>
      getActorEmailList();
  /**
   * <pre>
   * Optional. If set, only return changes if they are made by a user in this list.
   * </pre>
   *
   * <code>repeated string actor_email = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of actorEmail.
   */
  int getActorEmailCount();
  /**
   * <pre>
   * Optional. If set, only return changes if they are made by a user in this list.
   * </pre>
   *
   * <code>repeated string actor_email = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The actorEmail at the given index.
   */
  java.lang.String getActorEmail(int index);
  /**
   * <pre>
   * Optional. If set, only return changes if they are made by a user in this list.
   * </pre>
   *
   * <code>repeated string actor_email = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the actorEmail at the given index.
   */
  com.google.protobuf.ByteString
      getActorEmailBytes(int index);

  /**
   * <pre>
   * Optional. If set, only return changes made after this time (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp earliest_change_time = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the earliestChangeTime field is set.
   */
  boolean hasEarliestChangeTime();
  /**
   * <pre>
   * Optional. If set, only return changes made after this time (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp earliest_change_time = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The earliestChangeTime.
   */
  com.google.protobuf.Timestamp getEarliestChangeTime();
  /**
   * <pre>
   * Optional. If set, only return changes made after this time (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp earliest_change_time = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEarliestChangeTimeOrBuilder();

  /**
   * <pre>
   * Optional. If set, only return changes made before this time (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp latest_change_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the latestChangeTime field is set.
   */
  boolean hasLatestChangeTime();
  /**
   * <pre>
   * Optional. If set, only return changes made before this time (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp latest_change_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The latestChangeTime.
   */
  com.google.protobuf.Timestamp getLatestChangeTime();
  /**
   * <pre>
   * Optional. If set, only return changes made before this time (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp latest_change_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLatestChangeTimeOrBuilder();

  /**
   * <pre>
   * Optional. The maximum number of ChangeHistoryEvent items to return.
   * The service may return fewer than this value, even if there are additional
   * pages. If unspecified, at most 50 items will be returned.
   * The maximum value is 200 (higher values will be coerced to the maximum).
   * </pre>
   *
   * <code>int32 page_size = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A page token, received from a previous `SearchChangeHistoryEvents` call.
   * Provide this to retrieve the subsequent page. When paginating, all other
   * parameters provided to `SearchChangeHistoryEvents` must match the call that
   * provided the page token.
   * </pre>
   *
   * <code>string page_token = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token, received from a previous `SearchChangeHistoryEvents` call.
   * Provide this to retrieve the subsequent page. When paginating, all other
   * parameters provided to `SearchChangeHistoryEvents` must match the call that
   * provided the page token.
   * </pre>
   *
   * <code>string page_token = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}