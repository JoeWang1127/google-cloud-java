// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnectors/v1/app_connectors_service.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public interface GetAppConnectorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnectors.v1.GetAppConnectorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. BeyondCorp AppConnector name using the form:
   * `projects/{project_id}/locations/{location_id}/appConnectors/{app_connector_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. BeyondCorp AppConnector name using the form:
   * `projects/{project_id}/locations/{location_id}/appConnectors/{app_connector_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}