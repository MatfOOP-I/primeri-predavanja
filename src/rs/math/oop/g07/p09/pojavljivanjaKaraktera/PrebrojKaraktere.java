package rs.math.oop.g07.p09.pojavljivanjaKaraktera;

public class PrebrojKaraktere {

	public static void main(String[] args) {
		String tekst = "Као што се може видети, низ brojPojava чува вредности "
				+ "броја појава за сваки од бројева из интервала. " 
				+ "Стога је тип компоненте низа целобројни тип, "
				+ "а број елемената низа је иницијално одређен "
				+ "дужином интервала granica."
				+ "Извршавањем овог програма добио би се следећи резултат.";
		// раздвајамо реченице на основу карактера тачка
		// запис сепаратора је у форми регуларног израза
		String[] recenice = tekst.split("\\.");
		// спољна петља је по реченицама
		char[][][] znaciRecRecenica = new char[recenice.length][][];
		for (int i = 0; i < recenice.length; i++) {
			// са trim() уклањамо евентуални празан простор на крајевима реченица
			String[] reci = recenice[i].trim().split(" ");
			znaciRecRecenica[i] = new char[reci.length][];
			for (int j = 0; j < reci.length; j++) {
				// уклањамо зарезе који су потенцијално остали на крају речи
				String rec = reci[j].replace(",", "");
				znaciRecRecenica[i][j] = new char[rec.length()];
				for (int k = 0; k < rec.length(); k++)
					znaciRecRecenica[i][j][k] = rec.charAt(k);
			}
		}
		// исписујемо све карактере (једино је изгубљена информација о зарезима)
		for (int i = 0; i < znaciRecRecenica.length; i++) {
			for (int j = 0; j < znaciRecRecenica[i].length; j++) {
				for (int k = 0; k < znaciRecRecenica[i][j].length; k++)
					System.out.println(
							String.format("(%d,%d,%d)=%c", 
									i, j, k, znaciRecRecenica[i][j][k]));
			}
		}
	}
}
