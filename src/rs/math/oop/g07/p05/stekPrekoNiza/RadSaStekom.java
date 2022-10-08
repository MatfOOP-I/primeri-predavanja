package rs.math.oop.g07.p05.stekPrekoNiza;

public class RadSaStekom {

	static double[] stek;
	static int vrhSteka;

	static void inicijalizujStek(int dimenzija) {
		stek = new double[dimenzija];
		vrhSteka = -1;
	}

	static void dodaj(double elem) {
		if (vrhSteka == stek.length - 1) {
			System.out.println("Грешка при додавању: стек је пун!");
			return;
		}
		stek[++vrhSteka] = elem;
	}

	static double ukloni() {
		if (vrhSteka == -1) {
			System.out.println("Грешка при уклањању: стек је празан!");
			return -1;
		}
		return stek[vrhSteka--];
	}

	static int brojElemenata() {
		return (vrhSteka + 1);
	}

	public static void main(String[] args) {
		double[] niz = { 13.4, 7.4, 6.3, 3.2, 4, 51, 6.2, 4.7, 3, 14.5, -7.6, 0, 25 };
		inicijalizujStek(100);
		int i = 0;
		while (i < niz.length) {
			double x = niz[i];
			dodaj(x);
			i++;
		}
		while (brojElemenata() > 0)
			System.out.print(ukloni() + "\t");
	}
}
