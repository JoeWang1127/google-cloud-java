// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

/**
 * <pre>
 * Request to return full hashes matched by the provided hash prefixes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1beta1.SearchHashesRequest}
 */
public final class SearchHashesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1beta1.SearchHashesRequest)
    SearchHashesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchHashesRequest.newBuilder() to construct.
  private SearchHashesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchHashesRequest() {
    hashPrefix_ = com.google.protobuf.ByteString.EMPTY;
    threatTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchHashesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchHashesRequest(
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
          case 10: {

            hashPrefix_ = input.readBytes();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              threatTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            threatTypes_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                threatTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              threatTypes_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        threatTypes_ = java.util.Collections.unmodifiableList(threatTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1beta1.SearchHashesRequest.class, com.google.webrisk.v1beta1.SearchHashesRequest.Builder.class);
  }

  public static final int HASH_PREFIX_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString hashPrefix_;
  /**
   * <pre>
   * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
   * hash. For JSON requests, this field is base64-encoded.
   * </pre>
   *
   * <code>bytes hash_prefix = 1;</code>
   * @return The hashPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHashPrefix() {
    return hashPrefix_;
  }

  public static final int THREAT_TYPES_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> threatTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.webrisk.v1beta1.ThreatType> threatTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.webrisk.v1beta1.ThreatType>() {
            public com.google.webrisk.v1beta1.ThreatType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.webrisk.v1beta1.ThreatType result = com.google.webrisk.v1beta1.ThreatType.valueOf(from);
              return result == null ? com.google.webrisk.v1beta1.ThreatType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the threatTypes.
   */
  @java.lang.Override
  public java.util.List<com.google.webrisk.v1beta1.ThreatType> getThreatTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.webrisk.v1beta1.ThreatType>(threatTypes_, threatTypes_converter_);
  }
  /**
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of threatTypes.
   */
  @java.lang.Override
  public int getThreatTypesCount() {
    return threatTypes_.size();
  }
  /**
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The threatTypes at the given index.
   */
  @java.lang.Override
  public com.google.webrisk.v1beta1.ThreatType getThreatTypes(int index) {
    return threatTypes_converter_.convert(threatTypes_.get(index));
  }
  /**
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for threatTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getThreatTypesValueList() {
    return threatTypes_;
  }
  /**
   * <pre>
   * Required. The ThreatLists to search in.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of threatTypes at the given index.
   */
  @java.lang.Override
  public int getThreatTypesValue(int index) {
    return threatTypes_.get(index);
  }
  private int threatTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (!hashPrefix_.isEmpty()) {
      output.writeBytes(1, hashPrefix_);
    }
    if (getThreatTypesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(threatTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < threatTypes_.size(); i++) {
      output.writeEnumNoTag(threatTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!hashPrefix_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, hashPrefix_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < threatTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(threatTypes_.get(i));
      }
      size += dataSize;
      if (!getThreatTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }threatTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.webrisk.v1beta1.SearchHashesRequest)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1beta1.SearchHashesRequest other = (com.google.webrisk.v1beta1.SearchHashesRequest) obj;

    if (!getHashPrefix()
        .equals(other.getHashPrefix())) return false;
    if (!threatTypes_.equals(other.threatTypes_)) return false;
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
    hash = (37 * hash) + HASH_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getHashPrefix().hashCode();
    if (getThreatTypesCount() > 0) {
      hash = (37 * hash) + THREAT_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + threatTypes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1beta1.SearchHashesRequest parseFrom(
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
  public static Builder newBuilder(com.google.webrisk.v1beta1.SearchHashesRequest prototype) {
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
   * Request to return full hashes matched by the provided hash prefixes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1beta1.SearchHashesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1beta1.SearchHashesRequest)
      com.google.webrisk.v1beta1.SearchHashesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1beta1.SearchHashesRequest.class, com.google.webrisk.v1beta1.SearchHashesRequest.Builder.class);
    }

    // Construct using com.google.webrisk.v1beta1.SearchHashesRequest.newBuilder()
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
      hashPrefix_ = com.google.protobuf.ByteString.EMPTY;

      threatTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.webrisk.v1beta1.WebRiskProto.internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.SearchHashesRequest getDefaultInstanceForType() {
      return com.google.webrisk.v1beta1.SearchHashesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.SearchHashesRequest build() {
      com.google.webrisk.v1beta1.SearchHashesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.SearchHashesRequest buildPartial() {
      com.google.webrisk.v1beta1.SearchHashesRequest result = new com.google.webrisk.v1beta1.SearchHashesRequest(this);
      int from_bitField0_ = bitField0_;
      result.hashPrefix_ = hashPrefix_;
      if (((bitField0_ & 0x00000001) != 0)) {
        threatTypes_ = java.util.Collections.unmodifiableList(threatTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.threatTypes_ = threatTypes_;
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
      if (other instanceof com.google.webrisk.v1beta1.SearchHashesRequest) {
        return mergeFrom((com.google.webrisk.v1beta1.SearchHashesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1beta1.SearchHashesRequest other) {
      if (other == com.google.webrisk.v1beta1.SearchHashesRequest.getDefaultInstance()) return this;
      if (other.getHashPrefix() != com.google.protobuf.ByteString.EMPTY) {
        setHashPrefix(other.getHashPrefix());
      }
      if (!other.threatTypes_.isEmpty()) {
        if (threatTypes_.isEmpty()) {
          threatTypes_ = other.threatTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureThreatTypesIsMutable();
          threatTypes_.addAll(other.threatTypes_);
        }
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
      com.google.webrisk.v1beta1.SearchHashesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.webrisk.v1beta1.SearchHashesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString hashPrefix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
     * hash. For JSON requests, this field is base64-encoded.
     * </pre>
     *
     * <code>bytes hash_prefix = 1;</code>
     * @return The hashPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHashPrefix() {
      return hashPrefix_;
    }
    /**
     * <pre>
     * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
     * hash. For JSON requests, this field is base64-encoded.
     * </pre>
     *
     * <code>bytes hash_prefix = 1;</code>
     * @param value The hashPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setHashPrefix(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hashPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
     * hash. For JSON requests, this field is base64-encoded.
     * </pre>
     *
     * <code>bytes hash_prefix = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHashPrefix() {
      
      hashPrefix_ = getDefaultInstance().getHashPrefix();
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> threatTypes_ =
      java.util.Collections.emptyList();
    private void ensureThreatTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        threatTypes_ = new java.util.ArrayList<java.lang.Integer>(threatTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the threatTypes.
     */
    public java.util.List<com.google.webrisk.v1beta1.ThreatType> getThreatTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.webrisk.v1beta1.ThreatType>(threatTypes_, threatTypes_converter_);
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of threatTypes.
     */
    public int getThreatTypesCount() {
      return threatTypes_.size();
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The threatTypes at the given index.
     */
    public com.google.webrisk.v1beta1.ThreatType getThreatTypes(int index) {
      return threatTypes_converter_.convert(threatTypes_.get(index));
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The threatTypes to set.
     * @return This builder for chaining.
     */
    public Builder setThreatTypes(
        int index, com.google.webrisk.v1beta1.ThreatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureThreatTypesIsMutable();
      threatTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addThreatTypes(com.google.webrisk.v1beta1.ThreatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureThreatTypesIsMutable();
      threatTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllThreatTypes(
        java.lang.Iterable<? extends com.google.webrisk.v1beta1.ThreatType> values) {
      ensureThreatTypesIsMutable();
      for (com.google.webrisk.v1beta1.ThreatType value : values) {
        threatTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearThreatTypes() {
      threatTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the enum numeric values on the wire for threatTypes.
     */
    public java.util.List<java.lang.Integer>
    getThreatTypesValueList() {
      return java.util.Collections.unmodifiableList(threatTypes_);
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of threatTypes at the given index.
     */
    public int getThreatTypesValue(int index) {
      return threatTypes_.get(index);
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for threatTypes to set.
     * @return This builder for chaining.
     */
    public Builder setThreatTypesValue(
        int index, int value) {
      ensureThreatTypesIsMutable();
      threatTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addThreatTypesValue(int value) {
      ensureThreatTypesIsMutable();
      threatTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ThreatLists to search in.
     * </pre>
     *
     * <code>repeated .google.cloud.webrisk.v1beta1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The enum numeric values on the wire for threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllThreatTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureThreatTypesIsMutable();
      for (int value : values) {
        threatTypes_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1beta1.SearchHashesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1beta1.SearchHashesRequest)
  private static final com.google.webrisk.v1beta1.SearchHashesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1beta1.SearchHashesRequest();
  }

  public static com.google.webrisk.v1beta1.SearchHashesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchHashesRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchHashesRequest>() {
    @java.lang.Override
    public SearchHashesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchHashesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchHashesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchHashesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1beta1.SearchHashesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
