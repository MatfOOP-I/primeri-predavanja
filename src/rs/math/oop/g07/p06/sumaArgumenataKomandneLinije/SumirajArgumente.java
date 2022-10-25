package rs.math.oop.g07.p06.sumaArgumenataKomandneLinije;

public class SumirajArgumente {

	public static void main(String[] argumenti) {
		int suma = 0;
		for(String a : argumenti) {
			int broj = Integer.parseInt(a);
			suma+=broj;
		}
		System.out.println("Сума је " + suma);
	}
}
