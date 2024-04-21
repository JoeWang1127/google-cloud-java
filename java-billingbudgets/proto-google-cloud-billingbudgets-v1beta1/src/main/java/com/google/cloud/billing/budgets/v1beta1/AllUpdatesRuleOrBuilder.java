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
// source: google/cloud/billing/budgets/v1beta1/budget_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.billing.budgets.v1beta1;

public interface AllUpdatesRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1beta1.AllUpdatesRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the Pub/Sub topic where budget related messages will
   * be published, in the form `projects/{project_id}/topics/{topic_id}`.
   * Updates are sent at regular intervals to the topic. The topic needs to be
   * created before the budget is created; see
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications
   * for more details.
   * Caller is expected to have
   * `pubsub.topics.setIamPolicy` permission on the topic when it's set for a
   * budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#permissions_required_for_this_task
   * for more details on Pub/Sub roles and permissions.
   * </pre>
   *
   * <code>string pubsub_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();
  /**
   *
   *
   * <pre>
   * Optional. The name of the Pub/Sub topic where budget related messages will
   * be published, in the form `projects/{project_id}/topics/{topic_id}`.
   * Updates are sent at regular intervals to the topic. The topic needs to be
   * created before the budget is created; see
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications
   * for more details.
   * Caller is expected to have
   * `pubsub.topics.setIamPolicy` permission on the topic when it's set for a
   * budget, otherwise, the API call will fail with PERMISSION_DENIED. See
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#permissions_required_for_this_task
   * for more details on Pub/Sub roles and permissions.
   * </pre>
   *
   * <code>string pubsub_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * Optional. Required when
   * [AllUpdatesRule.pubsub_topic][google.cloud.billing.budgets.v1beta1.AllUpdatesRule.pubsub_topic]
   * is set. The schema version of the notification sent to
   * [AllUpdatesRule.pubsub_topic][google.cloud.billing.budgets.v1beta1.AllUpdatesRule.pubsub_topic].
   * Only "1.0" is accepted. It represents the JSON schema as defined in
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format.
   * </pre>
   *
   * <code>string schema_version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The schemaVersion.
   */
  java.lang.String getSchemaVersion();
  /**
   *
   *
   * <pre>
   * Optional. Required when
   * [AllUpdatesRule.pubsub_topic][google.cloud.billing.budgets.v1beta1.AllUpdatesRule.pubsub_topic]
   * is set. The schema version of the notification sent to
   * [AllUpdatesRule.pubsub_topic][google.cloud.billing.budgets.v1beta1.AllUpdatesRule.pubsub_topic].
   * Only "1.0" is accepted. It represents the JSON schema as defined in
   * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format.
   * </pre>
   *
   * <code>string schema_version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for schemaVersion.
   */
  com.google.protobuf.ByteString getSchemaVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Targets to send notifications to when a threshold is exceeded.
   * This is in addition to default recipients who have billing account IAM
   * roles. The value is the full REST resource name of a monitoring
   * notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5
   * channels are allowed. See
   * https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients
   * for more details.
   * </pre>
   *
   * <code>
   * repeated string monitoring_notification_channels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the monitoringNotificationChannels.
   */
  java.util.List<java.lang.String> getMonitoringNotificationChannelsList();
  /**
   *
   *
   * <pre>
   * Optional. Targets to send notifications to when a threshold is exceeded.
   * This is in addition to default recipients who have billing account IAM
   * roles. The value is the full REST resource name of a monitoring
   * notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5
   * channels are allowed. See
   * https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients
   * for more details.
   * </pre>
   *
   * <code>
   * repeated string monitoring_notification_channels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of monitoringNotificationChannels.
   */
  int getMonitoringNotificationChannelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Targets to send notifications to when a threshold is exceeded.
   * This is in addition to default recipients who have billing account IAM
   * roles. The value is the full REST resource name of a monitoring
   * notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5
   * channels are allowed. See
   * https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients
   * for more details.
   * </pre>
   *
   * <code>
   * repeated string monitoring_notification_channels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The monitoringNotificationChannels at the given index.
   */
  java.lang.String getMonitoringNotificationChannels(int index);
  /**
   *
   *
   * <pre>
   * Optional. Targets to send notifications to when a threshold is exceeded.
   * This is in addition to default recipients who have billing account IAM
   * roles. The value is the full REST resource name of a monitoring
   * notification channel with the form
   * `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5
   * channels are allowed. See
   * https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients
   * for more details.
   * </pre>
   *
   * <code>
   * repeated string monitoring_notification_channels = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the monitoringNotificationChannels at the given index.
   */
  com.google.protobuf.ByteString getMonitoringNotificationChannelsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. When set to true, disables default notifications sent when a
   * threshold is exceeded. Default notifications are sent to those with Billing
   * Account Administrator and Billing Account User IAM roles for the target
   * account.
   * </pre>
   *
   * <code>bool disable_default_iam_recipients = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disableDefaultIamRecipients.
   */
  boolean getDisableDefaultIamRecipients();

  /**
   *
   *
   * <pre>
   * Optional. When set to true, and when the budget has a single project
   * configured, notifications will be sent to project level recipients of that
   * project. This field will be ignored if the budget has multiple or no
   * project configured.
   *
   * Currently, project level recipients are the users with `Owner` role on a
   * cloud project.
   * </pre>
   *
   * <code>bool enable_project_level_recipients = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enableProjectLevelRecipients.
   */
  boolean getEnableProjectLevelRecipients();
}
