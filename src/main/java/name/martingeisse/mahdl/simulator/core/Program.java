/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.simulator.core;

/**
 *
 */
public abstract class Program {

	public abstract void execute(InternalSimulation simulation, int[] oldValues, int[] newValues);

}
