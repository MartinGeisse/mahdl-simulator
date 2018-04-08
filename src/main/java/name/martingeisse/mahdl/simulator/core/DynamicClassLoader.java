/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.simulator.core;

/**
 *
 */
final class DynamicClassLoader extends ClassLoader {

	public Class<?> defineClass(String name, byte[] definition) {
		return super.defineClass(name, definition, 0, definition.length);
	}

}
