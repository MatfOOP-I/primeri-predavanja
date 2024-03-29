package rs.math.oop.g09.p30.dogadjaji;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Primer za kontrolu registracije slusaoca, deregistracije slusaoca i
 * ispaljivanja dogadjaja.
 * Primerak ove klase ispaljuje
 * SunceKretanjeDogadjaj svima koji osmataju kretanje sunca.
 */
public class InfrastrukturaZaSunceKretanjeDogadjaj {
   private SunceKretanjeDogadjajOsluskivac[] osluskivaci = new SunceKretanjeDogadjajOsluskivac[1000];
   private int brojOsluskivaca = 0;

   /**
    * Registruje osluskivac za SunceKretanjeDogadjaj
    */
   synchronized public void dodajOsluskivac(SunceKretanjeDogadjajOsluskivac l) {

      osluskivaci[brojOsluskivaca++] = l;
   }

   /**
    * Uklanja osluskivac za SunceKretanjeDogadjaj
    */
   synchronized public void ukloniOsluskivac(SunceKretanjeDogadjajOsluskivac l) {
      int pozicija = 0;
      for (; pozicija < brojOsluskivaca; pozicija++)
         if (osluskivaci[pozicija].equals(l))
            break;
      if (pozicija < brojOsluskivaca) {
         for (int i = pozicija; i < brojOsluskivaca - 1; i++)
            osluskivaci[i] = osluskivaci[i + 1];
         brojOsluskivaca--;
      }
   }

   /**
    * Ispaljuje dogadjaj tipa SunceKretanjeDogadjaj za sve registrovane osluskivace
    */
   protected void ispaliDogadjaj(boolean izaslo, LocalDateTime vremeIzlaska) {
      // ako nema osluskivaca, ne radi nista...
      if (brojOsluskivaca == 0)
         return;
      // kreiraj objekat za dogadjaj koji se salje
      SunceKretanjeDogadjaj dogadjaj = new SunceKretanjeDogadjaj(new Sunce(), izaslo, vremeIzlaska);

      // napravi kopiju liste osluskivaca,
      // za slucaj da neko doda/ukloni osluskivace
      SunceKretanjeDogadjajOsluskivac[] kopija;
      int brojKopija = brojOsluskivaca;
      synchronized (this) {
         kopija = Arrays.copyOf(osluskivaci, brojKopija);
      }
      // iteriranje kroz kopiju liste osluskivaca
      // i pozivanje metoda sunceSePomerilo za svaki od njih
      for (SunceKretanjeDogadjajOsluskivac osl:kopija) {
         osl.sunceSePomerilo(dogadjaj);
      }
   }

   protected void ispaliDogadjaj(boolean izaslo) {

      ispaliDogadjaj(izaslo, LocalDateTime.now());
   }
}