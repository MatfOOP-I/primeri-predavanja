package rs.math.oop.g07.p11.promenljiviBrojArgumenata;

public class IspisiArgumente {

	static void ispisiSve(int... argumenti) {
		System.out.println(argumenti.length + " аргумената:");
		for (int a : argumenti)
			System.out.println(a);
	}

	public static void main(String[] args) {
		ispisiSve(20);
		ispisiSve(11, 22, 34, -1);
		ispisiSve();
	}
}
