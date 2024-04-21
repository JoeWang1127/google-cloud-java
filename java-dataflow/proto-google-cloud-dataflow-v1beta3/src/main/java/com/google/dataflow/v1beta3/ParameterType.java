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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * ParameterType specifies what kind of input we need for this parameter.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.ParameterType}
 */
public enum ParameterType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default input type.
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   *
   *
   * <pre>
   * The parameter specifies generic text input.
   * </pre>
   *
   * <code>TEXT = 1;</code>
   */
  TEXT(1),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage Bucket to read from.
   * </pre>
   *
   * <code>GCS_READ_BUCKET = 2;</code>
   */
  GCS_READ_BUCKET(2),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage Bucket to write to.
   * </pre>
   *
   * <code>GCS_WRITE_BUCKET = 3;</code>
   */
  GCS_WRITE_BUCKET(3),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage file path to read from.
   * </pre>
   *
   * <code>GCS_READ_FILE = 4;</code>
   */
  GCS_READ_FILE(4),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage file path to write to.
   * </pre>
   *
   * <code>GCS_WRITE_FILE = 5;</code>
   */
  GCS_WRITE_FILE(5),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage folder path to read from.
   * </pre>
   *
   * <code>GCS_READ_FOLDER = 6;</code>
   */
  GCS_READ_FOLDER(6),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage folder to write to.
   * </pre>
   *
   * <code>GCS_WRITE_FOLDER = 7;</code>
   */
  GCS_WRITE_FOLDER(7),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Pub/Sub Topic.
   * </pre>
   *
   * <code>PUBSUB_TOPIC = 8;</code>
   */
  PUBSUB_TOPIC(8),
  /**
   *
   *
   * <pre>
   * The parameter specifies a Pub/Sub Subscription.
   * </pre>
   *
   * <code>PUBSUB_SUBSCRIPTION = 9;</code>
   */
  PUBSUB_SUBSCRIPTION(9),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default input type.
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The parameter specifies generic text input.
   * </pre>
   *
   * <code>TEXT = 1;</code>
   */
  public static final int TEXT_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage Bucket to read from.
   * </pre>
   *
   * <code>GCS_READ_BUCKET = 2;</code>
   */
  public static final int GCS_READ_BUCKET_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage Bucket to write to.
   * </pre>
   *
   * <code>GCS_WRITE_BUCKET = 3;</code>
   */
  public static final int GCS_WRITE_BUCKET_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage file path to read from.
   * </pre>
   *
   * <code>GCS_READ_FILE = 4;</code>
   */
  public static final int GCS_READ_FILE_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage file path to write to.
   * </pre>
   *
   * <code>GCS_WRITE_FILE = 5;</code>
   */
  public static final int GCS_WRITE_FILE_VALUE = 5;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage folder path to read from.
   * </pre>
   *
   * <code>GCS_READ_FOLDER = 6;</code>
   */
  public static final int GCS_READ_FOLDER_VALUE = 6;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Cloud Storage folder to write to.
   * </pre>
   *
   * <code>GCS_WRITE_FOLDER = 7;</code>
   */
  public static final int GCS_WRITE_FOLDER_VALUE = 7;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Pub/Sub Topic.
   * </pre>
   *
   * <code>PUBSUB_TOPIC = 8;</code>
   */
  public static final int PUBSUB_TOPIC_VALUE = 8;
  /**
   *
   *
   * <pre>
   * The parameter specifies a Pub/Sub Subscription.
   * </pre>
   *
   * <code>PUBSUB_SUBSCRIPTION = 9;</code>
   */
  public static final int PUBSUB_SUBSCRIPTION_VALUE = 9;

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
  public static ParameterType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ParameterType forNumber(int value) {
    switch (value) {
      case 0:
        return DEFAULT;
      case 1:
        return TEXT;
      case 2:
        return GCS_READ_BUCKET;
      case 3:
        return GCS_WRITE_BUCKET;
      case 4:
        return GCS_READ_FILE;
      case 5:
        return GCS_WRITE_FILE;
      case 6:
        return GCS_READ_FOLDER;
      case 7:
        return GCS_WRITE_FOLDER;
      case 8:
        return PUBSUB_TOPIC;
      case 9:
        return PUBSUB_SUBSCRIPTION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ParameterType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ParameterType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ParameterType>() {
        public ParameterType findValueByNumber(int number) {
          return ParameterType.forNumber(number);
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
    return com.google.dataflow.v1beta3.TemplatesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ParameterType[] VALUES = values();

  public static ParameterType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ParameterType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.ParameterType)
}
