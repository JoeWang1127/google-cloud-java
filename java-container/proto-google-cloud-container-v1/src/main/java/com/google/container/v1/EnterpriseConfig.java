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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * EnterpriseConfig is the cluster enterprise configuration.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.EnterpriseConfig}
 */
public final class EnterpriseConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.EnterpriseConfig)
    EnterpriseConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnterpriseConfig.newBuilder() to construct.
  private EnterpriseConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnterpriseConfig() {
    clusterTier_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnterpriseConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_EnterpriseConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_EnterpriseConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.EnterpriseConfig.class,
            com.google.container.v1.EnterpriseConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Premium tiers for GKE Cluster.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.EnterpriseConfig.ClusterTier}
   */
  public enum ClusterTier implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * CLUSTER_TIER_UNSPECIFIED is when cluster_tier is not set.
     * </pre>
     *
     * <code>CLUSTER_TIER_UNSPECIFIED = 0;</code>
     */
    CLUSTER_TIER_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * STANDARD indicates a standard GKE cluster.
     * </pre>
     *
     * <code>STANDARD = 1;</code>
     */
    STANDARD(1),
    /**
     *
     *
     * <pre>
     * ENTERPRISE indicates a GKE Enterprise cluster.
     * </pre>
     *
     * <code>ENTERPRISE = 2;</code>
     */
    ENTERPRISE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * CLUSTER_TIER_UNSPECIFIED is when cluster_tier is not set.
     * </pre>
     *
     * <code>CLUSTER_TIER_UNSPECIFIED = 0;</code>
     */
    public static final int CLUSTER_TIER_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * STANDARD indicates a standard GKE cluster.
     * </pre>
     *
     * <code>STANDARD = 1;</code>
     */
    public static final int STANDARD_VALUE = 1;
    /**
     *
     *
     * <pre>
     * ENTERPRISE indicates a GKE Enterprise cluster.
     * </pre>
     *
     * <code>ENTERPRISE = 2;</code>
     */
    public static final int ENTERPRISE_VALUE = 2;

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
    public static ClusterTier valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClusterTier forNumber(int value) {
      switch (value) {
        case 0:
          return CLUSTER_TIER_UNSPECIFIED;
        case 1:
          return STANDARD;
        case 2:
          return ENTERPRISE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClusterTier> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ClusterTier> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClusterTier>() {
          public ClusterTier findValueByNumber(int number) {
            return ClusterTier.forNumber(number);
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
      return com.google.container.v1.EnterpriseConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClusterTier[] VALUES = values();

    public static ClusterTier valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ClusterTier(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.EnterpriseConfig.ClusterTier)
  }

  public static final int CLUSTER_TIER_FIELD_NUMBER = 1;
  private int clusterTier_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. [Output only] cluster_tier specifies the premium tier of the
   * cluster.
   * </pre>
   *
   * <code>
   * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for clusterTier.
   */
  @java.lang.Override
  public int getClusterTierValue() {
    return clusterTier_;
  }
  /**
   *
   *
   * <pre>
   * Output only. [Output only] cluster_tier specifies the premium tier of the
   * cluster.
   * </pre>
   *
   * <code>
   * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The clusterTier.
   */
  @java.lang.Override
  public com.google.container.v1.EnterpriseConfig.ClusterTier getClusterTier() {
    com.google.container.v1.EnterpriseConfig.ClusterTier result =
        com.google.container.v1.EnterpriseConfig.ClusterTier.forNumber(clusterTier_);
    return result == null
        ? com.google.container.v1.EnterpriseConfig.ClusterTier.UNRECOGNIZED
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
    if (clusterTier_
        != com.google.container.v1.EnterpriseConfig.ClusterTier.CLUSTER_TIER_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, clusterTier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clusterTier_
        != com.google.container.v1.EnterpriseConfig.ClusterTier.CLUSTER_TIER_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, clusterTier_);
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
    if (!(obj instanceof com.google.container.v1.EnterpriseConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.EnterpriseConfig other = (com.google.container.v1.EnterpriseConfig) obj;

    if (clusterTier_ != other.clusterTier_) return false;
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
    hash = (37 * hash) + CLUSTER_TIER_FIELD_NUMBER;
    hash = (53 * hash) + clusterTier_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.EnterpriseConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.EnterpriseConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.EnterpriseConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.EnterpriseConfig prototype) {
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
   * EnterpriseConfig is the cluster enterprise configuration.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.EnterpriseConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.EnterpriseConfig)
      com.google.container.v1.EnterpriseConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_EnterpriseConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_EnterpriseConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.EnterpriseConfig.class,
              com.google.container.v1.EnterpriseConfig.Builder.class);
    }

    // Construct using com.google.container.v1.EnterpriseConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clusterTier_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_EnterpriseConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.EnterpriseConfig getDefaultInstanceForType() {
      return com.google.container.v1.EnterpriseConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.EnterpriseConfig build() {
      com.google.container.v1.EnterpriseConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.EnterpriseConfig buildPartial() {
      com.google.container.v1.EnterpriseConfig result =
          new com.google.container.v1.EnterpriseConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.EnterpriseConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clusterTier_ = clusterTier_;
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
      if (other instanceof com.google.container.v1.EnterpriseConfig) {
        return mergeFrom((com.google.container.v1.EnterpriseConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.EnterpriseConfig other) {
      if (other == com.google.container.v1.EnterpriseConfig.getDefaultInstance()) return this;
      if (other.clusterTier_ != 0) {
        setClusterTierValue(other.getClusterTierValue());
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
                clusterTier_ = input.readEnum();
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

    private int clusterTier_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. [Output only] cluster_tier specifies the premium tier of the
     * cluster.
     * </pre>
     *
     * <code>
     * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for clusterTier.
     */
    @java.lang.Override
    public int getClusterTierValue() {
      return clusterTier_;
    }
    /**
     *
     *
     * <pre>
     * Output only. [Output only] cluster_tier specifies the premium tier of the
     * cluster.
     * </pre>
     *
     * <code>
     * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for clusterTier to set.
     * @return This builder for chaining.
     */
    public Builder setClusterTierValue(int value) {
      clusterTier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. [Output only] cluster_tier specifies the premium tier of the
     * cluster.
     * </pre>
     *
     * <code>
     * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The clusterTier.
     */
    @java.lang.Override
    public com.google.container.v1.EnterpriseConfig.ClusterTier getClusterTier() {
      com.google.container.v1.EnterpriseConfig.ClusterTier result =
          com.google.container.v1.EnterpriseConfig.ClusterTier.forNumber(clusterTier_);
      return result == null
          ? com.google.container.v1.EnterpriseConfig.ClusterTier.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. [Output only] cluster_tier specifies the premium tier of the
     * cluster.
     * </pre>
     *
     * <code>
     * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The clusterTier to set.
     * @return This builder for chaining.
     */
    public Builder setClusterTier(com.google.container.v1.EnterpriseConfig.ClusterTier value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      clusterTier_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. [Output only] cluster_tier specifies the premium tier of the
     * cluster.
     * </pre>
     *
     * <code>
     * .google.container.v1.EnterpriseConfig.ClusterTier cluster_tier = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterTier() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clusterTier_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.EnterpriseConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.EnterpriseConfig)
  private static final com.google.container.v1.EnterpriseConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.EnterpriseConfig();
  }

  public static com.google.container.v1.EnterpriseConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnterpriseConfig> PARSER =
      new com.google.protobuf.AbstractParser<EnterpriseConfig>() {
        @java.lang.Override
        public EnterpriseConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnterpriseConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnterpriseConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.EnterpriseConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
