package rs.math.oop.g03.p06.objektnaParadigma;

class ObjektnoNzd {
	// улазна тачка програма
	public static void main(String[] args) {
		// бројеви чији се НЗД и НЗС тражи
		Integer prviBroj = new Integer(48);
		Integer drugiBroj = new Integer(120);
		Integer treciBroj = new Integer(56);
		// приказ бројева чији се НЗД и НЗС тражи
		System.out.println("Први број је " + prviBroj.toString());
		System.out.println("Други број је " + drugiBroj.toString());
		System.out.println("Трећи број је " + treciBroj.toString());
		// одређивање НЗД за ова три броја
		Integer nzd = nzd3(prviBroj, drugiBroj, treciBroj);
		// приказ резултата
		System.out.println("НЗД ова три броја је " + nzd.toString());

	}

// одређивање НЗД за два броја
	static Integer nzd2(Integer prvi, Integer drugi) {
		while (drugi > 0) {
			int ostatak = prvi % drugi;
			prvi = drugi;
			drugi = ostatak;
		}
		return prvi;
	}

	// одређивање НЗД за три броја
	static Integer nzd3(Integer prvi, Integer drugi, Integer treci) {
		return nzd2(nzd2(prvi, drugi), treci);
	}
}
