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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

/**
 *
 *
 * <pre>
 * Properties of the audio format.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.AudioFormat}
 */
public final class AudioFormat extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.AudioFormat)
    AudioFormatOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AudioFormat.newBuilder() to construct.
  private AudioFormat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AudioFormat() {
    codec_ = "";
    channelLayout_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AudioFormat();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AudioFormat(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              codec_ = s;
              break;
            }
          case 16:
            {
              channelCount_ = input.readInt32();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                channelLayout_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              channelLayout_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        channelLayout_ = channelLayout_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_AudioFormat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_AudioFormat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.AudioFormat.class,
            com.google.cloud.video.livestream.v1.AudioFormat.Builder.class);
  }

  public static final int CODEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object codec_;
  /**
   *
   *
   * <pre>
   * Audio codec used in this audio stream.
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The codec.
   */
  @java.lang.Override
  public java.lang.String getCodec() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codec_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Audio codec used in this audio stream.
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The bytes for codec.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCodecBytes() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      codec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_COUNT_FIELD_NUMBER = 2;
  private int channelCount_;
  /**
   *
   *
   * <pre>
   * The number of audio channels.
   * </pre>
   *
   * <code>int32 channel_count = 2;</code>
   *
   * @return The channelCount.
   */
  @java.lang.Override
  public int getChannelCount() {
    return channelCount_;
  }

  public static final int CHANNEL_LAYOUT_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList channelLayout_;
  /**
   *
   *
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   *
   * @return A list containing the channelLayout.
   */
  public com.google.protobuf.ProtocolStringList getChannelLayoutList() {
    return channelLayout_;
  }
  /**
   *
   *
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   *
   * @return The count of channelLayout.
   */
  public int getChannelLayoutCount() {
    return channelLayout_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The channelLayout at the given index.
   */
  public java.lang.String getChannelLayout(int index) {
    return channelLayout_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of channel names specifying the layout of the audio channels.
   * </pre>
   *
   * <code>repeated string channel_layout = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the channelLayout at the given index.
   */
  public com.google.protobuf.ByteString getChannelLayoutBytes(int index) {
    return channelLayout_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codec_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codec_);
    }
    if (channelCount_ != 0) {
      output.writeInt32(2, channelCount_);
    }
    for (int i = 0; i < channelLayout_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, channelLayout_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codec_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, codec_);
    }
    if (channelCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, channelCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < channelLayout_.size(); i++) {
        dataSize += computeStringSizeNoTag(channelLayout_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getChannelLayoutList().size();
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
    if (!(obj instanceof com.google.cloud.video.livestream.v1.AudioFormat)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.AudioFormat other =
        (com.google.cloud.video.livestream.v1.AudioFormat) obj;

    if (!getCodec().equals(other.getCodec())) return false;
    if (getChannelCount() != other.getChannelCount()) return false;
    if (!getChannelLayoutList().equals(other.getChannelLayoutList())) return false;
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
    hash = (37 * hash) + CODEC_FIELD_NUMBER;
    hash = (53 * hash) + getCodec().hashCode();
    hash = (37 * hash) + CHANNEL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getChannelCount();
    if (getChannelLayoutCount() > 0) {
      hash = (37 * hash) + CHANNEL_LAYOUT_FIELD_NUMBER;
      hash = (53 * hash) + getChannelLayoutList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat parseFrom(
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

  public static Builder newBuilder(com.google.cloud.video.livestream.v1.AudioFormat prototype) {
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
   * Properties of the audio format.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.AudioFormat}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.AudioFormat)
      com.google.cloud.video.livestream.v1.AudioFormatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_AudioFormat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_AudioFormat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.AudioFormat.class,
              com.google.cloud.video.livestream.v1.AudioFormat.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.AudioFormat.newBuilder()
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
      codec_ = "";

      channelCount_ = 0;

      channelLayout_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_AudioFormat_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.AudioFormat getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.AudioFormat.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.AudioFormat build() {
      com.google.cloud.video.livestream.v1.AudioFormat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.AudioFormat buildPartial() {
      com.google.cloud.video.livestream.v1.AudioFormat result =
          new com.google.cloud.video.livestream.v1.AudioFormat(this);
      int from_bitField0_ = bitField0_;
      result.codec_ = codec_;
      result.channelCount_ = channelCount_;
      if (((bitField0_ & 0x00000001) != 0)) {
        channelLayout_ = channelLayout_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.channelLayout_ = channelLayout_;
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
      if (other instanceof com.google.cloud.video.livestream.v1.AudioFormat) {
        return mergeFrom((com.google.cloud.video.livestream.v1.AudioFormat) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.AudioFormat other) {
      if (other == com.google.cloud.video.livestream.v1.AudioFormat.getDefaultInstance())
        return this;
      if (!other.getCodec().isEmpty()) {
        codec_ = other.codec_;
        onChanged();
      }
      if (other.getChannelCount() != 0) {
        setChannelCount(other.getChannelCount());
      }
      if (!other.channelLayout_.isEmpty()) {
        if (channelLayout_.isEmpty()) {
          channelLayout_ = other.channelLayout_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureChannelLayoutIsMutable();
          channelLayout_.addAll(other.channelLayout_);
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
      com.google.cloud.video.livestream.v1.AudioFormat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.video.livestream.v1.AudioFormat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object codec_ = "";
    /**
     *
     *
     * <pre>
     * Audio codec used in this audio stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @return The codec.
     */
    public java.lang.String getCodec() {
      java.lang.Object ref = codec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codec_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Audio codec used in this audio stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @return The bytes for codec.
     */
    public com.google.protobuf.ByteString getCodecBytes() {
      java.lang.Object ref = codec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        codec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Audio codec used in this audio stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @param value The codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodec(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      codec_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Audio codec used in this audio stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCodec() {

      codec_ = getDefaultInstance().getCodec();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Audio codec used in this audio stream.
     * </pre>
     *
     * <code>string codec = 1;</code>
     *
     * @param value The bytes for codec to set.
     * @return This builder for chaining.
     */
    public Builder setCodecBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      codec_ = value;
      onChanged();
      return this;
    }

    private int channelCount_;
    /**
     *
     *
     * <pre>
     * The number of audio channels.
     * </pre>
     *
     * <code>int32 channel_count = 2;</code>
     *
     * @return The channelCount.
     */
    @java.lang.Override
    public int getChannelCount() {
      return channelCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of audio channels.
     * </pre>
     *
     * <code>int32 channel_count = 2;</code>
     *
     * @param value The channelCount to set.
     * @return This builder for chaining.
     */
    public Builder setChannelCount(int value) {

      channelCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of audio channels.
     * </pre>
     *
     * <code>int32 channel_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearChannelCount() {

      channelCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList channelLayout_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureChannelLayoutIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        channelLayout_ = new com.google.protobuf.LazyStringArrayList(channelLayout_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @return A list containing the channelLayout.
     */
    public com.google.protobuf.ProtocolStringList getChannelLayoutList() {
      return channelLayout_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @return The count of channelLayout.
     */
    public int getChannelLayoutCount() {
      return channelLayout_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The channelLayout at the given index.
     */
    public java.lang.String getChannelLayout(int index) {
      return channelLayout_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the channelLayout at the given index.
     */
    public com.google.protobuf.ByteString getChannelLayoutBytes(int index) {
      return channelLayout_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The channelLayout to set.
     * @return This builder for chaining.
     */
    public Builder setChannelLayout(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureChannelLayoutIsMutable();
      channelLayout_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @param value The channelLayout to add.
     * @return This builder for chaining.
     */
    public Builder addChannelLayout(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureChannelLayoutIsMutable();
      channelLayout_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @param values The channelLayout to add.
     * @return This builder for chaining.
     */
    public Builder addAllChannelLayout(java.lang.Iterable<java.lang.String> values) {
      ensureChannelLayoutIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, channelLayout_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearChannelLayout() {
      channelLayout_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of channel names specifying the layout of the audio channels.
     * </pre>
     *
     * <code>repeated string channel_layout = 3;</code>
     *
     * @param value The bytes of the channelLayout to add.
     * @return This builder for chaining.
     */
    public Builder addChannelLayoutBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureChannelLayoutIsMutable();
      channelLayout_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.AudioFormat)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.AudioFormat)
  private static final com.google.cloud.video.livestream.v1.AudioFormat DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.AudioFormat();
  }

  public static com.google.cloud.video.livestream.v1.AudioFormat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudioFormat> PARSER =
      new com.google.protobuf.AbstractParser<AudioFormat>() {
        @java.lang.Override
        public AudioFormat parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AudioFormat(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AudioFormat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudioFormat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.AudioFormat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
