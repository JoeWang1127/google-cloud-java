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

public interface OutlierDetectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.OutlierDetection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The base time that a backend endpoint is ejected for. Defaults to 30000ms or 30s. After a backend endpoint is returned back to the load balancing pool, it can be ejected again in another ejection analysis. Thus, the total ejection time is equal to the base ejection time multiplied by the number of times the backend endpoint has been ejected. Defaults to 30000ms or 30s.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration base_ejection_time = 80997255;</code>
   *
   * @return Whether the baseEjectionTime field is set.
   */
  boolean hasBaseEjectionTime();
  /**
   *
   *
   * <pre>
   * The base time that a backend endpoint is ejected for. Defaults to 30000ms or 30s. After a backend endpoint is returned back to the load balancing pool, it can be ejected again in another ejection analysis. Thus, the total ejection time is equal to the base ejection time multiplied by the number of times the backend endpoint has been ejected. Defaults to 30000ms or 30s.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration base_ejection_time = 80997255;</code>
   *
   * @return The baseEjectionTime.
   */
  com.google.cloud.compute.v1.Duration getBaseEjectionTime();
  /**
   *
   *
   * <pre>
   * The base time that a backend endpoint is ejected for. Defaults to 30000ms or 30s. After a backend endpoint is returned back to the load balancing pool, it can be ejected again in another ejection analysis. Thus, the total ejection time is equal to the base ejection time multiplied by the number of times the backend endpoint has been ejected. Defaults to 30000ms or 30s.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration base_ejection_time = 80997255;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getBaseEjectionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of consecutive errors before a backend endpoint is ejected from the load balancing pool. When the backend endpoint is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
   * </pre>
   *
   * <code>optional int32 consecutive_errors = 387193248;</code>
   *
   * @return Whether the consecutiveErrors field is set.
   */
  boolean hasConsecutiveErrors();
  /**
   *
   *
   * <pre>
   * Number of consecutive errors before a backend endpoint is ejected from the load balancing pool. When the backend endpoint is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
   * </pre>
   *
   * <code>optional int32 consecutive_errors = 387193248;</code>
   *
   * @return The consecutiveErrors.
   */
  int getConsecutiveErrors();

  /**
   *
   *
   * <pre>
   * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection occurs. Defaults to 3.
   * </pre>
   *
   * <code>optional int32 consecutive_gateway_failure = 417504250;</code>
   *
   * @return Whether the consecutiveGatewayFailure field is set.
   */
  boolean hasConsecutiveGatewayFailure();
  /**
   *
   *
   * <pre>
   * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection occurs. Defaults to 3.
   * </pre>
   *
   * <code>optional int32 consecutive_gateway_failure = 417504250;</code>
   *
   * @return The consecutiveGatewayFailure.
   */
  int getConsecutiveGatewayFailure();

  /**
   *
   *
   * <pre>
   * The percentage chance that a backend endpoint will be ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>optional int32 enforcing_consecutive_errors = 213133760;</code>
   *
   * @return Whether the enforcingConsecutiveErrors field is set.
   */
  boolean hasEnforcingConsecutiveErrors();
  /**
   *
   *
   * <pre>
   * The percentage chance that a backend endpoint will be ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 0.
   * </pre>
   *
   * <code>optional int32 enforcing_consecutive_errors = 213133760;</code>
   *
   * @return The enforcingConsecutiveErrors.
   */
  int getEnforcingConsecutiveErrors();

  /**
   *
   *
   * <pre>
   * The percentage chance that a backend endpoint will be ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>optional int32 enforcing_consecutive_gateway_failure = 394440666;</code>
   *
   * @return Whether the enforcingConsecutiveGatewayFailure field is set.
   */
  boolean hasEnforcingConsecutiveGatewayFailure();
  /**
   *
   *
   * <pre>
   * The percentage chance that a backend endpoint will be ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
   * </pre>
   *
   * <code>optional int32 enforcing_consecutive_gateway_failure = 394440666;</code>
   *
   * @return The enforcingConsecutiveGatewayFailure.
   */
  int getEnforcingConsecutiveGatewayFailure();

  /**
   *
   *
   * <pre>
   * The percentage chance that a backend endpoint will be ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 enforcing_success_rate = 194508732;</code>
   *
   * @return Whether the enforcingSuccessRate field is set.
   */
  boolean hasEnforcingSuccessRate();
  /**
   *
   *
   * <pre>
   * The percentage chance that a backend endpoint will be ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 enforcing_success_rate = 194508732;</code>
   *
   * @return The enforcingSuccessRate.
   */
  int getEnforcingSuccessRate();

  /**
   *
   *
   * <pre>
   * Time interval between ejection analysis sweeps. This can result in both new ejections and backend endpoints being returned to service. The interval is equal to the number of seconds as defined in outlierDetection.interval.seconds plus the number of nanoseconds as defined in outlierDetection.interval.nanos. Defaults to 1 second.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration interval = 33547461;</code>
   *
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   *
   *
   * <pre>
   * Time interval between ejection analysis sweeps. This can result in both new ejections and backend endpoints being returned to service. The interval is equal to the number of seconds as defined in outlierDetection.interval.seconds plus the number of nanoseconds as defined in outlierDetection.interval.nanos. Defaults to 1 second.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration interval = 33547461;</code>
   *
   * @return The interval.
   */
  com.google.cloud.compute.v1.Duration getInterval();
  /**
   *
   *
   * <pre>
   * Time interval between ejection analysis sweeps. This can result in both new ejections and backend endpoints being returned to service. The interval is equal to the number of seconds as defined in outlierDetection.interval.seconds plus the number of nanoseconds as defined in outlierDetection.interval.nanos. Defaults to 1 second.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration interval = 33547461;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum percentage of backend endpoints in the load balancing pool for the backend service that can be ejected if the ejection conditions are met. Defaults to 50%.
   * </pre>
   *
   * <code>optional int32 max_ejection_percent = 18436888;</code>
   *
   * @return Whether the maxEjectionPercent field is set.
   */
  boolean hasMaxEjectionPercent();
  /**
   *
   *
   * <pre>
   * Maximum percentage of backend endpoints in the load balancing pool for the backend service that can be ejected if the ejection conditions are met. Defaults to 50%.
   * </pre>
   *
   * <code>optional int32 max_ejection_percent = 18436888;</code>
   *
   * @return The maxEjectionPercent.
   */
  int getMaxEjectionPercent();

  /**
   *
   *
   * <pre>
   * The number of backend endpoints in the load balancing pool that must have enough request volume to detect success rate outliers. If the number of backend endpoints is fewer than this setting, outlier detection via success rate statistics is not performed for any backend endpoint in the load balancing pool. Defaults to 5. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 success_rate_minimum_hosts = 525766903;</code>
   *
   * @return Whether the successRateMinimumHosts field is set.
   */
  boolean hasSuccessRateMinimumHosts();
  /**
   *
   *
   * <pre>
   * The number of backend endpoints in the load balancing pool that must have enough request volume to detect success rate outliers. If the number of backend endpoints is fewer than this setting, outlier detection via success rate statistics is not performed for any backend endpoint in the load balancing pool. Defaults to 5. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 success_rate_minimum_hosts = 525766903;</code>
   *
   * @return The successRateMinimumHosts.
   */
  int getSuccessRateMinimumHosts();

  /**
   *
   *
   * <pre>
   * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this backend endpoint in success rate based outlier detection. If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that backend endpoint. Defaults to 100. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 success_rate_request_volume = 281425357;</code>
   *
   * @return Whether the successRateRequestVolume field is set.
   */
  boolean hasSuccessRateRequestVolume();
  /**
   *
   *
   * <pre>
   * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this backend endpoint in success rate based outlier detection. If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that backend endpoint. Defaults to 100. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 success_rate_request_volume = 281425357;</code>
   *
   * @return The successRateRequestVolume.
   */
  int getSuccessRateRequestVolume();

  /**
   *
   *
   * <pre>
   * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of this factor and the standard deviation of the mean success rate: mean - (stdev * successRateStdevFactor). This factor is divided by a thousand to get a double. That is, if the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 success_rate_stdev_factor = 174735773;</code>
   *
   * @return Whether the successRateStdevFactor field is set.
   */
  boolean hasSuccessRateStdevFactor();
  /**
   *
   *
   * <pre>
   * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of this factor and the standard deviation of the mean success rate: mean - (stdev * successRateStdevFactor). This factor is divided by a thousand to get a double. That is, if the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900. Not supported when the backend service uses Serverless NEG.
   * </pre>
   *
   * <code>optional int32 success_rate_stdev_factor = 174735773;</code>
   *
   * @return The successRateStdevFactor.
   */
  int getSuccessRateStdevFactor();
}
