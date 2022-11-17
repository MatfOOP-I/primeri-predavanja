package rs.math.oop.g08.p04.kreiranjeObjekataIspis;

//могло је да пише и
//public class Kutija extends Object{
public class Kutija {
	int visina;
	int sirina;
	int dubina;

	public String toString(){
		return "" + dubina + ":" + sirina + ":" + visina;
	}
	public static void main(String[] args) {
		// декларацијација са иницијализацијом
		Kutija kutija1 = new Kutija();
		kutija1.dubina = 10;
		kutija1.sirina = 2;
		kutija1.visina = 10;
		System.out.println(kutija1);
	}
}
