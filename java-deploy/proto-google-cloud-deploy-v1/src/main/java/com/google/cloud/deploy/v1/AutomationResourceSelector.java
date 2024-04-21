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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * AutomationResourceSelector contains the information to select the resources
 * to which an Automation is going to be applied.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.AutomationResourceSelector}
 */
public final class AutomationResourceSelector extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.AutomationResourceSelector)
    AutomationResourceSelectorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutomationResourceSelector.newBuilder() to construct.
  private AutomationResourceSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutomationResourceSelector() {
    targets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutomationResourceSelector();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_AutomationResourceSelector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_AutomationResourceSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.AutomationResourceSelector.class,
            com.google.cloud.deploy.v1.AutomationResourceSelector.Builder.class);
  }

  public static final int TARGETS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.deploy.v1.TargetAttribute> targets_;
  /**
   *
   *
   * <pre>
   * Contains attributes about a target.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.deploy.v1.TargetAttribute> getTargetsList() {
    return targets_;
  }
  /**
   *
   *
   * <pre>
   * Contains attributes about a target.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.deploy.v1.TargetAttributeOrBuilder>
      getTargetsOrBuilderList() {
    return targets_;
  }
  /**
   *
   *
   * <pre>
   * Contains attributes about a target.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
   */
  @java.lang.Override
  public int getTargetsCount() {
    return targets_.size();
  }
  /**
   *
   *
   * <pre>
   * Contains attributes about a target.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetAttribute getTargets(int index) {
    return targets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Contains attributes about a target.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetAttributeOrBuilder getTargetsOrBuilder(int index) {
    return targets_.get(index);
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
    for (int i = 0; i < targets_.size(); i++) {
      output.writeMessage(1, targets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < targets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, targets_.get(i));
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
    if (!(obj instanceof com.google.cloud.deploy.v1.AutomationResourceSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.AutomationResourceSelector other =
        (com.google.cloud.deploy.v1.AutomationResourceSelector) obj;

    if (!getTargetsList().equals(other.getTargetsList())) return false;
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
    if (getTargetsCount() > 0) {
      hash = (37 * hash) + TARGETS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector parseFrom(
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
      com.google.cloud.deploy.v1.AutomationResourceSelector prototype) {
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
   * AutomationResourceSelector contains the information to select the resources
   * to which an Automation is going to be applied.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.AutomationResourceSelector}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.AutomationResourceSelector)
      com.google.cloud.deploy.v1.AutomationResourceSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_AutomationResourceSelector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_AutomationResourceSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.AutomationResourceSelector.class,
              com.google.cloud.deploy.v1.AutomationResourceSelector.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.AutomationResourceSelector.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (targetsBuilder_ == null) {
        targets_ = java.util.Collections.emptyList();
      } else {
        targets_ = null;
        targetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_AutomationResourceSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.AutomationResourceSelector getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.AutomationResourceSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.AutomationResourceSelector build() {
      com.google.cloud.deploy.v1.AutomationResourceSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.AutomationResourceSelector buildPartial() {
      com.google.cloud.deploy.v1.AutomationResourceSelector result =
          new com.google.cloud.deploy.v1.AutomationResourceSelector(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.deploy.v1.AutomationResourceSelector result) {
      if (targetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          targets_ = java.util.Collections.unmodifiableList(targets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targets_ = targets_;
      } else {
        result.targets_ = targetsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.deploy.v1.AutomationResourceSelector result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.deploy.v1.AutomationResourceSelector) {
        return mergeFrom((com.google.cloud.deploy.v1.AutomationResourceSelector) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.AutomationResourceSelector other) {
      if (other == com.google.cloud.deploy.v1.AutomationResourceSelector.getDefaultInstance())
        return this;
      if (targetsBuilder_ == null) {
        if (!other.targets_.isEmpty()) {
          if (targets_.isEmpty()) {
            targets_ = other.targets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetsIsMutable();
            targets_.addAll(other.targets_);
          }
          onChanged();
        }
      } else {
        if (!other.targets_.isEmpty()) {
          if (targetsBuilder_.isEmpty()) {
            targetsBuilder_.dispose();
            targetsBuilder_ = null;
            targets_ = other.targets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            targetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTargetsFieldBuilder()
                    : null;
          } else {
            targetsBuilder_.addAllMessages(other.targets_);
          }
        }
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
                com.google.cloud.deploy.v1.TargetAttribute m =
                    input.readMessage(
                        com.google.cloud.deploy.v1.TargetAttribute.parser(), extensionRegistry);
                if (targetsBuilder_ == null) {
                  ensureTargetsIsMutable();
                  targets_.add(m);
                } else {
                  targetsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.deploy.v1.TargetAttribute> targets_ =
        java.util.Collections.emptyList();

    private void ensureTargetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        targets_ = new java.util.ArrayList<com.google.cloud.deploy.v1.TargetAttribute>(targets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.deploy.v1.TargetAttribute,
            com.google.cloud.deploy.v1.TargetAttribute.Builder,
            com.google.cloud.deploy.v1.TargetAttributeOrBuilder>
        targetsBuilder_;

    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public java.util.List<com.google.cloud.deploy.v1.TargetAttribute> getTargetsList() {
      if (targetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(targets_);
      } else {
        return targetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public int getTargetsCount() {
      if (targetsBuilder_ == null) {
        return targets_.size();
      } else {
        return targetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public com.google.cloud.deploy.v1.TargetAttribute getTargets(int index) {
      if (targetsBuilder_ == null) {
        return targets_.get(index);
      } else {
        return targetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder setTargets(int index, com.google.cloud.deploy.v1.TargetAttribute value) {
      if (targetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetsIsMutable();
        targets_.set(index, value);
        onChanged();
      } else {
        targetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder setTargets(
        int index, com.google.cloud.deploy.v1.TargetAttribute.Builder builderForValue) {
      if (targetsBuilder_ == null) {
        ensureTargetsIsMutable();
        targets_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder addTargets(com.google.cloud.deploy.v1.TargetAttribute value) {
      if (targetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetsIsMutable();
        targets_.add(value);
        onChanged();
      } else {
        targetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder addTargets(int index, com.google.cloud.deploy.v1.TargetAttribute value) {
      if (targetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetsIsMutable();
        targets_.add(index, value);
        onChanged();
      } else {
        targetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder addTargets(com.google.cloud.deploy.v1.TargetAttribute.Builder builderForValue) {
      if (targetsBuilder_ == null) {
        ensureTargetsIsMutable();
        targets_.add(builderForValue.build());
        onChanged();
      } else {
        targetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder addTargets(
        int index, com.google.cloud.deploy.v1.TargetAttribute.Builder builderForValue) {
      if (targetsBuilder_ == null) {
        ensureTargetsIsMutable();
        targets_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder addAllTargets(
        java.lang.Iterable<? extends com.google.cloud.deploy.v1.TargetAttribute> values) {
      if (targetsBuilder_ == null) {
        ensureTargetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, targets_);
        onChanged();
      } else {
        targetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder clearTargets() {
      if (targetsBuilder_ == null) {
        targets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        targetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public Builder removeTargets(int index) {
      if (targetsBuilder_ == null) {
        ensureTargetsIsMutable();
        targets_.remove(index);
        onChanged();
      } else {
        targetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public com.google.cloud.deploy.v1.TargetAttribute.Builder getTargetsBuilder(int index) {
      return getTargetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public com.google.cloud.deploy.v1.TargetAttributeOrBuilder getTargetsOrBuilder(int index) {
      if (targetsBuilder_ == null) {
        return targets_.get(index);
      } else {
        return targetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.deploy.v1.TargetAttributeOrBuilder>
        getTargetsOrBuilderList() {
      if (targetsBuilder_ != null) {
        return targetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(targets_);
      }
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public com.google.cloud.deploy.v1.TargetAttribute.Builder addTargetsBuilder() {
      return getTargetsFieldBuilder()
          .addBuilder(com.google.cloud.deploy.v1.TargetAttribute.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public com.google.cloud.deploy.v1.TargetAttribute.Builder addTargetsBuilder(int index) {
      return getTargetsFieldBuilder()
          .addBuilder(index, com.google.cloud.deploy.v1.TargetAttribute.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Contains attributes about a target.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.TargetAttribute targets = 1;</code>
     */
    public java.util.List<com.google.cloud.deploy.v1.TargetAttribute.Builder>
        getTargetsBuilderList() {
      return getTargetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.deploy.v1.TargetAttribute,
            com.google.cloud.deploy.v1.TargetAttribute.Builder,
            com.google.cloud.deploy.v1.TargetAttributeOrBuilder>
        getTargetsFieldBuilder() {
      if (targetsBuilder_ == null) {
        targetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.deploy.v1.TargetAttribute,
                com.google.cloud.deploy.v1.TargetAttribute.Builder,
                com.google.cloud.deploy.v1.TargetAttributeOrBuilder>(
                targets_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        targets_ = null;
      }
      return targetsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.AutomationResourceSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.AutomationResourceSelector)
  private static final com.google.cloud.deploy.v1.AutomationResourceSelector DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.AutomationResourceSelector();
  }

  public static com.google.cloud.deploy.v1.AutomationResourceSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutomationResourceSelector> PARSER =
      new com.google.protobuf.AbstractParser<AutomationResourceSelector>() {
        @java.lang.Override
        public AutomationResourceSelector parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutomationResourceSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutomationResourceSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.AutomationResourceSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
