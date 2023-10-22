package rs.math.oop.g09.p17.kloniranjeMutabilnaPoljaProblem;

import java.time.LocalDate;

public class Zaposleni implements Cloneable {
   private Generalije generalije;
   private RadniOdnos radniOdnos;

   public Zaposleni(String ime, String prezime, String opisPosla, double plata) {
      generalije = new Generalije(ime, prezime);
      radniOdnos = new RadniOdnos(opisPosla, plata);
   }

   public void postaviPrezime(String prezime){
      generalije.postaviPrezime(prezime);
   }

   public void postaviDatumZaposlenja(int godina, int mesec, int dan) {
      LocalDate noviDatumZaposlenja = LocalDate.of(godina, mesec, dan);
      radniOdnos.postaviDatumZaposlenja(noviDatumZaposlenja);
   }

   public void povecajPlatu(double zaProcenat) {
      double iznosPovisice = radniOdnos.uzmiPlatu() * zaProcenat / 100;
      radniOdnos.postaviPlatu( radniOdnos.uzmiPlatu() + iznosPovisice);
   }

   @Override
   public String toString() {
      return "[име: " + generalije.uzmiIme() + " " + generalije.uzmiPrezime()
            + ", плата: " + radniOdnos.uzmiPlatu()
            + ", посао: '" + radniOdnos.uzmiOpisPosla()
            + "', запослен од: " + radniOdnos.uzmiDatumZaposlenja() + "]";
   }

   @Override
   public Zaposleni clone() throws CloneNotSupportedException {
      Zaposleni klonirani = (Zaposleni) super.clone();
      return klonirani;
   }
}
