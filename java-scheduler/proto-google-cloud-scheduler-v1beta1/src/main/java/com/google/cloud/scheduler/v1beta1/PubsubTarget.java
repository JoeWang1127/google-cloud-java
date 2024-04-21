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
// source: google/cloud/scheduler/v1beta1/target.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.scheduler.v1beta1;

/**
 *
 *
 * <pre>
 * Pub/Sub target. The job will be delivered by publishing a message to
 * the given Pub/Sub topic.
 * </pre>
 *
 * Protobuf type {@code google.cloud.scheduler.v1beta1.PubsubTarget}
 */
public final class PubsubTarget extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.scheduler.v1beta1.PubsubTarget)
    PubsubTargetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PubsubTarget.newBuilder() to construct.
  private PubsubTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PubsubTarget() {
    topicName_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PubsubTarget();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.scheduler.v1beta1.TargetProto
        .internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 4:
        return internalGetAttributes();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.scheduler.v1beta1.TargetProto
        .internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.scheduler.v1beta1.PubsubTarget.class,
            com.google.cloud.scheduler.v1beta1.PubsubTarget.Builder.class);
  }

  public static final int TOPIC_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object topicName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the Cloud Pub/Sub topic to which messages will
   * be published when a job is delivered. The topic name must be in the
   * same format as required by Pub/Sub's
   * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
   * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
   *
   * The topic must be in the same project as the Cloud Scheduler job.
   * </pre>
   *
   * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The topicName.
   */
  @java.lang.Override
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Cloud Pub/Sub topic to which messages will
   * be published when a job is delivered. The topic name must be in the
   * same format as required by Pub/Sub's
   * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
   * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
   *
   * The topic must be in the same project as the Cloud Scheduler job.
   * </pre>
   *
   * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for topicName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * The message payload for PubsubMessage.
   *
   * Pubsub message must contain either non-empty data, or at least one
   * attribute.
   * </pre>
   *
   * <code>bytes data = 3;</code>
   *
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 4;

  private static final class AttributesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.scheduler.v1beta1.TargetProto
                .internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_AttributesEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> attributes_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetAttributes() {
    if (attributes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(AttributesDefaultEntryHolder.defaultEntry);
    }
    return attributes_;
  }

  public int getAttributesCount() {
    return internalGetAttributes().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Attributes for PubsubMessage.
   *
   * Pubsub message must contain either non-empty data, or at least one
   * attribute.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  @java.lang.Override
  public boolean containsAttributes(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetAttributes().getMap().containsKey(key);
  }
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getAttributes() {
    return getAttributesMap();
  }
  /**
   *
   *
   * <pre>
   * Attributes for PubsubMessage.
   *
   * Pubsub message must contain either non-empty data, or at least one
   * attribute.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getAttributesMap() {
    return internalGetAttributes().getMap();
  }
  /**
   *
   *
   * <pre>
   * Attributes for PubsubMessage.
   *
   * Pubsub message must contain either non-empty data, or at least one
   * attribute.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetAttributes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Attributes for PubsubMessage.
   *
   * Pubsub message must contain either non-empty data, or at least one
   * attribute.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 4;</code>
   */
  @java.lang.Override
  public java.lang.String getAttributesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetAttributes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicName_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(3, data_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetAttributes(), AttributesDefaultEntryHolder.defaultEntry, 4);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topicName_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, data_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetAttributes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> attributes__ =
          AttributesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, attributes__);
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
    if (!(obj instanceof com.google.cloud.scheduler.v1beta1.PubsubTarget)) {
      return super.equals(obj);
    }
    com.google.cloud.scheduler.v1beta1.PubsubTarget other =
        (com.google.cloud.scheduler.v1beta1.PubsubTarget) obj;

    if (!getTopicName().equals(other.getTopicName())) return false;
    if (!getData().equals(other.getData())) return false;
    if (!internalGetAttributes().equals(other.internalGetAttributes())) return false;
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
    hash = (37 * hash) + TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (!internalGetAttributes().getMap().isEmpty()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAttributes().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget parseFrom(
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

  public static Builder newBuilder(com.google.cloud.scheduler.v1beta1.PubsubTarget prototype) {
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
   * Pub/Sub target. The job will be delivered by publishing a message to
   * the given Pub/Sub topic.
   * </pre>
   *
   * Protobuf type {@code google.cloud.scheduler.v1beta1.PubsubTarget}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.scheduler.v1beta1.PubsubTarget)
      com.google.cloud.scheduler.v1beta1.PubsubTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.scheduler.v1beta1.TargetProto
          .internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 4:
          return internalGetAttributes();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableAttributes();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.scheduler.v1beta1.TargetProto
          .internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.scheduler.v1beta1.PubsubTarget.class,
              com.google.cloud.scheduler.v1beta1.PubsubTarget.Builder.class);
    }

    // Construct using com.google.cloud.scheduler.v1beta1.PubsubTarget.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topicName_ = "";
      data_ = com.google.protobuf.ByteString.EMPTY;
      internalGetMutableAttributes().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.scheduler.v1beta1.TargetProto
          .internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.PubsubTarget getDefaultInstanceForType() {
      return com.google.cloud.scheduler.v1beta1.PubsubTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.PubsubTarget build() {
      com.google.cloud.scheduler.v1beta1.PubsubTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.PubsubTarget buildPartial() {
      com.google.cloud.scheduler.v1beta1.PubsubTarget result =
          new com.google.cloud.scheduler.v1beta1.PubsubTarget(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.scheduler.v1beta1.PubsubTarget result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topicName_ = topicName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.data_ = data_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.attributes_ = internalGetAttributes();
        result.attributes_.makeImmutable();
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
      if (other instanceof com.google.cloud.scheduler.v1beta1.PubsubTarget) {
        return mergeFrom((com.google.cloud.scheduler.v1beta1.PubsubTarget) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.scheduler.v1beta1.PubsubTarget other) {
      if (other == com.google.cloud.scheduler.v1beta1.PubsubTarget.getDefaultInstance())
        return this;
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      internalGetMutableAttributes().mergeFrom(other.internalGetAttributes());
      bitField0_ |= 0x00000004;
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
                topicName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                data_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 34:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> attributes__ =
                    input.readMessage(
                        AttributesDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableAttributes()
                    .getMutableMap()
                    .put(attributes__.getKey(), attributes__.getValue());
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

    private java.lang.Object topicName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Pub/Sub topic to which messages will
     * be published when a job is delivered. The topic name must be in the
     * same format as required by Pub/Sub's
     * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
     * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
     *
     * The topic must be in the same project as the Cloud Scheduler job.
     * </pre>
     *
     * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The topicName.
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Pub/Sub topic to which messages will
     * be published when a job is delivered. The topic name must be in the
     * same format as required by Pub/Sub's
     * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
     * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
     *
     * The topic must be in the same project as the Cloud Scheduler job.
     * </pre>
     *
     * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for topicName.
     */
    public com.google.protobuf.ByteString getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Pub/Sub topic to which messages will
     * be published when a job is delivered. The topic name must be in the
     * same format as required by Pub/Sub's
     * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
     * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
     *
     * The topic must be in the same project as the Cloud Scheduler job.
     * </pre>
     *
     * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      topicName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Pub/Sub topic to which messages will
     * be published when a job is delivered. The topic name must be in the
     * same format as required by Pub/Sub's
     * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
     * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
     *
     * The topic must be in the same project as the Cloud Scheduler job.
     * </pre>
     *
     * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      topicName_ = getDefaultInstance().getTopicName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Cloud Pub/Sub topic to which messages will
     * be published when a job is delivered. The topic name must be in the
     * same format as required by Pub/Sub's
     * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
     * for example `projects/PROJECT_ID/topics/TOPIC_ID`.
     *
     * The topic must be in the same project as the Cloud Scheduler job.
     * </pre>
     *
     * <code>string topic_name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      topicName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The message payload for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>bytes data = 3;</code>
     *
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     *
     *
     * <pre>
     * The message payload for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>bytes data = 3;</code>
     *
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      data_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The message payload for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>bytes data = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> attributes_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetAttributes() {
      if (attributes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      return attributes_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableAttributes() {
      if (attributes_ == null) {
        attributes_ =
            com.google.protobuf.MapField.newMapField(AttributesDefaultEntryHolder.defaultEntry);
      }
      if (!attributes_.isMutable()) {
        attributes_ = attributes_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return attributes_;
    }

    public int getAttributesCount() {
      return internalGetAttributes().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @java.lang.Override
    public boolean containsAttributes(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetAttributes().getMap().containsKey(key);
    }
    /** Use {@link #getAttributesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAttributes() {
      return getAttributesMap();
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getAttributesMap() {
      return internalGetAttributes().getMap();
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getAttributesOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetAttributes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    @java.lang.Override
    public java.lang.String getAttributesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetAttributes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAttributes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableAttributes().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    public Builder removeAttributes(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableAttributes().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableAttributes() {
      bitField0_ |= 0x00000004;
      return internalGetMutableAttributes().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    public Builder putAttributes(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableAttributes().getMutableMap().put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Attributes for PubsubMessage.
     *
     * Pubsub message must contain either non-empty data, or at least one
     * attribute.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 4;</code>
     */
    public Builder putAllAttributes(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableAttributes().getMutableMap().putAll(values);
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.scheduler.v1beta1.PubsubTarget)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.scheduler.v1beta1.PubsubTarget)
  private static final com.google.cloud.scheduler.v1beta1.PubsubTarget DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.scheduler.v1beta1.PubsubTarget();
  }

  public static com.google.cloud.scheduler.v1beta1.PubsubTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PubsubTarget> PARSER =
      new com.google.protobuf.AbstractParser<PubsubTarget>() {
        @java.lang.Override
        public PubsubTarget parsePartialFrom(
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

  public static com.google.protobuf.Parser<PubsubTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PubsubTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.scheduler.v1beta1.PubsubTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
