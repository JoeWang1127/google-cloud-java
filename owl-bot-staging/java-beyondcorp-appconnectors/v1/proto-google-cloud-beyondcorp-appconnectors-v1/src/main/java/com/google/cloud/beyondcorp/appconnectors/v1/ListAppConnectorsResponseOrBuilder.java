// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnectors/v1/app_connectors_service.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public interface ListAppConnectorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnectors.v1.ListAppConnectorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of BeyondCorp AppConnectors in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connectors = 1;</code>
   */
  java.util.List<com.google.cloud.beyondcorp.appconnectors.v1.AppConnector> 
      getAppConnectorsList();
  /**
   * <pre>
   * A list of BeyondCorp AppConnectors in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connectors = 1;</code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.AppConnector getAppConnectors(int index);
  /**
   * <pre>
   * A list of BeyondCorp AppConnectors in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connectors = 1;</code>
   */
  int getAppConnectorsCount();
  /**
   * <pre>
   * A list of BeyondCorp AppConnectors in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connectors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorOrBuilder> 
      getAppConnectorsOrBuilderList();
  /**
   * <pre>
   * A list of BeyondCorp AppConnectors in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connectors = 1;</code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorOrBuilder getAppConnectorsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * A list of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * A list of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * A list of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * A list of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}