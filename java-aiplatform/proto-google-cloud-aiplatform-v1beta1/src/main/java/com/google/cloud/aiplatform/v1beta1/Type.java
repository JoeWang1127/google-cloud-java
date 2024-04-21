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
// source: google/cloud/aiplatform/v1beta1/openapi.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Type contains the list of OpenAPI data types as defined by
 * https://swagger.io/docs/specification/data-models/data-types/
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.Type}
 */
public enum Type implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified, should not be used.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * OpenAPI string type
   * </pre>
   *
   * <code>STRING = 1;</code>
   */
  STRING(1),
  /**
   *
   *
   * <pre>
   * OpenAPI number type
   * </pre>
   *
   * <code>NUMBER = 2;</code>
   */
  NUMBER(2),
  /**
   *
   *
   * <pre>
   * OpenAPI integer type
   * </pre>
   *
   * <code>INTEGER = 3;</code>
   */
  INTEGER(3),
  /**
   *
   *
   * <pre>
   * OpenAPI boolean type
   * </pre>
   *
   * <code>BOOLEAN = 4;</code>
   */
  BOOLEAN(4),
  /**
   *
   *
   * <pre>
   * OpenAPI array type
   * </pre>
   *
   * <code>ARRAY = 5;</code>
   */
  ARRAY(5),
  /**
   *
   *
   * <pre>
   * OpenAPI object type
   * </pre>
   *
   * <code>OBJECT = 6;</code>
   */
  OBJECT(6),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified, should not be used.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * OpenAPI string type
   * </pre>
   *
   * <code>STRING = 1;</code>
   */
  public static final int STRING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * OpenAPI number type
   * </pre>
   *
   * <code>NUMBER = 2;</code>
   */
  public static final int NUMBER_VALUE = 2;
  /**
   *
   *
   * <pre>
   * OpenAPI integer type
   * </pre>
   *
   * <code>INTEGER = 3;</code>
   */
  public static final int INTEGER_VALUE = 3;
  /**
   *
   *
   * <pre>
   * OpenAPI boolean type
   * </pre>
   *
   * <code>BOOLEAN = 4;</code>
   */
  public static final int BOOLEAN_VALUE = 4;
  /**
   *
   *
   * <pre>
   * OpenAPI array type
   * </pre>
   *
   * <code>ARRAY = 5;</code>
   */
  public static final int ARRAY_VALUE = 5;
  /**
   *
   *
   * <pre>
   * OpenAPI object type
   * </pre>
   *
   * <code>OBJECT = 6;</code>
   */
  public static final int OBJECT_VALUE = 6;

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
  public static Type valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Type forNumber(int value) {
    switch (value) {
      case 0:
        return TYPE_UNSPECIFIED;
      case 1:
        return STRING;
      case 2:
        return NUMBER;
      case 3:
        return INTEGER;
      case 4:
        return BOOLEAN;
      case 5:
        return ARRAY;
      case 6:
        return OBJECT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Type>() {
        public Type findValueByNumber(int number) {
          return Type.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.OpenApiProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Type[] VALUES = values();

  public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Type(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.Type)
}
