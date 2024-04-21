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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 *
 *
 * <pre>
 * State for Hierarchy Controller
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState}
 */
public final class HierarchyControllerState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState)
    HierarchyControllerStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HierarchyControllerState.newBuilder() to construct.
  private HierarchyControllerState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HierarchyControllerState() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HierarchyControllerState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState.class,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState.Builder
                .class);
  }

  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version_;
  /**
   *
   *
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
   * </code>
   *
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
   * </code>
   *
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion getVersion() {
    return version_ == null
        ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
            .getDefaultInstance()
        : version_;
  }
  /**
   *
   *
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersionOrBuilder
      getVersionOrBuilder() {
    return version_ == null
        ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
            .getDefaultInstance()
        : version_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
      state_;
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
   * </code>
   *
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
   * </code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
      getState() {
    return state_ == null
        ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
            .getDefaultInstance()
        : state_;
  }
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha
          .HierarchyControllerDeploymentStateOrBuilder
      getStateOrBuilder() {
    return state_ == null
        ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
            .getDefaultInstance()
        : state_;
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
      output.writeMessage(1, getVersion());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getVersion());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getState());
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
    if (!(obj
        instanceof com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState other =
        (com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState) obj;

    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion().equals(other.getVersion())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState().equals(other.getState())) return false;
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
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState parseFrom(
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
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState prototype) {
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
   * State for Hierarchy Controller
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState)
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState.class,
              com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getVersionFieldBuilder();
        getStateFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
        buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState result =
          new com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = versionBuilder_ == null ? version_ : versionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = stateBuilder_ == null ? state_ : stateBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other
          instanceof com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState) {
        return mergeFrom(
            (com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
              .getDefaultInstance()) return this;
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasState()) {
        mergeState(other.getState());
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
                input.readMessage(getVersionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getStateFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersionOrBuilder>
        versionBuilder_;
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     *
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     *
     * @return The version.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
        getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null
            ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
                .getDefaultInstance()
            : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder
            builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    public Builder mergeVersion(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && version_ != null
            && version_
                != com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
                    .getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      if (version_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder
        getVersionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersionOrBuilder
        getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null
            ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
                .getDefaultInstance()
            : version_;
      }
    }
    /**
     *
     *
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion version = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersionOrBuilder>
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion,
                com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder,
                com.google.cloud.gkehub.configmanagement.v1alpha
                    .HierarchyControllerVersionOrBuilder>(
                getVersion(), getParentForChildren(), isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
        state_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
                .Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha
                .HierarchyControllerDeploymentStateOrBuilder>
        stateBuilder_;
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     *
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     *
     * @return The state.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
        getState() {
      if (stateBuilder_ == null) {
        return state_ == null
            ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
                .getDefaultInstance()
            : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    public Builder setState(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
      } else {
        stateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    public Builder setState(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState.Builder
            builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    public Builder mergeState(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState value) {
      if (stateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && state_ != null
            && state_
                != com.google.cloud.gkehub.configmanagement.v1alpha
                    .HierarchyControllerDeploymentState.getDefaultInstance()) {
          getStateBuilder().mergeFrom(value);
        } else {
          state_ = value;
        }
      } else {
        stateBuilder_.mergeFrom(value);
      }
      if (state_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
            .Builder
        getStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha
            .HierarchyControllerDeploymentStateOrBuilder
        getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null
            ? com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
                .getDefaultInstance()
            : state_;
      }
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState state = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
                .Builder,
            com.google.cloud.gkehub.configmanagement.v1alpha
                .HierarchyControllerDeploymentStateOrBuilder>
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState,
                com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerDeploymentState
                    .Builder,
                com.google.cloud.gkehub.configmanagement.v1alpha
                    .HierarchyControllerDeploymentStateOrBuilder>(
                getState(), getParentForChildren(), isClean());
        state_ = null;
      }
      return stateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HierarchyControllerState> PARSER =
      new com.google.protobuf.AbstractParser<HierarchyControllerState>() {
        @java.lang.Override
        public HierarchyControllerState parsePartialFrom(
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

  public static com.google.protobuf.Parser<HierarchyControllerState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HierarchyControllerState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerState
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
