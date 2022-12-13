package rs.math.oop.g11.p08.tvrdnjeNenegativanBroj;

import  static java.lang.System.out;
public class NenegativanBrojTvrdnja {
       // покренути програм са аргументом -еа виртуелне машине (VM)
       public static void main(String[] args)
       {
          int x = -1;
          assert x >= 0;
          out.println("Kao da nema problema");
       }
}