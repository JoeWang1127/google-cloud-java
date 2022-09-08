// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.PacketMirroringNetworkInfo}
 */
public final class PacketMirroringNetworkInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.PacketMirroringNetworkInfo)
    PacketMirroringNetworkInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PacketMirroringNetworkInfo.newBuilder() to construct.
  private PacketMirroringNetworkInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PacketMirroringNetworkInfo() {
    canonicalUrl_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PacketMirroringNetworkInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PacketMirroringNetworkInfo(
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
          case 928634: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            url_ = s;
            break;
          }
          case -196608734: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            canonicalUrl_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PacketMirroringNetworkInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PacketMirroringNetworkInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.PacketMirroringNetworkInfo.class, com.google.cloud.compute.v1.PacketMirroringNetworkInfo.Builder.class);
  }

  private int bitField0_;
  public static final int CANONICAL_URL_FIELD_NUMBER = 512294820;
  private volatile java.lang.Object canonicalUrl_;
  /**
   * <pre>
   * [Output Only] Unique identifier for the network; defined by the server.
   * </pre>
   *
   * <code>optional string canonical_url = 512294820;</code>
   * @return Whether the canonicalUrl field is set.
   */
  @java.lang.Override
  public boolean hasCanonicalUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Unique identifier for the network; defined by the server.
   * </pre>
   *
   * <code>optional string canonical_url = 512294820;</code>
   * @return The canonicalUrl.
   */
  @java.lang.Override
  public java.lang.String getCanonicalUrl() {
    java.lang.Object ref = canonicalUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      canonicalUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] Unique identifier for the network; defined by the server.
   * </pre>
   *
   * <code>optional string canonical_url = 512294820;</code>
   * @return The bytes for canonicalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCanonicalUrlBytes() {
    java.lang.Object ref = canonicalUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      canonicalUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 116079;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * URL of the network resource.
   * </pre>
   *
   * <code>optional string url = 116079;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * URL of the network resource.
   * </pre>
   *
   * <code>optional string url = 116079;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL of the network resource.
   * </pre>
   *
   * <code>optional string url = 116079;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 116079, url_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 512294820, canonicalUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(116079, url_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(512294820, canonicalUrl_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.PacketMirroringNetworkInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.PacketMirroringNetworkInfo other = (com.google.cloud.compute.v1.PacketMirroringNetworkInfo) obj;

    if (hasCanonicalUrl() != other.hasCanonicalUrl()) return false;
    if (hasCanonicalUrl()) {
      if (!getCanonicalUrl()
          .equals(other.getCanonicalUrl())) return false;
    }
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
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
    if (hasCanonicalUrl()) {
      hash = (37 * hash) + CANONICAL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getCanonicalUrl().hashCode();
    }
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.compute.v1.PacketMirroringNetworkInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.PacketMirroringNetworkInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.PacketMirroringNetworkInfo)
      com.google.cloud.compute.v1.PacketMirroringNetworkInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PacketMirroringNetworkInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PacketMirroringNetworkInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.PacketMirroringNetworkInfo.class, com.google.cloud.compute.v1.PacketMirroringNetworkInfo.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.PacketMirroringNetworkInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      canonicalUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PacketMirroringNetworkInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PacketMirroringNetworkInfo getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.PacketMirroringNetworkInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PacketMirroringNetworkInfo build() {
      com.google.cloud.compute.v1.PacketMirroringNetworkInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PacketMirroringNetworkInfo buildPartial() {
      com.google.cloud.compute.v1.PacketMirroringNetworkInfo result = new com.google.cloud.compute.v1.PacketMirroringNetworkInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.canonicalUrl_ = canonicalUrl_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.url_ = url_;
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.PacketMirroringNetworkInfo) {
        return mergeFrom((com.google.cloud.compute.v1.PacketMirroringNetworkInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.PacketMirroringNetworkInfo other) {
      if (other == com.google.cloud.compute.v1.PacketMirroringNetworkInfo.getDefaultInstance()) return this;
      if (other.hasCanonicalUrl()) {
        bitField0_ |= 0x00000001;
        canonicalUrl_ = other.canonicalUrl_;
        onChanged();
      }
      if (other.hasUrl()) {
        bitField0_ |= 0x00000002;
        url_ = other.url_;
        onChanged();
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
      com.google.cloud.compute.v1.PacketMirroringNetworkInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.PacketMirroringNetworkInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object canonicalUrl_ = "";
    /**
     * <pre>
     * [Output Only] Unique identifier for the network; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     * @return Whether the canonicalUrl field is set.
     */
    public boolean hasCanonicalUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Unique identifier for the network; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     * @return The canonicalUrl.
     */
    public java.lang.String getCanonicalUrl() {
      java.lang.Object ref = canonicalUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        canonicalUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] Unique identifier for the network; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     * @return The bytes for canonicalUrl.
     */
    public com.google.protobuf.ByteString
        getCanonicalUrlBytes() {
      java.lang.Object ref = canonicalUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        canonicalUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] Unique identifier for the network; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     * @param value The canonicalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCanonicalUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      canonicalUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Unique identifier for the network; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     * @return This builder for chaining.
     */
    public Builder clearCanonicalUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      canonicalUrl_ = getDefaultInstance().getCanonicalUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Unique identifier for the network; defined by the server.
     * </pre>
     *
     * <code>optional string canonical_url = 512294820;</code>
     * @param value The bytes for canonicalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCanonicalUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      canonicalUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * URL of the network resource.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * URL of the network resource.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL of the network resource.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL of the network resource.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of the network resource.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of the network resource.
     * </pre>
     *
     * <code>optional string url = 116079;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      url_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.PacketMirroringNetworkInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.PacketMirroringNetworkInfo)
  private static final com.google.cloud.compute.v1.PacketMirroringNetworkInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.PacketMirroringNetworkInfo();
  }

  public static com.google.cloud.compute.v1.PacketMirroringNetworkInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PacketMirroringNetworkInfo>
      PARSER = new com.google.protobuf.AbstractParser<PacketMirroringNetworkInfo>() {
    @java.lang.Override
    public PacketMirroringNetworkInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PacketMirroringNetworkInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PacketMirroringNetworkInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PacketMirroringNetworkInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.PacketMirroringNetworkInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
