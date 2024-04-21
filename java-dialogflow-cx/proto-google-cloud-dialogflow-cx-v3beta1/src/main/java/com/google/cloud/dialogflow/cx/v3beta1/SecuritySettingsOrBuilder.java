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
// source: google/cloud/dialogflow/cx/v3beta1/security_settings.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface SecuritySettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.SecuritySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the settings.
   * Required for the
   * [SecuritySettingsService.UpdateSecuritySettings][google.cloud.dialogflow.cx.v3beta1.SecuritySettingsService.UpdateSecuritySettings]
   * method.
   * [SecuritySettingsService.CreateSecuritySettings][google.cloud.dialogflow.cx.v3beta1.SecuritySettingsService.CreateSecuritySettings]
   * populates the name automatically. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of the settings.
   * Required for the
   * [SecuritySettingsService.UpdateSecuritySettings][google.cloud.dialogflow.cx.v3beta1.SecuritySettingsService.UpdateSecuritySettings]
   * method.
   * [SecuritySettingsService.CreateSecuritySettings][google.cloud.dialogflow.cx.v3beta1.SecuritySettingsService.CreateSecuritySettings]
   * populates the name automatically. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the security settings, unique within
   * the location.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the security settings, unique within
   * the location.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Strategy that defines how we do redaction.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RedactionStrategy redaction_strategy = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for redactionStrategy.
   */
  int getRedactionStrategyValue();
  /**
   *
   *
   * <pre>
   * Strategy that defines how we do redaction.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RedactionStrategy redaction_strategy = 3;
   * </code>
   *
   * @return The redactionStrategy.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RedactionStrategy getRedactionStrategy();

  /**
   *
   *
   * <pre>
   * Defines the data for which Dialogflow applies redaction. Dialogflow does
   * not redact data that it does not have access to – for example, Cloud
   * logging.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RedactionScope redaction_scope = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for redactionScope.
   */
  int getRedactionScopeValue();
  /**
   *
   *
   * <pre>
   * Defines the data for which Dialogflow applies redaction. Dialogflow does
   * not redact data that it does not have access to – for example, Cloud
   * logging.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RedactionScope redaction_scope = 4;
   * </code>
   *
   * @return The redactionScope.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RedactionScope getRedactionScope();

  /**
   *
   *
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this
   * template to define inspect base settings.
   *
   * The `DLP Inspect Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   *
   * If empty, we use the default DLP inspect config.
   *
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/inspectTemplates/&lt;Template
   * ID&gt;` OR `organizations/&lt;Organization ID&gt;/locations/&lt;Location
   * ID&gt;/inspectTemplates/&lt;Template ID&gt;`
   *
   * Note: `inspect_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string inspect_template = 9 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The inspectTemplate.
   */
  java.lang.String getInspectTemplate();
  /**
   *
   *
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this
   * template to define inspect base settings.
   *
   * The `DLP Inspect Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   *
   * If empty, we use the default DLP inspect config.
   *
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/inspectTemplates/&lt;Template
   * ID&gt;` OR `organizations/&lt;Organization ID&gt;/locations/&lt;Location
   * ID&gt;/inspectTemplates/&lt;Template ID&gt;`
   *
   * Note: `inspect_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string inspect_template = 9 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for inspectTemplate.
   */
  com.google.protobuf.ByteString getInspectTemplateBytes();

  /**
   *
   *
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this
   * template to define de-identification configuration for the content.
   *
   * The `DLP De-identify Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   *
   * If empty, Dialogflow replaces sensitive info with `[redacted]` text.
   *
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/deidentifyTemplates/&lt;Template ID&gt;` OR `organizations/&lt;Organization
   * ID&gt;/locations/&lt;Location ID&gt;/deidentifyTemplates/&lt;Template ID&gt;`
   *
   * Note: `deidentify_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string deidentify_template = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The deidentifyTemplate.
   */
  java.lang.String getDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this
   * template to define de-identification configuration for the content.
   *
   * The `DLP De-identify Templates Reader` role is needed on the Dialogflow
   * service identity service account (has the form
   * `service-PROJECT_NUMBER&#64;gcp-sa-dialogflow.iam.gserviceaccount.com`)
   * for your agent's project.
   *
   * If empty, Dialogflow replaces sensitive info with `[redacted]` text.
   *
   * The template name will have one of the following formats:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/deidentifyTemplates/&lt;Template ID&gt;` OR `organizations/&lt;Organization
   * ID&gt;/locations/&lt;Location ID&gt;/deidentifyTemplates/&lt;Template ID&gt;`
   *
   * Note: `deidentify_template` must be located in the same region as the
   * `SecuritySettings`.
   * </pre>
   *
   * <code>string deidentify_template = 17 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for deidentifyTemplate.
   */
  com.google.protobuf.ByteString getDeidentifyTemplateBytes();

  /**
   *
   *
   * <pre>
   * Retains data in interaction logging for the specified number of days.
   * This does not apply to Cloud logging, which is owned by the user - not
   * Dialogflow.
   * User must set a value lower than Dialogflow's default 365d TTL (30 days
   * for Agent Assist traffic), higher value will be ignored and use default.
   * Setting a value higher than that has no effect. A missing value or
   * setting to 0 also means we use default TTL.
   * When data retention configuration is changed, it only applies to the data
   * created after the change; the TTL of existing data created before the
   * change stays intact.
   * </pre>
   *
   * <code>int32 retention_window_days = 6;</code>
   *
   * @return Whether the retentionWindowDays field is set.
   */
  boolean hasRetentionWindowDays();
  /**
   *
   *
   * <pre>
   * Retains data in interaction logging for the specified number of days.
   * This does not apply to Cloud logging, which is owned by the user - not
   * Dialogflow.
   * User must set a value lower than Dialogflow's default 365d TTL (30 days
   * for Agent Assist traffic), higher value will be ignored and use default.
   * Setting a value higher than that has no effect. A missing value or
   * setting to 0 also means we use default TTL.
   * When data retention configuration is changed, it only applies to the data
   * created after the change; the TTL of existing data created before the
   * change stays intact.
   * </pre>
   *
   * <code>int32 retention_window_days = 6;</code>
   *
   * @return The retentionWindowDays.
   */
  int getRetentionWindowDays();

  /**
   *
   *
   * <pre>
   * Specifies the retention behavior defined by
   * [SecuritySettings.RetentionStrategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy retention_strategy = 7;
   * </code>
   *
   * @return Whether the retentionStrategy field is set.
   */
  boolean hasRetentionStrategy();
  /**
   *
   *
   * <pre>
   * Specifies the retention behavior defined by
   * [SecuritySettings.RetentionStrategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy retention_strategy = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for retentionStrategy.
   */
  int getRetentionStrategyValue();
  /**
   *
   *
   * <pre>
   * Specifies the retention behavior defined by
   * [SecuritySettings.RetentionStrategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy retention_strategy = 7;
   * </code>
   *
   * @return The retentionStrategy.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.RetentionStrategy getRetentionStrategy();

  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @return A list containing the purgeDataTypes.
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType>
      getPurgeDataTypesList();
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @return The count of purgeDataTypes.
   */
  int getPurgeDataTypesCount();
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The purgeDataTypes at the given index.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType getPurgeDataTypes(
      int index);
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for purgeDataTypes.
   */
  java.util.List<java.lang.Integer> getPurgeDataTypesValueList();
  /**
   *
   *
   * <pre>
   * List of types of data to remove when retention settings triggers purge.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.PurgeDataType purge_data_types = 8;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of purgeDataTypes at the given index.
   */
  int getPurgeDataTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Controls audio export settings for post-conversation analytics when
   * ingesting audio to conversations via [Participants.AnalyzeContent][] or
   * [Participants.StreamingAnalyzeContent][].
   *
   * If
   * [retention_strategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.retention_strategy]
   * is set to REMOVE_AFTER_CONVERSATION or [audio_export_settings.gcs_bucket][]
   * is empty, audio export is disabled.
   *
   * If audio export is enabled, audio is recorded and saved to
   * [audio_export_settings.gcs_bucket][], subject to retention policy of
   * [audio_export_settings.gcs_bucket][].
   *
   * This setting won't effect audio input for implicit sessions via
   * [Sessions.DetectIntent][google.cloud.dialogflow.cx.v3beta1.Sessions.DetectIntent]
   * or
   * [Sessions.StreamingDetectIntent][google.cloud.dialogflow.cx.v3beta1.Sessions.StreamingDetectIntent].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.AudioExportSettings audio_export_settings = 12;
   * </code>
   *
   * @return Whether the audioExportSettings field is set.
   */
  boolean hasAudioExportSettings();
  /**
   *
   *
   * <pre>
   * Controls audio export settings for post-conversation analytics when
   * ingesting audio to conversations via [Participants.AnalyzeContent][] or
   * [Participants.StreamingAnalyzeContent][].
   *
   * If
   * [retention_strategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.retention_strategy]
   * is set to REMOVE_AFTER_CONVERSATION or [audio_export_settings.gcs_bucket][]
   * is empty, audio export is disabled.
   *
   * If audio export is enabled, audio is recorded and saved to
   * [audio_export_settings.gcs_bucket][], subject to retention policy of
   * [audio_export_settings.gcs_bucket][].
   *
   * This setting won't effect audio input for implicit sessions via
   * [Sessions.DetectIntent][google.cloud.dialogflow.cx.v3beta1.Sessions.DetectIntent]
   * or
   * [Sessions.StreamingDetectIntent][google.cloud.dialogflow.cx.v3beta1.Sessions.StreamingDetectIntent].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.AudioExportSettings audio_export_settings = 12;
   * </code>
   *
   * @return The audioExportSettings.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.AudioExportSettings
      getAudioExportSettings();
  /**
   *
   *
   * <pre>
   * Controls audio export settings for post-conversation analytics when
   * ingesting audio to conversations via [Participants.AnalyzeContent][] or
   * [Participants.StreamingAnalyzeContent][].
   *
   * If
   * [retention_strategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.retention_strategy]
   * is set to REMOVE_AFTER_CONVERSATION or [audio_export_settings.gcs_bucket][]
   * is empty, audio export is disabled.
   *
   * If audio export is enabled, audio is recorded and saved to
   * [audio_export_settings.gcs_bucket][], subject to retention policy of
   * [audio_export_settings.gcs_bucket][].
   *
   * This setting won't effect audio input for implicit sessions via
   * [Sessions.DetectIntent][google.cloud.dialogflow.cx.v3beta1.Sessions.DetectIntent]
   * or
   * [Sessions.StreamingDetectIntent][google.cloud.dialogflow.cx.v3beta1.Sessions.StreamingDetectIntent].
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.AudioExportSettings audio_export_settings = 12;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.AudioExportSettingsOrBuilder
      getAudioExportSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Controls conversation exporting settings to Insights after conversation is
   * completed.
   *
   * If
   * [retention_strategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.retention_strategy]
   * is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter
   * what you configure here.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.InsightsExportSettings insights_export_settings = 13;
   * </code>
   *
   * @return Whether the insightsExportSettings field is set.
   */
  boolean hasInsightsExportSettings();
  /**
   *
   *
   * <pre>
   * Controls conversation exporting settings to Insights after conversation is
   * completed.
   *
   * If
   * [retention_strategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.retention_strategy]
   * is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter
   * what you configure here.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.InsightsExportSettings insights_export_settings = 13;
   * </code>
   *
   * @return The insightsExportSettings.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.InsightsExportSettings
      getInsightsExportSettings();
  /**
   *
   *
   * <pre>
   * Controls conversation exporting settings to Insights after conversation is
   * completed.
   *
   * If
   * [retention_strategy][google.cloud.dialogflow.cx.v3beta1.SecuritySettings.retention_strategy]
   * is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter
   * what you configure here.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.SecuritySettings.InsightsExportSettings insights_export_settings = 13;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.InsightsExportSettingsOrBuilder
      getInsightsExportSettingsOrBuilder();

  com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings.DataRetentionCase getDataRetentionCase();
}
