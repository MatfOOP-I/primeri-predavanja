package rs.math.oop.g09.p08.interfejsProsirenje;

public class Istrazivac extends Naucnik implements Eksperimentator{

   private String probojUOblasti;

   public Istrazivac(String ime, String probojUOblasti) {
      super(ime);
      this.probojUOblasti = probojUOblasti;
   }

   public String uzmiProbojUOblasti() {

      return probojUOblasti;
   }

   @Override
   public void definisiHipotezu() {
      System.out.println("Истраживач '" + getIme() +"' је дао хипотезу у научној области " + uzmiProbojUOblasti());
   }

   @Override
   public void realizujeEksperimente() {
      System.out.println("Истраживач '" + getIme() +"' је реализовао експерименте у научној области " + uzmiProbojUOblasti());
   }

}
