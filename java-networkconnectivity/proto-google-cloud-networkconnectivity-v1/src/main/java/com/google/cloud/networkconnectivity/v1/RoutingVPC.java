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
// source: google/cloud/networkconnectivity/v1/hub.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * RoutingVPC contains information about the VPC networks associated
 * with the spokes of a Network Connectivity Center hub.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkconnectivity.v1.RoutingVPC}
 */
public final class RoutingVPC extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkconnectivity.v1.RoutingVPC)
    RoutingVPCOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RoutingVPC.newBuilder() to construct.
  private RoutingVPC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RoutingVPC() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RoutingVPC();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_RoutingVPC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_RoutingVPC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkconnectivity.v1.RoutingVPC.class,
            com.google.cloud.networkconnectivity.v1.RoutingVPC.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   *
   *
   * <pre>
   * The URI of the VPC network.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URI of the VPC network.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUIRED_FOR_NEW_SITE_TO_SITE_DATA_TRANSFER_SPOKES_FIELD_NUMBER = 2;
  private boolean requiredForNewSiteToSiteDataTransferSpokes_ = false;
  /**
   *
   *
   * <pre>
   * Output only. If true, indicates that this VPC network is currently
   * associated with spokes that use the data transfer feature (spokes where the
   * site_to_site_data_transfer field is set to true). If you create new spokes
   * that use data transfer, they must be associated with this VPC network. At
   * most, one VPC network will have this field set to true.
   * </pre>
   *
   * <code>
   * bool required_for_new_site_to_site_data_transfer_spokes = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The requiredForNewSiteToSiteDataTransferSpokes.
   */
  @java.lang.Override
  public boolean getRequiredForNewSiteToSiteDataTransferSpokes() {
    return requiredForNewSiteToSiteDataTransferSpokes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    if (requiredForNewSiteToSiteDataTransferSpokes_ != false) {
      output.writeBool(2, requiredForNewSiteToSiteDataTransferSpokes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    if (requiredForNewSiteToSiteDataTransferSpokes_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              2, requiredForNewSiteToSiteDataTransferSpokes_);
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
    if (!(obj instanceof com.google.cloud.networkconnectivity.v1.RoutingVPC)) {
      return super.equals(obj);
    }
    com.google.cloud.networkconnectivity.v1.RoutingVPC other =
        (com.google.cloud.networkconnectivity.v1.RoutingVPC) obj;

    if (!getUri().equals(other.getUri())) return false;
    if (getRequiredForNewSiteToSiteDataTransferSpokes()
        != other.getRequiredForNewSiteToSiteDataTransferSpokes()) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + REQUIRED_FOR_NEW_SITE_TO_SITE_DATA_TRANSFER_SPOKES_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(
                getRequiredForNewSiteToSiteDataTransferSpokes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC parseFrom(
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

  public static Builder newBuilder(com.google.cloud.networkconnectivity.v1.RoutingVPC prototype) {
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
   * RoutingVPC contains information about the VPC networks associated
   * with the spokes of a Network Connectivity Center hub.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkconnectivity.v1.RoutingVPC}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkconnectivity.v1.RoutingVPC)
      com.google.cloud.networkconnectivity.v1.RoutingVPCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_RoutingVPC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_RoutingVPC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkconnectivity.v1.RoutingVPC.class,
              com.google.cloud.networkconnectivity.v1.RoutingVPC.Builder.class);
    }

    // Construct using com.google.cloud.networkconnectivity.v1.RoutingVPC.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uri_ = "";
      requiredForNewSiteToSiteDataTransferSpokes_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_RoutingVPC_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.RoutingVPC getDefaultInstanceForType() {
      return com.google.cloud.networkconnectivity.v1.RoutingVPC.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.RoutingVPC build() {
      com.google.cloud.networkconnectivity.v1.RoutingVPC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.RoutingVPC buildPartial() {
      com.google.cloud.networkconnectivity.v1.RoutingVPC result =
          new com.google.cloud.networkconnectivity.v1.RoutingVPC(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networkconnectivity.v1.RoutingVPC result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requiredForNewSiteToSiteDataTransferSpokes_ =
            requiredForNewSiteToSiteDataTransferSpokes_;
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
      if (other instanceof com.google.cloud.networkconnectivity.v1.RoutingVPC) {
        return mergeFrom((com.google.cloud.networkconnectivity.v1.RoutingVPC) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkconnectivity.v1.RoutingVPC other) {
      if (other == com.google.cloud.networkconnectivity.v1.RoutingVPC.getDefaultInstance())
        return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRequiredForNewSiteToSiteDataTransferSpokes() != false) {
        setRequiredForNewSiteToSiteDataTransferSpokes(
            other.getRequiredForNewSiteToSiteDataTransferSpokes());
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
                uri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                requiredForNewSiteToSiteDataTransferSpokes_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * The URI of the VPC network.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI of the VPC network.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI of the VPC network.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI of the VPC network.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI of the VPC network.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean requiredForNewSiteToSiteDataTransferSpokes_;
    /**
     *
     *
     * <pre>
     * Output only. If true, indicates that this VPC network is currently
     * associated with spokes that use the data transfer feature (spokes where the
     * site_to_site_data_transfer field is set to true). If you create new spokes
     * that use data transfer, they must be associated with this VPC network. At
     * most, one VPC network will have this field set to true.
     * </pre>
     *
     * <code>
     * bool required_for_new_site_to_site_data_transfer_spokes = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The requiredForNewSiteToSiteDataTransferSpokes.
     */
    @java.lang.Override
    public boolean getRequiredForNewSiteToSiteDataTransferSpokes() {
      return requiredForNewSiteToSiteDataTransferSpokes_;
    }
    /**
     *
     *
     * <pre>
     * Output only. If true, indicates that this VPC network is currently
     * associated with spokes that use the data transfer feature (spokes where the
     * site_to_site_data_transfer field is set to true). If you create new spokes
     * that use data transfer, they must be associated with this VPC network. At
     * most, one VPC network will have this field set to true.
     * </pre>
     *
     * <code>
     * bool required_for_new_site_to_site_data_transfer_spokes = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The requiredForNewSiteToSiteDataTransferSpokes to set.
     * @return This builder for chaining.
     */
    public Builder setRequiredForNewSiteToSiteDataTransferSpokes(boolean value) {

      requiredForNewSiteToSiteDataTransferSpokes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If true, indicates that this VPC network is currently
     * associated with spokes that use the data transfer feature (spokes where the
     * site_to_site_data_transfer field is set to true). If you create new spokes
     * that use data transfer, they must be associated with this VPC network. At
     * most, one VPC network will have this field set to true.
     * </pre>
     *
     * <code>
     * bool required_for_new_site_to_site_data_transfer_spokes = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequiredForNewSiteToSiteDataTransferSpokes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requiredForNewSiteToSiteDataTransferSpokes_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkconnectivity.v1.RoutingVPC)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkconnectivity.v1.RoutingVPC)
  private static final com.google.cloud.networkconnectivity.v1.RoutingVPC DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkconnectivity.v1.RoutingVPC();
  }

  public static com.google.cloud.networkconnectivity.v1.RoutingVPC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoutingVPC> PARSER =
      new com.google.protobuf.AbstractParser<RoutingVPC>() {
        @java.lang.Override
        public RoutingVPC parsePartialFrom(
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

  public static com.google.protobuf.Parser<RoutingVPC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoutingVPC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.RoutingVPC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
