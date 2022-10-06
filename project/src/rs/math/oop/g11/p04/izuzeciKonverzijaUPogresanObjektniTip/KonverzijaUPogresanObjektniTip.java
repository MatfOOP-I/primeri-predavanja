package rs.math.oop.g11.p04.izuzeciKonverzijaUPogresanObjektniTip;

public class KonverzijaUPogresanObjektniTip {

	public static void main(String[] args) {
		Integer broj = 5;
		Object objekat = broj; //имплицитна конверзија ка општијем типу
		Boolean logickoSlovo = (Boolean) objekat;
	}
}