package rs.math.oop.g09.p26.losPrincipD;

import static java.lang.System.out;

public class KlijentA {
   ServisB servis = new ServisB();

   public void uradiNesto() {
      String info = servis.uzmiInfo();
      out.println("KlijentA - " + info);
   }
}
