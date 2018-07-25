// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Response for the `ListTopics` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ListTopicsResponse}
 */
public  final class ListTopicsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ListTopicsResponse)
    ListTopicsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTopicsResponse.newBuilder() to construct.
  private ListTopicsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTopicsResponse() {
    topics_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTopicsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              topics_ = new java.util.ArrayList<com.google.pubsub.v1.Topic>();
              mutable_bitField0_ |= 0x00000001;
            }
            topics_.add(
                input.readMessage(com.google.pubsub.v1.Topic.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        topics_ = java.util.Collections.unmodifiableList(topics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ListTopicsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ListTopicsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ListTopicsResponse.class, com.google.pubsub.v1.ListTopicsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TOPICS_FIELD_NUMBER = 1;
  private java.util.List<com.google.pubsub.v1.Topic> topics_;
  /**
   * <pre>
   * The resulting topics.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
   */
  public java.util.List<com.google.pubsub.v1.Topic> getTopicsList() {
    return topics_;
  }
  /**
   * <pre>
   * The resulting topics.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
   */
  public java.util.List<? extends com.google.pubsub.v1.TopicOrBuilder> 
      getTopicsOrBuilderList() {
    return topics_;
  }
  /**
   * <pre>
   * The resulting topics.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
   */
  public int getTopicsCount() {
    return topics_.size();
  }
  /**
   * <pre>
   * The resulting topics.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
   */
  public com.google.pubsub.v1.Topic getTopics(int index) {
    return topics_.get(index);
  }
  /**
   * <pre>
   * The resulting topics.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
   */
  public com.google.pubsub.v1.TopicOrBuilder getTopicsOrBuilder(
      int index) {
    return topics_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If not empty, indicates that there may be more topics that match the
   * request; this value should be passed in a new `ListTopicsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If not empty, indicates that there may be more topics that match the
   * request; this value should be passed in a new `ListTopicsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < topics_.size(); i++) {
      output.writeMessage(1, topics_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < topics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, topics_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.pubsub.v1.ListTopicsResponse)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ListTopicsResponse other = (com.google.pubsub.v1.ListTopicsResponse) obj;

    boolean result = true;
    result = result && getTopicsList()
        .equals(other.getTopicsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTopicsCount() > 0) {
      hash = (37 * hash) + TOPICS_FIELD_NUMBER;
      hash = (53 * hash) + getTopicsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.ListTopicsResponse parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.ListTopicsResponse prototype) {
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
   * Response for the `ListTopics` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ListTopicsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ListTopicsResponse)
      com.google.pubsub.v1.ListTopicsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ListTopicsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ListTopicsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ListTopicsResponse.class, com.google.pubsub.v1.ListTopicsResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ListTopicsResponse.newBuilder()
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
        getTopicsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (topicsBuilder_ == null) {
        topics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        topicsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ListTopicsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicsResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.ListTopicsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicsResponse build() {
      com.google.pubsub.v1.ListTopicsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicsResponse buildPartial() {
      com.google.pubsub.v1.ListTopicsResponse result = new com.google.pubsub.v1.ListTopicsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (topicsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          topics_ = java.util.Collections.unmodifiableList(topics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.topics_ = topics_;
      } else {
        result.topics_ = topicsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ListTopicsResponse) {
        return mergeFrom((com.google.pubsub.v1.ListTopicsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ListTopicsResponse other) {
      if (other == com.google.pubsub.v1.ListTopicsResponse.getDefaultInstance()) return this;
      if (topicsBuilder_ == null) {
        if (!other.topics_.isEmpty()) {
          if (topics_.isEmpty()) {
            topics_ = other.topics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTopicsIsMutable();
            topics_.addAll(other.topics_);
          }
          onChanged();
        }
      } else {
        if (!other.topics_.isEmpty()) {
          if (topicsBuilder_.isEmpty()) {
            topicsBuilder_.dispose();
            topicsBuilder_ = null;
            topics_ = other.topics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            topicsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTopicsFieldBuilder() : null;
          } else {
            topicsBuilder_.addAllMessages(other.topics_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.pubsub.v1.ListTopicsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.ListTopicsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.pubsub.v1.Topic> topics_ =
      java.util.Collections.emptyList();
    private void ensureTopicsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        topics_ = new java.util.ArrayList<com.google.pubsub.v1.Topic>(topics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.pubsub.v1.Topic, com.google.pubsub.v1.Topic.Builder, com.google.pubsub.v1.TopicOrBuilder> topicsBuilder_;

    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public java.util.List<com.google.pubsub.v1.Topic> getTopicsList() {
      if (topicsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(topics_);
      } else {
        return topicsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public int getTopicsCount() {
      if (topicsBuilder_ == null) {
        return topics_.size();
      } else {
        return topicsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public com.google.pubsub.v1.Topic getTopics(int index) {
      if (topicsBuilder_ == null) {
        return topics_.get(index);
      } else {
        return topicsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder setTopics(
        int index, com.google.pubsub.v1.Topic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.set(index, value);
        onChanged();
      } else {
        topicsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder setTopics(
        int index, com.google.pubsub.v1.Topic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.set(index, builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder addTopics(com.google.pubsub.v1.Topic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.add(value);
        onChanged();
      } else {
        topicsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder addTopics(
        int index, com.google.pubsub.v1.Topic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.add(index, value);
        onChanged();
      } else {
        topicsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder addTopics(
        com.google.pubsub.v1.Topic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.add(builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder addTopics(
        int index, com.google.pubsub.v1.Topic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.add(index, builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder addAllTopics(
        java.lang.Iterable<? extends com.google.pubsub.v1.Topic> values) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, topics_);
        onChanged();
      } else {
        topicsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder clearTopics() {
      if (topicsBuilder_ == null) {
        topics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        topicsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public Builder removeTopics(int index) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.remove(index);
        onChanged();
      } else {
        topicsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public com.google.pubsub.v1.Topic.Builder getTopicsBuilder(
        int index) {
      return getTopicsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public com.google.pubsub.v1.TopicOrBuilder getTopicsOrBuilder(
        int index) {
      if (topicsBuilder_ == null) {
        return topics_.get(index);  } else {
        return topicsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public java.util.List<? extends com.google.pubsub.v1.TopicOrBuilder> 
         getTopicsOrBuilderList() {
      if (topicsBuilder_ != null) {
        return topicsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(topics_);
      }
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public com.google.pubsub.v1.Topic.Builder addTopicsBuilder() {
      return getTopicsFieldBuilder().addBuilder(
          com.google.pubsub.v1.Topic.getDefaultInstance());
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public com.google.pubsub.v1.Topic.Builder addTopicsBuilder(
        int index) {
      return getTopicsFieldBuilder().addBuilder(
          index, com.google.pubsub.v1.Topic.getDefaultInstance());
    }
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    public java.util.List<com.google.pubsub.v1.Topic.Builder> 
         getTopicsBuilderList() {
      return getTopicsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.pubsub.v1.Topic, com.google.pubsub.v1.Topic.Builder, com.google.pubsub.v1.TopicOrBuilder> 
        getTopicsFieldBuilder() {
      if (topicsBuilder_ == null) {
        topicsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.Topic, com.google.pubsub.v1.Topic.Builder, com.google.pubsub.v1.TopicOrBuilder>(
                topics_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        topics_ = null;
      }
      return topicsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ListTopicsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ListTopicsResponse)
  private static final com.google.pubsub.v1.ListTopicsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ListTopicsResponse();
  }

  public static com.google.pubsub.v1.ListTopicsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTopicsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTopicsResponse>() {
    @java.lang.Override
    public ListTopicsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTopicsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTopicsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTopicsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ListTopicsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

