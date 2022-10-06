package rs.math.oop.g06.p14.testirajNormalnu;

public class TestirajPseudoNormalneBrojeve {

	public static void main(String[] args) {
		java.util.Scanner skener = new java.util.Scanner(System.in);
		System.out.println("Унесите број бројева ");
		int n = skener.nextInt();
		
		java.util.Random gen = new java.util.Random(12345);
		double prosek=0;
		for(int i=0; i<n; i++) {
			double sp = gen.nextGaussian();
			prosek+=sp;
		}
		prosek/=n;
		System.out.println("Просек је "+prosek);
		
		skener.close();
	}
}
