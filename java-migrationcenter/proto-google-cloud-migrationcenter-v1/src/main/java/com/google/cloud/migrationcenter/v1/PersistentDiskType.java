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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * The persistent disk (PD) types of Compute Engine virtual machines.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.migrationcenter.v1.PersistentDiskType}
 */
public enum PersistentDiskType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified (default value).
   * Selecting this value allows the system to use any disk type according
   * to reported usage. This a good value to start with.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_UNSPECIFIED = 0;</code>
   */
  PERSISTENT_DISK_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Standard HDD Persistent Disk.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_STANDARD = 1;</code>
   */
  PERSISTENT_DISK_TYPE_STANDARD(1),
  /**
   *
   *
   * <pre>
   * Balanced Persistent Disk.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_BALANCED = 2;</code>
   */
  PERSISTENT_DISK_TYPE_BALANCED(2),
  /**
   *
   *
   * <pre>
   * SSD Persistent Disk.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_SSD = 3;</code>
   */
  PERSISTENT_DISK_TYPE_SSD(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified (default value).
   * Selecting this value allows the system to use any disk type according
   * to reported usage. This a good value to start with.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PERSISTENT_DISK_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Standard HDD Persistent Disk.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_STANDARD = 1;</code>
   */
  public static final int PERSISTENT_DISK_TYPE_STANDARD_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Balanced Persistent Disk.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_BALANCED = 2;</code>
   */
  public static final int PERSISTENT_DISK_TYPE_BALANCED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * SSD Persistent Disk.
   * </pre>
   *
   * <code>PERSISTENT_DISK_TYPE_SSD = 3;</code>
   */
  public static final int PERSISTENT_DISK_TYPE_SSD_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PersistentDiskType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PersistentDiskType forNumber(int value) {
    switch (value) {
      case 0:
        return PERSISTENT_DISK_TYPE_UNSPECIFIED;
      case 1:
        return PERSISTENT_DISK_TYPE_STANDARD;
      case 2:
        return PERSISTENT_DISK_TYPE_BALANCED;
      case 3:
        return PERSISTENT_DISK_TYPE_SSD;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PersistentDiskType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PersistentDiskType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PersistentDiskType>() {
            public PersistentDiskType findValueByNumber(int number) {
              return PersistentDiskType.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.getDescriptor()
        .getEnumTypes()
        .get(5);
  }

  private static final PersistentDiskType[] VALUES = values();

  public static PersistentDiskType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PersistentDiskType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.migrationcenter.v1.PersistentDiskType)
}
