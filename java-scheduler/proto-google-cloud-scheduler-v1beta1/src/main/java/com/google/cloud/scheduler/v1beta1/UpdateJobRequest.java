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
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.scheduler.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateJob][google.cloud.scheduler.v1beta1.CloudScheduler.UpdateJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.scheduler.v1beta1.UpdateJobRequest}
 */
public final class UpdateJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.scheduler.v1beta1.UpdateJobRequest)
    UpdateJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateJobRequest.newBuilder() to construct.
  private UpdateJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateJobRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.scheduler.v1beta1.SchedulerProto
        .internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.scheduler.v1beta1.SchedulerProto
        .internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.scheduler.v1beta1.UpdateJobRequest.class,
            com.google.cloud.scheduler.v1beta1.UpdateJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int JOB_FIELD_NUMBER = 1;
  private com.google.cloud.scheduler.v1beta1.Job job_;
  /**
   *
   *
   * <pre>
   * Required. The new job properties.
   * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The new job properties.
   * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The job.
   */
  @java.lang.Override
  public com.google.cloud.scheduler.v1beta1.Job getJob() {
    return job_ == null ? com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance() : job_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new job properties.
   * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
   *
   * Output only fields cannot be modified using UpdateJob.
   * Any value specified for an output only field will be ignored.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.scheduler.v1beta1.JobOrBuilder getJobOrBuilder() {
    return job_ == null ? com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance() : job_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * A  mask used to specify which fields of the job are being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getJob());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getJob());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.scheduler.v1beta1.UpdateJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.scheduler.v1beta1.UpdateJobRequest other =
        (com.google.cloud.scheduler.v1beta1.UpdateJobRequest) obj;

    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob().equals(other.getJob())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.scheduler.v1beta1.UpdateJobRequest prototype) {
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
   * Request message for
   * [UpdateJob][google.cloud.scheduler.v1beta1.CloudScheduler.UpdateJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.scheduler.v1beta1.UpdateJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.scheduler.v1beta1.UpdateJobRequest)
      com.google.cloud.scheduler.v1beta1.UpdateJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto
          .internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto
          .internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.scheduler.v1beta1.UpdateJobRequest.class,
              com.google.cloud.scheduler.v1beta1.UpdateJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.scheduler.v1beta1.UpdateJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getJobFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto
          .internal_static_google_cloud_scheduler_v1beta1_UpdateJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.UpdateJobRequest getDefaultInstanceForType() {
      return com.google.cloud.scheduler.v1beta1.UpdateJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.UpdateJobRequest build() {
      com.google.cloud.scheduler.v1beta1.UpdateJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.UpdateJobRequest buildPartial() {
      com.google.cloud.scheduler.v1beta1.UpdateJobRequest result =
          new com.google.cloud.scheduler.v1beta1.UpdateJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.scheduler.v1beta1.UpdateJobRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.job_ = jobBuilder_ == null ? job_ : jobBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.scheduler.v1beta1.UpdateJobRequest) {
        return mergeFrom((com.google.cloud.scheduler.v1beta1.UpdateJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.scheduler.v1beta1.UpdateJobRequest other) {
      if (other == com.google.cloud.scheduler.v1beta1.UpdateJobRequest.getDefaultInstance())
        return this;
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.scheduler.v1beta1.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.scheduler.v1beta1.Job,
            com.google.cloud.scheduler.v1beta1.Job.Builder,
            com.google.cloud.scheduler.v1beta1.JobOrBuilder>
        jobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The job.
     */
    public com.google.cloud.scheduler.v1beta1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJob(com.google.cloud.scheduler.v1beta1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
      } else {
        jobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJob(com.google.cloud.scheduler.v1beta1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeJob(com.google.cloud.scheduler.v1beta1.Job value) {
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && job_ != null
            && job_ != com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()) {
          getJobBuilder().mergeFrom(value);
        } else {
          job_ = value;
        }
      } else {
        jobBuilder_.mergeFrom(value);
      }
      if (job_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearJob() {
      bitField0_ = (bitField0_ & ~0x00000001);
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.scheduler.v1beta1.Job.Builder getJobBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.scheduler.v1beta1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ? com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new job properties.
     * [name][google.cloud.scheduler.v1beta1.Job.name] must be specified.
     *
     * Output only fields cannot be modified using UpdateJob.
     * Any value specified for an output only field will be ignored.
     * </pre>
     *
     * <code>.google.cloud.scheduler.v1beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.scheduler.v1beta1.Job,
            com.google.cloud.scheduler.v1beta1.Job.Builder,
            com.google.cloud.scheduler.v1beta1.JobOrBuilder>
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.scheduler.v1beta1.Job,
                com.google.cloud.scheduler.v1beta1.Job.Builder,
                com.google.cloud.scheduler.v1beta1.JobOrBuilder>(
                getJob(), getParentForChildren(), isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * A  mask used to specify which fields of the job are being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.scheduler.v1beta1.UpdateJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.scheduler.v1beta1.UpdateJobRequest)
  private static final com.google.cloud.scheduler.v1beta1.UpdateJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.scheduler.v1beta1.UpdateJobRequest();
  }

  public static com.google.cloud.scheduler.v1beta1.UpdateJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateJobRequest>() {
        @java.lang.Override
        public UpdateJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.scheduler.v1beta1.UpdateJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
