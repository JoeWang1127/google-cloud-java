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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * CPU utilization policy.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AutoscalingPolicyCpuUtilization}
 */
public final class AutoscalingPolicyCpuUtilization extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AutoscalingPolicyCpuUtilization)
    AutoscalingPolicyCpuUtilizationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoscalingPolicyCpuUtilization.newBuilder() to construct.
  private AutoscalingPolicyCpuUtilization(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoscalingPolicyCpuUtilization() {
    predictiveMethod_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoscalingPolicyCpuUtilization();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AutoscalingPolicyCpuUtilization(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 1727246961:
            {
              bitField0_ |= 0x00000002;
              utilizationTarget_ = input.readDouble();
              break;
            }
          case -1173201398:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              predictiveMethod_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AutoscalingPolicyCpuUtilization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AutoscalingPolicyCpuUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.class,
            com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.PredictiveMethod}
   */
  public enum PredictiveMethod implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PREDICTIVE_METHOD = 0;</code>
     */
    UNDEFINED_PREDICTIVE_METHOD(0),
    /**
     *
     *
     * <pre>
     * No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics
     * </pre>
     *
     * <code>NONE = 2402104;</code>
     */
    NONE(2402104),
    /**
     *
     *
     * <pre>
     * Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * </pre>
     *
     * <code>OPTIMIZE_AVAILABILITY = 11629437;</code>
     */
    OPTIMIZE_AVAILABILITY(11629437),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PREDICTIVE_METHOD = 0;</code>
     */
    public static final int UNDEFINED_PREDICTIVE_METHOD_VALUE = 0;
    /**
     *
     *
     * <pre>
     * No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics
     * </pre>
     *
     * <code>NONE = 2402104;</code>
     */
    public static final int NONE_VALUE = 2402104;
    /**
     *
     *
     * <pre>
     * Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * </pre>
     *
     * <code>OPTIMIZE_AVAILABILITY = 11629437;</code>
     */
    public static final int OPTIMIZE_AVAILABILITY_VALUE = 11629437;

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
    public static PredictiveMethod valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PredictiveMethod forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_PREDICTIVE_METHOD;
        case 2402104:
          return NONE;
        case 11629437:
          return OPTIMIZE_AVAILABILITY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PredictiveMethod> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<PredictiveMethod>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PredictiveMethod>() {
              public PredictiveMethod findValueByNumber(int number) {
                return PredictiveMethod.forNumber(number);
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
      return com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final PredictiveMethod[] VALUES = values();

    public static PredictiveMethod valueOf(
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

    private PredictiveMethod(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.PredictiveMethod)
  }

  private int bitField0_;
  public static final int PREDICTIVE_METHOD_FIELD_NUMBER = 390220737;
  private volatile java.lang.Object predictiveMethod_;
  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * Check the PredictiveMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string predictive_method = 390220737;</code>
   *
   * @return Whether the predictiveMethod field is set.
   */
  @java.lang.Override
  public boolean hasPredictiveMethod() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * Check the PredictiveMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string predictive_method = 390220737;</code>
   *
   * @return The predictiveMethod.
   */
  @java.lang.Override
  public java.lang.String getPredictiveMethod() {
    java.lang.Object ref = predictiveMethod_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      predictiveMethod_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * Check the PredictiveMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string predictive_method = 390220737;</code>
   *
   * @return The bytes for predictiveMethod.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPredictiveMethodBytes() {
    java.lang.Object ref = predictiveMethod_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      predictiveMethod_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UTILIZATION_TARGET_FIELD_NUMBER = 215905870;
  private double utilizationTarget_;
  /**
   *
   *
   * <pre>
   * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return Whether the utilizationTarget field is set.
   */
  @java.lang.Override
  public boolean hasUtilizationTarget() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return The utilizationTarget.
   */
  @java.lang.Override
  public double getUtilizationTarget() {
    return utilizationTarget_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(215905870, utilizationTarget_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 390220737, predictiveMethod_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(215905870, utilizationTarget_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(390220737, predictiveMethod_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization other =
        (com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization) obj;

    if (hasPredictiveMethod() != other.hasPredictiveMethod()) return false;
    if (hasPredictiveMethod()) {
      if (!getPredictiveMethod().equals(other.getPredictiveMethod())) return false;
    }
    if (hasUtilizationTarget() != other.hasUtilizationTarget()) return false;
    if (hasUtilizationTarget()) {
      if (java.lang.Double.doubleToLongBits(getUtilizationTarget())
          != java.lang.Double.doubleToLongBits(other.getUtilizationTarget())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPredictiveMethod()) {
      hash = (37 * hash) + PREDICTIVE_METHOD_FIELD_NUMBER;
      hash = (53 * hash) + getPredictiveMethod().hashCode();
    }
    if (hasUtilizationTarget()) {
      hash = (37 * hash) + UTILIZATION_TARGET_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getUtilizationTarget()));
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * CPU utilization policy.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AutoscalingPolicyCpuUtilization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AutoscalingPolicyCpuUtilization)
      com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalingPolicyCpuUtilization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalingPolicyCpuUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.class,
              com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      predictiveMethod_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      utilizationTarget_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalingPolicyCpuUtilization_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization build() {
      com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization buildPartial() {
      com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization result =
          new com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.predictiveMethod_ = predictiveMethod_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.utilizationTarget_ = utilizationTarget_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization) {
        return mergeFrom((com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization other) {
      if (other == com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization.getDefaultInstance())
        return this;
      if (other.hasPredictiveMethod()) {
        bitField0_ |= 0x00000001;
        predictiveMethod_ = other.predictiveMethod_;
        onChanged();
      }
      if (other.hasUtilizationTarget()) {
        setUtilizationTarget(other.getUtilizationTarget());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object predictiveMethod_ = "";
    /**
     *
     *
     * <pre>
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * Check the PredictiveMethod enum for the list of possible values.
     * </pre>
     *
     * <code>optional string predictive_method = 390220737;</code>
     *
     * @return Whether the predictiveMethod field is set.
     */
    public boolean hasPredictiveMethod() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * Check the PredictiveMethod enum for the list of possible values.
     * </pre>
     *
     * <code>optional string predictive_method = 390220737;</code>
     *
     * @return The predictiveMethod.
     */
    public java.lang.String getPredictiveMethod() {
      java.lang.Object ref = predictiveMethod_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        predictiveMethod_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * Check the PredictiveMethod enum for the list of possible values.
     * </pre>
     *
     * <code>optional string predictive_method = 390220737;</code>
     *
     * @return The bytes for predictiveMethod.
     */
    public com.google.protobuf.ByteString getPredictiveMethodBytes() {
      java.lang.Object ref = predictiveMethod_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        predictiveMethod_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * Check the PredictiveMethod enum for the list of possible values.
     * </pre>
     *
     * <code>optional string predictive_method = 390220737;</code>
     *
     * @param value The predictiveMethod to set.
     * @return This builder for chaining.
     */
    public Builder setPredictiveMethod(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      predictiveMethod_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * Check the PredictiveMethod enum for the list of possible values.
     * </pre>
     *
     * <code>optional string predictive_method = 390220737;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPredictiveMethod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      predictiveMethod_ = getDefaultInstance().getPredictiveMethod();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * Check the PredictiveMethod enum for the list of possible values.
     * </pre>
     *
     * <code>optional string predictive_method = 390220737;</code>
     *
     * @param value The bytes for predictiveMethod to set.
     * @return This builder for chaining.
     */
    public Builder setPredictiveMethodBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      predictiveMethod_ = value;
      onChanged();
      return this;
    }

    private double utilizationTarget_;
    /**
     *
     *
     * <pre>
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @return Whether the utilizationTarget field is set.
     */
    @java.lang.Override
    public boolean hasUtilizationTarget() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @return The utilizationTarget.
     */
    @java.lang.Override
    public double getUtilizationTarget() {
      return utilizationTarget_;
    }
    /**
     *
     *
     * <pre>
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @param value The utilizationTarget to set.
     * @return This builder for chaining.
     */
    public Builder setUtilizationTarget(double value) {
      bitField0_ |= 0x00000002;
      utilizationTarget_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUtilizationTarget() {
      bitField0_ = (bitField0_ & ~0x00000002);
      utilizationTarget_ = 0D;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AutoscalingPolicyCpuUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AutoscalingPolicyCpuUtilization)
  private static final com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization();
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalingPolicyCpuUtilization> PARSER =
      new com.google.protobuf.AbstractParser<AutoscalingPolicyCpuUtilization>() {
        @java.lang.Override
        public AutoscalingPolicyCpuUtilization parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AutoscalingPolicyCpuUtilization(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AutoscalingPolicyCpuUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalingPolicyCpuUtilization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}