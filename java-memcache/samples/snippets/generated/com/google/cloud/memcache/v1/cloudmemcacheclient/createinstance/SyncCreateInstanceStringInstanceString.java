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

package com.google.cloud.memcache.v1.samples;

// [START memcache_v1_generated_cloudmemcacheclient_createinstance_stringinstancestring_sync]
import com.google.cloud.memcache.v1.CloudMemcacheClient;
import com.google.cloud.memcache.v1.Instance;
import com.google.cloud.memcache.v1.LocationName;

public class SyncCreateInstanceStringInstanceString {

  public static void main(String[] args) throws Exception {
    syncCreateInstanceStringInstanceString();
  }

  public static void syncCreateInstanceStringInstanceString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
      String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      Instance instance = Instance.newBuilder().build();
      String instanceId = "instanceId902024336";
      Instance response =
          cloudMemcacheClient.createInstanceAsync(parent, instance, instanceId).get();
    }
  }
}
// [END memcache_v1_generated_cloudmemcacheclient_createinstance_stringinstancestring_sync]