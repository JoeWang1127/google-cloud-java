// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

public interface ApproveDecisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.ApproveDecision)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time at which approval was granted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp approve_time = 1;</code>
   * @return Whether the approveTime field is set.
   */
  boolean hasApproveTime();
  /**
   * <pre>
   * The time at which approval was granted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp approve_time = 1;</code>
   * @return The approveTime.
   */
  com.google.protobuf.Timestamp getApproveTime();
  /**
   * <pre>
   * The time at which approval was granted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp approve_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getApproveTimeOrBuilder();

  /**
   * <pre>
   * The time at which the approval expires.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * The time at which the approval expires.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <pre>
   * The time at which the approval expires.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   * <pre>
   * If set, denotes the timestamp at which the approval is invalidated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp invalidate_time = 3;</code>
   * @return Whether the invalidateTime field is set.
   */
  boolean hasInvalidateTime();
  /**
   * <pre>
   * If set, denotes the timestamp at which the approval is invalidated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp invalidate_time = 3;</code>
   * @return The invalidateTime.
   */
  com.google.protobuf.Timestamp getInvalidateTime();
  /**
   * <pre>
   * If set, denotes the timestamp at which the approval is invalidated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp invalidate_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInvalidateTimeOrBuilder();

  /**
   * <pre>
   * The signature for the ApprovalRequest and details on how it was signed.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.SignatureInfo signature_info = 4;</code>
   * @return Whether the signatureInfo field is set.
   */
  boolean hasSignatureInfo();
  /**
   * <pre>
   * The signature for the ApprovalRequest and details on how it was signed.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.SignatureInfo signature_info = 4;</code>
   * @return The signatureInfo.
   */
  com.google.cloud.accessapproval.v1.SignatureInfo getSignatureInfo();
  /**
   * <pre>
   * The signature for the ApprovalRequest and details on how it was signed.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.SignatureInfo signature_info = 4;</code>
   */
  com.google.cloud.accessapproval.v1.SignatureInfoOrBuilder getSignatureInfoOrBuilder();

  /**
   * <pre>
   * True when the request has been auto-approved.
   * </pre>
   *
   * <code>bool auto_approved = 5;</code>
   * @return The autoApproved.
   */
  boolean getAutoApproved();
}