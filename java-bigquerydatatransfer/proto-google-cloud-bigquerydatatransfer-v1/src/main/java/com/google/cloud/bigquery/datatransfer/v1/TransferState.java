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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * Represents data transfer run state.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.bigquery.datatransfer.v1.TransferState}
 */
public enum TransferState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * State placeholder (0).
   * </pre>
   *
   * <code>TRANSFER_STATE_UNSPECIFIED = 0;</code>
   */
  TRANSFER_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Data transfer is scheduled and is waiting to be picked up by
   * data transfer backend (2).
   * </pre>
   *
   * <code>PENDING = 2;</code>
   */
  PENDING(2),
  /**
   *
   *
   * <pre>
   * Data transfer is in progress (3).
   * </pre>
   *
   * <code>RUNNING = 3;</code>
   */
  RUNNING(3),
  /**
   *
   *
   * <pre>
   * Data transfer completed successfully (4).
   * </pre>
   *
   * <code>SUCCEEDED = 4;</code>
   */
  SUCCEEDED(4),
  /**
   *
   *
   * <pre>
   * Data transfer failed (5).
   * </pre>
   *
   * <code>FAILED = 5;</code>
   */
  FAILED(5),
  /**
   *
   *
   * <pre>
   * Data transfer is cancelled (6).
   * </pre>
   *
   * <code>CANCELLED = 6;</code>
   */
  CANCELLED(6),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * State placeholder (0).
   * </pre>
   *
   * <code>TRANSFER_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int TRANSFER_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Data transfer is scheduled and is waiting to be picked up by
   * data transfer backend (2).
   * </pre>
   *
   * <code>PENDING = 2;</code>
   */
  public static final int PENDING_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Data transfer is in progress (3).
   * </pre>
   *
   * <code>RUNNING = 3;</code>
   */
  public static final int RUNNING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Data transfer completed successfully (4).
   * </pre>
   *
   * <code>SUCCEEDED = 4;</code>
   */
  public static final int SUCCEEDED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Data transfer failed (5).
   * </pre>
   *
   * <code>FAILED = 5;</code>
   */
  public static final int FAILED_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Data transfer is cancelled (6).
   * </pre>
   *
   * <code>CANCELLED = 6;</code>
   */
  public static final int CANCELLED_VALUE = 6;

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
  public static TransferState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransferState forNumber(int value) {
    switch (value) {
      case 0:
        return TRANSFER_STATE_UNSPECIFIED;
      case 2:
        return PENDING;
      case 3:
        return RUNNING;
      case 4:
        return SUCCEEDED;
      case 5:
        return FAILED;
      case 6:
        return CANCELLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransferState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TransferState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TransferState>() {
        public TransferState findValueByNumber(int number) {
          return TransferState.forNumber(number);
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
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final TransferState[] VALUES = values();

  public static TransferState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransferState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.datatransfer.v1.TransferState)
}
