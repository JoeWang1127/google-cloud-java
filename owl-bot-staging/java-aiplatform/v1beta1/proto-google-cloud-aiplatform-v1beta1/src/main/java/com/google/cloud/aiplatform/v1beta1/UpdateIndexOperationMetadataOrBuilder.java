// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdateIndexOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateIndexOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata();
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();

  /**
   * <pre>
   * The operation metadata with regard to Matching Engine Index operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
   * @return Whether the nearestNeighborSearchOperationMetadata field is set.
   */
  boolean hasNearestNeighborSearchOperationMetadata();
  /**
   * <pre>
   * The operation metadata with regard to Matching Engine Index operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
   * @return The nearestNeighborSearchOperationMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata getNearestNeighborSearchOperationMetadata();
  /**
   * <pre>
   * The operation metadata with regard to Matching Engine Index operation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadata nearest_neighbor_search_operation_metadata = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.NearestNeighborSearchOperationMetadataOrBuilder getNearestNeighborSearchOperationMetadataOrBuilder();
}