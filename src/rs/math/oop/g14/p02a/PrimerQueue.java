package rs.math.oop.g14.p02a;

import java.util.LinkedList;
import java.util.Queue;

public class PrimerQueue {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		Queue<String> red = new LinkedList<>();
		red.add("Мики");
		red.offer("Паја");
		red.offer("Марија");
		red.offer("Ивана");
		red.offer("Дарко");
		System.out.println(red);
		String s = red.remove();
		System.out.println( s + "|" +red);
		s = red.poll();
		System.out.println( s + "|" +red);
		s = red.peek();
		System.out.println( s + "|" +red);
		System.out.println( "Величина реда: " + red.size() );
		System.out.println( "Ред: " + red );
	}

}
