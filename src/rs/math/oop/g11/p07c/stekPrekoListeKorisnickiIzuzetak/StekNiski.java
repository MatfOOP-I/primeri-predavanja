package rs.math.oop.g11.p07c.stekPrekoListeKorisnickiIzuzetak;

public interface StekNiski {
   void dodaj(String elem);
   String ukloni() throws StekJePrazanIzuzetak;
   int brojElemenata();
}
