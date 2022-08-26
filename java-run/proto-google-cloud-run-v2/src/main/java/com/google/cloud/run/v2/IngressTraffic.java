/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/run/v2/vendor_settings.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * Allowed ingress traffic for the Container.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.run.v2.IngressTraffic}
 */
public enum IngressTraffic implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_UNSPECIFIED = 0;</code>
   */
  INGRESS_TRAFFIC_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * All inbound traffic is allowed.
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_ALL = 1;</code>
   */
  INGRESS_TRAFFIC_ALL(1),
  /**
   *
   *
   * <pre>
   * Only internal traffic is allowed.
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_INTERNAL_ONLY = 2;</code>
   */
  INGRESS_TRAFFIC_INTERNAL_ONLY(2),
  /**
   *
   *
   * <pre>
   * Both internal and Google Cloud Load Balancer traffic is allowed.
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_INTERNAL_LOAD_BALANCER = 3;</code>
   */
  INGRESS_TRAFFIC_INTERNAL_LOAD_BALANCER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_UNSPECIFIED = 0;</code>
   */
  public static final int INGRESS_TRAFFIC_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * All inbound traffic is allowed.
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_ALL = 1;</code>
   */
  public static final int INGRESS_TRAFFIC_ALL_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Only internal traffic is allowed.
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_INTERNAL_ONLY = 2;</code>
   */
  public static final int INGRESS_TRAFFIC_INTERNAL_ONLY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Both internal and Google Cloud Load Balancer traffic is allowed.
   * </pre>
   *
   * <code>INGRESS_TRAFFIC_INTERNAL_LOAD_BALANCER = 3;</code>
   */
  public static final int INGRESS_TRAFFIC_INTERNAL_LOAD_BALANCER_VALUE = 3;

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
  public static IngressTraffic valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IngressTraffic forNumber(int value) {
    switch (value) {
      case 0:
        return INGRESS_TRAFFIC_UNSPECIFIED;
      case 1:
        return INGRESS_TRAFFIC_ALL;
      case 2:
        return INGRESS_TRAFFIC_INTERNAL_ONLY;
      case 3:
        return INGRESS_TRAFFIC_INTERNAL_LOAD_BALANCER;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IngressTraffic> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<IngressTraffic> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<IngressTraffic>() {
        public IngressTraffic findValueByNumber(int number) {
          return IngressTraffic.forNumber(number);
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
    return com.google.cloud.run.v2.VendorSettingsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IngressTraffic[] VALUES = values();

  public static IngressTraffic valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IngressTraffic(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.run.v2.IngressTraffic)
}