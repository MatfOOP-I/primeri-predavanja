package rs.math.oop.g11.p07b.stekPrekoNizaKorisnickiIzuzetak;

public interface StekNiski {
   void dodaj(String elem);
   String ukloni() throws StekJePrazanIzuzetak;
   int brojElemenata();
}
