package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public class ArgumentJeNullException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: argument je null, sto nije dopusteno. " + s;
	}
}
