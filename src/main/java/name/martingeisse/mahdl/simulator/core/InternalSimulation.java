/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.simulator.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public final class InternalSimulation {

	final List<InternalInput> inputs = new ArrayList<>();
	final List<InternalDomain> domains = new ArrayList<>();

	public InternalInput createInput(int valueCount) {
		InternalInput input = new InternalInput(valueCount);
		inputs.add(input);
		return input;
	}

	public InternalDomain createDomain(int valueCount, Program program) {
		InternalDomain domain = new InternalDomain(this, valueCount, program);
		domains.add(domain);
		return domain;
	}

}
