package rs.math.oop.g11.p08.tvrdnjeNenegativanBroj;

public class NenegativanBrojTvrdnja {
       // покренути програм са аргументом -еа виртуелне машине (VM)
       public static void main(String[] args)
       {
           System.out.println("Почетак");
           int x = -1;
           assert x >= 0;
           System.out.println("Готово");
       }
}