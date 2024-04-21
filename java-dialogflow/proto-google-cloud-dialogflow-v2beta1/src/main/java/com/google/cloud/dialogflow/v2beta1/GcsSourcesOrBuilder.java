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
// source: google/cloud/dialogflow/v2beta1/gcs.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2beta1;

public interface GcsSourcesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.GcsSources)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the
   * form:
   * `gs://bucket/object-prefix-or-name`
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the uris.
   */
  java.util.List<java.lang.String> getUrisList();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the
   * form:
   * `gs://bucket/object-prefix-or-name`
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of uris.
   */
  int getUrisCount();
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the
   * form:
   * `gs://bucket/object-prefix-or-name`
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  java.lang.String getUris(int index);
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the
   * form:
   * `gs://bucket/object-prefix-or-name`
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  com.google.protobuf.ByteString getUrisBytes(int index);
}
