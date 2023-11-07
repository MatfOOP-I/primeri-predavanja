package rs.math.oop.g08.v01.kutije;

public class Kutija {
	int visina;
	int sirina;
	int dubina;

	public static void main(String[] args) {
		Kutija kutija1 = new Kutija();
		kutija1.dubina = 10;
		kutija1.sirina = 2;
		kutija1.visina = 10;
		System.out.println(kutija1);
	}
}
