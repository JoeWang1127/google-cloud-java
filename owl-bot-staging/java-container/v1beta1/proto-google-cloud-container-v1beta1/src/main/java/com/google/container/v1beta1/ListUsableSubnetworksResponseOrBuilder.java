// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface ListUsableSubnetworksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListUsableSubnetworksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of usable subnetworks in the specified network project.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.UsableSubnetwork subnetworks = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.UsableSubnetwork> 
      getSubnetworksList();
  /**
   * <pre>
   * A list of usable subnetworks in the specified network project.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.UsableSubnetwork subnetworks = 1;</code>
   */
  com.google.container.v1beta1.UsableSubnetwork getSubnetworks(int index);
  /**
   * <pre>
   * A list of usable subnetworks in the specified network project.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.UsableSubnetwork subnetworks = 1;</code>
   */
  int getSubnetworksCount();
  /**
   * <pre>
   * A list of usable subnetworks in the specified network project.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.UsableSubnetwork subnetworks = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.UsableSubnetworkOrBuilder> 
      getSubnetworksOrBuilderList();
  /**
   * <pre>
   * A list of usable subnetworks in the specified network project.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.UsableSubnetwork subnetworks = 1;</code>
   */
  com.google.container.v1beta1.UsableSubnetworkOrBuilder getSubnetworksOrBuilder(
      int index);

  /**
   * <pre>
   * This token allows you to get the next page of results for list requests.
   * If the number of results is larger than `page_size`, use the
   * `next_page_token` as a value for the query parameter `page_token` in the
   * next request. The value will become empty when there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * This token allows you to get the next page of results for list requests.
   * If the number of results is larger than `page_size`, use the
   * `next_page_token` as a value for the query parameter `page_token` in the
   * next request. The value will become empty when there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}