package rs.math.oop.g08.p06a.konverzijaTipa;

public class Konverzija {
    public static void main(String... args){
        int x = 7, y =24;
        double z = x+y;
        x = (int) (z+2.5);

        Kutija k = new Kutija();
        k.dubina = 12;
        Object o1 = k;

        Object o2 = "Miki Maus";
        String s2 = (String) o2;
        System.out.println(s2);

        Kutija k2 = (Kutija) o2;
        System.out.println(k2.dubina);

        Object o3 = new Kutija();
        ((Kutija)o3).dubina = 12;
        System.out.println(((Kutija)o3).dubina);

    }
}
