package rs.math.oop.g09.p25.losPrincipD;

import static java.lang.System.out;

public class KlijentA {
   ServisB servis = new ServisB();

   public void uradiNesto() {
      String info = servis.getInfo();
      out.println("KlijentA - " + info);
   }
}
