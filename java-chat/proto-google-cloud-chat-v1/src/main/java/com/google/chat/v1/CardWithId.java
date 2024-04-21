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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * A
 * [card](https://developers.google.com/workspace/chat/api/reference/rest/v1/cards)
 * in a Google Chat message.
 *
 * Only Chat apps can create cards. If your Chat app [authenticates as a
 * user](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user),
 * the message can't contain cards.
 *
 * [Card builder](https://addons.gsuite.google.com/uikit/builder)
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.CardWithId}
 */
public final class CardWithId extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.CardWithId)
    CardWithIdOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CardWithId.newBuilder() to construct.
  private CardWithId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CardWithId() {
    cardId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CardWithId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_CardWithId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.MessageProto
        .internal_static_google_chat_v1_CardWithId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.CardWithId.class, com.google.chat.v1.CardWithId.Builder.class);
  }

  private int bitField0_;
  public static final int CARD_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cardId_ = "";
  /**
   *
   *
   * <pre>
   * Required if the message contains multiple cards. A unique identifier for
   * a card in a message.
   * </pre>
   *
   * <code>string card_id = 1;</code>
   *
   * @return The cardId.
   */
  @java.lang.Override
  public java.lang.String getCardId() {
    java.lang.Object ref = cardId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required if the message contains multiple cards. A unique identifier for
   * a card in a message.
   * </pre>
   *
   * <code>string card_id = 1;</code>
   *
   * @return The bytes for cardId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCardIdBytes() {
    java.lang.Object ref = cardId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cardId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CARD_FIELD_NUMBER = 2;
  private com.google.apps.card.v1.Card card_;
  /**
   *
   *
   * <pre>
   * A card. Maximum size is 32 KB.
   * </pre>
   *
   * <code>.google.apps.card.v1.Card card = 2;</code>
   *
   * @return Whether the card field is set.
   */
  @java.lang.Override
  public boolean hasCard() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A card. Maximum size is 32 KB.
   * </pre>
   *
   * <code>.google.apps.card.v1.Card card = 2;</code>
   *
   * @return The card.
   */
  @java.lang.Override
  public com.google.apps.card.v1.Card getCard() {
    return card_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : card_;
  }
  /**
   *
   *
   * <pre>
   * A card. Maximum size is 32 KB.
   * </pre>
   *
   * <code>.google.apps.card.v1.Card card = 2;</code>
   */
  @java.lang.Override
  public com.google.apps.card.v1.CardOrBuilder getCardOrBuilder() {
    return card_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : card_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cardId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cardId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCard());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cardId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cardId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCard());
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
    if (!(obj instanceof com.google.chat.v1.CardWithId)) {
      return super.equals(obj);
    }
    com.google.chat.v1.CardWithId other = (com.google.chat.v1.CardWithId) obj;

    if (!getCardId().equals(other.getCardId())) return false;
    if (hasCard() != other.hasCard()) return false;
    if (hasCard()) {
      if (!getCard().equals(other.getCard())) return false;
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
    hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCardId().hashCode();
    if (hasCard()) {
      hash = (37 * hash) + CARD_FIELD_NUMBER;
      hash = (53 * hash) + getCard().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.CardWithId parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.CardWithId parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.CardWithId parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.CardWithId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.CardWithId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.CardWithId parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.CardWithId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.CardWithId parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.CardWithId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.CardWithId parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.CardWithId parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.CardWithId parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.CardWithId prototype) {
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
   * A
   * [card](https://developers.google.com/workspace/chat/api/reference/rest/v1/cards)
   * in a Google Chat message.
   *
   * Only Chat apps can create cards. If your Chat app [authenticates as a
   * user](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user),
   * the message can't contain cards.
   *
   * [Card builder](https://addons.gsuite.google.com/uikit/builder)
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.CardWithId}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.CardWithId)
      com.google.chat.v1.CardWithIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_CardWithId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.MessageProto
          .internal_static_google_chat_v1_CardWithId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.CardWithId.class, com.google.chat.v1.CardWithId.Builder.class);
    }

    // Construct using com.google.chat.v1.CardWithId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCardFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cardId_ = "";
      card_ = null;
      if (cardBuilder_ != null) {
        cardBuilder_.dispose();
        cardBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.MessageProto.internal_static_google_chat_v1_CardWithId_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.CardWithId getDefaultInstanceForType() {
      return com.google.chat.v1.CardWithId.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.CardWithId build() {
      com.google.chat.v1.CardWithId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.CardWithId buildPartial() {
      com.google.chat.v1.CardWithId result = new com.google.chat.v1.CardWithId(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.CardWithId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cardId_ = cardId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.card_ = cardBuilder_ == null ? card_ : cardBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.chat.v1.CardWithId) {
        return mergeFrom((com.google.chat.v1.CardWithId) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.CardWithId other) {
      if (other == com.google.chat.v1.CardWithId.getDefaultInstance()) return this;
      if (!other.getCardId().isEmpty()) {
        cardId_ = other.cardId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCard()) {
        mergeCard(other.getCard());
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
                cardId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getCardFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object cardId_ = "";
    /**
     *
     *
     * <pre>
     * Required if the message contains multiple cards. A unique identifier for
     * a card in a message.
     * </pre>
     *
     * <code>string card_id = 1;</code>
     *
     * @return The cardId.
     */
    public java.lang.String getCardId() {
      java.lang.Object ref = cardId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required if the message contains multiple cards. A unique identifier for
     * a card in a message.
     * </pre>
     *
     * <code>string card_id = 1;</code>
     *
     * @return The bytes for cardId.
     */
    public com.google.protobuf.ByteString getCardIdBytes() {
      java.lang.Object ref = cardId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cardId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required if the message contains multiple cards. A unique identifier for
     * a card in a message.
     * </pre>
     *
     * <code>string card_id = 1;</code>
     *
     * @param value The cardId to set.
     * @return This builder for chaining.
     */
    public Builder setCardId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required if the message contains multiple cards. A unique identifier for
     * a card in a message.
     * </pre>
     *
     * <code>string card_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCardId() {
      cardId_ = getDefaultInstance().getCardId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required if the message contains multiple cards. A unique identifier for
     * a card in a message.
     * </pre>
     *
     * <code>string card_id = 1;</code>
     *
     * @param value The bytes for cardId to set.
     * @return This builder for chaining.
     */
    public Builder setCardIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.apps.card.v1.Card card_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.card.v1.Card,
            com.google.apps.card.v1.Card.Builder,
            com.google.apps.card.v1.CardOrBuilder>
        cardBuilder_;
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     *
     * @return Whether the card field is set.
     */
    public boolean hasCard() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     *
     * @return The card.
     */
    public com.google.apps.card.v1.Card getCard() {
      if (cardBuilder_ == null) {
        return card_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : card_;
      } else {
        return cardBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    public Builder setCard(com.google.apps.card.v1.Card value) {
      if (cardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        card_ = value;
      } else {
        cardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    public Builder setCard(com.google.apps.card.v1.Card.Builder builderForValue) {
      if (cardBuilder_ == null) {
        card_ = builderForValue.build();
      } else {
        cardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    public Builder mergeCard(com.google.apps.card.v1.Card value) {
      if (cardBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && card_ != null
            && card_ != com.google.apps.card.v1.Card.getDefaultInstance()) {
          getCardBuilder().mergeFrom(value);
        } else {
          card_ = value;
        }
      } else {
        cardBuilder_.mergeFrom(value);
      }
      if (card_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    public Builder clearCard() {
      bitField0_ = (bitField0_ & ~0x00000002);
      card_ = null;
      if (cardBuilder_ != null) {
        cardBuilder_.dispose();
        cardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    public com.google.apps.card.v1.Card.Builder getCardBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCardFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    public com.google.apps.card.v1.CardOrBuilder getCardOrBuilder() {
      if (cardBuilder_ != null) {
        return cardBuilder_.getMessageOrBuilder();
      } else {
        return card_ == null ? com.google.apps.card.v1.Card.getDefaultInstance() : card_;
      }
    }
    /**
     *
     *
     * <pre>
     * A card. Maximum size is 32 KB.
     * </pre>
     *
     * <code>.google.apps.card.v1.Card card = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.card.v1.Card,
            com.google.apps.card.v1.Card.Builder,
            com.google.apps.card.v1.CardOrBuilder>
        getCardFieldBuilder() {
      if (cardBuilder_ == null) {
        cardBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.apps.card.v1.Card,
                com.google.apps.card.v1.Card.Builder,
                com.google.apps.card.v1.CardOrBuilder>(
                getCard(), getParentForChildren(), isClean());
        card_ = null;
      }
      return cardBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.CardWithId)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.CardWithId)
  private static final com.google.chat.v1.CardWithId DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.CardWithId();
  }

  public static com.google.chat.v1.CardWithId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardWithId> PARSER =
      new com.google.protobuf.AbstractParser<CardWithId>() {
        @java.lang.Override
        public CardWithId parsePartialFrom(
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

  public static com.google.protobuf.Parser<CardWithId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardWithId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.CardWithId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
