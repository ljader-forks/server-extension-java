/*
 * Copyright (c) 2017 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.​
 */

package com.esri.serverextension.core.util;

import java.io.IOException;

public class ArcObjectsInteropException extends RuntimeException {

    private static final long serialVersionUID = -8856518229037015245L;

    public ArcObjectsInteropException() {
    }

    public ArcObjectsInteropException(String message) {
        super(message);
    }

    public ArcObjectsInteropException(IOException cause) {
        super(cause);
    }

    public ArcObjectsInteropException(String message, IOException cause) {
        super(message, cause);
    }

    public ArcObjectsInteropException(String message, IOException cause,
                                      boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
