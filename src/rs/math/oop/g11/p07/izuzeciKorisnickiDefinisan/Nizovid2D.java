package rs.math.oop.g11.p07.izuzeciKorisnickiDefinisan;

public class Nizovid2D {

	static double[][] saberi(double[][] a, double[][] b) throws Niz2DIzuzetak {
		if (a.length != b.length)
			throw new Niz2DIzuzetak("Лоше спољне димензије.");
		double[][] c = new double[a.length][];
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length)
				throw new Niz2DIzuzetak("Лоше унутрашње димензије.");
			c[i] = new double[a[i].length];
			for (int j = 0; j < c[i].length; j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		return c;
	}

	public static void main(String[] args) {
		double[][] m1 = new double[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] m2 = new double[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		double[][] m3 = new double[][] { { 1, 1, 1 }, { 1, 1, 1 } };
		try {
			double[][] m4 = saberi(m1, m3);
			System.out.println("Прво сабирање успело.");
			double[][] m5 = saberi(m1, m2);
			System.out.println("Друго сабирање успело.");
		} catch (Niz2DIzuzetak e) {
			System.err.println(e);
		}
	}
}
