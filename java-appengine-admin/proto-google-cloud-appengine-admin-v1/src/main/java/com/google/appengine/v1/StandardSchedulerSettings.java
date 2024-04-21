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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Scheduler settings for standard environment.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.StandardSchedulerSettings}
 */
public final class StandardSchedulerSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.StandardSchedulerSettings)
    StandardSchedulerSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StandardSchedulerSettings.newBuilder() to construct.
  private StandardSchedulerSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StandardSchedulerSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StandardSchedulerSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_StandardSchedulerSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_StandardSchedulerSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.StandardSchedulerSettings.class,
            com.google.appengine.v1.StandardSchedulerSettings.Builder.class);
  }

  public static final int TARGET_CPU_UTILIZATION_FIELD_NUMBER = 1;
  private double targetCpuUtilization_ = 0D;
  /**
   *
   *
   * <pre>
   * Target CPU utilization ratio to maintain when scaling.
   * </pre>
   *
   * <code>double target_cpu_utilization = 1;</code>
   *
   * @return The targetCpuUtilization.
   */
  @java.lang.Override
  public double getTargetCpuUtilization() {
    return targetCpuUtilization_;
  }

  public static final int TARGET_THROUGHPUT_UTILIZATION_FIELD_NUMBER = 2;
  private double targetThroughputUtilization_ = 0D;
  /**
   *
   *
   * <pre>
   * Target throughput utilization ratio to maintain when scaling
   * </pre>
   *
   * <code>double target_throughput_utilization = 2;</code>
   *
   * @return The targetThroughputUtilization.
   */
  @java.lang.Override
  public double getTargetThroughputUtilization() {
    return targetThroughputUtilization_;
  }

  public static final int MIN_INSTANCES_FIELD_NUMBER = 3;
  private int minInstances_ = 0;
  /**
   *
   *
   * <pre>
   * Minimum number of instances to run for this version. Set to zero to disable
   * `min_instances` configuration.
   * </pre>
   *
   * <code>int32 min_instances = 3;</code>
   *
   * @return The minInstances.
   */
  @java.lang.Override
  public int getMinInstances() {
    return minInstances_;
  }

  public static final int MAX_INSTANCES_FIELD_NUMBER = 4;
  private int maxInstances_ = 0;
  /**
   *
   *
   * <pre>
   * Maximum number of instances to run for this version. Set to zero to disable
   * `max_instances` configuration.
   * </pre>
   *
   * <code>int32 max_instances = 4;</code>
   *
   * @return The maxInstances.
   */
  @java.lang.Override
  public int getMaxInstances() {
    return maxInstances_;
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
    if (java.lang.Double.doubleToRawLongBits(targetCpuUtilization_) != 0) {
      output.writeDouble(1, targetCpuUtilization_);
    }
    if (java.lang.Double.doubleToRawLongBits(targetThroughputUtilization_) != 0) {
      output.writeDouble(2, targetThroughputUtilization_);
    }
    if (minInstances_ != 0) {
      output.writeInt32(3, minInstances_);
    }
    if (maxInstances_ != 0) {
      output.writeInt32(4, maxInstances_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(targetCpuUtilization_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, targetCpuUtilization_);
    }
    if (java.lang.Double.doubleToRawLongBits(targetThroughputUtilization_) != 0) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(2, targetThroughputUtilization_);
    }
    if (minInstances_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, minInstances_);
    }
    if (maxInstances_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, maxInstances_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.appengine.v1.StandardSchedulerSettings)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.StandardSchedulerSettings other =
        (com.google.appengine.v1.StandardSchedulerSettings) obj;

    if (java.lang.Double.doubleToLongBits(getTargetCpuUtilization())
        != java.lang.Double.doubleToLongBits(other.getTargetCpuUtilization())) return false;
    if (java.lang.Double.doubleToLongBits(getTargetThroughputUtilization())
        != java.lang.Double.doubleToLongBits(other.getTargetThroughputUtilization())) return false;
    if (getMinInstances() != other.getMinInstances()) return false;
    if (getMaxInstances() != other.getMaxInstances()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TARGET_CPU_UTILIZATION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getTargetCpuUtilization()));
    hash = (37 * hash) + TARGET_THROUGHPUT_UTILIZATION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getTargetThroughputUtilization()));
    hash = (37 * hash) + MIN_INSTANCES_FIELD_NUMBER;
    hash = (53 * hash) + getMinInstances();
    hash = (37 * hash) + MAX_INSTANCES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxInstances();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.StandardSchedulerSettings parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.StandardSchedulerSettings prototype) {
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
   * Scheduler settings for standard environment.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.StandardSchedulerSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.StandardSchedulerSettings)
      com.google.appengine.v1.StandardSchedulerSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_StandardSchedulerSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_StandardSchedulerSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.StandardSchedulerSettings.class,
              com.google.appengine.v1.StandardSchedulerSettings.Builder.class);
    }

    // Construct using com.google.appengine.v1.StandardSchedulerSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetCpuUtilization_ = 0D;
      targetThroughputUtilization_ = 0D;
      minInstances_ = 0;
      maxInstances_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_StandardSchedulerSettings_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.StandardSchedulerSettings getDefaultInstanceForType() {
      return com.google.appengine.v1.StandardSchedulerSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.StandardSchedulerSettings build() {
      com.google.appengine.v1.StandardSchedulerSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.StandardSchedulerSettings buildPartial() {
      com.google.appengine.v1.StandardSchedulerSettings result =
          new com.google.appengine.v1.StandardSchedulerSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.StandardSchedulerSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetCpuUtilization_ = targetCpuUtilization_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetThroughputUtilization_ = targetThroughputUtilization_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minInstances_ = minInstances_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxInstances_ = maxInstances_;
      }
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
      if (other instanceof com.google.appengine.v1.StandardSchedulerSettings) {
        return mergeFrom((com.google.appengine.v1.StandardSchedulerSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.StandardSchedulerSettings other) {
      if (other == com.google.appengine.v1.StandardSchedulerSettings.getDefaultInstance())
        return this;
      if (other.getTargetCpuUtilization() != 0D) {
        setTargetCpuUtilization(other.getTargetCpuUtilization());
      }
      if (other.getTargetThroughputUtilization() != 0D) {
        setTargetThroughputUtilization(other.getTargetThroughputUtilization());
      }
      if (other.getMinInstances() != 0) {
        setMinInstances(other.getMinInstances());
      }
      if (other.getMaxInstances() != 0) {
        setMaxInstances(other.getMaxInstances());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9:
              {
                targetCpuUtilization_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 17:
              {
                targetThroughputUtilization_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 24:
              {
                minInstances_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                maxInstances_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private double targetCpuUtilization_;
    /**
     *
     *
     * <pre>
     * Target CPU utilization ratio to maintain when scaling.
     * </pre>
     *
     * <code>double target_cpu_utilization = 1;</code>
     *
     * @return The targetCpuUtilization.
     */
    @java.lang.Override
    public double getTargetCpuUtilization() {
      return targetCpuUtilization_;
    }
    /**
     *
     *
     * <pre>
     * Target CPU utilization ratio to maintain when scaling.
     * </pre>
     *
     * <code>double target_cpu_utilization = 1;</code>
     *
     * @param value The targetCpuUtilization to set.
     * @return This builder for chaining.
     */
    public Builder setTargetCpuUtilization(double value) {

      targetCpuUtilization_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target CPU utilization ratio to maintain when scaling.
     * </pre>
     *
     * <code>double target_cpu_utilization = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetCpuUtilization() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetCpuUtilization_ = 0D;
      onChanged();
      return this;
    }

    private double targetThroughputUtilization_;
    /**
     *
     *
     * <pre>
     * Target throughput utilization ratio to maintain when scaling
     * </pre>
     *
     * <code>double target_throughput_utilization = 2;</code>
     *
     * @return The targetThroughputUtilization.
     */
    @java.lang.Override
    public double getTargetThroughputUtilization() {
      return targetThroughputUtilization_;
    }
    /**
     *
     *
     * <pre>
     * Target throughput utilization ratio to maintain when scaling
     * </pre>
     *
     * <code>double target_throughput_utilization = 2;</code>
     *
     * @param value The targetThroughputUtilization to set.
     * @return This builder for chaining.
     */
    public Builder setTargetThroughputUtilization(double value) {

      targetThroughputUtilization_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target throughput utilization ratio to maintain when scaling
     * </pre>
     *
     * <code>double target_throughput_utilization = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetThroughputUtilization() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetThroughputUtilization_ = 0D;
      onChanged();
      return this;
    }

    private int minInstances_;
    /**
     *
     *
     * <pre>
     * Minimum number of instances to run for this version. Set to zero to disable
     * `min_instances` configuration.
     * </pre>
     *
     * <code>int32 min_instances = 3;</code>
     *
     * @return The minInstances.
     */
    @java.lang.Override
    public int getMinInstances() {
      return minInstances_;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of instances to run for this version. Set to zero to disable
     * `min_instances` configuration.
     * </pre>
     *
     * <code>int32 min_instances = 3;</code>
     *
     * @param value The minInstances to set.
     * @return This builder for chaining.
     */
    public Builder setMinInstances(int value) {

      minInstances_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of instances to run for this version. Set to zero to disable
     * `min_instances` configuration.
     * </pre>
     *
     * <code>int32 min_instances = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinInstances() {
      bitField0_ = (bitField0_ & ~0x00000004);
      minInstances_ = 0;
      onChanged();
      return this;
    }

    private int maxInstances_;
    /**
     *
     *
     * <pre>
     * Maximum number of instances to run for this version. Set to zero to disable
     * `max_instances` configuration.
     * </pre>
     *
     * <code>int32 max_instances = 4;</code>
     *
     * @return The maxInstances.
     */
    @java.lang.Override
    public int getMaxInstances() {
      return maxInstances_;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of instances to run for this version. Set to zero to disable
     * `max_instances` configuration.
     * </pre>
     *
     * <code>int32 max_instances = 4;</code>
     *
     * @param value The maxInstances to set.
     * @return This builder for chaining.
     */
    public Builder setMaxInstances(int value) {

      maxInstances_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of instances to run for this version. Set to zero to disable
     * `max_instances` configuration.
     * </pre>
     *
     * <code>int32 max_instances = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxInstances() {
      bitField0_ = (bitField0_ & ~0x00000008);
      maxInstances_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.StandardSchedulerSettings)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.StandardSchedulerSettings)
  private static final com.google.appengine.v1.StandardSchedulerSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.StandardSchedulerSettings();
  }

  public static com.google.appengine.v1.StandardSchedulerSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StandardSchedulerSettings> PARSER =
      new com.google.protobuf.AbstractParser<StandardSchedulerSettings>() {
        @java.lang.Override
        public StandardSchedulerSettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<StandardSchedulerSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StandardSchedulerSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.StandardSchedulerSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
