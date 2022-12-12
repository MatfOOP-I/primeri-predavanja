package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public interface StekNiski {
   void push(String elem);
   String pop() throws StekJePrazanException;
   int brojElemenata();
}
