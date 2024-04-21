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
// source: google/cloud/discoveryengine/v1alpha/user_event.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Media-specific user event information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.MediaInfo}
 */
public final class MediaInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.MediaInfo)
    MediaInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MediaInfo.newBuilder() to construct.
  private MediaInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MediaInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MediaInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.UserEventProto
        .internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.UserEventProto
        .internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.MediaInfo.class,
            com.google.cloud.discoveryengine.v1alpha.MediaInfo.Builder.class);
  }

  private int bitField0_;
  public static final int MEDIA_PROGRESS_DURATION_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration mediaProgressDuration_;
  /**
   *
   *
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   *
   * @return Whether the mediaProgressDuration field is set.
   */
  @java.lang.Override
  public boolean hasMediaProgressDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   *
   * @return The mediaProgressDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMediaProgressDuration() {
    return mediaProgressDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : mediaProgressDuration_;
  }
  /**
   *
   *
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMediaProgressDurationOrBuilder() {
    return mediaProgressDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : mediaProgressDuration_;
  }

  public static final int MEDIA_PROGRESS_PERCENTAGE_FIELD_NUMBER = 2;
  private float mediaProgressPercentage_ = 0F;
  /**
   *
   *
   * <pre>
   * Media progress should be computed using only the
   * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
   * relative to the media total length.
   *
   * This value must be between `[0, 1.0]` inclusive.
   *
   * If this is not a playback or the progress cannot be computed (e.g. ongoing
   * livestream), this field should be unset.
   * </pre>
   *
   * <code>optional float media_progress_percentage = 2;</code>
   *
   * @return Whether the mediaProgressPercentage field is set.
   */
  @java.lang.Override
  public boolean hasMediaProgressPercentage() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Media progress should be computed using only the
   * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
   * relative to the media total length.
   *
   * This value must be between `[0, 1.0]` inclusive.
   *
   * If this is not a playback or the progress cannot be computed (e.g. ongoing
   * livestream), this field should be unset.
   * </pre>
   *
   * <code>optional float media_progress_percentage = 2;</code>
   *
   * @return The mediaProgressPercentage.
   */
  @java.lang.Override
  public float getMediaProgressPercentage() {
    return mediaProgressPercentage_;
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
      output.writeMessage(1, getMediaProgressDuration());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(2, mediaProgressPercentage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMediaProgressDuration());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, mediaProgressPercentage_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.MediaInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.MediaInfo other =
        (com.google.cloud.discoveryengine.v1alpha.MediaInfo) obj;

    if (hasMediaProgressDuration() != other.hasMediaProgressDuration()) return false;
    if (hasMediaProgressDuration()) {
      if (!getMediaProgressDuration().equals(other.getMediaProgressDuration())) return false;
    }
    if (hasMediaProgressPercentage() != other.hasMediaProgressPercentage()) return false;
    if (hasMediaProgressPercentage()) {
      if (java.lang.Float.floatToIntBits(getMediaProgressPercentage())
          != java.lang.Float.floatToIntBits(other.getMediaProgressPercentage())) return false;
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
    if (hasMediaProgressDuration()) {
      hash = (37 * hash) + MEDIA_PROGRESS_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMediaProgressDuration().hashCode();
    }
    if (hasMediaProgressPercentage()) {
      hash = (37 * hash) + MEDIA_PROGRESS_PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getMediaProgressPercentage());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.discoveryengine.v1alpha.MediaInfo prototype) {
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
   * Media-specific user event information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.MediaInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.MediaInfo)
      com.google.cloud.discoveryengine.v1alpha.MediaInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.UserEventProto
          .internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.UserEventProto
          .internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.MediaInfo.class,
              com.google.cloud.discoveryengine.v1alpha.MediaInfo.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.MediaInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMediaProgressDurationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mediaProgressDuration_ = null;
      if (mediaProgressDurationBuilder_ != null) {
        mediaProgressDurationBuilder_.dispose();
        mediaProgressDurationBuilder_ = null;
      }
      mediaProgressPercentage_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.UserEventProto
          .internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.MediaInfo getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.MediaInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.MediaInfo build() {
      com.google.cloud.discoveryengine.v1alpha.MediaInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.MediaInfo buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.MediaInfo result =
          new com.google.cloud.discoveryengine.v1alpha.MediaInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1alpha.MediaInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mediaProgressDuration_ =
            mediaProgressDurationBuilder_ == null
                ? mediaProgressDuration_
                : mediaProgressDurationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mediaProgressPercentage_ = mediaProgressPercentage_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.MediaInfo) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.MediaInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.MediaInfo other) {
      if (other == com.google.cloud.discoveryengine.v1alpha.MediaInfo.getDefaultInstance())
        return this;
      if (other.hasMediaProgressDuration()) {
        mergeMediaProgressDuration(other.getMediaProgressDuration());
      }
      if (other.hasMediaProgressPercentage()) {
        setMediaProgressPercentage(other.getMediaProgressPercentage());
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
                input.readMessage(
                    getMediaProgressDurationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 21:
              {
                mediaProgressPercentage_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
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

    private com.google.protobuf.Duration mediaProgressDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        mediaProgressDurationBuilder_;
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     *
     * @return Whether the mediaProgressDuration field is set.
     */
    public boolean hasMediaProgressDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     *
     * @return The mediaProgressDuration.
     */
    public com.google.protobuf.Duration getMediaProgressDuration() {
      if (mediaProgressDurationBuilder_ == null) {
        return mediaProgressDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : mediaProgressDuration_;
      } else {
        return mediaProgressDurationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    public Builder setMediaProgressDuration(com.google.protobuf.Duration value) {
      if (mediaProgressDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mediaProgressDuration_ = value;
      } else {
        mediaProgressDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    public Builder setMediaProgressDuration(com.google.protobuf.Duration.Builder builderForValue) {
      if (mediaProgressDurationBuilder_ == null) {
        mediaProgressDuration_ = builderForValue.build();
      } else {
        mediaProgressDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    public Builder mergeMediaProgressDuration(com.google.protobuf.Duration value) {
      if (mediaProgressDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && mediaProgressDuration_ != null
            && mediaProgressDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getMediaProgressDurationBuilder().mergeFrom(value);
        } else {
          mediaProgressDuration_ = value;
        }
      } else {
        mediaProgressDurationBuilder_.mergeFrom(value);
      }
      if (mediaProgressDuration_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    public Builder clearMediaProgressDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mediaProgressDuration_ = null;
      if (mediaProgressDurationBuilder_ != null) {
        mediaProgressDurationBuilder_.dispose();
        mediaProgressDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getMediaProgressDurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMediaProgressDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getMediaProgressDurationOrBuilder() {
      if (mediaProgressDurationBuilder_ != null) {
        return mediaProgressDurationBuilder_.getMessageOrBuilder();
      } else {
        return mediaProgressDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : mediaProgressDuration_;
      }
    }
    /**
     *
     *
     * <pre>
     * The media progress time in seconds, if applicable.
     * For example, if the end user has finished 90 seconds of a playback video,
     * then
     * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
     * should be set to 90.
     * </pre>
     *
     * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getMediaProgressDurationFieldBuilder() {
      if (mediaProgressDurationBuilder_ == null) {
        mediaProgressDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getMediaProgressDuration(), getParentForChildren(), isClean());
        mediaProgressDuration_ = null;
      }
      return mediaProgressDurationBuilder_;
    }

    private float mediaProgressPercentage_;
    /**
     *
     *
     * <pre>
     * Media progress should be computed using only the
     * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
     * relative to the media total length.
     *
     * This value must be between `[0, 1.0]` inclusive.
     *
     * If this is not a playback or the progress cannot be computed (e.g. ongoing
     * livestream), this field should be unset.
     * </pre>
     *
     * <code>optional float media_progress_percentage = 2;</code>
     *
     * @return Whether the mediaProgressPercentage field is set.
     */
    @java.lang.Override
    public boolean hasMediaProgressPercentage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Media progress should be computed using only the
     * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
     * relative to the media total length.
     *
     * This value must be between `[0, 1.0]` inclusive.
     *
     * If this is not a playback or the progress cannot be computed (e.g. ongoing
     * livestream), this field should be unset.
     * </pre>
     *
     * <code>optional float media_progress_percentage = 2;</code>
     *
     * @return The mediaProgressPercentage.
     */
    @java.lang.Override
    public float getMediaProgressPercentage() {
      return mediaProgressPercentage_;
    }
    /**
     *
     *
     * <pre>
     * Media progress should be computed using only the
     * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
     * relative to the media total length.
     *
     * This value must be between `[0, 1.0]` inclusive.
     *
     * If this is not a playback or the progress cannot be computed (e.g. ongoing
     * livestream), this field should be unset.
     * </pre>
     *
     * <code>optional float media_progress_percentage = 2;</code>
     *
     * @param value The mediaProgressPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setMediaProgressPercentage(float value) {

      mediaProgressPercentage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Media progress should be computed using only the
     * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
     * relative to the media total length.
     *
     * This value must be between `[0, 1.0]` inclusive.
     *
     * If this is not a playback or the progress cannot be computed (e.g. ongoing
     * livestream), this field should be unset.
     * </pre>
     *
     * <code>optional float media_progress_percentage = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMediaProgressPercentage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mediaProgressPercentage_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.MediaInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.MediaInfo)
  private static final com.google.cloud.discoveryengine.v1alpha.MediaInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.MediaInfo();
  }

  public static com.google.cloud.discoveryengine.v1alpha.MediaInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaInfo> PARSER =
      new com.google.protobuf.AbstractParser<MediaInfo>() {
        @java.lang.Override
        public MediaInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<MediaInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.MediaInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
