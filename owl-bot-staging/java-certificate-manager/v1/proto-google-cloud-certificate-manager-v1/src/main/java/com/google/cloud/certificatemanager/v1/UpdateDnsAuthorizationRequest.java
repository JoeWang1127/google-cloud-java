// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

/**
 * <pre>
 * Request for the `UpdateDnsAuthorization` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest}
 */
public final class UpdateDnsAuthorizationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)
    UpdateDnsAuthorizationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDnsAuthorizationRequest.newBuilder() to construct.
  private UpdateDnsAuthorizationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDnsAuthorizationRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDnsAuthorizationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateDnsAuthorizationRequest(
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
            com.google.cloud.certificatemanager.v1.DnsAuthorization.Builder subBuilder = null;
            if (dnsAuthorization_ != null) {
              subBuilder = dnsAuthorization_.toBuilder();
            }
            dnsAuthorization_ = input.readMessage(com.google.cloud.certificatemanager.v1.DnsAuthorization.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dnsAuthorization_);
              dnsAuthorization_ = subBuilder.buildPartial();
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
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto.internal_static_google_cloud_certificatemanager_v1_UpdateDnsAuthorizationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto.internal_static_google_cloud_certificatemanager_v1_UpdateDnsAuthorizationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.class, com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.Builder.class);
  }

  public static final int DNS_AUTHORIZATION_FIELD_NUMBER = 1;
  private com.google.cloud.certificatemanager.v1.DnsAuthorization dnsAuthorization_;
  /**
   * <pre>
   * Required. A definition of the dns authorization to update.
   * </pre>
   *
   * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dnsAuthorization field is set.
   */
  @java.lang.Override
  public boolean hasDnsAuthorization() {
    return dnsAuthorization_ != null;
  }
  /**
   * <pre>
   * Required. A definition of the dns authorization to update.
   * </pre>
   *
   * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dnsAuthorization.
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.DnsAuthorization getDnsAuthorization() {
    return dnsAuthorization_ == null ? com.google.cloud.certificatemanager.v1.DnsAuthorization.getDefaultInstance() : dnsAuthorization_;
  }
  /**
   * <pre>
   * Required. A definition of the dns authorization to update.
   * </pre>
   *
   * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.DnsAuthorizationOrBuilder getDnsAuthorizationOrBuilder() {
    return getDnsAuthorization();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (dnsAuthorization_ != null) {
      output.writeMessage(1, getDnsAuthorization());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dnsAuthorization_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDnsAuthorization());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest other = (com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest) obj;

    if (hasDnsAuthorization() != other.hasDnsAuthorization()) return false;
    if (hasDnsAuthorization()) {
      if (!getDnsAuthorization()
          .equals(other.getDnsAuthorization())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
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
    if (hasDnsAuthorization()) {
      hash = (37 * hash) + DNS_AUTHORIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getDnsAuthorization().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest prototype) {
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
   * Request for the `UpdateDnsAuthorization` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)
      com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto.internal_static_google_cloud_certificatemanager_v1_UpdateDnsAuthorizationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto.internal_static_google_cloud_certificatemanager_v1_UpdateDnsAuthorizationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.class, com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.Builder.class);
    }

    // Construct using com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.newBuilder()
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
      if (dnsAuthorizationBuilder_ == null) {
        dnsAuthorization_ = null;
      } else {
        dnsAuthorization_ = null;
        dnsAuthorizationBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto.internal_static_google_cloud_certificatemanager_v1_UpdateDnsAuthorizationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest getDefaultInstanceForType() {
      return com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest build() {
      com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest buildPartial() {
      com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest result = new com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest(this);
      if (dnsAuthorizationBuilder_ == null) {
        result.dnsAuthorization_ = dnsAuthorization_;
      } else {
        result.dnsAuthorization_ = dnsAuthorizationBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest) {
        return mergeFrom((com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest other) {
      if (other == com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest.getDefaultInstance()) return this;
      if (other.hasDnsAuthorization()) {
        mergeDnsAuthorization(other.getDnsAuthorization());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.certificatemanager.v1.DnsAuthorization dnsAuthorization_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.certificatemanager.v1.DnsAuthorization, com.google.cloud.certificatemanager.v1.DnsAuthorization.Builder, com.google.cloud.certificatemanager.v1.DnsAuthorizationOrBuilder> dnsAuthorizationBuilder_;
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the dnsAuthorization field is set.
     */
    public boolean hasDnsAuthorization() {
      return dnsAuthorizationBuilder_ != null || dnsAuthorization_ != null;
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dnsAuthorization.
     */
    public com.google.cloud.certificatemanager.v1.DnsAuthorization getDnsAuthorization() {
      if (dnsAuthorizationBuilder_ == null) {
        return dnsAuthorization_ == null ? com.google.cloud.certificatemanager.v1.DnsAuthorization.getDefaultInstance() : dnsAuthorization_;
      } else {
        return dnsAuthorizationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDnsAuthorization(com.google.cloud.certificatemanager.v1.DnsAuthorization value) {
      if (dnsAuthorizationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dnsAuthorization_ = value;
        onChanged();
      } else {
        dnsAuthorizationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDnsAuthorization(
        com.google.cloud.certificatemanager.v1.DnsAuthorization.Builder builderForValue) {
      if (dnsAuthorizationBuilder_ == null) {
        dnsAuthorization_ = builderForValue.build();
        onChanged();
      } else {
        dnsAuthorizationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDnsAuthorization(com.google.cloud.certificatemanager.v1.DnsAuthorization value) {
      if (dnsAuthorizationBuilder_ == null) {
        if (dnsAuthorization_ != null) {
          dnsAuthorization_ =
            com.google.cloud.certificatemanager.v1.DnsAuthorization.newBuilder(dnsAuthorization_).mergeFrom(value).buildPartial();
        } else {
          dnsAuthorization_ = value;
        }
        onChanged();
      } else {
        dnsAuthorizationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDnsAuthorization() {
      if (dnsAuthorizationBuilder_ == null) {
        dnsAuthorization_ = null;
        onChanged();
      } else {
        dnsAuthorization_ = null;
        dnsAuthorizationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.certificatemanager.v1.DnsAuthorization.Builder getDnsAuthorizationBuilder() {
      
      onChanged();
      return getDnsAuthorizationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.certificatemanager.v1.DnsAuthorizationOrBuilder getDnsAuthorizationOrBuilder() {
      if (dnsAuthorizationBuilder_ != null) {
        return dnsAuthorizationBuilder_.getMessageOrBuilder();
      } else {
        return dnsAuthorization_ == null ?
            com.google.cloud.certificatemanager.v1.DnsAuthorization.getDefaultInstance() : dnsAuthorization_;
      }
    }
    /**
     * <pre>
     * Required. A definition of the dns authorization to update.
     * </pre>
     *
     * <code>.google.cloud.certificatemanager.v1.DnsAuthorization dns_authorization = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.certificatemanager.v1.DnsAuthorization, com.google.cloud.certificatemanager.v1.DnsAuthorization.Builder, com.google.cloud.certificatemanager.v1.DnsAuthorizationOrBuilder> 
        getDnsAuthorizationFieldBuilder() {
      if (dnsAuthorizationBuilder_ == null) {
        dnsAuthorizationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.DnsAuthorization, com.google.cloud.certificatemanager.v1.DnsAuthorization.Builder, com.google.cloud.certificatemanager.v1.DnsAuthorizationOrBuilder>(
                getDnsAuthorization(),
                getParentForChildren(),
                isClean());
        dnsAuthorization_ = null;
      }
      return dnsAuthorizationBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest)
  private static final com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest();
  }

  public static com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDnsAuthorizationRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDnsAuthorizationRequest>() {
    @java.lang.Override
    public UpdateDnsAuthorizationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateDnsAuthorizationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateDnsAuthorizationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDnsAuthorizationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.UpdateDnsAuthorizationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
