package rs.math.oop.g09.p18.kloniranjeMutabilnaPoljaResenje;

import java.time.LocalDate;

public class RadniOdnos implements Cloneable{
   private String opisPosla;
   private double plata;
   private LocalDate datumZaposlenja;

   public RadniOdnos(String opisPosla, double plata, LocalDate datumZaposlenja) {
      this.opisPosla = opisPosla;
      this.datumZaposlenja = datumZaposlenja;
      this.plata = plata;
   }

   public RadniOdnos(String opisPosla, double plata) {
      this(opisPosla, plata, LocalDate.of(2000, 1, 1));
   }

   public RadniOdnos(String opisPosla) {
      this(opisPosla, 300);
   }

   public String uzmiOpisPosla() {
      return opisPosla;
   }

   public void postaviOpisPosla(String opisPosla) {
      this.opisPosla = opisPosla;
   }

   public double uzmiPlatu() {
      return plata;
   }

   public void postaviPlatu(double plata) {
      this.plata = plata;
   }

   public LocalDate uzmiDatumZaposlenja() {
      return datumZaposlenja;
   }

   public void postaviDatumZaposlenja(LocalDate datumZaposlenja) {
      this.datumZaposlenja = datumZaposlenja;
   }

   @Override
   public RadniOdnos clone() throws CloneNotSupportedException {
      return (RadniOdnos) super.clone();
   }
}
