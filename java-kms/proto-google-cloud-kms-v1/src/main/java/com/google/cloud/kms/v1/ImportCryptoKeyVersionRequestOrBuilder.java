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
// source: google/cloud/kms/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.kms.v1;

public interface ImportCryptoKeyVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ImportCryptoKeyVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] to be imported into.
   *
   * The create permission is only required on this key when creating a new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] to be imported into.
   *
   * The create permission is only required on this key when creating a new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The optional [name][google.cloud.kms.v1.CryptoKeyVersion.name] of
   * an existing [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to
   * target for an import operation. If this field is not present, a new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] containing the
   * supplied key material is created.
   *
   * If this field is present, the supplied key material is imported into
   * the existing [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. To
   * import into an existing
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] must be a child of
   * [ImportCryptoKeyVersionRequest.parent][google.cloud.kms.v1.ImportCryptoKeyVersionRequest.parent],
   * have been previously created via [ImportCryptoKeyVersion][], and be in
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED]
   * or
   * [IMPORT_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.IMPORT_FAILED]
   * state. The key material and algorithm must match the previous
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] exactly if the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] has ever contained
   * key material.
   * </pre>
   *
   * <code>
   * string crypto_key_version = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The cryptoKeyVersion.
   */
  java.lang.String getCryptoKeyVersion();
  /**
   *
   *
   * <pre>
   * Optional. The optional [name][google.cloud.kms.v1.CryptoKeyVersion.name] of
   * an existing [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to
   * target for an import operation. If this field is not present, a new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] containing the
   * supplied key material is created.
   *
   * If this field is present, the supplied key material is imported into
   * the existing [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. To
   * import into an existing
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] must be a child of
   * [ImportCryptoKeyVersionRequest.parent][google.cloud.kms.v1.ImportCryptoKeyVersionRequest.parent],
   * have been previously created via [ImportCryptoKeyVersion][], and be in
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED]
   * or
   * [IMPORT_FAILED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.IMPORT_FAILED]
   * state. The key material and algorithm must match the previous
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] exactly if the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] has ever contained
   * key material.
   * </pre>
   *
   * <code>
   * string crypto_key_version = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for cryptoKeyVersion.
   */
  com.google.protobuf.ByteString getCryptoKeyVersionBytes();

  /**
   *
   *
   * <pre>
   * Required. The
   * [algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm]
   * of the key being imported. This does not need to match the
   * [version_template][google.cloud.kms.v1.CryptoKey.version_template] of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] this version imports into.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   *
   *
   * <pre>
   * Required. The
   * [algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm]
   * of the key being imported. This does not need to match the
   * [version_template][google.cloud.kms.v1.CryptoKey.version_template] of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] this version imports into.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The algorithm.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm();

  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.ImportJob.name] of the
   * [ImportJob][google.cloud.kms.v1.ImportJob] that was used to wrap this key
   * material.
   * </pre>
   *
   * <code>string import_job = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The importJob.
   */
  java.lang.String getImportJob();
  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.ImportJob.name] of the
   * [ImportJob][google.cloud.kms.v1.ImportJob] that was used to wrap this key
   * material.
   * </pre>
   *
   * <code>string import_job = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for importJob.
   */
  com.google.protobuf.ByteString getImportJobBytes();

  /**
   *
   *
   * <pre>
   * Optional. The wrapped key material to import.
   *
   * Before wrapping, key material must be formatted. If importing symmetric key
   * material, the expected key material format is plain bytes. If importing
   * asymmetric key material, the expected key material format is PKCS#8-encoded
   * DER (the PrivateKeyInfo structure from RFC 5208).
   *
   * When wrapping with import methods
   * ([RSA_OAEP_3072_SHA1_AES_256][google.cloud.kms.v1.ImportJob.ImportMethod.RSA_OAEP_3072_SHA1_AES_256]
   * or
   * [RSA_OAEP_4096_SHA1_AES_256][google.cloud.kms.v1.ImportJob.ImportMethod.RSA_OAEP_4096_SHA1_AES_256]
   * or
   * [RSA_OAEP_3072_SHA256_AES_256][google.cloud.kms.v1.ImportJob.ImportMethod.RSA_OAEP_3072_SHA256_AES_256]
   * or
   * [RSA_OAEP_4096_SHA256_AES_256][google.cloud.kms.v1.ImportJob.ImportMethod.RSA_OAEP_4096_SHA256_AES_256]),
   *
   * this field must contain the concatenation of:
   * &lt;ol&gt;
   *   &lt;li&gt;An ephemeral AES-256 wrapping key wrapped with the
   *       [public_key][google.cloud.kms.v1.ImportJob.public_key] using
   *       RSAES-OAEP with SHA-1/SHA-256, MGF1 with SHA-1/SHA-256, and an empty
   *       label.
   *   &lt;/li&gt;
   *   &lt;li&gt;The formatted key to be imported, wrapped with the ephemeral AES-256
   *       key using AES-KWP (RFC 5649).
   *   &lt;/li&gt;
   * &lt;/ol&gt;
   *
   * This format is the same as the format produced by PKCS#11 mechanism
   * CKM_RSA_AES_KEY_WRAP.
   *
   * When wrapping with import methods
   * ([RSA_OAEP_3072_SHA256][google.cloud.kms.v1.ImportJob.ImportMethod.RSA_OAEP_3072_SHA256]
   * or
   * [RSA_OAEP_4096_SHA256][google.cloud.kms.v1.ImportJob.ImportMethod.RSA_OAEP_4096_SHA256]),
   *
   * this field must contain the formatted key to be imported, wrapped with the
   * [public_key][google.cloud.kms.v1.ImportJob.public_key] using RSAES-OAEP
   * with SHA-256, MGF1 with SHA-256, and an empty label.
   * </pre>
   *
   * <code>bytes wrapped_key = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The wrappedKey.
   */
  com.google.protobuf.ByteString getWrappedKey();

  /**
   *
   *
   * <pre>
   * Optional. This field has the same meaning as
   * [wrapped_key][google.cloud.kms.v1.ImportCryptoKeyVersionRequest.wrapped_key].
   * Prefer to use that field in new work. Either that field or this field
   * (but not both) must be specified.
   * </pre>
   *
   * <code>bytes rsa_aes_wrapped_key = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the rsaAesWrappedKey field is set.
   */
  boolean hasRsaAesWrappedKey();
  /**
   *
   *
   * <pre>
   * Optional. This field has the same meaning as
   * [wrapped_key][google.cloud.kms.v1.ImportCryptoKeyVersionRequest.wrapped_key].
   * Prefer to use that field in new work. Either that field or this field
   * (but not both) must be specified.
   * </pre>
   *
   * <code>bytes rsa_aes_wrapped_key = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rsaAesWrappedKey.
   */
  com.google.protobuf.ByteString getRsaAesWrappedKey();

  com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest.WrappedKeyMaterialCase
      getWrappedKeyMaterialCase();
}
