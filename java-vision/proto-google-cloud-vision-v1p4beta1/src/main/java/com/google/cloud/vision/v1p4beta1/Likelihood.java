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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * A bucketized representation of likelihood, which is intended to give clients
 * highly stable results across model upgrades.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.vision.v1p4beta1.Likelihood}
 */
public enum Likelihood implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown likelihood.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * It is very unlikely.
   * </pre>
   *
   * <code>VERY_UNLIKELY = 1;</code>
   */
  VERY_UNLIKELY(1),
  /**
   *
   *
   * <pre>
   * It is unlikely.
   * </pre>
   *
   * <code>UNLIKELY = 2;</code>
   */
  UNLIKELY(2),
  /**
   *
   *
   * <pre>
   * It is possible.
   * </pre>
   *
   * <code>POSSIBLE = 3;</code>
   */
  POSSIBLE(3),
  /**
   *
   *
   * <pre>
   * It is likely.
   * </pre>
   *
   * <code>LIKELY = 4;</code>
   */
  LIKELY(4),
  /**
   *
   *
   * <pre>
   * It is very likely.
   * </pre>
   *
   * <code>VERY_LIKELY = 5;</code>
   */
  VERY_LIKELY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown likelihood.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * It is very unlikely.
   * </pre>
   *
   * <code>VERY_UNLIKELY = 1;</code>
   */
  public static final int VERY_UNLIKELY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * It is unlikely.
   * </pre>
   *
   * <code>UNLIKELY = 2;</code>
   */
  public static final int UNLIKELY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * It is possible.
   * </pre>
   *
   * <code>POSSIBLE = 3;</code>
   */
  public static final int POSSIBLE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * It is likely.
   * </pre>
   *
   * <code>LIKELY = 4;</code>
   */
  public static final int LIKELY_VALUE = 4;
  /**
   *
   *
   * <pre>
   * It is very likely.
   * </pre>
   *
   * <code>VERY_LIKELY = 5;</code>
   */
  public static final int VERY_LIKELY_VALUE = 5;

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
  public static Likelihood valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Likelihood forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return VERY_UNLIKELY;
      case 2:
        return UNLIKELY;
      case 3:
        return POSSIBLE;
      case 4:
        return LIKELY;
      case 5:
        return VERY_LIKELY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Likelihood> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Likelihood> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Likelihood>() {
        public Likelihood findValueByNumber(int number) {
          return Likelihood.forNumber(number);
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
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final Likelihood[] VALUES = values();

  public static Likelihood valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Likelihood(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.vision.v1p4beta1.Likelihood)
}
