package rs.math.oop.g14.p19.novaKolekcijaStekPrekoPovezaneListe;

import java.util.Collection;

public interface Stack<E> extends Collection<E>
{
	void push(E elem);
	
	E peek();
	
	E pop();
}
