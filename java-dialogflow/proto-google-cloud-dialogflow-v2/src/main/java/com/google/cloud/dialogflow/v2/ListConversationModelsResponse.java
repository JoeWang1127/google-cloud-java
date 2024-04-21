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
// source: google/cloud/dialogflow/v2/conversation_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The response message for
 * [ConversationModels.ListConversationModels][google.cloud.dialogflow.v2.ConversationModels.ListConversationModels]
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ListConversationModelsResponse}
 */
public final class ListConversationModelsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ListConversationModelsResponse)
    ListConversationModelsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListConversationModelsResponse.newBuilder() to construct.
  private ListConversationModelsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListConversationModelsResponse() {
    conversationModels_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListConversationModelsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto
        .internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto
        .internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ListConversationModelsResponse.class,
            com.google.cloud.dialogflow.v2.ListConversationModelsResponse.Builder.class);
  }

  public static final int CONVERSATION_MODELS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2.ConversationModel> conversationModels_;
  /**
   *
   *
   * <pre>
   * The list of models to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.ConversationModel>
      getConversationModelsList() {
    return conversationModels_;
  }
  /**
   *
   *
   * <pre>
   * The list of models to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.ConversationModelOrBuilder>
      getConversationModelsOrBuilderList() {
    return conversationModels_;
  }
  /**
   *
   *
   * <pre>
   * The list of models to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
   */
  @java.lang.Override
  public int getConversationModelsCount() {
    return conversationModels_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of models to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModel getConversationModels(int index) {
    return conversationModels_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of models to return.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModelOrBuilder getConversationModelsOrBuilder(
      int index) {
    return conversationModels_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < conversationModels_.size(); i++) {
      output.writeMessage(1, conversationModels_.get(i));
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
    for (int i = 0; i < conversationModels_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, conversationModels_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ListConversationModelsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ListConversationModelsResponse other =
        (com.google.cloud.dialogflow.v2.ListConversationModelsResponse) obj;

    if (!getConversationModelsList().equals(other.getConversationModelsList())) return false;
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
    if (getConversationModelsCount() > 0) {
      hash = (37 * hash) + CONVERSATION_MODELS_FIELD_NUMBER;
      hash = (53 * hash) + getConversationModelsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse parseFrom(
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
      com.google.cloud.dialogflow.v2.ListConversationModelsResponse prototype) {
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
   * The response message for
   * [ConversationModels.ListConversationModels][google.cloud.dialogflow.v2.ConversationModels.ListConversationModels]
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ListConversationModelsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ListConversationModelsResponse)
      com.google.cloud.dialogflow.v2.ListConversationModelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ListConversationModelsResponse.class,
              com.google.cloud.dialogflow.v2.ListConversationModelsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ListConversationModelsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (conversationModelsBuilder_ == null) {
        conversationModels_ = java.util.Collections.emptyList();
      } else {
        conversationModels_ = null;
        conversationModelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListConversationModelsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ListConversationModelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListConversationModelsResponse build() {
      com.google.cloud.dialogflow.v2.ListConversationModelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListConversationModelsResponse buildPartial() {
      com.google.cloud.dialogflow.v2.ListConversationModelsResponse result =
          new com.google.cloud.dialogflow.v2.ListConversationModelsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.v2.ListConversationModelsResponse result) {
      if (conversationModelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          conversationModels_ = java.util.Collections.unmodifiableList(conversationModels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conversationModels_ = conversationModels_;
      } else {
        result.conversationModels_ = conversationModelsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.ListConversationModelsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.v2.ListConversationModelsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ListConversationModelsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ListConversationModelsResponse other) {
      if (other
          == com.google.cloud.dialogflow.v2.ListConversationModelsResponse.getDefaultInstance())
        return this;
      if (conversationModelsBuilder_ == null) {
        if (!other.conversationModels_.isEmpty()) {
          if (conversationModels_.isEmpty()) {
            conversationModels_ = other.conversationModels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConversationModelsIsMutable();
            conversationModels_.addAll(other.conversationModels_);
          }
          onChanged();
        }
      } else {
        if (!other.conversationModels_.isEmpty()) {
          if (conversationModelsBuilder_.isEmpty()) {
            conversationModelsBuilder_.dispose();
            conversationModelsBuilder_ = null;
            conversationModels_ = other.conversationModels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conversationModelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getConversationModelsFieldBuilder()
                    : null;
          } else {
            conversationModelsBuilder_.addAllMessages(other.conversationModels_);
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
                com.google.cloud.dialogflow.v2.ConversationModel m =
                    input.readMessage(
                        com.google.cloud.dialogflow.v2.ConversationModel.parser(),
                        extensionRegistry);
                if (conversationModelsBuilder_ == null) {
                  ensureConversationModelsIsMutable();
                  conversationModels_.add(m);
                } else {
                  conversationModelsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.v2.ConversationModel> conversationModels_ =
        java.util.Collections.emptyList();

    private void ensureConversationModelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        conversationModels_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.ConversationModel>(
                conversationModels_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationModel,
            com.google.cloud.dialogflow.v2.ConversationModel.Builder,
            com.google.cloud.dialogflow.v2.ConversationModelOrBuilder>
        conversationModelsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.ConversationModel>
        getConversationModelsList() {
      if (conversationModelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(conversationModels_);
      } else {
        return conversationModelsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public int getConversationModelsCount() {
      if (conversationModelsBuilder_ == null) {
        return conversationModels_.size();
      } else {
        return conversationModelsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModel getConversationModels(int index) {
      if (conversationModelsBuilder_ == null) {
        return conversationModels_.get(index);
      } else {
        return conversationModelsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder setConversationModels(
        int index, com.google.cloud.dialogflow.v2.ConversationModel value) {
      if (conversationModelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversationModelsIsMutable();
        conversationModels_.set(index, value);
        onChanged();
      } else {
        conversationModelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder setConversationModels(
        int index, com.google.cloud.dialogflow.v2.ConversationModel.Builder builderForValue) {
      if (conversationModelsBuilder_ == null) {
        ensureConversationModelsIsMutable();
        conversationModels_.set(index, builderForValue.build());
        onChanged();
      } else {
        conversationModelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder addConversationModels(com.google.cloud.dialogflow.v2.ConversationModel value) {
      if (conversationModelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversationModelsIsMutable();
        conversationModels_.add(value);
        onChanged();
      } else {
        conversationModelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder addConversationModels(
        int index, com.google.cloud.dialogflow.v2.ConversationModel value) {
      if (conversationModelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversationModelsIsMutable();
        conversationModels_.add(index, value);
        onChanged();
      } else {
        conversationModelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder addConversationModels(
        com.google.cloud.dialogflow.v2.ConversationModel.Builder builderForValue) {
      if (conversationModelsBuilder_ == null) {
        ensureConversationModelsIsMutable();
        conversationModels_.add(builderForValue.build());
        onChanged();
      } else {
        conversationModelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder addConversationModels(
        int index, com.google.cloud.dialogflow.v2.ConversationModel.Builder builderForValue) {
      if (conversationModelsBuilder_ == null) {
        ensureConversationModelsIsMutable();
        conversationModels_.add(index, builderForValue.build());
        onChanged();
      } else {
        conversationModelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder addAllConversationModels(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.ConversationModel> values) {
      if (conversationModelsBuilder_ == null) {
        ensureConversationModelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conversationModels_);
        onChanged();
      } else {
        conversationModelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder clearConversationModels() {
      if (conversationModelsBuilder_ == null) {
        conversationModels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conversationModelsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public Builder removeConversationModels(int index) {
      if (conversationModelsBuilder_ == null) {
        ensureConversationModelsIsMutable();
        conversationModels_.remove(index);
        onChanged();
      } else {
        conversationModelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModel.Builder getConversationModelsBuilder(
        int index) {
      return getConversationModelsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModelOrBuilder getConversationModelsOrBuilder(
        int index) {
      if (conversationModelsBuilder_ == null) {
        return conversationModels_.get(index);
      } else {
        return conversationModelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.ConversationModelOrBuilder>
        getConversationModelsOrBuilderList() {
      if (conversationModelsBuilder_ != null) {
        return conversationModelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(conversationModels_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModel.Builder addConversationModelsBuilder() {
      return getConversationModelsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModel.Builder addConversationModelsBuilder(
        int index) {
      return getConversationModelsFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of models to return.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.ConversationModel conversation_models = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.ConversationModel.Builder>
        getConversationModelsBuilderList() {
      return getConversationModelsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationModel,
            com.google.cloud.dialogflow.v2.ConversationModel.Builder,
            com.google.cloud.dialogflow.v2.ConversationModelOrBuilder>
        getConversationModelsFieldBuilder() {
      if (conversationModelsBuilder_ == null) {
        conversationModelsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.ConversationModel,
                com.google.cloud.dialogflow.v2.ConversationModel.Builder,
                com.google.cloud.dialogflow.v2.ConversationModelOrBuilder>(
                conversationModels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        conversationModels_ = null;
      }
      return conversationModelsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ListConversationModelsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ListConversationModelsResponse)
  private static final com.google.cloud.dialogflow.v2.ListConversationModelsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ListConversationModelsResponse();
  }

  public static com.google.cloud.dialogflow.v2.ListConversationModelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConversationModelsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListConversationModelsResponse>() {
        @java.lang.Override
        public ListConversationModelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConversationModelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConversationModelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ListConversationModelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
