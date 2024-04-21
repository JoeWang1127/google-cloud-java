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
// source: google/cloud/translate/v3/translation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.translate.v3;

/**
 *
 *
 * <pre>
 * Request message for CreateGlossary.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.CreateGlossaryRequest}
 */
public final class CreateGlossaryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.CreateGlossaryRequest)
    CreateGlossaryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGlossaryRequest.newBuilder() to construct.
  private CreateGlossaryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGlossaryRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGlossaryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_CreateGlossaryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_CreateGlossaryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.CreateGlossaryRequest.class,
            com.google.cloud.translate.v3.CreateGlossaryRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GLOSSARY_FIELD_NUMBER = 2;
  private com.google.cloud.translate.v3.Glossary glossary_;
  /**
   *
   *
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the glossary field is set.
   */
  @java.lang.Override
  public boolean hasGlossary() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The glossary.
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.Glossary getGlossary() {
    return glossary_ == null
        ? com.google.cloud.translate.v3.Glossary.getDefaultInstance()
        : glossary_;
  }
  /**
   *
   *
   * <pre>
   * Required. The glossary to create.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.translate.v3.GlossaryOrBuilder getGlossaryOrBuilder() {
    return glossary_ == null
        ? com.google.cloud.translate.v3.Glossary.getDefaultInstance()
        : glossary_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getGlossary());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGlossary());
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
    if (!(obj instanceof com.google.cloud.translate.v3.CreateGlossaryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.CreateGlossaryRequest other =
        (com.google.cloud.translate.v3.CreateGlossaryRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasGlossary() != other.hasGlossary()) return false;
    if (hasGlossary()) {
      if (!getGlossary().equals(other.getGlossary())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasGlossary()) {
      hash = (37 * hash) + GLOSSARY_FIELD_NUMBER;
      hash = (53 * hash) + getGlossary().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.translate.v3.CreateGlossaryRequest prototype) {
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
   * Request message for CreateGlossary.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.CreateGlossaryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.CreateGlossaryRequest)
      com.google.cloud.translate.v3.CreateGlossaryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_CreateGlossaryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_CreateGlossaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.CreateGlossaryRequest.class,
              com.google.cloud.translate.v3.CreateGlossaryRequest.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.CreateGlossaryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getGlossaryFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      glossary_ = null;
      if (glossaryBuilder_ != null) {
        glossaryBuilder_.dispose();
        glossaryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_CreateGlossaryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.CreateGlossaryRequest getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.CreateGlossaryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.CreateGlossaryRequest build() {
      com.google.cloud.translate.v3.CreateGlossaryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.CreateGlossaryRequest buildPartial() {
      com.google.cloud.translate.v3.CreateGlossaryRequest result =
          new com.google.cloud.translate.v3.CreateGlossaryRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.translate.v3.CreateGlossaryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.glossary_ = glossaryBuilder_ == null ? glossary_ : glossaryBuilder_.build();
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
      if (other instanceof com.google.cloud.translate.v3.CreateGlossaryRequest) {
        return mergeFrom((com.google.cloud.translate.v3.CreateGlossaryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.CreateGlossaryRequest other) {
      if (other == com.google.cloud.translate.v3.CreateGlossaryRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGlossary()) {
        mergeGlossary(other.getGlossary());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getGlossaryFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.translate.v3.Glossary glossary_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3.Glossary,
            com.google.cloud.translate.v3.Glossary.Builder,
            com.google.cloud.translate.v3.GlossaryOrBuilder>
        glossaryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the glossary field is set.
     */
    public boolean hasGlossary() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The glossary.
     */
    public com.google.cloud.translate.v3.Glossary getGlossary() {
      if (glossaryBuilder_ == null) {
        return glossary_ == null
            ? com.google.cloud.translate.v3.Glossary.getDefaultInstance()
            : glossary_;
      } else {
        return glossaryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGlossary(com.google.cloud.translate.v3.Glossary value) {
      if (glossaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        glossary_ = value;
      } else {
        glossaryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGlossary(com.google.cloud.translate.v3.Glossary.Builder builderForValue) {
      if (glossaryBuilder_ == null) {
        glossary_ = builderForValue.build();
      } else {
        glossaryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGlossary(com.google.cloud.translate.v3.Glossary value) {
      if (glossaryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && glossary_ != null
            && glossary_ != com.google.cloud.translate.v3.Glossary.getDefaultInstance()) {
          getGlossaryBuilder().mergeFrom(value);
        } else {
          glossary_ = value;
        }
      } else {
        glossaryBuilder_.mergeFrom(value);
      }
      if (glossary_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGlossary() {
      bitField0_ = (bitField0_ & ~0x00000002);
      glossary_ = null;
      if (glossaryBuilder_ != null) {
        glossaryBuilder_.dispose();
        glossaryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.translate.v3.Glossary.Builder getGlossaryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGlossaryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.translate.v3.GlossaryOrBuilder getGlossaryOrBuilder() {
      if (glossaryBuilder_ != null) {
        return glossaryBuilder_.getMessageOrBuilder();
      } else {
        return glossary_ == null
            ? com.google.cloud.translate.v3.Glossary.getDefaultInstance()
            : glossary_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The glossary to create.
     * </pre>
     *
     * <code>
     * .google.cloud.translation.v3.Glossary glossary = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3.Glossary,
            com.google.cloud.translate.v3.Glossary.Builder,
            com.google.cloud.translate.v3.GlossaryOrBuilder>
        getGlossaryFieldBuilder() {
      if (glossaryBuilder_ == null) {
        glossaryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.translate.v3.Glossary,
                com.google.cloud.translate.v3.Glossary.Builder,
                com.google.cloud.translate.v3.GlossaryOrBuilder>(
                getGlossary(), getParentForChildren(), isClean());
        glossary_ = null;
      }
      return glossaryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.CreateGlossaryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.CreateGlossaryRequest)
  private static final com.google.cloud.translate.v3.CreateGlossaryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.CreateGlossaryRequest();
  }

  public static com.google.cloud.translate.v3.CreateGlossaryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGlossaryRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGlossaryRequest>() {
        @java.lang.Override
        public CreateGlossaryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateGlossaryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGlossaryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.CreateGlossaryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
