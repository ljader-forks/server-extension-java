/*
 * Copyright (c) 2017 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.​
 */

package com.esri.serverextension.core.rest.support.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class ObjectMapperFactory {

    public ObjectMapperFactory() {
    }

    public ObjectMapper create() {
        ObjectMapper objectMapper = new ObjectMapper();

        ArcGISTypesModule aoModule = new ArcGISTypesModule();
        objectMapper.registerModule(aoModule);

        JaxbAnnotationModule jaxbModule = new JaxbAnnotationModule();
        objectMapper.registerModule(jaxbModule);

        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return objectMapper;
    }

}
