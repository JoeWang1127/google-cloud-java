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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.accessapproval.v1;

/**
 *
 *
 * <pre>
 * A decision that has been made to dismiss an approval request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.DismissDecision}
 */
public final class DismissDecision extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.DismissDecision)
    DismissDecisionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DismissDecision.newBuilder() to construct.
  private DismissDecision(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DismissDecision() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DismissDecision();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_DismissDecision_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_DismissDecision_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.DismissDecision.class,
            com.google.cloud.accessapproval.v1.DismissDecision.Builder.class);
  }

  private int bitField0_;
  public static final int DISMISS_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp dismissTime_;
  /**
   *
   *
   * <pre>
   * The time at which the approval request was dismissed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
   *
   * @return Whether the dismissTime field is set.
   */
  @java.lang.Override
  public boolean hasDismissTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The time at which the approval request was dismissed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
   *
   * @return The dismissTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDismissTime() {
    return dismissTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dismissTime_;
  }
  /**
   *
   *
   * <pre>
   * The time at which the approval request was dismissed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDismissTimeOrBuilder() {
    return dismissTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dismissTime_;
  }

  public static final int IMPLICIT_FIELD_NUMBER = 2;
  private boolean implicit_ = false;
  /**
   *
   *
   * <pre>
   * This field will be true if the ApprovalRequest was implicitly dismissed due
   * to inaction by the access approval approvers (the request is not acted
   * on by the approvers before the exiration time).
   * </pre>
   *
   * <code>bool implicit = 2;</code>
   *
   * @return The implicit.
   */
  @java.lang.Override
  public boolean getImplicit() {
    return implicit_;
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
      output.writeMessage(1, getDismissTime());
    }
    if (implicit_ != false) {
      output.writeBool(2, implicit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDismissTime());
    }
    if (implicit_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, implicit_);
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
    if (!(obj instanceof com.google.cloud.accessapproval.v1.DismissDecision)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.DismissDecision other =
        (com.google.cloud.accessapproval.v1.DismissDecision) obj;

    if (hasDismissTime() != other.hasDismissTime()) return false;
    if (hasDismissTime()) {
      if (!getDismissTime().equals(other.getDismissTime())) return false;
    }
    if (getImplicit() != other.getImplicit()) return false;
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
    if (hasDismissTime()) {
      hash = (37 * hash) + DISMISS_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getDismissTime().hashCode();
    }
    hash = (37 * hash) + IMPLICIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getImplicit());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision parseFrom(
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

  public static Builder newBuilder(com.google.cloud.accessapproval.v1.DismissDecision prototype) {
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
   * A decision that has been made to dismiss an approval request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.DismissDecision}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.DismissDecision)
      com.google.cloud.accessapproval.v1.DismissDecisionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_DismissDecision_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_DismissDecision_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.DismissDecision.class,
              com.google.cloud.accessapproval.v1.DismissDecision.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.DismissDecision.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDismissTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dismissTime_ = null;
      if (dismissTimeBuilder_ != null) {
        dismissTimeBuilder_.dispose();
        dismissTimeBuilder_ = null;
      }
      implicit_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_DismissDecision_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.DismissDecision getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.DismissDecision.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.DismissDecision build() {
      com.google.cloud.accessapproval.v1.DismissDecision result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.DismissDecision buildPartial() {
      com.google.cloud.accessapproval.v1.DismissDecision result =
          new com.google.cloud.accessapproval.v1.DismissDecision(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.accessapproval.v1.DismissDecision result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dismissTime_ =
            dismissTimeBuilder_ == null ? dismissTime_ : dismissTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.implicit_ = implicit_;
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
      if (other instanceof com.google.cloud.accessapproval.v1.DismissDecision) {
        return mergeFrom((com.google.cloud.accessapproval.v1.DismissDecision) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.accessapproval.v1.DismissDecision other) {
      if (other == com.google.cloud.accessapproval.v1.DismissDecision.getDefaultInstance())
        return this;
      if (other.hasDismissTime()) {
        mergeDismissTime(other.getDismissTime());
      }
      if (other.getImplicit() != false) {
        setImplicit(other.getImplicit());
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
                input.readMessage(getDismissTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                implicit_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.protobuf.Timestamp dismissTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        dismissTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     *
     * @return Whether the dismissTime field is set.
     */
    public boolean hasDismissTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     *
     * @return The dismissTime.
     */
    public com.google.protobuf.Timestamp getDismissTime() {
      if (dismissTimeBuilder_ == null) {
        return dismissTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : dismissTime_;
      } else {
        return dismissTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    public Builder setDismissTime(com.google.protobuf.Timestamp value) {
      if (dismissTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dismissTime_ = value;
      } else {
        dismissTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    public Builder setDismissTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dismissTimeBuilder_ == null) {
        dismissTime_ = builderForValue.build();
      } else {
        dismissTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    public Builder mergeDismissTime(com.google.protobuf.Timestamp value) {
      if (dismissTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dismissTime_ != null
            && dismissTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDismissTimeBuilder().mergeFrom(value);
        } else {
          dismissTime_ = value;
        }
      } else {
        dismissTimeBuilder_.mergeFrom(value);
      }
      if (dismissTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    public Builder clearDismissTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dismissTime_ = null;
      if (dismissTimeBuilder_ != null) {
        dismissTimeBuilder_.dispose();
        dismissTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDismissTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDismissTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDismissTimeOrBuilder() {
      if (dismissTimeBuilder_ != null) {
        return dismissTimeBuilder_.getMessageOrBuilder();
      } else {
        return dismissTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : dismissTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time at which the approval request was dismissed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getDismissTimeFieldBuilder() {
      if (dismissTimeBuilder_ == null) {
        dismissTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getDismissTime(), getParentForChildren(), isClean());
        dismissTime_ = null;
      }
      return dismissTimeBuilder_;
    }

    private boolean implicit_;
    /**
     *
     *
     * <pre>
     * This field will be true if the ApprovalRequest was implicitly dismissed due
     * to inaction by the access approval approvers (the request is not acted
     * on by the approvers before the exiration time).
     * </pre>
     *
     * <code>bool implicit = 2;</code>
     *
     * @return The implicit.
     */
    @java.lang.Override
    public boolean getImplicit() {
      return implicit_;
    }
    /**
     *
     *
     * <pre>
     * This field will be true if the ApprovalRequest was implicitly dismissed due
     * to inaction by the access approval approvers (the request is not acted
     * on by the approvers before the exiration time).
     * </pre>
     *
     * <code>bool implicit = 2;</code>
     *
     * @param value The implicit to set.
     * @return This builder for chaining.
     */
    public Builder setImplicit(boolean value) {

      implicit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field will be true if the ApprovalRequest was implicitly dismissed due
     * to inaction by the access approval approvers (the request is not acted
     * on by the approvers before the exiration time).
     * </pre>
     *
     * <code>bool implicit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImplicit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      implicit_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.DismissDecision)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.DismissDecision)
  private static final com.google.cloud.accessapproval.v1.DismissDecision DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.DismissDecision();
  }

  public static com.google.cloud.accessapproval.v1.DismissDecision getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DismissDecision> PARSER =
      new com.google.protobuf.AbstractParser<DismissDecision>() {
        @java.lang.Override
        public DismissDecision parsePartialFrom(
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

  public static com.google.protobuf.Parser<DismissDecision> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DismissDecision> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.DismissDecision getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
