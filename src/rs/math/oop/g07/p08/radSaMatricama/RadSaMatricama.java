package rs.math.oop.g07.p08.radSaMatricama;

public class RadSaMatricama {
	
	static void prikazi(double[][] a) {
		if (a == null) {
			System.err.println("Грешка! Матрица не постоји.");
			return;
		}
		System.out.println("Елементи матрице су:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.printf("%15.4f", a[i][j]);
			System.out.printf("\n");
		}
	}

	static void prikazi2(double[][] a) {
		if (a == null) {
			System.err.println("Грешка! Матрица не постоји.");
			return;
		}
		System.out.println("Елементи матрице су");
		for (double[] vrsta : a) {
			for (double x : vrsta)
				System.out.printf("%15.4f", x);
			System.out.printf("%n");
		}
	}

	static double[][] saberi(double[][] a, double[][] b) {
		if (a.length != b.length)
			return null;
		for (int i = 1; i < a.length; i++)
			if (a[0].length != a[i].length)
				return null;
		for (int i = 1; i < b.length; i++)
			if (b[0].length != b[i].length)
				return null;
		for (int i = 0; i < a.length; i++)
			if (a[i].length != b[i].length)
				return null;
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c[i].length; j++)
				c[i][j] = a[i][j] + b[i][j];
		return c;
	}

	static double[][] oduzmi(double[][] a, double[][] b) {
		if (a.length != b.length)
			return null;
		for (int i = 1; i < a.length; i++)
			if (a[0].length != a[i].length)
				return null;
		for (int i = 1; i < b.length; i++)
			if (b[0].length != b[i].length)
				return null;
		for (int i = 0; i < a.length; i++)
			if (a[i].length != b[i].length)
				return null;
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c[i].length; j++)
				c[i][j] = a[i][j] - b[i][j];
		return c;
	}

	static double[][] pomnozi(double[][] a, double[][] b) {
		if (a[0].length != b.length)
			return null;
		for (int i = 1; i < a.length; i++)
			if (a[0].length != a[i].length)
				return null;
		for (int i = 1; i < b.length; i++)
			if (b[0].length != b[i].length)
				return null;
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < a[i].length; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		return c;
	}

	static boolean jeKvadratna(double[][] a) {
		for (int i = 0; i < a.length; i++)
			if (a.length != a[i].length)
				return false;
		return true;
	}

	static double[][] iskljuci(double[][] a, int vrsta, int kolona) {
		int n = a.length;
		double[][] mat = new double[n - 1][n - 1];
		for (int i = 0; i < vrsta; i++)
			for (int j = 0; j < kolona; j++)
				mat[i][j] = a[i][j];
		for (int i = vrsta; i < n - 1; i++)
			for (int j = 0; j < kolona; j++)
				mat[i][j] = a[i + 1][j];
		for (int i = 0; i < vrsta; i++)
			for (int j = kolona; j < n - 1; j++)
				mat[i][j] = a[i][j + 1];
		for (int i = vrsta; i < n - 1; i++)
			for (int j = kolona; j < n - 1; j++)
				mat[i][j] = a[i + 1][j + 1];
		return mat;
	}

	static double determinanta(double[][] a) {
		int n = a.length;
		if (n == 1)
			return a[0][0];
		if (n == 2)
			return a[0][0] * a[1][1] - a[1][0] * a[0][1];
		double det = 0;
		double znak = 1;
		for (int j = 0; j < n; j++) {
			double[][] x = iskljuci(a, 0, j);
			det += znak * a[0][j] * determinanta(x);
			znak = -znak;
		}
		return det;
	}
	
	public static void main(String[] args) {
		double[][] a = { { 1.5, 2, 3 }, { 4, 5, 6 } };
		System.out.println("A je: ");
		prikazi(a);
		double[][] b = { { 2, 3, 4 }, { 5, 6.6, 7 } };
		System.out.println("B je: ");
		prikazi2(b);
		System.out.println("A+B je: ");
		prikazi2(saberi(a, b));
		System.out.println("A-B je: ");
		prikazi2(oduzmi(a, b));
		System.out.println("A након измене je: ");
		a[1][1] = 7.5;
		prikazi2(a);
		double[][] c = { { 2, 1.5 }, { 3, 0 }, { -1.5, 1 } };
		System.out.println("C је: ");
		prikazi(c);
		System.out.println("C*A је: ");
		double[][] d = pomnozi(c, a);
		prikazi(d);
		if (jeKvadratna(d))
			System.out.println("Детерминанта матрице C*A је: " + determinanta(d));
		else
			System.out.println("Матрица C*A није квадратна па нема детерминанту.");
		double[][] e = { { -2, 1.5, -2, 3 }, {-3, 1, -3, 2 }, { 1,2,-1.5, 1 },{1,1,2,2} };
		System.out.println("E је: ");
		prikazi(e);
		System.out.println("Детерминанта матрице E је: " + determinanta(e));


	}
}
