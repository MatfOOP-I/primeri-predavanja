package rs.math.oop.g11.p04.izuzeciKonverzijaUPogresanObjektniTip;

public class KonverzijaUPogresanObjektniTip {

	public static void main(String[] args) {
		System.out.println("Почетак");
		Integer broj = 5;
		//Boolean iskaz = (Boolean) broj;
		Object objekat = broj; //имплицитна конверзија ка општијем типу
		Boolean logickoSlovo = (Boolean) objekat;
		System.out.println("Готово");
	}
}