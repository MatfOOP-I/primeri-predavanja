package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z05.matrice;

public class NegativnaDimenzijaMatriceException extends Exception
{
	private int dim;
	
	public NegativnaDimenzijaMatriceException(int dim)
	{
		this.dim = dim;
	}
	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak negativne dimenzije matrice " + dim + "\n" 
				+ s;
	}
}
