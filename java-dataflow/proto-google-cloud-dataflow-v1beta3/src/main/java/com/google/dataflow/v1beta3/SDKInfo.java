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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * SDK Information.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.SDKInfo}
 */
public final class SDKInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.SDKInfo)
    SDKInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SDKInfo.newBuilder() to construct.
  private SDKInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SDKInfo() {
    language_ = 0;
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SDKInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_SDKInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_SDKInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.SDKInfo.class,
            com.google.dataflow.v1beta3.SDKInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * SDK Language.
   * </pre>
   *
   * Protobuf enum {@code google.dataflow.v1beta3.SDKInfo.Language}
   */
  public enum Language implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * UNKNOWN Language.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     *
     *
     * <pre>
     * Java.
     * </pre>
     *
     * <code>JAVA = 1;</code>
     */
    JAVA(1),
    /**
     *
     *
     * <pre>
     * Python.
     * </pre>
     *
     * <code>PYTHON = 2;</code>
     */
    PYTHON(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * UNKNOWN Language.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Java.
     * </pre>
     *
     * <code>JAVA = 1;</code>
     */
    public static final int JAVA_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Python.
     * </pre>
     *
     * <code>PYTHON = 2;</code>
     */
    public static final int PYTHON_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Language valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Language forNumber(int value) {
      switch (value) {
        case 0:
          return UNKNOWN;
        case 1:
          return JAVA;
        case 2:
          return PYTHON;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Language> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Language> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Language>() {
          public Language findValueByNumber(int number) {
            return Language.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.dataflow.v1beta3.SDKInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final Language[] VALUES = values();

    public static Language valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Language(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.SDKInfo.Language)
  }

  public static final int LANGUAGE_FIELD_NUMBER = 1;
  private int language_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The SDK Language.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
   *
   * @return The enum numeric value on the wire for language.
   */
  @java.lang.Override
  public int getLanguageValue() {
    return language_;
  }
  /**
   *
   *
   * <pre>
   * Required. The SDK Language.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
   *
   * @return The language.
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.SDKInfo.Language getLanguage() {
    com.google.dataflow.v1beta3.SDKInfo.Language result =
        com.google.dataflow.v1beta3.SDKInfo.Language.forNumber(language_);
    return result == null ? com.google.dataflow.v1beta3.SDKInfo.Language.UNRECOGNIZED : result;
  }

  public static final int VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The SDK version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The SDK version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
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
    if (language_ != com.google.dataflow.v1beta3.SDKInfo.Language.UNKNOWN.getNumber()) {
      output.writeEnum(1, language_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (language_ != com.google.dataflow.v1beta3.SDKInfo.Language.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, language_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.SDKInfo)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.SDKInfo other = (com.google.dataflow.v1beta3.SDKInfo) obj;

    if (language_ != other.language_) return false;
    if (!getVersion().equals(other.getVersion())) return false;
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
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + language_;
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SDKInfo parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.SDKInfo prototype) {
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
   * SDK Information.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.SDKInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.SDKInfo)
      com.google.dataflow.v1beta3.SDKInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_SDKInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_SDKInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.SDKInfo.class,
              com.google.dataflow.v1beta3.SDKInfo.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.SDKInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      language_ = 0;
      version_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_SDKInfo_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SDKInfo getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.SDKInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SDKInfo build() {
      com.google.dataflow.v1beta3.SDKInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SDKInfo buildPartial() {
      com.google.dataflow.v1beta3.SDKInfo result = new com.google.dataflow.v1beta3.SDKInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.SDKInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.language_ = language_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
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
      if (other instanceof com.google.dataflow.v1beta3.SDKInfo) {
        return mergeFrom((com.google.dataflow.v1beta3.SDKInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.SDKInfo other) {
      if (other == com.google.dataflow.v1beta3.SDKInfo.getDefaultInstance()) return this;
      if (other.language_ != 0) {
        setLanguageValue(other.getLanguageValue());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
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
            case 8:
              {
                language_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                version_ = input.readStringRequireUtf8();
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

    private int language_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The SDK Language.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
     *
     * @return The enum numeric value on the wire for language.
     */
    @java.lang.Override
    public int getLanguageValue() {
      return language_;
    }
    /**
     *
     *
     * <pre>
     * Required. The SDK Language.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
     *
     * @param value The enum numeric value on the wire for language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageValue(int value) {
      language_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SDK Language.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
     *
     * @return The language.
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.SDKInfo.Language getLanguage() {
      com.google.dataflow.v1beta3.SDKInfo.Language result =
          com.google.dataflow.v1beta3.SDKInfo.Language.forNumber(language_);
      return result == null ? com.google.dataflow.v1beta3.SDKInfo.Language.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The SDK Language.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
     *
     * @param value The language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguage(com.google.dataflow.v1beta3.SDKInfo.Language value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      language_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SDK Language.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SDKInfo.Language language = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      language_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The SDK version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The SDK version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The SDK version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The SDK version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The SDK version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.SDKInfo)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.SDKInfo)
  private static final com.google.dataflow.v1beta3.SDKInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.SDKInfo();
  }

  public static com.google.dataflow.v1beta3.SDKInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SDKInfo> PARSER =
      new com.google.protobuf.AbstractParser<SDKInfo>() {
        @java.lang.Override
        public SDKInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SDKInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SDKInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.SDKInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
