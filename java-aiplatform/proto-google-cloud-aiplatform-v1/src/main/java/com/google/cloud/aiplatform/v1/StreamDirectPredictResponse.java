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
// source: google/cloud/aiplatform/v1/prediction_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [PredictionService.StreamDirectPredict][google.cloud.aiplatform.v1.PredictionService.StreamDirectPredict].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.StreamDirectPredictResponse}
 */
public final class StreamDirectPredictResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.StreamDirectPredictResponse)
    StreamDirectPredictResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamDirectPredictResponse.newBuilder() to construct.
  private StreamDirectPredictResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamDirectPredictResponse() {
    outputs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamDirectPredictResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1_StreamDirectPredictResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1_StreamDirectPredictResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.class,
            com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.Builder.class);
  }

  private int bitField0_;
  public static final int OUTPUTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.Tensor> outputs_;
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.Tensor> getOutputsList() {
    return outputs_;
  }
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.TensorOrBuilder>
      getOutputsOrBuilderList() {
    return outputs_;
  }
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  @java.lang.Override
  public int getOutputsCount() {
    return outputs_.size();
  }
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Tensor getOutputs(int index) {
    return outputs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorOrBuilder getOutputsOrBuilder(int index) {
    return outputs_.get(index);
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.Tensor parameters_;
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
   *
   * @return Whether the parameters field is set.
   */
  @java.lang.Override
  public boolean hasParameters() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
   *
   * @return The parameters.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Tensor getParameters() {
    return parameters_ == null
        ? com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance()
        : parameters_;
  }
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TensorOrBuilder getParametersOrBuilder() {
    return parameters_ == null
        ? com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance()
        : parameters_;
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
    for (int i = 0; i < outputs_.size(); i++) {
      output.writeMessage(1, outputs_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getParameters());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < outputs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, outputs_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getParameters());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.StreamDirectPredictResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.StreamDirectPredictResponse other =
        (com.google.cloud.aiplatform.v1.StreamDirectPredictResponse) obj;

    if (!getOutputsList().equals(other.getOutputsList())) return false;
    if (hasParameters() != other.hasParameters()) return false;
    if (hasParameters()) {
      if (!getParameters().equals(other.getParameters())) return false;
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
    if (getOutputsCount() > 0) {
      hash = (37 * hash) + OUTPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getOutputsList().hashCode();
    }
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.StreamDirectPredictResponse prototype) {
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
   * [PredictionService.StreamDirectPredict][google.cloud.aiplatform.v1.PredictionService.StreamDirectPredict].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.StreamDirectPredictResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.StreamDirectPredictResponse)
      com.google.cloud.aiplatform.v1.StreamDirectPredictResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1_StreamDirectPredictResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1_StreamDirectPredictResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.class,
              com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOutputsFieldBuilder();
        getParametersFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (outputsBuilder_ == null) {
        outputs_ = java.util.Collections.emptyList();
      } else {
        outputs_ = null;
        outputsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      parameters_ = null;
      if (parametersBuilder_ != null) {
        parametersBuilder_.dispose();
        parametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1_StreamDirectPredictResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.StreamDirectPredictResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.StreamDirectPredictResponse build() {
      com.google.cloud.aiplatform.v1.StreamDirectPredictResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.StreamDirectPredictResponse buildPartial() {
      com.google.cloud.aiplatform.v1.StreamDirectPredictResponse result =
          new com.google.cloud.aiplatform.v1.StreamDirectPredictResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.StreamDirectPredictResponse result) {
      if (outputsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          outputs_ = java.util.Collections.unmodifiableList(outputs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.outputs_ = outputs_;
      } else {
        result.outputs_ = outputsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.StreamDirectPredictResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parameters_ = parametersBuilder_ == null ? parameters_ : parametersBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.StreamDirectPredictResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.StreamDirectPredictResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.StreamDirectPredictResponse other) {
      if (other == com.google.cloud.aiplatform.v1.StreamDirectPredictResponse.getDefaultInstance())
        return this;
      if (outputsBuilder_ == null) {
        if (!other.outputs_.isEmpty()) {
          if (outputs_.isEmpty()) {
            outputs_ = other.outputs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOutputsIsMutable();
            outputs_.addAll(other.outputs_);
          }
          onChanged();
        }
      } else {
        if (!other.outputs_.isEmpty()) {
          if (outputsBuilder_.isEmpty()) {
            outputsBuilder_.dispose();
            outputsBuilder_ = null;
            outputs_ = other.outputs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            outputsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOutputsFieldBuilder()
                    : null;
          } else {
            outputsBuilder_.addAllMessages(other.outputs_);
          }
        }
      }
      if (other.hasParameters()) {
        mergeParameters(other.getParameters());
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
                com.google.cloud.aiplatform.v1.Tensor m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.Tensor.parser(), extensionRegistry);
                if (outputsBuilder_ == null) {
                  ensureOutputsIsMutable();
                  outputs_.add(m);
                } else {
                  outputsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getParametersFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.util.List<com.google.cloud.aiplatform.v1.Tensor> outputs_ =
        java.util.Collections.emptyList();

    private void ensureOutputsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        outputs_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.Tensor>(outputs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Tensor,
            com.google.cloud.aiplatform.v1.Tensor.Builder,
            com.google.cloud.aiplatform.v1.TensorOrBuilder>
        outputsBuilder_;

    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Tensor> getOutputsList() {
      if (outputsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(outputs_);
      } else {
        return outputsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public int getOutputsCount() {
      if (outputsBuilder_ == null) {
        return outputs_.size();
      } else {
        return outputsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Tensor getOutputs(int index) {
      if (outputsBuilder_ == null) {
        return outputs_.get(index);
      } else {
        return outputsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder setOutputs(int index, com.google.cloud.aiplatform.v1.Tensor value) {
      if (outputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutputsIsMutable();
        outputs_.set(index, value);
        onChanged();
      } else {
        outputsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder setOutputs(
        int index, com.google.cloud.aiplatform.v1.Tensor.Builder builderForValue) {
      if (outputsBuilder_ == null) {
        ensureOutputsIsMutable();
        outputs_.set(index, builderForValue.build());
        onChanged();
      } else {
        outputsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder addOutputs(com.google.cloud.aiplatform.v1.Tensor value) {
      if (outputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutputsIsMutable();
        outputs_.add(value);
        onChanged();
      } else {
        outputsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder addOutputs(int index, com.google.cloud.aiplatform.v1.Tensor value) {
      if (outputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutputsIsMutable();
        outputs_.add(index, value);
        onChanged();
      } else {
        outputsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder addOutputs(com.google.cloud.aiplatform.v1.Tensor.Builder builderForValue) {
      if (outputsBuilder_ == null) {
        ensureOutputsIsMutable();
        outputs_.add(builderForValue.build());
        onChanged();
      } else {
        outputsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder addOutputs(
        int index, com.google.cloud.aiplatform.v1.Tensor.Builder builderForValue) {
      if (outputsBuilder_ == null) {
        ensureOutputsIsMutable();
        outputs_.add(index, builderForValue.build());
        onChanged();
      } else {
        outputsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder addAllOutputs(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.Tensor> values) {
      if (outputsBuilder_ == null) {
        ensureOutputsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, outputs_);
        onChanged();
      } else {
        outputsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder clearOutputs() {
      if (outputsBuilder_ == null) {
        outputs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        outputsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public Builder removeOutputs(int index) {
      if (outputsBuilder_ == null) {
        ensureOutputsIsMutable();
        outputs_.remove(index);
        onChanged();
      } else {
        outputsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Tensor.Builder getOutputsBuilder(int index) {
      return getOutputsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorOrBuilder getOutputsOrBuilder(int index) {
      if (outputsBuilder_ == null) {
        return outputs_.get(index);
      } else {
        return outputsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.TensorOrBuilder>
        getOutputsOrBuilderList() {
      if (outputsBuilder_ != null) {
        return outputsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(outputs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Tensor.Builder addOutputsBuilder() {
      return getOutputsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Tensor.Builder addOutputsBuilder(int index) {
      return getOutputsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The prediction output.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Tensor outputs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Tensor.Builder> getOutputsBuilderList() {
      return getOutputsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Tensor,
            com.google.cloud.aiplatform.v1.Tensor.Builder,
            com.google.cloud.aiplatform.v1.TensorOrBuilder>
        getOutputsFieldBuilder() {
      if (outputsBuilder_ == null) {
        outputsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Tensor,
                com.google.cloud.aiplatform.v1.Tensor.Builder,
                com.google.cloud.aiplatform.v1.TensorOrBuilder>(
                outputs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        outputs_ = null;
      }
      return outputsBuilder_;
    }

    private com.google.cloud.aiplatform.v1.Tensor parameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Tensor,
            com.google.cloud.aiplatform.v1.Tensor.Builder,
            com.google.cloud.aiplatform.v1.TensorOrBuilder>
        parametersBuilder_;
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     *
     * @return Whether the parameters field is set.
     */
    public boolean hasParameters() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     *
     * @return The parameters.
     */
    public com.google.cloud.aiplatform.v1.Tensor getParameters() {
      if (parametersBuilder_ == null) {
        return parameters_ == null
            ? com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance()
            : parameters_;
      } else {
        return parametersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    public Builder setParameters(com.google.cloud.aiplatform.v1.Tensor value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameters_ = value;
      } else {
        parametersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    public Builder setParameters(com.google.cloud.aiplatform.v1.Tensor.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    public Builder mergeParameters(com.google.cloud.aiplatform.v1.Tensor value) {
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && parameters_ != null
            && parameters_ != com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance()) {
          getParametersBuilder().mergeFrom(value);
        } else {
          parameters_ = value;
        }
      } else {
        parametersBuilder_.mergeFrom(value);
      }
      if (parameters_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    public Builder clearParameters() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parameters_ = null;
      if (parametersBuilder_ != null) {
        parametersBuilder_.dispose();
        parametersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.Tensor.Builder getParametersBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.TensorOrBuilder getParametersOrBuilder() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilder();
      } else {
        return parameters_ == null
            ? com.google.cloud.aiplatform.v1.Tensor.getDefaultInstance()
            : parameters_;
      }
    }
    /**
     *
     *
     * <pre>
     * The parameters that govern the prediction.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Tensor parameters = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Tensor,
            com.google.cloud.aiplatform.v1.Tensor.Builder,
            com.google.cloud.aiplatform.v1.TensorOrBuilder>
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Tensor,
                com.google.cloud.aiplatform.v1.Tensor.Builder,
                com.google.cloud.aiplatform.v1.TensorOrBuilder>(
                getParameters(), getParentForChildren(), isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.StreamDirectPredictResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.StreamDirectPredictResponse)
  private static final com.google.cloud.aiplatform.v1.StreamDirectPredictResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.StreamDirectPredictResponse();
  }

  public static com.google.cloud.aiplatform.v1.StreamDirectPredictResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamDirectPredictResponse> PARSER =
      new com.google.protobuf.AbstractParser<StreamDirectPredictResponse>() {
        @java.lang.Override
        public StreamDirectPredictResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamDirectPredictResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamDirectPredictResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.StreamDirectPredictResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
