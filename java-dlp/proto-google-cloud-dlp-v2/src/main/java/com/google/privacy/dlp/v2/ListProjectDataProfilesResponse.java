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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * List of profiles generated for a given organization or project.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ListProjectDataProfilesResponse}
 */
public final class ListProjectDataProfilesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ListProjectDataProfilesResponse)
    ListProjectDataProfilesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProjectDataProfilesResponse.newBuilder() to construct.
  private ListProjectDataProfilesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProjectDataProfilesResponse() {
    projectDataProfiles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProjectDataProfilesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ListProjectDataProfilesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ListProjectDataProfilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.class,
            com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.Builder.class);
  }

  public static final int PROJECT_DATA_PROFILES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.privacy.dlp.v2.ProjectDataProfile> projectDataProfiles_;
  /**
   *
   *
   * <pre>
   * List of data profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.ProjectDataProfile> getProjectDataProfilesList() {
    return projectDataProfiles_;
  }
  /**
   *
   *
   * <pre>
   * List of data profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder>
      getProjectDataProfilesOrBuilderList() {
    return projectDataProfiles_;
  }
  /**
   *
   *
   * <pre>
   * List of data profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
   */
  @java.lang.Override
  public int getProjectDataProfilesCount() {
    return projectDataProfiles_.size();
  }
  /**
   *
   *
   * <pre>
   * List of data profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ProjectDataProfile getProjectDataProfiles(int index) {
    return projectDataProfiles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of data profiles.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder getProjectDataProfilesOrBuilder(
      int index) {
    return projectDataProfiles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The next page token.
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
   * The next page token.
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
    for (int i = 0; i < projectDataProfiles_.size(); i++) {
      output.writeMessage(1, projectDataProfiles_.get(i));
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
    for (int i = 0; i < projectDataProfiles_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, projectDataProfiles_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ListProjectDataProfilesResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ListProjectDataProfilesResponse other =
        (com.google.privacy.dlp.v2.ListProjectDataProfilesResponse) obj;

    if (!getProjectDataProfilesList().equals(other.getProjectDataProfilesList())) return false;
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
    if (getProjectDataProfilesCount() > 0) {
      hash = (37 * hash) + PROJECT_DATA_PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getProjectDataProfilesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse parseFrom(
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
      com.google.privacy.dlp.v2.ListProjectDataProfilesResponse prototype) {
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
   * List of profiles generated for a given organization or project.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ListProjectDataProfilesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ListProjectDataProfilesResponse)
      com.google.privacy.dlp.v2.ListProjectDataProfilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListProjectDataProfilesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListProjectDataProfilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.class,
              com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (projectDataProfilesBuilder_ == null) {
        projectDataProfiles_ = java.util.Collections.emptyList();
      } else {
        projectDataProfiles_ = null;
        projectDataProfilesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListProjectDataProfilesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListProjectDataProfilesResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListProjectDataProfilesResponse build() {
      com.google.privacy.dlp.v2.ListProjectDataProfilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListProjectDataProfilesResponse buildPartial() {
      com.google.privacy.dlp.v2.ListProjectDataProfilesResponse result =
          new com.google.privacy.dlp.v2.ListProjectDataProfilesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.privacy.dlp.v2.ListProjectDataProfilesResponse result) {
      if (projectDataProfilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          projectDataProfiles_ = java.util.Collections.unmodifiableList(projectDataProfiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.projectDataProfiles_ = projectDataProfiles_;
      } else {
        result.projectDataProfiles_ = projectDataProfilesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.privacy.dlp.v2.ListProjectDataProfilesResponse result) {
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
      if (other instanceof com.google.privacy.dlp.v2.ListProjectDataProfilesResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.ListProjectDataProfilesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ListProjectDataProfilesResponse other) {
      if (other == com.google.privacy.dlp.v2.ListProjectDataProfilesResponse.getDefaultInstance())
        return this;
      if (projectDataProfilesBuilder_ == null) {
        if (!other.projectDataProfiles_.isEmpty()) {
          if (projectDataProfiles_.isEmpty()) {
            projectDataProfiles_ = other.projectDataProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProjectDataProfilesIsMutable();
            projectDataProfiles_.addAll(other.projectDataProfiles_);
          }
          onChanged();
        }
      } else {
        if (!other.projectDataProfiles_.isEmpty()) {
          if (projectDataProfilesBuilder_.isEmpty()) {
            projectDataProfilesBuilder_.dispose();
            projectDataProfilesBuilder_ = null;
            projectDataProfiles_ = other.projectDataProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            projectDataProfilesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProjectDataProfilesFieldBuilder()
                    : null;
          } else {
            projectDataProfilesBuilder_.addAllMessages(other.projectDataProfiles_);
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
                com.google.privacy.dlp.v2.ProjectDataProfile m =
                    input.readMessage(
                        com.google.privacy.dlp.v2.ProjectDataProfile.parser(), extensionRegistry);
                if (projectDataProfilesBuilder_ == null) {
                  ensureProjectDataProfilesIsMutable();
                  projectDataProfiles_.add(m);
                } else {
                  projectDataProfilesBuilder_.addMessage(m);
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

    private java.util.List<com.google.privacy.dlp.v2.ProjectDataProfile> projectDataProfiles_ =
        java.util.Collections.emptyList();

    private void ensureProjectDataProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        projectDataProfiles_ =
            new java.util.ArrayList<com.google.privacy.dlp.v2.ProjectDataProfile>(
                projectDataProfiles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.ProjectDataProfile,
            com.google.privacy.dlp.v2.ProjectDataProfile.Builder,
            com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder>
        projectDataProfilesBuilder_;

    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.ProjectDataProfile>
        getProjectDataProfilesList() {
      if (projectDataProfilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(projectDataProfiles_);
      } else {
        return projectDataProfilesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public int getProjectDataProfilesCount() {
      if (projectDataProfilesBuilder_ == null) {
        return projectDataProfiles_.size();
      } else {
        return projectDataProfilesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public com.google.privacy.dlp.v2.ProjectDataProfile getProjectDataProfiles(int index) {
      if (projectDataProfilesBuilder_ == null) {
        return projectDataProfiles_.get(index);
      } else {
        return projectDataProfilesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder setProjectDataProfiles(
        int index, com.google.privacy.dlp.v2.ProjectDataProfile value) {
      if (projectDataProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.set(index, value);
        onChanged();
      } else {
        projectDataProfilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder setProjectDataProfiles(
        int index, com.google.privacy.dlp.v2.ProjectDataProfile.Builder builderForValue) {
      if (projectDataProfilesBuilder_ == null) {
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        projectDataProfilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder addProjectDataProfiles(com.google.privacy.dlp.v2.ProjectDataProfile value) {
      if (projectDataProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.add(value);
        onChanged();
      } else {
        projectDataProfilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder addProjectDataProfiles(
        int index, com.google.privacy.dlp.v2.ProjectDataProfile value) {
      if (projectDataProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.add(index, value);
        onChanged();
      } else {
        projectDataProfilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder addProjectDataProfiles(
        com.google.privacy.dlp.v2.ProjectDataProfile.Builder builderForValue) {
      if (projectDataProfilesBuilder_ == null) {
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.add(builderForValue.build());
        onChanged();
      } else {
        projectDataProfilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder addProjectDataProfiles(
        int index, com.google.privacy.dlp.v2.ProjectDataProfile.Builder builderForValue) {
      if (projectDataProfilesBuilder_ == null) {
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        projectDataProfilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder addAllProjectDataProfiles(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.ProjectDataProfile> values) {
      if (projectDataProfilesBuilder_ == null) {
        ensureProjectDataProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, projectDataProfiles_);
        onChanged();
      } else {
        projectDataProfilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder clearProjectDataProfiles() {
      if (projectDataProfilesBuilder_ == null) {
        projectDataProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        projectDataProfilesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public Builder removeProjectDataProfiles(int index) {
      if (projectDataProfilesBuilder_ == null) {
        ensureProjectDataProfilesIsMutable();
        projectDataProfiles_.remove(index);
        onChanged();
      } else {
        projectDataProfilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public com.google.privacy.dlp.v2.ProjectDataProfile.Builder getProjectDataProfilesBuilder(
        int index) {
      return getProjectDataProfilesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder getProjectDataProfilesOrBuilder(
        int index) {
      if (projectDataProfilesBuilder_ == null) {
        return projectDataProfiles_.get(index);
      } else {
        return projectDataProfilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder>
        getProjectDataProfilesOrBuilderList() {
      if (projectDataProfilesBuilder_ != null) {
        return projectDataProfilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(projectDataProfiles_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public com.google.privacy.dlp.v2.ProjectDataProfile.Builder addProjectDataProfilesBuilder() {
      return getProjectDataProfilesFieldBuilder()
          .addBuilder(com.google.privacy.dlp.v2.ProjectDataProfile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public com.google.privacy.dlp.v2.ProjectDataProfile.Builder addProjectDataProfilesBuilder(
        int index) {
      return getProjectDataProfilesFieldBuilder()
          .addBuilder(index, com.google.privacy.dlp.v2.ProjectDataProfile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of data profiles.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.ProjectDataProfile project_data_profiles = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.ProjectDataProfile.Builder>
        getProjectDataProfilesBuilderList() {
      return getProjectDataProfilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.ProjectDataProfile,
            com.google.privacy.dlp.v2.ProjectDataProfile.Builder,
            com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder>
        getProjectDataProfilesFieldBuilder() {
      if (projectDataProfilesBuilder_ == null) {
        projectDataProfilesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.privacy.dlp.v2.ProjectDataProfile,
                com.google.privacy.dlp.v2.ProjectDataProfile.Builder,
                com.google.privacy.dlp.v2.ProjectDataProfileOrBuilder>(
                projectDataProfiles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        projectDataProfiles_ = null;
      }
      return projectDataProfilesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The next page token.
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
     * The next page token.
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
     * The next page token.
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
     * The next page token.
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
     * The next page token.
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ListProjectDataProfilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ListProjectDataProfilesResponse)
  private static final com.google.privacy.dlp.v2.ListProjectDataProfilesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ListProjectDataProfilesResponse();
  }

  public static com.google.privacy.dlp.v2.ListProjectDataProfilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProjectDataProfilesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProjectDataProfilesResponse>() {
        @java.lang.Override
        public ListProjectDataProfilesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListProjectDataProfilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProjectDataProfilesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ListProjectDataProfilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
