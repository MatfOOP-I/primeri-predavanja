package rs.math.oop.g05.p02.znakBroja;

public class Sgn2 {
	public static void main(String[] args) {
		int x = (int) (-10 + 20 * Math.random());
		int sgn;
		if (x < 0)
			sgn = -1;
		else if (x == 0)
			sgn = 0;
		else
			sgn = 1;
		System.out.println("x=" + x + "  sgnx=" + sgn);
	}
}
