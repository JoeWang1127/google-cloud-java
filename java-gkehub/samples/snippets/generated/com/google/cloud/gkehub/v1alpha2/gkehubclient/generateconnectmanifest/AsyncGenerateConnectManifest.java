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

package com.google.cloud.gkehub.v1alpha2.samples;

// [START gkehub_v1alpha2_generated_gkehubclient_generateconnectmanifest_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkehub.v1alpha2.GenerateConnectManifestRequest;
import com.google.cloud.gkehub.v1alpha2.GenerateConnectManifestResponse;
import com.google.cloud.gkehub.v1alpha2.GkeHubClient;
import com.google.protobuf.ByteString;

public class AsyncGenerateConnectManifest {

  public static void main(String[] args) throws Exception {
    asyncGenerateConnectManifest();
  }

  public static void asyncGenerateConnectManifest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GkeHubClient gkeHubClient = GkeHubClient.create()) {
      GenerateConnectManifestRequest request =
          GenerateConnectManifestRequest.newBuilder()
              .setName("name3373707")
              .setNamespace("namespace1252218203")
              .setProxy(ByteString.EMPTY)
              .setVersion("version351608024")
              .setIsUpgrade(true)
              .setRegistry("registry-690212803")
              .setImagePullSecretContent(ByteString.EMPTY)
              .build();
      ApiFuture<GenerateConnectManifestResponse> future =
          gkeHubClient.generateConnectManifestCallable().futureCall(request);
      // Do something.
      GenerateConnectManifestResponse response = future.get();
    }
  }
}
// [END gkehub_v1alpha2_generated_gkehubclient_generateconnectmanifest_async]