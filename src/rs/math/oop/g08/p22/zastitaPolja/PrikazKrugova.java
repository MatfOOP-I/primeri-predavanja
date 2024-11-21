package rs.math.oop.g08.p22.zastitaPolja;

import static java.lang.System.out;

public class PrikazKrugova {

	public static void main(String[] args) {
		KrugJavni kj = new KrugJavni(10, 20.4, 7.3);
		KrugZasticeni kz = new KrugZasticeni(10, 20.4, 7.3);
		out.println(kj);
		out.println(kz);
		kj.r = 10;
		kz.postaviR(10);
		out.println(kj);
		out.println(kz);
	}
}

