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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * Indicates a location in the source code of the service for which errors are
 * reported. `functionName` must be provided by the application when reporting
 * an error, unless the error report contains a `message` with a supported
 * exception stack trace. All fields are optional for the later case.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.SourceLocation}
 */
public final class SourceLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
    SourceLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceLocation.newBuilder() to construct.
  private SourceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceLocation() {
    filePath_ = "";
    functionName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.class,
            com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.Builder.class);
  }

  public static final int FILE_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filePath_ = "";
  /**
   *
   *
   * <pre>
   * The source code filename, which can include a truncated relative
   * path, or a full path from a production machine.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The filePath.
   */
  @java.lang.Override
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The source code filename, which can include a truncated relative
   * path, or a full path from a production machine.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The bytes for filePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_NUMBER_FIELD_NUMBER = 2;
  private int lineNumber_ = 0;
  /**
   *
   *
   * <pre>
   * 1-based. 0 indicates that the line number is unknown.
   * </pre>
   *
   * <code>int32 line_number = 2;</code>
   *
   * @return The lineNumber.
   */
  @java.lang.Override
  public int getLineNumber() {
    return lineNumber_;
  }

  public static final int FUNCTION_NAME_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object functionName_ = "";
  /**
   *
   *
   * <pre>
   * Human-readable name of a function or method.
   * The value can include optional context like the class or package name.
   * For example, `my.package.MyClass.method` in case of Java.
   * </pre>
   *
   * <code>string function_name = 4;</code>
   *
   * @return The functionName.
   */
  @java.lang.Override
  public java.lang.String getFunctionName() {
    java.lang.Object ref = functionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      functionName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human-readable name of a function or method.
   * The value can include optional context like the class or package name.
   * For example, `my.package.MyClass.method` in case of Java.
   * </pre>
   *
   * <code>string function_name = 4;</code>
   *
   * @return The bytes for functionName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFunctionNameBytes() {
    java.lang.Object ref = functionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      functionName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePath_);
    }
    if (lineNumber_ != 0) {
      output.writeInt32(2, lineNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(functionName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, functionName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePath_);
    }
    if (lineNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, lineNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(functionName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, functionName_);
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.SourceLocation)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.SourceLocation other =
        (com.google.devtools.clouderrorreporting.v1beta1.SourceLocation) obj;

    if (!getFilePath().equals(other.getFilePath())) return false;
    if (getLineNumber() != other.getLineNumber()) return false;
    if (!getFunctionName().equals(other.getFunctionName())) return false;
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
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    hash = (37 * hash) + LINE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getLineNumber();
    hash = (37 * hash) + FUNCTION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFunctionName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
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
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation prototype) {
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
   * Indicates a location in the source code of the service for which errors are
   * reported. `functionName` must be provided by the application when reporting
   * an error, unless the error report contains a `message` with a supported
   * exception stack trace. All fields are optional for the later case.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.SourceLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.class,
              com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filePath_ = "";
      lineNumber_ = 0;
      functionName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
        getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation build() {
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation result =
          new com.google.devtools.clouderrorreporting.v1beta1.SourceLocation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.clouderrorreporting.v1beta1.SourceLocation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filePath_ = filePath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lineNumber_ = lineNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.functionName_ = functionName_;
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.SourceLocation) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.SourceLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.SourceLocation other) {
      if (other
          == com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.getDefaultInstance())
        return this;
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getLineNumber() != 0) {
        setLineNumber(other.getLineNumber());
      }
      if (!other.getFunctionName().isEmpty()) {
        functionName_ = other.functionName_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                filePath_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                lineNumber_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 34:
              {
                functionName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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

    private java.lang.Object filePath_ = "";
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @return The filePath.
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @return The bytes for filePath.
     */
    public com.google.protobuf.ByteString getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @param value The filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilePath() {
      filePath_ = getDefaultInstance().getFilePath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     *
     * @param value The bytes for filePath to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int lineNumber_;
    /**
     *
     *
     * <pre>
     * 1-based. 0 indicates that the line number is unknown.
     * </pre>
     *
     * <code>int32 line_number = 2;</code>
     *
     * @return The lineNumber.
     */
    @java.lang.Override
    public int getLineNumber() {
      return lineNumber_;
    }
    /**
     *
     *
     * <pre>
     * 1-based. 0 indicates that the line number is unknown.
     * </pre>
     *
     * <code>int32 line_number = 2;</code>
     *
     * @param value The lineNumber to set.
     * @return This builder for chaining.
     */
    public Builder setLineNumber(int value) {

      lineNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * 1-based. 0 indicates that the line number is unknown.
     * </pre>
     *
     * <code>int32 line_number = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLineNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lineNumber_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object functionName_ = "";
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     *
     * @return The functionName.
     */
    public java.lang.String getFunctionName() {
      java.lang.Object ref = functionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     *
     * @return The bytes for functionName.
     */
    public com.google.protobuf.ByteString getFunctionNameBytes() {
      java.lang.Object ref = functionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        functionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     *
     * @param value The functionName to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      functionName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFunctionName() {
      functionName_ = getDefaultInstance().getFunctionName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     *
     * @param value The bytes for functionName to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      functionName_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
  private static final com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.SourceLocation();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceLocation> PARSER =
      new com.google.protobuf.AbstractParser<SourceLocation>() {
        @java.lang.Override
        public SourceLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
