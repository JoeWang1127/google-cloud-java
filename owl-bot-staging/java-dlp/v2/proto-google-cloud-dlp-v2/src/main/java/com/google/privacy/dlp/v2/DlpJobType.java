// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * An enum to represent the various types of DLP jobs.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.DlpJobType}
 */
public enum DlpJobType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Defaults to INSPECT_JOB.
   * </pre>
   *
   * <code>DLP_JOB_TYPE_UNSPECIFIED = 0;</code>
   */
  DLP_JOB_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The job inspected Google Cloud for sensitive data.
   * </pre>
   *
   * <code>INSPECT_JOB = 1;</code>
   */
  INSPECT_JOB(1),
  /**
   * <pre>
   * The job executed a Risk Analysis computation.
   * </pre>
   *
   * <code>RISK_ANALYSIS_JOB = 2;</code>
   */
  RISK_ANALYSIS_JOB(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Defaults to INSPECT_JOB.
   * </pre>
   *
   * <code>DLP_JOB_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DLP_JOB_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The job inspected Google Cloud for sensitive data.
   * </pre>
   *
   * <code>INSPECT_JOB = 1;</code>
   */
  public static final int INSPECT_JOB_VALUE = 1;
  /**
   * <pre>
   * The job executed a Risk Analysis computation.
   * </pre>
   *
   * <code>RISK_ANALYSIS_JOB = 2;</code>
   */
  public static final int RISK_ANALYSIS_JOB_VALUE = 2;


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
  public static DlpJobType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DlpJobType forNumber(int value) {
    switch (value) {
      case 0: return DLP_JOB_TYPE_UNSPECIFIED;
      case 1: return INSPECT_JOB;
      case 2: return RISK_ANALYSIS_JOB;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DlpJobType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DlpJobType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DlpJobType>() {
          public DlpJobType findValueByNumber(int number) {
            return DlpJobType.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(8);
  }

  private static final DlpJobType[] VALUES = values();

  public static DlpJobType valueOf(
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

  private DlpJobType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.DlpJobType)
}
