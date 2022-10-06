package rs.math.oop.g09.p15.kloniranje;

public class Zaposleni implements Cloneable {
   private String ime;
   private String prezime;
   private String opisPosla;
   private double plata;

   public Zaposleni(String ime, String prezime, String opisPosla, double plata) {
      this.ime = ime;
      this.prezime = prezime;
      this.opisPosla = opisPosla;
      this.plata = plata;
   }

   public Zaposleni(){
      this("","", "", 0);
   }

   public void postaviPrezime(String prezime) {
      this.prezime = prezime;
   }

   public void povecajPlatu(double zaProcenat) {
      double iznosPovisice = plata * zaProcenat / 100;
      this.plata += iznosPovisice;
   }

   @Override
   public String toString() {
      return "[име: " + ime + " " + prezime
            + ", посао: '" + opisPosla
            + "', плата: " + plata + "]";
   }

   @Override
   public Zaposleni clone() throws CloneNotSupportedException {
      Zaposleni klonirani = (Zaposleni) super.clone();
      return klonirani;
   }
}
