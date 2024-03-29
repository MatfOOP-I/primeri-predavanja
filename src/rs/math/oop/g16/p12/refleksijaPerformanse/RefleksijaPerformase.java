package rs.math.oop.g16.p12.refleksijaPerformanse;

import java.lang.reflect.Array;

public class RefleksijaPerformase {
	public static void main(String[] argumenti) {
		testArray();
	}

	public static void testArray() {
		Class<?> cls = String.class;
		int dim = 100;

		long poc = System.nanoTime();
		Object niz = Array.newInstance(cls, dim);
		Array.set(niz, 5, "this is a test");
		String s = (String) Array.get(niz, 5);
		System.out.println(s);
		System.out.println("Preko refleksije trajalo " + (System.nanoTime() - poc) / 10e6 + "msec.");
		System.out.println("---");

		poc = System.nanoTime();
		String[] arr2 = new String[dim];
		arr2[5] = "this is a test";
		s = arr2[5];
		System.out.println(s);
		System.out.println("Bez refleksije trajalo " + (System.nanoTime() - poc) / 10e6 + "msec.");
	}

}
