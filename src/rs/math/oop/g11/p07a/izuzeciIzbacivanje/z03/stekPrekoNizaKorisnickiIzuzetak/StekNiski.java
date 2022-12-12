package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z03.stekPrekoNizaKorisnickiIzuzetak;

public interface StekNiski {
   void push(String elem);
   String pop() throws StekJePrazanException;
   int brojElemenata();
}
