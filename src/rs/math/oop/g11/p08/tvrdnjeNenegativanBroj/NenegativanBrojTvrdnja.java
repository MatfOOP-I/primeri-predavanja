package rs.math.oop.g11.p08.tvrdnjeNenegativanBroj;

// покренути програм са аргументом виртуелне машине (VM):
// -еа
public class NenegativanBrojTvrdnja {

       public static void main(String[] args)
       {
           System.out.println("Почетак");
           int x = -1;
           assert x >= 0;
           System.out.println("Готово");
       }
}