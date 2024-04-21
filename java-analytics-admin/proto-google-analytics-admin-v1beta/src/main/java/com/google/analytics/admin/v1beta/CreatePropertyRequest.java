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
// source: google/analytics/admin/v1beta/analytics_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * Request message for CreateProperty RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.CreatePropertyRequest}
 */
public final class CreatePropertyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.CreatePropertyRequest)
    CreatePropertyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePropertyRequest.newBuilder() to construct.
  private CreatePropertyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePropertyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePropertyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_CreatePropertyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_CreatePropertyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.CreatePropertyRequest.class,
            com.google.analytics.admin.v1beta.CreatePropertyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROPERTY_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1beta.Property property_;
  /**
   *
   *
   * <pre>
   * Required. The property to create.
   * Note: the supplied property must specify its parent.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the property field is set.
   */
  @java.lang.Override
  public boolean hasProperty() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The property to create.
   * Note: the supplied property must specify its parent.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The property.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.Property getProperty() {
    return property_ == null
        ? com.google.analytics.admin.v1beta.Property.getDefaultInstance()
        : property_;
  }
  /**
   *
   *
   * <pre>
   * Required. The property to create.
   * Note: the supplied property must specify its parent.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.PropertyOrBuilder getPropertyOrBuilder() {
    return property_ == null
        ? com.google.analytics.admin.v1beta.Property.getDefaultInstance()
        : property_;
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
      output.writeMessage(1, getProperty());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getProperty());
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.CreatePropertyRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.CreatePropertyRequest other =
        (com.google.analytics.admin.v1beta.CreatePropertyRequest) obj;

    if (hasProperty() != other.hasProperty()) return false;
    if (hasProperty()) {
      if (!getProperty().equals(other.getProperty())) return false;
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
    if (hasProperty()) {
      hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
      hash = (53 * hash) + getProperty().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest parseFrom(
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
      com.google.analytics.admin.v1beta.CreatePropertyRequest prototype) {
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
   * Request message for CreateProperty RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.CreatePropertyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.CreatePropertyRequest)
      com.google.analytics.admin.v1beta.CreatePropertyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_CreatePropertyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_CreatePropertyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.CreatePropertyRequest.class,
              com.google.analytics.admin.v1beta.CreatePropertyRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.CreatePropertyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPropertyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      property_ = null;
      if (propertyBuilder_ != null) {
        propertyBuilder_.dispose();
        propertyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_CreatePropertyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.CreatePropertyRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.CreatePropertyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.CreatePropertyRequest build() {
      com.google.analytics.admin.v1beta.CreatePropertyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.CreatePropertyRequest buildPartial() {
      com.google.analytics.admin.v1beta.CreatePropertyRequest result =
          new com.google.analytics.admin.v1beta.CreatePropertyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.CreatePropertyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.property_ = propertyBuilder_ == null ? property_ : propertyBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1beta.CreatePropertyRequest) {
        return mergeFrom((com.google.analytics.admin.v1beta.CreatePropertyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.CreatePropertyRequest other) {
      if (other == com.google.analytics.admin.v1beta.CreatePropertyRequest.getDefaultInstance())
        return this;
      if (other.hasProperty()) {
        mergeProperty(other.getProperty());
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
                input.readMessage(getPropertyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.analytics.admin.v1beta.Property property_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.Property,
            com.google.analytics.admin.v1beta.Property.Builder,
            com.google.analytics.admin.v1beta.PropertyOrBuilder>
        propertyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the property field is set.
     */
    public boolean hasProperty() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The property.
     */
    public com.google.analytics.admin.v1beta.Property getProperty() {
      if (propertyBuilder_ == null) {
        return property_ == null
            ? com.google.analytics.admin.v1beta.Property.getDefaultInstance()
            : property_;
      } else {
        return propertyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProperty(com.google.analytics.admin.v1beta.Property value) {
      if (propertyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        property_ = value;
      } else {
        propertyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProperty(com.google.analytics.admin.v1beta.Property.Builder builderForValue) {
      if (propertyBuilder_ == null) {
        property_ = builderForValue.build();
      } else {
        propertyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeProperty(com.google.analytics.admin.v1beta.Property value) {
      if (propertyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && property_ != null
            && property_ != com.google.analytics.admin.v1beta.Property.getDefaultInstance()) {
          getPropertyBuilder().mergeFrom(value);
        } else {
          property_ = value;
        }
      } else {
        propertyBuilder_.mergeFrom(value);
      }
      if (property_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearProperty() {
      bitField0_ = (bitField0_ & ~0x00000001);
      property_ = null;
      if (propertyBuilder_ != null) {
        propertyBuilder_.dispose();
        propertyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1beta.Property.Builder getPropertyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPropertyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1beta.PropertyOrBuilder getPropertyOrBuilder() {
      if (propertyBuilder_ != null) {
        return propertyBuilder_.getMessageOrBuilder();
      } else {
        return property_ == null
            ? com.google.analytics.admin.v1beta.Property.getDefaultInstance()
            : property_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The property to create.
     * Note: the supplied property must specify its parent.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.Property property = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1beta.Property,
            com.google.analytics.admin.v1beta.Property.Builder,
            com.google.analytics.admin.v1beta.PropertyOrBuilder>
        getPropertyFieldBuilder() {
      if (propertyBuilder_ == null) {
        propertyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1beta.Property,
                com.google.analytics.admin.v1beta.Property.Builder,
                com.google.analytics.admin.v1beta.PropertyOrBuilder>(
                getProperty(), getParentForChildren(), isClean());
        property_ = null;
      }
      return propertyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.CreatePropertyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.CreatePropertyRequest)
  private static final com.google.analytics.admin.v1beta.CreatePropertyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.CreatePropertyRequest();
  }

  public static com.google.analytics.admin.v1beta.CreatePropertyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePropertyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePropertyRequest>() {
        @java.lang.Override
        public CreatePropertyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePropertyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePropertyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.CreatePropertyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
