package rs.math.oop.g11.p07b.izuzeciPreporuke.z03.trebaNeTreba;

public class ProtrcaoKrozCeoNizException extends Exception
{
	private static final long serialVersionUID = 1L;
	double suma;
	int indeks;
	
	public ProtrcaoKrozCeoNizException(double suma, int indeks)
	{
		super();
		this.suma = suma;
		this.indeks = indeks;
	}
	
}
