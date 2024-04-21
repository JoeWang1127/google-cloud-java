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
// source: google/chat/v1/space.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Response message for completing the import process for a space.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.CompleteImportSpaceResponse}
 */
public final class CompleteImportSpaceResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.CompleteImportSpaceResponse)
    CompleteImportSpaceResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CompleteImportSpaceResponse.newBuilder() to construct.
  private CompleteImportSpaceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CompleteImportSpaceResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CompleteImportSpaceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.SpaceProto
        .internal_static_google_chat_v1_CompleteImportSpaceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.SpaceProto
        .internal_static_google_chat_v1_CompleteImportSpaceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.CompleteImportSpaceResponse.class,
            com.google.chat.v1.CompleteImportSpaceResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SPACE_FIELD_NUMBER = 1;
  private com.google.chat.v1.Space space_;
  /**
   *
   *
   * <pre>
   * The import mode space.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1;</code>
   *
   * @return Whether the space field is set.
   */
  @java.lang.Override
  public boolean hasSpace() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The import mode space.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1;</code>
   *
   * @return The space.
   */
  @java.lang.Override
  public com.google.chat.v1.Space getSpace() {
    return space_ == null ? com.google.chat.v1.Space.getDefaultInstance() : space_;
  }
  /**
   *
   *
   * <pre>
   * The import mode space.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1;</code>
   */
  @java.lang.Override
  public com.google.chat.v1.SpaceOrBuilder getSpaceOrBuilder() {
    return space_ == null ? com.google.chat.v1.Space.getDefaultInstance() : space_;
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
      output.writeMessage(1, getSpace());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSpace());
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
    if (!(obj instanceof com.google.chat.v1.CompleteImportSpaceResponse)) {
      return super.equals(obj);
    }
    com.google.chat.v1.CompleteImportSpaceResponse other =
        (com.google.chat.v1.CompleteImportSpaceResponse) obj;

    if (hasSpace() != other.hasSpace()) return false;
    if (hasSpace()) {
      if (!getSpace().equals(other.getSpace())) return false;
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
    if (hasSpace()) {
      hash = (37 * hash) + SPACE_FIELD_NUMBER;
      hash = (53 * hash) + getSpace().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.CompleteImportSpaceResponse prototype) {
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
   * Response message for completing the import process for a space.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.CompleteImportSpaceResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.CompleteImportSpaceResponse)
      com.google.chat.v1.CompleteImportSpaceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.SpaceProto
          .internal_static_google_chat_v1_CompleteImportSpaceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.SpaceProto
          .internal_static_google_chat_v1_CompleteImportSpaceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.CompleteImportSpaceResponse.class,
              com.google.chat.v1.CompleteImportSpaceResponse.Builder.class);
    }

    // Construct using com.google.chat.v1.CompleteImportSpaceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSpaceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      space_ = null;
      if (spaceBuilder_ != null) {
        spaceBuilder_.dispose();
        spaceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.SpaceProto
          .internal_static_google_chat_v1_CompleteImportSpaceResponse_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.CompleteImportSpaceResponse getDefaultInstanceForType() {
      return com.google.chat.v1.CompleteImportSpaceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.CompleteImportSpaceResponse build() {
      com.google.chat.v1.CompleteImportSpaceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.CompleteImportSpaceResponse buildPartial() {
      com.google.chat.v1.CompleteImportSpaceResponse result =
          new com.google.chat.v1.CompleteImportSpaceResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.CompleteImportSpaceResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.space_ = spaceBuilder_ == null ? space_ : spaceBuilder_.build();
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
      if (other instanceof com.google.chat.v1.CompleteImportSpaceResponse) {
        return mergeFrom((com.google.chat.v1.CompleteImportSpaceResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.CompleteImportSpaceResponse other) {
      if (other == com.google.chat.v1.CompleteImportSpaceResponse.getDefaultInstance()) return this;
      if (other.hasSpace()) {
        mergeSpace(other.getSpace());
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
                input.readMessage(getSpaceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.chat.v1.Space space_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Space,
            com.google.chat.v1.Space.Builder,
            com.google.chat.v1.SpaceOrBuilder>
        spaceBuilder_;
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     *
     * @return Whether the space field is set.
     */
    public boolean hasSpace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     *
     * @return The space.
     */
    public com.google.chat.v1.Space getSpace() {
      if (spaceBuilder_ == null) {
        return space_ == null ? com.google.chat.v1.Space.getDefaultInstance() : space_;
      } else {
        return spaceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    public Builder setSpace(com.google.chat.v1.Space value) {
      if (spaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        space_ = value;
      } else {
        spaceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    public Builder setSpace(com.google.chat.v1.Space.Builder builderForValue) {
      if (spaceBuilder_ == null) {
        space_ = builderForValue.build();
      } else {
        spaceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    public Builder mergeSpace(com.google.chat.v1.Space value) {
      if (spaceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && space_ != null
            && space_ != com.google.chat.v1.Space.getDefaultInstance()) {
          getSpaceBuilder().mergeFrom(value);
        } else {
          space_ = value;
        }
      } else {
        spaceBuilder_.mergeFrom(value);
      }
      if (space_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    public Builder clearSpace() {
      bitField0_ = (bitField0_ & ~0x00000001);
      space_ = null;
      if (spaceBuilder_ != null) {
        spaceBuilder_.dispose();
        spaceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    public com.google.chat.v1.Space.Builder getSpaceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpaceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    public com.google.chat.v1.SpaceOrBuilder getSpaceOrBuilder() {
      if (spaceBuilder_ != null) {
        return spaceBuilder_.getMessageOrBuilder();
      } else {
        return space_ == null ? com.google.chat.v1.Space.getDefaultInstance() : space_;
      }
    }
    /**
     *
     *
     * <pre>
     * The import mode space.
     * </pre>
     *
     * <code>.google.chat.v1.Space space = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Space,
            com.google.chat.v1.Space.Builder,
            com.google.chat.v1.SpaceOrBuilder>
        getSpaceFieldBuilder() {
      if (spaceBuilder_ == null) {
        spaceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.Space,
                com.google.chat.v1.Space.Builder,
                com.google.chat.v1.SpaceOrBuilder>(getSpace(), getParentForChildren(), isClean());
        space_ = null;
      }
      return spaceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.CompleteImportSpaceResponse)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.CompleteImportSpaceResponse)
  private static final com.google.chat.v1.CompleteImportSpaceResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.CompleteImportSpaceResponse();
  }

  public static com.google.chat.v1.CompleteImportSpaceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteImportSpaceResponse> PARSER =
      new com.google.protobuf.AbstractParser<CompleteImportSpaceResponse>() {
        @java.lang.Override
        public CompleteImportSpaceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompleteImportSpaceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteImportSpaceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.CompleteImportSpaceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
