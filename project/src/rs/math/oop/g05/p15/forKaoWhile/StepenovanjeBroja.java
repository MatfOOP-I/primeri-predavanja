package rs.math.oop.g05.p15.forKaoWhile;

public class StepenovanjeBroja {

	public static void main(String[] args) {
		double y = 0.9;
		double s = 1;
		int k = 0;
		for (; s > 0.1;) {
			s *= y;
			k++;
		}
		System.out.println(y+"^" + k + " = " + s);
	}
}
