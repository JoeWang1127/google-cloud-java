// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 * <pre>
 * Device information collected from the job seeker, candidate, or
 * other entity conducting the job search. Providing this information improves
 * the quality of the search results across devices.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.DeviceInfo}
 */
public final class DeviceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.DeviceInfo)
    DeviceInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceInfo.newBuilder() to construct.
  private DeviceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceInfo() {
    deviceType_ = 0;
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();

            deviceType_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.cloud.talent.v4beta1.CommonProto.internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.CommonProto.internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.DeviceInfo.class, com.google.cloud.talent.v4beta1.DeviceInfo.Builder.class);
  }

  /**
   * <pre>
   * An enumeration describing an API access portal and exposure mechanism.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.talent.v4beta1.DeviceInfo.DeviceType}
   */
  public enum DeviceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The device type isn't specified.
     * </pre>
     *
     * <code>DEVICE_TYPE_UNSPECIFIED = 0;</code>
     */
    DEVICE_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * A desktop web browser, such as, Chrome, Firefox, Safari, or Internet
     * Explorer)
     * </pre>
     *
     * <code>WEB = 1;</code>
     */
    WEB(1),
    /**
     * <pre>
     * A mobile device web browser, such as a phone or tablet with a Chrome
     * browser.
     * </pre>
     *
     * <code>MOBILE_WEB = 2;</code>
     */
    MOBILE_WEB(2),
    /**
     * <pre>
     * An Android device native application.
     * </pre>
     *
     * <code>ANDROID = 3;</code>
     */
    ANDROID(3),
    /**
     * <pre>
     * An iOS device native application.
     * </pre>
     *
     * <code>IOS = 4;</code>
     */
    IOS(4),
    /**
     * <pre>
     * A bot, as opposed to a device operated by human beings, such as a web
     * crawler.
     * </pre>
     *
     * <code>BOT = 5;</code>
     */
    BOT(5),
    /**
     * <pre>
     * Other devices types.
     * </pre>
     *
     * <code>OTHER = 6;</code>
     */
    OTHER(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The device type isn't specified.
     * </pre>
     *
     * <code>DEVICE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int DEVICE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * A desktop web browser, such as, Chrome, Firefox, Safari, or Internet
     * Explorer)
     * </pre>
     *
     * <code>WEB = 1;</code>
     */
    public static final int WEB_VALUE = 1;
    /**
     * <pre>
     * A mobile device web browser, such as a phone or tablet with a Chrome
     * browser.
     * </pre>
     *
     * <code>MOBILE_WEB = 2;</code>
     */
    public static final int MOBILE_WEB_VALUE = 2;
    /**
     * <pre>
     * An Android device native application.
     * </pre>
     *
     * <code>ANDROID = 3;</code>
     */
    public static final int ANDROID_VALUE = 3;
    /**
     * <pre>
     * An iOS device native application.
     * </pre>
     *
     * <code>IOS = 4;</code>
     */
    public static final int IOS_VALUE = 4;
    /**
     * <pre>
     * A bot, as opposed to a device operated by human beings, such as a web
     * crawler.
     * </pre>
     *
     * <code>BOT = 5;</code>
     */
    public static final int BOT_VALUE = 5;
    /**
     * <pre>
     * Other devices types.
     * </pre>
     *
     * <code>OTHER = 6;</code>
     */
    public static final int OTHER_VALUE = 6;


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
    public static DeviceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DeviceType forNumber(int value) {
      switch (value) {
        case 0: return DEVICE_TYPE_UNSPECIFIED;
        case 1: return WEB;
        case 2: return MOBILE_WEB;
        case 3: return ANDROID;
        case 4: return IOS;
        case 5: return BOT;
        case 6: return OTHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeviceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DeviceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceType>() {
            public DeviceType findValueByNumber(int number) {
              return DeviceType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.talent.v4beta1.DeviceInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final DeviceType[] VALUES = values();

    public static DeviceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DeviceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.DeviceInfo.DeviceType)
  }

  public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
  private int deviceType_;
  /**
   * <pre>
   * Type of the device.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
   * @return The enum numeric value on the wire for deviceType.
   */
  @java.lang.Override public int getDeviceTypeValue() {
    return deviceType_;
  }
  /**
   * <pre>
   * Type of the device.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
   * @return The deviceType.
   */
  @java.lang.Override public com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType getDeviceType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType result = com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType.valueOf(deviceType_);
    return result == null ? com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType.UNRECOGNIZED : result;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * A device-specific ID. The ID must be a unique identifier that
   * distinguishes the device from other devices.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A device-specific ID. The ID must be a unique identifier that
   * distinguishes the device from other devices.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (deviceType_ != com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType.DEVICE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, deviceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceType_ != com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType.DEVICE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, deviceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.DeviceInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.DeviceInfo other = (com.google.cloud.talent.v4beta1.DeviceInfo) obj;

    if (deviceType_ != other.deviceType_) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEVICE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + deviceType_;
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.DeviceInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.talent.v4beta1.DeviceInfo prototype) {
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
   * Device information collected from the job seeker, candidate, or
   * other entity conducting the job search. Providing this information improves
   * the quality of the search results across devices.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.DeviceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.DeviceInfo)
      com.google.cloud.talent.v4beta1.DeviceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4beta1.CommonProto.internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.CommonProto.internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.DeviceInfo.class, com.google.cloud.talent.v4beta1.DeviceInfo.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.DeviceInfo.newBuilder()
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
      deviceType_ = 0;

      id_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.CommonProto.internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.DeviceInfo getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.DeviceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.DeviceInfo build() {
      com.google.cloud.talent.v4beta1.DeviceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.DeviceInfo buildPartial() {
      com.google.cloud.talent.v4beta1.DeviceInfo result = new com.google.cloud.talent.v4beta1.DeviceInfo(this);
      result.deviceType_ = deviceType_;
      result.id_ = id_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.DeviceInfo) {
        return mergeFrom((com.google.cloud.talent.v4beta1.DeviceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.DeviceInfo other) {
      if (other == com.google.cloud.talent.v4beta1.DeviceInfo.getDefaultInstance()) return this;
      if (other.deviceType_ != 0) {
        setDeviceTypeValue(other.getDeviceTypeValue());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
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
      com.google.cloud.talent.v4beta1.DeviceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.DeviceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int deviceType_ = 0;
    /**
     * <pre>
     * Type of the device.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
     * @return The enum numeric value on the wire for deviceType.
     */
    @java.lang.Override public int getDeviceTypeValue() {
      return deviceType_;
    }
    /**
     * <pre>
     * Type of the device.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
     * @param value The enum numeric value on the wire for deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceTypeValue(int value) {
      
      deviceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the device.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
     * @return The deviceType.
     */
    @java.lang.Override
    public com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType getDeviceType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType result = com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType.valueOf(deviceType_);
      return result == null ? com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the device.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
     * @param value The deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceType(com.google.cloud.talent.v4beta1.DeviceInfo.DeviceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      deviceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the device.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DeviceInfo.DeviceType device_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceType() {
      
      deviceType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * A device-specific ID. The ID must be a unique identifier that
     * distinguishes the device from other devices.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A device-specific ID. The ID must be a unique identifier that
     * distinguishes the device from other devices.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A device-specific ID. The ID must be a unique identifier that
     * distinguishes the device from other devices.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A device-specific ID. The ID must be a unique identifier that
     * distinguishes the device from other devices.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A device-specific ID. The ID must be a unique identifier that
     * distinguishes the device from other devices.
     * </pre>
     *
     * <code>string id = 2;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.DeviceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.DeviceInfo)
  private static final com.google.cloud.talent.v4beta1.DeviceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.DeviceInfo();
  }

  public static com.google.cloud.talent.v4beta1.DeviceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceInfo>
      PARSER = new com.google.protobuf.AbstractParser<DeviceInfo>() {
    @java.lang.Override
    public DeviceInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.DeviceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
