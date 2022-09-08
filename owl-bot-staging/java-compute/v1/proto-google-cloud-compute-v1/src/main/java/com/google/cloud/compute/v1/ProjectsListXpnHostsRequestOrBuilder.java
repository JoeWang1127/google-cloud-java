// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ProjectsListXpnHostsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ProjectsListXpnHostsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
   * </pre>
   *
   * <code>optional string organization = 105180467;</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <pre>
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
   * </pre>
   *
   * <code>optional string organization = 105180467;</code>
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   * <pre>
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
   * </pre>
   *
   * <code>optional string organization = 105180467;</code>
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString
      getOrganizationBytes();
}