package rs.math.oop.g07.p06.sumaArgumenataKomandneLinije;

public class ArgumeniObrat {
	static String[] stek;
	static int vrhSteka;

	static void inicijalizujStek(int dimenzija) {
		stek = new String[dimenzija];
		vrhSteka = -1;
	}

	static void dodaj(String elem) {
		if (vrhSteka == stek.length - 1) {
			System.err.println("Грешка при додавању: стек је пун!");
			return;
		}
		stek[++vrhSteka] = elem;
	}

	static String ukloni() {
		if (vrhSteka == -1) {
			System.err.println("Грешка при уклањању: стек је празан!");
			return "";
		}
		return stek[vrhSteka--];
	}

	static int brojElemenata() {
		return (vrhSteka + 1);
	}

	public static void main(String[] args) {
		inicijalizujStek(args.length+1);
		for(String a : args) {
			dodaj(a);
		}
		int n = brojElemenata();
		for(int i=0; i<n; i++)
			System.out.print( ukloni() + " - ");
		System.out.println();
	}
}
