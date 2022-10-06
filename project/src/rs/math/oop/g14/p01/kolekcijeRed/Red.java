package rs.math.oop.g14.p01.kolekcijeRed;
/**
 *  Поједностављена верзија генеричког реда из стандардне библиотеке
 * @param <T> - параметар типа без ограничења
 */
interface Red<T>{
	void dodaj(T element);
	T ukloni();
	int velicina();
}
