package rs.math.oop.g09.p23.losPrincipI;

import static java.lang.System.*;

public class OnLajnKlijentOpsluzivanje implements Restoran {
   @Override
   public void prihvatiOnLajnPorudzbinu() {
      out.println("Realizuje se postavljanje on-lajn poruzbine!");
   }

   @Override
   public void prihvatiTelefonskuPorudzbinu() {
      err.println("Nemoguce prihvatiti telefonsku porudzbinu za on-lajn klijenta!");
   }

   @Override
   public void platiOnLajn() {
      out.println("Realizuje se on-lajn placanje za on-lajn klijenta!");
   }

   @Override
   public void staniURedZaLicnuPorudzbinu() {
      err.println("Nemoguce stati u red za licnu porudzbinu za on-lajn klijenta!");
   }

   @Override
   public void platiLicno() {
      err.println("Nemoguce licno plattiti za on-lajn klijenta!");
   }
}
