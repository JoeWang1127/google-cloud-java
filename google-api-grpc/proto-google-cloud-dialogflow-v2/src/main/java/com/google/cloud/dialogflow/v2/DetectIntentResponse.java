// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The message returned from the DetectIntent method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.DetectIntentResponse}
 */
public  final class DetectIntentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.DetectIntentResponse)
    DetectIntentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DetectIntentResponse.newBuilder() to construct.
  private DetectIntentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DetectIntentResponse() {
    responseId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DetectIntentResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            responseId_ = s;
            break;
          }
          case 18: {
            com.google.cloud.dialogflow.v2.QueryResult.Builder subBuilder = null;
            if (queryResult_ != null) {
              subBuilder = queryResult_.toBuilder();
            }
            queryResult_ = input.readMessage(com.google.cloud.dialogflow.v2.QueryResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(queryResult_);
              queryResult_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.rpc.Status.Builder subBuilder = null;
            if (webhookStatus_ != null) {
              subBuilder = webhookStatus_.toBuilder();
            }
            webhookStatus_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(webhookStatus_);
              webhookStatus_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.SessionProto.internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionProto.internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.DetectIntentResponse.class, com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder.class);
  }

  public static final int RESPONSE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object responseId_;
  /**
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   */
  public java.lang.String getResponseId() {
    java.lang.Object ref = responseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResponseIdBytes() {
    java.lang.Object ref = responseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_RESULT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.QueryResult queryResult_;
  /**
   * <pre>
   * The results of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
   */
  public boolean hasQueryResult() {
    return queryResult_ != null;
  }
  /**
   * <pre>
   * The results of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
   */
  public com.google.cloud.dialogflow.v2.QueryResult getQueryResult() {
    return queryResult_ == null ? com.google.cloud.dialogflow.v2.QueryResult.getDefaultInstance() : queryResult_;
  }
  /**
   * <pre>
   * The results of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
   */
  public com.google.cloud.dialogflow.v2.QueryResultOrBuilder getQueryResultOrBuilder() {
    return getQueryResult();
  }

  public static final int WEBHOOK_STATUS_FIELD_NUMBER = 3;
  private com.google.rpc.Status webhookStatus_;
  /**
   * <pre>
   * Specifies the status of the webhook request. `webhook_status`
   * is never populated in webhook requests.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 3;</code>
   */
  public boolean hasWebhookStatus() {
    return webhookStatus_ != null;
  }
  /**
   * <pre>
   * Specifies the status of the webhook request. `webhook_status`
   * is never populated in webhook requests.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 3;</code>
   */
  public com.google.rpc.Status getWebhookStatus() {
    return webhookStatus_ == null ? com.google.rpc.Status.getDefaultInstance() : webhookStatus_;
  }
  /**
   * <pre>
   * Specifies the status of the webhook request. `webhook_status`
   * is never populated in webhook requests.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 3;</code>
   */
  public com.google.rpc.StatusOrBuilder getWebhookStatusOrBuilder() {
    return getWebhookStatus();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResponseIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseId_);
    }
    if (queryResult_ != null) {
      output.writeMessage(2, getQueryResult());
    }
    if (webhookStatus_ != null) {
      output.writeMessage(3, getWebhookStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResponseIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseId_);
    }
    if (queryResult_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQueryResult());
    }
    if (webhookStatus_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getWebhookStatus());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.DetectIntentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.DetectIntentResponse other = (com.google.cloud.dialogflow.v2.DetectIntentResponse) obj;

    boolean result = true;
    result = result && getResponseId()
        .equals(other.getResponseId());
    result = result && (hasQueryResult() == other.hasQueryResult());
    if (hasQueryResult()) {
      result = result && getQueryResult()
          .equals(other.getQueryResult());
    }
    result = result && (hasWebhookStatus() == other.hasWebhookStatus());
    if (hasWebhookStatus()) {
      result = result && getWebhookStatus()
          .equals(other.getWebhookStatus());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResponseId().hashCode();
    if (hasQueryResult()) {
      hash = (37 * hash) + QUERY_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getQueryResult().hashCode();
    }
    if (hasWebhookStatus()) {
      hash = (37 * hash) + WEBHOOK_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getWebhookStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.DetectIntentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.DetectIntentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The message returned from the DetectIntent method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.DetectIntentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.DetectIntentResponse)
      com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionProto.internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionProto.internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.DetectIntentResponse.class, com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.DetectIntentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      responseId_ = "";

      if (queryResultBuilder_ == null) {
        queryResult_ = null;
      } else {
        queryResult_ = null;
        queryResultBuilder_ = null;
      }
      if (webhookStatusBuilder_ == null) {
        webhookStatus_ = null;
      } else {
        webhookStatus_ = null;
        webhookStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.SessionProto.internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.DetectIntentResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.DetectIntentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.DetectIntentResponse build() {
      com.google.cloud.dialogflow.v2.DetectIntentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.DetectIntentResponse buildPartial() {
      com.google.cloud.dialogflow.v2.DetectIntentResponse result = new com.google.cloud.dialogflow.v2.DetectIntentResponse(this);
      result.responseId_ = responseId_;
      if (queryResultBuilder_ == null) {
        result.queryResult_ = queryResult_;
      } else {
        result.queryResult_ = queryResultBuilder_.build();
      }
      if (webhookStatusBuilder_ == null) {
        result.webhookStatus_ = webhookStatus_;
      } else {
        result.webhookStatus_ = webhookStatusBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.DetectIntentResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.DetectIntentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.DetectIntentResponse other) {
      if (other == com.google.cloud.dialogflow.v2.DetectIntentResponse.getDefaultInstance()) return this;
      if (!other.getResponseId().isEmpty()) {
        responseId_ = other.responseId_;
        onChanged();
      }
      if (other.hasQueryResult()) {
        mergeQueryResult(other.getQueryResult());
      }
      if (other.hasWebhookStatus()) {
        mergeWebhookStatus(other.getWebhookStatus());
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
      com.google.cloud.dialogflow.v2.DetectIntentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.DetectIntentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object responseId_ = "";
    /**
     * <pre>
     * The unique identifier of the response. It can be used to
     * locate a response in the training example set or for reporting issues.
     * </pre>
     *
     * <code>string response_id = 1;</code>
     */
    public java.lang.String getResponseId() {
      java.lang.Object ref = responseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of the response. It can be used to
     * locate a response in the training example set or for reporting issues.
     * </pre>
     *
     * <code>string response_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResponseIdBytes() {
      java.lang.Object ref = responseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of the response. It can be used to
     * locate a response in the training example set or for reporting issues.
     * </pre>
     *
     * <code>string response_id = 1;</code>
     */
    public Builder setResponseId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the response. It can be used to
     * locate a response in the training example set or for reporting issues.
     * </pre>
     *
     * <code>string response_id = 1;</code>
     */
    public Builder clearResponseId() {
      
      responseId_ = getDefaultInstance().getResponseId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the response. It can be used to
     * locate a response in the training example set or for reporting issues.
     * </pre>
     *
     * <code>string response_id = 1;</code>
     */
    public Builder setResponseIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.QueryResult queryResult_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.QueryResult, com.google.cloud.dialogflow.v2.QueryResult.Builder, com.google.cloud.dialogflow.v2.QueryResultOrBuilder> queryResultBuilder_;
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public boolean hasQueryResult() {
      return queryResultBuilder_ != null || queryResult_ != null;
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.QueryResult getQueryResult() {
      if (queryResultBuilder_ == null) {
        return queryResult_ == null ? com.google.cloud.dialogflow.v2.QueryResult.getDefaultInstance() : queryResult_;
      } else {
        return queryResultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public Builder setQueryResult(com.google.cloud.dialogflow.v2.QueryResult value) {
      if (queryResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryResult_ = value;
        onChanged();
      } else {
        queryResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public Builder setQueryResult(
        com.google.cloud.dialogflow.v2.QueryResult.Builder builderForValue) {
      if (queryResultBuilder_ == null) {
        queryResult_ = builderForValue.build();
        onChanged();
      } else {
        queryResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public Builder mergeQueryResult(com.google.cloud.dialogflow.v2.QueryResult value) {
      if (queryResultBuilder_ == null) {
        if (queryResult_ != null) {
          queryResult_ =
            com.google.cloud.dialogflow.v2.QueryResult.newBuilder(queryResult_).mergeFrom(value).buildPartial();
        } else {
          queryResult_ = value;
        }
        onChanged();
      } else {
        queryResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public Builder clearQueryResult() {
      if (queryResultBuilder_ == null) {
        queryResult_ = null;
        onChanged();
      } else {
        queryResult_ = null;
        queryResultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.QueryResult.Builder getQueryResultBuilder() {
      
      onChanged();
      return getQueryResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.QueryResultOrBuilder getQueryResultOrBuilder() {
      if (queryResultBuilder_ != null) {
        return queryResultBuilder_.getMessageOrBuilder();
      } else {
        return queryResult_ == null ?
            com.google.cloud.dialogflow.v2.QueryResult.getDefaultInstance() : queryResult_;
      }
    }
    /**
     * <pre>
     * The results of the conversational query or event processing.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.QueryResult, com.google.cloud.dialogflow.v2.QueryResult.Builder, com.google.cloud.dialogflow.v2.QueryResultOrBuilder> 
        getQueryResultFieldBuilder() {
      if (queryResultBuilder_ == null) {
        queryResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.QueryResult, com.google.cloud.dialogflow.v2.QueryResult.Builder, com.google.cloud.dialogflow.v2.QueryResultOrBuilder>(
                getQueryResult(),
                getParentForChildren(),
                isClean());
        queryResult_ = null;
      }
      return queryResultBuilder_;
    }

    private com.google.rpc.Status webhookStatus_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> webhookStatusBuilder_;
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public boolean hasWebhookStatus() {
      return webhookStatusBuilder_ != null || webhookStatus_ != null;
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public com.google.rpc.Status getWebhookStatus() {
      if (webhookStatusBuilder_ == null) {
        return webhookStatus_ == null ? com.google.rpc.Status.getDefaultInstance() : webhookStatus_;
      } else {
        return webhookStatusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public Builder setWebhookStatus(com.google.rpc.Status value) {
      if (webhookStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webhookStatus_ = value;
        onChanged();
      } else {
        webhookStatusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public Builder setWebhookStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (webhookStatusBuilder_ == null) {
        webhookStatus_ = builderForValue.build();
        onChanged();
      } else {
        webhookStatusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public Builder mergeWebhookStatus(com.google.rpc.Status value) {
      if (webhookStatusBuilder_ == null) {
        if (webhookStatus_ != null) {
          webhookStatus_ =
            com.google.rpc.Status.newBuilder(webhookStatus_).mergeFrom(value).buildPartial();
        } else {
          webhookStatus_ = value;
        }
        onChanged();
      } else {
        webhookStatusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public Builder clearWebhookStatus() {
      if (webhookStatusBuilder_ == null) {
        webhookStatus_ = null;
        onChanged();
      } else {
        webhookStatus_ = null;
        webhookStatusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public com.google.rpc.Status.Builder getWebhookStatusBuilder() {
      
      onChanged();
      return getWebhookStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    public com.google.rpc.StatusOrBuilder getWebhookStatusOrBuilder() {
      if (webhookStatusBuilder_ != null) {
        return webhookStatusBuilder_.getMessageOrBuilder();
      } else {
        return webhookStatus_ == null ?
            com.google.rpc.Status.getDefaultInstance() : webhookStatus_;
      }
    }
    /**
     * <pre>
     * Specifies the status of the webhook request. `webhook_status`
     * is never populated in webhook requests.
     * </pre>
     *
     * <code>.google.rpc.Status webhook_status = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getWebhookStatusFieldBuilder() {
      if (webhookStatusBuilder_ == null) {
        webhookStatusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getWebhookStatus(),
                getParentForChildren(),
                isClean());
        webhookStatus_ = null;
      }
      return webhookStatusBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.DetectIntentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.DetectIntentResponse)
  private static final com.google.cloud.dialogflow.v2.DetectIntentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.DetectIntentResponse();
  }

  public static com.google.cloud.dialogflow.v2.DetectIntentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DetectIntentResponse>
      PARSER = new com.google.protobuf.AbstractParser<DetectIntentResponse>() {
    @java.lang.Override
    public DetectIntentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DetectIntentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DetectIntentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetectIntentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.DetectIntentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

