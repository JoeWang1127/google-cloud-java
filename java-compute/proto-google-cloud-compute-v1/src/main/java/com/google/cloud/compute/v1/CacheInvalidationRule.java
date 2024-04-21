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
 * Protobuf type {@code google.cloud.compute.v1.CacheInvalidationRule}
 */
public final class CacheInvalidationRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.CacheInvalidationRule)
    CacheInvalidationRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CacheInvalidationRule.newBuilder() to construct.
  private CacheInvalidationRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CacheInvalidationRule() {
    host_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CacheInvalidationRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CacheInvalidationRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CacheInvalidationRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.CacheInvalidationRule.class,
            com.google.cloud.compute.v1.CacheInvalidationRule.Builder.class);
  }

  private int bitField0_;
  public static final int HOST_FIELD_NUMBER = 3208616;

  @SuppressWarnings("serial")
  private volatile java.lang.Object host_ = "";
  /**
   *
   *
   * <pre>
   * If set, this invalidation rule will only apply to requests with a Host header matching host.
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return Whether the host field is set.
   */
  @java.lang.Override
  public boolean hasHost() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * If set, this invalidation rule will only apply to requests with a Host header matching host.
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The host.
   */
  @java.lang.Override
  public java.lang.String getHost() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If set, this invalidation rule will only apply to requests with a Host header matching host.
   * </pre>
   *
   * <code>optional string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHostBytes() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 3433509;

  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <code>optional string path = 3433509;</code>
   *
   * @return Whether the path field is set.
   */
  @java.lang.Override
  public boolean hasPath() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string path = 3433509;</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>optional string path = 3433509;</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3208616, host_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3433509, path_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3208616, host_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3433509, path_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.CacheInvalidationRule)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.CacheInvalidationRule other =
        (com.google.cloud.compute.v1.CacheInvalidationRule) obj;

    if (hasHost() != other.hasHost()) return false;
    if (hasHost()) {
      if (!getHost().equals(other.getHost())) return false;
    }
    if (hasPath() != other.hasPath()) return false;
    if (hasPath()) {
      if (!getPath().equals(other.getPath())) return false;
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
    if (hasHost()) {
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
    }
    if (hasPath()) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.CacheInvalidationRule prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.CacheInvalidationRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.CacheInvalidationRule)
      com.google.cloud.compute.v1.CacheInvalidationRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CacheInvalidationRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CacheInvalidationRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.CacheInvalidationRule.class,
              com.google.cloud.compute.v1.CacheInvalidationRule.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.CacheInvalidationRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      host_ = "";
      path_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CacheInvalidationRule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CacheInvalidationRule getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.CacheInvalidationRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CacheInvalidationRule build() {
      com.google.cloud.compute.v1.CacheInvalidationRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CacheInvalidationRule buildPartial() {
      com.google.cloud.compute.v1.CacheInvalidationRule result =
          new com.google.cloud.compute.v1.CacheInvalidationRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.CacheInvalidationRule result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.host_ = host_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.path_ = path_;
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
      if (other instanceof com.google.cloud.compute.v1.CacheInvalidationRule) {
        return mergeFrom((com.google.cloud.compute.v1.CacheInvalidationRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.CacheInvalidationRule other) {
      if (other == com.google.cloud.compute.v1.CacheInvalidationRule.getDefaultInstance())
        return this;
      if (other.hasHost()) {
        host_ = other.host_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPath()) {
        path_ = other.path_;
        bitField0_ |= 0x00000002;
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
            case 25668930:
              {
                host_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 25668930
            case 27468074:
              {
                path_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 27468074
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

    private java.lang.Object host_ = "";
    /**
     *
     *
     * <pre>
     * If set, this invalidation rule will only apply to requests with a Host header matching host.
     * </pre>
     *
     * <code>optional string host = 3208616;</code>
     *
     * @return Whether the host field is set.
     */
    public boolean hasHost() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * If set, this invalidation rule will only apply to requests with a Host header matching host.
     * </pre>
     *
     * <code>optional string host = 3208616;</code>
     *
     * @return The host.
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If set, this invalidation rule will only apply to requests with a Host header matching host.
     * </pre>
     *
     * <code>optional string host = 3208616;</code>
     *
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If set, this invalidation rule will only apply to requests with a Host header matching host.
     * </pre>
     *
     * <code>optional string host = 3208616;</code>
     *
     * @param value The host to set.
     * @return This builder for chaining.
     */
    public Builder setHost(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      host_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, this invalidation rule will only apply to requests with a Host header matching host.
     * </pre>
     *
     * <code>optional string host = 3208616;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHost() {
      host_ = getDefaultInstance().getHost();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, this invalidation rule will only apply to requests with a Host header matching host.
     * </pre>
     *
     * <code>optional string host = 3208616;</code>
     *
     * @param value The bytes for host to set.
     * @return This builder for chaining.
     */
    public Builder setHostBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      host_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>optional string path = 3433509;</code>
     *
     * @return Whether the path field is set.
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string path = 3433509;</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string path = 3433509;</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string path = 3433509;</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      path_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional string path = 3433509;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>optional string path = 3433509;</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      path_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.CacheInvalidationRule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.CacheInvalidationRule)
  private static final com.google.cloud.compute.v1.CacheInvalidationRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.CacheInvalidationRule();
  }

  public static com.google.cloud.compute.v1.CacheInvalidationRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CacheInvalidationRule> PARSER =
      new com.google.protobuf.AbstractParser<CacheInvalidationRule>() {
        @java.lang.Override
        public CacheInvalidationRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<CacheInvalidationRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CacheInvalidationRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.CacheInvalidationRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
