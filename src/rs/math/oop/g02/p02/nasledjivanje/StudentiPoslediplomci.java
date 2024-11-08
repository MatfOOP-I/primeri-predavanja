package rs.math.oop.g02.p02.nasledjivanje;

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

		prvi.stampajPodatke();
		drugi.stampajPodatke();

		int n = 7;
		Poslediplomac novi = new Poslediplomac();
		novi.postavibrojIspita(n);
		novi.imePrezime = "Петар Перић";
		novi.brojIndeksa = 4;
		novi.naBudzetu = true;
		novi.stampajPodatke();
		System.out.println(novi.imePrezime + " је положио " + novi.uzmibrojIspita() + " испита.");

	}
}