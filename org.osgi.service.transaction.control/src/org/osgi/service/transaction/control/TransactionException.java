/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
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
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/
package org.osgi.service.transaction.control;

import org.osgi.annotation.versioning.ProviderType;

/**
 * An Exception indicating that there was a problem with starting, finishing,
 * suspending or resuming a transaction
 */
@ProviderType
public class TransactionException extends RuntimeException {

	/**
	 * Creates a new TransactionException with the supplied message
	 * 
	 * @param message
	 */
	public TransactionException(String message) {
		super(message);
	}

	/**
	 * Creates a new TransactionException with the supplied message and cause
	 * 
	 * @param message
	 * @param cause
	 */
	public TransactionException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 5207030182661816993L;

}
