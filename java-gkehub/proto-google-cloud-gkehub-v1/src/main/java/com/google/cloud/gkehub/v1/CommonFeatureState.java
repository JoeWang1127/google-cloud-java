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
// source: google/cloud/gkehub/v1/feature.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1;

/**
 *
 *
 * <pre>
 * CommonFeatureState contains Hub-wide Feature status information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1.CommonFeatureState}
 */
public final class CommonFeatureState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1.CommonFeatureState)
    CommonFeatureStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CommonFeatureState.newBuilder() to construct.
  private CommonFeatureState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CommonFeatureState() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CommonFeatureState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_CommonFeatureState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_CommonFeatureState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1.CommonFeatureState.class,
            com.google.cloud.gkehub.v1.CommonFeatureState.Builder.class);
  }

  private int bitField0_;
  public static final int STATE_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.v1.FeatureState state_;
  /**
   *
   *
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1.FeatureState getState() {
    return state_ == null ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance() : state_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder() {
    return state_ == null ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance() : state_;
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
      output.writeMessage(1, getState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getState());
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
    if (!(obj instanceof com.google.cloud.gkehub.v1.CommonFeatureState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1.CommonFeatureState other =
        (com.google.cloud.gkehub.v1.CommonFeatureState) obj;

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
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1.CommonFeatureState prototype) {
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
   * CommonFeatureState contains Hub-wide Feature status information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1.CommonFeatureState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1.CommonFeatureState)
      com.google.cloud.gkehub.v1.CommonFeatureStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_CommonFeatureState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_CommonFeatureState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1.CommonFeatureState.class,
              com.google.cloud.gkehub.v1.CommonFeatureState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1.CommonFeatureState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getStateFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_CommonFeatureState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.CommonFeatureState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1.CommonFeatureState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.CommonFeatureState build() {
      com.google.cloud.gkehub.v1.CommonFeatureState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.CommonFeatureState buildPartial() {
      com.google.cloud.gkehub.v1.CommonFeatureState result =
          new com.google.cloud.gkehub.v1.CommonFeatureState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1.CommonFeatureState result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = stateBuilder_ == null ? state_ : stateBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.v1.CommonFeatureState) {
        return mergeFrom((com.google.cloud.gkehub.v1.CommonFeatureState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1.CommonFeatureState other) {
      if (other == com.google.cloud.gkehub.v1.CommonFeatureState.getDefaultInstance()) return this;
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
                input.readMessage(getStateFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.gkehub.v1.FeatureState state_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1.FeatureState,
            com.google.cloud.gkehub.v1.FeatureState.Builder,
            com.google.cloud.gkehub.v1.FeatureStateOrBuilder>
        stateBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The state.
     */
    public com.google.cloud.gkehub.v1.FeatureState getState() {
      if (stateBuilder_ == null) {
        return state_ == null
            ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()
            : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setState(com.google.cloud.gkehub.v1.FeatureState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
      } else {
        stateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setState(com.google.cloud.gkehub.v1.FeatureState.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeState(com.google.cloud.gkehub.v1.FeatureState value) {
      if (stateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && state_ != null
            && state_ != com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()) {
          getStateBuilder().mergeFrom(value);
        } else {
          state_ = value;
        }
      } else {
        stateBuilder_.mergeFrom(value);
      }
      if (state_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.v1.FeatureState.Builder getStateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null
            ? com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()
            : state_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The "running state" of the Feature in this Hub.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1.FeatureState,
            com.google.cloud.gkehub.v1.FeatureState.Builder,
            com.google.cloud.gkehub.v1.FeatureStateOrBuilder>
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.v1.FeatureState,
                com.google.cloud.gkehub.v1.FeatureState.Builder,
                com.google.cloud.gkehub.v1.FeatureStateOrBuilder>(
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1.CommonFeatureState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.CommonFeatureState)
  private static final com.google.cloud.gkehub.v1.CommonFeatureState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1.CommonFeatureState();
  }

  public static com.google.cloud.gkehub.v1.CommonFeatureState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommonFeatureState> PARSER =
      new com.google.protobuf.AbstractParser<CommonFeatureState>() {
        @java.lang.Override
        public CommonFeatureState parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommonFeatureState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommonFeatureState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1.CommonFeatureState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
