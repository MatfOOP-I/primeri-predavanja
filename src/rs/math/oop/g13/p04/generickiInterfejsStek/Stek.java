package rs.math.oop.g13.p04.generickiInterfejsStek;

public interface Stek<E> {
   void dodaj(E elem);
   E ukloni();
   int brojElemenata();
}
