package rs.math.oop.g11.p07d.izuzeciPreporuke.alternativa3;

public class ProsaoKrozCeoNizIzuzetak extends Exception
{
	private double suma;
	private int indeks;
	
	public ProsaoKrozCeoNizIzuzetak(double suma, int indeks)
	{
		super();
		this.suma = suma;
		this.indeks = indeks-1;
	}

	public double uzmiSuma(){
		return suma;
	}

	public int uzmiIndeks(){
		return indeks;
	}
}
