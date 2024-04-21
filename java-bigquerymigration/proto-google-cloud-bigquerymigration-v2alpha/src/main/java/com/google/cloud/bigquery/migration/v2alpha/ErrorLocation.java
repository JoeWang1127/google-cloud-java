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
// source: google/cloud/bigquery/migration/v2alpha/migration_error_details.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.migration.v2alpha;

/**
 *
 *
 * <pre>
 * Holds information about where the error is located.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.ErrorLocation}
 */
public final class ErrorLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.ErrorLocation)
    ErrorLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ErrorLocation.newBuilder() to construct.
  private ErrorLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ErrorLocation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ErrorLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.class,
            com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder.class);
  }

  public static final int LINE_FIELD_NUMBER = 1;
  private int line_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. If applicable, denotes the line where the error occurred. A zero value
   * means that there is no line information.
   * </pre>
   *
   * <code>int32 line = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The line.
   */
  @java.lang.Override
  public int getLine() {
    return line_;
  }

  public static final int COLUMN_FIELD_NUMBER = 2;
  private int column_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. If applicable, denotes the column where the error occurred. A zero value
   * means that there is no columns information.
   * </pre>
   *
   * <code>int32 column = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The column.
   */
  @java.lang.Override
  public int getColumn() {
    return column_;
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
    if (line_ != 0) {
      output.writeInt32(1, line_);
    }
    if (column_ != 0) {
      output.writeInt32(2, column_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (line_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, line_);
    }
    if (column_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, column_);
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.ErrorLocation)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.ErrorLocation other =
        (com.google.cloud.bigquery.migration.v2alpha.ErrorLocation) obj;

    if (getLine() != other.getLine()) return false;
    if (getColumn() != other.getColumn()) return false;
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
    hash = (37 * hash) + LINE_FIELD_NUMBER;
    hash = (53 * hash) + getLine();
    hash = (37 * hash) + COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getColumn();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation parseFrom(
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
      com.google.cloud.bigquery.migration.v2alpha.ErrorLocation prototype) {
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
   * Holds information about where the error is located.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.ErrorLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.ErrorLocation)
      com.google.cloud.bigquery.migration.v2alpha.ErrorLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.class,
              com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      line_ = 0;
      column_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_ErrorLocation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation build() {
      com.google.cloud.bigquery.migration.v2alpha.ErrorLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.ErrorLocation result =
          new com.google.cloud.bigquery.migration.v2alpha.ErrorLocation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.migration.v2alpha.ErrorLocation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.line_ = line_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.column_ = column_;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.ErrorLocation) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.ErrorLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2alpha.ErrorLocation other) {
      if (other == com.google.cloud.bigquery.migration.v2alpha.ErrorLocation.getDefaultInstance())
        return this;
      if (other.getLine() != 0) {
        setLine(other.getLine());
      }
      if (other.getColumn() != 0) {
        setColumn(other.getColumn());
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
                line_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                column_ = input.readInt32();
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

    private int line_;
    /**
     *
     *
     * <pre>
     * Optional. If applicable, denotes the line where the error occurred. A zero value
     * means that there is no line information.
     * </pre>
     *
     * <code>int32 line = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The line.
     */
    @java.lang.Override
    public int getLine() {
      return line_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If applicable, denotes the line where the error occurred. A zero value
     * means that there is no line information.
     * </pre>
     *
     * <code>int32 line = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The line to set.
     * @return This builder for chaining.
     */
    public Builder setLine(int value) {

      line_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If applicable, denotes the line where the error occurred. A zero value
     * means that there is no line information.
     * </pre>
     *
     * <code>int32 line = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLine() {
      bitField0_ = (bitField0_ & ~0x00000001);
      line_ = 0;
      onChanged();
      return this;
    }

    private int column_;
    /**
     *
     *
     * <pre>
     * Optional. If applicable, denotes the column where the error occurred. A zero value
     * means that there is no columns information.
     * </pre>
     *
     * <code>int32 column = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The column.
     */
    @java.lang.Override
    public int getColumn() {
      return column_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If applicable, denotes the column where the error occurred. A zero value
     * means that there is no columns information.
     * </pre>
     *
     * <code>int32 column = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(int value) {

      column_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If applicable, denotes the column where the error occurred. A zero value
     * means that there is no columns information.
     * </pre>
     *
     * <code>int32 column = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColumn() {
      bitField0_ = (bitField0_ & ~0x00000002);
      column_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.ErrorLocation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.ErrorLocation)
  private static final com.google.cloud.bigquery.migration.v2alpha.ErrorLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.ErrorLocation();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ErrorLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorLocation> PARSER =
      new com.google.protobuf.AbstractParser<ErrorLocation>() {
        @java.lang.Override
        public ErrorLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.ErrorLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
