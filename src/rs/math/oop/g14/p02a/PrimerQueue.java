package rs.math.oop.g14.p02a;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class PrimerQueue {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		Queue<String> red = new LinkedList<>();
		red.add("0");
		red.offer("1");
		red.offer("2");
		red.offer("3");
		red.offer("4");
		System.out.println(red);
		String s = red.remove();
		System.out.println( s + "|" +red);
		s = red.poll();
		System.out.println( s + "|" +red);
		s = red.peek();
		System.out.println( s + "|" +red);
	}

}
