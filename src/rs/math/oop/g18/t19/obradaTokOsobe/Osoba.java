/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package rs.math.oop.g18.t19.obradaTokOsobe;

public class Osoba
{
	private final String ime;
	private final int uzrast;
	
	public Osoba(final String ime, final int uzrast)
	{
		this.ime = ime;
		this.uzrast = uzrast;
	}
	
	public String uzmiIme()
	{
		return ime;
	}
	
	public int uzmiUzrast()
	{
		return uzrast;
	}
	
	public int uzrastRazlika(final Osoba drugi )
	{
		return uzrast - drugi.uzrast;
	}

	@Override
	public String toString()
	{
		return String.format( "%s - %d", ime, uzrast);
	}
}
