/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.simulator.core;

/**
 *
 */
public final class InternalInput {

	final int[] values;

	InternalInput(int valueCount) {
		this.values = new int[valueCount];
	}

	public void setValue(int index, int value) {
		this.values[index] = value;
	}

}
