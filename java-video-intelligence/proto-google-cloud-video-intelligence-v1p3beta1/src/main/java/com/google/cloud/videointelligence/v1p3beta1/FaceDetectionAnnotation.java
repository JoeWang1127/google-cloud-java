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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1p3beta1;

/**
 *
 *
 * <pre>
 * Face detection annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation}
 */
public final class FaceDetectionAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation)
    FaceDetectionAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FaceDetectionAnnotation.newBuilder() to construct.
  private FaceDetectionAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FaceDetectionAnnotation() {
    tracks_ = java.util.Collections.emptyList();
    thumbnail_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FaceDetectionAnnotation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_FaceDetectionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_FaceDetectionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation.class,
            com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation.Builder.class);
  }

  public static final int TRACKS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> tracks_;
  /**
   *
   *
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> getTracksList() {
    return tracks_;
  }
  /**
   *
   *
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>
      getTracksOrBuilderList() {
    return tracks_;
  }
  /**
   *
   *
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
   */
  @java.lang.Override
  public int getTracksCount() {
    return tracks_.size();
  }
  /**
   *
   *
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.Track getTracks(int index) {
    return tracks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder getTracksOrBuilder(int index) {
    return tracks_.get(index);
  }

  public static final int THUMBNAIL_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString thumbnail_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * The thumbnail of a person's face.
   * </pre>
   *
   * <code>bytes thumbnail = 4;</code>
   *
   * @return The thumbnail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThumbnail() {
    return thumbnail_;
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
    for (int i = 0; i < tracks_.size(); i++) {
      output.writeMessage(3, tracks_.get(i));
    }
    if (!thumbnail_.isEmpty()) {
      output.writeBytes(4, thumbnail_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tracks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, tracks_.get(i));
    }
    if (!thumbnail_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, thumbnail_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation other =
        (com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation) obj;

    if (!getTracksList().equals(other.getTracksList())) return false;
    if (!getThumbnail().equals(other.getThumbnail())) return false;
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
    if (getTracksCount() > 0) {
      hash = (37 * hash) + TRACKS_FIELD_NUMBER;
      hash = (53 * hash) + getTracksList().hashCode();
    }
    hash = (37 * hash) + THUMBNAIL_FIELD_NUMBER;
    hash = (53 * hash) + getThumbnail().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation parseFrom(
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
      com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation prototype) {
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
   * Face detection annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation)
      com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_FaceDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_FaceDetectionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation.class,
              com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation.Builder.class);
    }

    // Construct using
    // com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tracksBuilder_ == null) {
        tracks_ = java.util.Collections.emptyList();
      } else {
        tracks_ = null;
        tracksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      thumbnail_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_FaceDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation build() {
      com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation result =
          new com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation result) {
      if (tracksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tracks_ = java.util.Collections.unmodifiableList(tracks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tracks_ = tracks_;
      } else {
        result.tracks_ = tracksBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.thumbnail_ = thumbnail_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation) {
        return mergeFrom(
            (com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation other) {
      if (other
          == com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
              .getDefaultInstance()) return this;
      if (tracksBuilder_ == null) {
        if (!other.tracks_.isEmpty()) {
          if (tracks_.isEmpty()) {
            tracks_ = other.tracks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTracksIsMutable();
            tracks_.addAll(other.tracks_);
          }
          onChanged();
        }
      } else {
        if (!other.tracks_.isEmpty()) {
          if (tracksBuilder_.isEmpty()) {
            tracksBuilder_.dispose();
            tracksBuilder_ = null;
            tracks_ = other.tracks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tracksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTracksFieldBuilder()
                    : null;
          } else {
            tracksBuilder_.addAllMessages(other.tracks_);
          }
        }
      }
      if (other.getThumbnail() != com.google.protobuf.ByteString.EMPTY) {
        setThumbnail(other.getThumbnail());
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
            case 26:
              {
                com.google.cloud.videointelligence.v1p3beta1.Track m =
                    input.readMessage(
                        com.google.cloud.videointelligence.v1p3beta1.Track.parser(),
                        extensionRegistry);
                if (tracksBuilder_ == null) {
                  ensureTracksIsMutable();
                  tracks_.add(m);
                } else {
                  tracksBuilder_.addMessage(m);
                }
                break;
              } // case 26
            case 34:
              {
                thumbnail_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 34
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

    private java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> tracks_ =
        java.util.Collections.emptyList();

    private void ensureTracksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tracks_ =
            new java.util.ArrayList<com.google.cloud.videointelligence.v1p3beta1.Track>(tracks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p3beta1.Track,
            com.google.cloud.videointelligence.v1p3beta1.Track.Builder,
            com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>
        tracksBuilder_;

    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track> getTracksList() {
      if (tracksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tracks_);
      } else {
        return tracksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public int getTracksCount() {
      if (tracksBuilder_ == null) {
        return tracks_.size();
      } else {
        return tracksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track getTracks(int index) {
      if (tracksBuilder_ == null) {
        return tracks_.get(index);
      } else {
        return tracksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder setTracks(int index, com.google.cloud.videointelligence.v1p3beta1.Track value) {
      if (tracksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracksIsMutable();
        tracks_.set(index, value);
        onChanged();
      } else {
        tracksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder setTracks(
        int index, com.google.cloud.videointelligence.v1p3beta1.Track.Builder builderForValue) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.set(index, builderForValue.build());
        onChanged();
      } else {
        tracksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder addTracks(com.google.cloud.videointelligence.v1p3beta1.Track value) {
      if (tracksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracksIsMutable();
        tracks_.add(value);
        onChanged();
      } else {
        tracksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder addTracks(int index, com.google.cloud.videointelligence.v1p3beta1.Track value) {
      if (tracksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracksIsMutable();
        tracks_.add(index, value);
        onChanged();
      } else {
        tracksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder addTracks(
        com.google.cloud.videointelligence.v1p3beta1.Track.Builder builderForValue) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.add(builderForValue.build());
        onChanged();
      } else {
        tracksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder addTracks(
        int index, com.google.cloud.videointelligence.v1p3beta1.Track.Builder builderForValue) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.add(index, builderForValue.build());
        onChanged();
      } else {
        tracksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder addAllTracks(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1p3beta1.Track> values) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tracks_);
        onChanged();
      } else {
        tracksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder clearTracks() {
      if (tracksBuilder_ == null) {
        tracks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tracksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public Builder removeTracks(int index) {
      if (tracksBuilder_ == null) {
        ensureTracksIsMutable();
        tracks_.remove(index);
        onChanged();
      } else {
        tracksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track.Builder getTracksBuilder(int index) {
      return getTracksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder getTracksOrBuilder(
        int index) {
      if (tracksBuilder_ == null) {
        return tracks_.get(index);
      } else {
        return tracksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public java.util.List<? extends com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>
        getTracksOrBuilderList() {
      if (tracksBuilder_ != null) {
        return tracksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tracks_);
      }
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track.Builder addTracksBuilder() {
      return getTracksFieldBuilder()
          .addBuilder(com.google.cloud.videointelligence.v1p3beta1.Track.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.Track.Builder addTracksBuilder(int index) {
      return getTracksFieldBuilder()
          .addBuilder(
              index, com.google.cloud.videointelligence.v1p3beta1.Track.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The face tracks with attributes.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p3beta1.Track tracks = 3;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p3beta1.Track.Builder>
        getTracksBuilderList() {
      return getTracksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p3beta1.Track,
            com.google.cloud.videointelligence.v1p3beta1.Track.Builder,
            com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>
        getTracksFieldBuilder() {
      if (tracksBuilder_ == null) {
        tracksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.videointelligence.v1p3beta1.Track,
                com.google.cloud.videointelligence.v1p3beta1.Track.Builder,
                com.google.cloud.videointelligence.v1p3beta1.TrackOrBuilder>(
                tracks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        tracks_ = null;
      }
      return tracksBuilder_;
    }

    private com.google.protobuf.ByteString thumbnail_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The thumbnail of a person's face.
     * </pre>
     *
     * <code>bytes thumbnail = 4;</code>
     *
     * @return The thumbnail.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getThumbnail() {
      return thumbnail_;
    }
    /**
     *
     *
     * <pre>
     * The thumbnail of a person's face.
     * </pre>
     *
     * <code>bytes thumbnail = 4;</code>
     *
     * @param value The thumbnail to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnail(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      thumbnail_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The thumbnail of a person's face.
     * </pre>
     *
     * <code>bytes thumbnail = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThumbnail() {
      bitField0_ = (bitField0_ & ~0x00000002);
      thumbnail_ = getDefaultInstance().getThumbnail();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation)
  private static final com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceDetectionAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<FaceDetectionAnnotation>() {
        @java.lang.Override
        public FaceDetectionAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<FaceDetectionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceDetectionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.FaceDetectionAnnotation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
