package rs.math.oop.g11.p09.tvrdnjeSaPorukomNenegativanBroj;

import static java.lang.System.out;

public class NenegativanBrojTvrdnjaSaPorukom {
      // покренути програм са аргументом -еа виртуелне машине (VM)
       public static void main(String[] args)
       {
          int x = -1;
          assert x >= 0 : "x < 0";
          out.println("Kao da nema problema");
       }
}