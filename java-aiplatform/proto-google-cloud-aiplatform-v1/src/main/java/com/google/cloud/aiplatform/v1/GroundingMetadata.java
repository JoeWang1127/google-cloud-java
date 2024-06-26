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
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Metadata returned to client when grounding is enabled.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.GroundingMetadata}
 */
public final class GroundingMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.GroundingMetadata)
    GroundingMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GroundingMetadata.newBuilder() to construct.
  private GroundingMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GroundingMetadata() {
    webSearchQueries_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GroundingMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ContentProto
        .internal_static_google_cloud_aiplatform_v1_GroundingMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ContentProto
        .internal_static_google_cloud_aiplatform_v1_GroundingMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.GroundingMetadata.class,
            com.google.cloud.aiplatform.v1.GroundingMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int WEB_SEARCH_QUERIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList webSearchQueries_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the webSearchQueries.
   */
  public com.google.protobuf.ProtocolStringList getWebSearchQueriesList() {
    return webSearchQueries_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of webSearchQueries.
   */
  public int getWebSearchQueriesCount() {
    return webSearchQueries_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The webSearchQueries at the given index.
   */
  public java.lang.String getWebSearchQueries(int index) {
    return webSearchQueries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. Web search queries for the following-up web search.
   * </pre>
   *
   * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the webSearchQueries at the given index.
   */
  public com.google.protobuf.ByteString getWebSearchQueriesBytes(int index) {
    return webSearchQueries_.getByteString(index);
  }

  public static final int SEARCH_ENTRY_POINT_FIELD_NUMBER = 4;
  private com.google.cloud.aiplatform.v1.SearchEntryPoint searchEntryPoint_;
  /**
   *
   *
   * <pre>
   * Optional. Google search entry for the following-up web searches.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the searchEntryPoint field is set.
   */
  @java.lang.Override
  public boolean hasSearchEntryPoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Google search entry for the following-up web searches.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The searchEntryPoint.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SearchEntryPoint getSearchEntryPoint() {
    return searchEntryPoint_ == null
        ? com.google.cloud.aiplatform.v1.SearchEntryPoint.getDefaultInstance()
        : searchEntryPoint_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Google search entry for the following-up web searches.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SearchEntryPointOrBuilder getSearchEntryPointOrBuilder() {
    return searchEntryPoint_ == null
        ? com.google.cloud.aiplatform.v1.SearchEntryPoint.getDefaultInstance()
        : searchEntryPoint_;
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
    for (int i = 0; i < webSearchQueries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, webSearchQueries_.getRaw(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getSearchEntryPoint());
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
      for (int i = 0; i < webSearchQueries_.size(); i++) {
        dataSize += computeStringSizeNoTag(webSearchQueries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWebSearchQueriesList().size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getSearchEntryPoint());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.GroundingMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.GroundingMetadata other =
        (com.google.cloud.aiplatform.v1.GroundingMetadata) obj;

    if (!getWebSearchQueriesList().equals(other.getWebSearchQueriesList())) return false;
    if (hasSearchEntryPoint() != other.hasSearchEntryPoint()) return false;
    if (hasSearchEntryPoint()) {
      if (!getSearchEntryPoint().equals(other.getSearchEntryPoint())) return false;
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
    if (getWebSearchQueriesCount() > 0) {
      hash = (37 * hash) + WEB_SEARCH_QUERIES_FIELD_NUMBER;
      hash = (53 * hash) + getWebSearchQueriesList().hashCode();
    }
    if (hasSearchEntryPoint()) {
      hash = (37 * hash) + SEARCH_ENTRY_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getSearchEntryPoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.GroundingMetadata prototype) {
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
   * Metadata returned to client when grounding is enabled.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.GroundingMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.GroundingMetadata)
      com.google.cloud.aiplatform.v1.GroundingMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_GroundingMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_GroundingMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.GroundingMetadata.class,
              com.google.cloud.aiplatform.v1.GroundingMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.GroundingMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSearchEntryPointFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      webSearchQueries_ = com.google.protobuf.LazyStringArrayList.emptyList();
      searchEntryPoint_ = null;
      if (searchEntryPointBuilder_ != null) {
        searchEntryPointBuilder_.dispose();
        searchEntryPointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ContentProto
          .internal_static_google_cloud_aiplatform_v1_GroundingMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.GroundingMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.GroundingMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.GroundingMetadata build() {
      com.google.cloud.aiplatform.v1.GroundingMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.GroundingMetadata buildPartial() {
      com.google.cloud.aiplatform.v1.GroundingMetadata result =
          new com.google.cloud.aiplatform.v1.GroundingMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.GroundingMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        webSearchQueries_.makeImmutable();
        result.webSearchQueries_ = webSearchQueries_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchEntryPoint_ =
            searchEntryPointBuilder_ == null ? searchEntryPoint_ : searchEntryPointBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.GroundingMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1.GroundingMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.GroundingMetadata other) {
      if (other == com.google.cloud.aiplatform.v1.GroundingMetadata.getDefaultInstance())
        return this;
      if (!other.webSearchQueries_.isEmpty()) {
        if (webSearchQueries_.isEmpty()) {
          webSearchQueries_ = other.webSearchQueries_;
          bitField0_ |= 0x00000001;
        } else {
          ensureWebSearchQueriesIsMutable();
          webSearchQueries_.addAll(other.webSearchQueries_);
        }
        onChanged();
      }
      if (other.hasSearchEntryPoint()) {
        mergeSearchEntryPoint(other.getSearchEntryPoint());
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
                ensureWebSearchQueriesIsMutable();
                webSearchQueries_.add(s);
                break;
              } // case 10
            case 34:
              {
                input.readMessage(
                    getSearchEntryPointFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private com.google.protobuf.LazyStringArrayList webSearchQueries_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureWebSearchQueriesIsMutable() {
      if (!webSearchQueries_.isModifiable()) {
        webSearchQueries_ = new com.google.protobuf.LazyStringArrayList(webSearchQueries_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return A list containing the webSearchQueries.
     */
    public com.google.protobuf.ProtocolStringList getWebSearchQueriesList() {
      webSearchQueries_.makeImmutable();
      return webSearchQueries_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The count of webSearchQueries.
     */
    public int getWebSearchQueriesCount() {
      return webSearchQueries_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The webSearchQueries at the given index.
     */
    public java.lang.String getWebSearchQueries(int index) {
      return webSearchQueries_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the webSearchQueries at the given index.
     */
    public com.google.protobuf.ByteString getWebSearchQueriesBytes(int index) {
      return webSearchQueries_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The webSearchQueries to set.
     * @return This builder for chaining.
     */
    public Builder setWebSearchQueries(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWebSearchQueriesIsMutable();
      webSearchQueries_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The webSearchQueries to add.
     * @return This builder for chaining.
     */
    public Builder addWebSearchQueries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWebSearchQueriesIsMutable();
      webSearchQueries_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param values The webSearchQueries to add.
     * @return This builder for chaining.
     */
    public Builder addAllWebSearchQueries(java.lang.Iterable<java.lang.String> values) {
      ensureWebSearchQueriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, webSearchQueries_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWebSearchQueries() {
      webSearchQueries_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Web search queries for the following-up web search.
     * </pre>
     *
     * <code>repeated string web_search_queries = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The bytes of the webSearchQueries to add.
     * @return This builder for chaining.
     */
    public Builder addWebSearchQueriesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureWebSearchQueriesIsMutable();
      webSearchQueries_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.SearchEntryPoint searchEntryPoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.SearchEntryPoint,
            com.google.cloud.aiplatform.v1.SearchEntryPoint.Builder,
            com.google.cloud.aiplatform.v1.SearchEntryPointOrBuilder>
        searchEntryPointBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the searchEntryPoint field is set.
     */
    public boolean hasSearchEntryPoint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The searchEntryPoint.
     */
    public com.google.cloud.aiplatform.v1.SearchEntryPoint getSearchEntryPoint() {
      if (searchEntryPointBuilder_ == null) {
        return searchEntryPoint_ == null
            ? com.google.cloud.aiplatform.v1.SearchEntryPoint.getDefaultInstance()
            : searchEntryPoint_;
      } else {
        return searchEntryPointBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSearchEntryPoint(com.google.cloud.aiplatform.v1.SearchEntryPoint value) {
      if (searchEntryPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchEntryPoint_ = value;
      } else {
        searchEntryPointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSearchEntryPoint(
        com.google.cloud.aiplatform.v1.SearchEntryPoint.Builder builderForValue) {
      if (searchEntryPointBuilder_ == null) {
        searchEntryPoint_ = builderForValue.build();
      } else {
        searchEntryPointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeSearchEntryPoint(com.google.cloud.aiplatform.v1.SearchEntryPoint value) {
      if (searchEntryPointBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && searchEntryPoint_ != null
            && searchEntryPoint_
                != com.google.cloud.aiplatform.v1.SearchEntryPoint.getDefaultInstance()) {
          getSearchEntryPointBuilder().mergeFrom(value);
        } else {
          searchEntryPoint_ = value;
        }
      } else {
        searchEntryPointBuilder_.mergeFrom(value);
      }
      if (searchEntryPoint_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearSearchEntryPoint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      searchEntryPoint_ = null;
      if (searchEntryPointBuilder_ != null) {
        searchEntryPointBuilder_.dispose();
        searchEntryPointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.SearchEntryPoint.Builder getSearchEntryPointBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSearchEntryPointFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.SearchEntryPointOrBuilder getSearchEntryPointOrBuilder() {
      if (searchEntryPointBuilder_ != null) {
        return searchEntryPointBuilder_.getMessageOrBuilder();
      } else {
        return searchEntryPoint_ == null
            ? com.google.cloud.aiplatform.v1.SearchEntryPoint.getDefaultInstance()
            : searchEntryPoint_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Google search entry for the following-up web searches.
     * </pre>
     *
     * <code>
     * optional .google.cloud.aiplatform.v1.SearchEntryPoint search_entry_point = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.SearchEntryPoint,
            com.google.cloud.aiplatform.v1.SearchEntryPoint.Builder,
            com.google.cloud.aiplatform.v1.SearchEntryPointOrBuilder>
        getSearchEntryPointFieldBuilder() {
      if (searchEntryPointBuilder_ == null) {
        searchEntryPointBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.SearchEntryPoint,
                com.google.cloud.aiplatform.v1.SearchEntryPoint.Builder,
                com.google.cloud.aiplatform.v1.SearchEntryPointOrBuilder>(
                getSearchEntryPoint(), getParentForChildren(), isClean());
        searchEntryPoint_ = null;
      }
      return searchEntryPointBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.GroundingMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.GroundingMetadata)
  private static final com.google.cloud.aiplatform.v1.GroundingMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.GroundingMetadata();
  }

  public static com.google.cloud.aiplatform.v1.GroundingMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroundingMetadata> PARSER =
      new com.google.protobuf.AbstractParser<GroundingMetadata>() {
        @java.lang.Override
        public GroundingMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroundingMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroundingMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GroundingMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
