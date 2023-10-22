package rs.math.oop.g08.p07.pristupPoljima;

public class Ucenik {
	String imePrezime;
	int razred;
	
	public static void main(String[] args) {
		Ucenik prvi = new Ucenik();
		prvi.imePrezime="Петар Перић";
		prvi.razred=3;
		Ucenik drugi = new Ucenik();
		drugi.imePrezime="Милан Микић";
		drugi.razred=6;
		System.out.println(prvi.razred);
		System.out.println(drugi.imePrezime);
	}
}
