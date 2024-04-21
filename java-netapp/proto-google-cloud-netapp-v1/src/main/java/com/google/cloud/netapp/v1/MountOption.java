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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * View only mount options for a volume.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.MountOption}
 */
public final class MountOption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.MountOption)
    MountOptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MountOption.newBuilder() to construct.
  private MountOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MountOption() {
    export_ = "";
    exportFull_ = "";
    protocol_ = 0;
    instructions_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MountOption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_MountOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_MountOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.MountOption.class,
            com.google.cloud.netapp.v1.MountOption.Builder.class);
  }

  public static final int EXPORT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object export_ = "";
  /**
   *
   *
   * <pre>
   * Export string
   * </pre>
   *
   * <code>string export = 1;</code>
   *
   * @return The export.
   */
  @java.lang.Override
  public java.lang.String getExport() {
    java.lang.Object ref = export_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      export_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Export string
   * </pre>
   *
   * <code>string export = 1;</code>
   *
   * @return The bytes for export.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExportBytes() {
    java.lang.Object ref = export_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      export_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPORT_FULL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object exportFull_ = "";
  /**
   *
   *
   * <pre>
   * Full export string
   * </pre>
   *
   * <code>string export_full = 2;</code>
   *
   * @return The exportFull.
   */
  @java.lang.Override
  public java.lang.String getExportFull() {
    java.lang.Object ref = exportFull_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exportFull_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Full export string
   * </pre>
   *
   * <code>string export_full = 2;</code>
   *
   * @return The bytes for exportFull.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExportFullBytes() {
    java.lang.Object ref = exportFull_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      exportFull_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROTOCOL_FIELD_NUMBER = 3;
  private int protocol_ = 0;
  /**
   *
   *
   * <pre>
   * Protocol to mount with.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
   *
   * @return The enum numeric value on the wire for protocol.
   */
  @java.lang.Override
  public int getProtocolValue() {
    return protocol_;
  }
  /**
   *
   *
   * <pre>
   * Protocol to mount with.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
   *
   * @return The protocol.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.Protocols getProtocol() {
    com.google.cloud.netapp.v1.Protocols result =
        com.google.cloud.netapp.v1.Protocols.forNumber(protocol_);
    return result == null ? com.google.cloud.netapp.v1.Protocols.UNRECOGNIZED : result;
  }

  public static final int INSTRUCTIONS_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instructions_ = "";
  /**
   *
   *
   * <pre>
   * Instructions for mounting
   * </pre>
   *
   * <code>string instructions = 4;</code>
   *
   * @return The instructions.
   */
  @java.lang.Override
  public java.lang.String getInstructions() {
    java.lang.Object ref = instructions_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instructions_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Instructions for mounting
   * </pre>
   *
   * <code>string instructions = 4;</code>
   *
   * @return The bytes for instructions.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstructionsBytes() {
    java.lang.Object ref = instructions_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instructions_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(export_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, export_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exportFull_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, exportFull_);
    }
    if (protocol_ != com.google.cloud.netapp.v1.Protocols.PROTOCOLS_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, protocol_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructions_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, instructions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(export_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, export_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exportFull_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, exportFull_);
    }
    if (protocol_ != com.google.cloud.netapp.v1.Protocols.PROTOCOLS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, protocol_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructions_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, instructions_);
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
    if (!(obj instanceof com.google.cloud.netapp.v1.MountOption)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.MountOption other = (com.google.cloud.netapp.v1.MountOption) obj;

    if (!getExport().equals(other.getExport())) return false;
    if (!getExportFull().equals(other.getExportFull())) return false;
    if (protocol_ != other.protocol_) return false;
    if (!getInstructions().equals(other.getInstructions())) return false;
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
    hash = (37 * hash) + EXPORT_FIELD_NUMBER;
    hash = (53 * hash) + getExport().hashCode();
    hash = (37 * hash) + EXPORT_FULL_FIELD_NUMBER;
    hash = (53 * hash) + getExportFull().hashCode();
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + protocol_;
    hash = (37 * hash) + INSTRUCTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getInstructions().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MountOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.MountOption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.MountOption parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.MountOption prototype) {
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
   * View only mount options for a volume.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.MountOption}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.MountOption)
      com.google.cloud.netapp.v1.MountOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_MountOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_MountOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.MountOption.class,
              com.google.cloud.netapp.v1.MountOption.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.MountOption.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      export_ = "";
      exportFull_ = "";
      protocol_ = 0;
      instructions_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_MountOption_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.MountOption getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.MountOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.MountOption build() {
      com.google.cloud.netapp.v1.MountOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.MountOption buildPartial() {
      com.google.cloud.netapp.v1.MountOption result =
          new com.google.cloud.netapp.v1.MountOption(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.MountOption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.export_ = export_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exportFull_ = exportFull_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.protocol_ = protocol_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.instructions_ = instructions_;
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
      if (other instanceof com.google.cloud.netapp.v1.MountOption) {
        return mergeFrom((com.google.cloud.netapp.v1.MountOption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.MountOption other) {
      if (other == com.google.cloud.netapp.v1.MountOption.getDefaultInstance()) return this;
      if (!other.getExport().isEmpty()) {
        export_ = other.export_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getExportFull().isEmpty()) {
        exportFull_ = other.exportFull_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.protocol_ != 0) {
        setProtocolValue(other.getProtocolValue());
      }
      if (!other.getInstructions().isEmpty()) {
        instructions_ = other.instructions_;
        bitField0_ |= 0x00000008;
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
                export_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                exportFull_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                protocol_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                instructions_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object export_ = "";
    /**
     *
     *
     * <pre>
     * Export string
     * </pre>
     *
     * <code>string export = 1;</code>
     *
     * @return The export.
     */
    public java.lang.String getExport() {
      java.lang.Object ref = export_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        export_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Export string
     * </pre>
     *
     * <code>string export = 1;</code>
     *
     * @return The bytes for export.
     */
    public com.google.protobuf.ByteString getExportBytes() {
      java.lang.Object ref = export_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        export_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Export string
     * </pre>
     *
     * <code>string export = 1;</code>
     *
     * @param value The export to set.
     * @return This builder for chaining.
     */
    public Builder setExport(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      export_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Export string
     * </pre>
     *
     * <code>string export = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExport() {
      export_ = getDefaultInstance().getExport();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Export string
     * </pre>
     *
     * <code>string export = 1;</code>
     *
     * @param value The bytes for export to set.
     * @return This builder for chaining.
     */
    public Builder setExportBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      export_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object exportFull_ = "";
    /**
     *
     *
     * <pre>
     * Full export string
     * </pre>
     *
     * <code>string export_full = 2;</code>
     *
     * @return The exportFull.
     */
    public java.lang.String getExportFull() {
      java.lang.Object ref = exportFull_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exportFull_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full export string
     * </pre>
     *
     * <code>string export_full = 2;</code>
     *
     * @return The bytes for exportFull.
     */
    public com.google.protobuf.ByteString getExportFullBytes() {
      java.lang.Object ref = exportFull_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        exportFull_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full export string
     * </pre>
     *
     * <code>string export_full = 2;</code>
     *
     * @param value The exportFull to set.
     * @return This builder for chaining.
     */
    public Builder setExportFull(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      exportFull_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full export string
     * </pre>
     *
     * <code>string export_full = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExportFull() {
      exportFull_ = getDefaultInstance().getExportFull();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full export string
     * </pre>
     *
     * <code>string export_full = 2;</code>
     *
     * @param value The bytes for exportFull to set.
     * @return This builder for chaining.
     */
    public Builder setExportFullBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      exportFull_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int protocol_ = 0;
    /**
     *
     *
     * <pre>
     * Protocol to mount with.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
     *
     * @return The enum numeric value on the wire for protocol.
     */
    @java.lang.Override
    public int getProtocolValue() {
      return protocol_;
    }
    /**
     *
     *
     * <pre>
     * Protocol to mount with.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
     *
     * @param value The enum numeric value on the wire for protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocolValue(int value) {
      protocol_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Protocol to mount with.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
     *
     * @return The protocol.
     */
    @java.lang.Override
    public com.google.cloud.netapp.v1.Protocols getProtocol() {
      com.google.cloud.netapp.v1.Protocols result =
          com.google.cloud.netapp.v1.Protocols.forNumber(protocol_);
      return result == null ? com.google.cloud.netapp.v1.Protocols.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Protocol to mount with.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
     *
     * @param value The protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocol(com.google.cloud.netapp.v1.Protocols value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      protocol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Protocol to mount with.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProtocol() {
      bitField0_ = (bitField0_ & ~0x00000004);
      protocol_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object instructions_ = "";
    /**
     *
     *
     * <pre>
     * Instructions for mounting
     * </pre>
     *
     * <code>string instructions = 4;</code>
     *
     * @return The instructions.
     */
    public java.lang.String getInstructions() {
      java.lang.Object ref = instructions_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instructions_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Instructions for mounting
     * </pre>
     *
     * <code>string instructions = 4;</code>
     *
     * @return The bytes for instructions.
     */
    public com.google.protobuf.ByteString getInstructionsBytes() {
      java.lang.Object ref = instructions_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instructions_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Instructions for mounting
     * </pre>
     *
     * <code>string instructions = 4;</code>
     *
     * @param value The instructions to set.
     * @return This builder for chaining.
     */
    public Builder setInstructions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instructions_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Instructions for mounting
     * </pre>
     *
     * <code>string instructions = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstructions() {
      instructions_ = getDefaultInstance().getInstructions();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Instructions for mounting
     * </pre>
     *
     * <code>string instructions = 4;</code>
     *
     * @param value The bytes for instructions to set.
     * @return This builder for chaining.
     */
    public Builder setInstructionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instructions_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.MountOption)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.MountOption)
  private static final com.google.cloud.netapp.v1.MountOption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.MountOption();
  }

  public static com.google.cloud.netapp.v1.MountOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MountOption> PARSER =
      new com.google.protobuf.AbstractParser<MountOption>() {
        @java.lang.Override
        public MountOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<MountOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MountOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.MountOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
