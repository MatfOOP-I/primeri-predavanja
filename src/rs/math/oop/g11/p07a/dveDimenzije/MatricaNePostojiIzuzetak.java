package rs.math.oop.g11.p07a.dveDimenzije;

public class MatricaNePostojiIzuzetak extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak nepostojece matrice. \n" + s;
	}
}
