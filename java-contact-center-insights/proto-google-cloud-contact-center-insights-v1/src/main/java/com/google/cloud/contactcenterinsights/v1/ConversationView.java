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
 * Represents the options for viewing a conversation.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.contactcenterinsights.v1.ConversationView}
 */
public enum ConversationView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The conversation view is not specified.
   *
   * * Defaults to `FULL` in `GetConversationRequest`.
   * * Defaults to `BASIC` in `ListConversationsRequest`.
   * </pre>
   *
   * <code>CONVERSATION_VIEW_UNSPECIFIED = 0;</code>
   */
  CONVERSATION_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Populates all fields in the conversation.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  FULL(2),
  /**
   *
   *
   * <pre>
   * Populates all fields in the conversation except the transcript.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The conversation view is not specified.
   *
   * * Defaults to `FULL` in `GetConversationRequest`.
   * * Defaults to `BASIC` in `ListConversationsRequest`.
   * </pre>
   *
   * <code>CONVERSATION_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int CONVERSATION_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Populates all fields in the conversation.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  public static final int FULL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Populates all fields in the conversation except the transcript.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;

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
  public static ConversationView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConversationView forNumber(int value) {
    switch (value) {
      case 0:
        return CONVERSATION_VIEW_UNSPECIFIED;
      case 2:
        return FULL;
      case 1:
        return BASIC;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConversationView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ConversationView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ConversationView>() {
        public ConversationView findValueByNumber(int number) {
          return ConversationView.forNumber(number);
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
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final ConversationView[] VALUES = values();

  public static ConversationView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ConversationView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.contactcenterinsights.v1.ConversationView)
}
