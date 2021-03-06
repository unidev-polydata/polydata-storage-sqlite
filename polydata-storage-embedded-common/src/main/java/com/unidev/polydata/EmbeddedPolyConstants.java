/**
 * Copyright (c) 2017 Denis O <denis.o@linux.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.unidev.polydata;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.unidev.polydata.domain.BasicPoly;
import com.unidev.polydata.domain.Poly;

/**
 * Constant keys used in poly records
 */
public class EmbeddedPolyConstants {

    public static final String TYPE_METADATA = "metadata";

    public static final String TYPE_POLYMAP = "polymap";

    public static final String TYPE_DATA = "poly";
    public static final String TYPE_POLY_INDEX = "poly_index";

    public static final String DATA = "data";

    public static final String ID_KEY = "_id";
    public static final String DATA_KEY = "data";
    public static final String TAGS_KEY = "tags";

    public static ObjectMapper POLY_OBJECT_MAPPER = new ObjectMapper() {{
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        SimpleModule module = new SimpleModule("PolyModel", Version.unknownVersion());

        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(Poly.class, BasicPoly.class);
        module.setAbstractTypes(resolver);
        registerModule(module);
    }};

}
