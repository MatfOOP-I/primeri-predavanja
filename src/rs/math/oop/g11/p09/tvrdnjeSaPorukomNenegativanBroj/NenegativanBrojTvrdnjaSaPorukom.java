package rs.math.oop.g11.p09.tvrdnjeSaPorukomNenegativanBroj;

// покренути програм са аргументом виртуелне машине (VM):
// -еа
public class NenegativanBrojTvrdnjaSaPorukom {

       public static void main(String[] args)
       {
          System.out.println("Почетак");
          int x = -1;
          assert x >= 0 : "Вредност променљиве x је негативна";
          System.out.println("Готово");
       }
}