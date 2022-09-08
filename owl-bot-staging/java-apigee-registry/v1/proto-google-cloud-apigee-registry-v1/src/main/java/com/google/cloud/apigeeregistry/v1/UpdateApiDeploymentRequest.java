// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 * <pre>
 * Request message for UpdateApiDeployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest}
 */
public final class UpdateApiDeploymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)
    UpdateApiDeploymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateApiDeploymentRequest.newBuilder() to construct.
  private UpdateApiDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateApiDeploymentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateApiDeploymentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateApiDeploymentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder subBuilder = null;
            if (apiDeployment_ != null) {
              subBuilder = apiDeployment_.toBuilder();
            }
            apiDeployment_ = input.readMessage(com.google.cloud.apigeeregistry.v1.ApiDeployment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(apiDeployment_);
              apiDeployment_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            allowMissing_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.class, com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.Builder.class);
  }

  public static final int API_DEPLOYMENT_FIELD_NUMBER = 1;
  private com.google.cloud.apigeeregistry.v1.ApiDeployment apiDeployment_;
  /**
   * <pre>
   * Required. The deployment to update.
   * The `name` field is used to identify the deployment to update.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the apiDeployment field is set.
   */
  @java.lang.Override
  public boolean hasApiDeployment() {
    return apiDeployment_ != null;
  }
  /**
   * <pre>
   * Required. The deployment to update.
   * The `name` field is used to identify the deployment to update.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The apiDeployment.
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployment() {
    return apiDeployment_ == null ? com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance() : apiDeployment_;
  }
  /**
   * <pre>
   * Required. The deployment to update.
   * The `name` field is used to identify the deployment to update.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentOrBuilder() {
    return getApiDeployment();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If an asterisk "*" is specified, all fields are updated, including fields
   * that are unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If an asterisk "*" is specified, all fields are updated, including fields
   * that are unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If an asterisk "*" is specified, all fields are updated, including fields
   * that are unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_;
  /**
   * <pre>
   * If set to true, and the deployment is not found, a new deployment will be
   * created. In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (apiDeployment_ != null) {
      output.writeMessage(1, getApiDeployment());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (apiDeployment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getApiDeployment());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowMissing_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest other = (com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest) obj;

    if (hasApiDeployment() != other.hasApiDeployment()) return false;
    if (hasApiDeployment()) {
      if (!getApiDeployment()
          .equals(other.getApiDeployment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getAllowMissing()
        != other.getAllowMissing()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasApiDeployment()) {
      hash = (37 * hash) + API_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getApiDeployment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMissing());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for UpdateApiDeployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)
      com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.class, com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (apiDeploymentBuilder_ == null) {
        apiDeployment_ = null;
      } else {
        apiDeployment_ = null;
        apiDeploymentBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      allowMissing_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest build() {
      com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest buildPartial() {
      com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest result = new com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest(this);
      if (apiDeploymentBuilder_ == null) {
        result.apiDeployment_ = apiDeployment_;
      } else {
        result.apiDeployment_ = apiDeploymentBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.allowMissing_ = allowMissing_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest other) {
      if (other == com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest.getDefaultInstance()) return this;
      if (other.hasApiDeployment()) {
        mergeApiDeployment(other.getApiDeployment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.apigeeregistry.v1.ApiDeployment apiDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeregistry.v1.ApiDeployment, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder, com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder> apiDeploymentBuilder_;
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the apiDeployment field is set.
     */
    public boolean hasApiDeployment() {
      return apiDeploymentBuilder_ != null || apiDeployment_ != null;
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The apiDeployment.
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployment() {
      if (apiDeploymentBuilder_ == null) {
        return apiDeployment_ == null ? com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance() : apiDeployment_;
      } else {
        return apiDeploymentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApiDeployment(com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiDeployment_ = value;
        onChanged();
      } else {
        apiDeploymentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApiDeployment(
        com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder builderForValue) {
      if (apiDeploymentBuilder_ == null) {
        apiDeployment_ = builderForValue.build();
        onChanged();
      } else {
        apiDeploymentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeApiDeployment(com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentBuilder_ == null) {
        if (apiDeployment_ != null) {
          apiDeployment_ =
            com.google.cloud.apigeeregistry.v1.ApiDeployment.newBuilder(apiDeployment_).mergeFrom(value).buildPartial();
        } else {
          apiDeployment_ = value;
        }
        onChanged();
      } else {
        apiDeploymentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearApiDeployment() {
      if (apiDeploymentBuilder_ == null) {
        apiDeployment_ = null;
        onChanged();
      } else {
        apiDeployment_ = null;
        apiDeploymentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder getApiDeploymentBuilder() {
      
      onChanged();
      return getApiDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentOrBuilder() {
      if (apiDeploymentBuilder_ != null) {
        return apiDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return apiDeployment_ == null ?
            com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance() : apiDeployment_;
      }
    }
    /**
     * <pre>
     * Required. The deployment to update.
     * The `name` field is used to identify the deployment to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeregistry.v1.ApiDeployment, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder, com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder> 
        getApiDeploymentFieldBuilder() {
      if (apiDeploymentBuilder_ == null) {
        apiDeploymentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiDeployment, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder, com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>(
                getApiDeployment(),
                getParentForChildren(),
                isClean());
        apiDeployment_ = null;
      }
      return apiDeploymentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
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
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean allowMissing_ ;
    /**
     * <pre>
     * If set to true, and the deployment is not found, a new deployment will be
     * created. In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     * <pre>
     * If set to true, and the deployment is not found, a new deployment will be
     * created. In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {
      
      allowMissing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, and the deployment is not found, a new deployment will be
     * created. In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      
      allowMissing_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)
  private static final com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest();
  }

  public static com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateApiDeploymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateApiDeploymentRequest>() {
    @java.lang.Override
    public UpdateApiDeploymentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateApiDeploymentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateApiDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateApiDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
