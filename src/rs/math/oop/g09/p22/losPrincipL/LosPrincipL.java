package rs.math.oop.g09.p22.losPrincipL;

import static java.lang.System.*;

public class LosPrincipL {

   public static void povrsinaProvera(Pravougaonik p) {
      p.postaviSirinu(3);
      p.postaviVisinu(2);
      double povrsina = p.povrsina();
      if(Double.compare(povrsina, 6.0) == 0)
         out.printf(p.getClass().getSimpleName() + ": Све ОК! Израчуната површина је %f%n", povrsina);
      else
         err.printf(p.getClass().getSimpleName() + ": Проблем! Израчуната површина је %f, треба да буде %f%n", povrsina, 6.0);
   }

   public static void main(String[] argumenti){
      Pravougaonik p = new Pravougaonik();
      povrsinaProvera(p);
      Kvadrat k = new Kvadrat();
      povrsinaProvera(k);
   }
}
