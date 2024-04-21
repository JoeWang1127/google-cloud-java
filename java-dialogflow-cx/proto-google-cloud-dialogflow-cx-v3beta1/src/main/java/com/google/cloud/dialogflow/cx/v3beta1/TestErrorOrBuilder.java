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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface TestErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TestError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The test case resource name.
   * </pre>
   *
   * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The testCase.
   */
  java.lang.String getTestCase();
  /**
   *
   *
   * <pre>
   * The test case resource name.
   * </pre>
   *
   * <code>string test_case = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for testCase.
   */
  com.google.protobuf.ByteString getTestCaseBytes();

  /**
   *
   *
   * <pre>
   * The status associated with the test.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * The status associated with the test.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * The status associated with the test.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The timestamp when the test was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 3;</code>
   *
   * @return Whether the testTime field is set.
   */
  boolean hasTestTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the test was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 3;</code>
   *
   * @return The testTime.
   */
  com.google.protobuf.Timestamp getTestTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the test was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp test_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTestTimeOrBuilder();
}
