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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2;

/**
 *
 *
 * <pre>
 * A node-attached disk resource.
 * Next ID: 8;
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2.AttachedDisk}
 */
public final class AttachedDisk extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2.AttachedDisk)
    AttachedDiskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AttachedDisk.newBuilder() to construct.
  private AttachedDisk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AttachedDisk() {
    sourceDisk_ = "";
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AttachedDisk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_AttachedDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_AttachedDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2.AttachedDisk.class,
            com.google.cloud.tpu.v2.AttachedDisk.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The different mode of the attached disk.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.tpu.v2.AttachedDisk.DiskMode}
   */
  public enum DiskMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The disk mode is not known/set.
     * </pre>
     *
     * <code>DISK_MODE_UNSPECIFIED = 0;</code>
     */
    DISK_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Attaches the disk in read-write mode. Only one TPU node can attach a disk
     * in read-write mode at a time.
     * </pre>
     *
     * <code>READ_WRITE = 1;</code>
     */
    READ_WRITE(1),
    /**
     *
     *
     * <pre>
     * Attaches the disk in read-only mode. Multiple TPU nodes can attach
     * a disk in read-only mode at a time.
     * </pre>
     *
     * <code>READ_ONLY = 2;</code>
     */
    READ_ONLY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The disk mode is not known/set.
     * </pre>
     *
     * <code>DISK_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int DISK_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Attaches the disk in read-write mode. Only one TPU node can attach a disk
     * in read-write mode at a time.
     * </pre>
     *
     * <code>READ_WRITE = 1;</code>
     */
    public static final int READ_WRITE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Attaches the disk in read-only mode. Multiple TPU nodes can attach
     * a disk in read-only mode at a time.
     * </pre>
     *
     * <code>READ_ONLY = 2;</code>
     */
    public static final int READ_ONLY_VALUE = 2;

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
    public static DiskMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DiskMode forNumber(int value) {
      switch (value) {
        case 0:
          return DISK_MODE_UNSPECIFIED;
        case 1:
          return READ_WRITE;
        case 2:
          return READ_ONLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DiskMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<DiskMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiskMode>() {
          public DiskMode findValueByNumber(int number) {
            return DiskMode.forNumber(number);
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
      return com.google.cloud.tpu.v2.AttachedDisk.getDescriptor().getEnumTypes().get(0);
    }

    private static final DiskMode[] VALUES = values();

    public static DiskMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DiskMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.tpu.v2.AttachedDisk.DiskMode)
  }

  public static final int SOURCE_DISK_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceDisk_ = "";
  /**
   *
   *
   * <pre>
   * Specifies the full path to an existing disk.
   * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
   * </pre>
   *
   * <code>string source_disk = 3;</code>
   *
   * @return The sourceDisk.
   */
  @java.lang.Override
  public java.lang.String getSourceDisk() {
    java.lang.Object ref = sourceDisk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceDisk_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies the full path to an existing disk.
   * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
   * </pre>
   *
   * <code>string source_disk = 3;</code>
   *
   * @return The bytes for sourceDisk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceDiskBytes() {
    java.lang.Object ref = sourceDisk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceDisk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODE_FIELD_NUMBER = 4;
  private int mode_ = 0;
  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk.
   * If not specified, the default is READ_WRITE mode.
   * Only applicable to data_disks.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * The mode in which to attach this disk.
   * If not specified, the default is READ_WRITE mode.
   * Only applicable to data_disks.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.AttachedDisk.DiskMode getMode() {
    com.google.cloud.tpu.v2.AttachedDisk.DiskMode result =
        com.google.cloud.tpu.v2.AttachedDisk.DiskMode.forNumber(mode_);
    return result == null ? com.google.cloud.tpu.v2.AttachedDisk.DiskMode.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceDisk_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sourceDisk_);
    }
    if (mode_ != com.google.cloud.tpu.v2.AttachedDisk.DiskMode.DISK_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceDisk_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sourceDisk_);
    }
    if (mode_ != com.google.cloud.tpu.v2.AttachedDisk.DiskMode.DISK_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, mode_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2.AttachedDisk)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2.AttachedDisk other = (com.google.cloud.tpu.v2.AttachedDisk) obj;

    if (!getSourceDisk().equals(other.getSourceDisk())) return false;
    if (mode_ != other.mode_) return false;
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
    hash = (37 * hash) + SOURCE_DISK_FIELD_NUMBER;
    hash = (53 * hash) + getSourceDisk().hashCode();
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.AttachedDisk parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2.AttachedDisk prototype) {
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
   * A node-attached disk resource.
   * Next ID: 8;
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2.AttachedDisk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2.AttachedDisk)
      com.google.cloud.tpu.v2.AttachedDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_AttachedDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_AttachedDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2.AttachedDisk.class,
              com.google.cloud.tpu.v2.AttachedDisk.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2.AttachedDisk.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceDisk_ = "";
      mode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_AttachedDisk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.AttachedDisk getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2.AttachedDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.AttachedDisk build() {
      com.google.cloud.tpu.v2.AttachedDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.AttachedDisk buildPartial() {
      com.google.cloud.tpu.v2.AttachedDisk result = new com.google.cloud.tpu.v2.AttachedDisk(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2.AttachedDisk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceDisk_ = sourceDisk_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mode_ = mode_;
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
      if (other instanceof com.google.cloud.tpu.v2.AttachedDisk) {
        return mergeFrom((com.google.cloud.tpu.v2.AttachedDisk) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2.AttachedDisk other) {
      if (other == com.google.cloud.tpu.v2.AttachedDisk.getDefaultInstance()) return this;
      if (!other.getSourceDisk().isEmpty()) {
        sourceDisk_ = other.sourceDisk_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
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
            case 26:
              {
                sourceDisk_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 26
            case 32:
              {
                mode_ = input.readEnum();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object sourceDisk_ = "";
    /**
     *
     *
     * <pre>
     * Specifies the full path to an existing disk.
     * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * </pre>
     *
     * <code>string source_disk = 3;</code>
     *
     * @return The sourceDisk.
     */
    public java.lang.String getSourceDisk() {
      java.lang.Object ref = sourceDisk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceDisk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the full path to an existing disk.
     * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * </pre>
     *
     * <code>string source_disk = 3;</code>
     *
     * @return The bytes for sourceDisk.
     */
    public com.google.protobuf.ByteString getSourceDiskBytes() {
      java.lang.Object ref = sourceDisk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceDisk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the full path to an existing disk.
     * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * </pre>
     *
     * <code>string source_disk = 3;</code>
     *
     * @param value The sourceDisk to set.
     * @return This builder for chaining.
     */
    public Builder setSourceDisk(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceDisk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the full path to an existing disk.
     * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * </pre>
     *
     * <code>string source_disk = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceDisk() {
      sourceDisk_ = getDefaultInstance().getSourceDisk();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the full path to an existing disk.
     * For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * </pre>
     *
     * <code>string source_disk = 3;</code>
     *
     * @param value The bytes for sourceDisk to set.
     * @return This builder for chaining.
     */
    public Builder setSourceDiskBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceDisk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * The mode in which to attach this disk.
     * If not specified, the default is READ_WRITE mode.
     * Only applicable to data_disks.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
     *
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * The mode in which to attach this disk.
     * If not specified, the default is READ_WRITE mode.
     * Only applicable to data_disks.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
     *
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mode in which to attach this disk.
     * If not specified, the default is READ_WRITE mode.
     * Only applicable to data_disks.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public com.google.cloud.tpu.v2.AttachedDisk.DiskMode getMode() {
      com.google.cloud.tpu.v2.AttachedDisk.DiskMode result =
          com.google.cloud.tpu.v2.AttachedDisk.DiskMode.forNumber(mode_);
      return result == null ? com.google.cloud.tpu.v2.AttachedDisk.DiskMode.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The mode in which to attach this disk.
     * If not specified, the default is READ_WRITE mode.
     * Only applicable to data_disks.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.google.cloud.tpu.v2.AttachedDisk.DiskMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mode in which to attach this disk.
     * If not specified, the default is READ_WRITE mode.
     * Only applicable to data_disks.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AttachedDisk.DiskMode mode = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2.AttachedDisk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2.AttachedDisk)
  private static final com.google.cloud.tpu.v2.AttachedDisk DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2.AttachedDisk();
  }

  public static com.google.cloud.tpu.v2.AttachedDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttachedDisk> PARSER =
      new com.google.protobuf.AbstractParser<AttachedDisk>() {
        @java.lang.Override
        public AttachedDisk parsePartialFrom(
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

  public static com.google.protobuf.Parser<AttachedDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachedDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2.AttachedDisk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
