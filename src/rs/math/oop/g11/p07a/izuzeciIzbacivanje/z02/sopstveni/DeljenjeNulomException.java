package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z02.sopstveni;

public class DeljenjeNulomException extends Exception
{
	private int indeks = -1; // Index of array element causing error

	// Default Constructor
	public DeljenjeNulomException()
	{
		super();
	}

	// Standard constructor
	public DeljenjeNulomException(String s)
	{
		super(s); // Call the base constructor
	}

	public DeljenjeNulomException(int indeks)
	{
		super("deljenje nulom"); // Call the base constructor
		this.indeks = indeks; // Set the index value
	}

	// Get the array index value for the error
	public int getIndeks()
	{
		return indeks; // Return the index value
	}
}
