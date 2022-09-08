// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/service.proto

package com.google.cloud.gkehub.v1beta;

public interface UpdateFeatureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta.UpdateFeatureRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Feature resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;features/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The Feature resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;features/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Only fields specified in update_mask are updated.
   * If you specify a field in the update_mask but don't specify its value here
   * that field will be deleted.
   * If you are updating a map field, set the value of a key to null or empty
   * string to delete the key from the map. It's not possible to update a key's
   * value to the empty string.
   * If you specify the update_mask to be a special path "*", fully replaces all
   * user-modifiable fields to match `resource`.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.Feature resource = 3;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * Only fields specified in update_mask are updated.
   * If you specify a field in the update_mask but don't specify its value here
   * that field will be deleted.
   * If you are updating a map field, set the value of a key to null or empty
   * string to delete the key from the map. It's not possible to update a key's
   * value to the empty string.
   * If you specify the update_mask to be a special path "*", fully replaces all
   * user-modifiable fields to match `resource`.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.Feature resource = 3;</code>
   * @return The resource.
   */
  com.google.cloud.gkehub.v1beta.Feature getResource();
  /**
   * <pre>
   * Only fields specified in update_mask are updated.
   * If you specify a field in the update_mask but don't specify its value here
   * that field will be deleted.
   * If you are updating a map field, set the value of a key to null or empty
   * string to delete the key from the map. It's not possible to update a key's
   * value to the empty string.
   * If you specify the update_mask to be a special path "*", fully replaces all
   * user-modifiable fields to match `resource`.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta.Feature resource = 3;</code>
   */
  com.google.cloud.gkehub.v1beta.FeatureOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}