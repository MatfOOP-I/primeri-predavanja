package rs.math.oop.g10.p01.nestatickaUgnjezdenaObracunPlate;

public class ObracunPlataTest {

	public static void main(String[] args) {
		ObracunPlata op1 = new ObracunPlata(1000);
		ObracunPlata op2 = new ObracunPlata(1800);
		ObracunPlata op3 = new ObracunPlata(800);
		ObracunPlata op4 = new ObracunPlata(2200);
		System.out.println(String.format("%.2f", op1.izracunajPlatu(162)));
		System.out.println(String.format("%.2f", op2.izracunajPlatu(170)));
		System.out.println(String.format("%.2f", op3.izracunajPlatu(160)));
		System.out.println(String.format("%.2f", op4.izracunajPlatu(162)));
		
		// коментарисано јер је класа PrekovremeniRad проглашена за приватну
		// те на тај начин ексклузиван приступ њој има само класа ObracunPlata
		// ако бисмо желели да рачунамо прековремени рад и ван тела класе ObracunPlata
		// поставили бисмо другачији модификатор видљивости
		// ObracunPlata.PrekovremeniRad pr=new ObracunPlata.PrekovremeniRad(1000, 23);
		// System.out.println(pr.izracunajCenuPrekovremenog());
	}
}
