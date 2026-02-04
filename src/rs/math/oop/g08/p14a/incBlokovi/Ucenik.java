package rs.math.oop.g08.p14a.incBlokovi;

public class Ucenik {

	String imePrezime;
	int razred;
	
    static int brojKreiranihUcenika = 10;

    static {
        brojKreiranihUcenika = 42;
    }

    {
        brojKreiranihUcenika++;
    }

    {
        razred = brojKreiranihUcenika % 4 +1;
    }
    
    static int vratiBrojKreiranih(){
        return brojKreiranihUcenika;
    }

	public static void main(String[] args) {
		Ucenik prvi = new Ucenik();
        prvi.imePrezime="Петар Перић";
        Ucenik drugi = new Ucenik();
        drugi.imePrezime="Милан Микић";
        System.out.println(drugi.vratiBrojKreiranih());
	}
}
