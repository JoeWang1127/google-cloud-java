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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Config for blur baseline.
 *
 * When enabled, a linear path from the maximally blurred image to the input
 * image is created. Using a blurred baseline instead of zero (black image) is
 * motivated by the BlurIG approach explained here:
 * https://arxiv.org/abs/2004.03383
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.BlurBaselineConfig}
 */
public final class BlurBaselineConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.BlurBaselineConfig)
    BlurBaselineConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BlurBaselineConfig.newBuilder() to construct.
  private BlurBaselineConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BlurBaselineConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BlurBaselineConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.class,
            com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.Builder.class);
  }

  public static final int MAX_BLUR_SIGMA_FIELD_NUMBER = 1;
  private float maxBlurSigma_ = 0F;
  /**
   *
   *
   * <pre>
   * The standard deviation of the blur kernel for the blurred baseline. The
   * same blurring parameter is used for both the height and the width
   * dimension. If not set, the method defaults to the zero (i.e. black for
   * images) baseline.
   * </pre>
   *
   * <code>float max_blur_sigma = 1;</code>
   *
   * @return The maxBlurSigma.
   */
  @java.lang.Override
  public float getMaxBlurSigma() {
    return maxBlurSigma_;
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
    if (java.lang.Float.floatToRawIntBits(maxBlurSigma_) != 0) {
      output.writeFloat(1, maxBlurSigma_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(maxBlurSigma_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, maxBlurSigma_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig other =
        (com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig) obj;

    if (java.lang.Float.floatToIntBits(getMaxBlurSigma())
        != java.lang.Float.floatToIntBits(other.getMaxBlurSigma())) return false;
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
    hash = (37 * hash) + MAX_BLUR_SIGMA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getMaxBlurSigma());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig prototype) {
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
   * Config for blur baseline.
   *
   * When enabled, a linear path from the maximally blurred image to the input
   * image is created. Using a blurred baseline instead of zero (black image) is
   * motivated by the BlurIG approach explained here:
   * https://arxiv.org/abs/2004.03383
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.BlurBaselineConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.BlurBaselineConfig)
      com.google.cloud.aiplatform.v1beta1.BlurBaselineConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.class,
              com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxBlurSigma_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1beta1_BlurBaselineConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig build() {
      com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig buildPartial() {
      com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig result =
          new com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxBlurSigma_ = maxBlurSigma_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig other) {
      if (other == com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig.getDefaultInstance())
        return this;
      if (other.getMaxBlurSigma() != 0F) {
        setMaxBlurSigma(other.getMaxBlurSigma());
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
            case 13:
              {
                maxBlurSigma_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
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

    private float maxBlurSigma_;
    /**
     *
     *
     * <pre>
     * The standard deviation of the blur kernel for the blurred baseline. The
     * same blurring parameter is used for both the height and the width
     * dimension. If not set, the method defaults to the zero (i.e. black for
     * images) baseline.
     * </pre>
     *
     * <code>float max_blur_sigma = 1;</code>
     *
     * @return The maxBlurSigma.
     */
    @java.lang.Override
    public float getMaxBlurSigma() {
      return maxBlurSigma_;
    }
    /**
     *
     *
     * <pre>
     * The standard deviation of the blur kernel for the blurred baseline. The
     * same blurring parameter is used for both the height and the width
     * dimension. If not set, the method defaults to the zero (i.e. black for
     * images) baseline.
     * </pre>
     *
     * <code>float max_blur_sigma = 1;</code>
     *
     * @param value The maxBlurSigma to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBlurSigma(float value) {

      maxBlurSigma_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The standard deviation of the blur kernel for the blurred baseline. The
     * same blurring parameter is used for both the height and the width
     * dimension. If not set, the method defaults to the zero (i.e. black for
     * images) baseline.
     * </pre>
     *
     * <code>float max_blur_sigma = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxBlurSigma() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxBlurSigma_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.BlurBaselineConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.BlurBaselineConfig)
  private static final com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig();
  }

  public static com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlurBaselineConfig> PARSER =
      new com.google.protobuf.AbstractParser<BlurBaselineConfig>() {
        @java.lang.Override
        public BlurBaselineConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<BlurBaselineConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlurBaselineConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
