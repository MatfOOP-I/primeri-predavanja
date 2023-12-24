package rs.math.oop.g09.p30.dogadjaji;

import java.util.Scanner;

public class PracenjeKretanjaSunca {

   private static void koriscenje() {
      System.out.println("Naredbe: ps-<ime> = pretplati studenta <ime> na događaje ");
      System.out.println("         rs-<ime> = raskini pretplatu studenta <ime> na događaje ");
      System.out.println("         pr-<ime> = pretplati radnika <ime> na događaje ");
      System.out.println("         rr-<ime> = raskini pretplatu radnika <ime> na događaje ");
      System.out.println("         pc-<ime> = pretplati cvet <ime> na događaje ");
      System.out.println("         rc-<ime> = raskini pretplatu cveta <ime> na događaje ");
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
      InfrastrukturaZaSunceKretanjeDogadjaj centrala = new InfrastrukturaZaSunceKretanjeDogadjaj();
      boolean gotovo = false;
      while (!gotovo) {
         String ulaz = sc.next().trim();
         String[] delovi = ulaz.split("-");
         String naredba = delovi[0].trim();
         String ime = "";
         if(delovi.length > 1)
            ime = delovi[1].trim();
         switch (naredba) {
            case "ps": {
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
               break;
            }
            case "rs": {
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
               break;
            }
            case "pc": {
               System.out.println("Pretplacuje se '" + ime + "' na dogadjaje kretanja sunca");
               if (ime.equals("suncokret"))
                  centrala.dodajOsluskivac(sunc);
               if (ime.equals("nocna_frajla"))
                  centrala.dodajOsluskivac(nf);
               break;
            }
            case "rc": {
               System.out.println("Raskida se pretplata '" + ime + "' na dogadjaje kretanja sunca");
               if (ime.equals("suncokret"))
                  centrala.ukloniOsluskivac(sunc);
               if (ime.equals("nocna_frajla"))
                  centrala.ukloniOsluskivac(nf);
               break;
            }
            case "i":
               System.out.println("Emituje se dogadjaj za izlazak sunca");
               centrala.ispaliDogadjaj(true);
               break;
            case "z":
               System.out.println("Emituje se dogadjaj za zalazak sunca");
               centrala.ispaliDogadjaj(false);
               break;
            case "k":
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


