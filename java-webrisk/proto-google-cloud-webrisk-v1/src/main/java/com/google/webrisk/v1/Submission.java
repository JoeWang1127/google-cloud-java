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
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.3
package com.google.webrisk.v1;

/**
 *
 *
 * <pre>
 * Wraps a URI that might be displaying malicious content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1.Submission}
 */
public final class Submission extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1.Submission)
    SubmissionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Submission.newBuilder() to construct.
  private Submission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Submission() {
    uri_ = "";
    threatTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Submission();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.webrisk.v1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1_Submission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1_Submission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1.Submission.class, com.google.webrisk.v1.Submission.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   *
   *
   * <pre>
   * Required. The URI that is being reported for malicious content to be
   * analyzed.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The URI that is being reported for malicious content to be
   * analyzed.
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int THREAT_TYPES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> threatTypes_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.webrisk.v1.ThreatType>
      threatTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.webrisk.v1.ThreatType>() {
            public com.google.webrisk.v1.ThreatType convert(java.lang.Integer from) {
              com.google.webrisk.v1.ThreatType result =
                  com.google.webrisk.v1.ThreatType.forNumber(from);
              return result == null ? com.google.webrisk.v1.ThreatType.UNRECOGNIZED : result;
            }
          };
  /**
   *
   *
   * <pre>
   * Output only. ThreatTypes found to be associated with the submitted URI
   * after reviewing it. This might be empty if the URI was not added to any
   * list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the threatTypes.
   */
  @java.lang.Override
  public java.util.List<com.google.webrisk.v1.ThreatType> getThreatTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.webrisk.v1.ThreatType>(threatTypes_, threatTypes_converter_);
  }
  /**
   *
   *
   * <pre>
   * Output only. ThreatTypes found to be associated with the submitted URI
   * after reviewing it. This might be empty if the URI was not added to any
   * list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of threatTypes.
   */
  @java.lang.Override
  public int getThreatTypesCount() {
    return threatTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. ThreatTypes found to be associated with the submitted URI
   * after reviewing it. This might be empty if the URI was not added to any
   * list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The threatTypes at the given index.
   */
  @java.lang.Override
  public com.google.webrisk.v1.ThreatType getThreatTypes(int index) {
    return threatTypes_converter_.convert(threatTypes_.get(index));
  }
  /**
   *
   *
   * <pre>
   * Output only. ThreatTypes found to be associated with the submitted URI
   * after reviewing it. This might be empty if the URI was not added to any
   * list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for threatTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getThreatTypesValueList() {
    return threatTypes_;
  }
  /**
   *
   *
   * <pre>
   * Output only. ThreatTypes found to be associated with the submitted URI
   * after reviewing it. This might be empty if the URI was not added to any
   * list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    if (getThreatTypesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(threatTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < threatTypes_.size(); i++) {
      output.writeEnumNoTag(threatTypes_.get(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < threatTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(threatTypes_.get(i));
      }
      size += dataSize;
      if (!getThreatTypesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      threatTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.webrisk.v1.Submission)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1.Submission other = (com.google.webrisk.v1.Submission) obj;

    if (!getUri().equals(other.getUri())) return false;
    if (!threatTypes_.equals(other.threatTypes_)) return false;
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
    if (getThreatTypesCount() > 0) {
      hash = (37 * hash) + THREAT_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + threatTypes_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1.Submission parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.Submission parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.Submission parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.Submission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.Submission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.Submission parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.Submission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.Submission parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1.Submission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.Submission parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1.Submission parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.Submission parseFrom(
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

  public static Builder newBuilder(com.google.webrisk.v1.Submission prototype) {
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
   * Wraps a URI that might be displaying malicious content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1.Submission}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1.Submission)
      com.google.webrisk.v1.SubmissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_Submission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_Submission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1.Submission.class,
              com.google.webrisk.v1.Submission.Builder.class);
    }

    // Construct using com.google.webrisk.v1.Submission.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uri_ = "";
      threatTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_Submission_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1.Submission getDefaultInstanceForType() {
      return com.google.webrisk.v1.Submission.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1.Submission build() {
      com.google.webrisk.v1.Submission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1.Submission buildPartial() {
      com.google.webrisk.v1.Submission result = new com.google.webrisk.v1.Submission(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.webrisk.v1.Submission result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        threatTypes_ = java.util.Collections.unmodifiableList(threatTypes_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.threatTypes_ = threatTypes_;
    }

    private void buildPartial0(com.google.webrisk.v1.Submission result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
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
      if (other instanceof com.google.webrisk.v1.Submission) {
        return mergeFrom((com.google.webrisk.v1.Submission) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1.Submission other) {
      if (other == com.google.webrisk.v1.Submission.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.threatTypes_.isEmpty()) {
        if (threatTypes_.isEmpty()) {
          threatTypes_ = other.threatTypes_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureThreatTypesIsMutable();
          threatTypes_.addAll(other.threatTypes_);
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
                uri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                int tmpRaw = input.readEnum();
                ensureThreatTypesIsMutable();
                threatTypes_.add(tmpRaw);
                break;
              } // case 16
            case 18:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureThreatTypesIsMutable();
                  threatTypes_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * Required. The URI that is being reported for malicious content to be
     * analyzed.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The URI that is being reported for malicious content to be
     * analyzed.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The URI that is being reported for malicious content to be
     * analyzed.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The URI that is being reported for malicious content to be
     * analyzed.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The URI that is being reported for malicious content to be
     * analyzed.
     * </pre>
     *
     * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private java.util.List<java.lang.Integer> threatTypes_ = java.util.Collections.emptyList();

    private void ensureThreatTypesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        threatTypes_ = new java.util.ArrayList<java.lang.Integer>(threatTypes_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the threatTypes.
     */
    public java.util.List<com.google.webrisk.v1.ThreatType> getThreatTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.webrisk.v1.ThreatType>(
          threatTypes_, threatTypes_converter_);
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The count of threatTypes.
     */
    public int getThreatTypesCount() {
      return threatTypes_.size();
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The threatTypes at the given index.
     */
    public com.google.webrisk.v1.ThreatType getThreatTypes(int index) {
      return threatTypes_converter_.convert(threatTypes_.get(index));
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The threatTypes to set.
     * @return This builder for chaining.
     */
    public Builder setThreatTypes(int index, com.google.webrisk.v1.ThreatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureThreatTypesIsMutable();
      threatTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addThreatTypes(com.google.webrisk.v1.ThreatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureThreatTypesIsMutable();
      threatTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllThreatTypes(
        java.lang.Iterable<? extends com.google.webrisk.v1.ThreatType> values) {
      ensureThreatTypesIsMutable();
      for (com.google.webrisk.v1.ThreatType value : values) {
        threatTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThreatTypes() {
      threatTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for threatTypes.
     */
    public java.util.List<java.lang.Integer> getThreatTypesValueList() {
      return java.util.Collections.unmodifiableList(threatTypes_);
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of threatTypes at the given index.
     */
    public int getThreatTypesValue(int index) {
      return threatTypes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for threatTypes to set.
     * @return This builder for chaining.
     */
    public Builder setThreatTypesValue(int index, int value) {
      ensureThreatTypesIsMutable();
      threatTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
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
     *
     *
     * <pre>
     * Output only. ThreatTypes found to be associated with the submitted URI
     * after reviewing it. This might be empty if the URI was not added to any
     * list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The enum numeric values on the wire for threatTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllThreatTypesValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureThreatTypesIsMutable();
      for (int value : values) {
        threatTypes_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1.Submission)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1.Submission)
  private static final com.google.webrisk.v1.Submission DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1.Submission();
  }

  public static com.google.webrisk.v1.Submission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Submission> PARSER =
      new com.google.protobuf.AbstractParser<Submission>() {
        @java.lang.Override
        public Submission parsePartialFrom(
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

  public static com.google.protobuf.Parser<Submission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Submission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1.Submission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
