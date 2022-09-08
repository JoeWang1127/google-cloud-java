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

package com.google.cloud.retail.v2.stub;

import static com.google.cloud.retail.v2.ServingConfigServiceClient.ListServingConfigsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.retail.v2.AddControlRequest;
import com.google.cloud.retail.v2.CreateServingConfigRequest;
import com.google.cloud.retail.v2.DeleteServingConfigRequest;
import com.google.cloud.retail.v2.GetServingConfigRequest;
import com.google.cloud.retail.v2.ListServingConfigsRequest;
import com.google.cloud.retail.v2.ListServingConfigsResponse;
import com.google.cloud.retail.v2.RemoveControlRequest;
import com.google.cloud.retail.v2.ServingConfig;
import com.google.cloud.retail.v2.UpdateServingConfigRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ServingConfigService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ServingConfigServiceStub implements BackgroundResource {

  public UnaryCallable<CreateServingConfigRequest, ServingConfig> createServingConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createServingConfigCallable()");
  }

  public UnaryCallable<DeleteServingConfigRequest, Empty> deleteServingConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteServingConfigCallable()");
  }

  public UnaryCallable<UpdateServingConfigRequest, ServingConfig> updateServingConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateServingConfigCallable()");
  }

  public UnaryCallable<GetServingConfigRequest, ServingConfig> getServingConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getServingConfigCallable()");
  }

  public UnaryCallable<ListServingConfigsRequest, ListServingConfigsPagedResponse>
      listServingConfigsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listServingConfigsPagedCallable()");
  }

  public UnaryCallable<ListServingConfigsRequest, ListServingConfigsResponse>
      listServingConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listServingConfigsCallable()");
  }

  public UnaryCallable<AddControlRequest, ServingConfig> addControlCallable() {
    throw new UnsupportedOperationException("Not implemented: addControlCallable()");
  }

  public UnaryCallable<RemoveControlRequest, ServingConfig> removeControlCallable() {
    throw new UnsupportedOperationException("Not implemented: removeControlCallable()");
  }

  @Override
  public abstract void close();
}