package rs.math.oop.g11.p07a.dveDimenzije;

public class NegativnaDimenzijaMatriceIzuzetak extends Exception
{
	private int dim;
	
	public NegativnaDimenzijaMatriceIzuzetak(int dim)
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
