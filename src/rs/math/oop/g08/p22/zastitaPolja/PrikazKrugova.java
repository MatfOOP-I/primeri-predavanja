package rs.math.oop.g08.p22.zastitaPolja;

public class PrikazKrugova {

	public static void main(String[] args) {
		KrugJavni kj = new KrugJavni(10, 20.4, 7.3);
		KrugZasticeni kz = new KrugZasticeni(10, 20.4, 7.3);
		System.out.println(kj);
		System.out.println(kz);
		kj.r = 10;
		kz.postaviR(10);
		System.out.println(kj);
		System.out.println(kz);
	}
}

