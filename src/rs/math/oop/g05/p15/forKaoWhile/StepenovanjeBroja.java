package rs.math.oop.g05.p15.forKaoWhile;

public class StepenovanjeBroja {

	public static void main(String[] args) {
		System.out.println("Unesi broj izmedju 0 i 1");
		java.util.Scanner ulaz = new java.util.Scanner(System.in);
		double y = ulaz.nextDouble();
		int k;
		double s;
		for (k=1, s=y; s >= 0.1; s *= y, k++)
			System.out.println(y + "^" + k + " = " + s);
		System.out.println("Rezulat je: " + s);
	}
}
