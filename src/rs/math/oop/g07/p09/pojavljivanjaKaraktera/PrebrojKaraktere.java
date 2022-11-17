package rs.math.oop.g07.p09.pojavljivanjaKaraktera;

public class PrebrojKaraktere {

	public static void main(String[] args) {
		String tekst = "Као што се може видети, низ brojPojava чува вредности "
				+ "броја појава за сваки од бројева из интервала. " 
				+ "Стога је тип компоненте низа целобројни тип, "
				+ "а број елемената низа је иницијално датом одређен "
				+ "дужином интервала granica."
				+ "Извршавањем овог програма добио би се следећи резултат.";
		// раздвајамо реченице на основу карактера тачка
		// запис сепаратора је у форми регуларног израза
		String[] recenice = tekst.split("\\.");
		// спољна петља је по реченицама
		char[][][] karakteri = new char[recenice.length][][];
		for (int i = 0; i < recenice.length; i++) {
			// са trim() уклањамо евентуални празан простор на крајевима реченица
			String[] reci = recenice[i].trim().split(" ");
			karakteri[i] = new char[reci.length][];
			for (int j = 0; j < reci.length; j++) {
				// уклањамо зарезе који су потенцијално остали на крају речи
				String rec = reci[j].replace(",", "");
				karakteri[i][j] = new char[rec.length()];
				for (int k = 0; k < rec.length(); k++)
					karakteri[i][j][k] = rec.charAt(k);
			}
		}
		prikazi2(karakteri);
	}

	private static void prikazi(char[][][] karakteri) {
		// исписујемо све карактере (једино је изгубљена информација о зарезима)
		for (int i = 0; i < karakteri.length; i++) {
			System.out.println("--------------------"
					+ System.lineSeparator() + "Реченица " + (i + 1)
					+ System.lineSeparator() + "--------------------");
			for (int j = 0; j < karakteri[i].length; j++) {
				for (int k = 0; k < karakteri[i][j].length; k++)
					System.out.print(karakteri[i][j][k]);
				System.out.println();
			}
		}
	}

	private static void prikazi2(char[][][] karakteri) {
		// исписујемо све карактере (једино је изгубљена информација о зарезима)
		int i = 1;
		for (char[][] recenica : karakteri) {
			System.out.println("--------------------"
					+ System.lineSeparator() + "Реченица " + (i++)
					+ System.lineSeparator() + "--------------------");
			for (char[] rec: recenica) {
				for (char slovo: rec)
					System.out.print(slovo);
				System.out.println();
			}
		}
	}

}
