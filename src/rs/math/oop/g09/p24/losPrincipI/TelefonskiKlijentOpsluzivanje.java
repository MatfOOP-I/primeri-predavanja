package rs.math.oop.g09.p24.losPrincipI;

import static java.lang.System.err;
import static java.lang.System.out;

public class TelefonskiKlijentOpsluzivanje implements Restoran {

   @Override
   public void prihvatiOnLajnPorudzbinu() {
      err.println("Немогуће прихватити он-лајн поруџбину за телефонског клијента!");
   }

   @Override
   public void prihvatiTelefonskuPorudzbinu() {
      out.println("Реализује се прихватање поруџбине за телефонског клијента!");
   }

   @Override
   public void platiOnLajn() {

      err.println("Немогуће реализовати он-лајн плаћање за телефонског клијента!");
   }

   @Override
   public void staniURedZaLicnuPorudzbinu() {

      err.println("Немогуће стати у ред за телефонског клијента!");
   }

   @Override
   public void platiLicno() {
      out.println("Реализује се плаћање!");
   }
}
