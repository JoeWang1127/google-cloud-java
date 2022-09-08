// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/attestation.proto

package io.grafeas.v1;

public interface JwtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Jwt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The compact encoding of a JWS, which is always three base64 encoded strings
   * joined by periods. For details, see:
   * https://tools.ietf.org/html/rfc7515.html#section-3.1
   * </pre>
   *
   * <code>string compact_jwt = 1;</code>
   * @return The compactJwt.
   */
  java.lang.String getCompactJwt();
  /**
   * <pre>
   * The compact encoding of a JWS, which is always three base64 encoded strings
   * joined by periods. For details, see:
   * https://tools.ietf.org/html/rfc7515.html#section-3.1
   * </pre>
   *
   * <code>string compact_jwt = 1;</code>
   * @return The bytes for compactJwt.
   */
  com.google.protobuf.ByteString
      getCompactJwtBytes();
}