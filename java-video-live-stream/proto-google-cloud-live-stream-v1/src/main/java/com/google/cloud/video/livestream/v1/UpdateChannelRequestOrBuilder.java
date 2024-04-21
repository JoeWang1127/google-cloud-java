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
// source: google/cloud/video/livestream/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.livestream.v1;

public interface UpdateChannelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.UpdateChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the Channel
   * resource by the update. You can only update the following fields:
   *
   * * [`inputAttachments`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#inputattachment)
   * * [`inputConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#inputconfig)
   * * [`output`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#output)
   * * [`elementaryStreams`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#elementarystream)
   * * [`muxStreams`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#muxstream)
   * * [`manifests`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#manifest)
   * * [`spriteSheets`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#spritesheet)
   * * [`logConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#logconfig)
   * * [`timecodeConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#timecodeconfig)
   * * [`encryptions`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#encryption)
   *
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask.
   *
   * If the mask is not present, then each field from the list above is updated
   * if the field appears in the request payload. To unset a field, add the
   * field to the update mask and remove it from the request payload.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the Channel
   * resource by the update. You can only update the following fields:
   *
   * * [`inputAttachments`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#inputattachment)
   * * [`inputConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#inputconfig)
   * * [`output`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#output)
   * * [`elementaryStreams`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#elementarystream)
   * * [`muxStreams`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#muxstream)
   * * [`manifests`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#manifest)
   * * [`spriteSheets`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#spritesheet)
   * * [`logConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#logconfig)
   * * [`timecodeConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#timecodeconfig)
   * * [`encryptions`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#encryption)
   *
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask.
   *
   * If the mask is not present, then each field from the list above is updated
   * if the field appears in the request payload. To unset a field, add the
   * field to the update mask and remove it from the request payload.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the Channel
   * resource by the update. You can only update the following fields:
   *
   * * [`inputAttachments`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#inputattachment)
   * * [`inputConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#inputconfig)
   * * [`output`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#output)
   * * [`elementaryStreams`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#elementarystream)
   * * [`muxStreams`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#muxstream)
   * * [`manifests`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#manifest)
   * * [`spriteSheets`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#spritesheet)
   * * [`logConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#logconfig)
   * * [`timecodeConfig`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#timecodeconfig)
   * * [`encryptions`](https://cloud.google.com/livestream/docs/reference/rest/v1/projects.locations.channels#encryption)
   *
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask.
   *
   * If the mask is not present, then each field from the list above is updated
   * if the field appears in the request payload. To unset a field, add the
   * field to the update mask and remove it from the request payload.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The channel resource to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Channel channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   *
   *
   * <pre>
   * Required. The channel resource to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Channel channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channel.
   */
  com.google.cloud.video.livestream.v1.Channel getChannel();
  /**
   *
   *
   * <pre>
   * Required. The channel resource to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Channel channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.video.livestream.v1.ChannelOrBuilder getChannelOrBuilder();

  /**
   *
   *
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported `(00000000-0000-0000-0000-000000000000)`.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported `(00000000-0000-0000-0000-000000000000)`.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
