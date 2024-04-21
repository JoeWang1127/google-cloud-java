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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.DiskTypesScopedList}
 */
public final class DiskTypesScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.DiskTypesScopedList)
    DiskTypesScopedListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiskTypesScopedList.newBuilder() to construct.
  private DiskTypesScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiskTypesScopedList() {
    diskTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiskTypesScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_DiskTypesScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_DiskTypesScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.DiskTypesScopedList.class,
            com.google.cloud.compute.v1.DiskTypesScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int DISK_TYPES_FIELD_NUMBER = 198926167;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.DiskType> diskTypes_;
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.DiskType> getDiskTypesList() {
    return diskTypes_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.DiskTypeOrBuilder>
      getDiskTypesOrBuilderList() {
    return diskTypes_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  @java.lang.Override
  public int getDiskTypesCount() {
    return diskTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskType getDiskTypes(int index) {
    return diskTypes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disk types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskTypeOrBuilder getDiskTypesOrBuilder(int index) {
    return diskTypes_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < diskTypes_.size(); i++) {
      output.writeMessage(198926167, diskTypes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < diskTypes_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(198926167, diskTypes_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.DiskTypesScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.DiskTypesScopedList other =
        (com.google.cloud.compute.v1.DiskTypesScopedList) obj;

    if (!getDiskTypesList().equals(other.getDiskTypesList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getDiskTypesCount() > 0) {
      hash = (37 * hash) + DISK_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getDiskTypesList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.DiskTypesScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.DiskTypesScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.DiskTypesScopedList)
      com.google.cloud.compute.v1.DiskTypesScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DiskTypesScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DiskTypesScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.DiskTypesScopedList.class,
              com.google.cloud.compute.v1.DiskTypesScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.DiskTypesScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDiskTypesFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (diskTypesBuilder_ == null) {
        diskTypes_ = java.util.Collections.emptyList();
      } else {
        diskTypes_ = null;
        diskTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DiskTypesScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DiskTypesScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.DiskTypesScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DiskTypesScopedList build() {
      com.google.cloud.compute.v1.DiskTypesScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DiskTypesScopedList buildPartial() {
      com.google.cloud.compute.v1.DiskTypesScopedList result =
          new com.google.cloud.compute.v1.DiskTypesScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.DiskTypesScopedList result) {
      if (diskTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          diskTypes_ = java.util.Collections.unmodifiableList(diskTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.diskTypes_ = diskTypes_;
      } else {
        result.diskTypes_ = diskTypesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.DiskTypesScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.DiskTypesScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.DiskTypesScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.DiskTypesScopedList other) {
      if (other == com.google.cloud.compute.v1.DiskTypesScopedList.getDefaultInstance())
        return this;
      if (diskTypesBuilder_ == null) {
        if (!other.diskTypes_.isEmpty()) {
          if (diskTypes_.isEmpty()) {
            diskTypes_ = other.diskTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDiskTypesIsMutable();
            diskTypes_.addAll(other.diskTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.diskTypes_.isEmpty()) {
          if (diskTypesBuilder_.isEmpty()) {
            diskTypesBuilder_.dispose();
            diskTypesBuilder_ = null;
            diskTypes_ = other.diskTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            diskTypesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDiskTypesFieldBuilder()
                    : null;
          } else {
            diskTypesBuilder_.addAllMessages(other.diskTypes_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case 1591409338:
              {
                com.google.cloud.compute.v1.DiskType m =
                    input.readMessage(
                        com.google.cloud.compute.v1.DiskType.parser(), extensionRegistry);
                if (diskTypesBuilder_ == null) {
                  ensureDiskTypesIsMutable();
                  diskTypes_.add(m);
                } else {
                  diskTypesBuilder_.addMessage(m);
                }
                break;
              } // case 1591409338
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

    private java.util.List<com.google.cloud.compute.v1.DiskType> diskTypes_ =
        java.util.Collections.emptyList();

    private void ensureDiskTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        diskTypes_ = new java.util.ArrayList<com.google.cloud.compute.v1.DiskType>(diskTypes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.DiskType,
            com.google.cloud.compute.v1.DiskType.Builder,
            com.google.cloud.compute.v1.DiskTypeOrBuilder>
        diskTypesBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.DiskType> getDiskTypesList() {
      if (diskTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(diskTypes_);
      } else {
        return diskTypesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public int getDiskTypesCount() {
      if (diskTypesBuilder_ == null) {
        return diskTypes_.size();
      } else {
        return diskTypesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public com.google.cloud.compute.v1.DiskType getDiskTypes(int index) {
      if (diskTypesBuilder_ == null) {
        return diskTypes_.get(index);
      } else {
        return diskTypesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder setDiskTypes(int index, com.google.cloud.compute.v1.DiskType value) {
      if (diskTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiskTypesIsMutable();
        diskTypes_.set(index, value);
        onChanged();
      } else {
        diskTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder setDiskTypes(
        int index, com.google.cloud.compute.v1.DiskType.Builder builderForValue) {
      if (diskTypesBuilder_ == null) {
        ensureDiskTypesIsMutable();
        diskTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        diskTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder addDiskTypes(com.google.cloud.compute.v1.DiskType value) {
      if (diskTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiskTypesIsMutable();
        diskTypes_.add(value);
        onChanged();
      } else {
        diskTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder addDiskTypes(int index, com.google.cloud.compute.v1.DiskType value) {
      if (diskTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiskTypesIsMutable();
        diskTypes_.add(index, value);
        onChanged();
      } else {
        diskTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder addDiskTypes(com.google.cloud.compute.v1.DiskType.Builder builderForValue) {
      if (diskTypesBuilder_ == null) {
        ensureDiskTypesIsMutable();
        diskTypes_.add(builderForValue.build());
        onChanged();
      } else {
        diskTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder addDiskTypes(
        int index, com.google.cloud.compute.v1.DiskType.Builder builderForValue) {
      if (diskTypesBuilder_ == null) {
        ensureDiskTypesIsMutable();
        diskTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        diskTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder addAllDiskTypes(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.DiskType> values) {
      if (diskTypesBuilder_ == null) {
        ensureDiskTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, diskTypes_);
        onChanged();
      } else {
        diskTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder clearDiskTypes() {
      if (diskTypesBuilder_ == null) {
        diskTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        diskTypesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public Builder removeDiskTypes(int index) {
      if (diskTypesBuilder_ == null) {
        ensureDiskTypesIsMutable();
        diskTypes_.remove(index);
        onChanged();
      } else {
        diskTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public com.google.cloud.compute.v1.DiskType.Builder getDiskTypesBuilder(int index) {
      return getDiskTypesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public com.google.cloud.compute.v1.DiskTypeOrBuilder getDiskTypesOrBuilder(int index) {
      if (diskTypesBuilder_ == null) {
        return diskTypes_.get(index);
      } else {
        return diskTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.DiskTypeOrBuilder>
        getDiskTypesOrBuilderList() {
      if (diskTypesBuilder_ != null) {
        return diskTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(diskTypes_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public com.google.cloud.compute.v1.DiskType.Builder addDiskTypesBuilder() {
      return getDiskTypesFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.DiskType.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public com.google.cloud.compute.v1.DiskType.Builder addDiskTypesBuilder(int index) {
      return getDiskTypesFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.DiskType.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disk types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskType disk_types = 198926167;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.DiskType.Builder> getDiskTypesBuilderList() {
      return getDiskTypesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.DiskType,
            com.google.cloud.compute.v1.DiskType.Builder,
            com.google.cloud.compute.v1.DiskTypeOrBuilder>
        getDiskTypesFieldBuilder() {
      if (diskTypesBuilder_ == null) {
        diskTypesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.DiskType,
                com.google.cloud.compute.v1.DiskType.Builder,
                com.google.cloud.compute.v1.DiskTypeOrBuilder>(
                diskTypes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        diskTypes_ = null;
      }
      return diskTypesBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.DiskTypesScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.DiskTypesScopedList)
  private static final com.google.cloud.compute.v1.DiskTypesScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.DiskTypesScopedList();
  }

  public static com.google.cloud.compute.v1.DiskTypesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskTypesScopedList> PARSER =
      new com.google.protobuf.AbstractParser<DiskTypesScopedList>() {
        @java.lang.Override
        public DiskTypesScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiskTypesScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskTypesScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.DiskTypesScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
