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

package com.github.nmorel.gwtjackson.client;

import com.github.nmorel.gwtjackson.shared.mixins.MixinSerForMethodsTester.EmptyBean;
import com.github.nmorel.gwtjackson.shared.mixins.MixinSerForMethodsTester.MixInForSimple;

/**
 * Configuration class used by the tests
 *
 * @author Nicolas Morel.
 */
public class TestConfiguration extends AbstractConfiguration {

    @Override
    protected void configure() {
        // mixin tests
        addMixInAnnotations( EmptyBean.class, MixInForSimple.class );

        // object tests
        whitelist( "com.github.nmorel.gwtjackson.shared.advanced.ObjectTester.InnerObject" );
        whitelist( "com.github.nmorel.gwtjackson.shared.advanced.ObjectTester.Person" );
    }
}

