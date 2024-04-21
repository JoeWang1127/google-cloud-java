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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange}
 */
public final class InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
    InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.newBuilder() to construct.
  private InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1
                .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.class,
            com.google.cloud.compute.v1
                .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_FIELD_NUMBER = 107876;
  private int max_ = 0;
  /**
   * <code>optional uint32 max = 107876;</code>
   *
   * @return Whether the max field is set.
   */
  @java.lang.Override
  public boolean hasMax() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional uint32 max = 107876;</code>
   *
   * @return The max.
   */
  @java.lang.Override
  public int getMax() {
    return max_;
  }

  public static final int MIN_FIELD_NUMBER = 108114;
  private int min_ = 0;
  /**
   * <code>optional uint32 min = 108114;</code>
   *
   * @return Whether the min field is set.
   */
  @java.lang.Override
  public boolean hasMin() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint32 min = 108114;</code>
   *
   * @return The min.
   */
  @java.lang.Override
  public int getMin() {
    return min_;
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
      output.writeUInt32(107876, max_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(108114, min_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(107876, max_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(108114, min_);
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
    if (!(obj
        instanceof
        com.google.cloud.compute.v1
            .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
        other =
            (com.google.cloud.compute.v1
                    .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
                obj;

    if (hasMax() != other.hasMax()) return false;
    if (hasMax()) {
      if (getMax() != other.getMax()) return false;
    }
    if (hasMin() != other.hasMin()) return false;
    if (hasMin()) {
      if (getMin() != other.getMin()) return false;
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
    if (hasMax()) {
      hash = (37 * hash) + MAX_FIELD_NUMBER;
      hash = (53 * hash) + getMax();
    }
    if (hasMin()) {
      hash = (37 * hash) + MIN_FIELD_NUMBER;
      hash = (53 * hash) + getMin();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      parseFrom(
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
      com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
          prototype) {
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
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
      com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1
                  .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.class,
              com.google.cloud.compute.v1
                  .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      max_ = 0;
      min_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
        build() {
      com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
        buildPartial() {
      com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
          result =
              new com.google.cloud.compute.v1
                  .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
            result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.max_ = max_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.min_ = min_;
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
      if (other
          instanceof
          com.google.cloud.compute.v1
              .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange) {
        return mergeFrom(
            (com.google.cloud.compute.v1
                    .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
            other) {
      if (other
          == com.google.cloud.compute.v1
              .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange.getDefaultInstance())
        return this;
      if (other.hasMax()) {
        setMax(other.getMax());
      }
      if (other.hasMin()) {
        setMin(other.getMin());
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
            case 863008:
              {
                max_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 863008
            case 864912:
              {
                min_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 864912
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

    private int max_;
    /**
     * <code>optional uint32 max = 107876;</code>
     *
     * @return Whether the max field is set.
     */
    @java.lang.Override
    public boolean hasMax() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 max = 107876;</code>
     *
     * @return The max.
     */
    @java.lang.Override
    public int getMax() {
      return max_;
    }
    /**
     * <code>optional uint32 max = 107876;</code>
     *
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(int value) {

      max_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 max = 107876;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      bitField0_ = (bitField0_ & ~0x00000001);
      max_ = 0;
      onChanged();
      return this;
    }

    private int min_;
    /**
     * <code>optional uint32 min = 108114;</code>
     *
     * @return Whether the min field is set.
     */
    @java.lang.Override
    public boolean hasMin() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 min = 108114;</code>
     *
     * @return The min.
     */
    @java.lang.Override
    public int getMin() {
      return min_;
    }
    /**
     * <code>optional uint32 min = 108114;</code>
     *
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(int value) {

      min_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 min = 108114;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      bitField0_ = (bitField0_ & ~0x00000002);
      min_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
  private static final com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1
            .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange();
  }

  public static com.google.cloud.compute.v1
          .InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange>
      PARSER =
          new com.google.protobuf.AbstractParser<
              InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange>() {
            @java.lang.Override
            public InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<
          InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
