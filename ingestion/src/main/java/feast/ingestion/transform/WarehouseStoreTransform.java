/*
 * Copyright 2018 The Feast Authors
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
 *
 */


package feast.ingestion.transform;

import com.google.inject.Inject;
import feast.ingestion.model.Specs;
import feast.store.serving.FeatureServingFactory;
import feast.store.warehouse.FeatureWarehouseFactory;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WarehouseStoreTransform extends BaseStoreTransform {

  @Inject
  public WarehouseStoreTransform(List<FeatureWarehouseFactory> stores, Specs specs) {
    super(stores, specs.getWarehouseStorageSpec(), specs);
  }
}
