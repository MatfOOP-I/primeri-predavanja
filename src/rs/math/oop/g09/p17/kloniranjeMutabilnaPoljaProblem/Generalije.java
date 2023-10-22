package rs.math.oop.g09.p17.kloniranjeMutabilnaPoljaProblem;

import java.time.LocalDate;

public class Generalije {

   private String ime;
   private String prezime;
   private String nadimak;
   private LocalDate datumRodjenja;

   public Generalije(String ime, String prezime, String nadimak, LocalDate datumRodjenja) {
      this.ime = ime;
      this.prezime = prezime;
      this.nadimak = nadimak;
      this.datumRodjenja = datumRodjenja;
   }

   public Generalije(String ime, String prezime) {
      this(ime, prezime, "", LocalDate.of(1970, 1, 1));
   }

   public String uzmiIme() {
      return ime;
   }

   public void postaviIme(String ime) {
      this.ime = ime;
   }

   public String uzmiPrezime() {
      return prezime;
   }

   public void postaviPrezime(String prezime) {
      this.prezime = prezime;
   }

   public String uzmiNadimak() {
      return nadimak;
   }

   public void postaviNadimak(String nadimak) {
      this.nadimak = nadimak;
   }

   public LocalDate uzmiDatumRodjenja() {
      return datumRodjenja;
   }

   public void postaviDatumRodjenja(LocalDate datumRodjenja) {
      this.datumRodjenja = datumRodjenja;
   }
}