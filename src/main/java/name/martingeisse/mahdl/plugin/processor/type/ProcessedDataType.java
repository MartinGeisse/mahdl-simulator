/*
 * Copyright (c) 2018 Martin Geisse
 * This file is distributed under the terms of the MIT license.
 */
package name.martingeisse.mahdl.plugin.processor.type;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public abstract class ProcessedDataType {

	public enum Family {

		BIT, VECTOR, MATRIX, INTEGER, TEXT, UNKNOWN;

		public String getDisplayString() {
			return name().toLowerCase();
		}

	}

	@NotNull
	public abstract Family getFamily();

	public static final class Unknown extends ProcessedDataType {

		public static final Unknown INSTANCE = new Unknown();

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Unknown;
		}

		@Override
		public int hashCode() {
			return Unknown.class.hashCode();
		}

		@NotNull
		public String toString() {
			return "unknown";
		}

		@Override
		@NotNull
		public Family getFamily() {
			return Family.UNKNOWN;
		}

	}

	public static final class Bit extends ProcessedDataType {

		public static final Bit INSTANCE = new Bit();

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Bit;
		}

		@Override
		public int hashCode() {
			return Bit.class.hashCode();
		}

		@NotNull
		public String toString() {
			return "bit";
		}

		@Override
		@NotNull
		public Family getFamily() {
			return Family.BIT;
		}

	}

	// note: the Java BitSet uses the same index values as the MaHDL vector, just the from/to notation is reversed.
	public static final class Vector extends ProcessedDataType {

		private final int size;

		public Vector(int size) {
			this.size = size;
		}

		public int getSize() {
			return size;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Vector) {
				Vector other = (Vector) obj;
				return size == other.size;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return new HashCodeBuilder().append(Vector.class).append(size).toHashCode();
		}

		@NotNull
		public String toString() {
			return "vector[" + size + "]";
		}

		@Override
		@NotNull
		public Family getFamily() {
			return Family.VECTOR;
		}

	}

	public static final class Matrix extends ProcessedDataType {

		private final int firstSize, secondSize;

		public Matrix(int firstSize, int secondSize) {
			this.firstSize = firstSize;
			this.secondSize = secondSize;
		}

		public int getFirstSize() {
			return firstSize;
		}

		public int getSecondSize() {
			return secondSize;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Matrix) {
				Matrix other = (Matrix) obj;
				return firstSize == other.firstSize && secondSize == other.secondSize;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return new HashCodeBuilder().append(Matrix.class).append(firstSize).append(secondSize).toHashCode();
		}

		@NotNull
		public String toString() {
			return "matrix[" + firstSize + "][" + secondSize + "]";
		}

		@Override
		@NotNull
		public Family getFamily() {
			return Family.MATRIX;
		}

	}

	public static final class Integer extends ProcessedDataType {

		public static final Integer INSTANCE = new Integer();

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Integer;
		}

		@Override
		public int hashCode() {
			return Integer.class.hashCode();
		}

		@NotNull
		public String toString() {
			return "integer";
		}

		@Override
		@NotNull
		public Family getFamily() {
			return Family.INTEGER;
		}

	}

	public static final class Text extends ProcessedDataType {

		public static final Text INSTANCE = new Text();

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Text;
		}

		@Override
		public int hashCode() {
			return Text.class.hashCode();
		}

		@NotNull
		public String toString() {
			return "text";
		}

		@Override
		@NotNull
		public Family getFamily() {
			return Family.TEXT;
		}

	}

}
