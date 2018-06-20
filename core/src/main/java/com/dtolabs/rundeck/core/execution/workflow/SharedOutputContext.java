/*
 * Copyright 2018 Rundeck, Inc. (http://rundeck.com)
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

package com.dtolabs.rundeck.core.execution.workflow;

import com.dtolabs.rundeck.core.dispatcher.ContextView;

import java.util.Map;

/**
 * An output context which can specify the destination context view
 * @author greg
 * @since 5/4/17
 */
public interface SharedOutputContext extends OutputContext {

    /**
     * Add to specified view
     * @param view view
     * @param data data
     */
    void addOutput(ContextView view, Map<String, Map<String, String>> data);

    /**
     * Add to specified view
     * @param view view
     * @param key key
     * @param data data
     */
    void addOutput(ContextView view, String key, Map<String, String> data);

    /**
     * Add to specified view
     * @param view view
     * @param key key
     * @param name name
     * @param value value
     */
    void addOutput(ContextView view, String key, String name, String value);
}
