/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb;

/**
 * Subclass of {@link WriteConcernException} representing a duplicate key exception
 *
 * @since 2.12
 */
public class DuplicateKeyException extends WriteConcernException {

    private static final long serialVersionUID = -4415279469780082174L;

    /**
     * Chaining the exception - this constructor will take all relevant values from the original MongoDuplicateKeyException and put them
     * into this DuplicateKey, but all reference to the MongoDuplicateKeyException will be removed from the stack trace.  This is so that we
     * don't leak the exceptions from the org.mongodb layer.
     *
     * @param e the exception from the new Java layer
     */
    DuplicateKeyException(final org.mongodb.MongoDuplicateKeyException e) {
        super(e);
    }
}