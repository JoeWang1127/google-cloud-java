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
 * Configuration of destination for Import related errors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.ImportErrorConfig}
 */
public final class ImportErrorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.ImportErrorConfig)
    ImportErrorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportErrorConfig.newBuilder() to construct.
  private ImportErrorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportErrorConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportErrorConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.ImportConfigProto
        .internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.ImportConfigProto
        .internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.ImportErrorConfig.class,
            com.google.cloud.discoveryengine.v1.ImportErrorConfig.Builder.class);
  }

  private int destinationCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object destination_;

  public enum DestinationCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_PREFIX(1),
    DESTINATION_NOT_SET(0);
    private final int value;

    private DestinationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_PREFIX;
        case 0:
          return DESTINATION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DestinationCase getDestinationCase() {
    return DestinationCase.forNumber(destinationCase_);
  }

  public static final int GCS_PREFIX_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Cloud Storage prefix for import errors. This must be an empty,
   * existing Cloud Storage directory. Import errors are written to
   * sharded files in this directory, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   *
   * @return Whether the gcsPrefix field is set.
   */
  public boolean hasGcsPrefix() {
    return destinationCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage prefix for import errors. This must be an empty,
   * existing Cloud Storage directory. Import errors are written to
   * sharded files in this directory, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   *
   * @return The gcsPrefix.
   */
  public java.lang.String getGcsPrefix() {
    java.lang.Object ref = "";
    if (destinationCase_ == 1) {
      ref = destination_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (destinationCase_ == 1) {
        destination_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage prefix for import errors. This must be an empty,
   * existing Cloud Storage directory. Import errors are written to
   * sharded files in this directory, one per line, as a JSON-encoded
   * `google.rpc.Status` message.
   * </pre>
   *
   * <code>string gcs_prefix = 1;</code>
   *
   * @return The bytes for gcsPrefix.
   */
  public com.google.protobuf.ByteString getGcsPrefixBytes() {
    java.lang.Object ref = "";
    if (destinationCase_ == 1) {
      ref = destination_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (destinationCase_ == 1) {
        destination_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (destinationCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destination_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destinationCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destination_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.ImportErrorConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.ImportErrorConfig other =
        (com.google.cloud.discoveryengine.v1.ImportErrorConfig) obj;

    if (!getDestinationCase().equals(other.getDestinationCase())) return false;
    switch (destinationCase_) {
      case 1:
        if (!getGcsPrefix().equals(other.getGcsPrefix())) return false;
        break;
      case 0:
      default:
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
    switch (destinationCase_) {
      case 1:
        hash = (37 * hash) + GCS_PREFIX_FIELD_NUMBER;
        hash = (53 * hash) + getGcsPrefix().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig parseFrom(
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
      com.google.cloud.discoveryengine.v1.ImportErrorConfig prototype) {
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
   * Configuration of destination for Import related errors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.ImportErrorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.ImportErrorConfig)
      com.google.cloud.discoveryengine.v1.ImportErrorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.ImportErrorConfig.class,
              com.google.cloud.discoveryengine.v1.ImportErrorConfig.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.ImportErrorConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      destinationCase_ = 0;
      destination_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.ImportConfigProto
          .internal_static_google_cloud_discoveryengine_v1_ImportErrorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ImportErrorConfig getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.ImportErrorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ImportErrorConfig build() {
      com.google.cloud.discoveryengine.v1.ImportErrorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ImportErrorConfig buildPartial() {
      com.google.cloud.discoveryengine.v1.ImportErrorConfig result =
          new com.google.cloud.discoveryengine.v1.ImportErrorConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.ImportErrorConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.discoveryengine.v1.ImportErrorConfig result) {
      result.destinationCase_ = destinationCase_;
      result.destination_ = this.destination_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.ImportErrorConfig) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.ImportErrorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.ImportErrorConfig other) {
      if (other == com.google.cloud.discoveryengine.v1.ImportErrorConfig.getDefaultInstance())
        return this;
      switch (other.getDestinationCase()) {
        case GCS_PREFIX:
          {
            destinationCase_ = 1;
            destination_ = other.destination_;
            onChanged();
            break;
          }
        case DESTINATION_NOT_SET:
          {
            break;
          }
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
                destinationCase_ = 1;
                destination_ = s;
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

    private int destinationCase_ = 0;
    private java.lang.Object destination_;

    public DestinationCase getDestinationCase() {
      return DestinationCase.forNumber(destinationCase_);
    }

    public Builder clearDestination() {
      destinationCase_ = 0;
      destination_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Cloud Storage prefix for import errors. This must be an empty,
     * existing Cloud Storage directory. Import errors are written to
     * sharded files in this directory, one per line, as a JSON-encoded
     * `google.rpc.Status` message.
     * </pre>
     *
     * <code>string gcs_prefix = 1;</code>
     *
     * @return Whether the gcsPrefix field is set.
     */
    @java.lang.Override
    public boolean hasGcsPrefix() {
      return destinationCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage prefix for import errors. This must be an empty,
     * existing Cloud Storage directory. Import errors are written to
     * sharded files in this directory, one per line, as a JSON-encoded
     * `google.rpc.Status` message.
     * </pre>
     *
     * <code>string gcs_prefix = 1;</code>
     *
     * @return The gcsPrefix.
     */
    @java.lang.Override
    public java.lang.String getGcsPrefix() {
      java.lang.Object ref = "";
      if (destinationCase_ == 1) {
        ref = destination_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (destinationCase_ == 1) {
          destination_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage prefix for import errors. This must be an empty,
     * existing Cloud Storage directory. Import errors are written to
     * sharded files in this directory, one per line, as a JSON-encoded
     * `google.rpc.Status` message.
     * </pre>
     *
     * <code>string gcs_prefix = 1;</code>
     *
     * @return The bytes for gcsPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getGcsPrefixBytes() {
      java.lang.Object ref = "";
      if (destinationCase_ == 1) {
        ref = destination_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (destinationCase_ == 1) {
          destination_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage prefix for import errors. This must be an empty,
     * existing Cloud Storage directory. Import errors are written to
     * sharded files in this directory, one per line, as a JSON-encoded
     * `google.rpc.Status` message.
     * </pre>
     *
     * <code>string gcs_prefix = 1;</code>
     *
     * @param value The gcsPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPrefix(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationCase_ = 1;
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage prefix for import errors. This must be an empty,
     * existing Cloud Storage directory. Import errors are written to
     * sharded files in this directory, one per line, as a JSON-encoded
     * `google.rpc.Status` message.
     * </pre>
     *
     * <code>string gcs_prefix = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGcsPrefix() {
      if (destinationCase_ == 1) {
        destinationCase_ = 0;
        destination_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage prefix for import errors. This must be an empty,
     * existing Cloud Storage directory. Import errors are written to
     * sharded files in this directory, one per line, as a JSON-encoded
     * `google.rpc.Status` message.
     * </pre>
     *
     * <code>string gcs_prefix = 1;</code>
     *
     * @param value The bytes for gcsPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPrefixBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationCase_ = 1;
      destination_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.ImportErrorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.ImportErrorConfig)
  private static final com.google.cloud.discoveryengine.v1.ImportErrorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.ImportErrorConfig();
  }

  public static com.google.cloud.discoveryengine.v1.ImportErrorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportErrorConfig> PARSER =
      new com.google.protobuf.AbstractParser<ImportErrorConfig>() {
        @java.lang.Override
        public ImportErrorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportErrorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportErrorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.ImportErrorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
