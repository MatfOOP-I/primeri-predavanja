package rs.math.oop.g07.p06.sumaArgumenataKomandneLinije;

public class SumirajArgumente {

	public static void main(String[] args) {
		int suma = 0;
		for(String a : args) {
			int broj = Integer.parseInt(a);
			suma+=broj;
		}
		System.out.println("Сума је "+suma);
	}
}
