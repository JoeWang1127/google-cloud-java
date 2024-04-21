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
// source: google/cloud/retail/v2beta/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * At which level we offer configuration for attributes.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.retail.v2beta.AttributeConfigLevel}
 */
public enum AttributeConfigLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Value used when unset. In this case, server behavior defaults to
   * [CATALOG_LEVEL_ATTRIBUTE_CONFIG][google.cloud.retail.v2beta.AttributeConfigLevel.CATALOG_LEVEL_ATTRIBUTE_CONFIG].
   * </pre>
   *
   * <code>ATTRIBUTE_CONFIG_LEVEL_UNSPECIFIED = 0;</code>
   */
  ATTRIBUTE_CONFIG_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * At this level, we honor the attribute configurations set in
   * [Product.attributes][google.cloud.retail.v2beta.Product.attributes].
   * </pre>
   *
   * <code>PRODUCT_LEVEL_ATTRIBUTE_CONFIG = 1;</code>
   */
  PRODUCT_LEVEL_ATTRIBUTE_CONFIG(1),
  /**
   *
   *
   * <pre>
   * At this level, we honor the attribute configurations set in
   * [CatalogConfig.attribute_configs][].
   * </pre>
   *
   * <code>CATALOG_LEVEL_ATTRIBUTE_CONFIG = 2;</code>
   */
  CATALOG_LEVEL_ATTRIBUTE_CONFIG(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Value used when unset. In this case, server behavior defaults to
   * [CATALOG_LEVEL_ATTRIBUTE_CONFIG][google.cloud.retail.v2beta.AttributeConfigLevel.CATALOG_LEVEL_ATTRIBUTE_CONFIG].
   * </pre>
   *
   * <code>ATTRIBUTE_CONFIG_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int ATTRIBUTE_CONFIG_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * At this level, we honor the attribute configurations set in
   * [Product.attributes][google.cloud.retail.v2beta.Product.attributes].
   * </pre>
   *
   * <code>PRODUCT_LEVEL_ATTRIBUTE_CONFIG = 1;</code>
   */
  public static final int PRODUCT_LEVEL_ATTRIBUTE_CONFIG_VALUE = 1;
  /**
   *
   *
   * <pre>
   * At this level, we honor the attribute configurations set in
   * [CatalogConfig.attribute_configs][].
   * </pre>
   *
   * <code>CATALOG_LEVEL_ATTRIBUTE_CONFIG = 2;</code>
   */
  public static final int CATALOG_LEVEL_ATTRIBUTE_CONFIG_VALUE = 2;

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
  public static AttributeConfigLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AttributeConfigLevel forNumber(int value) {
    switch (value) {
      case 0:
        return ATTRIBUTE_CONFIG_LEVEL_UNSPECIFIED;
      case 1:
        return PRODUCT_LEVEL_ATTRIBUTE_CONFIG;
      case 2:
        return CATALOG_LEVEL_ATTRIBUTE_CONFIG;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AttributeConfigLevel>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AttributeConfigLevel>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AttributeConfigLevel>() {
            public AttributeConfigLevel findValueByNumber(int number) {
              return AttributeConfigLevel.forNumber(number);
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
    return com.google.cloud.retail.v2beta.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AttributeConfigLevel[] VALUES = values();

  public static AttributeConfigLevel valueOf(
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

  private AttributeConfigLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.retail.v2beta.AttributeConfigLevel)
}
