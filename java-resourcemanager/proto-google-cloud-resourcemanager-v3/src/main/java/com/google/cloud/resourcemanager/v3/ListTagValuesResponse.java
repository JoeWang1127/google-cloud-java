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
// source: google/cloud/resourcemanager/v3/tag_values.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The ListTagValues response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.ListTagValuesResponse}
 */
public final class ListTagValuesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.ListTagValuesResponse)
    ListTagValuesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTagValuesResponse.newBuilder() to construct.
  private ListTagValuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTagValuesResponse() {
    tagValues_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTagValuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.TagValuesProto
        .internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.TagValuesProto
        .internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.ListTagValuesResponse.class,
            com.google.cloud.resourcemanager.v3.ListTagValuesResponse.Builder.class);
  }

  public static final int TAG_VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.resourcemanager.v3.TagValue> tagValues_;
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.resourcemanager.v3.TagValue> getTagValuesList() {
    return tagValues_;
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.resourcemanager.v3.TagValueOrBuilder>
      getTagValuesOrBuilderList() {
    return tagValues_;
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  @java.lang.Override
  public int getTagValuesCount() {
    return tagValues_.size();
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagValue getTagValues(int index) {
    return tagValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagValues that are direct descendants of
   * the specified parent TagKey.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagValueOrBuilder getTagValuesOrBuilder(int index) {
    return tagValues_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to `ListTagValues`
   * that indicates from where listing should continue. This is currently not
   * used, but the server may at any point start supplying a valid token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to `ListTagValues`
   * that indicates from where listing should continue. This is currently not
   * used, but the server may at any point start supplying a valid token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < tagValues_.size(); i++) {
      output.writeMessage(1, tagValues_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tagValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tagValues_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.ListTagValuesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.ListTagValuesResponse other =
        (com.google.cloud.resourcemanager.v3.ListTagValuesResponse) obj;

    if (!getTagValuesList().equals(other.getTagValuesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getTagValuesCount() > 0) {
      hash = (37 * hash) + TAG_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getTagValuesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse parseFrom(
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
      com.google.cloud.resourcemanager.v3.ListTagValuesResponse prototype) {
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
   * The ListTagValues response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.ListTagValuesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.ListTagValuesResponse)
      com.google.cloud.resourcemanager.v3.ListTagValuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.TagValuesProto
          .internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.TagValuesProto
          .internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.ListTagValuesResponse.class,
              com.google.cloud.resourcemanager.v3.ListTagValuesResponse.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.ListTagValuesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tagValuesBuilder_ == null) {
        tagValues_ = java.util.Collections.emptyList();
      } else {
        tagValues_ = null;
        tagValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.TagValuesProto
          .internal_static_google_cloud_resourcemanager_v3_ListTagValuesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.ListTagValuesResponse getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.ListTagValuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.ListTagValuesResponse build() {
      com.google.cloud.resourcemanager.v3.ListTagValuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.ListTagValuesResponse buildPartial() {
      com.google.cloud.resourcemanager.v3.ListTagValuesResponse result =
          new com.google.cloud.resourcemanager.v3.ListTagValuesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.resourcemanager.v3.ListTagValuesResponse result) {
      if (tagValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tagValues_ = java.util.Collections.unmodifiableList(tagValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tagValues_ = tagValues_;
      } else {
        result.tagValues_ = tagValuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.ListTagValuesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.resourcemanager.v3.ListTagValuesResponse) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.ListTagValuesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.ListTagValuesResponse other) {
      if (other == com.google.cloud.resourcemanager.v3.ListTagValuesResponse.getDefaultInstance())
        return this;
      if (tagValuesBuilder_ == null) {
        if (!other.tagValues_.isEmpty()) {
          if (tagValues_.isEmpty()) {
            tagValues_ = other.tagValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagValuesIsMutable();
            tagValues_.addAll(other.tagValues_);
          }
          onChanged();
        }
      } else {
        if (!other.tagValues_.isEmpty()) {
          if (tagValuesBuilder_.isEmpty()) {
            tagValuesBuilder_.dispose();
            tagValuesBuilder_ = null;
            tagValues_ = other.tagValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tagValuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTagValuesFieldBuilder()
                    : null;
          } else {
            tagValuesBuilder_.addAllMessages(other.tagValues_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10:
              {
                com.google.cloud.resourcemanager.v3.TagValue m =
                    input.readMessage(
                        com.google.cloud.resourcemanager.v3.TagValue.parser(), extensionRegistry);
                if (tagValuesBuilder_ == null) {
                  ensureTagValuesIsMutable();
                  tagValues_.add(m);
                } else {
                  tagValuesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.util.List<com.google.cloud.resourcemanager.v3.TagValue> tagValues_ =
        java.util.Collections.emptyList();

    private void ensureTagValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tagValues_ =
            new java.util.ArrayList<com.google.cloud.resourcemanager.v3.TagValue>(tagValues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagValue,
            com.google.cloud.resourcemanager.v3.TagValue.Builder,
            com.google.cloud.resourcemanager.v3.TagValueOrBuilder>
        tagValuesBuilder_;

    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.TagValue> getTagValuesList() {
      if (tagValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tagValues_);
      } else {
        return tagValuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public int getTagValuesCount() {
      if (tagValuesBuilder_ == null) {
        return tagValues_.size();
      } else {
        return tagValuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValue getTagValues(int index) {
      if (tagValuesBuilder_ == null) {
        return tagValues_.get(index);
      } else {
        return tagValuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder setTagValues(int index, com.google.cloud.resourcemanager.v3.TagValue value) {
      if (tagValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagValuesIsMutable();
        tagValues_.set(index, value);
        onChanged();
      } else {
        tagValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder setTagValues(
        int index, com.google.cloud.resourcemanager.v3.TagValue.Builder builderForValue) {
      if (tagValuesBuilder_ == null) {
        ensureTagValuesIsMutable();
        tagValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder addTagValues(com.google.cloud.resourcemanager.v3.TagValue value) {
      if (tagValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagValuesIsMutable();
        tagValues_.add(value);
        onChanged();
      } else {
        tagValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder addTagValues(int index, com.google.cloud.resourcemanager.v3.TagValue value) {
      if (tagValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagValuesIsMutable();
        tagValues_.add(index, value);
        onChanged();
      } else {
        tagValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder addTagValues(
        com.google.cloud.resourcemanager.v3.TagValue.Builder builderForValue) {
      if (tagValuesBuilder_ == null) {
        ensureTagValuesIsMutable();
        tagValues_.add(builderForValue.build());
        onChanged();
      } else {
        tagValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder addTagValues(
        int index, com.google.cloud.resourcemanager.v3.TagValue.Builder builderForValue) {
      if (tagValuesBuilder_ == null) {
        ensureTagValuesIsMutable();
        tagValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder addAllTagValues(
        java.lang.Iterable<? extends com.google.cloud.resourcemanager.v3.TagValue> values) {
      if (tagValuesBuilder_ == null) {
        ensureTagValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tagValues_);
        onChanged();
      } else {
        tagValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder clearTagValues() {
      if (tagValuesBuilder_ == null) {
        tagValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tagValuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public Builder removeTagValues(int index) {
      if (tagValuesBuilder_ == null) {
        ensureTagValuesIsMutable();
        tagValues_.remove(index);
        onChanged();
      } else {
        tagValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValue.Builder getTagValuesBuilder(int index) {
      return getTagValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValueOrBuilder getTagValuesOrBuilder(int index) {
      if (tagValuesBuilder_ == null) {
        return tagValues_.get(index);
      } else {
        return tagValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.resourcemanager.v3.TagValueOrBuilder>
        getTagValuesOrBuilderList() {
      if (tagValuesBuilder_ != null) {
        return tagValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tagValues_);
      }
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValue.Builder addTagValuesBuilder() {
      return getTagValuesFieldBuilder()
          .addBuilder(com.google.cloud.resourcemanager.v3.TagValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public com.google.cloud.resourcemanager.v3.TagValue.Builder addTagValuesBuilder(int index) {
      return getTagValuesFieldBuilder()
          .addBuilder(index, com.google.cloud.resourcemanager.v3.TagValue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A possibly paginated list of TagValues that are direct descendants of
     * the specified parent TagKey.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcemanager.v3.TagValue tag_values = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcemanager.v3.TagValue.Builder>
        getTagValuesBuilderList() {
      return getTagValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagValue,
            com.google.cloud.resourcemanager.v3.TagValue.Builder,
            com.google.cloud.resourcemanager.v3.TagValueOrBuilder>
        getTagValuesFieldBuilder() {
      if (tagValuesBuilder_ == null) {
        tagValuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.TagValue,
                com.google.cloud.resourcemanager.v3.TagValue.Builder,
                com.google.cloud.resourcemanager.v3.TagValueOrBuilder>(
                tagValues_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        tagValues_ = null;
      }
      return tagValuesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to `ListTagValues`
     * that indicates from where listing should continue. This is currently not
     * used, but the server may at any point start supplying a valid token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to `ListTagValues`
     * that indicates from where listing should continue. This is currently not
     * used, but the server may at any point start supplying a valid token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to `ListTagValues`
     * that indicates from where listing should continue. This is currently not
     * used, but the server may at any point start supplying a valid token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to `ListTagValues`
     * that indicates from where listing should continue. This is currently not
     * used, but the server may at any point start supplying a valid token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A pagination token returned from a previous call to `ListTagValues`
     * that indicates from where listing should continue. This is currently not
     * used, but the server may at any point start supplying a valid token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.ListTagValuesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.ListTagValuesResponse)
  private static final com.google.cloud.resourcemanager.v3.ListTagValuesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.ListTagValuesResponse();
  }

  public static com.google.cloud.resourcemanager.v3.ListTagValuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTagValuesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTagValuesResponse>() {
        @java.lang.Override
        public ListTagValuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTagValuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTagValuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.ListTagValuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
