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
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v2;

/**
 *
 *
 * <pre>
 * Message for creating a Repository.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.CreateRepositoryRequest}
 */
public final class CreateRepositoryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.CreateRepositoryRequest)
    CreateRepositoryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateRepositoryRequest.newBuilder() to construct.
  private CreateRepositoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRepositoryRequest() {
    parent_ = "";
    repositoryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateRepositoryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_CreateRepositoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_CreateRepositoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v2.CreateRepositoryRequest.class,
            com.google.cloudbuild.v2.CreateRepositoryRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The connection to contain the repository. If the request is part
   * of a BatchCreateRepositoriesRequest, this field should be empty or match
   * the parent specified there.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The connection to contain the repository. If the request is part
   * of a BatchCreateRepositoriesRequest, this field should be empty or match
   * the parent specified there.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPOSITORY_FIELD_NUMBER = 2;
  private com.google.cloudbuild.v2.Repository repository_;
  /**
   *
   *
   * <pre>
   * Required. The repository to create.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the repository field is set.
   */
  @java.lang.Override
  public boolean hasRepository() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The repository to create.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The repository.
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.Repository getRepository() {
    return repository_ == null
        ? com.google.cloudbuild.v2.Repository.getDefaultInstance()
        : repository_;
  }
  /**
   *
   *
   * <pre>
   * Required. The repository to create.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v2.RepositoryOrBuilder getRepositoryOrBuilder() {
    return repository_ == null
        ? com.google.cloudbuild.v2.Repository.getDefaultInstance()
        : repository_;
  }

  public static final int REPOSITORY_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object repositoryId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the repository, which will become the final
   * component of the repository's resource name. This ID should be unique in
   * the connection. Allows alphanumeric characters and any of
   * -._~%!$&amp;'()*+,;=&#64;.
   * </pre>
   *
   * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The repositoryId.
   */
  @java.lang.Override
  public java.lang.String getRepositoryId() {
    java.lang.Object ref = repositoryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repositoryId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the repository, which will become the final
   * component of the repository's resource name. This ID should be unique in
   * the connection. Allows alphanumeric characters and any of
   * -._~%!$&amp;'()*+,;=&#64;.
   * </pre>
   *
   * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for repositoryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRepositoryIdBytes() {
    java.lang.Object ref = repositoryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      repositoryId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getRepository());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repositoryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, repositoryId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRepository());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repositoryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, repositoryId_);
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
    if (!(obj instanceof com.google.cloudbuild.v2.CreateRepositoryRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v2.CreateRepositoryRequest other =
        (com.google.cloudbuild.v2.CreateRepositoryRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasRepository() != other.hasRepository()) return false;
    if (hasRepository()) {
      if (!getRepository().equals(other.getRepository())) return false;
    }
    if (!getRepositoryId().equals(other.getRepositoryId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasRepository()) {
      hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
      hash = (53 * hash) + getRepository().hashCode();
    }
    hash = (37 * hash) + REPOSITORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRepositoryId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v2.CreateRepositoryRequest prototype) {
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
   * Message for creating a Repository.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.CreateRepositoryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.CreateRepositoryRequest)
      com.google.cloudbuild.v2.CreateRepositoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_CreateRepositoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_CreateRepositoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v2.CreateRepositoryRequest.class,
              com.google.cloudbuild.v2.CreateRepositoryRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v2.CreateRepositoryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRepositoryFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      repository_ = null;
      if (repositoryBuilder_ != null) {
        repositoryBuilder_.dispose();
        repositoryBuilder_ = null;
      }
      repositoryId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_CreateRepositoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.CreateRepositoryRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v2.CreateRepositoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.CreateRepositoryRequest build() {
      com.google.cloudbuild.v2.CreateRepositoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v2.CreateRepositoryRequest buildPartial() {
      com.google.cloudbuild.v2.CreateRepositoryRequest result =
          new com.google.cloudbuild.v2.CreateRepositoryRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v2.CreateRepositoryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.repository_ = repositoryBuilder_ == null ? repository_ : repositoryBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.repositoryId_ = repositoryId_;
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
      if (other instanceof com.google.cloudbuild.v2.CreateRepositoryRequest) {
        return mergeFrom((com.google.cloudbuild.v2.CreateRepositoryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v2.CreateRepositoryRequest other) {
      if (other == com.google.cloudbuild.v2.CreateRepositoryRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRepository()) {
        mergeRepository(other.getRepository());
      }
      if (!other.getRepositoryId().isEmpty()) {
        repositoryId_ = other.repositoryId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRepositoryFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                repositoryId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The connection to contain the repository. If the request is part
     * of a BatchCreateRepositoriesRequest, this field should be empty or match
     * the parent specified there.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The connection to contain the repository. If the request is part
     * of a BatchCreateRepositoriesRequest, this field should be empty or match
     * the parent specified there.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The connection to contain the repository. If the request is part
     * of a BatchCreateRepositoriesRequest, this field should be empty or match
     * the parent specified there.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The connection to contain the repository. If the request is part
     * of a BatchCreateRepositoriesRequest, this field should be empty or match
     * the parent specified there.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The connection to contain the repository. If the request is part
     * of a BatchCreateRepositoriesRequest, this field should be empty or match
     * the parent specified there.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v2.Repository repository_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v2.Repository,
            com.google.cloudbuild.v2.Repository.Builder,
            com.google.cloudbuild.v2.RepositoryOrBuilder>
        repositoryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the repository field is set.
     */
    public boolean hasRepository() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The repository.
     */
    public com.google.cloudbuild.v2.Repository getRepository() {
      if (repositoryBuilder_ == null) {
        return repository_ == null
            ? com.google.cloudbuild.v2.Repository.getDefaultInstance()
            : repository_;
      } else {
        return repositoryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRepository(com.google.cloudbuild.v2.Repository value) {
      if (repositoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repository_ = value;
      } else {
        repositoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRepository(com.google.cloudbuild.v2.Repository.Builder builderForValue) {
      if (repositoryBuilder_ == null) {
        repository_ = builderForValue.build();
      } else {
        repositoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRepository(com.google.cloudbuild.v2.Repository value) {
      if (repositoryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && repository_ != null
            && repository_ != com.google.cloudbuild.v2.Repository.getDefaultInstance()) {
          getRepositoryBuilder().mergeFrom(value);
        } else {
          repository_ = value;
        }
      } else {
        repositoryBuilder_.mergeFrom(value);
      }
      if (repository_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRepository() {
      bitField0_ = (bitField0_ & ~0x00000002);
      repository_ = null;
      if (repositoryBuilder_ != null) {
        repositoryBuilder_.dispose();
        repositoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloudbuild.v2.Repository.Builder getRepositoryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRepositoryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloudbuild.v2.RepositoryOrBuilder getRepositoryOrBuilder() {
      if (repositoryBuilder_ != null) {
        return repositoryBuilder_.getMessageOrBuilder();
      } else {
        return repository_ == null
            ? com.google.cloudbuild.v2.Repository.getDefaultInstance()
            : repository_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The repository to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v2.Repository,
            com.google.cloudbuild.v2.Repository.Builder,
            com.google.cloudbuild.v2.RepositoryOrBuilder>
        getRepositoryFieldBuilder() {
      if (repositoryBuilder_ == null) {
        repositoryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v2.Repository,
                com.google.cloudbuild.v2.Repository.Builder,
                com.google.cloudbuild.v2.RepositoryOrBuilder>(
                getRepository(), getParentForChildren(), isClean());
        repository_ = null;
      }
      return repositoryBuilder_;
    }

    private java.lang.Object repositoryId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the repository, which will become the final
     * component of the repository's resource name. This ID should be unique in
     * the connection. Allows alphanumeric characters and any of
     * -._~%!$&amp;'()*+,;=&#64;.
     * </pre>
     *
     * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The repositoryId.
     */
    public java.lang.String getRepositoryId() {
      java.lang.Object ref = repositoryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repositoryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the repository, which will become the final
     * component of the repository's resource name. This ID should be unique in
     * the connection. Allows alphanumeric characters and any of
     * -._~%!$&amp;'()*+,;=&#64;.
     * </pre>
     *
     * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for repositoryId.
     */
    public com.google.protobuf.ByteString getRepositoryIdBytes() {
      java.lang.Object ref = repositoryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        repositoryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the repository, which will become the final
     * component of the repository's resource name. This ID should be unique in
     * the connection. Allows alphanumeric characters and any of
     * -._~%!$&amp;'()*+,;=&#64;.
     * </pre>
     *
     * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The repositoryId to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      repositoryId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the repository, which will become the final
     * component of the repository's resource name. This ID should be unique in
     * the connection. Allows alphanumeric characters and any of
     * -._~%!$&amp;'()*+,;=&#64;.
     * </pre>
     *
     * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRepositoryId() {
      repositoryId_ = getDefaultInstance().getRepositoryId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the repository, which will become the final
     * component of the repository's resource name. This ID should be unique in
     * the connection. Allows alphanumeric characters and any of
     * -._~%!$&amp;'()*+,;=&#64;.
     * </pre>
     *
     * <code>string repository_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for repositoryId to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      repositoryId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.CreateRepositoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.CreateRepositoryRequest)
  private static final com.google.cloudbuild.v2.CreateRepositoryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v2.CreateRepositoryRequest();
  }

  public static com.google.cloudbuild.v2.CreateRepositoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRepositoryRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRepositoryRequest>() {
        @java.lang.Override
        public CreateRepositoryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRepositoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRepositoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v2.CreateRepositoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
