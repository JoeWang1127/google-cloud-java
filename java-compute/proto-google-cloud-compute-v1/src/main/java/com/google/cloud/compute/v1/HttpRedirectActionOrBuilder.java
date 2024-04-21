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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface HttpRedirectActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpRedirectAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The host that is used in the redirect response instead of the one that was supplied in the request. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_redirect = 107417747;</code>
   *
   * @return Whether the hostRedirect field is set.
   */
  boolean hasHostRedirect();
  /**
   *
   *
   * <pre>
   * The host that is used in the redirect response instead of the one that was supplied in the request. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_redirect = 107417747;</code>
   *
   * @return The hostRedirect.
   */
  java.lang.String getHostRedirect();
  /**
   *
   *
   * <pre>
   * The host that is used in the redirect response instead of the one that was supplied in the request. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_redirect = 107417747;</code>
   *
   * @return The bytes for hostRedirect.
   */
  com.google.protobuf.ByteString getHostRedirectBytes();

  /**
   *
   *
   * <pre>
   * If set to true, the URL scheme in the redirected request is set to HTTPS. If set to false, the URL scheme of the redirected request remains the same as that of the request. This must only be set for URL maps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted. The default is set to false.
   * </pre>
   *
   * <code>optional bool https_redirect = 170260656;</code>
   *
   * @return Whether the httpsRedirect field is set.
   */
  boolean hasHttpsRedirect();
  /**
   *
   *
   * <pre>
   * If set to true, the URL scheme in the redirected request is set to HTTPS. If set to false, the URL scheme of the redirected request remains the same as that of the request. This must only be set for URL maps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted. The default is set to false.
   * </pre>
   *
   * <code>optional bool https_redirect = 170260656;</code>
   *
   * @return The httpsRedirect.
   */
  boolean getHttpsRedirect();

  /**
   *
   *
   * <pre>
   * The path that is used in the redirect response instead of the one that was supplied in the request. pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_redirect = 272342710;</code>
   *
   * @return Whether the pathRedirect field is set.
   */
  boolean hasPathRedirect();
  /**
   *
   *
   * <pre>
   * The path that is used in the redirect response instead of the one that was supplied in the request. pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_redirect = 272342710;</code>
   *
   * @return The pathRedirect.
   */
  java.lang.String getPathRedirect();
  /**
   *
   *
   * <pre>
   * The path that is used in the redirect response instead of the one that was supplied in the request. pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_redirect = 272342710;</code>
   *
   * @return The bytes for pathRedirect.
   */
  com.google.protobuf.ByteString getPathRedirectBytes();

  /**
   *
   *
   * <pre>
   * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request. prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string prefix_redirect = 446184169;</code>
   *
   * @return Whether the prefixRedirect field is set.
   */
  boolean hasPrefixRedirect();
  /**
   *
   *
   * <pre>
   * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request. prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string prefix_redirect = 446184169;</code>
   *
   * @return The prefixRedirect.
   */
  java.lang.String getPrefixRedirect();
  /**
   *
   *
   * <pre>
   * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request. prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string prefix_redirect = 446184169;</code>
   *
   * @return The bytes for prefixRedirect.
   */
  com.google.protobuf.ByteString getPrefixRedirectBytes();

  /**
   *
   *
   * <pre>
   * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
   * Check the RedirectResponseCode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string redirect_response_code = 436710408;</code>
   *
   * @return Whether the redirectResponseCode field is set.
   */
  boolean hasRedirectResponseCode();
  /**
   *
   *
   * <pre>
   * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
   * Check the RedirectResponseCode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string redirect_response_code = 436710408;</code>
   *
   * @return The redirectResponseCode.
   */
  java.lang.String getRedirectResponseCode();
  /**
   *
   *
   * <pre>
   * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
   * Check the RedirectResponseCode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string redirect_response_code = 436710408;</code>
   *
   * @return The bytes for redirectResponseCode.
   */
  com.google.protobuf.ByteString getRedirectResponseCodeBytes();

  /**
   *
   *
   * <pre>
   * If set to true, any accompanying query portion of the original URL is removed before redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
   * </pre>
   *
   * <code>optional bool strip_query = 52284641;</code>
   *
   * @return Whether the stripQuery field is set.
   */
  boolean hasStripQuery();
  /**
   *
   *
   * <pre>
   * If set to true, any accompanying query portion of the original URL is removed before redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
   * </pre>
   *
   * <code>optional bool strip_query = 52284641;</code>
   *
   * @return The stripQuery.
   */
  boolean getStripQuery();
}
