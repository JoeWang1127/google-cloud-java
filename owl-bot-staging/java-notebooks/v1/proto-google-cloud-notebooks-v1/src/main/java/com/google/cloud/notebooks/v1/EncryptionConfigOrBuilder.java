// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public interface EncryptionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.EncryptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Cloud KMS resource identifier of the customer-managed encryption key
   * used to protect a resource, such as a disks. It has the following
   * format:
   * `projects/{PROJECT_ID}/locations/{REGION}/keyRings/{KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
   * </pre>
   *
   * <code>string kms_key = 1;</code>
   * @return The kmsKey.
   */
  java.lang.String getKmsKey();
  /**
   * <pre>
   * The Cloud KMS resource identifier of the customer-managed encryption key
   * used to protect a resource, such as a disks. It has the following
   * format:
   * `projects/{PROJECT_ID}/locations/{REGION}/keyRings/{KEY_RING_NAME}/cryptoKeys/{KEY_NAME}`
   * </pre>
   *
   * <code>string kms_key = 1;</code>
   * @return The bytes for kmsKey.
   */
  com.google.protobuf.ByteString
      getKmsKeyBytes();
}