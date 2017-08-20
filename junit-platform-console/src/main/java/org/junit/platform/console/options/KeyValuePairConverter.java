/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.platform.console.options;

import joptsimple.ValueConverter;
import joptsimple.util.KeyValuePair;

class KeyValuePairConverter implements ValueConverter<KeyValuePair> {
	@Override
	public KeyValuePair convert(String value) {
		return KeyValuePair.valueOf(value);
	}

	@Override
	public Class<? extends KeyValuePair> valueType() {
		return KeyValuePair.class;
	}

	@Override
	public String valuePattern() {
		return "key=value";
	}
}
