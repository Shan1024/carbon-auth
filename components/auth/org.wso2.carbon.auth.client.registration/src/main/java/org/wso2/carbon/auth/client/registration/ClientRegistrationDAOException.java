/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.auth.client.registration;

import org.wso2.carbon.auth.core.exception.AuthException;
import org.wso2.carbon.auth.core.exception.ErrorHandler;

/**
 *  This is the Exception class for Client Registration DAO related exceptions.
 */
public class ClientRegistrationDAOException extends AuthException {

    public ClientRegistrationDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientRegistrationDAOException(Throwable cause) {
        super(cause);
    }

    protected ClientRegistrationDAOException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ClientRegistrationDAOException(String message) {
        super(message);
    }

    public ClientRegistrationDAOException(String message, ErrorHandler code) {
        super(message, code);
    }

    public ClientRegistrationDAOException(String message, Throwable cause, ErrorHandler code) {
        super(message, cause, code);
    }
}
