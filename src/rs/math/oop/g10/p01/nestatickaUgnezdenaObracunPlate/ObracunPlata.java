package rs.math.oop.g10.p01.nestatickaUgnezdenaObracunPlate;

public class ObracunPlata {
	private static int minimalnoSati=160;
	private static int maksimalnaCenaSata=2000;
	private int cenaSata;
	
	public ObracunPlata(int cenaSata) {
		if(cenaSata>maksimalnaCenaSata) {
			// овде cмо могли и да завршимо извршавање са грешком
			System.err.println("Редукујемо цену на износ "+maksimalnaCenaSata);
			cenaSata = maksimalnaCenaSata;
		}
		if(cenaSata<=0) {
			System.err.println("Цена сата "+cenaSata+" нема смисла.");
			System.exit(1);
		}
		this.cenaSata=cenaSata;
	}
	
	public double izracunajPlatu(int brojSati) {
		if(brojSati<minimalnoSati) {
			System.err.println("Није јасна рачуница кад је број сати испод норме!");
			System.exit(1);
		}
		double plata = minimalnoSati*cenaSata;
		if(brojSati>minimalnoSati) {
			PrekovremeniRad prekovremeni = new PrekovremeniRad(cenaSata,
					brojSati-minimalnoSati);
			plata+=prekovremeni.izracunajCenuPrekovremenog();
		}
		return plata;
	}
	
	// пошто је класа приватна не може се видети ван тела класе ObracunPlata
	private static class PrekovremeniRad{
		private static double koeficijentUvecanja=1.02;
		private int cenaSata;
		private int prekovremenoSati;
		
		// чак и да класа није приватна, конструктор би био сакривен ван класе
		private PrekovremeniRad(int cenaSata, int prekovremenoSati) {
			this.cenaSata=cenaSata;
			this.prekovremenoSati=prekovremenoSati;
		}
		
		private double izracunajCenuPrekovremenog() {
			double koeficijent = koeficijentUvecanja;
			double cenaPrekovremenih = 0;
			for(int i=0; i<prekovremenoSati; i++) {
				double uvecanaCena = cenaSata*koeficijent;
				if(uvecanaCena>maksimalnaCenaSata)
					uvecanaCena=maksimalnaCenaSata;
				cenaPrekovremenih+=uvecanaCena;
				koeficijent*=koeficijentUvecanja;
			}
			return cenaPrekovremenih;
		}
	}
}
