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
// source: google/cloud/dataplex/v1/datascans.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Update dataScan request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.UpdateDataScanRequest}
 */
public final class UpdateDataScanRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.UpdateDataScanRequest)
    UpdateDataScanRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDataScanRequest.newBuilder() to construct.
  private UpdateDataScanRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDataScanRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDataScanRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.DataScansProto
        .internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataScansProto
        .internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.UpdateDataScanRequest.class,
            com.google.cloud.dataplex.v1.UpdateDataScanRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_SCAN_FIELD_NUMBER = 1;
  private com.google.cloud.dataplex.v1.DataScan dataScan_;
  /**
   *
   *
   * <pre>
   * Required. DataScan resource to be updated.
   *
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataScan field is set.
   */
  @java.lang.Override
  public boolean hasDataScan() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. DataScan resource to be updated.
   *
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataScan.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataScan getDataScan() {
    return dataScan_ == null
        ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance()
        : dataScan_;
  }
  /**
   *
   *
   * <pre>
   * Required. DataScan resource to be updated.
   *
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataScanOrBuilder getDataScanOrBuilder() {
    return dataScan_ == null
        ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance()
        : dataScan_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Optional. Only validate the request, but do not perform mutations.
   * The default is `false`.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
      output.writeMessage(1, getDataScan());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDataScan());
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.UpdateDataScanRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.UpdateDataScanRequest other =
        (com.google.cloud.dataplex.v1.UpdateDataScanRequest) obj;

    if (hasDataScan() != other.hasDataScan()) return false;
    if (hasDataScan()) {
      if (!getDataScan().equals(other.getDataScan())) return false;
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
    if (hasDataScan()) {
      hash = (37 * hash) + DATA_SCAN_FIELD_NUMBER;
      hash = (53 * hash) + getDataScan().hashCode();
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

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.UpdateDataScanRequest prototype) {
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
   * Update dataScan request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.UpdateDataScanRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.UpdateDataScanRequest)
      com.google.cloud.dataplex.v1.UpdateDataScanRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.DataScansProto
          .internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataScansProto
          .internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.UpdateDataScanRequest.class,
              com.google.cloud.dataplex.v1.UpdateDataScanRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.UpdateDataScanRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataScanFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataScan_ = null;
      if (dataScanBuilder_ != null) {
        dataScanBuilder_.dispose();
        dataScanBuilder_ = null;
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
      return com.google.cloud.dataplex.v1.DataScansProto
          .internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateDataScanRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.UpdateDataScanRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateDataScanRequest build() {
      com.google.cloud.dataplex.v1.UpdateDataScanRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateDataScanRequest buildPartial() {
      com.google.cloud.dataplex.v1.UpdateDataScanRequest result =
          new com.google.cloud.dataplex.v1.UpdateDataScanRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.UpdateDataScanRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataScan_ = dataScanBuilder_ == null ? dataScan_ : dataScanBuilder_.build();
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
      if (other instanceof com.google.cloud.dataplex.v1.UpdateDataScanRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.UpdateDataScanRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.UpdateDataScanRequest other) {
      if (other == com.google.cloud.dataplex.v1.UpdateDataScanRequest.getDefaultInstance())
        return this;
      if (other.hasDataScan()) {
        mergeDataScan(other.getDataScan());
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
                input.readMessage(getDataScanFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.dataplex.v1.DataScan dataScan_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataScan,
            com.google.cloud.dataplex.v1.DataScan.Builder,
            com.google.cloud.dataplex.v1.DataScanOrBuilder>
        dataScanBuilder_;
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataScan field is set.
     */
    public boolean hasDataScan() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataScan.
     */
    public com.google.cloud.dataplex.v1.DataScan getDataScan() {
      if (dataScanBuilder_ == null) {
        return dataScan_ == null
            ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance()
            : dataScan_;
      } else {
        return dataScanBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataScan(com.google.cloud.dataplex.v1.DataScan value) {
      if (dataScanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataScan_ = value;
      } else {
        dataScanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataScan(com.google.cloud.dataplex.v1.DataScan.Builder builderForValue) {
      if (dataScanBuilder_ == null) {
        dataScan_ = builderForValue.build();
      } else {
        dataScanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataScan(com.google.cloud.dataplex.v1.DataScan value) {
      if (dataScanBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dataScan_ != null
            && dataScan_ != com.google.cloud.dataplex.v1.DataScan.getDefaultInstance()) {
          getDataScanBuilder().mergeFrom(value);
        } else {
          dataScan_ = value;
        }
      } else {
        dataScanBuilder_.mergeFrom(value);
      }
      if (dataScan_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataScan() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataScan_ = null;
      if (dataScanBuilder_ != null) {
        dataScanBuilder_.dispose();
        dataScanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.DataScan.Builder getDataScanBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataScanFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.DataScanOrBuilder getDataScanOrBuilder() {
      if (dataScanBuilder_ != null) {
        return dataScanBuilder_.getMessageOrBuilder();
      } else {
        return dataScan_ == null
            ? com.google.cloud.dataplex.v1.DataScan.getDefaultInstance()
            : dataScan_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. DataScan resource to be updated.
     *
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.DataScan data_scan = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataScan,
            com.google.cloud.dataplex.v1.DataScan.Builder,
            com.google.cloud.dataplex.v1.DataScanOrBuilder>
        getDataScanFieldBuilder() {
      if (dataScanBuilder_ == null) {
        dataScanBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.DataScan,
                com.google.cloud.dataplex.v1.DataScan.Builder,
                com.google.cloud.dataplex.v1.DataScanOrBuilder>(
                getDataScan(), getParentForChildren(), isClean());
        dataScan_ = null;
      }
      return dataScanBuilder_;
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Optional. Only validate the request, but do not perform mutations.
     * The default is `false`.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Only validate the request, but do not perform mutations.
     * The default is `false`.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Only validate the request, but do not perform mutations.
     * The default is `false`.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.UpdateDataScanRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.UpdateDataScanRequest)
  private static final com.google.cloud.dataplex.v1.UpdateDataScanRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.UpdateDataScanRequest();
  }

  public static com.google.cloud.dataplex.v1.UpdateDataScanRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDataScanRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDataScanRequest>() {
        @java.lang.Override
        public UpdateDataScanRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDataScanRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDataScanRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.UpdateDataScanRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
