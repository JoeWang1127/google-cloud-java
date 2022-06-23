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

package com.google.cloud.resourcemanager.v3.samples;

// [START resourcemanager_v3_generated_organizationsclient_getiampolicy_sync]
import com.google.cloud.resourcemanager.v3.OrganizationName;
import com.google.cloud.resourcemanager.v3.OrganizationsClient;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.GetPolicyOptions;
import com.google.iam.v1.Policy;

public class SyncGetIamPolicy {

  public static void main(String[] args) throws Exception {
    syncGetIamPolicy();
  }

  public static void syncGetIamPolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OrganizationsClient organizationsClient = OrganizationsClient.create()) {
      GetIamPolicyRequest request =
          GetIamPolicyRequest.newBuilder()
              .setResource(OrganizationName.of("[ORGANIZATION]").toString())
              .setOptions(GetPolicyOptions.newBuilder().build())
              .build();
      Policy response = organizationsClient.getIamPolicy(request);
    }
  }
}
// [END resourcemanager_v3_generated_organizationsclient_getiampolicy_sync]
