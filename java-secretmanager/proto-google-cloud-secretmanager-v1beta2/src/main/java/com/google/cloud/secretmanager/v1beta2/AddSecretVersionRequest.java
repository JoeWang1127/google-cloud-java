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
// source: google/cloud/secretmanager/v1beta2/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.secretmanager.v1beta2;

/**
 *
 *
 * <pre>
 * Request message for
 * [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AddSecretVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secretmanager.v1beta2.AddSecretVersionRequest}
 */
public final class AddSecretVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.secretmanager.v1beta2.AddSecretVersionRequest)
    AddSecretVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AddSecretVersionRequest.newBuilder() to construct.
  private AddSecretVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddSecretVersionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddSecretVersionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.secretmanager.v1beta2.ServiceProto
        .internal_static_google_cloud_secretmanager_v1beta2_AddSecretVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1beta2.ServiceProto
        .internal_static_google_cloud_secretmanager_v1beta2_AddSecretVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.class,
            com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
   * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
   * Required. The resource name of the
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
   * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.cloud.secretmanager.v1beta2.SecretPayload payload_;
  /**
   *
   *
   * <pre>
   * Required. The secret payload of the
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The secret payload of the
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta2.SecretPayload getPayload() {
    return payload_ == null
        ? com.google.cloud.secretmanager.v1beta2.SecretPayload.getDefaultInstance()
        : payload_;
  }
  /**
   *
   *
   * <pre>
   * Required. The secret payload of the
   * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta2.SecretPayloadOrBuilder getPayloadOrBuilder() {
    return payload_ == null
        ? com.google.cloud.secretmanager.v1beta2.SecretPayload.getDefaultInstance()
        : payload_;
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
      output.writeMessage(2, getPayload());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPayload());
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
    if (!(obj instanceof com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest other =
        (com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload().equals(other.getPayload())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest parseFrom(
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
      com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest prototype) {
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
   * Request message for
   * [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AddSecretVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secretmanager.v1beta2.AddSecretVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secretmanager.v1beta2.AddSecretVersionRequest)
      com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.secretmanager.v1beta2.ServiceProto
          .internal_static_google_cloud_secretmanager_v1beta2_AddSecretVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1beta2.ServiceProto
          .internal_static_google_cloud_secretmanager_v1beta2_AddSecretVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.class,
              com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPayloadFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.secretmanager.v1beta2.ServiceProto
          .internal_static_google_cloud_secretmanager_v1beta2_AddSecretVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest build() {
      com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest buildPartial() {
      com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest result =
          new com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.payload_ = payloadBuilder_ == null ? payload_ : payloadBuilder_.build();
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
      if (other instanceof com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest) {
        return mergeFrom((com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest other) {
      if (other
          == com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
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
                input.readMessage(getPayloadFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
     * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
     * Required. The resource name of the
     * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
     * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
     * Required. The resource name of the
     * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
     * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
     * Required. The resource name of the
     * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
     * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
     * Required. The resource name of the
     * [Secret][google.cloud.secretmanager.v1beta2.Secret] to associate with the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion] in the
     * format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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

    private com.google.cloud.secretmanager.v1beta2.SecretPayload payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1beta2.SecretPayload,
            com.google.cloud.secretmanager.v1beta2.SecretPayload.Builder,
            com.google.cloud.secretmanager.v1beta2.SecretPayloadOrBuilder>
        payloadBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The payload.
     */
    public com.google.cloud.secretmanager.v1beta2.SecretPayload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null
            ? com.google.cloud.secretmanager.v1beta2.SecretPayload.getDefaultInstance()
            : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPayload(com.google.cloud.secretmanager.v1beta2.SecretPayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
      } else {
        payloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPayload(
        com.google.cloud.secretmanager.v1beta2.SecretPayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePayload(com.google.cloud.secretmanager.v1beta2.SecretPayload value) {
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && payload_ != null
            && payload_
                != com.google.cloud.secretmanager.v1beta2.SecretPayload.getDefaultInstance()) {
          getPayloadBuilder().mergeFrom(value);
        } else {
          payload_ = value;
        }
      } else {
        payloadBuilder_.mergeFrom(value);
      }
      if (payload_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.secretmanager.v1beta2.SecretPayload.Builder getPayloadBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.secretmanager.v1beta2.SecretPayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null
            ? com.google.cloud.secretmanager.v1beta2.SecretPayload.getDefaultInstance()
            : payload_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The secret payload of the
     * [SecretVersion][google.cloud.secretmanager.v1beta2.SecretVersion].
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1beta2.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1beta2.SecretPayload,
            com.google.cloud.secretmanager.v1beta2.SecretPayload.Builder,
            com.google.cloud.secretmanager.v1beta2.SecretPayloadOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.secretmanager.v1beta2.SecretPayload,
                com.google.cloud.secretmanager.v1beta2.SecretPayload.Builder,
                com.google.cloud.secretmanager.v1beta2.SecretPayloadOrBuilder>(
                getPayload(), getParentForChildren(), isClean());
        payload_ = null;
      }
      return payloadBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.secretmanager.v1beta2.AddSecretVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1beta2.AddSecretVersionRequest)
  private static final com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest();
  }

  public static com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddSecretVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<AddSecretVersionRequest>() {
        @java.lang.Override
        public AddSecretVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddSecretVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddSecretVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1beta2.AddSecretVersionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
