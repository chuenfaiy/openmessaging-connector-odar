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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.connect.runtime.config;

import java.io.File;

/**
 * Configurations for runtime.
 */
public class ConnectConfig {

    /**
     * Worker id to distinguish with other workers. Should be unique in a cluster.
     */
    private String workerId = "DEFAULT_WORKER_1";

    /**
     * Storage directory for file store.
     */
    private String storePathRootDir = System.getProperty("user.home") + File.separator + "connectorStore";

    /**
     * OMS driver url, which determine the specific MQ to send and consume message.
     * The MQ is used for internal management of the connect runtime.
     */
    private String omsDriverUrl = "oms:rocketmq://localhost:9876/default:default";

    /**
     * Http port for REST API.
     */
    private int httpPort = 8081;

    public String getOmsDriverUrl() {
        return omsDriverUrl;
    }

    public void setOmsDriverUrl(String omsDriverUrl) {
        this.omsDriverUrl = omsDriverUrl;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getStorePathRootDir() {
        return storePathRootDir;
    }

    public void setStorePathRootDir(String storePathRootDir) {
        this.storePathRootDir = storePathRootDir;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }
}
