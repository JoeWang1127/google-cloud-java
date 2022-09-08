// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface BatchDeleteTestCasesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to delete test cases from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The agent to delete test cases from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the names.
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The count of names.
   */
  int getNamesCount();
  /**
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}