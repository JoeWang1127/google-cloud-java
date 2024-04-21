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
// source: google/cloud/iot/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * The configuration for forwarding telemetry events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.EventNotificationConfig}
 */
public final class EventNotificationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.EventNotificationConfig)
    EventNotificationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventNotificationConfig.newBuilder() to construct.
  private EventNotificationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventNotificationConfig() {
    subfolderMatches_ = "";
    pubsubTopicName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventNotificationConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.EventNotificationConfig.class,
            com.google.cloud.iot.v1.EventNotificationConfig.Builder.class);
  }

  public static final int SUBFOLDER_MATCHES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subfolderMatches_ = "";
  /**
   *
   *
   * <pre>
   * If the subfolder name matches this string exactly, this configuration will
   * be used. The string must not include the leading '/' character. If empty,
   * all strings are matched. This field is used only for telemetry events;
   * subfolders are not supported for state changes.
   * </pre>
   *
   * <code>string subfolder_matches = 2;</code>
   *
   * @return The subfolderMatches.
   */
  @java.lang.Override
  public java.lang.String getSubfolderMatches() {
    java.lang.Object ref = subfolderMatches_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subfolderMatches_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If the subfolder name matches this string exactly, this configuration will
   * be used. The string must not include the leading '/' character. If empty,
   * all strings are matched. This field is used only for telemetry events;
   * subfolders are not supported for state changes.
   * </pre>
   *
   * <code>string subfolder_matches = 2;</code>
   *
   * @return The bytes for subfolderMatches.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubfolderMatchesBytes() {
    java.lang.Object ref = subfolderMatches_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subfolderMatches_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBSUB_TOPIC_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pubsubTopicName_ = "";
  /**
   *
   *
   * <pre>
   * A Cloud Pub/Sub topic name. For example,
   * `projects/myProject/topics/deviceEvents`.
   * </pre>
   *
   * <code>string pubsub_topic_name = 1;</code>
   *
   * @return The pubsubTopicName.
   */
  @java.lang.Override
  public java.lang.String getPubsubTopicName() {
    java.lang.Object ref = pubsubTopicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubsubTopicName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A Cloud Pub/Sub topic name. For example,
   * `projects/myProject/topics/deviceEvents`.
   * </pre>
   *
   * <code>string pubsub_topic_name = 1;</code>
   *
   * @return The bytes for pubsubTopicName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPubsubTopicNameBytes() {
    java.lang.Object ref = pubsubTopicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pubsubTopicName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubsubTopicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubsubTopicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subfolderMatches_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subfolderMatches_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pubsubTopicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubsubTopicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subfolderMatches_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subfolderMatches_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.EventNotificationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.EventNotificationConfig other =
        (com.google.cloud.iot.v1.EventNotificationConfig) obj;

    if (!getSubfolderMatches().equals(other.getSubfolderMatches())) return false;
    if (!getPubsubTopicName().equals(other.getPubsubTopicName())) return false;
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
    hash = (37 * hash) + SUBFOLDER_MATCHES_FIELD_NUMBER;
    hash = (53 * hash) + getSubfolderMatches().hashCode();
    hash = (37 * hash) + PUBSUB_TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPubsubTopicName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.EventNotificationConfig prototype) {
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
   * The configuration for forwarding telemetry events.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.EventNotificationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.EventNotificationConfig)
      com.google.cloud.iot.v1.EventNotificationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.EventNotificationConfig.class,
              com.google.cloud.iot.v1.EventNotificationConfig.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.EventNotificationConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subfolderMatches_ = "";
      pubsubTopicName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.EventNotificationConfig getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.EventNotificationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.EventNotificationConfig build() {
      com.google.cloud.iot.v1.EventNotificationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.EventNotificationConfig buildPartial() {
      com.google.cloud.iot.v1.EventNotificationConfig result =
          new com.google.cloud.iot.v1.EventNotificationConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iot.v1.EventNotificationConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subfolderMatches_ = subfolderMatches_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pubsubTopicName_ = pubsubTopicName_;
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
      if (other instanceof com.google.cloud.iot.v1.EventNotificationConfig) {
        return mergeFrom((com.google.cloud.iot.v1.EventNotificationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.EventNotificationConfig other) {
      if (other == com.google.cloud.iot.v1.EventNotificationConfig.getDefaultInstance())
        return this;
      if (!other.getSubfolderMatches().isEmpty()) {
        subfolderMatches_ = other.subfolderMatches_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPubsubTopicName().isEmpty()) {
        pubsubTopicName_ = other.pubsubTopicName_;
        bitField0_ |= 0x00000002;
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
                pubsubTopicName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 18:
              {
                subfolderMatches_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object subfolderMatches_ = "";
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     *
     * @return The subfolderMatches.
     */
    public java.lang.String getSubfolderMatches() {
      java.lang.Object ref = subfolderMatches_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subfolderMatches_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     *
     * @return The bytes for subfolderMatches.
     */
    public com.google.protobuf.ByteString getSubfolderMatchesBytes() {
      java.lang.Object ref = subfolderMatches_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subfolderMatches_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     *
     * @param value The subfolderMatches to set.
     * @return This builder for chaining.
     */
    public Builder setSubfolderMatches(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subfolderMatches_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubfolderMatches() {
      subfolderMatches_ = getDefaultInstance().getSubfolderMatches();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     *
     * @param value The bytes for subfolderMatches to set.
     * @return This builder for chaining.
     */
    public Builder setSubfolderMatchesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subfolderMatches_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object pubsubTopicName_ = "";
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     *
     * @return The pubsubTopicName.
     */
    public java.lang.String getPubsubTopicName() {
      java.lang.Object ref = pubsubTopicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubsubTopicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     *
     * @return The bytes for pubsubTopicName.
     */
    public com.google.protobuf.ByteString getPubsubTopicNameBytes() {
      java.lang.Object ref = pubsubTopicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pubsubTopicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     *
     * @param value The pubsubTopicName to set.
     * @return This builder for chaining.
     */
    public Builder setPubsubTopicName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pubsubTopicName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPubsubTopicName() {
      pubsubTopicName_ = getDefaultInstance().getPubsubTopicName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     *
     * @param value The bytes for pubsubTopicName to set.
     * @return This builder for chaining.
     */
    public Builder setPubsubTopicNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pubsubTopicName_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.EventNotificationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.EventNotificationConfig)
  private static final com.google.cloud.iot.v1.EventNotificationConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.EventNotificationConfig();
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventNotificationConfig> PARSER =
      new com.google.protobuf.AbstractParser<EventNotificationConfig>() {
        @java.lang.Override
        public EventNotificationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventNotificationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventNotificationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.EventNotificationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
