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
package org.osgi.impl.bundle.annotations.reqcap;

import org.osgi.annotation.bundle.Capability;
import org.osgi.impl.bundle.annotations.export.ExportProviderType;

@InnerCapabilityAnnotation
public @interface IndirectCapabilityAnnotation {
	//
}

@Capability( //
		namespace = "testIndirectlyAnnotatedCapability", //
		name = "allOptions", //
		version = "1.3", //
		uses = {
				UsingAnnotations.class, ExportProviderType.class
		}, //
		effective = "osgi.test", //
		attribute = {
				"attr=value", //
				"x-directive:=directiveValue", //
				"longAttr:Long=42", //
				"stringAttr:String=stringValue", //
				"doubleAttr:Double=4.2", //
				"versionAttr:Version=4.2", //
				"longList:List<Long>='2,3,4'", //
				"stringList:List<String>='one,two,three'", //
				"doubleList:List<Double>='2.3,3.4,4.5'", //
				"versionList:List<Version>='2.3,3.4,4.5'" //
		})
@interface InnerCapabilityAnnotation {
	//
}
