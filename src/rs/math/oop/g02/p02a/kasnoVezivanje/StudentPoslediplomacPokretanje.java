package rs.math.oop.g02.p02a.kasnoVezivanje;

class StudentPoslediplomacPokretanje {
	// улазна тачка програма
	public static void main(String[] args) {
		int n = 7;
		Student prvi = new Student();
		prvi.ime = "Марко Илић";
		prvi.brojIndeksa = 243;
		prvi.naBudzetu = false;

		Student drugi;
		drugi = new Student();
		drugi.ime = "Ана Сарић";
		drugi.brojIndeksa = 25;
		drugi.naBudzetu = true;

		Poslediplomac novi = new Poslediplomac();
		novi.postavibrojIspita(n);
		novi.ime = "Петар Перић";
		novi.brojIndeksa = 4;
		novi.naBudzetu = true;

		Covek[] niz = {prvi, drugi, novi};
		for(int i=0; i <niz.length; i++)
			niz[i].stampajPodatke();
	}
}