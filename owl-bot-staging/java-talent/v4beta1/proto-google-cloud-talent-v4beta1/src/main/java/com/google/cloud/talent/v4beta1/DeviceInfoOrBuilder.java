// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface DeviceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.DeviceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the device.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
   * @return The enum numeric value on the wire for deviceType.
   */
  int getDeviceTypeValue();
  /**
   * <pre>
   * Type of the device.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
   * @return The deviceType.
   */
  com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType getDeviceType();

  /**
   * <pre>
   * A device-specific ID. The ID must be a unique identifier that
   * distinguishes the device from other devices.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A device-specific ID. The ID must be a unique identifier that
   * distinguishes the device from other devices.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();
}