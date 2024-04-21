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
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.security.privateca.v1;

/**
 *
 *
 * <pre>
 * An [ObjectId][google.cloud.security.privateca.v1.ObjectId] specifies an
 * object identifier (OID). These provide context and describe types in ASN.1
 * messages.
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.privateca.v1.ObjectId}
 */
public final class ObjectId extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.privateca.v1.ObjectId)
    ObjectIdOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ObjectId.newBuilder() to construct.
  private ObjectId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ObjectId() {
    objectIdPath_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ObjectId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
        .internal_static_google_cloud_security_privateca_v1_ObjectId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
        .internal_static_google_cloud_security_privateca_v1_ObjectId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.privateca.v1.ObjectId.class,
            com.google.cloud.security.privateca.v1.ObjectId.Builder.class);
  }

  public static final int OBJECT_ID_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList objectIdPath_ = emptyIntList();
  /**
   *
   *
   * <pre>
   * Required. The parts of an OID path. The most significant parts of the path
   * come first.
   * </pre>
   *
   * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the objectIdPath.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getObjectIdPathList() {
    return objectIdPath_;
  }
  /**
   *
   *
   * <pre>
   * Required. The parts of an OID path. The most significant parts of the path
   * come first.
   * </pre>
   *
   * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of objectIdPath.
   */
  public int getObjectIdPathCount() {
    return objectIdPath_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The parts of an OID path. The most significant parts of the path
   * come first.
   * </pre>
   *
   * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The objectIdPath at the given index.
   */
  public int getObjectIdPath(int index) {
    return objectIdPath_.getInt(index);
  }

  private int objectIdPathMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getObjectIdPathList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(objectIdPathMemoizedSerializedSize);
    }
    for (int i = 0; i < objectIdPath_.size(); i++) {
      output.writeInt32NoTag(objectIdPath_.getInt(i));
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
      for (int i = 0; i < objectIdPath_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(objectIdPath_.getInt(i));
      }
      size += dataSize;
      if (!getObjectIdPathList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      objectIdPathMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.security.privateca.v1.ObjectId)) {
      return super.equals(obj);
    }
    com.google.cloud.security.privateca.v1.ObjectId other =
        (com.google.cloud.security.privateca.v1.ObjectId) obj;

    if (!getObjectIdPathList().equals(other.getObjectIdPathList())) return false;
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
    if (getObjectIdPathCount() > 0) {
      hash = (37 * hash) + OBJECT_ID_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getObjectIdPathList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.privateca.v1.ObjectId parseFrom(
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

  public static Builder newBuilder(com.google.cloud.security.privateca.v1.ObjectId prototype) {
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
   * An [ObjectId][google.cloud.security.privateca.v1.ObjectId] specifies an
   * object identifier (OID). These provide context and describe types in ASN.1
   * messages.
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.privateca.v1.ObjectId}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.privateca.v1.ObjectId)
      com.google.cloud.security.privateca.v1.ObjectIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1_ObjectId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1_ObjectId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.privateca.v1.ObjectId.class,
              com.google.cloud.security.privateca.v1.ObjectId.Builder.class);
    }

    // Construct using com.google.cloud.security.privateca.v1.ObjectId.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objectIdPath_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.privateca.v1.PrivateCaResourcesProto
          .internal_static_google_cloud_security_privateca_v1_ObjectId_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.ObjectId getDefaultInstanceForType() {
      return com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.ObjectId build() {
      com.google.cloud.security.privateca.v1.ObjectId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.privateca.v1.ObjectId buildPartial() {
      com.google.cloud.security.privateca.v1.ObjectId result =
          new com.google.cloud.security.privateca.v1.ObjectId(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.security.privateca.v1.ObjectId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        objectIdPath_.makeImmutable();
        result.objectIdPath_ = objectIdPath_;
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
      if (other instanceof com.google.cloud.security.privateca.v1.ObjectId) {
        return mergeFrom((com.google.cloud.security.privateca.v1.ObjectId) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.security.privateca.v1.ObjectId other) {
      if (other == com.google.cloud.security.privateca.v1.ObjectId.getDefaultInstance())
        return this;
      if (!other.objectIdPath_.isEmpty()) {
        if (objectIdPath_.isEmpty()) {
          objectIdPath_ = other.objectIdPath_;
          objectIdPath_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureObjectIdPathIsMutable();
          objectIdPath_.addAll(other.objectIdPath_);
        }
        onChanged();
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
                int v = input.readInt32();
                ensureObjectIdPathIsMutable();
                objectIdPath_.addInt(v);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureObjectIdPathIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  objectIdPath_.addInt(input.readInt32());
                }
                input.popLimit(limit);
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

    private com.google.protobuf.Internal.IntList objectIdPath_ = emptyIntList();

    private void ensureObjectIdPathIsMutable() {
      if (!objectIdPath_.isModifiable()) {
        objectIdPath_ = makeMutableCopy(objectIdPath_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the objectIdPath.
     */
    public java.util.List<java.lang.Integer> getObjectIdPathList() {
      objectIdPath_.makeImmutable();
      return objectIdPath_;
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of objectIdPath.
     */
    public int getObjectIdPathCount() {
      return objectIdPath_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The objectIdPath at the given index.
     */
    public int getObjectIdPath(int index) {
      return objectIdPath_.getInt(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The objectIdPath to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdPath(int index, int value) {

      ensureObjectIdPathIsMutable();
      objectIdPath_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The objectIdPath to add.
     * @return This builder for chaining.
     */
    public Builder addObjectIdPath(int value) {

      ensureObjectIdPathIsMutable();
      objectIdPath_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The objectIdPath to add.
     * @return This builder for chaining.
     */
    public Builder addAllObjectIdPath(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureObjectIdPathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, objectIdPath_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parts of an OID path. The most significant parts of the path
     * come first.
     * </pre>
     *
     * <code>repeated int32 object_id_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearObjectIdPath() {
      objectIdPath_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.privateca.v1.ObjectId)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.privateca.v1.ObjectId)
  private static final com.google.cloud.security.privateca.v1.ObjectId DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.security.privateca.v1.ObjectId();
  }

  public static com.google.cloud.security.privateca.v1.ObjectId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectId> PARSER =
      new com.google.protobuf.AbstractParser<ObjectId>() {
        @java.lang.Override
        public ObjectId parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.privateca.v1.ObjectId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
