/**
 * Copyright (c) 2017 Denis O <denis.o@linux.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.unidev.polydata;

/**
 * SQLite storage exception
 */
public class SQLiteStorageException extends Exception {
    public SQLiteStorageException() {
        super();
    }

    public SQLiteStorageException(String message) {
        super(message);
    }

    public SQLiteStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLiteStorageException(Throwable cause) {
        super(cause);
    }
}
