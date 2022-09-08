// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

public interface CloudRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.CloudRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Cloud Run service being addressed. See
   * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
   * Only services located in the same project as the trigger object
   * can be addressed.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * Required. The name of the Cloud Run service being addressed. See
   * https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services.
   * Only services located in the same project as the trigger object
   * can be addressed.
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * Optional. The relative path on the Cloud Run service the events should be sent to.
   * The value must conform to the definition of a URI path segment (section 3.3
   * of RFC2396). Examples: "/route", "route", "route/subroute".
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Optional. The relative path on the Cloud Run service the events should be sent to.
   * The value must conform to the definition of a URI path segment (section 3.3
   * of RFC2396). Examples: "/route", "route", "route/subroute".
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Required. The region the Cloud Run service is deployed in.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Required. The region the Cloud Run service is deployed in.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();
}