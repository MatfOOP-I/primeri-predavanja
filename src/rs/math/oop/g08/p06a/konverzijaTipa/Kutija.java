package rs.math.oop.g08.p06a.konverzijaTipa;

public class Kutija {
	int visina;
	int sirina;
	int dubina;

	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(!(obj instanceof Kutija))
			return false;
		Kutija k = (Kutija) obj;
		return dubina == k.dubina && sirina == k.sirina && visina == k.visina;
	}

	public int hashCode()
	{
		//return 7 * dubina + 11 * sirina + 13 * visina;
		return java.util.Objects.hash(dubina, sirina, visina);
	}
	public static void main(String[] args) {
		Kutija kutija1 = new Kutija();
		kutija1.dubina = 10;
		kutija1.sirina = 2;
		kutija1.visina = 10;
		System.out.println(kutija1);
	}
}
