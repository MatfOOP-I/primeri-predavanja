package rs.math.oop.g08.p09a.statickiMetod;

public class Ucenik {
	String imePrezime;
	int razred;
	
    static int brojKreiranihUcenika = 0;

    static void kreiranNovi(){
        brojKreiranihUcenika ++;
    }

    static int vratiBrojKreiranih(){
        return brojKreiranihUcenika;
    }

	public static void main(String[] args) {
		Ucenik prvi = new Ucenik();
        prvi.imePrezime="Петар Перић";
        prvi.razred=3;
        prvi.kreiranNovi(); // може се позвати преко инстанце
        Ucenik drugi = new Ucenik();
        drugi.imePrezime="Милан Микић";
        drugi.razred=6;
        Ucenik.kreiranNovi(); // али је преко назива класе природније
        System.out.println(drugi.vratiBrojKreiranih());
	}
}
