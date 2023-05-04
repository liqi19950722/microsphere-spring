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
package io.github.microsphere.spring.config.annotation;

import org.springframework.core.annotation.AnnotationAttributes;

import java.lang.annotation.Annotation;

/**
 * {@link AnnotationAttributes} for the annotation meta-annotated {@link EnableConfig}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see EnableConfig
 * @since 1.0.0
 */
public class EnableConfigAttributes<A extends Annotation> extends AnnotationAttributes {

    private final Class<A> annotationType;

    public EnableConfigAttributes(Class<A> annotationType, AnnotationAttributes source) {
        super(source);
        this.annotationType = annotationType;
    }

    public String getName() {
        return getString("name");
    }

    public boolean isAutoRefreshed() {
        return getBoolean("autoRefreshed");
    }

    public boolean isFirstPropertySource() {
        return getBoolean("first");
    }

    public String getBeforePropertySourceName() {
        return getString("before");
    }

    public String getAfterPropertySourceName() {
        return getString("after");
    }

    public Class<A> getAnnotationType() {
        return annotationType;
    }

    public Class<A> annotationType() {
        return getAnnotationType();
    }
}