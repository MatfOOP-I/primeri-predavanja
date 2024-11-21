package rs.math.oop.g07.p12.promenljiviBrojArgumenata;

public class IspisiArgumente {

	static void ispisiSve(int... argumenti) {
		System.out.println(argumenti.length + " аргумената:");
		for (int a : argumenti)
			System.out.printf("%8d ", a);
		System.out.println();
	}

	static void ispisiSve2(int[] argumenti) {
		System.out.println(argumenti.length + " аргумената:");
		for (int a : argumenti)
			System.out.printf("%8d ", a);
		System.out.println();
	}

	public static void main(String... args) {
		int[] niz = {11, 22, 34, -1};
		ispisiSve2(niz);
		ispisiSve(niz);
		//ispisiSve2(20);
		ispisiSve(20);
		//ispisiSve2(11, 22, 34, -1);
		ispisiSve(11, 22, 34, -1);
		//ispisiSve2();
		ispisiSve();
		ispisiSve(11, 22, 34, -1, 11, 22, 34, -1, 10);

	}
}
