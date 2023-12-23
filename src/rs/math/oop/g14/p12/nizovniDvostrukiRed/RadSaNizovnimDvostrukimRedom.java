package rs.math.oop.g14.p12.nizovniDvostrukiRed;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class RadSaNizovnimDvostrukimRedom {

	public static void main(String[] args) {
		Deque<String> red = new ArrayDeque<>();
		red.addLast("Петар");
		red.addLast("Ана");
		red.add("Марко"); // add исто што и addLast
		System.out.println(red); 
		red.removeFirst();
		red.remove(); // remove исто што и removeFirst
		System.out.println(red);
		red.addLast("Милана");
		red.addLast("Драган");
		System.out.println(red);
		
		Deque<String> stek = new ArrayDeque<>();
		stek.add("main");
		stek.addLast("fakt(4)");
		stek.addLast("fakt(3)");
		stek.addLast("fakt(2)");
		stek.addLast("fakt(1)");
		stek.addLast("fakt(0)");
		System.out.println(stek);
		stek.removeLast();
		stek.removeLast();
		System.out.println(stek);
	}
}
