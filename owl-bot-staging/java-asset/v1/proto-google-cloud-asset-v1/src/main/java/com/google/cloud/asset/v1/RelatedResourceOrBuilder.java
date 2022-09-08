// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public interface RelatedResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.RelatedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString
      getAssetTypeBytes();

  /**
   * <pre>
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   * @return The fullResourceName.
   */
  java.lang.String getFullResourceName();
  /**
   * <pre>
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   * @return The bytes for fullResourceName.
   */
  com.google.protobuf.ByteString
      getFullResourceNameBytes();
}