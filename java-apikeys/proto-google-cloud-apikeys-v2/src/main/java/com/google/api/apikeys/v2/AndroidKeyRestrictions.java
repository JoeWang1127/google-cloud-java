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
// source: google/api/apikeys/v2/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.api.apikeys.v2;

/**
 *
 *
 * <pre>
 * The Android apps that are allowed to use the key.
 * </pre>
 *
 * Protobuf type {@code google.api.apikeys.v2.AndroidKeyRestrictions}
 */
public final class AndroidKeyRestrictions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.apikeys.v2.AndroidKeyRestrictions)
    AndroidKeyRestrictionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AndroidKeyRestrictions.newBuilder() to construct.
  private AndroidKeyRestrictions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AndroidKeyRestrictions() {
    allowedApplications_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AndroidKeyRestrictions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_AndroidKeyRestrictions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_AndroidKeyRestrictions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.apikeys.v2.AndroidKeyRestrictions.class,
            com.google.api.apikeys.v2.AndroidKeyRestrictions.Builder.class);
  }

  public static final int ALLOWED_APPLICATIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.api.apikeys.v2.AndroidApplication> allowedApplications_;
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.apikeys.v2.AndroidApplication> getAllowedApplicationsList() {
    return allowedApplications_;
  }
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.apikeys.v2.AndroidApplicationOrBuilder>
      getAllowedApplicationsOrBuilderList() {
    return allowedApplications_;
  }
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  @java.lang.Override
  public int getAllowedApplicationsCount() {
    return allowedApplications_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  @java.lang.Override
  public com.google.api.apikeys.v2.AndroidApplication getAllowedApplications(int index) {
    return allowedApplications_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  @java.lang.Override
  public com.google.api.apikeys.v2.AndroidApplicationOrBuilder getAllowedApplicationsOrBuilder(
      int index) {
    return allowedApplications_.get(index);
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
    for (int i = 0; i < allowedApplications_.size(); i++) {
      output.writeMessage(1, allowedApplications_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < allowedApplications_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, allowedApplications_.get(i));
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
    if (!(obj instanceof com.google.api.apikeys.v2.AndroidKeyRestrictions)) {
      return super.equals(obj);
    }
    com.google.api.apikeys.v2.AndroidKeyRestrictions other =
        (com.google.api.apikeys.v2.AndroidKeyRestrictions) obj;

    if (!getAllowedApplicationsList().equals(other.getAllowedApplicationsList())) return false;
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
    if (getAllowedApplicationsCount() > 0) {
      hash = (37 * hash) + ALLOWED_APPLICATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedApplicationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions parseFrom(
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

  public static Builder newBuilder(com.google.api.apikeys.v2.AndroidKeyRestrictions prototype) {
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
   * The Android apps that are allowed to use the key.
   * </pre>
   *
   * Protobuf type {@code google.api.apikeys.v2.AndroidKeyRestrictions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.apikeys.v2.AndroidKeyRestrictions)
      com.google.api.apikeys.v2.AndroidKeyRestrictionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_AndroidKeyRestrictions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_AndroidKeyRestrictions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.apikeys.v2.AndroidKeyRestrictions.class,
              com.google.api.apikeys.v2.AndroidKeyRestrictions.Builder.class);
    }

    // Construct using com.google.api.apikeys.v2.AndroidKeyRestrictions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (allowedApplicationsBuilder_ == null) {
        allowedApplications_ = java.util.Collections.emptyList();
      } else {
        allowedApplications_ = null;
        allowedApplicationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_AndroidKeyRestrictions_descriptor;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.AndroidKeyRestrictions getDefaultInstanceForType() {
      return com.google.api.apikeys.v2.AndroidKeyRestrictions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.AndroidKeyRestrictions build() {
      com.google.api.apikeys.v2.AndroidKeyRestrictions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.AndroidKeyRestrictions buildPartial() {
      com.google.api.apikeys.v2.AndroidKeyRestrictions result =
          new com.google.api.apikeys.v2.AndroidKeyRestrictions(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.api.apikeys.v2.AndroidKeyRestrictions result) {
      if (allowedApplicationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          allowedApplications_ = java.util.Collections.unmodifiableList(allowedApplications_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.allowedApplications_ = allowedApplications_;
      } else {
        result.allowedApplications_ = allowedApplicationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.apikeys.v2.AndroidKeyRestrictions result) {
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
      if (other instanceof com.google.api.apikeys.v2.AndroidKeyRestrictions) {
        return mergeFrom((com.google.api.apikeys.v2.AndroidKeyRestrictions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.apikeys.v2.AndroidKeyRestrictions other) {
      if (other == com.google.api.apikeys.v2.AndroidKeyRestrictions.getDefaultInstance())
        return this;
      if (allowedApplicationsBuilder_ == null) {
        if (!other.allowedApplications_.isEmpty()) {
          if (allowedApplications_.isEmpty()) {
            allowedApplications_ = other.allowedApplications_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAllowedApplicationsIsMutable();
            allowedApplications_.addAll(other.allowedApplications_);
          }
          onChanged();
        }
      } else {
        if (!other.allowedApplications_.isEmpty()) {
          if (allowedApplicationsBuilder_.isEmpty()) {
            allowedApplicationsBuilder_.dispose();
            allowedApplicationsBuilder_ = null;
            allowedApplications_ = other.allowedApplications_;
            bitField0_ = (bitField0_ & ~0x00000001);
            allowedApplicationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAllowedApplicationsFieldBuilder()
                    : null;
          } else {
            allowedApplicationsBuilder_.addAllMessages(other.allowedApplications_);
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
                com.google.api.apikeys.v2.AndroidApplication m =
                    input.readMessage(
                        com.google.api.apikeys.v2.AndroidApplication.parser(), extensionRegistry);
                if (allowedApplicationsBuilder_ == null) {
                  ensureAllowedApplicationsIsMutable();
                  allowedApplications_.add(m);
                } else {
                  allowedApplicationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.api.apikeys.v2.AndroidApplication> allowedApplications_ =
        java.util.Collections.emptyList();

    private void ensureAllowedApplicationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedApplications_ =
            new java.util.ArrayList<com.google.api.apikeys.v2.AndroidApplication>(
                allowedApplications_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.apikeys.v2.AndroidApplication,
            com.google.api.apikeys.v2.AndroidApplication.Builder,
            com.google.api.apikeys.v2.AndroidApplicationOrBuilder>
        allowedApplicationsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public java.util.List<com.google.api.apikeys.v2.AndroidApplication>
        getAllowedApplicationsList() {
      if (allowedApplicationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allowedApplications_);
      } else {
        return allowedApplicationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public int getAllowedApplicationsCount() {
      if (allowedApplicationsBuilder_ == null) {
        return allowedApplications_.size();
      } else {
        return allowedApplicationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public com.google.api.apikeys.v2.AndroidApplication getAllowedApplications(int index) {
      if (allowedApplicationsBuilder_ == null) {
        return allowedApplications_.get(index);
      } else {
        return allowedApplicationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder setAllowedApplications(
        int index, com.google.api.apikeys.v2.AndroidApplication value) {
      if (allowedApplicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.set(index, value);
        onChanged();
      } else {
        allowedApplicationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder setAllowedApplications(
        int index, com.google.api.apikeys.v2.AndroidApplication.Builder builderForValue) {
      if (allowedApplicationsBuilder_ == null) {
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.set(index, builderForValue.build());
        onChanged();
      } else {
        allowedApplicationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder addAllowedApplications(com.google.api.apikeys.v2.AndroidApplication value) {
      if (allowedApplicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.add(value);
        onChanged();
      } else {
        allowedApplicationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder addAllowedApplications(
        int index, com.google.api.apikeys.v2.AndroidApplication value) {
      if (allowedApplicationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.add(index, value);
        onChanged();
      } else {
        allowedApplicationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder addAllowedApplications(
        com.google.api.apikeys.v2.AndroidApplication.Builder builderForValue) {
      if (allowedApplicationsBuilder_ == null) {
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.add(builderForValue.build());
        onChanged();
      } else {
        allowedApplicationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder addAllowedApplications(
        int index, com.google.api.apikeys.v2.AndroidApplication.Builder builderForValue) {
      if (allowedApplicationsBuilder_ == null) {
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.add(index, builderForValue.build());
        onChanged();
      } else {
        allowedApplicationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder addAllAllowedApplications(
        java.lang.Iterable<? extends com.google.api.apikeys.v2.AndroidApplication> values) {
      if (allowedApplicationsBuilder_ == null) {
        ensureAllowedApplicationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedApplications_);
        onChanged();
      } else {
        allowedApplicationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder clearAllowedApplications() {
      if (allowedApplicationsBuilder_ == null) {
        allowedApplications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        allowedApplicationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public Builder removeAllowedApplications(int index) {
      if (allowedApplicationsBuilder_ == null) {
        ensureAllowedApplicationsIsMutable();
        allowedApplications_.remove(index);
        onChanged();
      } else {
        allowedApplicationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public com.google.api.apikeys.v2.AndroidApplication.Builder getAllowedApplicationsBuilder(
        int index) {
      return getAllowedApplicationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public com.google.api.apikeys.v2.AndroidApplicationOrBuilder getAllowedApplicationsOrBuilder(
        int index) {
      if (allowedApplicationsBuilder_ == null) {
        return allowedApplications_.get(index);
      } else {
        return allowedApplicationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public java.util.List<? extends com.google.api.apikeys.v2.AndroidApplicationOrBuilder>
        getAllowedApplicationsOrBuilderList() {
      if (allowedApplicationsBuilder_ != null) {
        return allowedApplicationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allowedApplications_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public com.google.api.apikeys.v2.AndroidApplication.Builder addAllowedApplicationsBuilder() {
      return getAllowedApplicationsFieldBuilder()
          .addBuilder(com.google.api.apikeys.v2.AndroidApplication.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public com.google.api.apikeys.v2.AndroidApplication.Builder addAllowedApplicationsBuilder(
        int index) {
      return getAllowedApplicationsFieldBuilder()
          .addBuilder(index, com.google.api.apikeys.v2.AndroidApplication.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of Android applications that are allowed to make API calls with
     * this key.
     * </pre>
     *
     * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
     */
    public java.util.List<com.google.api.apikeys.v2.AndroidApplication.Builder>
        getAllowedApplicationsBuilderList() {
      return getAllowedApplicationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.apikeys.v2.AndroidApplication,
            com.google.api.apikeys.v2.AndroidApplication.Builder,
            com.google.api.apikeys.v2.AndroidApplicationOrBuilder>
        getAllowedApplicationsFieldBuilder() {
      if (allowedApplicationsBuilder_ == null) {
        allowedApplicationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.apikeys.v2.AndroidApplication,
                com.google.api.apikeys.v2.AndroidApplication.Builder,
                com.google.api.apikeys.v2.AndroidApplicationOrBuilder>(
                allowedApplications_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        allowedApplications_ = null;
      }
      return allowedApplicationsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.apikeys.v2.AndroidKeyRestrictions)
  }

  // @@protoc_insertion_point(class_scope:google.api.apikeys.v2.AndroidKeyRestrictions)
  private static final com.google.api.apikeys.v2.AndroidKeyRestrictions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.apikeys.v2.AndroidKeyRestrictions();
  }

  public static com.google.api.apikeys.v2.AndroidKeyRestrictions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AndroidKeyRestrictions> PARSER =
      new com.google.protobuf.AbstractParser<AndroidKeyRestrictions>() {
        @java.lang.Override
        public AndroidKeyRestrictions parsePartialFrom(
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

  public static com.google.protobuf.Parser<AndroidKeyRestrictions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidKeyRestrictions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.apikeys.v2.AndroidKeyRestrictions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
