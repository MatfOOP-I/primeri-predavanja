package rs.math.oop.g11.p07c.stekPrekoListeKorisnickiIzuzetak;

public class ArgumentJeNullIzuzetak extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: argument je null, sto nije dopusteno. " + s;
	}
}
