package rs.math.oop.g09.p16.kloniranjeMutabilnaPoljaProblem;


public class Kloniranje {

   public static void main(String[] args) throws CloneNotSupportedException{
         Zaposleni original = new Zaposleni("Јован", "Петровић", "припрравник", 30_000);
         original.postaviDatumZaposlenja(2017, 2, 14);
         Zaposleni klon = original.clone();
         System.out.println("После клонирања, пре промена:");
         System.out.println("оригинал = " + original);
         System.out.println("клон =     " + klon);

         original.postaviPrezime("Станишић");
         System.out.println("После постављања презимена оригинала на 'Станишић'");
         System.out.println("оригинал = " + original);
         System.out.println("клон =     " + klon);

         klon.povecajPlatu(10);
         System.out.println("После повећања плате клона за 10%");
         System.out.println("оригинал = " + original);
         System.out.println("клон =     " + klon);

         original.postaviDatumZaposlenja(2020, 4, 1);
         System.out.println("После постављања датума запослења оригинала на  01.04.2020");
         System.out.println("оригинал = " + original);
         System.out.println("клон =     " + klon);
   }
}

