/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.boot.test.bean.annotation;

import com.alipay.sofa.runtime.api.model.BindingTypeEnum;
import org.springframework.stereotype.Component;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;

/**
 * @author qilong.zql
 * @since 3.2.0
 */
@Component
@SofaService(bindings = { @SofaServiceBinding(bindingType = BindingTypeEnum.BOLT) }, uniqueId = "bolt")
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String hello() {
        return "Hello, Annotation";
    }

    @Override
    public String testTimeout(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {

        }
        return "sleep " + millis + " ms";
    }
}
