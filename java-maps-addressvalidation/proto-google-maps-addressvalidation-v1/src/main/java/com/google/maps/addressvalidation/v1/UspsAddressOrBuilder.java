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
// source: google/maps/addressvalidation/v1/usps_data.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.addressvalidation.v1;

public interface UspsAddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.addressvalidation.v1.UspsAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * First address line.
   * </pre>
   *
   * <code>string first_address_line = 1;</code>
   *
   * @return The firstAddressLine.
   */
  java.lang.String getFirstAddressLine();
  /**
   *
   *
   * <pre>
   * First address line.
   * </pre>
   *
   * <code>string first_address_line = 1;</code>
   *
   * @return The bytes for firstAddressLine.
   */
  com.google.protobuf.ByteString getFirstAddressLineBytes();

  /**
   *
   *
   * <pre>
   * Firm name.
   * </pre>
   *
   * <code>string firm = 2;</code>
   *
   * @return The firm.
   */
  java.lang.String getFirm();
  /**
   *
   *
   * <pre>
   * Firm name.
   * </pre>
   *
   * <code>string firm = 2;</code>
   *
   * @return The bytes for firm.
   */
  com.google.protobuf.ByteString getFirmBytes();

  /**
   *
   *
   * <pre>
   * Second address line.
   * </pre>
   *
   * <code>string second_address_line = 3;</code>
   *
   * @return The secondAddressLine.
   */
  java.lang.String getSecondAddressLine();
  /**
   *
   *
   * <pre>
   * Second address line.
   * </pre>
   *
   * <code>string second_address_line = 3;</code>
   *
   * @return The bytes for secondAddressLine.
   */
  com.google.protobuf.ByteString getSecondAddressLineBytes();

  /**
   *
   *
   * <pre>
   * Puerto Rican urbanization name.
   * </pre>
   *
   * <code>string urbanization = 4;</code>
   *
   * @return The urbanization.
   */
  java.lang.String getUrbanization();
  /**
   *
   *
   * <pre>
   * Puerto Rican urbanization name.
   * </pre>
   *
   * <code>string urbanization = 4;</code>
   *
   * @return The bytes for urbanization.
   */
  com.google.protobuf.ByteString getUrbanizationBytes();

  /**
   *
   *
   * <pre>
   * City + state + postal code.
   * </pre>
   *
   * <code>string city_state_zip_address_line = 5;</code>
   *
   * @return The cityStateZipAddressLine.
   */
  java.lang.String getCityStateZipAddressLine();
  /**
   *
   *
   * <pre>
   * City + state + postal code.
   * </pre>
   *
   * <code>string city_state_zip_address_line = 5;</code>
   *
   * @return The bytes for cityStateZipAddressLine.
   */
  com.google.protobuf.ByteString getCityStateZipAddressLineBytes();

  /**
   *
   *
   * <pre>
   * City name.
   * </pre>
   *
   * <code>string city = 6;</code>
   *
   * @return The city.
   */
  java.lang.String getCity();
  /**
   *
   *
   * <pre>
   * City name.
   * </pre>
   *
   * <code>string city = 6;</code>
   *
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString getCityBytes();

  /**
   *
   *
   * <pre>
   * 2 letter state code.
   * </pre>
   *
   * <code>string state = 7;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * 2 letter state code.
   * </pre>
   *
   * <code>string state = 7;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();

  /**
   *
   *
   * <pre>
   * Postal code e.g. 10009.
   * </pre>
   *
   * <code>string zip_code = 8;</code>
   *
   * @return The zipCode.
   */
  java.lang.String getZipCode();
  /**
   *
   *
   * <pre>
   * Postal code e.g. 10009.
   * </pre>
   *
   * <code>string zip_code = 8;</code>
   *
   * @return The bytes for zipCode.
   */
  com.google.protobuf.ByteString getZipCodeBytes();

  /**
   *
   *
   * <pre>
   * 4-digit postal code extension e.g. 5023.
   * </pre>
   *
   * <code>string zip_code_extension = 9;</code>
   *
   * @return The zipCodeExtension.
   */
  java.lang.String getZipCodeExtension();
  /**
   *
   *
   * <pre>
   * 4-digit postal code extension e.g. 5023.
   * </pre>
   *
   * <code>string zip_code_extension = 9;</code>
   *
   * @return The bytes for zipCodeExtension.
   */
  com.google.protobuf.ByteString getZipCodeExtensionBytes();
}
