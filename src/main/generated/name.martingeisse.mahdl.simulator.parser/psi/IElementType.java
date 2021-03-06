package name.martingeisse.mahdl.simulator.parser.psi;

public class IElementType {

	public static final IElementType BAD_CHARACTER = new IElementType("BAD_CHARACTER");

	private static int counter = 0;

	private final String name;
	private final int index;

	public IElementType(String name) {
		this.name = name;
		this.index = counter;
		counter++;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

}
