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
// source: google/cloud/recommender/v1/recommender_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.recommender.v1;

/**
 *
 *
 * <pre>
 * Request for the `UpdateRecommenderConfig` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1.UpdateRecommenderConfigRequest}
 */
public final class UpdateRecommenderConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1.UpdateRecommenderConfigRequest)
    UpdateRecommenderConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateRecommenderConfigRequest.newBuilder() to construct.
  private UpdateRecommenderConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateRecommenderConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateRecommenderConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1.RecommenderProto
        .internal_static_google_cloud_recommender_v1_UpdateRecommenderConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1.RecommenderProto
        .internal_static_google_cloud_recommender_v1_UpdateRecommenderConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.class,
            com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RECOMMENDER_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.recommender.v1.RecommenderConfig recommenderConfig_;
  /**
   *
   *
   * <pre>
   * Required. The RecommenderConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the recommenderConfig field is set.
   */
  @java.lang.Override
  public boolean hasRecommenderConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The RecommenderConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The recommenderConfig.
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1.RecommenderConfig getRecommenderConfig() {
    return recommenderConfig_ == null
        ? com.google.cloud.recommender.v1.RecommenderConfig.getDefaultInstance()
        : recommenderConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The RecommenderConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1.RecommenderConfigOrBuilder
      getRecommenderConfigOrBuilder() {
    return recommenderConfig_ == null
        ? com.google.cloud.recommender.v1.RecommenderConfig.getDefaultInstance()
        : recommenderConfig_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * If true, validate the request and preview the change, but do not actually
   * update it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
      output.writeMessage(1, getRecommenderConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRecommenderConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest other =
        (com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest) obj;

    if (hasRecommenderConfig() != other.hasRecommenderConfig()) return false;
    if (hasRecommenderConfig()) {
      if (!getRecommenderConfig().equals(other.getRecommenderConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasRecommenderConfig()) {
      hash = (37 * hash) + RECOMMENDER_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getRecommenderConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest parseFrom(
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
      com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest prototype) {
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
   * Request for the `UpdateRecommenderConfig` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1.UpdateRecommenderConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1.UpdateRecommenderConfigRequest)
      com.google.cloud.recommender.v1.UpdateRecommenderConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1.RecommenderProto
          .internal_static_google_cloud_recommender_v1_UpdateRecommenderConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1.RecommenderProto
          .internal_static_google_cloud_recommender_v1_UpdateRecommenderConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.class,
              com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRecommenderConfigFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      recommenderConfig_ = null;
      if (recommenderConfigBuilder_ != null) {
        recommenderConfigBuilder_.dispose();
        recommenderConfigBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1.RecommenderProto
          .internal_static_google_cloud_recommender_v1_UpdateRecommenderConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest build() {
      com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest buildPartial() {
      com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest result =
          new com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recommenderConfig_ =
            recommenderConfigBuilder_ == null
                ? recommenderConfig_
                : recommenderConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest) {
        return mergeFrom((com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest other) {
      if (other
          == com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest.getDefaultInstance())
        return this;
      if (other.hasRecommenderConfig()) {
        mergeRecommenderConfig(other.getRecommenderConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                input.readMessage(
                    getRecommenderConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private com.google.cloud.recommender.v1.RecommenderConfig recommenderConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommender.v1.RecommenderConfig,
            com.google.cloud.recommender.v1.RecommenderConfig.Builder,
            com.google.cloud.recommender.v1.RecommenderConfigOrBuilder>
        recommenderConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the recommenderConfig field is set.
     */
    public boolean hasRecommenderConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The recommenderConfig.
     */
    public com.google.cloud.recommender.v1.RecommenderConfig getRecommenderConfig() {
      if (recommenderConfigBuilder_ == null) {
        return recommenderConfig_ == null
            ? com.google.cloud.recommender.v1.RecommenderConfig.getDefaultInstance()
            : recommenderConfig_;
      } else {
        return recommenderConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRecommenderConfig(com.google.cloud.recommender.v1.RecommenderConfig value) {
      if (recommenderConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recommenderConfig_ = value;
      } else {
        recommenderConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRecommenderConfig(
        com.google.cloud.recommender.v1.RecommenderConfig.Builder builderForValue) {
      if (recommenderConfigBuilder_ == null) {
        recommenderConfig_ = builderForValue.build();
      } else {
        recommenderConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRecommenderConfig(com.google.cloud.recommender.v1.RecommenderConfig value) {
      if (recommenderConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && recommenderConfig_ != null
            && recommenderConfig_
                != com.google.cloud.recommender.v1.RecommenderConfig.getDefaultInstance()) {
          getRecommenderConfigBuilder().mergeFrom(value);
        } else {
          recommenderConfig_ = value;
        }
      } else {
        recommenderConfigBuilder_.mergeFrom(value);
      }
      if (recommenderConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRecommenderConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recommenderConfig_ = null;
      if (recommenderConfigBuilder_ != null) {
        recommenderConfigBuilder_.dispose();
        recommenderConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.recommender.v1.RecommenderConfig.Builder getRecommenderConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecommenderConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.recommender.v1.RecommenderConfigOrBuilder
        getRecommenderConfigOrBuilder() {
      if (recommenderConfigBuilder_ != null) {
        return recommenderConfigBuilder_.getMessageOrBuilder();
      } else {
        return recommenderConfig_ == null
            ? com.google.cloud.recommender.v1.RecommenderConfig.getDefaultInstance()
            : recommenderConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The RecommenderConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.recommender.v1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.recommender.v1.RecommenderConfig,
            com.google.cloud.recommender.v1.RecommenderConfig.Builder,
            com.google.cloud.recommender.v1.RecommenderConfigOrBuilder>
        getRecommenderConfigFieldBuilder() {
      if (recommenderConfigBuilder_ == null) {
        recommenderConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.recommender.v1.RecommenderConfig,
                com.google.cloud.recommender.v1.RecommenderConfig.Builder,
                com.google.cloud.recommender.v1.RecommenderConfigOrBuilder>(
                getRecommenderConfig(), getParentForChildren(), isClean());
        recommenderConfig_ = null;
      }
      return recommenderConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If true, validate the request and preview the change, but do not actually
     * update it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * If true, validate the request and preview the change, but do not actually
     * update it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, validate the request and preview the change, but do not actually
     * update it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1.UpdateRecommenderConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.UpdateRecommenderConfigRequest)
  private static final com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest();
  }

  public static com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRecommenderConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateRecommenderConfigRequest>() {
        @java.lang.Override
        public UpdateRecommenderConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRecommenderConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRecommenderConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
