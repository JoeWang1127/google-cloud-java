/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Additional information associated with the annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.AnnotationMetadata}
 */
public final class AnnotationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.AnnotationMetadata)
    AnnotationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnnotationMetadata.newBuilder() to construct.
  private AnnotationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnnotationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnnotationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AnnotationMetadata(
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
          case 18:
            {
              com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder subBuilder = null;
              if (operatorMetadata_ != null) {
                subBuilder = operatorMetadata_.toBuilder();
              }
              operatorMetadata_ =
                  input.readMessage(
                      com.google.cloud.datalabeling.v1beta1.OperatorMetadata.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(operatorMetadata_);
                operatorMetadata_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.class,
            com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.Builder.class);
  }

  public static final int OPERATOR_METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.datalabeling.v1beta1.OperatorMetadata operatorMetadata_;
  /**
   *
   *
   * <pre>
   * Metadata related to human labeling.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
   *
   * @return Whether the operatorMetadata field is set.
   */
  @java.lang.Override
  public boolean hasOperatorMetadata() {
    return operatorMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * Metadata related to human labeling.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
   *
   * @return The operatorMetadata.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.OperatorMetadata getOperatorMetadata() {
    return operatorMetadata_ == null
        ? com.google.cloud.datalabeling.v1beta1.OperatorMetadata.getDefaultInstance()
        : operatorMetadata_;
  }
  /**
   *
   *
   * <pre>
   * Metadata related to human labeling.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.OperatorMetadataOrBuilder
      getOperatorMetadataOrBuilder() {
    return getOperatorMetadata();
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
    if (operatorMetadata_ != null) {
      output.writeMessage(2, getOperatorMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operatorMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOperatorMetadata());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.AnnotationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.AnnotationMetadata other =
        (com.google.cloud.datalabeling.v1beta1.AnnotationMetadata) obj;

    if (hasOperatorMetadata() != other.hasOperatorMetadata()) return false;
    if (hasOperatorMetadata()) {
      if (!getOperatorMetadata().equals(other.getOperatorMetadata())) return false;
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
    if (hasOperatorMetadata()) {
      hash = (37 * hash) + OPERATOR_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getOperatorMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.AnnotationMetadata prototype) {
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
   * Additional information associated with the annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.AnnotationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.AnnotationMetadata)
      com.google.cloud.datalabeling.v1beta1.AnnotationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.class,
              com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (operatorMetadataBuilder_ == null) {
        operatorMetadata_ = null;
      } else {
        operatorMetadata_ = null;
        operatorMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.AnnotationMetadata getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.AnnotationMetadata build() {
      com.google.cloud.datalabeling.v1beta1.AnnotationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.AnnotationMetadata buildPartial() {
      com.google.cloud.datalabeling.v1beta1.AnnotationMetadata result =
          new com.google.cloud.datalabeling.v1beta1.AnnotationMetadata(this);
      if (operatorMetadataBuilder_ == null) {
        result.operatorMetadata_ = operatorMetadata_;
      } else {
        result.operatorMetadata_ = operatorMetadataBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.AnnotationMetadata) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.AnnotationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.AnnotationMetadata other) {
      if (other == com.google.cloud.datalabeling.v1beta1.AnnotationMetadata.getDefaultInstance())
        return this;
      if (other.hasOperatorMetadata()) {
        mergeOperatorMetadata(other.getOperatorMetadata());
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
      com.google.cloud.datalabeling.v1beta1.AnnotationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.AnnotationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datalabeling.v1beta1.OperatorMetadata operatorMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.OperatorMetadata,
            com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder,
            com.google.cloud.datalabeling.v1beta1.OperatorMetadataOrBuilder>
        operatorMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     *
     * @return Whether the operatorMetadata field is set.
     */
    public boolean hasOperatorMetadata() {
      return operatorMetadataBuilder_ != null || operatorMetadata_ != null;
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     *
     * @return The operatorMetadata.
     */
    public com.google.cloud.datalabeling.v1beta1.OperatorMetadata getOperatorMetadata() {
      if (operatorMetadataBuilder_ == null) {
        return operatorMetadata_ == null
            ? com.google.cloud.datalabeling.v1beta1.OperatorMetadata.getDefaultInstance()
            : operatorMetadata_;
      } else {
        return operatorMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    public Builder setOperatorMetadata(
        com.google.cloud.datalabeling.v1beta1.OperatorMetadata value) {
      if (operatorMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operatorMetadata_ = value;
        onChanged();
      } else {
        operatorMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    public Builder setOperatorMetadata(
        com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder builderForValue) {
      if (operatorMetadataBuilder_ == null) {
        operatorMetadata_ = builderForValue.build();
        onChanged();
      } else {
        operatorMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    public Builder mergeOperatorMetadata(
        com.google.cloud.datalabeling.v1beta1.OperatorMetadata value) {
      if (operatorMetadataBuilder_ == null) {
        if (operatorMetadata_ != null) {
          operatorMetadata_ =
              com.google.cloud.datalabeling.v1beta1.OperatorMetadata.newBuilder(operatorMetadata_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          operatorMetadata_ = value;
        }
        onChanged();
      } else {
        operatorMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    public Builder clearOperatorMetadata() {
      if (operatorMetadataBuilder_ == null) {
        operatorMetadata_ = null;
        onChanged();
      } else {
        operatorMetadata_ = null;
        operatorMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder
        getOperatorMetadataBuilder() {

      onChanged();
      return getOperatorMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.OperatorMetadataOrBuilder
        getOperatorMetadataOrBuilder() {
      if (operatorMetadataBuilder_ != null) {
        return operatorMetadataBuilder_.getMessageOrBuilder();
      } else {
        return operatorMetadata_ == null
            ? com.google.cloud.datalabeling.v1beta1.OperatorMetadata.getDefaultInstance()
            : operatorMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata related to human labeling.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.OperatorMetadata operator_metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.OperatorMetadata,
            com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder,
            com.google.cloud.datalabeling.v1beta1.OperatorMetadataOrBuilder>
        getOperatorMetadataFieldBuilder() {
      if (operatorMetadataBuilder_ == null) {
        operatorMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.OperatorMetadata,
                com.google.cloud.datalabeling.v1beta1.OperatorMetadata.Builder,
                com.google.cloud.datalabeling.v1beta1.OperatorMetadataOrBuilder>(
                getOperatorMetadata(), getParentForChildren(), isClean());
        operatorMetadata_ = null;
      }
      return operatorMetadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.AnnotationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.AnnotationMetadata)
  private static final com.google.cloud.datalabeling.v1beta1.AnnotationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.AnnotationMetadata();
  }

  public static com.google.cloud.datalabeling.v1beta1.AnnotationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<AnnotationMetadata>() {
        @java.lang.Override
        public AnnotationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnnotationMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AnnotationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}