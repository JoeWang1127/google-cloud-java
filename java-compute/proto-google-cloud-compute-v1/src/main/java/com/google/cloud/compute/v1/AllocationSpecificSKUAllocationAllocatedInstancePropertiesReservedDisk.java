/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk}
 */
public final class AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
    AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.newBuilder() to
  // construct.
  private AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk() {
    interface_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case -1764857416:
            {
              bitField0_ |= 0x00000001;
              diskSizeGb_ = input.readInt64();
              break;
            }
          case -273978934:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              interface_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1
                .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.class,
            com.google.cloud.compute.v1
                .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.Builder
                .class);
  }

  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.Interface}
   */
  public enum Interface implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_INTERFACE = 0;</code>
     */
    UNDEFINED_INTERFACE(0),
    /** <code>NVME = 2408800;</code> */
    NVME(2408800),
    /** <code>SCSI = 2539686;</code> */
    SCSI(2539686),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_INTERFACE = 0;</code>
     */
    public static final int UNDEFINED_INTERFACE_VALUE = 0;
    /** <code>NVME = 2408800;</code> */
    public static final int NVME_VALUE = 2408800;
    /** <code>SCSI = 2539686;</code> */
    public static final int SCSI_VALUE = 2539686;

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
    public static Interface valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Interface forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_INTERFACE;
        case 2408800:
          return NVME;
        case 2539686:
          return SCSI;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Interface> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Interface> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Interface>() {
          public Interface findValueByNumber(int number) {
            return Interface.forNumber(number);
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
      return com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Interface[] VALUES = values();

    public static Interface valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Interface(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.Interface)
  }

  private int bitField0_;
  public static final int DISK_SIZE_GB_FIELD_NUMBER = 316263735;
  private long diskSizeGb_;
  /**
   *
   *
   * <pre>
   * Specifies the size of the disk in base-2 GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return Whether the diskSizeGb field is set.
   */
  @java.lang.Override
  public boolean hasDiskSizeGb() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Specifies the size of the disk in base-2 GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 316263735;</code>
   *
   * @return The diskSizeGb.
   */
  @java.lang.Override
  public long getDiskSizeGb() {
    return diskSizeGb_;
  }

  public static final int INTERFACE_FIELD_NUMBER = 502623545;
  private volatile java.lang.Object interface_;
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return Whether the interface field is set.
   */
  @java.lang.Override
  public boolean hasInterface() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return The interface.
   */
  @java.lang.Override
  public java.lang.String getInterface() {
    java.lang.Object ref = interface_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interface_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * Check the Interface enum for the list of possible values.
   * </pre>
   *
   * <code>optional string interface = 502623545;</code>
   *
   * @return The bytes for interface.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInterfaceBytes() {
    java.lang.Object ref = interface_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      interface_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(316263735, diskSizeGb_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 502623545, interface_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(316263735, diskSizeGb_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(502623545, interface_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof
        com.google.cloud.compute.v1
            .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1
            .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
        other =
            (com.google.cloud.compute.v1
                    .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
                obj;

    if (hasDiskSizeGb() != other.hasDiskSizeGb()) return false;
    if (hasDiskSizeGb()) {
      if (getDiskSizeGb() != other.getDiskSizeGb()) return false;
    }
    if (hasInterface() != other.hasInterface()) return false;
    if (hasInterface()) {
      if (!getInterface().equals(other.getInterface())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDiskSizeGb()) {
      hash = (37 * hash) + DISK_SIZE_GB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDiskSizeGb());
    }
    if (hasInterface()) {
      hash = (37 * hash) + INTERFACE_FIELD_NUMBER;
      hash = (53 * hash) + getInterface().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      parseFrom(
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
      com.google.cloud.compute.v1
              .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
          prototype) {
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
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
      com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1
                  .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.class,
              com.google.cloud.compute.v1
                  .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      diskSizeGb_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      interface_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1
            .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1
            .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
        build() {
      com.google.cloud.compute.v1
              .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1
            .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
        buildPartial() {
      com.google.cloud.compute.v1
              .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
          result =
              new com.google.cloud.compute.v1
                  .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.diskSizeGb_ = diskSizeGb_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.interface_ = interface_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other
          instanceof
          com.google.cloud.compute.v1
              .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk) {
        return mergeFrom(
            (com.google.cloud.compute.v1
                    .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1
                .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
            other) {
      if (other
          == com.google.cloud.compute.v1
              .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
              .getDefaultInstance()) return this;
      if (other.hasDiskSizeGb()) {
        setDiskSizeGb(other.getDiskSizeGb());
      }
      if (other.hasInterface()) {
        bitField0_ |= 0x00000002;
        interface_ = other.interface_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.compute.v1
              .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
          parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1
                    .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private long diskSizeGb_;
    /**
     *
     *
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int64 disk_size_gb = 316263735;</code>
     *
     * @return Whether the diskSizeGb field is set.
     */
    @java.lang.Override
    public boolean hasDiskSizeGb() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int64 disk_size_gb = 316263735;</code>
     *
     * @return The diskSizeGb.
     */
    @java.lang.Override
    public long getDiskSizeGb() {
      return diskSizeGb_;
    }
    /**
     *
     *
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int64 disk_size_gb = 316263735;</code>
     *
     * @param value The diskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setDiskSizeGb(long value) {
      bitField0_ |= 0x00000001;
      diskSizeGb_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int64 disk_size_gb = 316263735;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000001);
      diskSizeGb_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object interface_ = "";
    /**
     *
     *
     * <pre>
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * Check the Interface enum for the list of possible values.
     * </pre>
     *
     * <code>optional string interface = 502623545;</code>
     *
     * @return Whether the interface field is set.
     */
    public boolean hasInterface() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * Check the Interface enum for the list of possible values.
     * </pre>
     *
     * <code>optional string interface = 502623545;</code>
     *
     * @return The interface.
     */
    public java.lang.String getInterface() {
      java.lang.Object ref = interface_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interface_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * Check the Interface enum for the list of possible values.
     * </pre>
     *
     * <code>optional string interface = 502623545;</code>
     *
     * @return The bytes for interface.
     */
    public com.google.protobuf.ByteString getInterfaceBytes() {
      java.lang.Object ref = interface_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        interface_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * Check the Interface enum for the list of possible values.
     * </pre>
     *
     * <code>optional string interface = 502623545;</code>
     *
     * @param value The interface to set.
     * @return This builder for chaining.
     */
    public Builder setInterface(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      interface_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * Check the Interface enum for the list of possible values.
     * </pre>
     *
     * <code>optional string interface = 502623545;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInterface() {
      bitField0_ = (bitField0_ & ~0x00000002);
      interface_ = getDefaultInstance().getInterface();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * Check the Interface enum for the list of possible values.
     * </pre>
     *
     * <code>optional string interface = 502623545;</code>
     *
     * @param value The bytes for interface to set.
     * @return This builder for chaining.
     */
    public Builder setInterfaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      interface_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
  private static final com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1
            .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk();
  }

  public static com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk>
      PARSER =
          new com.google.protobuf.AbstractParser<
              AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk>() {
            @java.lang.Override
            public AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
                parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
              return new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk(
                  input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<
          AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<
          AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1
          .AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
