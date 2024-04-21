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
// source: google/cloud/cloudcontrolspartner/v1beta/partners.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.cloudcontrolspartner.v1beta;

/**
 *
 *
 * <pre>
 * Holds information needed by Mudbray to use partner EKMs for workloads.
 * </pre>
 *
 * Protobuf type {@code google.cloud.cloudcontrolspartner.v1beta.EkmMetadata}
 */
public final class EkmMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.cloudcontrolspartner.v1beta.EkmMetadata)
    EkmMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EkmMetadata.newBuilder() to construct.
  private EkmMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EkmMetadata() {
    ekmSolution_ = 0;
    ekmEndpointUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EkmMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto
        .internal_static_google_cloud_cloudcontrolspartner_v1beta_EkmMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto
        .internal_static_google_cloud_cloudcontrolspartner_v1beta_EkmMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.class,
            com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Represents Google Cloud supported external key management partners
   * [Google Cloud EKM partners
   * docs](https://cloud.google.com/kms/docs/ekm#supported_partners).
   * </pre>
   *
   * Protobuf enum {@code google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution}
   */
  public enum EkmSolution implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified EKM solution
     * </pre>
     *
     * <code>EKM_SOLUTION_UNSPECIFIED = 0;</code>
     */
    EKM_SOLUTION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * EKM Partner Fortanix
     * </pre>
     *
     * <code>FORTANIX = 1;</code>
     */
    FORTANIX(1),
    /**
     *
     *
     * <pre>
     * EKM Partner FutureX
     * </pre>
     *
     * <code>FUTUREX = 2;</code>
     */
    FUTUREX(2),
    /**
     *
     *
     * <pre>
     * EKM Partner Thales
     * </pre>
     *
     * <code>THALES = 3;</code>
     */
    THALES(3),
    /**
     *
     *
     * <pre>
     * EKM Partner Virtu
     * </pre>
     *
     * <code>VIRTRU = 4;</code>
     */
    VIRTRU(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified EKM solution
     * </pre>
     *
     * <code>EKM_SOLUTION_UNSPECIFIED = 0;</code>
     */
    public static final int EKM_SOLUTION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * EKM Partner Fortanix
     * </pre>
     *
     * <code>FORTANIX = 1;</code>
     */
    public static final int FORTANIX_VALUE = 1;
    /**
     *
     *
     * <pre>
     * EKM Partner FutureX
     * </pre>
     *
     * <code>FUTUREX = 2;</code>
     */
    public static final int FUTUREX_VALUE = 2;
    /**
     *
     *
     * <pre>
     * EKM Partner Thales
     * </pre>
     *
     * <code>THALES = 3;</code>
     */
    public static final int THALES_VALUE = 3;
    /**
     *
     *
     * <pre>
     * EKM Partner Virtu
     * </pre>
     *
     * <code>VIRTRU = 4;</code>
     */
    public static final int VIRTRU_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EkmSolution valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EkmSolution forNumber(int value) {
      switch (value) {
        case 0:
          return EKM_SOLUTION_UNSPECIFIED;
        case 1:
          return FORTANIX;
        case 2:
          return FUTUREX;
        case 3:
          return THALES;
        case 4:
          return VIRTRU;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EkmSolution> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<EkmSolution> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EkmSolution>() {
          public EkmSolution findValueByNumber(int number) {
            return EkmSolution.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final EkmSolution[] VALUES = values();

    public static EkmSolution valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EkmSolution(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution)
  }

  public static final int EKM_SOLUTION_FIELD_NUMBER = 1;
  private int ekmSolution_ = 0;
  /**
   *
   *
   * <pre>
   * The Cloud EKM partner.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for ekmSolution.
   */
  @java.lang.Override
  public int getEkmSolutionValue() {
    return ekmSolution_;
  }
  /**
   *
   *
   * <pre>
   * The Cloud EKM partner.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
   * </code>
   *
   * @return The ekmSolution.
   */
  @java.lang.Override
  public com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution getEkmSolution() {
    com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution result =
        com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution.forNumber(
            ekmSolution_);
    return result == null
        ? com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution.UNRECOGNIZED
        : result;
  }

  public static final int EKM_ENDPOINT_URI_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ekmEndpointUri_ = "";
  /**
   *
   *
   * <pre>
   * Endpoint for sending requests to the EKM for key provisioning during
   * Assured Workload creation.
   * </pre>
   *
   * <code>string ekm_endpoint_uri = 2;</code>
   *
   * @return The ekmEndpointUri.
   */
  @java.lang.Override
  public java.lang.String getEkmEndpointUri() {
    java.lang.Object ref = ekmEndpointUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekmEndpointUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Endpoint for sending requests to the EKM for key provisioning during
   * Assured Workload creation.
   * </pre>
   *
   * <code>string ekm_endpoint_uri = 2;</code>
   *
   * @return The bytes for ekmEndpointUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkmEndpointUriBytes() {
    java.lang.Object ref = ekmEndpointUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekmEndpointUri_ = b;
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
    if (ekmSolution_
        != com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution
            .EKM_SOLUTION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, ekmSolution_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ekmEndpointUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ekmEndpointUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ekmSolution_
        != com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution
            .EKM_SOLUTION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, ekmSolution_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ekmEndpointUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ekmEndpointUri_);
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
    if (!(obj instanceof com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata other =
        (com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata) obj;

    if (ekmSolution_ != other.ekmSolution_) return false;
    if (!getEkmEndpointUri().equals(other.getEkmEndpointUri())) return false;
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
    hash = (37 * hash) + EKM_SOLUTION_FIELD_NUMBER;
    hash = (53 * hash) + ekmSolution_;
    hash = (37 * hash) + EKM_ENDPOINT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getEkmEndpointUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata parseFrom(
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
      com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata prototype) {
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
   * Holds information needed by Mudbray to use partner EKMs for workloads.
   * </pre>
   *
   * Protobuf type {@code google.cloud.cloudcontrolspartner.v1beta.EkmMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.cloudcontrolspartner.v1beta.EkmMetadata)
      com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto
          .internal_static_google_cloud_cloudcontrolspartner_v1beta_EkmMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto
          .internal_static_google_cloud_cloudcontrolspartner_v1beta_EkmMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.class,
              com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.Builder.class);
    }

    // Construct using com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ekmSolution_ = 0;
      ekmEndpointUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.cloudcontrolspartner.v1beta.PartnersProto
          .internal_static_google_cloud_cloudcontrolspartner_v1beta_EkmMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata getDefaultInstanceForType() {
      return com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata build() {
      com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata buildPartial() {
      com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata result =
          new com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ekmSolution_ = ekmSolution_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ekmEndpointUri_ = ekmEndpointUri_;
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
      if (other instanceof com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata) {
        return mergeFrom((com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata other) {
      if (other == com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.getDefaultInstance())
        return this;
      if (other.ekmSolution_ != 0) {
        setEkmSolutionValue(other.getEkmSolutionValue());
      }
      if (!other.getEkmEndpointUri().isEmpty()) {
        ekmEndpointUri_ = other.ekmEndpointUri_;
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
            case 8:
              {
                ekmSolution_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                ekmEndpointUri_ = input.readStringRequireUtf8();
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

    private int ekmSolution_ = 0;
    /**
     *
     *
     * <pre>
     * The Cloud EKM partner.
     * </pre>
     *
     * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for ekmSolution.
     */
    @java.lang.Override
    public int getEkmSolutionValue() {
      return ekmSolution_;
    }
    /**
     *
     *
     * <pre>
     * The Cloud EKM partner.
     * </pre>
     *
     * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for ekmSolution to set.
     * @return This builder for chaining.
     */
    public Builder setEkmSolutionValue(int value) {
      ekmSolution_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud EKM partner.
     * </pre>
     *
     * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
     * </code>
     *
     * @return The ekmSolution.
     */
    @java.lang.Override
    public com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution getEkmSolution() {
      com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution result =
          com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution.forNumber(
              ekmSolution_);
      return result == null
          ? com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The Cloud EKM partner.
     * </pre>
     *
     * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
     * </code>
     *
     * @param value The ekmSolution to set.
     * @return This builder for chaining.
     */
    public Builder setEkmSolution(
        com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      ekmSolution_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud EKM partner.
     * </pre>
     *
     * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkmSolution() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ekmSolution_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ekmEndpointUri_ = "";
    /**
     *
     *
     * <pre>
     * Endpoint for sending requests to the EKM for key provisioning during
     * Assured Workload creation.
     * </pre>
     *
     * <code>string ekm_endpoint_uri = 2;</code>
     *
     * @return The ekmEndpointUri.
     */
    public java.lang.String getEkmEndpointUri() {
      java.lang.Object ref = ekmEndpointUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekmEndpointUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Endpoint for sending requests to the EKM for key provisioning during
     * Assured Workload creation.
     * </pre>
     *
     * <code>string ekm_endpoint_uri = 2;</code>
     *
     * @return The bytes for ekmEndpointUri.
     */
    public com.google.protobuf.ByteString getEkmEndpointUriBytes() {
      java.lang.Object ref = ekmEndpointUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekmEndpointUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Endpoint for sending requests to the EKM for key provisioning during
     * Assured Workload creation.
     * </pre>
     *
     * <code>string ekm_endpoint_uri = 2;</code>
     *
     * @param value The ekmEndpointUri to set.
     * @return This builder for chaining.
     */
    public Builder setEkmEndpointUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ekmEndpointUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint for sending requests to the EKM for key provisioning during
     * Assured Workload creation.
     * </pre>
     *
     * <code>string ekm_endpoint_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkmEndpointUri() {
      ekmEndpointUri_ = getDefaultInstance().getEkmEndpointUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint for sending requests to the EKM for key provisioning during
     * Assured Workload creation.
     * </pre>
     *
     * <code>string ekm_endpoint_uri = 2;</code>
     *
     * @param value The bytes for ekmEndpointUri to set.
     * @return This builder for chaining.
     */
    public Builder setEkmEndpointUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ekmEndpointUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.cloudcontrolspartner.v1beta.EkmMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.cloudcontrolspartner.v1beta.EkmMetadata)
  private static final com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata();
  }

  public static com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EkmMetadata> PARSER =
      new com.google.protobuf.AbstractParser<EkmMetadata>() {
        @java.lang.Override
        public EkmMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<EkmMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EkmMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
