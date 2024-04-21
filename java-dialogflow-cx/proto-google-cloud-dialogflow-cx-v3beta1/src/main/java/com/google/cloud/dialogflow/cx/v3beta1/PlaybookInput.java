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
// source: google/cloud/dialogflow/cx/v3beta1/example.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * Input of the playbook.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.PlaybookInput}
 */
public final class PlaybookInput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.PlaybookInput)
    PlaybookInputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PlaybookInput.newBuilder() to construct.
  private PlaybookInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PlaybookInput() {
    precedingConversationSummary_ = "";
    parameters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PlaybookInput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.ExampleProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_PlaybookInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.ExampleProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_PlaybookInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.class,
            com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.Builder.class);
  }

  public static final int PRECEDING_CONVERSATION_SUMMARY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object precedingConversationSummary_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Summary string of the preceding conversation for the child
   * playbook invocation.
   * </pre>
   *
   * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The precedingConversationSummary.
   */
  @java.lang.Override
  public java.lang.String getPrecedingConversationSummary() {
    java.lang.Object ref = precedingConversationSummary_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      precedingConversationSummary_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Summary string of the preceding conversation for the child
   * playbook invocation.
   * </pre>
   *
   * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for precedingConversationSummary.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrecedingConversationSummaryBytes() {
    java.lang.Object ref = precedingConversationSummary_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      precedingConversationSummary_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter> parameters_;
  /**
   *
   *
   * <pre>
   * Optional. A list of input parameters for the invocation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter>
      getParametersList() {
    return parameters_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of input parameters for the invocation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>
      getParametersOrBuilderList() {
    return parameters_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of input parameters for the invocation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public int getParametersCount() {
    return parameters_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of input parameters for the invocation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ActionParameter getParameters(int index) {
    return parameters_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. A list of input parameters for the invocation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder getParametersOrBuilder(
      int index) {
    return parameters_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(precedingConversationSummary_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, precedingConversationSummary_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      output.writeMessage(2, parameters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(precedingConversationSummary_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              1, precedingConversationSummary_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, parameters_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput other =
        (com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput) obj;

    if (!getPrecedingConversationSummary().equals(other.getPrecedingConversationSummary()))
      return false;
    if (!getParametersList().equals(other.getParametersList())) return false;
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
    hash = (37 * hash) + PRECEDING_CONVERSATION_SUMMARY_FIELD_NUMBER;
    hash = (53 * hash) + getPrecedingConversationSummary().hashCode();
    if (getParametersCount() > 0) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParametersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput prototype) {
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
   * Input of the playbook.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.PlaybookInput}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.PlaybookInput)
      com.google.cloud.dialogflow.cx.v3beta1.PlaybookInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExampleProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_PlaybookInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExampleProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_PlaybookInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.class,
              com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      precedingConversationSummary_ = "";
      if (parametersBuilder_ == null) {
        parameters_ = java.util.Collections.emptyList();
      } else {
        parameters_ = null;
        parametersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExampleProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_PlaybookInput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput build() {
      com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput result =
          new com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput result) {
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          parameters_ = java.util.Collections.unmodifiableList(parameters_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parameters_ = parameters_;
      } else {
        result.parameters_ = parametersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.precedingConversationSummary_ = precedingConversationSummary_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput.getDefaultInstance())
        return this;
      if (!other.getPrecedingConversationSummary().isEmpty()) {
        precedingConversationSummary_ = other.precedingConversationSummary_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (parametersBuilder_ == null) {
        if (!other.parameters_.isEmpty()) {
          if (parameters_.isEmpty()) {
            parameters_ = other.parameters_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParametersIsMutable();
            parameters_.addAll(other.parameters_);
          }
          onChanged();
        }
      } else {
        if (!other.parameters_.isEmpty()) {
          if (parametersBuilder_.isEmpty()) {
            parametersBuilder_.dispose();
            parametersBuilder_ = null;
            parameters_ = other.parameters_;
            bitField0_ = (bitField0_ & ~0x00000002);
            parametersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getParametersFieldBuilder()
                    : null;
          } else {
            parametersBuilder_.addAllMessages(other.parameters_);
          }
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
                precedingConversationSummary_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.dialogflow.cx.v3beta1.ActionParameter m =
                    input.readMessage(
                        com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.parser(),
                        extensionRegistry);
                if (parametersBuilder_ == null) {
                  ensureParametersIsMutable();
                  parameters_.add(m);
                } else {
                  parametersBuilder_.addMessage(m);
                }
                break;
              } // case 18
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

    private java.lang.Object precedingConversationSummary_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Summary string of the preceding conversation for the child
     * playbook invocation.
     * </pre>
     *
     * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The precedingConversationSummary.
     */
    public java.lang.String getPrecedingConversationSummary() {
      java.lang.Object ref = precedingConversationSummary_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        precedingConversationSummary_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Summary string of the preceding conversation for the child
     * playbook invocation.
     * </pre>
     *
     * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The bytes for precedingConversationSummary.
     */
    public com.google.protobuf.ByteString getPrecedingConversationSummaryBytes() {
      java.lang.Object ref = precedingConversationSummary_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        precedingConversationSummary_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Summary string of the preceding conversation for the child
     * playbook invocation.
     * </pre>
     *
     * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The precedingConversationSummary to set.
     * @return This builder for chaining.
     */
    public Builder setPrecedingConversationSummary(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      precedingConversationSummary_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Summary string of the preceding conversation for the child
     * playbook invocation.
     * </pre>
     *
     * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrecedingConversationSummary() {
      precedingConversationSummary_ = getDefaultInstance().getPrecedingConversationSummary();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Summary string of the preceding conversation for the child
     * playbook invocation.
     * </pre>
     *
     * <code>string preceding_conversation_summary = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The bytes for precedingConversationSummary to set.
     * @return This builder for chaining.
     */
    public Builder setPrecedingConversationSummaryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      precedingConversationSummary_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter> parameters_ =
        java.util.Collections.emptyList();

    private void ensureParametersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        parameters_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter>(
                parameters_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.ActionParameter,
            com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>
        parametersBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter>
        getParametersList() {
      if (parametersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parameters_);
      } else {
        return parametersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public int getParametersCount() {
      if (parametersBuilder_ == null) {
        return parameters_.size();
      } else {
        return parametersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ActionParameter getParameters(int index) {
      if (parametersBuilder_ == null) {
        return parameters_.get(index);
      } else {
        return parametersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setParameters(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ActionParameter value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.set(index, value);
        onChanged();
      } else {
        parametersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setParameters(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.set(index, builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addParameters(com.google.cloud.dialogflow.cx.v3beta1.ActionParameter value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.add(value);
        onChanged();
      } else {
        parametersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addParameters(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ActionParameter value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParametersIsMutable();
        parameters_.add(index, value);
        onChanged();
      } else {
        parametersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addParameters(
        com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.add(builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addParameters(
        int index, com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.add(index, builderForValue.build());
        onChanged();
      } else {
        parametersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addAllParameters(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.ActionParameter>
            values) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, parameters_);
        onChanged();
      } else {
        parametersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearParameters() {
      if (parametersBuilder_ == null) {
        parameters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        parametersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder removeParameters(int index) {
      if (parametersBuilder_ == null) {
        ensureParametersIsMutable();
        parameters_.remove(index);
        onChanged();
      } else {
        parametersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder getParametersBuilder(
        int index) {
      return getParametersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder getParametersOrBuilder(
        int index) {
      if (parametersBuilder_ == null) {
        return parameters_.get(index);
      } else {
        return parametersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>
        getParametersOrBuilderList() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parameters_);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder addParametersBuilder() {
      return getParametersFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder addParametersBuilder(
        int index) {
      return getParametersFieldBuilder()
          .addBuilder(
              index, com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Optional. A list of input parameters for the invocation.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3beta1.ActionParameter parameters = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder>
        getParametersBuilderList() {
      return getParametersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.ActionParameter,
            com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3beta1.ActionParameter,
                com.google.cloud.dialogflow.cx.v3beta1.ActionParameter.Builder,
                com.google.cloud.dialogflow.cx.v3beta1.ActionParameterOrBuilder>(
                parameters_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.PlaybookInput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.PlaybookInput)
  private static final com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlaybookInput> PARSER =
      new com.google.protobuf.AbstractParser<PlaybookInput>() {
        @java.lang.Override
        public PlaybookInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlaybookInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlaybookInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.PlaybookInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
