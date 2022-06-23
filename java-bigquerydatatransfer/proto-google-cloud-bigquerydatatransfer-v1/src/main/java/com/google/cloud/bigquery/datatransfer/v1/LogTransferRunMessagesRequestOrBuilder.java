/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface LogTransferRunMessagesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the resource in the form:
   * "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource in the form:
   * "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Messages to append.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 2;
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage>
      getTransferMessagesList();
  /**
   *
   *
   * <pre>
   * Messages to append.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 2;
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferMessage getTransferMessages(int index);
  /**
   *
   *
   * <pre>
   * Messages to append.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 2;
   * </code>
   */
  int getTransferMessagesCount();
  /**
   *
   *
   * <pre>
   * Messages to append.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder>
      getTransferMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Messages to append.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 2;
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder getTransferMessagesOrBuilder(
      int index);
}
