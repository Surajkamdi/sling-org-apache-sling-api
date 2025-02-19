/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.api.request.builder;

import org.apache.sling.api.request.builder.impl.SlingHttpServletRequestImpl;
import org.apache.sling.api.request.builder.impl.SlingHttpServletResponseImpl;
import org.apache.sling.api.resource.Resource;
import org.jetbrains.annotations.NotNull;

/**
 * Creates builders.
 * @since 1.0 (Sling API Bundle 2.24.0)
 *
 */
public final class Builders {

    private Builders() {}

    /**
     * Creates a new request builder.
     *
     * @param resource the resource on which the request is based
     * @return a request builder
     * @throws IllegalArgumentException If resource is {@code null}
     */
    public static @NotNull SlingHttpServletRequestBuilder newRequestBuilder(@NotNull final Resource resource) {
        return new SlingHttpServletRequestImpl(resource);
    }

    /**
     * Creates a new response builder.
     *
     * @return a response builder
     */
    public static @NotNull SlingHttpServletResponseBuilder newResponseBuilder() {
        return new SlingHttpServletResponseImpl();
    }
}
