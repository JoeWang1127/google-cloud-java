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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Details of placement information for an instance.
 * Limitations for using the `host` tenancy:
 *
 *  * T3 instances that use the unlimited CPU credit option don't support host
 *  tenancy.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsInstancePlacement}
 */
public final class AwsInstancePlacement extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AwsInstancePlacement)
    AwsInstancePlacementOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AwsInstancePlacement.newBuilder() to construct.
  private AwsInstancePlacement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AwsInstancePlacement() {
    tenancy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AwsInstancePlacement();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AwsInstancePlacement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AwsInstancePlacement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.class,
            com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Tenancy defines how EC2 instances are distributed across physical hardware.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy}
   */
  public enum Tenancy implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>TENANCY_UNSPECIFIED = 0;</code>
     */
    TENANCY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Use default VPC tenancy.
     * </pre>
     *
     * <code>DEFAULT = 1;</code>
     */
    DEFAULT(1),
    /**
     *
     *
     * <pre>
     * Run a dedicated instance.
     * </pre>
     *
     * <code>DEDICATED = 2;</code>
     */
    DEDICATED(2),
    /**
     *
     *
     * <pre>
     * Launch this instance to a dedicated host.
     * </pre>
     *
     * <code>HOST = 3;</code>
     */
    HOST(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not set.
     * </pre>
     *
     * <code>TENANCY_UNSPECIFIED = 0;</code>
     */
    public static final int TENANCY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Use default VPC tenancy.
     * </pre>
     *
     * <code>DEFAULT = 1;</code>
     */
    public static final int DEFAULT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Run a dedicated instance.
     * </pre>
     *
     * <code>DEDICATED = 2;</code>
     */
    public static final int DEDICATED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Launch this instance to a dedicated host.
     * </pre>
     *
     * <code>HOST = 3;</code>
     */
    public static final int HOST_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Tenancy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Tenancy forNumber(int value) {
      switch (value) {
        case 0:
          return TENANCY_UNSPECIFIED;
        case 1:
          return DEFAULT;
        case 2:
          return DEDICATED;
        case 3:
          return HOST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Tenancy> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Tenancy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Tenancy>() {
          public Tenancy findValueByNumber(int number) {
            return Tenancy.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Tenancy[] VALUES = values();

    public static Tenancy valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Tenancy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy)
  }

  public static final int TENANCY_FIELD_NUMBER = 1;
  private int tenancy_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The tenancy for instance.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for tenancy.
   */
  @java.lang.Override
  public int getTenancyValue() {
    return tenancy_;
  }
  /**
   *
   *
   * <pre>
   * Required. The tenancy for instance.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tenancy.
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy getTenancy() {
    com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy result =
        com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy.forNumber(tenancy_);
    return result == null
        ? com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy.UNRECOGNIZED
        : result;
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
    if (tenancy_
        != com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy.TENANCY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, tenancy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tenancy_
        != com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy.TENANCY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, tenancy_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AwsInstancePlacement)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AwsInstancePlacement other =
        (com.google.cloud.gkemulticloud.v1.AwsInstancePlacement) obj;

    if (tenancy_ != other.tenancy_) return false;
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
    hash = (37 * hash) + TENANCY_FIELD_NUMBER;
    hash = (53 * hash) + tenancy_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement parseFrom(
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
      com.google.cloud.gkemulticloud.v1.AwsInstancePlacement prototype) {
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
   * Details of placement information for an instance.
   * Limitations for using the `host` tenancy:
   *
   *  * T3 instances that use the unlimited CPU credit option don't support host
   *  tenancy.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsInstancePlacement}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AwsInstancePlacement)
      com.google.cloud.gkemulticloud.v1.AwsInstancePlacementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsInstancePlacement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsInstancePlacement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.class,
              com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tenancy_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsInstancePlacement_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsInstancePlacement getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsInstancePlacement build() {
      com.google.cloud.gkemulticloud.v1.AwsInstancePlacement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsInstancePlacement buildPartial() {
      com.google.cloud.gkemulticloud.v1.AwsInstancePlacement result =
          new com.google.cloud.gkemulticloud.v1.AwsInstancePlacement(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AwsInstancePlacement result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tenancy_ = tenancy_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AwsInstancePlacement) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AwsInstancePlacement) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AwsInstancePlacement other) {
      if (other == com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.getDefaultInstance())
        return this;
      if (other.tenancy_ != 0) {
        setTenancyValue(other.getTenancyValue());
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
            case 8:
              {
                tenancy_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int tenancy_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The tenancy for instance.
     * </pre>
     *
     * <code>
     * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for tenancy.
     */
    @java.lang.Override
    public int getTenancyValue() {
      return tenancy_;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenancy for instance.
     * </pre>
     *
     * <code>
     * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for tenancy to set.
     * @return This builder for chaining.
     */
    public Builder setTenancyValue(int value) {
      tenancy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenancy for instance.
     * </pre>
     *
     * <code>
     * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tenancy.
     */
    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy getTenancy() {
      com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy result =
          com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy.forNumber(tenancy_);
      return result == null
          ? com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenancy for instance.
     * </pre>
     *
     * <code>
     * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The tenancy to set.
     * @return This builder for chaining.
     */
    public Builder setTenancy(
        com.google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      tenancy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenancy for instance.
     * </pre>
     *
     * <code>
     * .google.cloud.gkemulticloud.v1.AwsInstancePlacement.Tenancy tenancy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTenancy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tenancy_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AwsInstancePlacement)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AwsInstancePlacement)
  private static final com.google.cloud.gkemulticloud.v1.AwsInstancePlacement DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AwsInstancePlacement();
  }

  public static com.google.cloud.gkemulticloud.v1.AwsInstancePlacement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsInstancePlacement> PARSER =
      new com.google.protobuf.AbstractParser<AwsInstancePlacement>() {
        @java.lang.Override
        public AwsInstancePlacement parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsInstancePlacement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsInstancePlacement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsInstancePlacement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
