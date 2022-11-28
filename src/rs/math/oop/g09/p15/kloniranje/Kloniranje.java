package rs.math.oop.g09.p15.kloniranje;


public class Kloniranje {

   public static void main(String[] args) throws CloneNotSupportedException{
         Zaposleni original = new Zaposleni("Јован", "Петровић", "приправник", 30_000);
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
         System.out.println("клон =   " + klon);
   }
}

