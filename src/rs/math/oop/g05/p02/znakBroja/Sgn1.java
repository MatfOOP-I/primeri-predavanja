package rs.math.oop.g05.p02.znakBroja;

public class Sgn1 {
	public static void main(String[] args) {
		int x = (int) (-10 + 20 * Math.random());
		int sgn = 1;
		if (x < 0)
			sgn = -1;
		if (x == 0)
			sgn = 0;
		// За x>0, sgn већ има додељену вредност при декларацији
		System.out.println("x=" + x + "  sgnx=" + sgn);
	}
}