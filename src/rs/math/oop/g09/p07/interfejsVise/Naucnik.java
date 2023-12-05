package rs.math.oop.g09.p07.interfejsVise;

public class Naucnik implements Radoznao, Razuman {
   private String ime;

   public Naucnik(String ime) {

      this.ime = ime;
   }

   public String uzmiIme() {

      return ime;
   }

   @Override
   public void prikaziUpit() {

      System.out.println( "Научник '"+ ime + "' поставља питање");
   }

   @Override
   public String tekstUpita() {

      return "Научник '"+ ime + "' поставља питање o смислу живота";
   }

   @Override
   public void razmotriCinjenice() {

      System.out.println( "Научник '"+ ime + "' разматра чињенице");
   }

   @Override
   public void definisiHipotezu() {

      System.out.println( "Научник '"+ ime + "' дефинише хипотезу");
   }
}