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
// source: google/cloud/shell/v1/cloudshell.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.shell.v1;

/**
 *
 *
 * <pre>
 * Message included in the metadata field of operations returned from
 * [StartEnvironment][google.cloud.shell.v1.CloudShellService.StartEnvironment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.shell.v1.StartEnvironmentMetadata}
 */
public final class StartEnvironmentMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.shell.v1.StartEnvironmentMetadata)
    StartEnvironmentMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StartEnvironmentMetadata.newBuilder() to construct.
  private StartEnvironmentMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StartEnvironmentMetadata() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StartEnvironmentMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.shell.v1.StartEnvironmentMetadata.class,
            com.google.cloud.shell.v1.StartEnvironmentMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible states an environment might transition between during startup.
   * These states are not normally actionable by clients, but may be used to
   * show a progress message to the user. An environment won't necessarily go
   * through all of these states when starting. More states are likely to be
   * added in the future.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.shell.v1.StartEnvironmentMetadata.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The environment's start state is unknown.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The environment is in the process of being started, but no additional
     * details are available.
     * </pre>
     *
     * <code>STARTING = 1;</code>
     */
    STARTING(1),
    /**
     *
     *
     * <pre>
     * Startup is waiting for the user's disk to be unarchived. This can happen
     * when the user returns to Cloud Shell after not having used it for a
     * while, and suggests that startup will take longer than normal.
     * </pre>
     *
     * <code>UNARCHIVING_DISK = 2;</code>
     */
    UNARCHIVING_DISK(2),
    /**
     *
     *
     * <pre>
     * Startup is waiting for compute resources to be assigned to the
     * environment. This should normally happen very quickly, but an environment
     * might stay in this state for an extended period of time if the system is
     * experiencing heavy load.
     * </pre>
     *
     * <code>AWAITING_COMPUTE_RESOURCES = 4;</code>
     */
    AWAITING_COMPUTE_RESOURCES(4),
    /**
     *
     *
     * <pre>
     * Startup has completed. If the start operation was successful, the user
     * should be able to establish an SSH connection to their environment.
     * Otherwise, the operation will contain details of the failure.
     * </pre>
     *
     * <code>FINISHED = 3;</code>
     */
    FINISHED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The environment's start state is unknown.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The environment is in the process of being started, but no additional
     * details are available.
     * </pre>
     *
     * <code>STARTING = 1;</code>
     */
    public static final int STARTING_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Startup is waiting for the user's disk to be unarchived. This can happen
     * when the user returns to Cloud Shell after not having used it for a
     * while, and suggests that startup will take longer than normal.
     * </pre>
     *
     * <code>UNARCHIVING_DISK = 2;</code>
     */
    public static final int UNARCHIVING_DISK_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Startup is waiting for compute resources to be assigned to the
     * environment. This should normally happen very quickly, but an environment
     * might stay in this state for an extended period of time if the system is
     * experiencing heavy load.
     * </pre>
     *
     * <code>AWAITING_COMPUTE_RESOURCES = 4;</code>
     */
    public static final int AWAITING_COMPUTE_RESOURCES_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Startup has completed. If the start operation was successful, the user
     * should be able to establish an SSH connection to their environment.
     * Otherwise, the operation will contain details of the failure.
     * </pre>
     *
     * <code>FINISHED = 3;</code>
     */
    public static final int FINISHED_VALUE = 3;

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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return STARTING;
        case 2:
          return UNARCHIVING_DISK;
        case 4:
          return AWAITING_COMPUTE_RESOURCES;
        case 3:
          return FINISHED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
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
      return com.google.cloud.shell.v1.StartEnvironmentMetadata.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.shell.v1.StartEnvironmentMetadata.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   *
   *
   * <pre>
   * Current state of the environment being started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * Current state of the environment being started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.shell.v1.StartEnvironmentMetadata.State getState() {
    com.google.cloud.shell.v1.StartEnvironmentMetadata.State result =
        com.google.cloud.shell.v1.StartEnvironmentMetadata.State.forNumber(state_);
    return result == null
        ? com.google.cloud.shell.v1.StartEnvironmentMetadata.State.UNRECOGNIZED
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
    if (state_
        != com.google.cloud.shell.v1.StartEnvironmentMetadata.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.cloud.shell.v1.StartEnvironmentMetadata.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
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
    if (!(obj instanceof com.google.cloud.shell.v1.StartEnvironmentMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.shell.v1.StartEnvironmentMetadata other =
        (com.google.cloud.shell.v1.StartEnvironmentMetadata) obj;

    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.shell.v1.StartEnvironmentMetadata prototype) {
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
   * Message included in the metadata field of operations returned from
   * [StartEnvironment][google.cloud.shell.v1.CloudShellService.StartEnvironment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.shell.v1.StartEnvironmentMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.shell.v1.StartEnvironmentMetadata)
      com.google.cloud.shell.v1.StartEnvironmentMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.shell.v1.StartEnvironmentMetadata.class,
              com.google.cloud.shell.v1.StartEnvironmentMetadata.Builder.class);
    }

    // Construct using com.google.cloud.shell.v1.StartEnvironmentMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentMetadata getDefaultInstanceForType() {
      return com.google.cloud.shell.v1.StartEnvironmentMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentMetadata build() {
      com.google.cloud.shell.v1.StartEnvironmentMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentMetadata buildPartial() {
      com.google.cloud.shell.v1.StartEnvironmentMetadata result =
          new com.google.cloud.shell.v1.StartEnvironmentMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.shell.v1.StartEnvironmentMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
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
      if (other instanceof com.google.cloud.shell.v1.StartEnvironmentMetadata) {
        return mergeFrom((com.google.cloud.shell.v1.StartEnvironmentMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.shell.v1.StartEnvironmentMetadata other) {
      if (other == com.google.cloud.shell.v1.StartEnvironmentMetadata.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
                state_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * Current state of the environment being started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * Current state of the environment being started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Current state of the environment being started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentMetadata.State getState() {
      com.google.cloud.shell.v1.StartEnvironmentMetadata.State result =
          com.google.cloud.shell.v1.StartEnvironmentMetadata.State.forNumber(state_);
      return result == null
          ? com.google.cloud.shell.v1.StartEnvironmentMetadata.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Current state of the environment being started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.shell.v1.StartEnvironmentMetadata.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Current state of the environment being started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.StartEnvironmentMetadata.State state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.shell.v1.StartEnvironmentMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.shell.v1.StartEnvironmentMetadata)
  private static final com.google.cloud.shell.v1.StartEnvironmentMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.shell.v1.StartEnvironmentMetadata();
  }

  public static com.google.cloud.shell.v1.StartEnvironmentMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartEnvironmentMetadata> PARSER =
      new com.google.protobuf.AbstractParser<StartEnvironmentMetadata>() {
        @java.lang.Override
        public StartEnvironmentMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartEnvironmentMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartEnvironmentMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.shell.v1.StartEnvironmentMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
