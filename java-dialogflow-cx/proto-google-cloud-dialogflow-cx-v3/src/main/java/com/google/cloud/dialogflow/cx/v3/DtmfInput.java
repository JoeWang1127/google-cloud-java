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
// source: google/cloud/dialogflow/cx/v3/session.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * Represents the input for dtmf event.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.DtmfInput}
 */
public final class DtmfInput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.DtmfInput)
    DtmfInputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DtmfInput.newBuilder() to construct.
  private DtmfInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DtmfInput() {
    digits_ = "";
    finishDigit_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DtmfInput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.SessionProto
        .internal_static_google_cloud_dialogflow_cx_v3_DtmfInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.SessionProto
        .internal_static_google_cloud_dialogflow_cx_v3_DtmfInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.DtmfInput.class,
            com.google.cloud.dialogflow.cx.v3.DtmfInput.Builder.class);
  }

  public static final int DIGITS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object digits_ = "";
  /**
   *
   *
   * <pre>
   * The dtmf digits.
   * </pre>
   *
   * <code>string digits = 1;</code>
   *
   * @return The digits.
   */
  @java.lang.Override
  public java.lang.String getDigits() {
    java.lang.Object ref = digits_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      digits_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The dtmf digits.
   * </pre>
   *
   * <code>string digits = 1;</code>
   *
   * @return The bytes for digits.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDigitsBytes() {
    java.lang.Object ref = digits_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      digits_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINISH_DIGIT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object finishDigit_ = "";
  /**
   *
   *
   * <pre>
   * The finish digit (if any).
   * </pre>
   *
   * <code>string finish_digit = 2;</code>
   *
   * @return The finishDigit.
   */
  @java.lang.Override
  public java.lang.String getFinishDigit() {
    java.lang.Object ref = finishDigit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      finishDigit_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The finish digit (if any).
   * </pre>
   *
   * <code>string finish_digit = 2;</code>
   *
   * @return The bytes for finishDigit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFinishDigitBytes() {
    java.lang.Object ref = finishDigit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      finishDigit_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(digits_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, digits_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(finishDigit_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, finishDigit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(digits_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, digits_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(finishDigit_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, finishDigit_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.DtmfInput)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.DtmfInput other =
        (com.google.cloud.dialogflow.cx.v3.DtmfInput) obj;

    if (!getDigits().equals(other.getDigits())) return false;
    if (!getFinishDigit().equals(other.getFinishDigit())) return false;
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
    hash = (37 * hash) + DIGITS_FIELD_NUMBER;
    hash = (53 * hash) + getDigits().hashCode();
    hash = (37 * hash) + FINISH_DIGIT_FIELD_NUMBER;
    hash = (53 * hash) + getFinishDigit().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.DtmfInput prototype) {
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
   * Represents the input for dtmf event.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.DtmfInput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.DtmfInput)
      com.google.cloud.dialogflow.cx.v3.DtmfInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto
          .internal_static_google_cloud_dialogflow_cx_v3_DtmfInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto
          .internal_static_google_cloud_dialogflow_cx_v3_DtmfInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.DtmfInput.class,
              com.google.cloud.dialogflow.cx.v3.DtmfInput.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.DtmfInput.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      digits_ = "";
      finishDigit_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.SessionProto
          .internal_static_google_cloud_dialogflow_cx_v3_DtmfInput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DtmfInput getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.DtmfInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DtmfInput build() {
      com.google.cloud.dialogflow.cx.v3.DtmfInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DtmfInput buildPartial() {
      com.google.cloud.dialogflow.cx.v3.DtmfInput result =
          new com.google.cloud.dialogflow.cx.v3.DtmfInput(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.DtmfInput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.digits_ = digits_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.finishDigit_ = finishDigit_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.DtmfInput) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.DtmfInput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.DtmfInput other) {
      if (other == com.google.cloud.dialogflow.cx.v3.DtmfInput.getDefaultInstance()) return this;
      if (!other.getDigits().isEmpty()) {
        digits_ = other.digits_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFinishDigit().isEmpty()) {
        finishDigit_ = other.finishDigit_;
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
                digits_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                finishDigit_ = input.readStringRequireUtf8();
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

    private java.lang.Object digits_ = "";
    /**
     *
     *
     * <pre>
     * The dtmf digits.
     * </pre>
     *
     * <code>string digits = 1;</code>
     *
     * @return The digits.
     */
    public java.lang.String getDigits() {
      java.lang.Object ref = digits_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        digits_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The dtmf digits.
     * </pre>
     *
     * <code>string digits = 1;</code>
     *
     * @return The bytes for digits.
     */
    public com.google.protobuf.ByteString getDigitsBytes() {
      java.lang.Object ref = digits_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        digits_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The dtmf digits.
     * </pre>
     *
     * <code>string digits = 1;</code>
     *
     * @param value The digits to set.
     * @return This builder for chaining.
     */
    public Builder setDigits(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      digits_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dtmf digits.
     * </pre>
     *
     * <code>string digits = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDigits() {
      digits_ = getDefaultInstance().getDigits();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dtmf digits.
     * </pre>
     *
     * <code>string digits = 1;</code>
     *
     * @param value The bytes for digits to set.
     * @return This builder for chaining.
     */
    public Builder setDigitsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      digits_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object finishDigit_ = "";
    /**
     *
     *
     * <pre>
     * The finish digit (if any).
     * </pre>
     *
     * <code>string finish_digit = 2;</code>
     *
     * @return The finishDigit.
     */
    public java.lang.String getFinishDigit() {
      java.lang.Object ref = finishDigit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        finishDigit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The finish digit (if any).
     * </pre>
     *
     * <code>string finish_digit = 2;</code>
     *
     * @return The bytes for finishDigit.
     */
    public com.google.protobuf.ByteString getFinishDigitBytes() {
      java.lang.Object ref = finishDigit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        finishDigit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The finish digit (if any).
     * </pre>
     *
     * <code>string finish_digit = 2;</code>
     *
     * @param value The finishDigit to set.
     * @return This builder for chaining.
     */
    public Builder setFinishDigit(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      finishDigit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The finish digit (if any).
     * </pre>
     *
     * <code>string finish_digit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFinishDigit() {
      finishDigit_ = getDefaultInstance().getFinishDigit();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The finish digit (if any).
     * </pre>
     *
     * <code>string finish_digit = 2;</code>
     *
     * @param value The bytes for finishDigit to set.
     * @return This builder for chaining.
     */
    public Builder setFinishDigitBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      finishDigit_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.DtmfInput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.DtmfInput)
  private static final com.google.cloud.dialogflow.cx.v3.DtmfInput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.DtmfInput();
  }

  public static com.google.cloud.dialogflow.cx.v3.DtmfInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DtmfInput> PARSER =
      new com.google.protobuf.AbstractParser<DtmfInput>() {
        @java.lang.Override
        public DtmfInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<DtmfInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DtmfInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.DtmfInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
