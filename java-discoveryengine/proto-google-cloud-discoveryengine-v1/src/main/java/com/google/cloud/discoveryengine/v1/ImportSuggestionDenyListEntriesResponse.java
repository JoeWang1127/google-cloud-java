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
// source: google/cloud/discoveryengine/v1/import_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [CompletionService.ImportSuggestionDenyListEntries][google.cloud.discoveryengine.v1.CompletionService.ImportSuggestionDenyListEntries]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse}
 */
public final class ImportSuggestionDenyListEntriesResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse)
    ImportSuggestionDenyListEntriesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportSuggestionDenyListEntriesResponse.newBuilder() to construct.
  private ImportSuggestionDenyListEntriesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportSuggestionDenyListEntriesResponse() {
    errorSamples_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportSuggestionDenyListEntriesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.ImportConfigProto
        .internal_static_google_cloud_discoveryengine_v1_ImportSuggestionDenyListEntriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.ImportConfigProto
        .internal_static_google_cloud_discoveryengine_v1_ImportSuggestionDenyListEntriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse.class,
            com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse.Builder
                .class);
  }

  public static final int ERROR_SAMPLES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.rpc.Status> errorSamples_;
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getErrorSamplesList() {
    return errorSamples_;
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList() {
    return errorSamples_;
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public int getErrorSamplesCount() {
    return errorSamples_.size();
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getErrorSamples(int index) {
    return errorSamples_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index) {
    return errorSamples_.get(index);
  }

  public static final int IMPORTED_ENTRIES_COUNT_FIELD_NUMBER = 2;
  private long importedEntriesCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Count of deny list entries successfully imported.
   * </pre>
   *
   * <code>int64 imported_entries_count = 2;</code>
   *
   * @return The importedEntriesCount.
   */
  @java.lang.Override
  public long getImportedEntriesCount() {
    return importedEntriesCount_;
  }

  public static final int FAILED_ENTRIES_COUNT_FIELD_NUMBER = 3;
  private long failedEntriesCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Count of deny list entries that failed to be imported.
   * </pre>
   *
   * <code>int64 failed_entries_count = 3;</code>
   *
   * @return The failedEntriesCount.
   */
  @java.lang.Override
  public long getFailedEntriesCount() {
    return failedEntriesCount_;
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
    for (int i = 0; i < errorSamples_.size(); i++) {
      output.writeMessage(1, errorSamples_.get(i));
    }
    if (importedEntriesCount_ != 0L) {
      output.writeInt64(2, importedEntriesCount_);
    }
    if (failedEntriesCount_ != 0L) {
      output.writeInt64(3, failedEntriesCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < errorSamples_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, errorSamples_.get(i));
    }
    if (importedEntriesCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, importedEntriesCount_);
    }
    if (failedEntriesCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, failedEntriesCount_);
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
    if (!(obj
        instanceof com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse other =
        (com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse) obj;

    if (!getErrorSamplesList().equals(other.getErrorSamplesList())) return false;
    if (getImportedEntriesCount() != other.getImportedEntriesCount()) return false;
    if (getFailedEntriesCount() != other.getFailedEntriesCount()) return false;
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
    if (getErrorSamplesCount() > 0) {
      hash = (37 * hash) + ERROR_SAMPLES_FIELD_NUMBER;
      hash = (53 * hash) + getErrorSamplesList().hashCode();
    }
    hash = (37 * hash) + IMPORTED_ENTRIES_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getImportedEntriesCount());
    hash = (37 * hash) + FAILED_ENTRIES_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getFailedEntriesCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      parseFrom(
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
      com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse prototype) {
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
   * Response message for
   * [CompletionService.ImportSuggestionDenyListEntries][google.cloud.discoveryengine.v1.CompletionService.ImportSuggestionDenyListEntries]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse)
      com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1_ImportSuggestionDenyListEntriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1_ImportSuggestionDenyListEntriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse.class,
              com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (errorSamplesBuilder_ == null) {
        errorSamples_ = java.util.Collections.emptyList();
      } else {
        errorSamples_ = null;
        errorSamplesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      importedEntriesCount_ = 0L;
      failedEntriesCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1_ImportSuggestionDenyListEntriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse build() {
      com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
        buildPartial() {
      com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse result =
          new com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse result) {
      if (errorSamplesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errorSamples_ = java.util.Collections.unmodifiableList(errorSamples_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errorSamples_ = errorSamples_;
      } else {
        result.errorSamples_ = errorSamplesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.importedEntriesCount_ = importedEntriesCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failedEntriesCount_ = failedEntriesCount_;
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
      if (other
          instanceof com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse) {
        return mergeFrom(
            (com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse other) {
      if (other
          == com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
              .getDefaultInstance()) return this;
      if (errorSamplesBuilder_ == null) {
        if (!other.errorSamples_.isEmpty()) {
          if (errorSamples_.isEmpty()) {
            errorSamples_ = other.errorSamples_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorSamplesIsMutable();
            errorSamples_.addAll(other.errorSamples_);
          }
          onChanged();
        }
      } else {
        if (!other.errorSamples_.isEmpty()) {
          if (errorSamplesBuilder_.isEmpty()) {
            errorSamplesBuilder_.dispose();
            errorSamplesBuilder_ = null;
            errorSamples_ = other.errorSamples_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorSamplesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getErrorSamplesFieldBuilder()
                    : null;
          } else {
            errorSamplesBuilder_.addAllMessages(other.errorSamples_);
          }
        }
      }
      if (other.getImportedEntriesCount() != 0L) {
        setImportedEntriesCount(other.getImportedEntriesCount());
      }
      if (other.getFailedEntriesCount() != 0L) {
        setFailedEntriesCount(other.getFailedEntriesCount());
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
                com.google.rpc.Status m =
                    input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
                if (errorSamplesBuilder_ == null) {
                  ensureErrorSamplesIsMutable();
                  errorSamples_.add(m);
                } else {
                  errorSamplesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 16:
              {
                importedEntriesCount_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                failedEntriesCount_ = input.readInt64();
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

    private java.util.List<com.google.rpc.Status> errorSamples_ = java.util.Collections.emptyList();

    private void ensureErrorSamplesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errorSamples_ = new java.util.ArrayList<com.google.rpc.Status>(errorSamples_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorSamplesBuilder_;

    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public java.util.List<com.google.rpc.Status> getErrorSamplesList() {
      if (errorSamplesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errorSamples_);
      } else {
        return errorSamplesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public int getErrorSamplesCount() {
      if (errorSamplesBuilder_ == null) {
        return errorSamples_.size();
      } else {
        return errorSamplesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status getErrorSamples(int index) {
      if (errorSamplesBuilder_ == null) {
        return errorSamples_.get(index);
      } else {
        return errorSamplesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder setErrorSamples(int index, com.google.rpc.Status value) {
      if (errorSamplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorSamplesIsMutable();
        errorSamples_.set(index, value);
        onChanged();
      } else {
        errorSamplesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder setErrorSamples(int index, com.google.rpc.Status.Builder builderForValue) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorSamplesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(com.google.rpc.Status value) {
      if (errorSamplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorSamplesIsMutable();
        errorSamples_.add(value);
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(int index, com.google.rpc.Status value) {
      if (errorSamplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorSamplesIsMutable();
        errorSamples_.add(index, value);
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(com.google.rpc.Status.Builder builderForValue) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.add(builderForValue.build());
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addErrorSamples(int index, com.google.rpc.Status.Builder builderForValue) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorSamplesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder addAllErrorSamples(java.lang.Iterable<? extends com.google.rpc.Status> values) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, errorSamples_);
        onChanged();
      } else {
        errorSamplesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder clearErrorSamples() {
      if (errorSamplesBuilder_ == null) {
        errorSamples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorSamplesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public Builder removeErrorSamples(int index) {
      if (errorSamplesBuilder_ == null) {
        ensureErrorSamplesIsMutable();
        errorSamples_.remove(index);
        onChanged();
      } else {
        errorSamplesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status.Builder getErrorSamplesBuilder(int index) {
      return getErrorSamplesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index) {
      if (errorSamplesBuilder_ == null) {
        return errorSamples_.get(index);
      } else {
        return errorSamplesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList() {
      if (errorSamplesBuilder_ != null) {
        return errorSamplesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errorSamples_);
      }
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status.Builder addErrorSamplesBuilder() {
      return getErrorSamplesFieldBuilder().addBuilder(com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public com.google.rpc.Status.Builder addErrorSamplesBuilder(int index) {
      return getErrorSamplesFieldBuilder()
          .addBuilder(index, com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A sample of errors encountered while processing the request.
     * </pre>
     *
     * <code>repeated .google.rpc.Status error_samples = 1;</code>
     */
    public java.util.List<com.google.rpc.Status.Builder> getErrorSamplesBuilderList() {
      return getErrorSamplesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorSamplesFieldBuilder() {
      if (errorSamplesBuilder_ == null) {
        errorSamplesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                errorSamples_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        errorSamples_ = null;
      }
      return errorSamplesBuilder_;
    }

    private long importedEntriesCount_;
    /**
     *
     *
     * <pre>
     * Count of deny list entries successfully imported.
     * </pre>
     *
     * <code>int64 imported_entries_count = 2;</code>
     *
     * @return The importedEntriesCount.
     */
    @java.lang.Override
    public long getImportedEntriesCount() {
      return importedEntriesCount_;
    }
    /**
     *
     *
     * <pre>
     * Count of deny list entries successfully imported.
     * </pre>
     *
     * <code>int64 imported_entries_count = 2;</code>
     *
     * @param value The importedEntriesCount to set.
     * @return This builder for chaining.
     */
    public Builder setImportedEntriesCount(long value) {

      importedEntriesCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Count of deny list entries successfully imported.
     * </pre>
     *
     * <code>int64 imported_entries_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportedEntriesCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      importedEntriesCount_ = 0L;
      onChanged();
      return this;
    }

    private long failedEntriesCount_;
    /**
     *
     *
     * <pre>
     * Count of deny list entries that failed to be imported.
     * </pre>
     *
     * <code>int64 failed_entries_count = 3;</code>
     *
     * @return The failedEntriesCount.
     */
    @java.lang.Override
    public long getFailedEntriesCount() {
      return failedEntriesCount_;
    }
    /**
     *
     *
     * <pre>
     * Count of deny list entries that failed to be imported.
     * </pre>
     *
     * <code>int64 failed_entries_count = 3;</code>
     *
     * @param value The failedEntriesCount to set.
     * @return This builder for chaining.
     */
    public Builder setFailedEntriesCount(long value) {

      failedEntriesCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Count of deny list entries that failed to be imported.
     * </pre>
     *
     * <code>int64 failed_entries_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailedEntriesCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failedEntriesCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse)
  private static final com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse();
  }

  public static com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportSuggestionDenyListEntriesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ImportSuggestionDenyListEntriesResponse>() {
        @java.lang.Override
        public ImportSuggestionDenyListEntriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportSuggestionDenyListEntriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportSuggestionDenyListEntriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
