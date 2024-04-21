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

public interface ColorInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.ColorInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The standard color families. Strongly recommended to use the following
   * standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple",
   * "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and
   * "Mixed". Normally it is expected to have only 1 color family. May consider
   * using single "Mixed" instead of multiple values.
   *
   * A maximum of 5 values are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string color_families = 1;</code>
   *
   * @return A list containing the colorFamilies.
   */
  java.util.List<java.lang.String> getColorFamiliesList();
  /**
   *
   *
   * <pre>
   * The standard color families. Strongly recommended to use the following
   * standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple",
   * "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and
   * "Mixed". Normally it is expected to have only 1 color family. May consider
   * using single "Mixed" instead of multiple values.
   *
   * A maximum of 5 values are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string color_families = 1;</code>
   *
   * @return The count of colorFamilies.
   */
  int getColorFamiliesCount();
  /**
   *
   *
   * <pre>
   * The standard color families. Strongly recommended to use the following
   * standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple",
   * "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and
   * "Mixed". Normally it is expected to have only 1 color family. May consider
   * using single "Mixed" instead of multiple values.
   *
   * A maximum of 5 values are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string color_families = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The colorFamilies at the given index.
   */
  java.lang.String getColorFamilies(int index);
  /**
   *
   *
   * <pre>
   * The standard color families. Strongly recommended to use the following
   * standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple",
   * "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and
   * "Mixed". Normally it is expected to have only 1 color family. May consider
   * using single "Mixed" instead of multiple values.
   *
   * A maximum of 5 values are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string color_families = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the colorFamilies at the given index.
   */
  com.google.protobuf.ByteString getColorFamiliesBytes(int index);

  /**
   *
   *
   * <pre>
   * The color display names, which may be different from standard color family
   * names, such as the color aliases used in the website frontend. Normally
   * it is expected to have only 1 color. May consider using single "Mixed"
   * instead of multiple values.
   *
   * A maximum of 75 colors are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string colors = 2;</code>
   *
   * @return A list containing the colors.
   */
  java.util.List<java.lang.String> getColorsList();
  /**
   *
   *
   * <pre>
   * The color display names, which may be different from standard color family
   * names, such as the color aliases used in the website frontend. Normally
   * it is expected to have only 1 color. May consider using single "Mixed"
   * instead of multiple values.
   *
   * A maximum of 75 colors are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string colors = 2;</code>
   *
   * @return The count of colors.
   */
  int getColorsCount();
  /**
   *
   *
   * <pre>
   * The color display names, which may be different from standard color family
   * names, such as the color aliases used in the website frontend. Normally
   * it is expected to have only 1 color. May consider using single "Mixed"
   * instead of multiple values.
   *
   * A maximum of 75 colors are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string colors = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The colors at the given index.
   */
  java.lang.String getColors(int index);
  /**
   *
   *
   * <pre>
   * The color display names, which may be different from standard color family
   * names, such as the color aliases used in the website frontend. Normally
   * it is expected to have only 1 color. May consider using single "Mixed"
   * instead of multiple values.
   *
   * A maximum of 75 colors are allowed. Each value must be a UTF-8 encoded
   * string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [color](https://support.google.com/merchants/answer/6324487). Schema.org
   * property [Product.color](https://schema.org/color).
   * </pre>
   *
   * <code>repeated string colors = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the colors at the given index.
   */
  com.google.protobuf.ByteString getColorsBytes(int index);
}
