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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Runtime networking information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.RuntimeNetworkInfo}
 */
public final class RuntimeNetworkInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.RuntimeNetworkInfo)
    RuntimeNetworkInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RuntimeNetworkInfo.newBuilder() to construct.
  private RuntimeNetworkInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RuntimeNetworkInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RuntimeNetworkInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_RuntimeNetworkInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_RuntimeNetworkInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.class,
            com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.Builder.class);
  }

  private int bitField0_;
  public static final int SCAN_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp scanTime_;
  /**
   *
   *
   * <pre>
   * Time of the last network scan.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp scan_time = 1;</code>
   *
   * @return Whether the scanTime field is set.
   */
  @java.lang.Override
  public boolean hasScanTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Time of the last network scan.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp scan_time = 1;</code>
   *
   * @return The scanTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getScanTime() {
    return scanTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : scanTime_;
  }
  /**
   *
   *
   * <pre>
   * Time of the last network scan.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp scan_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getScanTimeOrBuilder() {
    return scanTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : scanTime_;
  }

  public static final int CONNECTIONS_FIELD_NUMBER = 2;
  private com.google.cloud.migrationcenter.v1.NetworkConnectionList connections_;
  /**
   *
   *
   * <pre>
   * Network connections.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
   *
   * @return Whether the connections field is set.
   */
  @java.lang.Override
  public boolean hasConnections() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Network connections.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
   *
   * @return The connections.
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.NetworkConnectionList getConnections() {
    return connections_ == null
        ? com.google.cloud.migrationcenter.v1.NetworkConnectionList.getDefaultInstance()
        : connections_;
  }
  /**
   *
   *
   * <pre>
   * Network connections.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.NetworkConnectionListOrBuilder
      getConnectionsOrBuilder() {
    return connections_ == null
        ? com.google.cloud.migrationcenter.v1.NetworkConnectionList.getDefaultInstance()
        : connections_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getScanTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getConnections());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getScanTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getConnections());
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo other =
        (com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo) obj;

    if (hasScanTime() != other.hasScanTime()) return false;
    if (hasScanTime()) {
      if (!getScanTime().equals(other.getScanTime())) return false;
    }
    if (hasConnections() != other.hasConnections()) return false;
    if (hasConnections()) {
      if (!getConnections().equals(other.getConnections())) return false;
    }
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
    if (hasScanTime()) {
      hash = (37 * hash) + SCAN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getScanTime().hashCode();
    }
    if (hasConnections()) {
      hash = (37 * hash) + CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConnections().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo parseFrom(
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
      com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo prototype) {
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
   * Runtime networking information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.RuntimeNetworkInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.RuntimeNetworkInfo)
      com.google.cloud.migrationcenter.v1.RuntimeNetworkInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_RuntimeNetworkInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_RuntimeNetworkInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.class,
              com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getScanTimeFieldBuilder();
        getConnectionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scanTime_ = null;
      if (scanTimeBuilder_ != null) {
        scanTimeBuilder_.dispose();
        scanTimeBuilder_ = null;
      }
      connections_ = null;
      if (connectionsBuilder_ != null) {
        connectionsBuilder_.dispose();
        connectionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_RuntimeNetworkInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo build() {
      com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo buildPartial() {
      com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo result =
          new com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scanTime_ = scanTimeBuilder_ == null ? scanTime_ : scanTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.connections_ =
            connectionsBuilder_ == null ? connections_ : connectionsBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo other) {
      if (other == com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo.getDefaultInstance())
        return this;
      if (other.hasScanTime()) {
        mergeScanTime(other.getScanTime());
      }
      if (other.hasConnections()) {
        mergeConnections(other.getConnections());
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
            case 10:
              {
                input.readMessage(getScanTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getConnectionsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.Timestamp scanTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        scanTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     *
     * @return Whether the scanTime field is set.
     */
    public boolean hasScanTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     *
     * @return The scanTime.
     */
    public com.google.protobuf.Timestamp getScanTime() {
      if (scanTimeBuilder_ == null) {
        return scanTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : scanTime_;
      } else {
        return scanTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    public Builder setScanTime(com.google.protobuf.Timestamp value) {
      if (scanTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scanTime_ = value;
      } else {
        scanTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    public Builder setScanTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (scanTimeBuilder_ == null) {
        scanTime_ = builderForValue.build();
      } else {
        scanTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    public Builder mergeScanTime(com.google.protobuf.Timestamp value) {
      if (scanTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && scanTime_ != null
            && scanTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getScanTimeBuilder().mergeFrom(value);
        } else {
          scanTime_ = value;
        }
      } else {
        scanTimeBuilder_.mergeFrom(value);
      }
      if (scanTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    public Builder clearScanTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scanTime_ = null;
      if (scanTimeBuilder_ != null) {
        scanTimeBuilder_.dispose();
        scanTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getScanTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScanTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getScanTimeOrBuilder() {
      if (scanTimeBuilder_ != null) {
        return scanTimeBuilder_.getMessageOrBuilder();
      } else {
        return scanTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : scanTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time of the last network scan.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp scan_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getScanTimeFieldBuilder() {
      if (scanTimeBuilder_ == null) {
        scanTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getScanTime(), getParentForChildren(), isClean());
        scanTime_ = null;
      }
      return scanTimeBuilder_;
    }

    private com.google.cloud.migrationcenter.v1.NetworkConnectionList connections_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.NetworkConnectionList,
            com.google.cloud.migrationcenter.v1.NetworkConnectionList.Builder,
            com.google.cloud.migrationcenter.v1.NetworkConnectionListOrBuilder>
        connectionsBuilder_;
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     *
     * @return Whether the connections field is set.
     */
    public boolean hasConnections() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     *
     * @return The connections.
     */
    public com.google.cloud.migrationcenter.v1.NetworkConnectionList getConnections() {
      if (connectionsBuilder_ == null) {
        return connections_ == null
            ? com.google.cloud.migrationcenter.v1.NetworkConnectionList.getDefaultInstance()
            : connections_;
      } else {
        return connectionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    public Builder setConnections(com.google.cloud.migrationcenter.v1.NetworkConnectionList value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connections_ = value;
      } else {
        connectionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    public Builder setConnections(
        com.google.cloud.migrationcenter.v1.NetworkConnectionList.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        connections_ = builderForValue.build();
      } else {
        connectionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    public Builder mergeConnections(
        com.google.cloud.migrationcenter.v1.NetworkConnectionList value) {
      if (connectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && connections_ != null
            && connections_
                != com.google.cloud.migrationcenter.v1.NetworkConnectionList.getDefaultInstance()) {
          getConnectionsBuilder().mergeFrom(value);
        } else {
          connections_ = value;
        }
      } else {
        connectionsBuilder_.mergeFrom(value);
      }
      if (connections_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    public Builder clearConnections() {
      bitField0_ = (bitField0_ & ~0x00000002);
      connections_ = null;
      if (connectionsBuilder_ != null) {
        connectionsBuilder_.dispose();
        connectionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    public com.google.cloud.migrationcenter.v1.NetworkConnectionList.Builder
        getConnectionsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConnectionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    public com.google.cloud.migrationcenter.v1.NetworkConnectionListOrBuilder
        getConnectionsOrBuilder() {
      if (connectionsBuilder_ != null) {
        return connectionsBuilder_.getMessageOrBuilder();
      } else {
        return connections_ == null
            ? com.google.cloud.migrationcenter.v1.NetworkConnectionList.getDefaultInstance()
            : connections_;
      }
    }
    /**
     *
     *
     * <pre>
     * Network connections.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.NetworkConnectionList connections = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.NetworkConnectionList,
            com.google.cloud.migrationcenter.v1.NetworkConnectionList.Builder,
            com.google.cloud.migrationcenter.v1.NetworkConnectionListOrBuilder>
        getConnectionsFieldBuilder() {
      if (connectionsBuilder_ == null) {
        connectionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.migrationcenter.v1.NetworkConnectionList,
                com.google.cloud.migrationcenter.v1.NetworkConnectionList.Builder,
                com.google.cloud.migrationcenter.v1.NetworkConnectionListOrBuilder>(
                getConnections(), getParentForChildren(), isClean());
        connections_ = null;
      }
      return connectionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.RuntimeNetworkInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.RuntimeNetworkInfo)
  private static final com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo();
  }

  public static com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeNetworkInfo> PARSER =
      new com.google.protobuf.AbstractParser<RuntimeNetworkInfo>() {
        @java.lang.Override
        public RuntimeNetworkInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuntimeNetworkInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeNetworkInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.RuntimeNetworkInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
