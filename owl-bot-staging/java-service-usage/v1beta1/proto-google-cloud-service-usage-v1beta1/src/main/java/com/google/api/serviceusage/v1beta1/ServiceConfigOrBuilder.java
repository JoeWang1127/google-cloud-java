// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/resources.proto

package com.google.api.serviceusage.v1beta1;

public interface ServiceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.ServiceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The DNS address at which this service is available.
   * An example DNS address would be:
   * `calendar.googleapis.com`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The DNS address at which this service is available.
   * An example DNS address would be:
   * `calendar.googleapis.com`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The product title for this service.
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The product title for this service.
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * A list of API interfaces exported by this service. Contains only the names,
   * versions, and method names of the interfaces.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  java.util.List<com.google.protobuf.Api> 
      getApisList();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Contains only the names,
   * versions, and method names of the interfaces.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  com.google.protobuf.Api getApis(int index);
  /**
   * <pre>
   * A list of API interfaces exported by this service. Contains only the names,
   * versions, and method names of the interfaces.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  int getApisCount();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Contains only the names,
   * versions, and method names of the interfaces.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.ApiOrBuilder> 
      getApisOrBuilderList();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Contains only the names,
   * versions, and method names of the interfaces.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  com.google.protobuf.ApiOrBuilder getApisOrBuilder(
      int index);

  /**
   * <pre>
   * Additional API documentation. Contains only the summary and the
   * documentation URL.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   * <pre>
   * Additional API documentation. Contains only the summary and the
   * documentation URL.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   * @return The documentation.
   */
  com.google.api.Documentation getDocumentation();
  /**
   * <pre>
   * Additional API documentation. Contains only the summary and the
   * documentation URL.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   */
  com.google.api.DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   * @return Whether the quota field is set.
   */
  boolean hasQuota();
  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   * @return The quota.
   */
  com.google.api.Quota getQuota();
  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   */
  com.google.api.QuotaOrBuilder getQuotaOrBuilder();

  /**
   * <pre>
   * Auth configuration. Contains only the OAuth rules.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   * @return Whether the authentication field is set.
   */
  boolean hasAuthentication();
  /**
   * <pre>
   * Auth configuration. Contains only the OAuth rules.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   * @return The authentication.
   */
  com.google.api.Authentication getAuthentication();
  /**
   * <pre>
   * Auth configuration. Contains only the OAuth rules.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   */
  com.google.api.AuthenticationOrBuilder getAuthenticationOrBuilder();

  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   * @return The usage.
   */
  com.google.api.Usage getUsage();
  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   */
  com.google.api.UsageOrBuilder getUsageOrBuilder();

  /**
   * <pre>
   * Configuration for network endpoints. Contains only the names and aliases
   * of the endpoints.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  java.util.List<com.google.api.Endpoint> 
      getEndpointsList();
  /**
   * <pre>
   * Configuration for network endpoints. Contains only the names and aliases
   * of the endpoints.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  com.google.api.Endpoint getEndpoints(int index);
  /**
   * <pre>
   * Configuration for network endpoints. Contains only the names and aliases
   * of the endpoints.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * Configuration for network endpoints. Contains only the names and aliases
   * of the endpoints.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  java.util.List<? extends com.google.api.EndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * Configuration for network endpoints. Contains only the names and aliases
   * of the endpoints.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  com.google.api.EndpointOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  java.util.List<com.google.api.MonitoredResourceDescriptor> 
      getMonitoredResourcesList();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  com.google.api.MonitoredResourceDescriptor getMonitoredResources(int index);
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  int getMonitoredResourcesCount();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder> 
      getMonitoredResourcesOrBuilderList();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  com.google.api.MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * Monitoring configuration.
   * This should not include the 'producer_destinations' field.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   * @return Whether the monitoring field is set.
   */
  boolean hasMonitoring();
  /**
   * <pre>
   * Monitoring configuration.
   * This should not include the 'producer_destinations' field.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   * @return The monitoring.
   */
  com.google.api.Monitoring getMonitoring();
  /**
   * <pre>
   * Monitoring configuration.
   * This should not include the 'producer_destinations' field.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   */
  com.google.api.MonitoringOrBuilder getMonitoringOrBuilder();
}