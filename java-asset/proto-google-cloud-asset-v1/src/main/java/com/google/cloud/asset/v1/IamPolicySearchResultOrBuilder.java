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
// source: google/cloud/asset/v1/assets.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.asset.v1;

public interface IamPolicySearchResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.IamPolicySearchResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of the resource associated with this IAM policy.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Cloud Asset Inventory Resource Name
   * Format](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * for more information.
   *
   * To search against the `resource`:
   *
   * * use a field query. Example: `resource:organizations/123`
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * The full resource name of the resource associated with this IAM policy.
   * Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Cloud Asset Inventory Resource Name
   * Format](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * for more information.
   *
   * To search against the `resource`:
   *
   * * use a field query. Example: `resource:organizations/123`
   * </pre>
   *
   * <code>string resource = 1;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The type of the resource associated with this IAM policy. Example:
   * `compute.googleapis.com/Disk`.
   *
   * To search against the `asset_type`:
   *
   * * specify the `asset_types` field in your search request.
   * </pre>
   *
   * <code>string asset_type = 5;</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * The type of the resource associated with this IAM policy. Example:
   * `compute.googleapis.com/Disk`.
   *
   * To search against the `asset_type`:
   *
   * * specify the `asset_types` field in your search request.
   * </pre>
   *
   * <code>string asset_type = 5;</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * The project that the associated Google Cloud resource belongs to, in the
   * form of projects/{PROJECT_NUMBER}. If an IAM policy is set on a resource
   * (like VM instance, Cloud Storage bucket), the project field will indicate
   * the project that contains the resource. If an IAM policy is set on a folder
   * or orgnization, this field will be empty.
   *
   * To search against the `project`:
   *
   * * specify the `scope` field as this project in your search request.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The project that the associated Google Cloud resource belongs to, in the
   * form of projects/{PROJECT_NUMBER}. If an IAM policy is set on a resource
   * (like VM instance, Cloud Storage bucket), the project field will indicate
   * the project that contains the resource. If an IAM policy is set on a folder
   * or orgnization, this field will be empty.
   *
   * To search against the `project`:
   *
   * * specify the `scope` field as this project in your search request.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The folder(s) that the IAM policy belongs to, in the form of
   * folders/{FOLDER_NUMBER}. This field is available when the IAM policy
   * belongs to one or more folders.
   *
   * To search against `folders`:
   *
   * * use a field query. Example: `folders:(123 OR 456)`
   * * use a free text query. Example: `123`
   * * specify the `scope` field as this folder in your search request.
   * </pre>
   *
   * <code>repeated string folders = 6;</code>
   *
   * @return A list containing the folders.
   */
  java.util.List<java.lang.String> getFoldersList();
  /**
   *
   *
   * <pre>
   * The folder(s) that the IAM policy belongs to, in the form of
   * folders/{FOLDER_NUMBER}. This field is available when the IAM policy
   * belongs to one or more folders.
   *
   * To search against `folders`:
   *
   * * use a field query. Example: `folders:(123 OR 456)`
   * * use a free text query. Example: `123`
   * * specify the `scope` field as this folder in your search request.
   * </pre>
   *
   * <code>repeated string folders = 6;</code>
   *
   * @return The count of folders.
   */
  int getFoldersCount();
  /**
   *
   *
   * <pre>
   * The folder(s) that the IAM policy belongs to, in the form of
   * folders/{FOLDER_NUMBER}. This field is available when the IAM policy
   * belongs to one or more folders.
   *
   * To search against `folders`:
   *
   * * use a field query. Example: `folders:(123 OR 456)`
   * * use a free text query. Example: `123`
   * * specify the `scope` field as this folder in your search request.
   * </pre>
   *
   * <code>repeated string folders = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The folders at the given index.
   */
  java.lang.String getFolders(int index);
  /**
   *
   *
   * <pre>
   * The folder(s) that the IAM policy belongs to, in the form of
   * folders/{FOLDER_NUMBER}. This field is available when the IAM policy
   * belongs to one or more folders.
   *
   * To search against `folders`:
   *
   * * use a field query. Example: `folders:(123 OR 456)`
   * * use a free text query. Example: `123`
   * * specify the `scope` field as this folder in your search request.
   * </pre>
   *
   * <code>repeated string folders = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the folders at the given index.
   */
  com.google.protobuf.ByteString getFoldersBytes(int index);

  /**
   *
   *
   * <pre>
   * The organization that the IAM policy belongs to, in the form
   * of organizations/{ORGANIZATION_NUMBER}. This field is available when the
   * IAM policy belongs to an organization.
   *
   * To search against `organization`:
   *
   * * use a field query. Example: `organization:123`
   * * use a free text query. Example: `123`
   * * specify the `scope` field as this organization in your search request.
   * </pre>
   *
   * <code>string organization = 7;</code>
   *
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   *
   *
   * <pre>
   * The organization that the IAM policy belongs to, in the form
   * of organizations/{ORGANIZATION_NUMBER}. This field is available when the
   * IAM policy belongs to an organization.
   *
   * To search against `organization`:
   *
   * * use a field query. Example: `organization:123`
   * * use a free text query. Example: `123`
   * * specify the `scope` field as this organization in your search request.
   * </pre>
   *
   * <code>string organization = 7;</code>
   *
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString getOrganizationBytes();

  /**
   *
   *
   * <pre>
   * The IAM policy directly set on the given resource. Note that the original
   * IAM policy can contain multiple bindings. This only contains the bindings
   * that match the given query. For queries that don't contain a constrain on
   * policies (e.g., an empty query), this contains all the bindings.
   *
   * To search against the `policy` bindings:
   *
   * * use a field query:
   *     - query by the policy contained members. Example:
   *       `policy:amy&#64;gmail.com`
   *     - query by the policy contained roles. Example:
   *       `policy:roles/compute.admin`
   *     - query by the policy contained roles' included permissions. Example:
   *       `policy.role.permissions:compute.instances.create`
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 3;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The IAM policy directly set on the given resource. Note that the original
   * IAM policy can contain multiple bindings. This only contains the bindings
   * that match the given query. For queries that don't contain a constrain on
   * policies (e.g., an empty query), this contains all the bindings.
   *
   * To search against the `policy` bindings:
   *
   * * use a field query:
   *     - query by the policy contained members. Example:
   *       `policy:amy&#64;gmail.com`
   *     - query by the policy contained roles. Example:
   *       `policy:roles/compute.admin`
   *     - query by the policy contained roles' included permissions. Example:
   *       `policy.role.permissions:compute.instances.create`
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 3;</code>
   *
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * The IAM policy directly set on the given resource. Note that the original
   * IAM policy can contain multiple bindings. This only contains the bindings
   * that match the given query. For queries that don't contain a constrain on
   * policies (e.g., an empty query), this contains all the bindings.
   *
   * To search against the `policy` bindings:
   *
   * * use a field query:
   *     - query by the policy contained members. Example:
   *       `policy:amy&#64;gmail.com`
   *     - query by the policy contained roles. Example:
   *       `policy:roles/compute.admin`
   *     - query by the policy contained roles' included permissions. Example:
   *       `policy.role.permissions:compute.instances.create`
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 3;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Explanation about the IAM policy search result. It contains additional
   * information to explain why the search result matches the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.IamPolicySearchResult.Explanation explanation = 4;</code>
   *
   * @return Whether the explanation field is set.
   */
  boolean hasExplanation();
  /**
   *
   *
   * <pre>
   * Explanation about the IAM policy search result. It contains additional
   * information to explain why the search result matches the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.IamPolicySearchResult.Explanation explanation = 4;</code>
   *
   * @return The explanation.
   */
  com.google.cloud.asset.v1.IamPolicySearchResult.Explanation getExplanation();
  /**
   *
   *
   * <pre>
   * Explanation about the IAM policy search result. It contains additional
   * information to explain why the search result matches the query.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.IamPolicySearchResult.Explanation explanation = 4;</code>
   */
  com.google.cloud.asset.v1.IamPolicySearchResult.ExplanationOrBuilder getExplanationOrBuilder();
}
