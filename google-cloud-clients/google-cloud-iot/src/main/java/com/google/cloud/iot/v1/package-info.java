/*
 * Copyright 2019 Google LLC
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

/**
 * A client to Cloud IoT API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>=================== DeviceManagerClient ===================
 *
 * <p>Service Description: Internet of Things (IoT) service. Securely connect and manage IoT
 * devices.
 *
 * <p>Sample for DeviceManagerClient:
 *
 * <pre>
 * <code>
 * try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   DeviceRegistry deviceRegistry = DeviceRegistry.newBuilder().build();
 *   DeviceRegistry response = deviceManagerClient.createDeviceRegistry(parent, deviceRegistry);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.iot.v1;
