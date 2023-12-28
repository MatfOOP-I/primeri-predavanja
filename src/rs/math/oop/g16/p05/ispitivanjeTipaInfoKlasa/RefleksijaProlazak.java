package rs.math.oop.g16.p05.ispitivanjeTipaInfoKlasa;

import java.util.Scanner;

public class RefleksijaProlazak {

    public static void prolazak(Object o){
        for (int n = 0; ; o = o.getClass())
        {
            System.out.println("L"+ ++n + ": " + o + ".getClass() = " + o.getClass());
            if (o == o.getClass())
                break;
        }
    }

    public static void main(String[] args)
    {
        prolazak( "Miki Maus");
//        System.out.println("---");
//        prolazak(new Scanner(System.in));
//        System.out.println("---");
    }

}
