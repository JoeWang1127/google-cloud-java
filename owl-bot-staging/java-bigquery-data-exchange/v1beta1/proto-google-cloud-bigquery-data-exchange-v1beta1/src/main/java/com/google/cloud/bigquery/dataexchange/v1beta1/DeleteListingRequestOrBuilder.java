// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

public interface DeleteListingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.DeleteListingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the listing to delete.
   * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the listing to delete.
   * e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}