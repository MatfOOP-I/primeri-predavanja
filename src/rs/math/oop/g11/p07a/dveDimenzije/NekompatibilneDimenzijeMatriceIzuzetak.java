package rs.math.oop.g11.p07a.dveDimenzije;

public class NekompatibilneDimenzijeMatriceIzuzetak extends Exception
{
	private boolean odnosiSeNaVrste;
	private int dim1;
	private int dim2;
	
	public NekompatibilneDimenzijeMatriceIzuzetak(boolean odnosiSeNaVrste, int dim1, int dim2)
	{
		this.odnosiSeNaVrste = odnosiSeNaVrste;
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	@Override
	public String toString()
	{
		String s = super.toString();
		return String.format("Izuzetak nekompatiblinih dimenzija(%s) matrice [%d, %d] %n %s",
				(odnosiSeNaVrste)?"vrste":"kolone", dim1, dim2, s);
	}
}
