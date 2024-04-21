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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The response to list analyses.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.ListAnalysesResponse}
 */
public final class ListAnalysesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.ListAnalysesResponse)
    ListAnalysesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAnalysesResponse.newBuilder() to construct.
  private ListAnalysesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAnalysesResponse() {
    analyses_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAnalysesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_ListAnalysesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_ListAnalysesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.class,
            com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.Builder.class);
  }

  public static final int ANALYSES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.contactcenterinsights.v1.Analysis> analyses_;
  /**
   *
   *
   * <pre>
   * The analyses that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contactcenterinsights.v1.Analysis> getAnalysesList() {
    return analyses_;
  }
  /**
   *
   *
   * <pre>
   * The analyses that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder>
      getAnalysesOrBuilderList() {
    return analyses_;
  }
  /**
   *
   *
   * <pre>
   * The analyses that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
   */
  @java.lang.Override
  public int getAnalysesCount() {
    return analyses_.size();
  }
  /**
   *
   *
   * <pre>
   * The analyses that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.Analysis getAnalyses(int index) {
    return analyses_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The analyses that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder getAnalysesOrBuilder(
      int index) {
    return analyses_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < analyses_.size(); i++) {
      output.writeMessage(1, analyses_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < analyses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, analyses_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse other =
        (com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse) obj;

    if (!getAnalysesList().equals(other.getAnalysesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAnalysesCount() > 0) {
      hash = (37 * hash) + ANALYSES_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse prototype) {
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
   * The response to list analyses.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.ListAnalysesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.ListAnalysesResponse)
      com.google.cloud.contactcenterinsights.v1.ListAnalysesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_ListAnalysesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_ListAnalysesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.class,
              com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (analysesBuilder_ == null) {
        analyses_ = java.util.Collections.emptyList();
      } else {
        analyses_ = null;
        analysesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_ListAnalysesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse build() {
      com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse buildPartial() {
      com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse result =
          new com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse result) {
      if (analysesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          analyses_ = java.util.Collections.unmodifiableList(analyses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.analyses_ = analyses_;
      } else {
        result.analyses_ = analysesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.getDefaultInstance())
        return this;
      if (analysesBuilder_ == null) {
        if (!other.analyses_.isEmpty()) {
          if (analyses_.isEmpty()) {
            analyses_ = other.analyses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnalysesIsMutable();
            analyses_.addAll(other.analyses_);
          }
          onChanged();
        }
      } else {
        if (!other.analyses_.isEmpty()) {
          if (analysesBuilder_.isEmpty()) {
            analysesBuilder_.dispose();
            analysesBuilder_ = null;
            analyses_ = other.analyses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            analysesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnalysesFieldBuilder()
                    : null;
          } else {
            analysesBuilder_.addAllMessages(other.analyses_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.contactcenterinsights.v1.Analysis m =
                    input.readMessage(
                        com.google.cloud.contactcenterinsights.v1.Analysis.parser(),
                        extensionRegistry);
                if (analysesBuilder_ == null) {
                  ensureAnalysesIsMutable();
                  analyses_.add(m);
                } else {
                  analysesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.util.List<com.google.cloud.contactcenterinsights.v1.Analysis> analyses_ =
        java.util.Collections.emptyList();

    private void ensureAnalysesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        analyses_ =
            new java.util.ArrayList<com.google.cloud.contactcenterinsights.v1.Analysis>(analyses_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Analysis,
            com.google.cloud.contactcenterinsights.v1.Analysis.Builder,
            com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder>
        analysesBuilder_;

    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.Analysis> getAnalysesList() {
      if (analysesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(analyses_);
      } else {
        return analysesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public int getAnalysesCount() {
      if (analysesBuilder_ == null) {
        return analyses_.size();
      } else {
        return analysesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis getAnalyses(int index) {
      if (analysesBuilder_ == null) {
        return analyses_.get(index);
      } else {
        return analysesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder setAnalyses(
        int index, com.google.cloud.contactcenterinsights.v1.Analysis value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.set(index, value);
        onChanged();
      } else {
        analysesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder setAnalyses(
        int index, com.google.cloud.contactcenterinsights.v1.Analysis.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.set(index, builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder addAnalyses(com.google.cloud.contactcenterinsights.v1.Analysis value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.add(value);
        onChanged();
      } else {
        analysesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder addAnalyses(
        int index, com.google.cloud.contactcenterinsights.v1.Analysis value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.add(index, value);
        onChanged();
      } else {
        analysesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder addAnalyses(
        com.google.cloud.contactcenterinsights.v1.Analysis.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.add(builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder addAnalyses(
        int index, com.google.cloud.contactcenterinsights.v1.Analysis.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.add(index, builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder addAllAnalyses(
        java.lang.Iterable<? extends com.google.cloud.contactcenterinsights.v1.Analysis> values) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, analyses_);
        onChanged();
      } else {
        analysesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder clearAnalyses() {
      if (analysesBuilder_ == null) {
        analyses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        analysesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public Builder removeAnalyses(int index) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.remove(index);
        onChanged();
      } else {
        analysesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis.Builder getAnalysesBuilder(
        int index) {
      return getAnalysesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder getAnalysesOrBuilder(
        int index) {
      if (analysesBuilder_ == null) {
        return analyses_.get(index);
      } else {
        return analysesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder>
        getAnalysesOrBuilderList() {
      if (analysesBuilder_ != null) {
        return analysesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(analyses_);
      }
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis.Builder addAnalysesBuilder() {
      return getAnalysesFieldBuilder()
          .addBuilder(com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis.Builder addAnalysesBuilder(
        int index) {
      return getAnalysesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The analyses that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.Analysis analyses = 1;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.Analysis.Builder>
        getAnalysesBuilderList() {
      return getAnalysesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Analysis,
            com.google.cloud.contactcenterinsights.v1.Analysis.Builder,
            com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder>
        getAnalysesFieldBuilder() {
      if (analysesBuilder_ == null) {
        analysesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.Analysis,
                com.google.cloud.contactcenterinsights.v1.Analysis.Builder,
                com.google.cloud.contactcenterinsights.v1.AnalysisOrBuilder>(
                analyses_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        analyses_ = null;
      }
      return analysesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.ListAnalysesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.ListAnalysesResponse)
  private static final com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse();
  }

  public static com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAnalysesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAnalysesResponse>() {
        @java.lang.Override
        public ListAnalysesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAnalysesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAnalysesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
