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
// source: google/cloud/contentwarehouse/v1/document_schema.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Configurations for an enum/categorical property.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.EnumTypeOptions}
 */
public final class EnumTypeOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.EnumTypeOptions)
    EnumTypeOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnumTypeOptions.newBuilder() to construct.
  private EnumTypeOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnumTypeOptions() {
    possibleValues_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnumTypeOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentSchemaProto
        .internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentSchemaProto
        .internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.EnumTypeOptions.class,
            com.google.cloud.contentwarehouse.v1.EnumTypeOptions.Builder.class);
  }

  public static final int POSSIBLE_VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList possibleValues_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the possibleValues.
   */
  public com.google.protobuf.ProtocolStringList getPossibleValuesList() {
    return possibleValues_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of possibleValues.
   */
  public int getPossibleValuesCount() {
    return possibleValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The possibleValues at the given index.
   */
  public java.lang.String getPossibleValues(int index) {
    return possibleValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the possibleValues at the given index.
   */
  public com.google.protobuf.ByteString getPossibleValuesBytes(int index) {
    return possibleValues_.getByteString(index);
  }

  public static final int VALIDATION_CHECK_DISABLED_FIELD_NUMBER = 2;
  private boolean validationCheckDisabled_ = false;
  /**
   *
   *
   * <pre>
   * Make sure the Enum property value provided in the document is in the
   * possile value list during document creation. The validation check runs by
   * default.
   * </pre>
   *
   * <code>bool validation_check_disabled = 2;</code>
   *
   * @return The validationCheckDisabled.
   */
  @java.lang.Override
  public boolean getValidationCheckDisabled() {
    return validationCheckDisabled_;
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
    for (int i = 0; i < possibleValues_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, possibleValues_.getRaw(i));
    }
    if (validationCheckDisabled_ != false) {
      output.writeBool(2, validationCheckDisabled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < possibleValues_.size(); i++) {
        dataSize += computeStringSizeNoTag(possibleValues_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPossibleValuesList().size();
    }
    if (validationCheckDisabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, validationCheckDisabled_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.EnumTypeOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.EnumTypeOptions other =
        (com.google.cloud.contentwarehouse.v1.EnumTypeOptions) obj;

    if (!getPossibleValuesList().equals(other.getPossibleValuesList())) return false;
    if (getValidationCheckDisabled() != other.getValidationCheckDisabled()) return false;
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
    if (getPossibleValuesCount() > 0) {
      hash = (37 * hash) + POSSIBLE_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getPossibleValuesList().hashCode();
    }
    hash = (37 * hash) + VALIDATION_CHECK_DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidationCheckDisabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.EnumTypeOptions prototype) {
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
   * Configurations for an enum/categorical property.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.EnumTypeOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.EnumTypeOptions)
      com.google.cloud.contentwarehouse.v1.EnumTypeOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaProto
          .internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaProto
          .internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.EnumTypeOptions.class,
              com.google.cloud.contentwarehouse.v1.EnumTypeOptions.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.EnumTypeOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      possibleValues_ = com.google.protobuf.LazyStringArrayList.emptyList();
      validationCheckDisabled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaProto
          .internal_static_google_cloud_contentwarehouse_v1_EnumTypeOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.EnumTypeOptions getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.EnumTypeOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.EnumTypeOptions build() {
      com.google.cloud.contentwarehouse.v1.EnumTypeOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.EnumTypeOptions buildPartial() {
      com.google.cloud.contentwarehouse.v1.EnumTypeOptions result =
          new com.google.cloud.contentwarehouse.v1.EnumTypeOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.EnumTypeOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        possibleValues_.makeImmutable();
        result.possibleValues_ = possibleValues_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validationCheckDisabled_ = validationCheckDisabled_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.EnumTypeOptions) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.EnumTypeOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.EnumTypeOptions other) {
      if (other == com.google.cloud.contentwarehouse.v1.EnumTypeOptions.getDefaultInstance())
        return this;
      if (!other.possibleValues_.isEmpty()) {
        if (possibleValues_.isEmpty()) {
          possibleValues_ = other.possibleValues_;
          bitField0_ |= 0x00000001;
        } else {
          ensurePossibleValuesIsMutable();
          possibleValues_.addAll(other.possibleValues_);
        }
        onChanged();
      }
      if (other.getValidationCheckDisabled() != false) {
        setValidationCheckDisabled(other.getValidationCheckDisabled());
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
                java.lang.String s = input.readStringRequireUtf8();
                ensurePossibleValuesIsMutable();
                possibleValues_.add(s);
                break;
              } // case 10
            case 16:
              {
                validationCheckDisabled_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.protobuf.LazyStringArrayList possibleValues_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePossibleValuesIsMutable() {
      if (!possibleValues_.isModifiable()) {
        possibleValues_ = new com.google.protobuf.LazyStringArrayList(possibleValues_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the possibleValues.
     */
    public com.google.protobuf.ProtocolStringList getPossibleValuesList() {
      possibleValues_.makeImmutable();
      return possibleValues_;
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of possibleValues.
     */
    public int getPossibleValuesCount() {
      return possibleValues_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The possibleValues at the given index.
     */
    public java.lang.String getPossibleValues(int index) {
      return possibleValues_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the possibleValues at the given index.
     */
    public com.google.protobuf.ByteString getPossibleValuesBytes(int index) {
      return possibleValues_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The possibleValues to set.
     * @return This builder for chaining.
     */
    public Builder setPossibleValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePossibleValuesIsMutable();
      possibleValues_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The possibleValues to add.
     * @return This builder for chaining.
     */
    public Builder addPossibleValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePossibleValuesIsMutable();
      possibleValues_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The possibleValues to add.
     * @return This builder for chaining.
     */
    public Builder addAllPossibleValues(java.lang.Iterable<java.lang.String> values) {
      ensurePossibleValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, possibleValues_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPossibleValues() {
      possibleValues_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of possible enum values.
     * </pre>
     *
     * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes of the possibleValues to add.
     * @return This builder for chaining.
     */
    public Builder addPossibleValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePossibleValuesIsMutable();
      possibleValues_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean validationCheckDisabled_;
    /**
     *
     *
     * <pre>
     * Make sure the Enum property value provided in the document is in the
     * possile value list during document creation. The validation check runs by
     * default.
     * </pre>
     *
     * <code>bool validation_check_disabled = 2;</code>
     *
     * @return The validationCheckDisabled.
     */
    @java.lang.Override
    public boolean getValidationCheckDisabled() {
      return validationCheckDisabled_;
    }
    /**
     *
     *
     * <pre>
     * Make sure the Enum property value provided in the document is in the
     * possile value list during document creation. The validation check runs by
     * default.
     * </pre>
     *
     * <code>bool validation_check_disabled = 2;</code>
     *
     * @param value The validationCheckDisabled to set.
     * @return This builder for chaining.
     */
    public Builder setValidationCheckDisabled(boolean value) {

      validationCheckDisabled_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Make sure the Enum property value provided in the document is in the
     * possile value list during document creation. The validation check runs by
     * default.
     * </pre>
     *
     * <code>bool validation_check_disabled = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidationCheckDisabled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validationCheckDisabled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.EnumTypeOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.EnumTypeOptions)
  private static final com.google.cloud.contentwarehouse.v1.EnumTypeOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.EnumTypeOptions();
  }

  public static com.google.cloud.contentwarehouse.v1.EnumTypeOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnumTypeOptions> PARSER =
      new com.google.protobuf.AbstractParser<EnumTypeOptions>() {
        @java.lang.Override
        public EnumTypeOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnumTypeOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnumTypeOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.EnumTypeOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
