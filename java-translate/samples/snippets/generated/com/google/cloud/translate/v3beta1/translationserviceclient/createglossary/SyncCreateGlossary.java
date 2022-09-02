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

package com.google.cloud.translate.v3beta1.samples;

// [START translation_v3beta1_generated_translationserviceclient_createglossary_sync]
import com.google.cloud.translate.v3beta1.CreateGlossaryRequest;
import com.google.cloud.translate.v3beta1.Glossary;
import com.google.cloud.translate.v3beta1.LocationName;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;

public class SyncCreateGlossary {

  public static void main(String[] args) throws Exception {
    syncCreateGlossary();
  }

  public static void syncCreateGlossary() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      CreateGlossaryRequest request =
          CreateGlossaryRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setGlossary(Glossary.newBuilder().build())
              .build();
      Glossary response = translationServiceClient.createGlossaryAsync(request).get();
    }
  }
}
// [END translation_v3beta1_generated_translationserviceclient_createglossary_sync]