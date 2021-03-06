/*
 * Copyright 2014 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.nmorel.gwtjackson.client.deser.bean;

import com.github.nmorel.gwtjackson.client.JsonDeserializationContext;
import com.github.nmorel.gwtjackson.client.JsonDeserializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonReader;

/**
 * @author Nicolas Morel
 */
@SuppressWarnings( "UnusedDeclaration" )
public abstract class AbstractDelegationBeanJsonDeserializer<T> extends AbstractBeanJsonDeserializer<T> {

    @Override
    public T deserializeWrapped( JsonReader reader, JsonDeserializationContext ctx, JsonDeserializerParameters params,
                                 IdentityDeserializationInfo identityInfo, TypeDeserializationInfo typeInfo, String typeInformation ) {
        return instanceBuilder.newInstance( reader, ctx, null ).getInstance();
    }

}
