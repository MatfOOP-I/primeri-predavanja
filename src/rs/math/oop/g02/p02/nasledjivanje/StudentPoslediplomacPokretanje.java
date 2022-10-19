package rs.math.oop.g02.p02.nasledjivanje;

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

		prvi.stampajPodatke();
		drugi.stampajPodatke();

		Poslediplomac novi = new Poslediplomac();
		novi.postaviBrojIspita(n);
		novi.ime = "Петар Перић";
		novi.brojIndeksa = 4;
		novi.naBudzetu = true;
		novi.stampajPodatke();
		System.out.println(novi.ime + " је положио " + novi.uzmiBrojIspita() + " испита.");
	}
}