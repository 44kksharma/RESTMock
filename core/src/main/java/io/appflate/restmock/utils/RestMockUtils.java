
/*
 * Copyright (C) 2016 Appflate.io
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appflate.restmock.utils;

import okhttp3.mockwebserver.MockResponse;

import io.appflate.restmock.RESTMockFileParser;

public final class RestMockUtils {

    private RestMockUtils() {
        throw new UnsupportedOperationException("(╯‵Д′)╯ PLEASE STAHP!");

    }

    public static MockResponse createResponseFromFile(RESTMockFileParser RESTMockFileParser,
                                                      String jsonFilePath,
                                                      int responseCode)
            throws Exception {
        String fileContents = RESTMockFileParser.readJsonFile(jsonFilePath);
        return new MockResponse().setResponseCode(responseCode).setBody(fileContents);
    }
}
