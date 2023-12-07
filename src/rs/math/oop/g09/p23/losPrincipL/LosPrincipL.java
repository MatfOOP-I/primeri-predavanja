package rs.math.oop.g09.p23.losPrincipL;

import static java.lang.System.*;

public class LosPrincipL {

   public static void povrsinaProvera(Pravougaonik p) {
      double s = 3;
      p.postaviSirinu(s);
      double v = 4;
      p.postaviVisinu(v);
      double povrsina = p.povrsina();
      if(Double.compare(povrsina, s*v) == 0)
         out.printf(p.getClass().getSimpleName() + ": Све ОК! Израчуната површина је %f%n", povrsina);
      else
         err.printf(p.getClass().getSimpleName()
                 + ": Проблем! Израчуната површина је %f, треба да буде %f%n", povrsina, (s*v));
   }

   public static void main(String[] argumenti){
      Pravougaonik p = new Pravougaonik();
      povrsinaProvera(p);
      Kvadrat k = new Kvadrat();
      povrsinaProvera(k);
   }
}
