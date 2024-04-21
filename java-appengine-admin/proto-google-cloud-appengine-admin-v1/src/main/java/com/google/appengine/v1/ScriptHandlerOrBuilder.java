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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public interface ScriptHandlerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ScriptHandler)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script_path = 1;</code>
   *
   * @return The scriptPath.
   */
  java.lang.String getScriptPath();
  /**
   *
   *
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script_path = 1;</code>
   *
   * @return The bytes for scriptPath.
   */
  com.google.protobuf.ByteString getScriptPathBytes();
}
