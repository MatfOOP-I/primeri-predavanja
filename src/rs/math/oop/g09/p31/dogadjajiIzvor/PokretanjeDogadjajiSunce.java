package rs.math.oop.g09.p31.dogadjajiIzvor;

import java.util.Scanner;

public class PokretanjeDogadjajiSunce {

   private static void koriscenje() {
      System.out.println("Naredbe: p-<ime> = pretplati studenta <ime> (ili suncokret, nocna_frajla) na događaje ");
      System.out.println("         r-<ime> = raskini pretplatu studenta <ime> (ili suncokret, nocna_frajla) na događaje ");
      System.out.println("         i       = emituj događaj izlazak sunca ");
      System.out.println("         z       = emituj događaj zalazak sunca ");
      System.out.println("         k       = kraj ");
   }

   public static void main(String... argumenti) {
      System.out.println("Objekti: ");
      Student petar = new Student("petar");
      System.out.println(petar);
      Student mitar = new Student("mitar");
      System.out.println(mitar);
      Student miki = new Student("miki", true);
      System.out.println(miki);
      Student paja = new Student("paja", true);
      System.out.println(paja);
      Student milica = new Student("milica");
      System.out.println(milica);
      Suncokret sunc = new Suncokret();
      System.out.println(sunc);
      NocnaFrajla nf = new NocnaFrajla();
      System.out.println(nf);
      System.out.println();
      koriscenje();
      Scanner sc = new Scanner(System.in);
      SunceKretanjeDogadjajCentrala centrala = new SunceKretanjeDogadjajCentrala();
      boolean gotovo = false;
      while (!gotovo) {
         String ulaz = sc.next().trim();
         char naredba = ulaz.toCharArray()[0];
         switch (naredba) {
            case 'p': {
               String ime = ulaz.substring(2);
               System.out.println("Pretplacuje se '" + ime + "' na dogadjaje kretanja sunca");
               if (ime.equals("petar"))
                  centrala.dodajOsluskivac(petar);
               if (ime.equals("mitar"))
                  centrala.dodajOsluskivac(mitar);
               if (ime.equals("miki"))
                  centrala.dodajOsluskivac(miki);
               if (ime.equals("paja"))
                  centrala.dodajOsluskivac(paja);
               if (ime.equals("milica"))
                  centrala.dodajOsluskivac(milica);
               if (ime.equals("suncokret"))
                  centrala.dodajOsluskivac(sunc);
               if (ime.equals("nocna_frajla"))
                  centrala.dodajOsluskivac(nf);
               break;
            }
            case 'r': {
               String ime = ulaz.substring(2);
               System.out.println("Raskida se pretplata '" + ime + "' na dogadjaje kretanja sunca");
               if (ime.equals("petar"))
                  centrala.ukloniOsluskivac(petar);
               if (ime.equals("mitar"))
                  centrala.ukloniOsluskivac(mitar);
               if (ime.equals("miki"))
                  centrala.ukloniOsluskivac(miki);
               if (ime.equals("paja"))
                  centrala.ukloniOsluskivac(paja);
               if (ime.equals("milica"))
                  centrala.ukloniOsluskivac(milica);
               if (ime.equals("suncokret"))
                  centrala.ukloniOsluskivac(sunc);
               if (ime.equals("nocna_frajla"))
                  centrala.ukloniOsluskivac(nf);
               break;
            }
            case 'i':
               System.out.println("Emituje se dogadjaj za izlazak sunca");
               centrala.ispaliDogadjaj(true);
               break;
            case 'z':
               System.out.println("Emituje se dogadjaj za zalazak sunca");
               centrala.ispaliDogadjaj(false);
               break;
            case 'k':
               System.out.println("Zavrsetak rada");
               gotovo = true;
               break;
            default:
               System.out.println("Nekorektna naredba");
               koriscenje();
         }
      }
      sc.close();
   }

}


