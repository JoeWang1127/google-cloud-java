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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Represents the action responsible for properties update operations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.DataUpdateAction}
 */
public final class DataUpdateAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.DataUpdateAction)
    DataUpdateActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataUpdateAction.newBuilder() to construct.
  private DataUpdateAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataUpdateAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataUpdateAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetEntries();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.DataUpdateAction.class,
            com.google.cloud.contentwarehouse.v1.DataUpdateAction.Builder.class);
  }

  public static final int ENTRIES_FIELD_NUMBER = 1;

  private static final class EntriesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.contentwarehouse.v1.RuleEngineProto
                .internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_EntriesEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> entries_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetEntries() {
    if (entries_ == null) {
      return com.google.protobuf.MapField.emptyMapField(EntriesDefaultEntryHolder.defaultEntry);
    }
    return entries_;
  }

  public int getEntriesCount() {
    return internalGetEntries().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  @java.lang.Override
  public boolean containsEntries(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetEntries().getMap().containsKey(key);
  }
  /** Use {@link #getEntriesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getEntries() {
    return getEntriesMap();
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getEntriesMap() {
    return internalGetEntries().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getEntriesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetEntries().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (valid name of the field, new value of the field)
   * E.g., ("age", "60") entry triggers update of field age with a value of 60.
   * If the field is not present then new entry is added.
   * During update action execution, value strings will be casted to
   * appropriate types.
   * </pre>
   *
   * <code>map&lt;string, string&gt; entries = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getEntriesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetEntries().getMap();
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetEntries(), EntriesDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetEntries().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> entries__ =
          EntriesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entries__);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.DataUpdateAction)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.DataUpdateAction other =
        (com.google.cloud.contentwarehouse.v1.DataUpdateAction) obj;

    if (!internalGetEntries().equals(other.internalGetEntries())) return false;
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
    if (!internalGetEntries().getMap().isEmpty()) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetEntries().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction parseFrom(
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
      com.google.cloud.contentwarehouse.v1.DataUpdateAction prototype) {
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
   * Represents the action responsible for properties update operations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.DataUpdateAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.DataUpdateAction)
      com.google.cloud.contentwarehouse.v1.DataUpdateActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetEntries();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableEntries();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.DataUpdateAction.class,
              com.google.cloud.contentwarehouse.v1.DataUpdateAction.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.DataUpdateAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableEntries().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DataUpdateAction getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.DataUpdateAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DataUpdateAction build() {
      com.google.cloud.contentwarehouse.v1.DataUpdateAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DataUpdateAction buildPartial() {
      com.google.cloud.contentwarehouse.v1.DataUpdateAction result =
          new com.google.cloud.contentwarehouse.v1.DataUpdateAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.DataUpdateAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entries_ = internalGetEntries();
        result.entries_.makeImmutable();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.DataUpdateAction) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.DataUpdateAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.DataUpdateAction other) {
      if (other == com.google.cloud.contentwarehouse.v1.DataUpdateAction.getDefaultInstance())
        return this;
      internalGetMutableEntries().mergeFrom(other.internalGetEntries());
      bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> entries__ =
                    input.readMessage(
                        EntriesDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableEntries()
                    .getMutableMap()
                    .put(entries__.getKey(), entries__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> entries_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetEntries() {
      if (entries_ == null) {
        return com.google.protobuf.MapField.emptyMapField(EntriesDefaultEntryHolder.defaultEntry);
      }
      return entries_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableEntries() {
      if (entries_ == null) {
        entries_ = com.google.protobuf.MapField.newMapField(EntriesDefaultEntryHolder.defaultEntry);
      }
      if (!entries_.isMutable()) {
        entries_ = entries_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return entries_;
    }

    public int getEntriesCount() {
      return internalGetEntries().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    @java.lang.Override
    public boolean containsEntries(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetEntries().getMap().containsKey(key);
    }
    /** Use {@link #getEntriesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getEntries() {
      return getEntriesMap();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getEntriesMap() {
      return internalGetEntries().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getEntriesOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetEntries().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getEntriesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetEntries().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearEntries() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableEntries().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    public Builder removeEntries(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableEntries().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableEntries() {
      bitField0_ |= 0x00000001;
      return internalGetMutableEntries().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    public Builder putEntries(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableEntries().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (valid name of the field, new value of the field)
     * E.g., ("age", "60") entry triggers update of field age with a value of 60.
     * If the field is not present then new entry is added.
     * During update action execution, value strings will be casted to
     * appropriate types.
     * </pre>
     *
     * <code>map&lt;string, string&gt; entries = 1;</code>
     */
    public Builder putAllEntries(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableEntries().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.DataUpdateAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.DataUpdateAction)
  private static final com.google.cloud.contentwarehouse.v1.DataUpdateAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.DataUpdateAction();
  }

  public static com.google.cloud.contentwarehouse.v1.DataUpdateAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataUpdateAction> PARSER =
      new com.google.protobuf.AbstractParser<DataUpdateAction>() {
        @java.lang.Override
        public DataUpdateAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataUpdateAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataUpdateAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DataUpdateAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
