
/*

Класа за реализацију стека који садржи ниске.

Стек се реализује преко низа. 

Стек може да расте по потреби.
 
 */

package rs.math.oop.g11.p07b.stekPrekoNizaKorisnickiIzuzetak;

public class StekNiskiPrekoNizaSamorastuci implements StekNiski {

   private String[] elementi;
   private int vrhSteka;

   // inicijalizacioni blok primerka
   {
      elementi = new String[8];
      vrhSteka = -1;
   }

   @Override
   public void dodaj(String elem) {
      if (vrhSteka == elementi.length - 1) {
         String[] temp = elementi;
         elementi = new String[2 * temp.length];
         for (int i = 0; i < temp.length; i++)
            elementi[i] = temp[i];
      }
      elementi[++vrhSteka] = elem;
   }

   @Override
   public String ukloni() throws StekJePrazanIzuzetak {
      if (vrhSteka == -1) {
         throw new StekJePrazanIzuzetak();
      }
      return elementi[vrhSteka--];
   }

   @Override
   public int brojElemenata() {
      return (vrhSteka + 1);
   }
}
