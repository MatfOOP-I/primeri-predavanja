
/*

Класа за реализацију стека који садржи ниске.

Стек се реализује преко једноструко повезане листе. 

Стек може да расте по потреби.
 
 */

package rs.math.oop.g11.pd03.stekPrekoListeKorisnickiIzuzetak;

public class StekNiskiPrekoPovezaneListe implements StekNiski {

   private PovezanaListaNiski elementi = new PovezanaListaNiski();

   @Override
   public void push(String elem) {
      elementi.dodajElemenatNaPocetak(elem);
   }

   @Override
   public String pop() throws StekJePrazanException{
      try {
         String elem = elementi.ukloniElemenatSaPocetka();
         return elem;
      }
      catch(PovezanaListaJePraznaException exp){
         throw new StekJePrazanException(exp);
      }
   }

   @Override
   public int brojElemenata() {
      String elem = elementi.getPrvi();
      if (elem == null)
         return 0;
      int n = 0;
      while (elem != null) {
         n++;
         elem = elementi.getSledeci();
      }
      return n;
   }
}
