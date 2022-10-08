package rs.math.oop.g09.p06.interfejsImplementacija;

public class Strucnjak implements Radoznao {

   @Override
   public void prikaziUpit() {
      System.out.println("Реализација метода prikaziUpit() интерфејса Radoznao у класи Strucnjak");
   }

   @Override
   public String tekstUpita() {
      return "Реализација метода tekstUpita() интерфејса Radoznao у класи Strucnjak";
   }

   public String prikaziUpit2(){
      return "Реализација метода prikaziUpit2() у класи Strucnjak";
   }

}
