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

package org.osgi.impl.service.rest.pojos;

import java.util.ArrayList;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.impl.service.rest.PojoReflector.ElementNode;
import org.osgi.impl.service.rest.PojoReflector.RootNode;

/**
 * List of service pojos.
 * 
 * @author Jan S. Rellermeyer, IBM Research
 */
@RootNode(name = "services")
@ElementNode(name = "uri")
@SuppressWarnings("serial")
public final class ServicePojoList extends ArrayList<String> {

	public ServicePojoList(ServiceReference<?>[] srefs) {
		for (final ServiceReference<?> sref : srefs) {
			add("framework/service/" + sref.getProperty(Constants.SERVICE_ID));
		}
	}

}
