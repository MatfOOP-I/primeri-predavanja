package rs.math.oop.g10.p03.lokalneUnutrasnjeProveraBrojaMobilnog;

public class ProveraBrojaMobilnog {

	static boolean proveriBrojMobilnog(String mobTekst) {
		int duzinaPozivnog = 3;
		int minBrojCifara = 6;
		int maksBrojCifara =7;
		String[] dozvoljeniPozivni = { "060", "061", "062", "063", 
				"064", "065", "066", "068", "069" };

		// класа која доводи текст броја телефона до стандардизованог формата
		class BrojTelefona {
			String mobTekst;
			String mobTekstStd;

			BrojTelefona(String mobTekst) {
				this.mobTekst = mobTekst;
				standardizuj();
			}

			void standardizuj() {
				// замењује се у складу са регуларним изразом
				// свако појављивање "/", "-" или празан простор се брише
				mobTekstStd = mobTekst.replace("/", "").replace("-","").replace(" ", "");
				if (mobTekstStd.length() >= duzinaPozivnog)
					mobTekstStd = mobTekstStd.substring(0, duzinaPozivnog)
					+ mobTekstStd.substring(duzinaPozivnog);
				else
					mobTekstStd = null; 
				System.out.println(mobTekstStd);
			}

			String pozivni() {
				return mobTekstStd.substring(0, 3);
			}

			String broj() {
				return mobTekstStd.substring(3);
			}
		}
		BrojTelefona brojTelefona = new BrojTelefona(mobTekst);
		if (brojTelefona.mobTekstStd == null)
			return false;
		String pozivni = brojTelefona.pozivni();
		boolean dozvoljen = false;
		for (String dp : dozvoljeniPozivni) {
			if (dp.equals(pozivni)) {
				dozvoljen = true;
				break;
			}
		}
		String broj = brojTelefona.broj();
		return dozvoljen && broj.length() >= minBrojCifara 
				&& broj.length() <= maksBrojCifara;
	}

	public static void main(String[] args) {
		String[] brojevi = { "069/434237","065   /32 -3321-2",
				"033 1223 555","067 332 - 2221"};
		for(String b : brojevi) {
			System.out.println(b);
			if(proveriBrojMobilnog(b))
				System.out.println("Исправан");
			else
				System.out.println("Није исправан");
			System.out.println("-----------------");
		}
	}
}
