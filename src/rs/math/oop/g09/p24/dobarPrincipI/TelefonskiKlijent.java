package rs.math.oop.g09.p24.dobarPrincipI;

public class TelefonskiKlijent {
   private String ime;
   private String adresa;
   private String brojTelefona;
   private Porudzbina porudzbina;
   private Placanje placanje;

   public TelefonskiKlijent(String ime, String adresa, String brojTelefona,
                            Porudzbina porudzbina, Placanje placanje) {
      this.ime = ime;
      this.adresa = adresa;
      this.brojTelefona = brojTelefona;
      this.porudzbina = porudzbina;
      this.placanje = placanje;
   }
}
