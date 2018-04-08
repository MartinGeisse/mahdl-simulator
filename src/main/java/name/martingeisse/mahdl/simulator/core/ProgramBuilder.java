/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.simulator.core;

/**
 *
 */
public final class ProgramBuilder {


	public Program build() {

		// TODO
		String className = null;
		byte[] classDefinition = null;

		// for now, let's assume that using a new class loader for each program isn't too heavyweight
		DynamicClassLoader classLoader = new DynamicClassLoader();
		Class<?> theClass = classLoader.defineClass(className, classDefinition);


		class
	}

}
