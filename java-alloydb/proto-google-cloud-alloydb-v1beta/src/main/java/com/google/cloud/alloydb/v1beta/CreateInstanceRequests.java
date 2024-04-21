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
// source: google/cloud/alloydb/v1beta/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.alloydb.v1beta;

/**
 *
 *
 * <pre>
 * See usage below for notes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1beta.CreateInstanceRequests}
 */
public final class CreateInstanceRequests extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1beta.CreateInstanceRequests)
    CreateInstanceRequestsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateInstanceRequests.newBuilder() to construct.
  private CreateInstanceRequests(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateInstanceRequests() {
    createInstanceRequests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateInstanceRequests();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1beta.ServiceProto
        .internal_static_google_cloud_alloydb_v1beta_CreateInstanceRequests_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1beta.ServiceProto
        .internal_static_google_cloud_alloydb_v1beta_CreateInstanceRequests_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1beta.CreateInstanceRequests.class,
            com.google.cloud.alloydb.v1beta.CreateInstanceRequests.Builder.class);
  }

  public static final int CREATE_INSTANCE_REQUESTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.alloydb.v1beta.CreateInstanceRequest>
      createInstanceRequests_;
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.alloydb.v1beta.CreateInstanceRequest>
      getCreateInstanceRequestsList() {
    return createInstanceRequests_;
  }
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder>
      getCreateInstanceRequestsOrBuilderList() {
    return createInstanceRequests_;
  }
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getCreateInstanceRequestsCount() {
    return createInstanceRequests_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.alloydb.v1beta.CreateInstanceRequest getCreateInstanceRequests(
      int index) {
    return createInstanceRequests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Primary and read replica instances to be created. This list
   * should not be empty.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder
      getCreateInstanceRequestsOrBuilder(int index) {
    return createInstanceRequests_.get(index);
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
    for (int i = 0; i < createInstanceRequests_.size(); i++) {
      output.writeMessage(1, createInstanceRequests_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < createInstanceRequests_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, createInstanceRequests_.get(i));
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
    if (!(obj instanceof com.google.cloud.alloydb.v1beta.CreateInstanceRequests)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1beta.CreateInstanceRequests other =
        (com.google.cloud.alloydb.v1beta.CreateInstanceRequests) obj;

    if (!getCreateInstanceRequestsList().equals(other.getCreateInstanceRequestsList()))
      return false;
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
    if (getCreateInstanceRequestsCount() > 0) {
      hash = (37 * hash) + CREATE_INSTANCE_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getCreateInstanceRequestsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests parseFrom(
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
      com.google.cloud.alloydb.v1beta.CreateInstanceRequests prototype) {
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
   * See usage below for notes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1beta.CreateInstanceRequests}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1beta.CreateInstanceRequests)
      com.google.cloud.alloydb.v1beta.CreateInstanceRequestsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1beta.ServiceProto
          .internal_static_google_cloud_alloydb_v1beta_CreateInstanceRequests_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1beta.ServiceProto
          .internal_static_google_cloud_alloydb_v1beta_CreateInstanceRequests_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1beta.CreateInstanceRequests.class,
              com.google.cloud.alloydb.v1beta.CreateInstanceRequests.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1beta.CreateInstanceRequests.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (createInstanceRequestsBuilder_ == null) {
        createInstanceRequests_ = java.util.Collections.emptyList();
      } else {
        createInstanceRequests_ = null;
        createInstanceRequestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1beta.ServiceProto
          .internal_static_google_cloud_alloydb_v1beta_CreateInstanceRequests_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequests getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1beta.CreateInstanceRequests.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequests build() {
      com.google.cloud.alloydb.v1beta.CreateInstanceRequests result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequests buildPartial() {
      com.google.cloud.alloydb.v1beta.CreateInstanceRequests result =
          new com.google.cloud.alloydb.v1beta.CreateInstanceRequests(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.alloydb.v1beta.CreateInstanceRequests result) {
      if (createInstanceRequestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          createInstanceRequests_ = java.util.Collections.unmodifiableList(createInstanceRequests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.createInstanceRequests_ = createInstanceRequests_;
      } else {
        result.createInstanceRequests_ = createInstanceRequestsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.alloydb.v1beta.CreateInstanceRequests result) {
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
      if (other instanceof com.google.cloud.alloydb.v1beta.CreateInstanceRequests) {
        return mergeFrom((com.google.cloud.alloydb.v1beta.CreateInstanceRequests) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1beta.CreateInstanceRequests other) {
      if (other == com.google.cloud.alloydb.v1beta.CreateInstanceRequests.getDefaultInstance())
        return this;
      if (createInstanceRequestsBuilder_ == null) {
        if (!other.createInstanceRequests_.isEmpty()) {
          if (createInstanceRequests_.isEmpty()) {
            createInstanceRequests_ = other.createInstanceRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCreateInstanceRequestsIsMutable();
            createInstanceRequests_.addAll(other.createInstanceRequests_);
          }
          onChanged();
        }
      } else {
        if (!other.createInstanceRequests_.isEmpty()) {
          if (createInstanceRequestsBuilder_.isEmpty()) {
            createInstanceRequestsBuilder_.dispose();
            createInstanceRequestsBuilder_ = null;
            createInstanceRequests_ = other.createInstanceRequests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            createInstanceRequestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCreateInstanceRequestsFieldBuilder()
                    : null;
          } else {
            createInstanceRequestsBuilder_.addAllMessages(other.createInstanceRequests_);
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
                com.google.cloud.alloydb.v1beta.CreateInstanceRequest m =
                    input.readMessage(
                        com.google.cloud.alloydb.v1beta.CreateInstanceRequest.parser(),
                        extensionRegistry);
                if (createInstanceRequestsBuilder_ == null) {
                  ensureCreateInstanceRequestsIsMutable();
                  createInstanceRequests_.add(m);
                } else {
                  createInstanceRequestsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.alloydb.v1beta.CreateInstanceRequest>
        createInstanceRequests_ = java.util.Collections.emptyList();

    private void ensureCreateInstanceRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        createInstanceRequests_ =
            new java.util.ArrayList<com.google.cloud.alloydb.v1beta.CreateInstanceRequest>(
                createInstanceRequests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.alloydb.v1beta.CreateInstanceRequest,
            com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder,
            com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder>
        createInstanceRequestsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.alloydb.v1beta.CreateInstanceRequest>
        getCreateInstanceRequestsList() {
      if (createInstanceRequestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(createInstanceRequests_);
      } else {
        return createInstanceRequestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getCreateInstanceRequestsCount() {
      if (createInstanceRequestsBuilder_ == null) {
        return createInstanceRequests_.size();
      } else {
        return createInstanceRequestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequest getCreateInstanceRequests(
        int index) {
      if (createInstanceRequestsBuilder_ == null) {
        return createInstanceRequests_.get(index);
      } else {
        return createInstanceRequestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCreateInstanceRequests(
        int index, com.google.cloud.alloydb.v1beta.CreateInstanceRequest value) {
      if (createInstanceRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.set(index, value);
        onChanged();
      } else {
        createInstanceRequestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCreateInstanceRequests(
        int index, com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder builderForValue) {
      if (createInstanceRequestsBuilder_ == null) {
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.set(index, builderForValue.build());
        onChanged();
      } else {
        createInstanceRequestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCreateInstanceRequests(
        com.google.cloud.alloydb.v1beta.CreateInstanceRequest value) {
      if (createInstanceRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.add(value);
        onChanged();
      } else {
        createInstanceRequestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCreateInstanceRequests(
        int index, com.google.cloud.alloydb.v1beta.CreateInstanceRequest value) {
      if (createInstanceRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.add(index, value);
        onChanged();
      } else {
        createInstanceRequestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCreateInstanceRequests(
        com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder builderForValue) {
      if (createInstanceRequestsBuilder_ == null) {
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.add(builderForValue.build());
        onChanged();
      } else {
        createInstanceRequestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCreateInstanceRequests(
        int index, com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder builderForValue) {
      if (createInstanceRequestsBuilder_ == null) {
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.add(index, builderForValue.build());
        onChanged();
      } else {
        createInstanceRequestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllCreateInstanceRequests(
        java.lang.Iterable<? extends com.google.cloud.alloydb.v1beta.CreateInstanceRequest>
            values) {
      if (createInstanceRequestsBuilder_ == null) {
        ensureCreateInstanceRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, createInstanceRequests_);
        onChanged();
      } else {
        createInstanceRequestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCreateInstanceRequests() {
      if (createInstanceRequestsBuilder_ == null) {
        createInstanceRequests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        createInstanceRequestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeCreateInstanceRequests(int index) {
      if (createInstanceRequestsBuilder_ == null) {
        ensureCreateInstanceRequestsIsMutable();
        createInstanceRequests_.remove(index);
        onChanged();
      } else {
        createInstanceRequestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder
        getCreateInstanceRequestsBuilder(int index) {
      return getCreateInstanceRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder
        getCreateInstanceRequestsOrBuilder(int index) {
      if (createInstanceRequestsBuilder_ == null) {
        return createInstanceRequests_.get(index);
      } else {
        return createInstanceRequestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder>
        getCreateInstanceRequestsOrBuilderList() {
      if (createInstanceRequestsBuilder_ != null) {
        return createInstanceRequestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(createInstanceRequests_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder
        addCreateInstanceRequestsBuilder() {
      return getCreateInstanceRequestsFieldBuilder()
          .addBuilder(com.google.cloud.alloydb.v1beta.CreateInstanceRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder
        addCreateInstanceRequestsBuilder(int index) {
      return getCreateInstanceRequestsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.alloydb.v1beta.CreateInstanceRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Primary and read replica instances to be created. This list
     * should not be empty.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.alloydb.v1beta.CreateInstanceRequest create_instance_requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder>
        getCreateInstanceRequestsBuilderList() {
      return getCreateInstanceRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.alloydb.v1beta.CreateInstanceRequest,
            com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder,
            com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder>
        getCreateInstanceRequestsFieldBuilder() {
      if (createInstanceRequestsBuilder_ == null) {
        createInstanceRequestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.alloydb.v1beta.CreateInstanceRequest,
                com.google.cloud.alloydb.v1beta.CreateInstanceRequest.Builder,
                com.google.cloud.alloydb.v1beta.CreateInstanceRequestOrBuilder>(
                createInstanceRequests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        createInstanceRequests_ = null;
      }
      return createInstanceRequestsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1beta.CreateInstanceRequests)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1beta.CreateInstanceRequests)
  private static final com.google.cloud.alloydb.v1beta.CreateInstanceRequests DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1beta.CreateInstanceRequests();
  }

  public static com.google.cloud.alloydb.v1beta.CreateInstanceRequests getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateInstanceRequests> PARSER =
      new com.google.protobuf.AbstractParser<CreateInstanceRequests>() {
        @java.lang.Override
        public CreateInstanceRequests parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateInstanceRequests> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateInstanceRequests> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1beta.CreateInstanceRequests getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
