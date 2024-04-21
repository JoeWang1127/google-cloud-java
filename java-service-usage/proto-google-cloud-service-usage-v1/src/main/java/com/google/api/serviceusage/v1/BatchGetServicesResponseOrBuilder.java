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
// source: google/api/serviceusage/v1/serviceusage.proto

// Protobuf Java Version: 3.25.3
package com.google.api.serviceusage.v1;

public interface BatchGetServicesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.BatchGetServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The requested Service states.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  java.util.List<com.google.api.serviceusage.v1.Service> getServicesList();
  /**
   *
   *
   * <pre>
   * The requested Service states.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  com.google.api.serviceusage.v1.Service getServices(int index);
  /**
   *
   *
   * <pre>
   * The requested Service states.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  int getServicesCount();
  /**
   *
   *
   * <pre>
   * The requested Service states.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1.ServiceOrBuilder>
      getServicesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The requested Service states.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  com.google.api.serviceusage.v1.ServiceOrBuilder getServicesOrBuilder(int index);
}
