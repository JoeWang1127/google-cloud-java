// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

public interface UpdateAnswerRecordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.UpdateAnswerRecordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Answer record to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AnswerRecord answer_record = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the answerRecord field is set.
   */
  boolean hasAnswerRecord();
  /**
   * <pre>
   * Required. Answer record to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AnswerRecord answer_record = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The answerRecord.
   */
  com.google.cloud.dialogflow.v2.AnswerRecord getAnswerRecord();
  /**
   * <pre>
   * Required. Answer record to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AnswerRecord answer_record = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder getAnswerRecordOrBuilder();

  /**
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}