package rs.math.oop.g07.p06.sumaArgumenataKomandneLinije;

public class SumirajArgumente {

	public static void main(String[] argumentiKomandneLinije) {
		int suma = 0;
		for(String a : argumentiKomandneLinije) {
			int broj = Integer.parseInt(a);
			suma += broj;
		}
		System.out.println("Сума је "+suma);
	}
}
