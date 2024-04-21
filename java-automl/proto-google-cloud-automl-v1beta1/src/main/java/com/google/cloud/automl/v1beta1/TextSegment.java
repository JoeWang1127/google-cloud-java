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
// source: google/cloud/automl/v1beta1/text_segment.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * A contiguous part of a text (string), assuming it has an UTF-8 NFC encoding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TextSegment}
 */
public final class TextSegment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TextSegment)
    TextSegmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextSegment.newBuilder() to construct.
  private TextSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextSegment() {
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.TextSegmentProto
        .internal_static_google_cloud_automl_v1beta1_TextSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TextSegmentProto
        .internal_static_google_cloud_automl_v1beta1_TextSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TextSegment.class,
            com.google.cloud.automl.v1beta1.TextSegment.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The content of the TextSegment.
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The content of the TextSegment.
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_OFFSET_FIELD_NUMBER = 1;
  private long startOffset_ = 0L;
  /**
   *
   *
   * <pre>
   * Required. Zero-based character index of the first character of the text
   * segment (counting characters from the beginning of the text).
   * </pre>
   *
   * <code>int64 start_offset = 1;</code>
   *
   * @return The startOffset.
   */
  @java.lang.Override
  public long getStartOffset() {
    return startOffset_;
  }

  public static final int END_OFFSET_FIELD_NUMBER = 2;
  private long endOffset_ = 0L;
  /**
   *
   *
   * <pre>
   * Required. Zero-based character index of the first character past the end of
   * the text segment (counting character from the beginning of the text).
   * The character at the end_offset is NOT included in the text segment.
   * </pre>
   *
   * <code>int64 end_offset = 2;</code>
   *
   * @return The endOffset.
   */
  @java.lang.Override
  public long getEndOffset() {
    return endOffset_;
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
    if (startOffset_ != 0L) {
      output.writeInt64(1, startOffset_);
    }
    if (endOffset_ != 0L) {
      output.writeInt64(2, endOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, startOffset_);
    }
    if (endOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, endOffset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TextSegment)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TextSegment other =
        (com.google.cloud.automl.v1beta1.TextSegment) obj;

    if (!getContent().equals(other.getContent())) return false;
    if (getStartOffset() != other.getStartOffset()) return false;
    if (getEndOffset() != other.getEndOffset()) return false;
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + START_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getStartOffset());
    hash = (37 * hash) + END_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getEndOffset());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextSegment parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.TextSegment prototype) {
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
   * A contiguous part of a text (string), assuming it has an UTF-8 NFC encoding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TextSegment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TextSegment)
      com.google.cloud.automl.v1beta1.TextSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TextSegmentProto
          .internal_static_google_cloud_automl_v1beta1_TextSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TextSegmentProto
          .internal_static_google_cloud_automl_v1beta1_TextSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TextSegment.class,
              com.google.cloud.automl.v1beta1.TextSegment.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TextSegment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      content_ = "";
      startOffset_ = 0L;
      endOffset_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TextSegmentProto
          .internal_static_google_cloud_automl_v1beta1_TextSegment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextSegment getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TextSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextSegment build() {
      com.google.cloud.automl.v1beta1.TextSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextSegment buildPartial() {
      com.google.cloud.automl.v1beta1.TextSegment result =
          new com.google.cloud.automl.v1beta1.TextSegment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1beta1.TextSegment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startOffset_ = startOffset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endOffset_ = endOffset_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.TextSegment) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TextSegment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TextSegment other) {
      if (other == com.google.cloud.automl.v1beta1.TextSegment.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getStartOffset() != 0L) {
        setStartOffset(other.getStartOffset());
      }
      if (other.getEndOffset() != 0L) {
        setEndOffset(other.getEndOffset());
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
            case 8:
              {
                startOffset_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
            case 16:
              {
                endOffset_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
            case 26:
              {
                content_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 26
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

    private java.lang.Object content_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The content of the TextSegment.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The content of the TextSegment.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The content of the TextSegment.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The content of the TextSegment.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The content of the TextSegment.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long startOffset_;
    /**
     *
     *
     * <pre>
     * Required. Zero-based character index of the first character of the text
     * segment (counting characters from the beginning of the text).
     * </pre>
     *
     * <code>int64 start_offset = 1;</code>
     *
     * @return The startOffset.
     */
    @java.lang.Override
    public long getStartOffset() {
      return startOffset_;
    }
    /**
     *
     *
     * <pre>
     * Required. Zero-based character index of the first character of the text
     * segment (counting characters from the beginning of the text).
     * </pre>
     *
     * <code>int64 start_offset = 1;</code>
     *
     * @param value The startOffset to set.
     * @return This builder for chaining.
     */
    public Builder setStartOffset(long value) {

      startOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Zero-based character index of the first character of the text
     * segment (counting characters from the beginning of the text).
     * </pre>
     *
     * <code>int64 start_offset = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startOffset_ = 0L;
      onChanged();
      return this;
    }

    private long endOffset_;
    /**
     *
     *
     * <pre>
     * Required. Zero-based character index of the first character past the end of
     * the text segment (counting character from the beginning of the text).
     * The character at the end_offset is NOT included in the text segment.
     * </pre>
     *
     * <code>int64 end_offset = 2;</code>
     *
     * @return The endOffset.
     */
    @java.lang.Override
    public long getEndOffset() {
      return endOffset_;
    }
    /**
     *
     *
     * <pre>
     * Required. Zero-based character index of the first character past the end of
     * the text segment (counting character from the beginning of the text).
     * The character at the end_offset is NOT included in the text segment.
     * </pre>
     *
     * <code>int64 end_offset = 2;</code>
     *
     * @param value The endOffset to set.
     * @return This builder for chaining.
     */
    public Builder setEndOffset(long value) {

      endOffset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Zero-based character index of the first character past the end of
     * the text segment (counting character from the beginning of the text).
     * The character at the end_offset is NOT included in the text segment.
     * </pre>
     *
     * <code>int64 end_offset = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndOffset() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endOffset_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TextSegment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TextSegment)
  private static final com.google.cloud.automl.v1beta1.TextSegment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TextSegment();
  }

  public static com.google.cloud.automl.v1beta1.TextSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextSegment> PARSER =
      new com.google.protobuf.AbstractParser<TextSegment>() {
        @java.lang.Override
        public TextSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
