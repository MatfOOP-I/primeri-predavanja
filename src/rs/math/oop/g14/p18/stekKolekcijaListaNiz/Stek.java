package rs.math.oop.g14.p18.stekKolekcijaListaNiz;

import java.util.Collection;

public interface Stek<T> extends Collection<T>
{
	void dodaj(T elem);
	T ukloni();
}
