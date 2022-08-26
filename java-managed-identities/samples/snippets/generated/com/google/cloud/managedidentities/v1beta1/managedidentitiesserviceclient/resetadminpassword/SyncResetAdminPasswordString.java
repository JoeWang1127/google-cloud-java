/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.managedidentities.v1beta1.samples;

// [START managedidentities_v1beta1_generated_managedidentitiesserviceclient_resetadminpassword_string_sync]
import com.google.cloud.managedidentities.v1beta1.DomainName;
import com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceClient;
import com.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse;

public class SyncResetAdminPasswordString {

  public static void main(String[] args) throws Exception {
    syncResetAdminPasswordString();
  }

  public static void syncResetAdminPasswordString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ManagedIdentitiesServiceClient managedIdentitiesServiceClient =
        ManagedIdentitiesServiceClient.create()) {
      String name = DomainName.of("[PROJECT]", "[LOCATION]", "[DOMAIN]").toString();
      ResetAdminPasswordResponse response = managedIdentitiesServiceClient.resetAdminPassword(name);
    }
  }
}
// [END managedidentities_v1beta1_generated_managedidentitiesserviceclient_resetadminpassword_string_sync]