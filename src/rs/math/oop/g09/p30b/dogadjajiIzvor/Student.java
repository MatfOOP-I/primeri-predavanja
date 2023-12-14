package rs.math.oop.g09.p30b.dogadjajiIzvor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student implements SunceKretanjeDogadjajOsluskivac {
   private String ime;
   private boolean naRaspustu;

   public Student(String ime, boolean naRaspustu) {
      this.ime = ime;
      this.naRaspustu = naRaspustu;
   }

   public Student(String ime) {
      this( ime, false);
   }

   @Override
   public String toString(){
      if( naRaspustu)
         return "Student '" + ime + "'" + "(na raspustu)";
      else
         return "Student '" + ime + "'" + "(studira)";
   }

   @Override
   public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
      LocalDateTime datumVreme = e.uzmiDatumVreme();
      DateTimeFormatter formatDatum = DateTimeFormatter.ofPattern("dd.MM.YYYY.");
      DateTimeFormatter formatVreme = DateTimeFormatter.ofPattern("HH:mm:ss");
      System.out.printf("%s kaže: %s je dana %s %s u vreme %s. ",
            this, e.getSource(),  datumVreme.format(formatDatum),
            e.jesteIzaslo() ? "izaslo" : "zaslo", datumVreme.format(formatVreme));
      if( naRaspustu ) {
         if (e.jesteIzaslo())
            System.out.println("Zavrsen provod, idem na spavanje.");
         else
            System.out.println("Gde cemo nocas u provod?");
      }
      else {
         if (e.jesteIzaslo())
            System.out.println("Pocinje novi dan, moram da ucim.");
         else
            System.out.println("Vredno sam ucio, jos malo pa na spavanje.");
      }
   }
}