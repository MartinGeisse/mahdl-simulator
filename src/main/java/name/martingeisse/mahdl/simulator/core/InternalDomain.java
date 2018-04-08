/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.simulator.core;

/**
 * A set of signals that are updated atomically, i.e. using the same clock signal.
 */
public final class InternalDomain {

	final InternalSimulation simulation;
	final int[] currentValues;
	final int[] nextValues;
	final Program program;

	InternalDomain(InternalSimulation simulation, int valueCount, Program program) {
		this.simulation = simulation;
		this.currentValues = new int[valueCount];
		this.nextValues = new int[valueCount];
		this.program = program;
	}

	public int getValue(int index) {
		return currentValues[index];
	}

	public void update() {
		program.execute(simulation, currentValues, nextValues);
		System.arraycopy(nextValues, 0, currentValues, 0, currentValues.length);
	}

}
