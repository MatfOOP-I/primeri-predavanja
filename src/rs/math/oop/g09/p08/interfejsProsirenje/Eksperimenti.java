package rs.math.oop.g09.p08.interfejsProsirenje;

public class Eksperimenti {

   public static void main(String... args) {

      Eksperimentator eksp = new Istrazivac("Петровић", "Молекуларна Биологија");
      eksp.prikaziUpit();
      eksp.razmotriCinjenice();
      eksp.definisiHipotezu();
      eksp.realizujeEksperimente();

      Radoznao rdz = eksp;
      rdz.prikaziUpit();

      Razuman rzm = eksp;
      rzm.razmotriCinjenice();
      rzm.definisiHipotezu();
   }

}
