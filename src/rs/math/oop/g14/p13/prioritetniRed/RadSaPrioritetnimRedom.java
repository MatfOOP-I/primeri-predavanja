package rs.math.oop.g14.p13.prioritetniRed;

import java.util.PriorityQueue;
import java.util.Queue;

public class RadSaPrioritetnimRedom {

	public static void main(String[] args) {
		Queue<Proces> procesi = new PriorityQueue<>();
		procesi.add(new Proces("chrome", 10));
		procesi.add(new Proces("cmd", 4));
		procesi.add(new Proces("taskmgr", 1));
		procesi.add(new Proces("explorer", 3));
		System.out.println(procesi);
		System.out.println(procesi.peek()); // на врху је taskmgr
		System.out.println(procesi.poll()); // уклања се taskmgr
		System.out.println(procesi);
		procesi.add(new Proces("Network service", 2)); // нови најбитнији
		System.out.println(procesi);
	}
}
