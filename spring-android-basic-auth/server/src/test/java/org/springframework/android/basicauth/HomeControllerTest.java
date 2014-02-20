/*
 * Copyright 2010-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.android.basicauth;

import org.junit.Test;
import org.springframework.android.config.ReadConfig;

/**
 * @author Roy Clarkson
 */
public class HomeControllerTest {

	@Test
	public void testConfig(){
		ReadConfig rc = new ReadConfig();
		System.out.println("url: "+rc.getUrl());
	}
	
}
