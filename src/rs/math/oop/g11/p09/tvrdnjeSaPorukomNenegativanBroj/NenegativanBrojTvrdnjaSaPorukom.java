package rs.math.oop.g11.p09.tvrdnjeSaPorukomNenegativanBroj;

public class NenegativanBrojTvrdnjaSaPorukom {
      // покренути програм са аргументом -еа виртуелне машине (VM)
       public static void main(String[] args)
       {
          System.out.println("Почетак");
          int x = -1;
          assert x >= 0 : "Вредност променљиве x је негативна";
          System.out.println("Готово");
       }
}