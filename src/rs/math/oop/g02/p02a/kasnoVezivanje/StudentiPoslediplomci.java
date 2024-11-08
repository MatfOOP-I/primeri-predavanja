package rs.math.oop.g02.p02a.kasnoVezivanje;

class StudentiPoslediplomci {
	// улазна тачка програма
	public static void main(String[] args) {
		Student prvi = new Student();
		prvi.imePrezime = "Марко Илић";
		prvi.brojIndeksa = 24;
		prvi.naBudzetu = false;

		Student drugi;
		drugi = new Student();
		drugi.imePrezime = "Ана Сарић";
		drugi.brojIndeksa = 25;
		drugi.naBudzetu = true;

		int n = 7;

		Poslediplomac novi;
		novi = new Poslediplomac();
		novi.postavibrojIspita(n);
		novi.imePrezime = "Петар Перић";
		novi.brojIndeksa = 4;
		novi.naBudzetu = true;

		Covek najnoviji = new Covek();
		najnoviji.imePrezime = "Митар Мирић";

		Covek[] niz = {novi, prvi, drugi, najnoviji};
		for(int i=0; i <niz.length; i++)
			niz[i].stampajPodatke();
	}
}