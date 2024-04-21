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
// source: google/cloud/baremetalsolution/v2/network.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Network with all used IP addresses.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.NetworkUsage}
 */
public final class NetworkUsage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.NetworkUsage)
    NetworkUsageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkUsage.newBuilder() to construct.
  private NetworkUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkUsage() {
    usedIps_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkUsage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.NetworkProto
        .internal_static_google_cloud_baremetalsolution_v2_NetworkUsage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.NetworkProto
        .internal_static_google_cloud_baremetalsolution_v2_NetworkUsage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.NetworkUsage.class,
            com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder.class);
  }

  private int bitField0_;
  public static final int NETWORK_FIELD_NUMBER = 1;
  private com.google.cloud.baremetalsolution.v2.Network network_;
  /**
   *
   *
   * <pre>
   * Network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
   *
   * @return Whether the network field is set.
   */
  @java.lang.Override
  public boolean hasNetwork() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
   *
   * @return The network.
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.Network getNetwork() {
    return network_ == null
        ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
        : network_;
  }
  /**
   *
   *
   * <pre>
   * Network.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NetworkOrBuilder getNetworkOrBuilder() {
    return network_ == null
        ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
        : network_;
  }

  public static final int USED_IPS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList usedIps_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * All used IP addresses in this network.
   * </pre>
   *
   * <code>repeated string used_ips = 2;</code>
   *
   * @return A list containing the usedIps.
   */
  public com.google.protobuf.ProtocolStringList getUsedIpsList() {
    return usedIps_;
  }
  /**
   *
   *
   * <pre>
   * All used IP addresses in this network.
   * </pre>
   *
   * <code>repeated string used_ips = 2;</code>
   *
   * @return The count of usedIps.
   */
  public int getUsedIpsCount() {
    return usedIps_.size();
  }
  /**
   *
   *
   * <pre>
   * All used IP addresses in this network.
   * </pre>
   *
   * <code>repeated string used_ips = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The usedIps at the given index.
   */
  public java.lang.String getUsedIps(int index) {
    return usedIps_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All used IP addresses in this network.
   * </pre>
   *
   * <code>repeated string used_ips = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the usedIps at the given index.
   */
  public com.google.protobuf.ByteString getUsedIpsBytes(int index) {
    return usedIps_.getByteString(index);
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
      output.writeMessage(1, getNetwork());
    }
    for (int i = 0; i < usedIps_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, usedIps_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNetwork());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < usedIps_.size(); i++) {
        dataSize += computeStringSizeNoTag(usedIps_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUsedIpsList().size();
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.NetworkUsage)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.NetworkUsage other =
        (com.google.cloud.baremetalsolution.v2.NetworkUsage) obj;

    if (hasNetwork() != other.hasNetwork()) return false;
    if (hasNetwork()) {
      if (!getNetwork().equals(other.getNetwork())) return false;
    }
    if (!getUsedIpsList().equals(other.getUsedIpsList())) return false;
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
    if (hasNetwork()) {
      hash = (37 * hash) + NETWORK_FIELD_NUMBER;
      hash = (53 * hash) + getNetwork().hashCode();
    }
    if (getUsedIpsCount() > 0) {
      hash = (37 * hash) + USED_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getUsedIpsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage parseFrom(
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

  public static Builder newBuilder(com.google.cloud.baremetalsolution.v2.NetworkUsage prototype) {
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
   * Network with all used IP addresses.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.NetworkUsage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.NetworkUsage)
      com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_NetworkUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_NetworkUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.NetworkUsage.class,
              com.google.cloud.baremetalsolution.v2.NetworkUsage.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.NetworkUsage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getNetworkFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      network_ = null;
      if (networkBuilder_ != null) {
        networkBuilder_.dispose();
        networkBuilder_ = null;
      }
      usedIps_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto
          .internal_static_google_cloud_baremetalsolution_v2_NetworkUsage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.NetworkUsage getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.NetworkUsage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.NetworkUsage build() {
      com.google.cloud.baremetalsolution.v2.NetworkUsage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.NetworkUsage buildPartial() {
      com.google.cloud.baremetalsolution.v2.NetworkUsage result =
          new com.google.cloud.baremetalsolution.v2.NetworkUsage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.baremetalsolution.v2.NetworkUsage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.network_ = networkBuilder_ == null ? network_ : networkBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        usedIps_.makeImmutable();
        result.usedIps_ = usedIps_;
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.NetworkUsage) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.NetworkUsage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.NetworkUsage other) {
      if (other == com.google.cloud.baremetalsolution.v2.NetworkUsage.getDefaultInstance())
        return this;
      if (other.hasNetwork()) {
        mergeNetwork(other.getNetwork());
      }
      if (!other.usedIps_.isEmpty()) {
        if (usedIps_.isEmpty()) {
          usedIps_ = other.usedIps_;
          bitField0_ |= 0x00000002;
        } else {
          ensureUsedIpsIsMutable();
          usedIps_.addAll(other.usedIps_);
        }
        onChanged();
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
                input.readMessage(getNetworkFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureUsedIpsIsMutable();
                usedIps_.add(s);
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

    private com.google.cloud.baremetalsolution.v2.Network network_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.Network,
            com.google.cloud.baremetalsolution.v2.Network.Builder,
            com.google.cloud.baremetalsolution.v2.NetworkOrBuilder>
        networkBuilder_;
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     *
     * @return Whether the network field is set.
     */
    public boolean hasNetwork() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     *
     * @return The network.
     */
    public com.google.cloud.baremetalsolution.v2.Network getNetwork() {
      if (networkBuilder_ == null) {
        return network_ == null
            ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
            : network_;
      } else {
        return networkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    public Builder setNetwork(com.google.cloud.baremetalsolution.v2.Network value) {
      if (networkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        network_ = value;
      } else {
        networkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    public Builder setNetwork(
        com.google.cloud.baremetalsolution.v2.Network.Builder builderForValue) {
      if (networkBuilder_ == null) {
        network_ = builderForValue.build();
      } else {
        networkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    public Builder mergeNetwork(com.google.cloud.baremetalsolution.v2.Network value) {
      if (networkBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && network_ != null
            && network_ != com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()) {
          getNetworkBuilder().mergeFrom(value);
        } else {
          network_ = value;
        }
      } else {
        networkBuilder_.mergeFrom(value);
      }
      if (network_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    public Builder clearNetwork() {
      bitField0_ = (bitField0_ & ~0x00000001);
      network_ = null;
      if (networkBuilder_ != null) {
        networkBuilder_.dispose();
        networkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.Network.Builder getNetworkBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNetworkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.NetworkOrBuilder getNetworkOrBuilder() {
      if (networkBuilder_ != null) {
        return networkBuilder_.getMessageOrBuilder();
      } else {
        return network_ == null
            ? com.google.cloud.baremetalsolution.v2.Network.getDefaultInstance()
            : network_;
      }
    }
    /**
     *
     *
     * <pre>
     * Network.
     * </pre>
     *
     * <code>.google.cloud.baremetalsolution.v2.Network network = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.Network,
            com.google.cloud.baremetalsolution.v2.Network.Builder,
            com.google.cloud.baremetalsolution.v2.NetworkOrBuilder>
        getNetworkFieldBuilder() {
      if (networkBuilder_ == null) {
        networkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.Network,
                com.google.cloud.baremetalsolution.v2.Network.Builder,
                com.google.cloud.baremetalsolution.v2.NetworkOrBuilder>(
                getNetwork(), getParentForChildren(), isClean());
        network_ = null;
      }
      return networkBuilder_;
    }

    private com.google.protobuf.LazyStringArrayList usedIps_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureUsedIpsIsMutable() {
      if (!usedIps_.isModifiable()) {
        usedIps_ = new com.google.protobuf.LazyStringArrayList(usedIps_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @return A list containing the usedIps.
     */
    public com.google.protobuf.ProtocolStringList getUsedIpsList() {
      usedIps_.makeImmutable();
      return usedIps_;
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @return The count of usedIps.
     */
    public int getUsedIpsCount() {
      return usedIps_.size();
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The usedIps at the given index.
     */
    public java.lang.String getUsedIps(int index) {
      return usedIps_.get(index);
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the usedIps at the given index.
     */
    public com.google.protobuf.ByteString getUsedIpsBytes(int index) {
      return usedIps_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The usedIps to set.
     * @return This builder for chaining.
     */
    public Builder setUsedIps(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUsedIpsIsMutable();
      usedIps_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @param value The usedIps to add.
     * @return This builder for chaining.
     */
    public Builder addUsedIps(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUsedIpsIsMutable();
      usedIps_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @param values The usedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllUsedIps(java.lang.Iterable<java.lang.String> values) {
      ensureUsedIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, usedIps_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsedIps() {
      usedIps_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * All used IP addresses in this network.
     * </pre>
     *
     * <code>repeated string used_ips = 2;</code>
     *
     * @param value The bytes of the usedIps to add.
     * @return This builder for chaining.
     */
    public Builder addUsedIpsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureUsedIpsIsMutable();
      usedIps_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.NetworkUsage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.NetworkUsage)
  private static final com.google.cloud.baremetalsolution.v2.NetworkUsage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.NetworkUsage();
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkUsage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkUsage> PARSER =
      new com.google.protobuf.AbstractParser<NetworkUsage>() {
        @java.lang.Override
        public NetworkUsage parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkUsage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkUsage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NetworkUsage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
