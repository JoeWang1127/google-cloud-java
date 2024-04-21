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
// source: google/cloud/gkebackup/v1/volume.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkebackup.v1;

public interface VolumeBackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.VolumeBackup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The full name of the VolumeBackup resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;&#47;volumeBackups/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The full name of the VolumeBackup resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;&#47;volumeBackups/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeBackup resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeBackup resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeBackup resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeBackup resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeBackup resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeBackup resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A reference to the source Kubernetes PVC from which this
   * VolumeBackup was created.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedName source_pvc = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the sourcePvc field is set.
   */
  boolean hasSourcePvc();
  /**
   *
   *
   * <pre>
   * Output only. A reference to the source Kubernetes PVC from which this
   * VolumeBackup was created.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedName source_pvc = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The sourcePvc.
   */
  com.google.cloud.gkebackup.v1.NamespacedName getSourcePvc();
  /**
   *
   *
   * <pre>
   * Output only. A reference to the source Kubernetes PVC from which this
   * VolumeBackup was created.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedName source_pvc = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder getSourcePvcOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A storage system-specific opaque handle to the underlying
   * volume backup.
   * </pre>
   *
   * <code>string volume_backup_handle = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeBackupHandle.
   */
  java.lang.String getVolumeBackupHandle();
  /**
   *
   *
   * <pre>
   * Output only. A storage system-specific opaque handle to the underlying
   * volume backup.
   * </pre>
   *
   * <code>string volume_backup_handle = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for volumeBackupHandle.
   */
  com.google.protobuf.ByteString getVolumeBackupHandleBytes();

  /**
   *
   *
   * <pre>
   * Output only. The format used for the volume backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeBackup.VolumeBackupFormat format = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   *
   *
   * <pre>
   * Output only. The format used for the volume backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeBackup.VolumeBackupFormat format = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The format.
   */
  com.google.cloud.gkebackup.v1.VolumeBackup.VolumeBackupFormat getFormat();

  /**
   *
   *
   * <pre>
   * Output only. The aggregate size of the underlying artifacts associated with
   * this VolumeBackup in the backup storage. This may change over time when
   * multiple backups of the same volume share the same backup storage
   * location. In particular, this is likely to increase in size when
   * the immediately preceding backup of the same volume is deleted.
   * </pre>
   *
   * <code>int64 storage_bytes = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The storageBytes.
   */
  long getStorageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The minimum size of the disk to which this VolumeBackup can be
   * restored.
   * </pre>
   *
   * <code>int64 disk_size_bytes = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The diskSizeBytes.
   */
  long getDiskSizeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the associated underlying volume backup
   * operation completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the associated underlying volume backup
   * operation completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the associated underlying volume backup
   * operation completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this VolumeBackup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeBackup.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of this VolumeBackup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeBackup.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkebackup.v1.VolumeBackup.State getState();

  /**
   *
   *
   * <pre>
   * Output only. A human readable message explaining why the VolumeBackup is in
   * its current state.
   * </pre>
   *
   * <code>string state_message = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   *
   *
   * <pre>
   * Output only. A human readable message explaining why the VolumeBackup is in
   * its current state.
   * </pre>
   *
   * <code>string state_message = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a volume backup from overwriting each
   * other. It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform volume backup updates in order to avoid
   * race conditions.
   * </pre>
   *
   * <code>string etag = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a volume backup from overwriting each
   * other. It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform volume backup updates in order to avoid
   * race conditions.
   * </pre>
   *
   * <code>string etag = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
