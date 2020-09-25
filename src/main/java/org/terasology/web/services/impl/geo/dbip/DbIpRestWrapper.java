/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.web.services.impl.geo.dbip;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

/**
 * Maps the db-ip.com REST-ful API to a Java class.
 */
@Client("http://api.db-ip.com/")
public interface DbIpRestWrapper {

    @Get("/addrinfo?addr={ipAddress}&api_key={apiKey}")
    DbIpQueryResponse getGeoLocation(String ipAddress, String apiKey);
}
