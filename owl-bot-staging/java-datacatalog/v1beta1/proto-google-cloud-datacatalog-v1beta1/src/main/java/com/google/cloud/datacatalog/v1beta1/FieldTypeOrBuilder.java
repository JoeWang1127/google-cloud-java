// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog.v1beta1;

public interface FieldTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.FieldType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents primitive types - string, bool etc.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType.PrimitiveType primitive_type = 1;</code>
   * @return Whether the primitiveType field is set.
   */
  boolean hasPrimitiveType();
  /**
   * <pre>
   * Represents primitive types - string, bool etc.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType.PrimitiveType primitive_type = 1;</code>
   * @return The enum numeric value on the wire for primitiveType.
   */
  int getPrimitiveTypeValue();
  /**
   * <pre>
   * Represents primitive types - string, bool etc.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType.PrimitiveType primitive_type = 1;</code>
   * @return The primitiveType.
   */
  com.google.cloud.datacatalog.v1beta1.FieldType.PrimitiveType getPrimitiveType();

  /**
   * <pre>
   * Represents an enum type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType.EnumType enum_type = 2;</code>
   * @return Whether the enumType field is set.
   */
  boolean hasEnumType();
  /**
   * <pre>
   * Represents an enum type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType.EnumType enum_type = 2;</code>
   * @return The enumType.
   */
  com.google.cloud.datacatalog.v1beta1.FieldType.EnumType getEnumType();
  /**
   * <pre>
   * Represents an enum type.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType.EnumType enum_type = 2;</code>
   */
  com.google.cloud.datacatalog.v1beta1.FieldType.EnumTypeOrBuilder getEnumTypeOrBuilder();

  public com.google.cloud.datacatalog.v1beta1.FieldType.TypeDeclCase getTypeDeclCase();
}