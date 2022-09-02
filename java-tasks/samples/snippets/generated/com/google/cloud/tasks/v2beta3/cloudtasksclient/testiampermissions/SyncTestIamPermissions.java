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

package com.google.cloud.tasks.v2beta3.samples;

// [START tasks_v2beta3_generated_cloudtasksclient_testiampermissions_sync]
import com.google.cloud.tasks.v2beta3.CloudTasksClient;
import com.google.cloud.tasks.v2beta3.QueueName;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import java.util.ArrayList;

public class SyncTestIamPermissions {

  public static void main(String[] args) throws Exception {
    syncTestIamPermissions();
  }

  public static void syncTestIamPermissions() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource(QueueName.of("[PROJECT]", "[LOCATION]", "[QUEUE]").toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      TestIamPermissionsResponse response = cloudTasksClient.testIamPermissions(request);
    }
  }
}
// [END tasks_v2beta3_generated_cloudtasksclient_testiampermissions_sync]