package rs.math.oop.g09.p25.dobarPrincipI;

public class DobarPrincipI {

   public static void main(String[] argumenti){
      Porudzbina onLinePorudzbina = new OnLajnPorudzbina();
      Porudzbina telefonskPorudzbina = new TelefonskaPorudzbina();
      Porudzbina naLicuMestaPorudzbina = new LicnoNapravljenaPorudzbina();

      Placanje onLajnPlacanje = new OnLajnPlacanje();
      Placanje licnoPlacanje = new LicnoPlacanje();

      OnLajnKlijent klijent = new OnLajnKlijent("Владо", "Његошева 48",
            "vladaf@math.rs", onLinePorudzbina, onLajnPlacanje);
      klijent.uzmiPorudzbina().prihvatiPorudzbinu();
      klijent.uzmiPlacanje().platiPorudzbinu();

      klijent.postaviPorudzbina(telefonskPorudzbina);
      klijent.postaviPlacanje(licnoPlacanje);
      klijent.uzmiPorudzbina().prihvatiPorudzbinu();
      klijent.uzmiPlacanje().platiPorudzbinu();
   }
}
