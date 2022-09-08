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

package com.google.cloud.retail.v2beta.stub.samples;

// [START retail_v2beta_generated_modelservicestubsettings_pausemodel_sync]
import com.google.cloud.retail.v2beta.stub.ModelServiceStubSettings;
import java.time.Duration;

public class SyncPauseModel {

  public static void main(String[] args) throws Exception {
    syncPauseModel();
  }

  public static void syncPauseModel() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    ModelServiceStubSettings.Builder modelServiceSettingsBuilder =
        ModelServiceStubSettings.newBuilder();
    modelServiceSettingsBuilder
        .pauseModelSettings()
        .setRetrySettings(
            modelServiceSettingsBuilder
                .pauseModelSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    ModelServiceStubSettings modelServiceSettings = modelServiceSettingsBuilder.build();
  }
}
// [END retail_v2beta_generated_modelservicestubsettings_pausemodel_sync]