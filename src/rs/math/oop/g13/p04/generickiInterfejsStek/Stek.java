package rs.math.oop.g13.p04.generickiInterfejsStek;

public interface Stek<T> {
   void dodaj(T elem);
   T ukloni();
   int brojElemenata();
}
