package rs.math.oop.g09.p24.losPrincipI;

import static java.lang.System.*;

public class OnLajnKlijentOpsluzivanje implements Restoran {
   @Override
   public void prihvatiOnLajnPorudzbinu() {

      out.println("Реализује се постављање он-лајн поруџбине!");
   }

   @Override
   public void prihvatiTelefonskuPorudzbinu() {
      err.println("Немогуће прихватити телефонску поруџбину за он-лајн клијента!");
   }

   @Override
   public void platiOnLajn() {

      out.println("Реализује се он-лајн плаћање за он-лајн клијента!");
   }

   @Override
   public void staniURedZaLicnuPorudzbinu() {
      err.println("Немогће стати у ред за личну поруџбину за он-лајн клијента!");
   }

   @Override
   public void platiLicno() {

      err.println("Немогуће лично платити за он-лајн клијента!");
   }
}
