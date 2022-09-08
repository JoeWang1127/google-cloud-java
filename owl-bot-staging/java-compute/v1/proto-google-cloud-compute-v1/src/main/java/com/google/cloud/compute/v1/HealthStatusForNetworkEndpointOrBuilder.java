// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface HealthStatusForNetworkEndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HealthStatusForNetworkEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URL of the backend service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.BackendServiceReference backend_service = 306946058;</code>
   * @return Whether the backendService field is set.
   */
  boolean hasBackendService();
  /**
   * <pre>
   * URL of the backend service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.BackendServiceReference backend_service = 306946058;</code>
   * @return The backendService.
   */
  com.google.cloud.compute.v1.BackendServiceReference getBackendService();
  /**
   * <pre>
   * URL of the backend service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.BackendServiceReference backend_service = 306946058;</code>
   */
  com.google.cloud.compute.v1.BackendServiceReferenceOrBuilder getBackendServiceOrBuilder();

  /**
   * <pre>
   * URL of the forwarding rule associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ForwardingRuleReference forwarding_rule = 269964030;</code>
   * @return Whether the forwardingRule field is set.
   */
  boolean hasForwardingRule();
  /**
   * <pre>
   * URL of the forwarding rule associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ForwardingRuleReference forwarding_rule = 269964030;</code>
   * @return The forwardingRule.
   */
  com.google.cloud.compute.v1.ForwardingRuleReference getForwardingRule();
  /**
   * <pre>
   * URL of the forwarding rule associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ForwardingRuleReference forwarding_rule = 269964030;</code>
   */
  com.google.cloud.compute.v1.ForwardingRuleReferenceOrBuilder getForwardingRuleOrBuilder();

  /**
   * <pre>
   * URL of the health check associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckReference health_check = 308876645;</code>
   * @return Whether the healthCheck field is set.
   */
  boolean hasHealthCheck();
  /**
   * <pre>
   * URL of the health check associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckReference health_check = 308876645;</code>
   * @return The healthCheck.
   */
  com.google.cloud.compute.v1.HealthCheckReference getHealthCheck();
  /**
   * <pre>
   * URL of the health check associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckReference health_check = 308876645;</code>
   */
  com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder getHealthCheckOrBuilder();

  /**
   * <pre>
   * URL of the health check service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckServiceReference health_check_service = 408374747;</code>
   * @return Whether the healthCheckService field is set.
   */
  boolean hasHealthCheckService();
  /**
   * <pre>
   * URL of the health check service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckServiceReference health_check_service = 408374747;</code>
   * @return The healthCheckService.
   */
  com.google.cloud.compute.v1.HealthCheckServiceReference getHealthCheckService();
  /**
   * <pre>
   * URL of the health check service associated with the health state of the network endpoint.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HealthCheckServiceReference health_check_service = 408374747;</code>
   */
  com.google.cloud.compute.v1.HealthCheckServiceReferenceOrBuilder getHealthCheckServiceOrBuilder();

  /**
   * <pre>
   * Health state of the network endpoint determined based on the health checks configured.
   * Check the HealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string health_state = 324007150;</code>
   * @return Whether the healthState field is set.
   */
  boolean hasHealthState();
  /**
   * <pre>
   * Health state of the network endpoint determined based on the health checks configured.
   * Check the HealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string health_state = 324007150;</code>
   * @return The healthState.
   */
  java.lang.String getHealthState();
  /**
   * <pre>
   * Health state of the network endpoint determined based on the health checks configured.
   * Check the HealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string health_state = 324007150;</code>
   * @return The bytes for healthState.
   */
  com.google.protobuf.ByteString
      getHealthStateBytes();
}