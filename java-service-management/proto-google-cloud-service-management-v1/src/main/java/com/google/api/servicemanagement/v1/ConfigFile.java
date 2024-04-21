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
// source: google/api/servicemanagement/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * Generic specification of a source configuration file
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ConfigFile}
 */
public final class ConfigFile extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ConfigFile)
    ConfigFileOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConfigFile.newBuilder() to construct.
  private ConfigFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConfigFile() {
    filePath_ = "";
    fileContents_ = com.google.protobuf.ByteString.EMPTY;
    fileType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConfigFile();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ResourcesProto
        .internal_static_google_api_servicemanagement_v1_ConfigFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ResourcesProto
        .internal_static_google_api_servicemanagement_v1_ConfigFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.ConfigFile.class,
            com.google.api.servicemanagement.v1.ConfigFile.Builder.class);
  }

  /** Protobuf enum {@code google.api.servicemanagement.v1.ConfigFile.FileType} */
  public enum FileType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unknown file type.
     * </pre>
     *
     * <code>FILE_TYPE_UNSPECIFIED = 0;</code>
     */
    FILE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * YAML-specification of service.
     * </pre>
     *
     * <code>SERVICE_CONFIG_YAML = 1;</code>
     */
    SERVICE_CONFIG_YAML(1),
    /**
     *
     *
     * <pre>
     * OpenAPI specification, serialized in JSON.
     * </pre>
     *
     * <code>OPEN_API_JSON = 2;</code>
     */
    OPEN_API_JSON(2),
    /**
     *
     *
     * <pre>
     * OpenAPI specification, serialized in YAML.
     * </pre>
     *
     * <code>OPEN_API_YAML = 3;</code>
     */
    OPEN_API_YAML(3),
    /**
     *
     *
     * <pre>
     * FileDescriptorSet, generated by protoc.
     *
     * To generate, use protoc with imports and source info included.
     * For an example test.proto file, the following command would put the value
     * in a new file named out.pb.
     *
     * $protoc --include_imports --include_source_info test.proto -o out.pb
     * </pre>
     *
     * <code>FILE_DESCRIPTOR_SET_PROTO = 4;</code>
     */
    FILE_DESCRIPTOR_SET_PROTO(4),
    /**
     *
     *
     * <pre>
     * Uncompiled Proto file. Used for storage and display purposes only,
     * currently server-side compilation is not supported. Should match the
     * inputs to 'protoc' command used to generated FILE_DESCRIPTOR_SET_PROTO. A
     * file of this type can only be included if at least one file of type
     * FILE_DESCRIPTOR_SET_PROTO is included.
     * </pre>
     *
     * <code>PROTO_FILE = 6;</code>
     */
    PROTO_FILE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unknown file type.
     * </pre>
     *
     * <code>FILE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int FILE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * YAML-specification of service.
     * </pre>
     *
     * <code>SERVICE_CONFIG_YAML = 1;</code>
     */
    public static final int SERVICE_CONFIG_YAML_VALUE = 1;
    /**
     *
     *
     * <pre>
     * OpenAPI specification, serialized in JSON.
     * </pre>
     *
     * <code>OPEN_API_JSON = 2;</code>
     */
    public static final int OPEN_API_JSON_VALUE = 2;
    /**
     *
     *
     * <pre>
     * OpenAPI specification, serialized in YAML.
     * </pre>
     *
     * <code>OPEN_API_YAML = 3;</code>
     */
    public static final int OPEN_API_YAML_VALUE = 3;
    /**
     *
     *
     * <pre>
     * FileDescriptorSet, generated by protoc.
     *
     * To generate, use protoc with imports and source info included.
     * For an example test.proto file, the following command would put the value
     * in a new file named out.pb.
     *
     * $protoc --include_imports --include_source_info test.proto -o out.pb
     * </pre>
     *
     * <code>FILE_DESCRIPTOR_SET_PROTO = 4;</code>
     */
    public static final int FILE_DESCRIPTOR_SET_PROTO_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Uncompiled Proto file. Used for storage and display purposes only,
     * currently server-side compilation is not supported. Should match the
     * inputs to 'protoc' command used to generated FILE_DESCRIPTOR_SET_PROTO. A
     * file of this type can only be included if at least one file of type
     * FILE_DESCRIPTOR_SET_PROTO is included.
     * </pre>
     *
     * <code>PROTO_FILE = 6;</code>
     */
    public static final int PROTO_FILE_VALUE = 6;

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
    public static FileType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FileType forNumber(int value) {
      switch (value) {
        case 0:
          return FILE_TYPE_UNSPECIFIED;
        case 1:
          return SERVICE_CONFIG_YAML;
        case 2:
          return OPEN_API_JSON;
        case 3:
          return OPEN_API_YAML;
        case 4:
          return FILE_DESCRIPTOR_SET_PROTO;
        case 6:
          return PROTO_FILE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FileType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<FileType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FileType>() {
          public FileType findValueByNumber(int number) {
            return FileType.forNumber(number);
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
      return com.google.api.servicemanagement.v1.ConfigFile.getDescriptor().getEnumTypes().get(0);
    }

    private static final FileType[] VALUES = values();

    public static FileType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FileType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.servicemanagement.v1.ConfigFile.FileType)
  }

  public static final int FILE_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filePath_ = "";
  /**
   *
   *
   * <pre>
   * The file name of the configuration file (full or relative path).
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The filePath.
   */
  @java.lang.Override
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The file name of the configuration file (full or relative path).
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The bytes for filePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_CONTENTS_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString fileContents_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * The bytes that constitute the file.
   * </pre>
   *
   * <code>bytes file_contents = 3;</code>
   *
   * @return The fileContents.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFileContents() {
    return fileContents_;
  }

  public static final int FILE_TYPE_FIELD_NUMBER = 4;
  private int fileType_ = 0;
  /**
   *
   *
   * <pre>
   * The type of configuration file this represents.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
   *
   * @return The enum numeric value on the wire for fileType.
   */
  @java.lang.Override
  public int getFileTypeValue() {
    return fileType_;
  }
  /**
   *
   *
   * <pre>
   * The type of configuration file this represents.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
   *
   * @return The fileType.
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigFile.FileType getFileType() {
    com.google.api.servicemanagement.v1.ConfigFile.FileType result =
        com.google.api.servicemanagement.v1.ConfigFile.FileType.forNumber(fileType_);
    return result == null
        ? com.google.api.servicemanagement.v1.ConfigFile.FileType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePath_);
    }
    if (!fileContents_.isEmpty()) {
      output.writeBytes(3, fileContents_);
    }
    if (fileType_
        != com.google.api.servicemanagement.v1.ConfigFile.FileType.FILE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, fileType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePath_);
    }
    if (!fileContents_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, fileContents_);
    }
    if (fileType_
        != com.google.api.servicemanagement.v1.ConfigFile.FileType.FILE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, fileType_);
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.ConfigFile)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.ConfigFile other =
        (com.google.api.servicemanagement.v1.ConfigFile) obj;

    if (!getFilePath().equals(other.getFilePath())) return false;
    if (!getFileContents().equals(other.getFileContents())) return false;
    if (fileType_ != other.fileType_) return false;
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
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    hash = (37 * hash) + FILE_CONTENTS_FIELD_NUMBER;
    hash = (53 * hash) + getFileContents().hashCode();
    hash = (37 * hash) + FILE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + fileType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ConfigFile parseFrom(
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

  public static Builder newBuilder(com.google.api.servicemanagement.v1.ConfigFile prototype) {
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
   * Generic specification of a source configuration file
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ConfigFile}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ConfigFile)
      com.google.api.servicemanagement.v1.ConfigFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ConfigFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ConfigFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.ConfigFile.class,
              com.google.api.servicemanagement.v1.ConfigFile.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.ConfigFile.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filePath_ = "";
      fileContents_ = com.google.protobuf.ByteString.EMPTY;
      fileType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ConfigFile_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigFile getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.ConfigFile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigFile build() {
      com.google.api.servicemanagement.v1.ConfigFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigFile buildPartial() {
      com.google.api.servicemanagement.v1.ConfigFile result =
          new com.google.api.servicemanagement.v1.ConfigFile(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.servicemanagement.v1.ConfigFile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filePath_ = filePath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileContents_ = fileContents_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fileType_ = fileType_;
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
      if (other instanceof com.google.api.servicemanagement.v1.ConfigFile) {
        return mergeFrom((com.google.api.servicemanagement.v1.ConfigFile) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.ConfigFile other) {
      if (other == com.google.api.servicemanagement.v1.ConfigFile.getDefaultInstance()) return this;
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFileContents() != com.google.protobuf.ByteString.EMPTY) {
        setFileContents(other.getFileContents());
      }
      if (other.fileType_ != 0) {
        setFileTypeValue(other.getFileTypeValue());
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
                filePath_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                fileContents_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 32:
              {
                fileType_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private java.lang.Object filePath_ = "";
    /**
     *
     *
     * <pre>
     * The file name of the configuration file (full or relative path).
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @return The filePath.
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The file name of the configuration file (full or relative path).
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @return The bytes for filePath.
     */
    public com.google.protobuf.ByteString getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The file name of the configuration file (full or relative path).
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @param value The filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The file name of the configuration file (full or relative path).
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilePath() {
      filePath_ = getDefaultInstance().getFilePath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The file name of the configuration file (full or relative path).
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @param value The bytes for filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString fileContents_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The bytes that constitute the file.
     * </pre>
     *
     * <code>bytes file_contents = 3;</code>
     *
     * @return The fileContents.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFileContents() {
      return fileContents_;
    }
    /**
     *
     *
     * <pre>
     * The bytes that constitute the file.
     * </pre>
     *
     * <code>bytes file_contents = 3;</code>
     *
     * @param value The fileContents to set.
     * @return This builder for chaining.
     */
    public Builder setFileContents(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fileContents_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The bytes that constitute the file.
     * </pre>
     *
     * <code>bytes file_contents = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFileContents() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fileContents_ = getDefaultInstance().getFileContents();
      onChanged();
      return this;
    }

    private int fileType_ = 0;
    /**
     *
     *
     * <pre>
     * The type of configuration file this represents.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
     *
     * @return The enum numeric value on the wire for fileType.
     */
    @java.lang.Override
    public int getFileTypeValue() {
      return fileType_;
    }
    /**
     *
     *
     * <pre>
     * The type of configuration file this represents.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
     *
     * @param value The enum numeric value on the wire for fileType to set.
     * @return This builder for chaining.
     */
    public Builder setFileTypeValue(int value) {
      fileType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of configuration file this represents.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
     *
     * @return The fileType.
     */
    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigFile.FileType getFileType() {
      com.google.api.servicemanagement.v1.ConfigFile.FileType result =
          com.google.api.servicemanagement.v1.ConfigFile.FileType.forNumber(fileType_);
      return result == null
          ? com.google.api.servicemanagement.v1.ConfigFile.FileType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of configuration file this represents.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
     *
     * @param value The fileType to set.
     * @return This builder for chaining.
     */
    public Builder setFileType(com.google.api.servicemanagement.v1.ConfigFile.FileType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      fileType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of configuration file this represents.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFileType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fileType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ConfigFile)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ConfigFile)
  private static final com.google.api.servicemanagement.v1.ConfigFile DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.ConfigFile();
  }

  public static com.google.api.servicemanagement.v1.ConfigFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigFile> PARSER =
      new com.google.protobuf.AbstractParser<ConfigFile>() {
        @java.lang.Override
        public ConfigFile parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfigFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
